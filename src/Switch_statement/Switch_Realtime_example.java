package Switch_statement;

import java.util.Scanner;

public class Switch_Realtime_example {
    public static void main(String[] args) {
        //web automation
        //I will ask user to give me input from browser which he wants to use to ,
        // and I will start automation in that browser

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();

        switch (browser){
            case "chrome":
                System.out.println("starting the chrome browser");
                System.out.println("............");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                //automation code........
                break;
            case "edge":
                System.out.println("execute the edge code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
        }
    }
}
