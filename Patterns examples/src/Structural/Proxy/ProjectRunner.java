package Structural.Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://www.github.com/IvanHub2021/Start");
        /*Если закоментировать нижележащую строчку - только создастся пустой проект,
        но никаких действий не будет произведено, и как только мы вызомем метод run(), только
        тогда начнет качться проект и запускаться.
         */
        project.run();
    }
}
