package com.starcpdk.servlet;

import com.starcpdk.entity.User;
import com.starcpdk.service.LoginService;
import com.starcpdk.service.impl.LoginServiceImpl;
import net.sf.json.JSONObject;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request , response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        String code = request.getParameter("code");
        String username = request.getParameter("username");
        String faceUrl = request.getParameter("face_url");
        String identify = request.getParameter("identify");

        String appid = "wx3d4200f27d153872";
        String secret = "33fafea3efad86cef0eb62b029ac3887";
        // 连接微信换userID接口
        String getOpenIdUrl = "https://api.weixin.qq.com/sns/jscode2session?appid="
                + appid + "&secret=" + secret
                + "&js_code=" + code + "&grant_type=authorization_code";
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGetOpenId = new HttpGet(getOpenIdUrl);
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        String token = null;
        try {
            token = httpClient.execute(httpGetOpenId, responseHandler);
        } catch (ClientProtocolException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        JSONObject jObject = JSONObject.fromObject(token);
        String userid = jObject.getString("openid");
        System.out.println("=======userid======++++++userid++++++===userid========"+userid);
        request.getSession().setAttribute("userid", userid);

        //取到userID，判断用户是否存在
        //若存在，查出用户，返回值按前端要求返回
        //若不存在，新建用户，写入名称及userID
        LoginService loginService = new LoginServiceImpl();
        User user = loginService.selLogin(userid);
        JSONObject json = new JSONObject();
        PrintWriter out = response.getWriter();
        if (user != null) {
            request.getSession().setAttribute("userid", user.getUserId());
            request.getSession().setAttribute("name", user.getUserName());
            json.put("code", 1);
            json.put("msg", "用户已存在");
            json.put("user", user);
            out.print(json);
            out.close();
        } else {
            User user1 = new User();
            user1.setUserId(userid);
            user1.setUserName(username);
            user1.setFaceUrl(faceUrl);
            user1.setIdentify(identify);

            boolean count = loginService.insLogin(user1);
            if (count){
                request.getSession().setAttribute("userid", user.getUserId());
                request.getSession().setAttribute("name", user.getUserName());
                json.put("code", 0);
                json.put("user" , user1);
                json.put("msg" , "注册成功,并且登录");
                out.print(json);
                out.close();
            }else {
                json.put("code", 2);
                json.put("msg" , "注册失败");
                out.print(json);
                out.close();
            }
        }
    }
}
