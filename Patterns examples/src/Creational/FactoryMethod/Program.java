package Creational.FactoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = createDeveloperFactoryBySpecialty("c++");
        Developer developer= factory.createDeveloper();
        developer.writeCode();
    }
    static DeveloperFactory createDeveloperFactoryBySpecialty(String specialty){
        if(specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if(specialty.equalsIgnoreCase("C++")){
            return new CppDeveloperFactory();
            }
        else if(specialty.equalsIgnoreCase("php"))
            return  new PhpDeveloperFactory();
        else throw new RuntimeException(specialty + " is unknown specialty. \n");
        }
}

