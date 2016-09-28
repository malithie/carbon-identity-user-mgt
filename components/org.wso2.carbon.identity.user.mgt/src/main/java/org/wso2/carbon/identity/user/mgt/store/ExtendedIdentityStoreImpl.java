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

package org.wso2.carbon.identity.user.mgt.store;

import org.wso2.carbon.security.caas.user.core.bean.Group;
import org.wso2.carbon.security.caas.user.core.bean.User;
import org.wso2.carbon.security.caas.user.core.config.IdentityConnectorConfig;
import org.wso2.carbon.security.caas.user.core.exception.GroupNotFoundException;
import org.wso2.carbon.security.caas.user.core.exception.IdentityStoreException;
import org.wso2.carbon.security.caas.user.core.exception.UserNotFoundException;
import org.wso2.carbon.security.caas.user.core.service.RealmService;

import javax.security.auth.callback.Callback;
import java.util.List;
import java.util.Map;

/**
 * Implementation of the {@link ExtendedIdentityStore} which provides write capability
 *
 * @since 1.0.0
 */
public class ExtendedIdentityStoreImpl implements ExtendedIdentityStore {

    @Override
    public void init(RealmService realmService, Map<String, IdentityConnectorConfig> map) throws IdentityStoreException {

    }

    @Override
    public User getUser(String s) throws IdentityStoreException, UserNotFoundException {
        return null;
    }

    @Override
    public User getUser(Callback[] callbacks) throws IdentityStoreException, UserNotFoundException {
        return null;
    }

    @Override
    public User getUserFromId(String s, String s1) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<User> listUsers(String s, int i, int i1) throws IdentityStoreException {
        return null;
    }

    @Override
    public Map<String, String> getUserAttributeValues(String s, String s1) throws IdentityStoreException {
        return null;
    }

    @Override
    public Map<String, String> getUserAttributeValues(String s, List<String> list, String s1) throws IdentityStoreException {
        return null;
    }

    @Override
    public Group getGroup(String s) throws IdentityStoreException, GroupNotFoundException {
        return null;
    }

    @Override
    public Group getGroupFromId(String s, String s1) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<Group> listGroups(String s, int i, int i1) throws IdentityStoreException {
        return null;
    }

    @Override
    public Map<String, String> getGroupAttributeValues(String s, String s1) throws IdentityStoreException {
        return null;
    }

    @Override
    public Map<String, String> getGroupAttributeValues(String s, String s1, List<String> list) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<Group> getGroupsOfUser(String s, String s1) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<User> getUsersOfGroup(String s, String s1) throws IdentityStoreException {
        return null;
    }

    @Override
    public boolean isUserInGroup(String s, String s1, String s2) throws IdentityStoreException {
        return false;
    }

    @Override
    public User addUser(Callback[] callbacks) throws IdentityStoreException {
        return null;
    }

    @Override
    public User addUser(Callback[] callbacks, String identityStoreId) throws IdentityStoreException {
        return null;
    }

    @Override
    public User addUser(Callback[] callbacks, Map<String, String> userAttributes) throws IdentityStoreException {
        return null;
    }

    @Override
    public User addUser(Callback[] callbacks, Map<String, String> userAttributes, String identityStoreId) throws IdentityStoreException {
        return null;
    }

    @Override
    public User addUser(String username, Callback credential, Map<String, String> userAttributes) throws
            IdentityStoreException {
        return null;
    }

    @Override
    public User addUser(String username, Callback credential, Map<String, String> userAttributes, String
            identityStoreId) throws IdentityStoreException {
        return null;
    }

    @Override
    public Group addGroup(String groupName, List<User> users) throws IdentityStoreException {
        return null;
    }

    @Override
    public Group addGroup(String groupName, List<User> users, String identityStoreId) throws IdentityStoreException {
        return null;
    }

    @Override
    public Group addGroup(String groupName, List<User> users, Map<String, String> groupAttributes) throws
            IdentityStoreException {
        return null;
    }

    @Override
    public Group addGroup(String groupName, List<User> users, Map<String, String> groupAttributes, String identityStoreId) throws IdentityStoreException {
        return null;
    }

    @Override
    public void deleteUser(User user) throws IdentityStoreException {

    }

    @Override
    public void deleteGroup(Group group) throws IdentityStoreException {

    }

    @Override
    public void updateAttributesOfUser(String userId, String identityStoreId, Map<String, String> newUserAttributes)
            throws IdentityStoreException {

    }

    @Override
    public void updateAttributesOfUser(String userId, String identityStoreId, Map<String, String> attributesToAssign, Map<String, String> attributesToUnAssign) throws IdentityStoreException {

    }

    @Override
    public void updateGroupsOfUser(String userId, String identityStoreId, List<Group> newGroupList) throws IdentityStoreException {

    }

    @Override
    public void updateGroupsOfUser(String userId, String identityStoreId, List<Group> groupsToAssign, List<Group> groupsToUnAssign) throws IdentityStoreException {

    }

    @Override
    public void updateUsersOfGroup(String groupId, String identityStoreId, List<User> newUsers) throws IdentityStoreException {

    }

    @Override
    public void updateUsersOfGroup(String groupId, String identityStoreId, List<User> usersToAssign, List<User> usersToUnAssign) throws IdentityStoreException {

    }

    @Override
    public void updateAttributesOfGroup(String groupId, String identityStoreId, Map<String, String> groupAttributes)
            throws IdentityStoreException {

    }

    @Override
    public void updateAttributesOfGroup(String groupId, String identityStoreId, Map<String, String> attributesToAssign, Map<String, String> attributesToUnAssign) throws IdentityStoreException {

    }
}
