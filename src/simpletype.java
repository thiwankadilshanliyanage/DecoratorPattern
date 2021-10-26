

/**
 *
 * @author Thiwanka
 */
public class simpletype {
    public static void main(String[] args) {
        
    }
}
abstract class Component{
    public abstract void method1();
}
class SubComponet extends Component{

    @Override
    public void method1() {
        System.out.println("Sub Component Method 1");
    }
    
}
abstract class Decorator extends Component{
   private final Component component; 
    
    public Decorator(Component component){
        this.component = component;
    }
    
    @Override
    public void method1(){
        component.method1();
    }
}

class SubDecrators extends Decorator{
    
    public SubDecrators(){
        super (null);  
    }
    
    @Override
    public void method1(){
        super.method1();
        System.out.println("Sub Decorator method 1");
    }
}
