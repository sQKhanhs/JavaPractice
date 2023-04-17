package Shopee.Service.Impl;

import Shopee.Comparator.ProductComparator;
import Shopee.Entity.Category;
import Shopee.Entity.Product;
import Shopee.Service.ProductService;

import java.util.*;

public class ProductServiceimp implements ProductService {
    static LinkedList<Product> products = new LinkedList<Product>();
    @Override
    public void add(Product product, String categoryID) {
        if((product.getCategoryId()) == categoryID){
            products.addFirst(new Product(categoryID, product.getName()));
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
