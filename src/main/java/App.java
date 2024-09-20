public class App {
    public static void main(String[] args) {
        Context ctx=new Context();

        System.out.println("Processing type 1");
        ctx.process(1);
        System.out.println("_____________________________");
        System.out.println("Processing type 2");
        ctx.process(2);
        System.out.println("_____________________________");
        System.out.println("Processing type 3");
        ctx.process(3);
        System.out.println("_____________________________");
        System.out.println("Processing by default");
        ctx.process(99);


    }
}