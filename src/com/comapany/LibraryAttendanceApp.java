package com.comapany;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryAttendanceApp {
    public static void main(String[] args) {
        Map<String, LocalDateTime> attendanceRecords = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("SSM College of Engineering and technology Library Attendance Application");
            System.out.println("1. Add attendance record");
            System.out.println("2. View attendance record");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addAttendanceRecord(attendanceRecords, scanner);
                    break;
                case 2:
                    viewAttendanceRecord(attendanceRecords);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addAttendanceRecord(Map<String, LocalDateTime> attendanceRecords, Scanner scanner) {
        System.out.print("Enter student name: ");
        String studentName = scanner.next();
        LocalDateTime dateTime = LocalDateTime.now();
        attendanceRecords.put(studentName, dateTime);
        System.out.println("Attendance recorded for " + studentName + " at " + dateTime);
    }

    private static void viewAttendanceRecord(Map<String, LocalDateTime> attendanceRecords) {
        System.out.println("Attendance Records:");
        for (Map.Entry<String, LocalDateTime> entry : attendanceRecords.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

