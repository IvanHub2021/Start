package Structural.Decorator;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }
    public String sendWeakReport(){
        return "Send week report to customer...";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+sendWeakReport();
    }
}
