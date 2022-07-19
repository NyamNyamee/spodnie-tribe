package com.poland.st.dao;

import com.poland.st.dto.ProductDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDAO {
    List<ProductDTO> getProducts();
}
