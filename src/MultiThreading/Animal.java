package MultiThreading;

public class Animal extends Thread {
    public  void  cat(){
        System.out.println("Cat can Meiooooo");
    }
    public void dog (){
        System.out.println("Dog can HauHau");
    }
    public void jojo(){
        System.out.println("JoJo can GhodGhod");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.cat();
        animal.dog();
        animal.jojo();

    }
}
