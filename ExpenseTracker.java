package com.mycompany.expensetracker;
		import java.text.DateFormat;
		import java.text.ParseException;
		import java.text.SimpleDateFormat;
		import java.util.ArrayList;
		import java.util.Date;
		import java.util.List;
		import java.util.Scanner;

		public class ExpenseTracker {

		    private static List<Expense> expenses = new ArrayList<>();

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("Enter a command:");
		            System.out.println("1. Add an expense");
		            System.out.println("2. View all expenses");
		            System.out.println("3. Exit");

		            int choice = scanner.nextInt();
		            scanner.nextLine(); // consume the newline character

		            switch (choice) {
		                case 1:
		                    addExpense();
		                    break;
		                case 2:
		                    viewExpenses();
		                    break;
		                case 3:
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println("Invalid command.");
		                    break;
		            }
		        }
		    }

		    public static void addExpense() {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the amount of the expense: ");
		        double amount = scanner.nextDouble();
		        scanner.nextLine(); // consume the newline character

		        System.out.print("Enter the category of the expense: ");
		        String category = scanner.nextLine();

		        System.out.print("Enter the date of the expense (dd/MM/yyyy): ");
		        String dateStr = scanner.nextLine();
		        Date date = parseDate(dateStr);

		        if (date == null) {
		            return; // exit the method if the date is invalid
		        }

		        Expense expense = new Expense(amount, category, date);
		        expenses.add(expense);

		        System.out.println("Expense added successfully.");
		    }

		    public static void viewExpenses() {
		        if (expenses.size() == 0) {
		            System.out.println("No expenses to display.");
		            return;
		        }

		        System.out.println("All expenses:");
		        for (Expense expense : expenses) {
		            System.out.println(expense);
		        }
		    }

		    public static Date parseDate(String dateStr) {
		        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		        try {
		            return dateFormat.parse(dateStr);
		        } catch (ParseException e) {
		            System.out.println("Invalid date format. Please enter a date in dd/MM/yyyy format.");
		            return null;
		        }
		    }
		

	}


