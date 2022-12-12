package com.xanqan.project.model.vo;

import lombok.Data;

/**
 * 登录成功返回对象
 *
 * @author xanqan
 */
@Data
public class LoginVo {

    private String token;

    private Integer isAdmin;
}
