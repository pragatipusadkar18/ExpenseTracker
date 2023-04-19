package com.mycompany.expensetracker;
import java.text.DateFormat;
		import java.text.DecimalFormat;
		import java.text.SimpleDateFormat;
		import java.util.Date;

		public class Expense {

		    private double amount;
		    private String category;
		    private Date date;

		    public Expense(double amount, String category, Date date) {
		        this.amount = amount;
		        this.category = category;
		        this.date = date;
		    }

		    public double getAmount() {
		        return amount;
		    }

		    public String getCategory() {
		        return category;
		    }

		    public Date getDate() {
		        return date;
		    }

		    public String toString() {
		        DecimalFormat decimalFormat = new DecimalFormat("#.##");
		        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		        String amountStr = decimalFormat.format(amount);
		        String dateStr = dateFormat.format(date);

		        return String.format("%s - %s - %s", amountStr, category, dateStr);
		    }
		}


	}

}
