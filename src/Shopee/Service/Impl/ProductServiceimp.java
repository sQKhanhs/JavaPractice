package Shopee.Service.Impl;

import Shopee.Entity.Category;
import Shopee.Entity.Product;
import Shopee.Service.ProductService;

import java.util.ArrayList;

public class ProductServiceimp implements ProductService {
    ArrayList<Product> products = new ArrayList<>();
    @Override
    public void add(Product product, String categoryID) {
        if((product.getCategoryId()) == categoryID){
            products.add(new Product(categoryID, product.getName()));
        } else {
            System.out.println("Can't add product");
        }
    }

    @Override
    public void getAll() {
    for(Product product: products){
        System.out.println(product);
    }
    }
}
