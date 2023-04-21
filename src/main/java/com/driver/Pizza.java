package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheese = false;

    private boolean extraToppings = false;

    private boolean paperBag = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg = true)
        {
            this.price += 300;
        }

        else
        {
            this.price += 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        if(extraCheese) //adding check so that I don't add extraCheese amount again
        {
            return;
        }
        this.price += 80;
        this.extraCheese = true;
    }

    public void addExtraToppings(){

        if(extraToppings)
        {
            return;
        }

        if(isVeg)
        {
            this.price += 70;
        } else
        {
            this.price += 120;
        }

        this.extraToppings = true;
    }

    public void addTakeaway(){

        if(paperBag)
        {
            return;
        }

        this.price += 20;

        this.paperBag = true;
    }

    public String getBill(){

        if(isVeg)
        {
            bill = "Base Price Of The Pizza: 300\n";
        } else{
            bill = "Base Price Of The Pizza: 400\n";
        }

        if(extraCheese)
        {
            bill += "Extra Cheese Added: 80\n";
        }

        if(extraToppings)
        {
            if(isVeg)
            {
                bill += "Extra Toppings Added: 70\n";
            } else {
                bill += "Extra Toppings Added: 120\n";
            }
        }

        if(paperBag)
        {
            bill += "Paper Added: 20\n";
        }

        String totalPrice = Integer.toString(price);

        bill += "Total Price: " + totalPrice + "\n";

        return this.bill;
    }
}
