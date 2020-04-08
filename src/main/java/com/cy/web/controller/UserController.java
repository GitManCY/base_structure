package com.cy.web.controller;

import com.cy.entity.User;
import com.cy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @projectName:base_structure
 * @see:com.cy.web.controller
 * @author:chengyang
 * @createTime:2020/4/8 10:05 上午
 * @version:1.0
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectUserByUsername")
    @ResponseBody
    public User selectUserByUsername(User user) {
        return userService.selectUserByUsername(user.getUsername());
    }


    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String getIndexPage(Model model) {
        // 认证成功后,结果会通过SecurityContextHolder存入SecurityContext中.
        Object obj = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (obj instanceof User) {
            model.addAttribute("loginUser", obj);
        }
        return "/index";
    }

    @RequestMapping(path = "/discuss", method = RequestMethod.GET)
    public String getDiscussPage() {
        return "/site/discuss";
    }

    @RequestMapping(path = "/letter", method = RequestMethod.GET)
    public String getLetterPage() {
        return "/site/letter";
    }

    @RequestMapping(path = "/admin", method = RequestMethod.GET)
    public String getAdminPage() {
        return "/site/admin";
    }

    @RequestMapping(path = "/loginpage", method = {RequestMethod.GET, RequestMethod.POST})
    public String getLoginPage() {
        return "/site/login";
    }

    @RequestMapping(path = "/denied", method = RequestMethod.GET)
    public String getDeniedPage() {
        return "/error/404";
    }
}
