package sept.ex_09102024;

public class Lab051 {
    public static void main(String[] args) {
        // switch is a multi way branch statement
        // It executes one statement from multiple conditions.
        // java switch expressions must be of byte, short, long (with its wrapper type), enums and string.
        // values in switch are case sensitive.
        // values for the case must be constant or literal. Variables are not allowed.
        // we cannot use continue keyword with switch.
        // duplicate cases are not allowed.
        // there would be single default and it can be anywhere.
        // cases can be multiple. Like:
            // case 001, 002, 005:
                    // System.out.println("All of them are electronic gadget");
        /* {
             case statement: 1
                code:
                break:

             case statement: 2
                code:
                break:

             case statement: 3
                code:
                break:
           }*/

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;

            case 2:
                System.out.println("Tue");
                break;

            default:
                System.out.println("No Idea");
                break;
        }
        System.out.println("End of the loop");
        
    }
}
