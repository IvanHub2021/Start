package Structural.Facade;

public class BugTracker {
    private boolean activeSprint;
    public boolean isActiveSpring(){
        return activeSprint;
    }
    public void startSpring(){
        System.out.println("Sprint is active...");
        activeSprint=true;
    }
    public void finishSprint(){
        System.out.println("Sprint is not active...");
        activeSprint=false;
    }
}
