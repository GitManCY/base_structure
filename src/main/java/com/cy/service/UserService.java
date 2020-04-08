package com.cy.service;

import com.cy.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @description:
 * @projectName:base_structure
 * @see:com.cy.service
 * @author:chengyang
 * @createTime:2020/4/8 10:03 上午
 * @version:1.0
 */
public interface UserService extends UserDetailsService {

    User selectUserByUsername(String username);
}
