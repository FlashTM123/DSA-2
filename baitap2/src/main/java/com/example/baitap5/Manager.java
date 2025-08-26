package com.example.baitap5;

public class Manager {
    private Event[] events;
    private int countEvents;
    private final int MAX_EVENTS = 100;

    public Manager() {
        events = new Event[MAX_EVENTS];
        countEvents = 0;
    }

    public void addEvent(Event event) {
        if (countEvents < MAX_EVENTS) {
            events[countEvents++] = event;
        } else {
            System.out.println("Không thể thêm sự kiện. Đã đạt giới hạn tối đa.");
        }
    }
    public Event searchEvent(String eventName) {
    for (int i = 0; i < countEvents; i++) {
        if (events[i].getEventName().equalsIgnoreCase(eventName)) {
            return events[i];
        }
    }
    return null;
}
    public void displayAllEvents() {
        if (countEvents == 0) {
            System.out.println("Không có sự kiện nào để hiển thị.");
        } else {
            for (int i = 0; i < countEvents; i++) {
                System.out.println(events[i].toString());
            }
        }
    }
    public void deleteEvent(String eventName) {
        for (int i = 0; i < countEvents; i++) {
            if (events[i].getEventName().equalsIgnoreCase(eventName)) {
                // Shift events to the left
                for (int j = i; j < countEvents - 1; j++) {
                    events[j] = events[j + 1];
                }
                events[--countEvents] = null; // Clear the last event
                System.out.println("Đã xóa sự kiện: " + eventName);
                return;
            }
        }
        System.out.println("Không tìm thấy sự kiện để xóa: " + eventName);
    }
}
