package com.example.demo.admin.login.controller;

//登录

import com.example.demo.admin.user.model.TCAUser;
import com.example.demo.admin.user.model.TCAUserExample;
import com.example.demo.admin.user.service.TCAUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private TCAUserService tcaUserService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String Login(HttpSession session, HttpServletRequest request, Model model, TCAUser tcaUser){
        String userId = tcaUser.getUserid();
        String userName = tcaUser.getUsername();
        String password = tcaUser.getPassword();
        if (userName != null&&password != null){
            if (userName.equals("admin")&&password.equals("000000")){
                session.setAttribute("USER_SESSION",tcaUser);
                return "/jsp/admin/main/adminshow";
            }else if (userName.equals("zhang")&&password.equals("000000")){
                session.setAttribute("USER_SESSION",tcaUser);
                return "/jsp/admin/main/vipshow";
            }else {
                TCAUserExample example = new TCAUserExample();
                example.createCriteria().andUsernameEqualTo(userName);
                List<TCAUser> tccUsers = tcaUserService.selectByExample(example);
                if (tccUsers.size() > 0){
                    if (password.equals(tccUsers.get(0).getPassword())){
                        request.getSession().setAttribute("USER_SESSION",tcaUser);
                        return "/jsp/admin/main/vipshow";
                    }else {
                        model.addAttribute("message","用户名或密码错误!!!!");
                    }
                }else {
                    model.addAttribute("message","用户名或密码错误!!!!");
                }
            }
        }else if (userName == null&&password != null){
            model.addAttribute("message","请输入用户名!!!!");
        }else if (userName != null&&password == null){
            model.addAttribute("message","请输入密码!!!!");
        }else{
            model.addAttribute("message","请输入用户名和密码!!!!");
        }
        return "/jsp/admin/main/login";
    }

}
