package Shopee.Comparator;

import Shopee.Entity.Product;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (Integer.parseInt(o1.getCategoryId()) - Integer.parseInt(o2.getCategoryId()));
    }
}
