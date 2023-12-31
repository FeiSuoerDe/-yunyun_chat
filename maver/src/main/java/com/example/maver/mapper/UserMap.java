package com.example.maver.mapper;

import com.example.maver.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMap {


//    登录页面操作
//         登录
    @Select("select * from user where name=#{name} and pass=#{pass}")
    User login(String name,String pass);
//          注册
    @Insert("insert into user values (#{name},#{pass},null)")
    boolean reg(User user);
//   进入home操作
//      进入返回内容
    @Select("select * from user where id=#{id}")
    User userMessage(Integer id);

}
