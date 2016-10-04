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

package org.wso2.carbon.identity.user.mgt.store.impl;

import org.wso2.carbon.identity.user.mgt.store.PrivilegedIdentityStore;
import org.wso2.carbon.security.caas.user.core.bean.Group;
import org.wso2.carbon.security.caas.user.core.bean.User;
import org.wso2.carbon.security.caas.user.core.exception.IdentityStoreException;
import org.wso2.carbon.security.caas.user.core.store.IdentityStoreImpl;

import java.util.List;
import java.util.Map;
import javax.security.auth.callback.Callback;

/**
 * Implementation of the {@link PrivilegedIdentityStore} which provides write capability
 *
 * @since 1.0.0
 */
public class PrivilegedIdentityStoreImpl extends IdentityStoreImpl implements PrivilegedIdentityStore {

    @Override
    public User addUser(Callback[] callbacks) throws IdentityStoreException {
        return null;
    }

    @Override
    public User addUser(Callback[] callbacks, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public User addUser(Callback[] callbacks, Map<String, String> userAttributes) throws IdentityStoreException {
        return null;
    }

    @Override
    public User addUser(Callback[] callbacks, Map<String, String> userAttributes, String domain) throws
            IdentityStoreException {
        return null;
    }

    @Override
    public User addUser(String username, Callback credential, Map<String, String> userAttributes) throws
            IdentityStoreException {
        return null;
    }

    @Override
    public User addUser(String username, Callback credential, Map<String, String> userAttributes, String domain)
            throws IdentityStoreException {
        return null;
    }

    @Override
    public Group addGroup(String groupName, List<User> users) throws IdentityStoreException {
        return null;
    }

    @Override
    public Group addGroup(String groupName, List<User> users, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public Group addGroup(String groupName, List<User> users, Map<String, String> groupAttributes) throws
            IdentityStoreException {
        return null;
    }

    @Override
    public Group addGroup(String groupName, List<User> users, Map<String, String> groupAttributes, String domain)
            throws IdentityStoreException {
        return null;
    }

    @Override
    public void deleteUser(User user) throws IdentityStoreException {

    }

    @Override
    public void deleteGroup(Group group) throws IdentityStoreException {

    }

    @Override
    public void updateAttributesOfUser(String userId, String domain, Map<String, String> newUserAttributes) throws
            IdentityStoreException {

    }

    @Override
    public void updateAttributesOfUser(String userId, String domain, Map<String, String> attributesToAssign,
                                       Map<String, String> attributesToUnAssign) throws IdentityStoreException {

    }

    @Override
    public void updateGroupsOfUser(String userId, String domain, List<Group> newGroupList) throws
            IdentityStoreException {

    }

    @Override
    public void updateGroupsOfUser(String userId, String domian, List<Group> groupsToAssign, List<Group>
            groupsToUnAssign) throws IdentityStoreException {

    }

    @Override
    public void updateUsersOfGroup(String groupId, String domain, List<User> newUsers) throws IdentityStoreException {

    }

    @Override
    public void updateUsersOfGroup(String groupId, String domain, List<User> usersToAssign, List<User>
            usersToUnAssign) throws IdentityStoreException {

    }

    @Override
    public void updateAttributesOfGroup(String groupId, String domain, Map<String, String> groupAttributes) throws
            IdentityStoreException {

    }

    @Override
    public void updateAttributesOfGroup(String groupId, String domain, Map<String, String> attributesToAssign,
                                        Map<String, String> attributesToUnAssign) throws IdentityStoreException {

    }
}
