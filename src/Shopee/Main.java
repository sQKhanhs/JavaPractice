package Shopee;

import Shopee.Entity.Product;
import Shopee.Service.CategoryService;
import Shopee.Service.ProductService;
import Shopee.Service.Impl.CategoryServiceimpl;
import Shopee.Service.Impl.ProductServiceimp;

public class Main {
    public static void main(String[] args){
        CategoryService categoryService = new CategoryServiceimpl();
        ProductService productService = new ProductServiceimp();
        Product productTest = new Product("3", "Asus Laptop");

        categoryService.add();
        categoryService.getAll();

        productService.add(new Product("1","Gucci White Shirts"), "1");
        productService.add(productTest, "3");
        productService.getAll();
    }
}
