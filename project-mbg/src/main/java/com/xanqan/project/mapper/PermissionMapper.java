package com.xanqan.project.mapper;

import com.xanqan.project.model.domain.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 28961
* @description 针对表【permission(权限表)】的数据库操作Mapper
* @createDate 2022-12-12 12:57:06
* @Entity com.xanqan.project.model.domain.Permission
*/
public interface PermissionMapper extends BaseMapper<Permission> {

    @Select("select p.name from user_permission up join permission p on p.id = up.permission_id where user_id = #{userId}")
    List<Permission> getUserPermissionsById(@Param("userId") int userId);

}




