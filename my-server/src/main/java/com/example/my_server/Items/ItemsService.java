package com.example.my_server.Items;

import java.util.ArrayList;
import java.util.List;

// class where we handle all business logic related to items
public class ItemsService {

    public List<Items> items;
    public Items item;

    ItemsService(){
        this.items = new ArrayList<Items>();
    }

    public List<Items> itemsList(){
        this.item = new Items(1, "Classic T-Shirt", 29.99,"Comfortable cotton t-shirt", "/api/placeholder/200/200");
        this.items.add(this.item);
        System.out.println(this.items);
        return this.items;
    }
    
}
