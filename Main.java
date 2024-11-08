
public class Main {

    public static void main(String[] args) {
        
        Animal lion =new Lion("Mufasa", 50);
    }
}

class Animal {

    public Animal(String name, int speed){
        System.out.println("Hi! I am "+name+" my speed is "+speed +"km");
    }
    
}

class Lion extends Animal {
    public Lion(String name, int speed){
        super(name, speed);
    }
    
}