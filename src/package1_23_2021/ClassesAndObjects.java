package package1_23_2021;

 class App {
    // Instance variables (data or "state")
    String name;
    int age;
    
    
    // Classes can contain
    
    // 1. Data
    // 2. Subroutines (methods)
}


public class ClassesAndObjects {

    public static void main(String[] args) {
        
        
        // Create a App object using the App class
        App person1 = new App();    
        person1.name = "Joe Bloggs";
        person1.age = 37;
        
        // Create a second App object
        App person2 = new App();
        person2.name = "Sarah Smith";
        person2.age = 20;
        
        System.out.println(person1.name);
        
    }
}
