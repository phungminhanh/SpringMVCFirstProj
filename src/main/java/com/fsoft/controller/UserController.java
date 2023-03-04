package com.fsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fsoft.bean.User;
import com.fsoft.service.IUserService;

@Controller
public class UserController {
@Autowired
private IUserService iUserService;
@RequestMapping(value = {"/login"},method = RequestMethod.POST)
public ModelAndView checkLogin(@ModelAttribute("login") User user) {

User userData = iUserService.checkLogin(user);
   return userData!=null?new ModelAndView("index" , "userName" , userData.getUserName()):new ModelAndView ("login","mesage", "Login Fail");
}
}
