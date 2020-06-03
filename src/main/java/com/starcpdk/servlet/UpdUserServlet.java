package com.starcpdk.servlet;

import com.starcpdk.entity.User;
import com.starcpdk.service.UserService;
import com.starcpdk.service.impl.UserServiceImpl;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/upduser")
public class UpdUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        String userid = (String) request.getSession().getAttribute("userid");
        String face_url = request.getParameter("face_url");
        String username = request.getParameter("username");
        String phone = request.getParameter("phone");
        String identify = request.getParameter("identify");

        User user = new User();
        user.setUserId(userid);
        user.setFaceUrl(face_url);
        user.setUserName(username);
        user.setPhone(phone);
        user.setIdentify(identify);

        UserService userService = new UserServiceImpl();

        User user1 = userService.selUser(userid);

        JSONObject json = new JSONObject();
        PrintWriter out = response.getWriter();

        if (user1 != null){

            boolean updUser = userService.updUser(user);

            if (updUser){
                json.put("code" , 0);
                json.put("msg" , "修改成功");
                json.put("user" , user);
            }
            else {
                json.put("code" , 1);
                json.put("msg" , "修改失败");
            }
            out.print(json);
            out.close();
        }else {
            json.put("code" , 1);
            json.put("msg" , "查询失败");
            out.print(json);
            out.close();
        }

    }
}
