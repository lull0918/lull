package cn.sunline.lull.comm.serviceImpl;

import cn.sunline.lull.comm.dao.UserLoginDao;
import cn.sunline.lull.comm.entity.UserLogin;
import cn.sunline.lull.comm.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLoginServiceImpl implements UserLoginService{
    @Autowired
    UserLoginDao userLoginDao;

    @Override
    public UserLogin selectByUserid(String userid) {
        UserLogin user = userLoginDao.selectByPrimaryKey(userid);
        return user;
    }

}
