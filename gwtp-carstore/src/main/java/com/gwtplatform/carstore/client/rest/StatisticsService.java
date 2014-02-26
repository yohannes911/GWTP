/**
 * Copyright 2014 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.carstore.client.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.gwtplatform.dispatch.rest.client.DateFormat;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.gwtplatform.dispatch.rest.shared.RestService;

import static com.gwtplatform.carstore.shared.rest.ResourcesPath.STATS;
import static com.gwtplatform.carstore.shared.rest.RestParameter.DATE;
import static com.gwtplatform.carstore.shared.rest.RestParameter.DATE_FORMAT;

@Path(STATS)
public interface StatisticsService extends RestService {
    @GET
    RestAction<Integer> extractYearFromDate(@QueryParam(DATE) @DateFormat(DATE_FORMAT) Date date);
}
