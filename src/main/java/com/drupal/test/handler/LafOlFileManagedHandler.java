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

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import java.nio.charset.StandardCharsets;
import com.drupal.test.entity.LafOlFileManaged;
import com.drupal.test.dao.JpaDao;

import com.drupal.test.utils.DelimiterParser;

// @Stateless
@Named("LafOlFileManagedHandler")
public class LafOlFileManagedHandler extends DelimiterFileHandler<LafOlFileManaged> {

  @Inject
  @Named("DefaultJpaDao")
  public LafOlFileManagedHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected LafOlFileManaged parseLine(List<String> headers, List<String> tokens) {
    LafOlFileManaged record = new LafOlFileManaged();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "fid":
          record.setFid(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "uuid":
          record.setUuid(tokens.get(i));
          break;

        case "langcode":
          record.setLangcode(tokens.get(i));
          break;

        case "uid":
          record.setUid(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "filename":
          record.setFilename(tokens.get(i));
          break;

        case "uri":
          record.setUri(tokens.get(i));
          break;

        case "filemime":
          record.setFilemime(tokens.get(i));
          break;

        case "filesize":
          record.setFilesize(java.lang.Long.valueOf((tokens.get(i))));
          break;
        case "status":
          record.setStatus(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "created":
          record.setCreated(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "changed":
          record.setChanged(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
