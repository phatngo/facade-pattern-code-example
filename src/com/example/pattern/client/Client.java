package com.example.pattern.client;

import com.example.pattern.facade.ShopFacade;

public class Client {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("contact@gpcoder.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("gpcodervn@gmail.com", "0988.999.999");
    }
}
