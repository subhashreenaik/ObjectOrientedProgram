package com.bridgelabz.stock;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {
	static String sname;
	static int noshare;
	static double price;
    static ArrayList<Stock> stock = new ArrayList<>();
    static double balance = 2000;

    public void enterInform() {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Share name :");
		sname=sc.nextLine();
		System.out.println("Enter your number of share : ");
		noshare = sc.nextInt();
		System.out.println("Enter share price :");
		price = sc.nextDouble();
    }
		
		static void buy(double amount,String sharename) {
			for (int j = 0; j < stock.size(); j++) {
				Stock p = stock.get(j);
				if (sharename.equals(p.getName())) {
            double shareamount = p.getPrice() * p.getNumber();
            if(amount>shareamount ) {
            	amount = amount -shareamount;
            	System.out.println("Rest amount is "+sharename+" is "+amount);
            }
            else {
            	System.out.println("There is no balance");

            }
				}
        
    }}
		static void sell(double amount,String sharename) {
			for (int j = 0; j < stock.size(); j++) {
				Stock p = stock.get(j);
				if (sharename.equals(p.getName())) {
                double shareamount = p.getPrice() * p.getNumber();
            	amount = amount +shareamount;
            	stock.remove(j);
            	System.out.println("Total amount is "+sharename+" is "+amount);
            
				}
        
    }}

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
    	
        StockAccount sa = new StockAccount();
        System.out.println("Enter the number of share");
        Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		for(int i=0;i<n;i++) {
		sa.enterInform();
		Stock entry= new Stock(sname, noshare, price);
		stock.add(entry);
		}
		sa.stockReport();
		System.out.println("Enter the name of share you want to buy");
		sname=sc.nextLine();
		buy(balance,sname);
		
		System.out.println("Enter the name of share you want to sell");
		sname=sc.nextLine();
		sell(balance,sname);     
        }

    }


