package com.company;

public class Main {

    public static void main(String[] args) {
         String restaurantsFilepath = "C:\\Users\\UWC Samsung 18\\Desktop\\Zaio\\Java\\Webinar Sessions\\UberEatsClone\\bin\\resturants.csv";
         String ordersFilepath = "C:\\Users\\UWC Samsung 18\\Desktop\\Zaio\\Java\\Webinar Sessions\\UberEatsClone\\bin\\orders.csv";

        Database db = new Database();
        db.getAllRestaurants(restaurantsFilepath);
        Restaurant[] restaurants = db.getRestaurantsByLocation("Rondebosch");
//
        for (int i = 0; i < restaurants.length; i++) {
            System.out.println(restaurants[i]);
        }        System.out.println("Welcome to Uber Eats - Signature Dish Edition \n");
      System.out.println("Select a location to load a restaurant from. Options are Rondebosch, Seapoint, Kenilworth or all.");
//
////        TAKE THE USER INPUT
             String location = sc.nextLine();
       System.out.println("Loading restaurants in your area...\n");
//
//
        System.out.println("Select a restaurant number (eg. '1' for KFC....\n");
     String number= sc.nextLine();
       System.out.println("Loading dishes from your selected restaurant...\n");
//
        System.out.println("Your cart is currently empty \n");
       System.out.println("Type 'a dish number' to add, and dish number is index + 1 from the array list that is being printed out ");
//

//
     System.out.println("Please confirm your order by typing 'y' for yes");
////        WHEN 'Y' IS PRESSED, ORDERS GET ADDED TO CSV FILE
//
////        
//

       System.out.println("com.company.UberEatsResturantApp.Order has been placed! Thank you for your time. Restaurant will process your order soon.\n");

    }
}
