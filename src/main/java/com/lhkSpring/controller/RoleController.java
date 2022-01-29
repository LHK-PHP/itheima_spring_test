package com.lhkSpring.controller;

import com.lhkSpring.domain.Role;
import com.lhkSpring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping(value = "/role")
@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;


    @RequestMapping("/ list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
      List<Role> roleList= roleService.list();
      //设置模型
      modelAndView.addObject("role-list",roleList);
      //设置视图
        modelAndView.setViewName("role-list");

        return modelAndView;

    }


}
