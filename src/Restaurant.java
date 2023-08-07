public class Restaurant {

public Burger orderBurger(String comanda){
    BurgerFactory factory=new BurgerFactory();
    Burger burger=factory.createBurger(comanda);
    burger.preparare();
    return burger;
}

}
