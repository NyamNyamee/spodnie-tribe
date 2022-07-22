package com.poland.st.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CommonController {
    @GetMapping("")
    public String getMain(Model model) {
        return "view/page/common/main";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "view/page/common/about";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "view/page/common/contact";
    }

    @GetMapping("/notice")
    public String getNotice() {
        return "view/page/common/notice";
    }

    @GetMapping("/shop")
    public String getShop(Model model) {
        return "view/page/common/shop";
    }
}
