public class GetLoopy {
    public static void main(String[] args) {
        // Problem 1: A loop that counts up by 1 from 0 to 30
        for (int i = 0; i <= 30; i++) {
            System.out.println(i);
        }
        //Problem 2: Loop that counts down by 1 from 30 to 0
            for (int i = 30; i >= 0; i--) {
                System.out.println(i);
            }
            //problem 3: up by 3 0-18
        for (int i = 0; i <= 18; i += 3) {
            System.out.println(i);
        }
        // Loop that counts down by 2 from 10 to 0
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
        // Nested loop to create the pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //#5 nested loop to create the pattern
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // #6 Nested loop to create the pattern
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // #7 Nested loop to create the pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         // #8 First Initial
        // Upper part of 'S'
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Middle part of 'S'
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k <= 8; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Lower part of 'S'
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
            }
        }




