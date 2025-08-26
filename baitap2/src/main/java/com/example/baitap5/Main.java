package com.example.baitap5;

 import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        // Thêm sự kiện
        manager.addEvent(new Event("Hội thảo lập trình", LocalDate.of(2023, 10, 15), "Hà Nội"));
        manager.addEvent(new Event("Triển lãm công nghệ", LocalDate.of(2023, 11, 20), "Trung tâm triển lãm"));

        // Hiển thị tất cả sự kiện
        manager.displayAllEvents();

        // Tìm kiếm sự kiện
        Event foundEvent = manager.searchEvent("Hội thảo lập trình");
        if (foundEvent != null) {
            System.out.println("Đã tìm thấy sự kiện: " + foundEvent);
        } else {
            System.out.println("Không tìm thấy sự kiện.");
        }

        // Xóa sự kiện
        manager.deleteEvent("Triển lãm công nghệ");
        manager.displayAllEvents();
    }
}
