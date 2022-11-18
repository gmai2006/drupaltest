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
import com.drupal.test.entity.LafOlMenuTree;
import com.drupal.test.dao.JpaDao;

import com.drupal.test.utils.DelimiterParser;

// @Stateless
@Named("LafOlMenuTreeHandler")
public class LafOlMenuTreeHandler extends DelimiterFileHandler<LafOlMenuTree> {

  @Inject
  @Named("DefaultJpaDao")
  public LafOlMenuTreeHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected LafOlMenuTree parseLine(List<String> headers, List<String> tokens) {
    LafOlMenuTree record = new LafOlMenuTree();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "menuName":
          record.setMenuName(tokens.get(i));
          break;

        case "mlid":
          record.setMlid(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "id":
          record.setId(tokens.get(i));
          break;

        case "parent":
          record.setParent(tokens.get(i));
          break;

        case "routeName":
          record.setRouteName(tokens.get(i));
          break;

        case "routeParamKey":
          record.setRouteParamKey(tokens.get(i));
          break;

        case "routeParameters":
          record.setRouteParameters(tokens.get(i));
          break;

        case "url":
          record.setUrl(tokens.get(i));
          break;

        case "title":
          record.setTitle(tokens.get(i));
          break;

        case "description":
          record.setDescription(tokens.get(i));
          break;

        case "class1":
          record.setClass1(tokens.get(i));
          break;

        case "options":
          record.setOptions(tokens.get(i));
          break;

        case "provider":
          record.setProvider(tokens.get(i));
          break;

        case "enabled":
          record.setEnabled(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "discovered":
          record.setDiscovered(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "expanded":
          record.setExpanded(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "weight":
          record.setWeight(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "metadata":
          record.setMetadata(tokens.get(i));
          break;

        case "hasChildren":
          record.setHasChildren(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "depth":
          record.setDepth(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "p1":
          record.setP1(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "p2":
          record.setP2(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "p3":
          record.setP3(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "p4":
          record.setP4(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "p5":
          record.setP5(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "p6":
          record.setP6(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "p7":
          record.setP7(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "p8":
          record.setP8(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "p9":
          record.setP9(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "formClass":
          record.setFormClass(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
