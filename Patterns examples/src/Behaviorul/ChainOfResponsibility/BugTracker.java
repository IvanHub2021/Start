package Behaviorul.ChainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK...",Priority.ROUTINE);
        reportNotifier.notifyManager("Something is wrong",Priority.IMPORTANT);
        reportNotifier.notifyManager("It is KARAUL!!!", Priority.ASAP);

    }
}
