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
import com.drupal.test.entity.LafOlTaxonomyIndex;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("LafOlTaxonomyIndexHandler")
public class LafOlTaxonomyIndexHandler extends DelimiterFileHandler<LafOlTaxonomyIndex> {

    @Inject
    @Named("DefaultJpaDao")
    public LafOlTaxonomyIndexHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected LafOlTaxonomyIndex parseLine(List<String> headers, List<String> tokens) {
        LafOlTaxonomyIndex record = new LafOlTaxonomyIndex();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "nid":
                    record.setNid(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "tid":
                    record.setTid(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "status":
                    record.setStatus(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "sticky":
                    record.setSticky(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "created":
                    record.setCreated(java.lang.Integer.valueOf((tokens.get(i))));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
