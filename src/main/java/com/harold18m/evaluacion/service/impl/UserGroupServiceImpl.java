package com.harold18m.evaluacion.service.impl;

import com.harold18m.evaluacion.entity.UserGroup;
import com.harold18m.evaluacion.repository.UserGroupRepository;
import com.harold18m.evaluacion.service.UserGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserGroupServiceImpl implements UserGroupService {

    private UserGroupRepository userGroupRepository;
    @Override
    public List<UserGroup> getAllUserGroups() {
        return userGroupRepository.findAll();
    }

    @Override
    public Optional<UserGroup> getUserGroupById(Long id) {
        return userGroupRepository.findById(id);
    }

    @Override
    public UserGroup saveUserGroup(UserGroup userGroup) {
        return userGroupRepository.save(userGroup);
    }

    @Override
    public void deleteUserGroup(Long id) {
        userGroupRepository.deleteById(id);
    }
}
