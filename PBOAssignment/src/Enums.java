public class Enums {
    public static void main(String[] args) {

        //Example of Enums
        System.out.println("Implementation of Enum: \n");
        Level easyLevel = Level.Easy;
        System.out.println(easyLevel);

        Level mediumLevel = Level.Medium;
        System.out.println(mediumLevel);

        Level hardLevel = Level.Hard;
        System.out.println(hardLevel);
        System.out.println("\n");

        //End of Enum

        //Example of Generic Class
        System.out.println("Implementation of Generic Class: \n");
        GenericClass<Integer> object1 = new GenericClass<Integer>(259);
        System.out.println(object1.getObject());

        GenericClass<String> object2 = new GenericClass<String>("Hai");
        System.out.println(object2.getObject());

        GenericClass<Double> object3 = new GenericClass<Double>(0.9);
        System.out.println(object3.getObject());
        System.out.println("\n");

        //End of Generic Class

        //Example of Generic Method
        System.out.println("Implementation of Generic Method: \n");
        GenericMethod example1 = new GenericMethod();
        example1.printvalue("Saya Ahmad Danindra NRP 5025211259");
        example1.printvalue(259);
        System.out.println("\n");

        //End of Generic Method


    }
}