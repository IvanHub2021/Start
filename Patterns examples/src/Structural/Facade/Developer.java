package Structural.Facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if(bugTracker.isActiveSpring()){
            System.out.println("Developer is solving problems...");
        }else{
            System.out.println("Developer have rest...");
        }

    }
}
