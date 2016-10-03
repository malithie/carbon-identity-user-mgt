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
import org.wso2.carbon.security.caas.user.core.exception.IdentityStoreException;
import org.wso2.carbon.security.caas.user.core.store.IdentityStore;

import java.util.List;
import java.util.Map;
import javax.security.auth.callback.Callback;

/**
 * Extended Identity Store which provides write capability.
 *
 * @since 1.0.0
 */
public interface PrivilegedIdentityStore extends IdentityStore {

    /**
     * Adds a new user to the primary identity store.
     *
     * @param callbacks Callbacks to get user details.
     * @return New User.
     * @throws IdentityStoreException Identity store exception.
     */
    User addUser(Callback[] callbacks) throws IdentityStoreException;

    /**
     * Adds a new user in the specified store.
     *
     * @param callbacks       Callbacks to get user details.
     * @param identityStoreId Id of the identity store where the user should be added.
     * @return New User.
     * @throws IdentityStoreException Identity store exception.
     */
    User addUser(Callback[] callbacks, String identityStoreId) throws IdentityStoreException;

    /**
     * Adds a new user with provided user attributes.
     *
     * @param callbacks      Callbacks to get user details.
     * @param userAttributes Attributes of the user.
     * @return New User.
     * @throws IdentityStoreException Identity store exception.
     */
    User addUser(Callback[] callbacks, Map<String, String> userAttributes) throws IdentityStoreException;

    /**
     * Adds a new user with provided user attributes in the specified store.
     *
     * @param callbacks       Callbacks to get user details.
     * @param userAttributes  Attributes of the user.
     * @param identityStoreId Id of the identity store where the user should be added.
     * @return New User.
     * @throws IdentityStoreException Identity store exception.
     */
    User addUser(Callback[] callbacks, Map<String, String> userAttributes, String identityStoreId) throws
            IdentityStoreException;

    /**
     * Adds a new user with the given username, credential and user attributes.
     *
     * @param username       Username of the user.
     * @param credential     Callback to get user credential.
     * @param userAttributes Attributes of the user.
     * @return New User.
     * @throws IdentityStoreException Identity store exception.
     */
    User addUser(String username, Callback credential, Map<String, String> userAttributes) throws
            IdentityStoreException;

    /**
     * Adds a new user with the given username, credential ans user attributes in the specified store.
     *
     * @param username        Username of the user.
     * @param credential      Callback to get user credential.
     * @param userAttributes  Attributes of the user.
     * @param identityStoreId Id of the identity store where the user should be added.
     * @return New User.
     * @throws IdentityStoreException Identity store exception.
     */
    User addUser(String username, Callback credential, Map<String, String> userAttributes, String identityStoreId)
            throws IdentityStoreException;

    /**
     * Adds a new group with the given user list.
     *
     * @param groupName Name of the group.
     * @param users     List of users that belongs to this group.
     * @return New Group.
     * @throws IdentityStoreException Identity store exception.
     */
    Group addGroup(String groupName, List<User> users) throws IdentityStoreException;

    /**
     * Adds a new group with the given user list in the specified store.
     *
     * @param groupName       Name of the group.
     * @param users           List of users that belongs to this group.
     * @param identityStoreId Id of the identity store where the group should be added.
     * @return New Group.
     * @throws IdentityStoreException Identity store exception.
     */
    Group addGroup(String groupName, List<User> users, String identityStoreId) throws IdentityStoreException;

    /**
     * Adds a new group with the given user list and the group attributes.
     *
     * @param groupName       Name of the group.
     * @param users           List of users that belongs to this group.
     * @param groupAttributes Attributes of the group.
     * @return New Group.
     * @throws IdentityStoreException Identity store exception.
     */
    Group addGroup(String groupName, List<User> users, Map<String, String> groupAttributes) throws
            IdentityStoreException;

    /**
     * Adds a new group with the given user list and the group attributes in the specified store.
     *
     * @param groupName       Name of the group.
     * @param users           List of users that belongs to this group.
     * @param groupAttributes Attributes of the group.
     * @param identityStoreId Id of the identity store where the group should be added.
     * @return New Group.
     * @throws IdentityStoreException Identity store exception.
     */
    Group addGroup(String groupName, List<User> users, Map<String, String> groupAttributes, String identityStoreId)
            throws IdentityStoreException;

