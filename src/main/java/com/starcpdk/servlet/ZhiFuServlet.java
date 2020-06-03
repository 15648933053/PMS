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

@WebServlet("/zhifu")
public class ZhiFuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        request.setCharacterEncoding("UTF-8");

        int id = Integer.valueOf(request.getParameter("id"));

        String userid = (String) request.getSession().getAttribute("userid");

        GoodsService hole = new GoodsServiceImpl();
        boolean zhifu = hole.zhifu(id , userid);
        JSONObject json = new JSONObject();
        PrintWriter out = response.getWriter();
        if (zhifu){
            json.put("code" , 0);
            json.put("msg" , "支付成功");
            out.print(json);
            out.close();
        }else {
            json.put("code" , 1);
            json.put("msg" , "支付失败");
            out.print(json);
            out.close();
        }

    }
}
