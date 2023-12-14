package com.harold18m.evaluacion.web;

import com.harold18m.evaluacion.entity.Group;
import com.harold18m.evaluacion.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping
    public List<Group> getAllGroups() {
        return groupService.getAllGroups();
    }

    @GetMapping("/{id}")
    public Optional<Group> getGroupById(@PathVariable Long id) {
        return groupService.getGroupById(id);
    }

    @PostMapping
    public Group saveGroup(@RequestBody Group group) {
        return groupService.saveGroup(group);
    }

    @DeleteMapping("/{id}")
    public void deleteGroup(@PathVariable Long id) {
        groupService.deleteGroup(id);
    }
}
