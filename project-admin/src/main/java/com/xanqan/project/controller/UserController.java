package com.xanqan.project.controller;

import com.xanqan.project.common.BaseResponse;
import com.xanqan.project.common.ResultCode;
import com.xanqan.project.common.ResultUtils;
import com.xanqan.project.exception.BusinessException;
import com.xanqan.project.model.domain.User;
import com.xanqan.project.service.UserService;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * User请求处理
 *
 * @author xanqan
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/search/{id}")
    public BaseResponse<User> getUser(@PathVariable("id") Integer id) {
        if (id <= 0) {
            throw new BusinessException(ResultCode.PARAMS_ERROR, "用户id小于等于0");
        }
        User user = userService.getById(id);
        return ResultUtils.success(user);
    }
}