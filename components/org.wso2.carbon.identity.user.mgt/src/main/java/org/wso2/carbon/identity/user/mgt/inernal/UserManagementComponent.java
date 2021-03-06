/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.user.mgt.inernal;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.wso2.carbon.identity.user.mgt.common.ExtendedRealmServiceImpl;
import org.wso2.carbon.identity.user.mgt.service.ExtendedRealmService;

/**
 * OSGi component for user management.
 */
@Component(
        name = "org.wso2.carbon.identity.user.mgt",
        immediate = true
)
public class UserManagementComponent {

    @Activate
    public void registerUserManagementService(BundleContext bundleContext) {

        bundleContext.registerService(ExtendedRealmService.class, new ExtendedRealmServiceImpl(), null);
    }
}
