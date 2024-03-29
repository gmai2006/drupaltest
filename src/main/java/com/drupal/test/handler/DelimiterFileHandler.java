/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.drupal.test.handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.inject.Named;
import com.drupal.test.dao.JpaDao;
import com.drupal.test.utils.DelimiterParser;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public abstract class DelimiterFileHandler<E> implements RecordTypeHandler {
  public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
  public static SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

  protected final Logger logger = Logger.getLogger(this.getClass().getName());
  private static final int MAX = 1000;
  private JpaDao dao;

  @Inject
  @Named("DefaultJpaDao")
  public DelimiterFileHandler(final JpaDao dao) {
    this.dao = dao;
  }

  /** {@inheritDoc} */
  public int process(InputStream input) {
    int count = 0;
    final List<E> items = new ArrayList<>();
    try (BufferedReader br =
        new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8))) {
      final Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(br);
      final List<String> headers = ((CSVParser) records).getHeaderNames();
      for (CSVRecord record : records) {
        final Map<String, String> map = record.toMap();

        if (map.size() != headers.size()) continue;

        final List<String> filtered =
            map.values().stream().map(String::trim).collect(Collectors.toList());

        final Predicate<String> empty = String::isEmpty;
        final List<String> values =
            filtered.stream().filter(empty.negate()).collect(Collectors.toList());

        if (values.size() != headers.size()) continue;

        final E e = parseLine(headers, new ArrayList<>(map.values()));
        items.add(e);
        count++;
        if (count % MAX == 0) {
          dao.batchCreate(items);
        }
      }
      if (!items.isEmpty()) {
        dao.batchCreate(items);
      }
    } catch (IOException ex) {
      return -1;
    }
    return count;
  }

  protected long parseDate(String val) {
    try {
      Date d = dateFormat.parse(val);
      return d.getTime();
    } catch (ParseException ex) {
      logger.severe("Unparsable " + val);
      return System.currentTimeMillis();
    }
  }

  protected long parseTime(String val) {
    try {
      Date d = timeFormat.parse(val);
      return d.getTime();
    } catch (ParseException ex) {
      logger.severe("Unparsable " + val);
      return System.currentTimeMillis();
    }
  }

  /**
   * Parse each line into a entity.
   *
   * @param headers Header of the data.
   * @param tokens A list of data.
   * @return
   */
  protected abstract E parseLine(List<String> headers, List<String> tokens);
}
