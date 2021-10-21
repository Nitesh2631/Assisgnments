package com.Assignment.one.service;

import com.Assignment.one.model.InputProduct;
import com.Assignment.one.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.logging.LoggerGroup;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService{

    private static List<Product> productList = new ArrayList<Product>();

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");


    @Override
    public List<Product> inventoryList() {
        Date avldate1, avldate2, avldate3;
        try {
            avldate1 = formatter.parse("2021-03-19");
            avldate2 = formatter.parse("2021-03-21");
            avldate3 = formatter.parse("2021-03-29");


            productList.add(new Product("Prod1", "Shirt", "EACH", 10, formatter.format(avldate1)));
            productList.add(new Product("Prod1", "Trousers", "EACH", 20,formatter.format(avldate2)));
            productList.add(new Product("Prod1", "Trousers", "EACH", 20,formatter.format(avldate3)));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public double getInputInvQty(InputProduct inputProduct) {
        LocalDate Date = LocalDate.parse(inputProduct.getAvailDate());
log.info("");
        LocalDate plusDate = Date.plusDays(10);

        if(Date.isAfter(LocalDate.of(2021, 03, 18)) && Date.isBefore(LocalDate.of(2021, 03, 30)))
        {
            for(Product p : productList)
            {
                System.out.println("Product "+p);
            }

        }

        return 0;
    }
}
