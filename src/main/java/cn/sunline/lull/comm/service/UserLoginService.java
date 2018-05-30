package cn.sunline.lull.comm.service;

import cn.sunline.lull.comm.entity.UserLogin;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserLoginService {
    UserLogin selectByUserid(String userid);
    UserLogin addUser(UserLogin user);
}
