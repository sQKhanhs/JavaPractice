package Shopee.Service;

import Shopee.Entity.Product;

public interface ProductService {
    void add(Product product, String categoryID);
    void getAll();
    void sortList();
}
