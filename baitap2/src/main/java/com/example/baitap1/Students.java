package com.example.baitap1;

public class Students {
        int maSV;
       String hoTen;
       double diemTB;
       public Students(int maSV, String hoTen, double diemTB) {
         this.maSV = maSV;
         this.hoTen = hoTen;
         this.diemTB = diemTB;
       }
       public int getMaSV() {
         return maSV;
       }
       public void setMaSV(int maSV) {
         this.maSV = maSV;
       }
       public String getHoTen() {
         return hoTen;
       }
       public void setHoTen(String hoTen) {
         this.hoTen = hoTen;
       }
       public double getDiemTB() {
         return diemTB;
       }
       public void setDiemTB(double diemTB) {
         this.diemTB = diemTB;
       }

       @Override
       public String toString() {
           return "Student1{" +
                   "maSV=" + maSV +
                   ", hoTen='" + hoTen + '\'' +
                   ", diemTB=" + diemTB +
                   '}';
       }
}
