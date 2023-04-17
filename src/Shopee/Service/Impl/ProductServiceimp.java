package Shopee.Service.Impl;

import Shopee.Comparator.ProductComparator;
import Shopee.Entity.Category;
import Shopee.Entity.Product;
import Shopee.Service.ProductService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ProductServiceimp implements ProductService {
    static ArrayList<Product> products = new ArrayList<>();
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
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void sortList() {
            Collections.sort(products, new ProductComparator());
    }

    @Override
    public void remove(String productName) {
        for (Product product : products) {
            if(product.getName() == productName){
                products.remove(product);
            }
        }
    }

    @Override
    public void find(String productName) {
        for (Product product : products) {
            if(product.getName() == productName){
                System.out.println("Product at index " + products.indexOf(product));
            } else{
                System.out.println("No product found");
            }
        }
    }
}
