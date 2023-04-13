package Shopee.Entity;

public class Product {
    private String categoryId;
    private String name;
    public Product(){
    }
    public Product(String categoryId, String name){
        this.categoryId = categoryId;
        this.name = name;
    }
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "categoryId='" + categoryId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
