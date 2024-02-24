package com.company.com.company;
import java.util.Scanner;

public class ResumeBuilder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Resume Builder");
        System.out.println("Please enter your details:");

        // Collect personal information
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        // Collect education details
        System.out.println("\nEnter your education details:");
        System.out.print("Degree: ");
        String degree = scanner.nextLine();

        System.out.print("University: ");
        String university = scanner.nextLine();

        System.out.print("Year of Graduation: ");
        String graduationYear = scanner.nextLine();

        // Collect work experience
        System.out.println("\nEnter your work experience:");
        System.out.print("Job Title: ");
        String jobTitle = scanner.nextLine();

        System.out.print("Company: ");
        String company = scanner.nextLine();

        System.out.print("Duration: ");
        String duration = scanner.nextLine();

        // Generate and display resume
        System.out.println("\nGenerating Resume...\n");

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("\nEducation:");
        System.out.println("Degree: " + degree);
        System.out.println("University: " + university);
        System.out.println("Year of Graduation: " + graduationYear);
        System.out.println("\nWork Experience:");
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Company: " + company);
        System.out.println("Duration: " + duration);

        scanner.close();
    }
}
