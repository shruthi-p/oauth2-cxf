package com.imaginea.jaxrs.search;

import com.imaginea.jaxrs.search.beans.Product;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shruthip on 8/31/16.
 */

public class ProductSearchServiceImpl implements ProductSearchService {

    public List<Product> getProductList(){
        List<Product> productList = new ArrayList<Product>();
        Product product = new Product();
        product.setName("Test");
        product.setDescription("Test Description");
        product.setId("123");
        productList.add(product);

        return productList;
    }
}
