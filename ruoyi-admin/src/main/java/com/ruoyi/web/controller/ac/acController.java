package com.ruoyi.web.controller.ac;

import com.ruoyi.ac.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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


    @GetMapping("/ac")
    public String login(String username, String password){

        return icAuthService.login(username, password);
    }

}
