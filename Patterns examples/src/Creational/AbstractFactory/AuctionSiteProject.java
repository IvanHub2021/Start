package Creational.AbstractFactory;


import Creational.AbstractFactory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        System.out.println("Creating banking system...\n");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
