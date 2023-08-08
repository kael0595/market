package com.example.market.service;

import com.example.market.products.service.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class productServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    @DisplayName("강의 제품 생성")
    void t1() {
        for (int i = 1 ; i <= 200; i++){
            String name = String.format("테스트 상품:[%03d]",i);
            this.productService.create(name, 0);

        }
    }
}
