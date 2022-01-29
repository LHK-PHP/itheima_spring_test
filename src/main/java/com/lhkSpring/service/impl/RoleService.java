package com.lhkSpring.service.impl;

import com.lhkSpring.dao.RoleDao;
import com.lhkSpring.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class RoleService implements com.lhkSpring.service.RoleService {

    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<Role> list() {
        List<Role> roleList = roleDao.findAll();
        return roleList;
    }
}
