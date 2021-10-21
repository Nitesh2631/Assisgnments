package com.Assignment.one.controller;

import com.Assignment.one.model.InputProduct;
import com.Assignment.one.model.OutputProduct;
import com.Assignment.one.model.Product;
import com.Assignment.one.service.ProductServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @PostMapping("/getInvPicture")
    public ResponseEntity<OutputProduct> InputInventory(@RequestBody InputProduct inputProduct){
        productService.inventoryList();
        double avlquantity = productService.getInputInvQty(inputProduct);

        return null;
    }
}
