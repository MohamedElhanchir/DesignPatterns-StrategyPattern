public class Context {

    public void process(int type){

        System.out.println("start processing");
        if(type==1){
            System.out.println("Processing type 1");
        }else if(type==2){
            System.out.println("Processing type 2");
        } else if (type==3){
            System.out.println("Processing type 3");
        } else{
            System.out.println("Processing by default");
    }
    System.out.println("end processing");
    }
}