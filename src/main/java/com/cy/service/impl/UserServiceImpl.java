package com.cy.service.impl;

import com.cy.entity.User;
import com.cy.mapper.UserMapper;
import com.cy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @projectName:base_structure
 * @see:com.cy.service.impl
 * @author:chengyang
 * @createTime:2020/4/8 10:04 上午
 * @version:1.0
 */
@Service
public class UserServiceImpl implements UserService, UserDetailsService {
    @Autowired
    private UserMapper userMapper;

    public User selectUserByUsername(String username) {
        return userMapper.selectUserByUsername(username);
    }

    /**
     * @Description: security
     * @Param:
     * @Return: 
     * @Author: chengyang
     * @Date: 2020/4/8 10:30 上午
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.selectUserByUsername(username);
    }
}
