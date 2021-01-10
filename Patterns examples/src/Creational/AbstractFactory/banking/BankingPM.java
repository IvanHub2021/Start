package Creational.AbstractFactory.banking;

import Creational.AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Project manager manages banking project...");
    }
}
