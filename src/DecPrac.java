/**
 *
 * @author Thiwanka
 */
public class DecPrac {
    public static void main(String[] args) {
        Pizza p1 = new FishPizza();
          p1 = new BBQSauce(p1);
          p1 = new SwissChees(p1);
          System.out.println(p1.getPrice());
          
        Pizza p2 = new ChickenPizza();
              p2 = new BBQSauce(p2);
              p2 = new FriedOnions(p2);
              p2 = new Mayonnaise(p2);
              System.out.println(p2.getPrice());
              
        Pizza p3 = new VeggiePizza();
              p3 = new SwissChees(p3);
              p3 = new FriedOnions(p3);
              System.out.println(p3.getPrice());
    }     
}

abstract class Pizza{
    public abstract double getPrice();
    
}
class ChickenPizza extends Pizza{
    @Override
    public double getPrice(){
        return 850;
    }
}
class VeggiePizza extends Pizza{
    @Override
    public double  getPrice(){
        return 650;
    }
}
class FishPizza extends Pizza{
    @Override
    public double  getPrice(){
        return 720;
    }
}
abstract class PizzaDecorator extends Pizza{
    Pizza pizza;
    
    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public double getPrice(){
        return pizza.getPrice();
    }
}
class BBQSauce extends PizzaDecorator{
    public BBQSauce(Pizza pizza){
        super(pizza);
    }
    @Override
    public double getPrice(){
        return super.getPrice()+50;
    }
}
class SwissChees extends PizzaDecorator{
    public SwissChees(Pizza pizza){
        super(pizza);
    }
    @Override
     public double getPrice(){
        return super.getPrice()+80;
    }
}
class FriedOnions extends PizzaDecorator{
    public FriedOnions(Pizza pizza){
        super(pizza);
    }
    @Override
     public double getPrice(){
        return super.getPrice()+20;
    }
}
class Mayonnaise extends PizzaDecorator{
    public Mayonnaise(Pizza pizza){
        super(pizza);
    }
    @Override
     public double getPrice(){
        return super.getPrice()+35;
    }
}
