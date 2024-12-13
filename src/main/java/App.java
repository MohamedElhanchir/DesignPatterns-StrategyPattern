import strategy.IStrategy;
import strategy.IStrategyImpl1;
import strategy.IStrategyImpl2;
import strategy.IStrategyImplByDefault;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
         Context context = new Context();
         boolean finish = false;
        Scanner scanner = new Scanner(System.in);
            while (!finish) {
                System.out.println("Enter the Startegy you want to apply: ");
                String strategyClassName = scanner.nextLine();
                IStrategy strategy = null;
                try {
                    strategy = (IStrategy) Class.forName(strategyClassName).getDeclaredConstructor().newInstance();
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                         InvocationTargetException e) {
                    System.out.println("Strategy not found, applying default strategy.");
                    strategy = new IStrategyImplByDefault();
                }
                context.setStrategy(strategy);
                context.process();
                System.out.println("________________________________________________________");
                System.out.println("Do you want to continue? (Y/N)");
                String continueChoice = scanner.nextLine();
                if (continueChoice.equalsIgnoreCase("N")) {
                    finish = true;
                }
            }

    }
}