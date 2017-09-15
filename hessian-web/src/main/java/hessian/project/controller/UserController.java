package hessian.project.controller;

import com.alibaba.dubbo.common.json.JSON;
import hessian.project.domain.TbUser;
import hessian.project.service.IUserService;
import hessian.project.util.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * hessian测试controller
 * Created by panhusun on 2017/9/15.
 */
@Controller
public class UserController {

    @RequestMapping("{page}")
    public String showIndex(@PathVariable String page){

        return page;
    }

    @Resource
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/findUserInfo/{username}/{password}")
    public String findUserInfo(@PathVariable String username, @PathVariable String password){

        TbUser user = userService.findUserInfo(username, password);

        String userJson = JsonUtils.objectToJson(user);

        return userJson;
    }
}
