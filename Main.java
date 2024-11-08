
public class Main {

    public static void main(String[] args) {
        
        Animal lion =new Lion("Mufasa", 50);
        Animal tiger = new Tiger("Raftar", 65);

        ((Tiger) tiger).details();
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

class Tiger extends Animal {
    public Tiger(String name, int speed){
        super(name, speed);
    }

    public void details() {
        System.out.println("hello this is method ");
    }
}