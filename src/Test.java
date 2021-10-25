/**
 *
 * @author Thiwanka
 */
public class Test {

    public static void main(String[] args) {
        // TODO code application logic here
        
//        VanillaIceCream vi = new VanillaIceCream();
//        System.out.println(vi.getPrice());
//        
//        ChocolateSauce cs = new ChocolateSauce(vi);
//        System.out.println(cs.getPrice()); 

          IceCream i1 = new VanillaIceCream();
                   i1 = new ChocolateSauce(i1);
                   System.out.println(i1.getPrice());
    }
    
}
abstract class IceCream{//Component
    public abstract double getPrice();
}
class VanillaIceCream extends IceCream{//SubComponent (IS-A)
    @Override
    public double getPrice(){
        return 50;
    }
}
abstract class IceCreamDecorator extends IceCream{//Decorator (IS-A)
    IceCream iceCream;    //HAS_A

    public IceCreamDecorator(IceCream iceCream) {//Decorator must has a icecream therefor we create constructor in decorator class (Because before add chocolate sause must has a icecream)
        this.iceCream = iceCream;
    }
    @Override
    public double getPrice(){
        return iceCream.getPrice();
    }
    
}
 class ChocolateSauce extends IceCreamDecorator{//SubDecorator (IS-A)
    
     public ChocolateSauce(IceCream iceCream) {//child class must inherit super class everythings,Therefor it must has constructor
         super(iceCream);//child class call supper class
     }

    @Override
    public double getPrice() {
        return super.getPrice()+10;
    }
    
}
   