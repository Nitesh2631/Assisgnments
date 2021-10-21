package com.Assignment.one.service;

import com.Assignment.one.model.InputProduct;
import com.Assignment.one.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> inventoryList();

    public double getInputInvQty(InputProduct inputProduct);
}
