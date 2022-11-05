package lesson.oop1;

public class Main {

    public static void main(String[] args) {

        //day2 :https://youtu.be/2Vx_Z-5Dr4I  : OOP // 05.11.22


        Product product1 = new Product();
        //                set value
        product1.name = "Delonghi Caffee M";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitsInStock = 3;
        product1.imageUrl = "delonghi.jpg";

        //                   get value
        //System.out.println(product1.name);

        //p1 has name,unitPrice,discount,unitInStock....

        Product product2 = new Product();
        product2.name = "Smeg Caffee M";
        product2.unitPrice = 6500;
        product2.discount = 8;
        product2.unitsInStock =23;
        product2.imageUrl = "delonghi.jpg";


        Product product3 = new Product();
        product3.name = "Kitchen Aid Caffee M";
        product3.unitPrice = 4500;
        product3.discount = 9;
        product3.unitsInStock = 2;
        product3.imageUrl = "delonghi.jpg";


        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println( "<li>" + product.name + " : " + product.unitPrice + "</li>");
        }
        System.out.println("</ul>");  // in line 41-45 we return html file , so that we can see them in the web page






    }



}
