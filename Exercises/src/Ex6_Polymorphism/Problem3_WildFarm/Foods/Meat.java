package Ex6_Polymorphism.Problem3_WildFarm.Foods;

/**
 * Created by Niki on 4.7.2016 г..
 */
public class Meat extends Food {

    public Meat(Integer quantity) {
        super(quantity);
    }

    @Override
    public String toString() {
        return "Meat";
    }
}
