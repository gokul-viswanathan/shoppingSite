package com.example.my_server.Items;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// code for Rest controller will be in controller

@RestController
public class ItemsController {
    /*{
      id: 1,
      name: "Classic T-Shirt",
      price: 29.99,
      description: "Comfortable cotton t-shirt",
      image: "/api/placeholder/200/200"
    }, */
    ItemsService service;
    ItemsController(){
        this.service = new ItemsService();
    }
    
    @CrossOrigin("http://192.168.1.132:3000/")
    @GetMapping("/get/item")
    public List<Items> getitems(){
        return this.service.itemsList();
    }
}