    /**
     * Deletes the user.
     *
     * @param user User to be deleted.
     * @throws IdentityStoreException Identity store exception.
     */
    void deleteUser(User user) throws IdentityStoreException;

    /**
     * Deletes the group.
     *
     * @param group Group to be deleted.
     * @throws IdentityStoreException Identity store exception.
     */
    void deleteGroup(Group group) throws IdentityStoreException;

    /**
     * Adds a new set of attributes by <b>replacing</b> the existing set of attributes. (PUT)
     *
     * @param userId            Id of the user.
     * @param identityStoreId   Identity store id of the user.
     * @param newUserAttributes Map of attributes to be assigned to this user.
     * @throws IdentityStoreException Identity store exception.
     */
    void updateAttributesOfUser(String userId, String identityStoreId, Map<String, String> newUserAttributes) throws
            IdentityStoreException;

    /**
     * Assigns a new set of attributes to existing set and/or un-assign a set of attributes from existing. (PATCH)
     *
     * @param userId               Id of the user.
     * @param identityStoreId      Identity store id of the user.
     * @param attributesToAssign   Attributes to be assigned.
     * @param attributesToUnAssign Attributes to be removed.
     * @throws IdentityStoreException Identity store exception.
     */
    void updateAttributesOfUser(String userId, String identityStoreId, Map<String, String> attributesToAssign,
                                Map<String, String> attributesToUnAssign) throws IdentityStoreException;

    /**
     * Adds a new list of groups by <b>replacing</b> the existing list of groups of the user. (PUT)
     *
     * @param userId          Id of the user.
     * @param identityStoreId Identity store id of the user.
     * @param newGroupList    List of groups to be assigned to this user.
     * @throws IdentityStoreException Identity store exception.
     */
    void updateGroupsOfUser(String userId, String identityStoreId, List<Group> newGroupList) throws
            IdentityStoreException;

    /**
     * Assigns a new list of groups to existing list and/or un-assign a list of groups from existing list. (PATCH)
     *
     * @param userId           Id of the user.
     * @param identityStoreId  Identity store id of the user.
     * @param groupsToAssign   Groups to be assigned.
     * @param groupsToUnAssign Groups to be removed.
     * @throws IdentityStoreException Identity store exception.
     */
    void updateGroupsOfUser(String userId, String identityStoreId, List<Group> groupsToAssign, List<Group>
            groupsToUnAssign) throws IdentityStoreException;

    /**
     * Adds a new list of users by <b>replacing</b> the existing list of user of the group. (PUT)
     *
     * @param groupId         Id of the group.
     * @param identityStoreId Identity store id of the group.
     * @param newUsers        List of users to be assigned to this group.
     * @throws IdentityStoreException Identity store exception.
     */
    void updateUsersOfGroup(String groupId, String identityStoreId, List<User> newUsers) throws IdentityStoreException;

    /**
     * Assigns a new list of users to existing list and/or un-assign a list of users from existing list. (PATCH)
     *
     * @param groupId         Id of the group.
     * @param identityStoreId Identity store id of the group.
     * @param usersToAssign   Users to be assigned.
     * @param usersToUnAssign Users to be removed.
     * @throws IdentityStoreException Identity store exception.
     */
    void updateUsersOfGroup(String groupId, String identityStoreId, List<User> usersToAssign, List<User>
            usersToUnAssign) throws IdentityStoreException;

    /**
     * Adds a new set of attributes by <b>replacing</b> the existing set of attributes. (PUT)
     *
     * @param groupId         Id of the group.
     * @param identityStoreId Identity store id of the group.
     * @param groupAttributes Attributes to be assigned to this group.
     * @throws IdentityStoreException Identity store exception.
     */
    void updateAttributesOfGroup(String groupId, String identityStoreId, Map<String, String> groupAttributes) throws
            IdentityStoreException;

    /**
     * Assigns a new set of attributes to existing set and/or un-assign a set of attributes from existing. (PATCH)
     *
     * @param groupId              Id of the group.
     * @param identityStoreId      Identity store id of the group.
     * @param attributesToAssign   Attributes to be assigned to this group.
     * @param attributesToUnAssign Attributes to be removed from this group.
     * @throws IdentityStoreException Identity store exception.
     */
    void updateAttributesOfGroup(String groupId, String identityStoreId, Map<String, String> attributesToAssign,
                                 Map<String, String> attributesToUnAssign) throws IdentityStoreException;
}

