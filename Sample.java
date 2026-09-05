//Objects.variable,methods,constructor//
public class Sample { 
    public static void main(String[] args) {
        Sample s = new Sample("sarathi", 20, "123");
        s.getName();
        s.getAge();
        s.getRoll();
        Sample.getBloodGroup();
    }
    String name;
    int age;
    String roll;
    static String bloodgroup="O+";

    Sample(String name,int age,String roll){
        this.name=name;
        this.age=age;
        this.roll=roll;
    }
    void getName(){
        System.out.println("Name:sarathi "+name);
    }
    void getAge(){
        System.out.println("Age: "+age);
    }
    void getRoll(){
        System.out.println("Roll: "+roll);
    }
    static void getBloodGroup(){
        System.out.println("Blood Group: "+bloodgroup);
    }
}
