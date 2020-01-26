import java.util.Date;

public class SpecialOffer {
    Product product;
    String description;
    String fromTo;
    double discount;

    SpecialOffer(Product prod, String desc, String dates, double disc){
        product = prod;
        description = desc;
        fromTo = dates;
        discount = disc;
    }

    void show(){
        System.out.println("Promocja: " + product.name + " taniej o " + discount*100 + " %");
    }

}
