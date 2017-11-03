package cn.sunline.lull.comm.dao;

import cn.sunline.lull.MyMapper;
import cn.sunline.lull.comm.entity.UserLogin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Component
public interface UserLoginDao extends MyMapper<UserLogin> {
}
