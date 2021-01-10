package Structural.Proxy;

public class RealProject implements Project{
    public RealProject(String url) {
        this.url = url;
        load();
    }

    private String url;
    public void load(){
        System.out.println("Loading project from " + url + "...");
    }
    @Override
    public void run() {
        System.out.println("Running project" + url + "...");
    }
}
