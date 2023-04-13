package Shopee.Service.Impl;

import Shopee.Entity.Category;
import Shopee.Service.CategoryService;

import java.util.ArrayList;

public class CategoryServiceimpl implements CategoryService {
    ArrayList<Category> categories = new ArrayList<Category>();
    @Override
    public void add() {
    categories.add(new Category("1", "Men Fashion"));
    categories.add(new Category("2", "Electronics"));
    categories.add(new Category("3", "PC and Laptop"));
    categories.add(new Category("4", "Women Fashion"));
    }

    @Override
    public void getAll() {
        for (Category element: categories){
            System.out.println(element);
        }
    }
}
