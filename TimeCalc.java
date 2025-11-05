public class TimeCalc {
    public static void main(String[] args) {
        
        String tempTime = args[0];
        int minutesAdd = Integer.parseInt(args[1]);

        char firstNum = tempTime.charAt(0);
        char secondNum = tempTime.charAt(1);
        String combined = "" + firstNum + secondNum;  

        int hours = Integer.parseInt(combined); // Finding hours in integer format.
    

        firstNum = tempTime.charAt(3);
        secondNum = tempTime.charAt(4);
        combined = "" + firstNum + secondNum;

        int minutes = Integer.parseInt(combined); // Finding minutes in integer format.
    
        // System.out.println(hours + ":" + minutes);  // Checking initial time input.
        // System.out.println("Adding: " + minutesAdd); // Checking minutes to add.

        int totalMinutes = hours * 60 + minutes + minutesAdd; // Total minutes calculation.
        int totalHours = totalMinutes / 60; // Total hours calculation.
        int newHours = totalHours % 24; // New hours in 24-hour format.
        int newMinutes = totalMinutes - (totalHours * 60); // New minutes calculation.

        if(newHours < 10) {
            System.out.print("0");
        }

        System.out.print(newHours + ":");


        if (newMinutes < 10) {
            System.out.print("0");
        }

        System.out.println(newMinutes);
        }
    }
