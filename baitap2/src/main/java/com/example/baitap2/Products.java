package com.example.baitap2;

public class Products {
   private int id;
   private String name;
   private double price;

   public void setId(int id) {
    this.id = id;
}

   public void setName(String name) {
    this.name = name;
   }

   public void setPrice(double price) {
    if (price < 0) {
        System.out.println("Giá sản phẩm không được âm.");
    }
    this.price = price;
   }

   public Products(int id, String name, double price) {
       this.id = id;
       this.name = name;
       this.price = price;
   }

   public int getId() {
       return id;
   }

   public String getName() {
       return name;
   }

   public double getPrice() {
       return price;
   }

   @Override
   public String toString() {
    return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
   }
}