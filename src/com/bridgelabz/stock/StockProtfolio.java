package com.bridgelabz.stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockProtfolio {
	static String sname;
	static int noshare;
	static double price;
	static List<Stock> stock =new ArrayList<Stock>();
	
	//calling this method to add n number of stock
	public  void enterInform() {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Share name :");
		sname = sc.nextLine();
		System.out.println("Enter your number of share : ");
		noshare = sc.nextInt();
		System.out.println("Enter share price :");
		price = sc.nextDouble();

	}
	
	public void stockReport() {
		double total=0.0;
		for(int i=0;i<stock.size();i++) {
			Stock s=stock.get(i);
			double shareprice=s.getPrice() *s.getNumber();
			total +=shareprice;
			System.out.println("stock name = "+s.getName()+"\nnumber of shares = "+s.getNumber()+"\nstock price = "+s.getPrice()+"\nTotal price of stock = "+total+"\n");
		}
		
		
		
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		StockProtfolio stk =new StockProtfolio();
		System.out.println("Enter the number of share");
		int n =sc.nextInt();
		
		for(int i=0;i<n;i++) {
		stk.enterInform();
		Stock entry= new Stock(sname, noshare, price);
		stock.add(entry);
		}
		stk.stockReport();
		

	}

}
