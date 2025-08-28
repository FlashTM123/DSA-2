package com.example.lythuyet;

import java.util.Arrays;

public class Lecture {
    public static void main(String[] args) {
        // int[] numbers = {1, 2, 3, 4, 5};
        // System.out.println(Arrays.toString(numbers));
    
        // // Chuyen sang dang danh sach

        // // toList();

        // // Sắp xếp: sort();
        // // Tìm kiếm: binarySearch();
        // // Copy mảng: Sao chép nội dung mảng, cùng kiểu dữ liệu

        // int [] numbers_2 = Arrays.copyOf(numbers, 10);
        // System.out.println(Arrays.toString(numbers_2));

        // So sánh mảng
        // Arrays.equals();: So sánh mảng 1 chiều
        // Arrays.deepEquals();: So sánh mảng đa chiều

        // Mảng 2 chiều:

        int[][] numbers_two_direction = {
            {1, 2, 3},
            {4, 5, 6},
            
        };
        // 2x3
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers_two_direction[i][j] + " ");
            }
            System.out.println();
        }
    }
}
