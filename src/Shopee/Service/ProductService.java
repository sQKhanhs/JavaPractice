package Shopee.Service;

import Shopee.Entity.Product;

public interface ProductService {
    void add(Product product, String categoryID);
    void getAll();
    void sortList();
    void remove(String productName);
    void find(String productName);
}
