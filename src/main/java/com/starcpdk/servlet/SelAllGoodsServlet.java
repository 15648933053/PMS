package com.starcpdk.servlet;

import com.starcpdk.entity.Goods;
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
import java.util.List;

@WebServlet("/selgoods")
public class SelAllGoodsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request , response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        int idd = Integer.valueOf(request.getParameter("idd"));
        GoodsService selAllGoods = new GoodsServiceImpl();
        List<Goods> goods = selAllGoods.selAllGoods(idd);
        JSONObject json = new JSONObject();
        PrintWriter out = response.getWriter();

        if (goods != null){
            json.put("code" , 0);
            json.put("msg" , "查询成功");
            json.put("goods" , goods);
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
