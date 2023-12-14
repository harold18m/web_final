package com.harold18m.evaluacion.web;

import com.harold18m.evaluacion.entity.UserGroup;
import com.harold18m.evaluacion.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user-groups")
public class UserGroupController {

    @Autowired
    private UserGroupService userGroupService;

    @GetMapping
    public List<UserGroup> getAllUserGroups() {
        return userGroupService.getAllUserGroups();
    }

    @GetMapping("/{id}")
    public Optional<UserGroup> getUserGroupById(@PathVariable Long id) {
        return userGroupService.getUserGroupById(id);
    }

    @PostMapping
    public UserGroup saveUserGroup(@RequestBody UserGroup userGroup) {
        return userGroupService.saveUserGroup(userGroup);
    }

    @DeleteMapping("/{id}")
    public void deleteUserGroup(@PathVariable Long id) {
        userGroupService.deleteUserGroup(id);
    }
}
