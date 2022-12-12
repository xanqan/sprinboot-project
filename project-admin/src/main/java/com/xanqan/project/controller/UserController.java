package com.xanqan.project.controller;

import com.xanqan.project.common.BaseResponse;
import com.xanqan.project.common.ResultCode;
import com.xanqan.project.common.ResultUtils;
import com.xanqan.project.exception.BusinessException;
import com.xanqan.project.model.domain.User;
import com.xanqan.project.model.vo.LoginVo;
import com.xanqan.project.security.model.UserSecurity;
import com.xanqan.project.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * User请求处理
 *
 * @author xanqan
 */
@RestController
@RequestMapping("/user")
@Api(tags = "User请求处理")
public class UserController {

    @Resource(name = "userServiceImpl")
    private UserService userAdminService;

    @Operation(summary = "查询用户", description = "根据 id 查询用户")
    @GetMapping("/search/{id}")
    public BaseResponse<User> getUser(@PathVariable("id") Integer id) {
        if (id <= 0) {
            throw new BusinessException(ResultCode.PARAMS_ERROR, "用户id小于等于0");
        }
        User user = userAdminService.getById(id);
        return ResultUtils.success(user);
    }

    @Operation(summary = "用户注册")
    @PostMapping("/register")
    public BaseResponse<Boolean> register(@RequestBody User user) {
        boolean result = userAdminService.userRegister(user.getName(), user.getPassword());
        return ResultUtils.success("注册成功", result);
    }

    @Operation(summary = "用户登录")
    @PostMapping("/login")
    public BaseResponse<LoginVo> login(@RequestBody User user) {
        LoginVo result = userAdminService.userLogin(user.getName(), user.getPassword());
        return ResultUtils.success("登录成功", result);
    }

    @Operation(summary = "获取已登录用户信息")
    @PostMapping("/getUserInfo")
    public BaseResponse<User> getUserInfo() {
        User user = UserSecurity.getUser();
        return ResultUtils.success("权限通过", user);
    }

}
