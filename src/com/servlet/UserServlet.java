package com.servlet;

import com.eneity.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * 作者：凌宇
 * 日期：2020/11/26 18:56
 * 描述：
 */
@WebServlet("/user.do")
public class UserServlet extends BaseServlet {
    UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }

    //注册
    public void register(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        User user = new User(username, password, email);
        int result = userService.register(user);
    }

    //登录
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String token = (String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        System.out.println("谷歌生成的验证码值：" + token);
        String code = request.getParameter("code");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userService.login(new User(username, password, null));
        if (token != null && token.equals(code)) {
            if (user != null) {
                //登陆成功 请求转发
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                request.getRequestDispatcher("/message.do?action=queryList").forward(request, response);
            }
        } else {
            //登陆失败 重定向
            response.sendRedirect(request.getContextPath() + "/login.jsp");
        }
    }
}
