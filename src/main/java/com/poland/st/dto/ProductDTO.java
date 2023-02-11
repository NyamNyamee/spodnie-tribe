package com.poland.st.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String category;
    private String name;
    private Long quantity;
    private Long price;
    private String createDtm;
}
