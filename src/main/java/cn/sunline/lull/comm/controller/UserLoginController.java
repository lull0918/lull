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
    public String selectByUserid() {
        UserLogin user = userLoginService.selectByUserid("9527");
        System.out.println("========SQL执行完成======="+user);
        if(user.equals(null)){
            return user.toString();
        }
        return "";
    }

    @RequestMapping("/register")
    public void insertUser(String userid, String userna, String passwd) {
        //userLoginService.insertUser("9527","卢理林","123456");
    }
}
