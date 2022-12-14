package com.xanqan.project.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户表
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 自增id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 登录用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 
     */
    private String email;

    /**
     * 手机
     */
    private String phone;

    /**
     * 
     */
    private String nickName;

    /**
     * 
     */
    private String avatar;

    /**
     * 储存空间大小（byte） 0-不限制
     */
    private Long sizeMax;

    /**
     * 已使用大小（byte）
     */
    private Long sizeUse;

    /**
     * 用户申请修改容量 0为不申请
     */
    private Long modifySize;

    /**
     * 用户启用状态 0-未启用 1-启用
     */
    private Integer status;

    /**
     * 
     */
    private String lastLogin;

    /**
     * 
     */
    private String modifyTime;

    /**
     * 
     */
    private String createTime;

    /**
     * 管理员标识 0-用户 1-管理员
     */
    private Integer isAdmin;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}