package org.example;

import static java.lang.StringTemplate.STR;

public class StringTemplate {

    public static void main(String args[]) {
        String productName = "Widget";
        double productPrice = 29.99;
        boolean productAvailable = true;

        String productInfo = STR." Product: \{productName} Price: $ \{productPrice} Availability: \{productAvailable ? "In Stock" : "Out of Stock"}";

        System.out.println(productInfo);
    }
}
