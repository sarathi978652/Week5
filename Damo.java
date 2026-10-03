public class Damo {
    static int a=20;
    static void add() {
        System.out.println("hii");

    }
    
    int b=30;

    String sub(){
        return "hello";
    }

    public static void main(String[] args) {
        System.out.println("Static members...............");
        System.out.println(a);
        add();
       Demo d1=new Damo(); 
       System.out.println("d1.b");
       System.out.println(d1.sub());
    }
}     