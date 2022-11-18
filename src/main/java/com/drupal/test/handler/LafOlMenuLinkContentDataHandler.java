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
import com.drupal.test.entity.LafOlMenuLinkContentData;
import com.drupal.test.dao.JpaDao;

import com.drupal.test.utils.DelimiterParser;

// @Stateless
@Named("LafOlMenuLinkContentDataHandler")
public class LafOlMenuLinkContentDataHandler
    extends DelimiterFileHandler<LafOlMenuLinkContentData> {

  @Inject
  @Named("DefaultJpaDao")
  public LafOlMenuLinkContentDataHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected LafOlMenuLinkContentData parseLine(List<String> headers, List<String> tokens) {
    LafOlMenuLinkContentData record = new LafOlMenuLinkContentData();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "id":
          record.setId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "revisionId":
          record.setRevisionId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "bundle":
          record.setBundle(tokens.get(i));
          break;

        case "langcode":
          record.setLangcode(tokens.get(i));
          break;

        case "enabled":
          record.setEnabled(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "title":
          record.setTitle(tokens.get(i));
          break;

        case "description":
          record.setDescription(tokens.get(i));
          break;

        case "menuName":
          record.setMenuName(tokens.get(i));
          break;

        case "linkUri":
          record.setLinkUri(tokens.get(i));
          break;

        case "linkTitle":
          record.setLinkTitle(tokens.get(i));
          break;

        case "linkOptions":
          record.setLinkOptions(tokens.get(i));
          break;

        case "external":
          record.setExternal(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "rediscover":
          record.setRediscover(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "weight":
          record.setWeight(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "expanded":
          record.setExpanded(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "parent":
          record.setParent(tokens.get(i));
          break;

        case "changed":
          record.setChanged(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "defaultLangcode":
          record.setDefaultLangcode(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "revisionTranslationAffected":
          record.setRevisionTranslationAffected(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
