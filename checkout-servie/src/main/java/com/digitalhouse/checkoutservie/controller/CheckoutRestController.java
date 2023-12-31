package com.digitalhouse.checkoutservie.controller;

import com.digitalhouse.checkoutservie.service.ICheckoutService;
import com.digitalhouse.checkoutservie.service.ICheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.digitalhouse.checkoutservie.model.Checkout;

import java.util.List;

@RestController
@RequestMapping(value="/checkout")
public class CheckoutRestController {
    private ICheckoutService checkoutService;

    public CheckoutRestController(ICheckoutService checkoutService) {
        super();
        this.checkoutService = checkoutService;
    }

    @GetMapping()
    public Checkout getCheckout(@RequestParam List<String> productIds) {
        return checkoutService.buildCheckout(productIds);
    }

}
