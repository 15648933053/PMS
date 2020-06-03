package com.starcpdk.servlet;

import com.starcpdk.service.GoodsService;
import com.starcpdk.service.impl.GoodsServiceImpl;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/dinggou")
public class DingGouServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request , response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        String userid = (String) request.getSession().getAttribute("userid");
        int id = Integer.valueOf(request.getParameter("id"));

        System.out.println("我的id+++水水水水水水水水水水水水水水"+id);
        GoodsService dinggou = new GoodsServiceImpl();
        boolean dinggou1 = dinggou.dinggou(userid, id);
        JSONObject json = new JSONObject();
        PrintWriter out = response.getWriter();

        if (dinggou1){
            json.put("code" , 0);
            json.put("msg" , "修改成功");
            out.print(json);
            out.close();
        }else {
            json.put("code" , 1);
            json.put("msg" , "修改失败");
            out.print(json);
            out.close();
        }
    }
}
