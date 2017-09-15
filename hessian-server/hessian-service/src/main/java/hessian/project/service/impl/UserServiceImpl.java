package hessian.project.service.impl;

import hessian.project.domain.TbUser;
import hessian.project.domain.TbUserExample;
import hessian.project.mapper.TbUserMapper;
import hessian.project.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试hessian接口的实现类
 * Created by panhusun on 2017/9/15.
 */
@Service
public class UserServiceImpl implements IUserService{

    @Resource
    private TbUserMapper userMapper;


    public TbUser findUserInfo(String username, String password) {
        TbUserExample example = new TbUserExample();

        TbUserExample.Criteria criteria = example.createCriteria();

        criteria.andUsernameEqualTo(username);

        List<TbUser> tbUsers = userMapper.selectByExample(example);

        TbUser user = null;

        if (tbUsers != null && tbUsers.size() > 0) {
            user = tbUsers.get(0);
        }

        return user;
    }
}
