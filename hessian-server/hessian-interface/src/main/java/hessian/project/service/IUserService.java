package hessian.project.service;

import hessian.project.domain.TbUser;

/**
 * 测试hessian接口
 * Created by panhusun on 2017/9/15.
 */
public interface IUserService {
    /**
     * 根据用户名和密码查询用户信息
     * @param username
     * @param password
     * @return
     */
    TbUser findUserInfo(String username, String password);
}
