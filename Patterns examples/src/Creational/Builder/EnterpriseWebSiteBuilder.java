package Creational.Builder;

public class EnterpriseWebSiteBuilder extends WebSiteBuilder{


    @Override
    void buildName() {
        webSite.setName("Enterprise site");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);

    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);

    }
}
