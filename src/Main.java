//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void sayHello(){
        System.out.println("Hello there");
    }

    static void greet(String name, int age){
        System.out.println("Hello " + name + " you are " + age + " years old");
    }

    static void grantAccess(int age, String name){
        if(age<18)
            System.out.println("Hello " + name + " you don't have access");

        else System.out.println("welcome " + name);
    }

    static String returnName(String name){
        return name;
    }

    static int returnAge(int age){
        return age;
    }

    static String returnAgeAndName(int age, String name){
        return age + " " +  name;
    }

    public static int sum(int k){
        if(k>0){
            System.out.println(k);
            return k + sum(k-1);
        }
        else return 0;
    }
    public static void main(String[] args) {
//
//        System.out.println(returnName("Miles"));
//        System.out.println(returnAge(32));
//
//        System.out.println(returnAgeAndName(34, "Miles"));

        System.out.println(sum(10));
    }
}