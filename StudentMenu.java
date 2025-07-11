package com.dkte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMenu {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Sort Students by Roll No");
            System.out.println("5. Sort Students by Name");
            System.out.println("6. Sort Students by Marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    studentList.add(new Student(rollNo, name, marks));
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    if (studentList.isEmpty()) {
                        System.out.println("No students to display.");
                    } else {
                        Iterator<Student> iterator = studentList.iterator();
                        while (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for (Student s : studentList) {
                        if (s.getRollNo() == searchRoll) {
                            System.out.println("Student found: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with Roll No " + searchRoll + " not found.");
                    }
                    break;

                case 4:
                    Collections.sort(studentList, new Comparator<Student>() {
                        public int compare(Student s1, Student s2) {
                            return Integer.compare(s1.getRollNo(), s2.getRollNo());
                        }
                    });
                    System.out.println("Students sorted by Roll No.");
                    break;

                case 5:
                    Collections.sort(studentList, new Comparator<Student>() {
                        public int compare(Student s1, Student s2) {
                            return s1.getName().compareToIgnoreCase(s2.getName());
                        }
                    });
                    System.out.println("Students sorted by Name.");
                    break;

                case 6:
                    Collections.sort(studentList, new Comparator<Student>() {
                        public int compare(Student s1, Student s2) {
                            return Double.compare(s1.getMarks(), s2.getMarks());
                        }
                    });
                    System.out.println("Students sorted by Marks.");
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
    }
