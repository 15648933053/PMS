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

@WebServlet("/updPMS")
public class UpdPMSServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        request.setCharacterEncoding("UTF-8");

        String phone = request.getParameter("phone");
        String wifiname = request.getParameter("wifiname");
        String holename = request.getParameter("holename");

        PMS pms = new PMS();
        pms.setHolename(holename);
        pms.setPhone(phone);
        pms.setWifiname(wifiname);

        PMSService pmsService = new PMSServiceImpl();
        boolean updpms = pmsService.updpms(pms);

        JSONObject json = new JSONObject();
        PrintWriter out = response.getWriter();
        if (updpms){
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
