package com.cy.web.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @projectName:base_structure
 * @see:com.cy.web.vo
 * @author:chengyang
 * @createTime:2020/4/8 12:08 下午
 * @version:1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVO {
    private String username;
    private int type;
}
