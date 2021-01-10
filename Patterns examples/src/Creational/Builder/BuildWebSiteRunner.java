package Creational.Builder;


public class BuildWebSiteRunner  {
       public static void main(String[] args) {
            Director director = new Director();
            director.setBuilder(new VisitCardWebSiteBuilder());
            WebSite webSite = director.buildWebSite();
              // TODO: 06.01.2021  .
             System.out.println(webSite);




    }
}
