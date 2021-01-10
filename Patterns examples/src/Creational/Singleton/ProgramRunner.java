package Creational.Singleton;

public class ProgramRunner {
    public static void main(String[] args) {
       // System.out.println(ProgramLoger.GetProgramLoger().toString());
        ProgramLoger.GetProgramLoger().addLogInfo("First log");
        ProgramLoger.GetProgramLoger().addLogInfo("Second log");
        ProgramLoger.GetProgramLoger().addLogInfo("Third log");
        ProgramLoger.GetProgramLoger().showLogFile();
    }
}
