package com.github.yingzhuo.mysqlhelper.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class IndexAction {

    @GetMapping("index")
    ModelAndView index() {
        return new ModelAndView("index");
    }

}
