package com.ruoyi.web.controller.ac;

import com.ruoyi.ac.service.IAuthService;
import com.ruoyi.common.constant.HttpStatus;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.model.LoginBody;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name: acController
 * @user: luGuanYu
 * @date: 2024/9/19 11:05
 * @functionalExpression:
 */

@RestController
public class acController {

    @Autowired
    private IAuthService icAuthService;

    @PostMapping("/ac")
    public AjaxResult login(@RequestBody LoginBody loginBody){
        if (StringUtils.isEmpty(loginBody.getUsername()) || StringUtils.isEmpty(loginBody.getPassword())){
            return AjaxResult.error(HttpStatus.UNAUTHORIZED,"用户名称或密码不能为空！");
        }
        String login = icAuthService.login(loginBody.getUsername(), loginBody.getPassword());
        return new AjaxResult(HttpStatus.SUCCESS, login);
    }

}
