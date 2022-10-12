package com.online.restaurant.app;
import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vendor;
import java.util.Date;

public class Application {

    public static void main (String[] args){

        //Customer Data
        Customer ramesh = new Customer();
        ramesh.setName("Ramesh");
        ramesh.setCity("Nagpur");
        ramesh.setState("Maharashtra");
        ramesh.setEmailID("abc@gmail.com");
        ramesh.setPhone(23566366);
        ramesh.setAdress("KDK Nagpur");


        System.out.println("Name="+ ramesh.getName());
        System.out.println("City ="+ ramesh.getCity());
        System.out.println("State ="+ ramesh.getState());
        System.out.println("EmailId ="+ ramesh.getEmailID());



          //vendor Data
        Vendor haldiramn = new Vendor();
        haldiramn.setName("Haldiram veg");
        haldiramn.setAddress("Ajni square Nagpur");
        haldiramn.setCategory("Veg");
        haldiramn.setPhone(53764787);
        haldiramn.setRating(5.0);
        haldiramn.setState("Maharashtra");
        haldiramn.setCity("Nagpur");


        System.out.println("Vendor Details");
        System.out.println("Name: "+ haldiramn.getName());
        System.out.println("Address :"+ haldiramn.getAddress());
        System.out.println("Category: "+ haldiramn.getCategory());
        System.out.println("Phone: "+ haldiramn.getPhone());
        System.out.println("Rating :"+ haldiramn.getRating());
        System.out.println("State:"+ haldiramn.getState());
        System.out.println("City:"+ haldiramn.getCity());


        //Order Data
        Order order = new Order();
        order.setCustomer(ramesh);
        order.setVendor(haldiramn);
        order.setPrice(999.00);
        order.setOrderdate(new Date());
        order.getDeliveryAddress();


        System.out.println("Order Details:");
        System.out.println("Total amount :"+ order.getTotalAmount());
        System.out.println("Order Date :"+ order.getOrderdate());
        System.out.println();


    }

}
