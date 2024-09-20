import strategy.IStrategy;
import strategy.IStrategyImpl1;
import strategy.IStrategyImpl2;

public class App {
    public static void main(String[] args) {
         Context context = new Context();
         context.process();
        System.out.println("____________________________");
        IStrategy strategy = new IStrategyImpl2();
         context.setStrategy(strategy);
         context.process();
        System.out.println("____________________________");

    }
}