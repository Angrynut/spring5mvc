package com.techmap.examples.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController
{
    
    @RequestMapping("/helloWorld")
    public String helloWorld(Model model)
    {
        System.out.println("-> Hello World!");
        
        model.addAttribute("message", "Hello World!");
        return "/examples/helloWorld";
    }
    
    @RequestMapping("/helloWorld/jump/{path}")
    public String jump(HttpServletRequest req, @PathVariable("path") String jsp)
    {
        HttpSession session = req.getSession();
        session.setAttribute("sessionStr", "啦啦啦德玛西亚！");
        
        return "/examples/" + jsp;
    }
}
