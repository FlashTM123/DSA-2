package com.example.baitap8;

public class ChuyenBay {
    private ChoNgoi[][] choNgois;
    private int soHang;
    private int soGheMotHang;

    public ChuyenBay(int soHang, int soGheMotHang) {
        this.soHang = soHang;
        this.soGheMotHang = soGheMotHang;
        choNgois = new ChoNgoi[soHang][soGheMotHang];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soGheMotHang; j++) {
                choNgois[i][j] = new ChoNgoi();
            }
        }
    }
    public void displaySeats(){
        System.out.println("So do cho ngoi");
        for (int i = 0; i < soHang; i++) {
            System.out.println("Hàng: " + (i + 1) + ": ");
            for (int j = 0; j < soGheMotHang; j++) {
                System.out.print(choNgois[i][j]);
            }
            System.out.println();
        }
    }
    public boolean checkIn(int hang, int ghe){
       if (hang < 1 || hang > soHang || ghe < 1 || ghe > soGheMotHang) {
            System.out.println("Vi tri khong hop le.");
            return false;
        
       }
       if (choNgois[hang - 1][ghe - 1].isStatus()) {
            System.out.println("Ghe da duoc dat.");
            return false;
       } else {
            choNgois[hang - 1][ghe - 1].setStatus(true);
            System.out.println("Dat ghe thanh cong.");
            return true;
        
       }
    }
    public void lietKeChoTrong(){
        System.out.println("Cac cho trong: ");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soGheMotHang; j++) {
                if (!choNgois[i][j].isStatus()) {
                    System.out.println("Hang: " + (i + 1) + ", Ghe: " + (j + 1));
                }
            }
        }
    }

}
