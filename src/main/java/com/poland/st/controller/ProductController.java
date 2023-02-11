package com.poland.st.controller;

import com.poland.st.dto.ProductDTO;
import com.poland.st.dto.SearchConditionDTO;
import com.poland.st.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/list")
    public String getProducts(@ModelAttribute SearchConditionDTO searchConditionDTO, Model model) {
        try {
            List<ProductDTO> products = productService.getProducts(searchConditionDTO);
            model.addAttribute("products", products);
        } catch (Exception e) {
            log.error(e.toString());
        }

        return "view/page/product/products";
    }
}
