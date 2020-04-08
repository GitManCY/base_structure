package com.cy.mapper;

import com.cy.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @projectName:base_structure
 * @see:com.cy.mapper
 * @author:chengyang
 * @createTime:2020/4/8 9:59 上午
 * @version:1.0
 */
public interface UserMapper {

    @Select("select * from user where username = #{username}")
    User selectUserByUsername(@Param("username") String username);
}
