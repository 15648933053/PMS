package com.starcpdk.servlet;

import com.starcpdk.entity.PMS;
import com.starcpdk.service.PMSService;
import com.starcpdk.service.impl.PMSServiceImpl;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/selpms")
public class SelPmsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request , response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        request.setCharacterEncoding("UTF-8");

        PMSService pmsService = new PMSServiceImpl();
        PMS pms = pmsService.selPms();

        JSONObject json = new JSONObject();
        PrintWriter out = response.getWriter();
        if (pms != null){
            json.put("code" , 0);
            json.put("msg" , "查询成功");
            json.put("pms" , pms);
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
