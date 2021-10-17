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
import com.drupal.test.entity.LafOlNodeRevisionBody;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("LafOlNodeRevisionBodyHandler")
public class LafOlNodeRevisionBodyHandler extends DelimiterFileHandler<LafOlNodeRevisionBody> {

    @Inject
    @Named("DefaultJpaDao")
    public LafOlNodeRevisionBodyHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected LafOlNodeRevisionBody parseLine(List<String> headers, List<String> tokens) {
        LafOlNodeRevisionBody record = new LafOlNodeRevisionBody();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "bundle":
                    record.setBundle(tokens.get(i));
                    break;

                case "deleted":
                    record.setDeleted(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "entityId":
                    record.setEntityId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "revisionId":
                    record.setRevisionId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "langcode":
                    record.setLangcode(tokens.get(i));
                    break;

                case "delta":
                    record.setDelta(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "bodyValue":
                    record.setBodyValue(tokens.get(i));
                    break;

                case "bodySummary":
                    record.setBodySummary(tokens.get(i));
                    break;

                case "bodyFormat":
                    record.setBodyFormat(tokens.get(i));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
