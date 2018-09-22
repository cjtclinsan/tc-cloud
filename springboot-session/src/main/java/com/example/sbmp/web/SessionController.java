package com.example.sbmp.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lengleng
 * @since 2017-08-19
 */
@SuppressWarnings("unused")
@Controller
public class SessionController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/")
    public String getSession(HttpSession session, Model model) {
        String sessionID = session.getId();
        model.addAttribute("sessionId",sessionID);
        model.addAttribute("port",port);
        return "index";
    }
}
