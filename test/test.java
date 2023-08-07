import org.junit.Test;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class test {

    @Test
    public void testFastFood(){
        ArrayList<Burger> burgers=new ArrayList<>();
        Burger b1=new BeefBurger();
        burgers.add(b1);

        Burger b2=new VegBurger();
        burgers.add(b2);


    }
}
