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

import com.drupal.test.dao.JpaDao;
import com.drupal.test.entity.LafOlNodeAccess;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("LafOlNodeAccessHandler")
public class LafOlNodeAccessHandler extends DelimiterFileHandler<LafOlNodeAccess> {

    @Inject
    @Named("DefaultJpaDao")
    public LafOlNodeAccessHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected LafOlNodeAccess parseLine(List<String> headers, List<String> tokens) {
        LafOlNodeAccess record = new LafOlNodeAccess();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "nid":
                    record.setNid(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "langcode":
                    record.setLangcode(tokens.get(i));
                    break;

                case "fallback":
                    record.setFallback(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "gid":
                    record.setGid(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "realm":
                    record.setRealm(tokens.get(i));
                    break;

                case "grantView":
                    record.setGrantView(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "grantUpdate":
                    record.setGrantUpdate(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "grantDelete":
                    record.setGrantDelete(java.lang.Integer.valueOf((tokens.get(i))));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
