package com.shanyu.shopmall.product;

import com.shanyu.shopmall.product.entity.BrandEntity;
import com.shanyu.shopmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShopmallProductApplicationTests {


    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("miaoshu");

        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
