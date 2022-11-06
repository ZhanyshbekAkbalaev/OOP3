import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Zhanyshbek","Akbalaev",32,new String[] {"Soft skills","English",""},"Kurdak");
        System.out.println(myClass.getName()+" "+ myClass.getSurName()+" "+ Arrays.toString(myClass.getPeaksoft()) +" "+myClass.getFood()  );

        MyClass myClass1 = new MyClass("Zhanyshbek", "Akbalaev", 18, "Ashlanfiu");
        System.out.println(myClass1.getName() + " " + myClass1.getSurName() + " " +myClass1.getAge() + " " + myClass1.getFood());

    }
}