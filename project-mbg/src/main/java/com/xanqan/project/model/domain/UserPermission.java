package com.xanqan.project.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户权限对应表
 * @TableName user_permission
 */
@TableName(value ="user_permission")
@Data
public class UserPermission implements Serializable {
    /**
     * 自增id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    private Object userId;

    /**
     * 权限id
     */
    private Object permissionId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}