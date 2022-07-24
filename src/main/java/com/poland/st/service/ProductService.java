package com.poland.st.service;

import com.poland.st.dao.ProductDAO;
import com.poland.st.dto.ProductDTO;
import com.poland.st.dto.SearchConditionDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {
    private final ProductDAO productDAO;

    public List<ProductDTO> getProducts(SearchConditionDTO searchConditionDTO) {
        return productDAO.getProducts(searchConditionDTO);
    }
}
