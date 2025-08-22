package com.example.baitap2;

public class Manager {
    private Products[] products;
    private int countProducts;
    private final int MAX_PRODUCTS = 100;

   public Manager(){
       products = new Products[MAX_PRODUCTS];
       countProducts = 0;
   }

   public void addProduct(Products product) {
       if (countProducts < MAX_PRODUCTS) {
           products[countProducts++] = product;
           
       } else {
           System.out.println("Không thể thêm sản phẩm. Đã đạt giới hạn tối đa.");
       }
   }
    
   public void updatePrice(int id, double newPrice){
    for (int i = 0; i < countProducts; i++) {
        if (products[i].getId() == id) {
            products[i].setPrice(newPrice);
            System.out.println("Product with ID " + id + " has been updated.");
            return;
        }
    }
    System.out.println("Product with ID " + id + " not found.");
   }
    public void displayAllProducts() {
         if (countProducts == 0) {
             System.out.println("Không có sản phẩm nào để hiển thị.");
         } else {
             for (int i = 0; i < countProducts; i++) {
                 System.out.println(products[i].toString());
             }
         }
    }
}
