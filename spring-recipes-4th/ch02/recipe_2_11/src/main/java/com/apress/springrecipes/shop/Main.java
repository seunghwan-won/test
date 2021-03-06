package com.apress.springrecipes.shop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("global");
        context.scan("com.apress.springrecipes.shop");
        context.refresh();

        String init = context.getBean("initUrl", String.class);
//
//        Product aaa = context.getBean("aaa", Product.class);
//        Product cdrw = context.getBean("cdrw", Product.class);
//        Product dvdrw = context.getBean("dvdrw", Product.class);

        System.out.println("init url : " + init);

//        ShoppingCart cart1 = context.getBean("shoppingCart", ShoppingCart.class);
//        cart1.addItem(aaa);
//        cart1.addItem(cdrw);
//        System.out.println("Shopping cart 1 contains " + cart1.getItems());
//
//        ShoppingCart cart2 = context.getBean("shoppingCart", ShoppingCart.class);
//        cart2.addItem(dvdrw);
//        System.out.println("Shopping cart 2 contains " + cart2.getItems());

        Cashier cashier = context.getBean("cashier", Cashier.class);
//        cashier.checkout(cart1);
//        cashier.checkout(cart2);
    }
}
