package com.harold18m.evaluacion.service;

import com.harold18m.evaluacion.entity.UserGroup;

import java.util.List;
import java.util.Optional;

public interface UserGroupService {

    List<UserGroup> getAllUserGroups();

    Optional<UserGroup> getUserGroupById(Long id);

    UserGroup saveUserGroup(UserGroup userGroup);

    void deleteUserGroup(Long id);
}
