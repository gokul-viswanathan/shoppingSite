package com.example.my_server.Items;

// this is DTO (Data Transfer Object). it will encapsulate (give structuer) to 
// data so that it is easy to pass around
/*{
      id: 1,
      name: "Classic T-Shirt",
      price: 29.99,
      description: "Comfortable cotton t-shirt",
      image: "/api/placeholder/200/200"
    }, */
public class Items {
    private Number id;
    private String name;
    private double price;
    private String description;
    private String image;

    Items(){};

    Items(Number id, String name, double price, String description, String image){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public Number getId(){
        return this.id;
    }

    public void setId(Number id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setImage(String image){
        this.image = image;
    }

    public String getImage(){
        return this.image;
    }

    public String toString(){
        return "item{name='" + this.name + "', price=" + this.price + "}";
    }
}
