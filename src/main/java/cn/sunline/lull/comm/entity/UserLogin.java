package cn.sunline.lull.comm.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "all_user")
public class UserLogin {

    @Id
    private String userid;
    private String userna;
    private String passwd;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserna() {
        return userna;
    }

    public void setUserna(String userna) {
        this.userna = userna;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "userid='" + userid + '\'' +
                ", userna='" + userna + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }

}
