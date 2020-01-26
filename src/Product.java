public class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String n, double p, String desc, Category cat){
        name = n;
        price = p;
        description = desc;
        category = cat;
    }

    Product(String n, double p, String desc){
        name = n;
        price = p;
        description = desc;
        category = null;
    }

    void showAll(){
        System.out.println("Nazwa produktu: " + name);
        System.out.println("Cena produktu: " + price);
        System.out.println("Opis produktu: " + description);
        System.out.println("Kategoria produktu: " + category.name);
        System.out.println();
    }

    void showWithoutCat(){
        System.out.println("Nazwa produktu: " + name);
        System.out.println("Cena produktu: " + price);
        System.out.println("Opis produktu: " + description);
        System.out.println();
    }

}
