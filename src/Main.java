public class Main {
    public static void main(String[] args) {

        Category cat1 = new Category("Słodycze", "Czekolady, batony, lizaki, cukierki");
        Category cat2 = new Category("Nabiał", "Mleko, sery, jogurty");

        Product prod1 = new Product("Czekolada", 3.5, "Czekolada mleczna", cat1);
        Product prod2 = new Product("Lizak", 1.3, "Lizak truskawkowy", cat1);
        Product prod3 = new Product("Jogurt", 2.7, "Jogurt naturalny", cat2);
        Product prod4 = new Product("Kajzerka", 0.4, "Bułka");

        SpecialOffer specialOffer = new SpecialOffer(prod1, "Promocja na czekolady mleczne", "od 1-01-2020 do 1-02-2020", 0.2);

        prod1.showAll();
        prod2.showAll();
        prod3.showAll();
        prod4.showWithoutCat();
        specialOffer.show();
    }
}
