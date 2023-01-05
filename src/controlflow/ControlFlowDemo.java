package controlflow;

public class ControlFlowDemo {

    /**
     * Customer want to get an email alert for "mac pro book 16 inch laptop 2021" and SSD 512GB and RAM 16 when price is $700
     *
     * We can write an application which will check the price every after 5 minutes if customer conditions met application will send an alert.
     *
     * 1. Search the product in Amazon.com (search())
     * 2. If we get a product with the said condition send an email to customer
     * 3. If we do not get the product search the website after 5 minutes
     *
     * */
    public void checkDiscountedProduct(){
        System.out.println("This method is going to check the for the discounted product");
        // Application has finished the search of a product in the amazon.com and found below answer
        boolean isProductAvailable = true;

        // what is the value inside if (---------)
        // 2 = 2  ---->
        // if (condition){
        //    Write lines of code to implement your logic. this is will only be executed when value of condition is true
        // condition --> true or false
        // }
        if (isProductAvailable == true)
            System.out.println("Send customer an email");
        else if (isProductAvailable == false)
            System.out.println("Search after 5 minutes");
    }

    public static void main(String[] args) {
        ControlFlowDemo controlFlowDemo = new ControlFlowDemo();
        controlFlowDemo.checkDiscountedProduct();

        String color = "blue";
        String typeOfDress = "Sharee";
        int price = 20000;
        String material = "Jamdani";
        // condition color , typeOfDress, price, material
        // condition - true
        if(color=="black" & typeOfDress=="Sharee" && price==20000 && material=="Jamdani"){
            System.out.println("Yes got it, buy it!!!!");
        }
        else {
            System.out.println("Don't buy.");
        }

    }

}
