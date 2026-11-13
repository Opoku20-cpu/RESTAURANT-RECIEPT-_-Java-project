package com.resturant;


import java.util.Scanner;

public class atu_restaurant {

    public atu_restaurant() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);


        double totalprice3=0;
        int totalQty = 0;


        System.out.println("Enter cashier:");
        String cashier = sc.nextLine();
        System.out.println("Enter Date:");
        String Date = sc.nextLine();
        System.out.println("Enter Order No:");
        String OrderNo = sc.nextLine();
        System.out.println("Enter cashpaid" + "GHs");
        double cashpaid = sc.nextDouble();
        sc.nextLine();
        System.out.println("ACCRA TECHNICAL UNIVERSITY RESTAURANT");
        System.out.println("Tel: 0548886202,Barnes Road,Accra");
        System.out.println("=================================");
        System.out.println("RECEIPT");
        System.out.println("==================================");
        System.out.println("cashier:" + cashier);
        System.out.println("Date:"+ Date);
        System.out.println("Order No:"+ OrderNo);
        System.out.println("-------------------------------------------------------------");


        for(int i= 0; i < 2; i++) {
            System.out.println("Enter Description");
            String Description = sc.nextLine();
            System.out.println("Qty");
            int Qty = sc.nextInt();
            System.out.println("Enter price");
            double price = sc.nextDouble();
            sc.nextLine();

            double totalprice = Qty * price;
            System.out.println(totalprice);


            totalprice3 = totalprice3 +  totalprice;
            totalQty = totalQty + Qty;

            System.out.println(Qty + "\t" + Description + "\t " + price + "\t" + totalprice3);

        }
            System.out.println("Total Quantity:" + totalQty );
            System.out.println("Total price:" + totalprice3 );


        double VAT =VAT(totalprice3);
        double NHIL = NHIL(totalprice3);
        double GetFund = GetFund(totalprice3);
        double covidLevy =covidLevy(totalprice3);
        double TourismLevy =TourismLevy(totalprice3);
        double Elevy = Elevy(totalprice3);
        double OverAllTotal = totalprice3 + VAT + NHIL + GetFund + covidLevy + TourismLevy + Elevy;
        double Balance = cashpaid - OverAllTotal;



        System.out.println("totalQty           \t            +                 Total   ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Taxes              \t          +                   Total ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("VAT:" +                                                     VAT );
        System.out.println("NHIL:" +                                                    NHIL);
        System.out.println("GetFund:" +                                              GetFund);
        System.out.println("covidLevy:" +                                           covidLevy);
        System.out.println("TourismLevy:" +                                        TourismLevy);
        System.out.println("Elevy"+                                                   Elevy);
        System.out.println("---------------------------------------------------------------");
        System.out.println("OverAllTotal" +" GHS" + OverAllTotal);
        System.out.println("cashpaid" + " GHS" + cashpaid);
        System.out.println("Balance "+ "GHS" + Balance);
        System.out.println("=================================================================");


    }


    public static double VAT(double amount) {
        return amount * (12.5 / 100);
    }
        public static double NHIL(double amount) {
            return  amount * (2.5/100);
    }

    public static double GetFund (double amount) {
        return amount * (2.5 / 100);
    }
    public static double covidLevy(double amount) {
        return amount * (1 / 100);
    }
    public static double TourismLevy(double amount) {
        return amount * (1 / 100);
    }
    public static double Elevy(double amount) {
        return amount * (2.5 / 100);
    }


}










