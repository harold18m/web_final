package com.harold18m.evaluacion.service;

import com.harold18m.evaluacion.entity.Group;

import java.util.List;
import java.util.Optional;

public interface GroupService {

    List<Group> getAllGroups();

    Optional<Group> getGroupById(Long id);

    Group saveGroup(Group group);

    void deleteGroup(Long id);

}
