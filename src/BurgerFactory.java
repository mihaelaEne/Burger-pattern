public class BurgerFactory {
    public Burger createBurger(String comanda) {
        Burger burger = null;

        if ("Veg".equals(comanda)) {
            burger = new VegBurger();
        } else if ("BEEF".equals(comanda)) {
            burger = new BeefBurger();

        }
        burger.preparare();
        return burger;
    }
}
