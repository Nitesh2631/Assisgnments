package com.Assignment.one.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private String productid;
    private String prodName;
    private String UOM;
    private double availQty;
    private String availDate;
}
