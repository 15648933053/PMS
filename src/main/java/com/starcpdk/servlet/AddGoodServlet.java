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

@WebServlet("/addgood")
public class AddGoodServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        request.setCharacterEncoding("UTF-8");

        int idd = Integer.valueOf(request.getParameter("idd"));
        String imageURL = request.getParameter("imageURL");
        int price = Integer.valueOf(request.getParameter("price"));
        String descc = request.getParameter("descc");
        String title = request.getParameter("title");
        int guige = Integer.valueOf(request.getParameter("guige"));
        int renshu = Integer.valueOf(request.getParameter("renshu"));
        String pmswifi = request.getParameter("pmswifi");
        String chuangguige = request.getParameter("chuangguige");

        Goods goods = new Goods();

        goods.setIdd(idd);
        goods.setImageURL(imageURL);
        goods.setPrice(price);
        goods.setDescc(descc);
        goods.setTitle(title);
        goods.setGuige(guige);
        goods.setRenshu(renshu);
        goods.setPmswifi(pmswifi);
        goods.setChuangguige(chuangguige);

        GoodsService goodsService = new GoodsServiceImpl();
        boolean addgood = goodsService.addgood(goods);

        JSONObject json = new JSONObject();
        PrintWriter out = response.getWriter();

        if (addgood){
            json.put("code" , 0);
            json.put("msg" , "增加成功");
            out.print(json);
            out.close();
        }else {
            json.put("code" , 1);
            json.put("msg" , "增加失败");
            out.print(json);
            out.close();
        }


    }
}
