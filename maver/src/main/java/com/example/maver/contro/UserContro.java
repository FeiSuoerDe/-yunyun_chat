package com.example.maver.contro;


import com.example.maver.entity.User;
import com.example.maver.mapper.UserMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserContro {
    @Autowired

    private UserMap userMap;
    private List<String> onlineUserList = new ArrayList<>();


    @GetMapping("/login")
    @CrossOrigin(origins = "*")
    public User login(String name, String pass) {
        if (name != null && pass != null) {
            User user = userMap.login(name, pass);
            onlineUserList.add(user.getName());
            System.out.println(onlineUserList);
            return user;
// 直接返回对象
        } else {
            return null;
        }

    }

//    退出
    @GetMapping("/out")
    @CrossOrigin(origins = "*")
    public boolean out(String name) {
        System.out.println(name);
        if (name != null) {
            onlineUserList.remove(name);
            return true;
        } else {
            return false;
        }
    }

    //   页通过id查找信息
    @GetMapping("/userMessage")
    @CrossOrigin(origins = "*")
    public User homeLogin(Integer id) {
        return userMap.userMessage(id);
    }

    @GetMapping("/reg")
    @CrossOrigin(origins = "*")
    public boolean reg(String name, String pass) {
        if (name != null && pass != null) {
            User user = new User(null, name, pass);
            return userMap.reg(user);
        } else {
            return false;
        }

    }
}
