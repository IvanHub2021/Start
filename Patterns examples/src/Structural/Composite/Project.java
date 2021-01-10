package Structural.Composite;


public class Project {
    public static void main(String[] args) {
        Team team = new Team();
        Developer FirstJavaDeveloper = new JavaDeveloper();
        Developer SecondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(FirstJavaDeveloper);
        team.addDeveloper(SecondJavaDeveloper);
        team.addDeveloper(cppDeveloper);
        team.createProject();



    }
}
