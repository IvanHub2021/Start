package Creational.Prototype;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    Project CloneProject(){
        return  (Project) project.copy();
    }
}
