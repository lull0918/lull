package cn.sunline.lull.comm.controller;

import cn.sunline.lull.comm.entity.UserLogin;
import cn.sunline.lull.comm.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("userLogin")
public class UserLoginController{
    @Autowired
    UserLoginService userLoginService;

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","welcome to my web");
        return "index";
    }



    @RequestMapping("/login")
    public UserLogin selectByUserid() {
        UserLogin user = userLoginService.selectByUserid("9527");
        return user;
    }

    @RequestMapping("/register")
    public void addUser(String userid, String userna, String passwd) {
        UserLogin user = new UserLogin();
        user.setUserid(userid);
        user.setUserna(userna);
        user.setPasswd(passwd);
        userLoginService.addUser(user);
    }
}
