package Creational.Prototype;

public class Project implements Copyable {
    private int id;

    private String ProjectName;
    private String sourceCode;

    public Project(int id, String projectName, String sourceCode) {
        this.id = id;
        ProjectName = projectName;
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        return new Project(id,ProjectName,sourceCode);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", ProjectName='" + ProjectName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
