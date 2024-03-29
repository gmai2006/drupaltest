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
import com.drupal.test.entity.LafOlUsersFieldData;
import com.drupal.test.dao.JpaDao;

import com.drupal.test.utils.DelimiterParser;

// @Stateless
@Named("LafOlUsersFieldDataHandler")
public class LafOlUsersFieldDataHandler extends DelimiterFileHandler<LafOlUsersFieldData> {

  @Inject
  @Named("DefaultJpaDao")
  public LafOlUsersFieldDataHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected LafOlUsersFieldData parseLine(List<String> headers, List<String> tokens) {
    LafOlUsersFieldData record = new LafOlUsersFieldData();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "uid":
          record.setUid(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "langcode":
          record.setLangcode(tokens.get(i));
          break;

        case "preferredLangcode":
          record.setPreferredLangcode(tokens.get(i));
          break;

        case "preferredAdminLangcode":
          record.setPreferredAdminLangcode(tokens.get(i));
          break;

        case "name":
          record.setName(tokens.get(i));
          break;

        case "pass":
          record.setPass(tokens.get(i));
          break;

        case "mail":
          record.setMail(tokens.get(i));
          break;

        case "timezone":
          record.setTimezone(tokens.get(i));
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
        case "access":
          record.setAccess(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "login":
          record.setLogin(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "init":
          record.setInit(tokens.get(i));
          break;

        case "defaultLangcode":
          record.setDefaultLangcode(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
