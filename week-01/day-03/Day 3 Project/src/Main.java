import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task HelloMe
        // Modify this program to greet you instead of the World!
        System.out.println("Hello, Pavol!");

        //Task HelloOthers
        // Greet 3 of your classmates with this program in three separate lines
        // like:
        //
        // Hello, Esther!
        // Hello, Mary!
        // Hello, Joe!

        System.out.println("Hello, Yoad");
        System.out.println("Hello, Zoltan");
        System.out.println("Hello, Tereza");


        //Task HumptyDumpty
        // Modify this program to print Humpty Dumpty riddle correctly
        System.out.println("Humpty Dumpty sat on a wall,");
        System.out.println("Humpty Dumpty had a great fall.");
        System.out.println("All the king's horses and all the king's men");
        System.out.println("Couldn't put Humpty together again.");

        //Task IntroduceYourself
        // Write a program that prints a few details to the terminal window about you
        // It should print each detail to a new line:
        //  - Your name
        //  - Your age
        //  - Your height in meters (as a decimal fraction)
        //
        //  Example output:
        //  John Doe
        //  31
        //  1.87

        String myName = "Pavol Rehak";
        int myAge = 29;
        double heightMeters = 1.82;

        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(heightMeters);

        //Task TwoNumbers
        // Create a program that prints a few operations on two numbers: 22 and 13

        // Print the result of 13 added to 22
        System.out.println(13+22);

        // Print the result of 13 subtracted from 22
        System.out.println(22-13);

        // Print the result of 22 multiplied by 13
        System.out.println(13*22);

        // Print the result of 22 divided by 13 (as a decimal fraction)
        System.out.println(22./13.);

        // Print the integer part of 22 divided by 13
        System.out.println(22/13);

        // Print the remainder of 22 divided by 13
        System.out.println(22%13);

        //Task CodingHours
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        System.out.println("The attendee spends: " + (17*6*5) + " hours coding per semester." );

        System.out.println("The attendee spends " + 6. * 5. *100 /52 + ( " % of time." ) );

        //Task FavoriteNumber
        int favoriteNumber = 10;
        // Store your favorite number in a variable (as a number)
        // And print it like this: "My favorite number is: 8"
        System.out.println("My favorite number is: " + favoriteNumber );

        //Task Swap
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        int aTemp = b;
        int bTemp = a;

        a = aTemp;
        b = bTemp;

        System.out.println(a);
        System.out.println(b);

        //Task BMI
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        double BMI = massInKg/(heightInM * heightInM);
        System.out.println("BMI = " + BMI);

        //Task DefineBasicInfo

        // Define several things as a variable then print their values
        // Your name as a string
        String myName2 = "Pavol Rehak";
        // Your age as an integer
        int myAge2 = 30;
        // Your height in meters as a double
        double hMeters = 1.83;
        // Whether you are married or not as a boolean
        boolean marriedStatus = true;

        //Task VariableMutation
        a = 3;
        // make the "a" variable's value bigger by 10
        a += 10;
        System.out.println(a);

        b = 100;
        // make b smaller by 7
        b -= 7;
        System.out.println(b);

        int c = 44;
        // please double c's value
        c *= 2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d /= 5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e = e*e*e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        System.out.println(f1>f2);

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        System.out.println((g2*2)>g1);
        int h = 135798745;

        // tell if it has 11 as a divisor (print as a boolean)
        System.out.println(h % 11 == 0);
        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        System.out.println((i1 > i2*i2) && (i1 < i2*i2*i2));
        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        System.out.println(j % 3 == 0 || j % 5 == 0);

        //Task Cuboid
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double side1 = 8.3;
        double side2 = 15;
        double side3 = 5.5;

        System.out.println("Surface area: " + ((2 * side1 * side2)+(2 * side1 * side3)+(2 * side2 * side3)));
        System.out.println("Volume: " + (side1*side2*side3));

        //Task SecondsInADay
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above

        int dayTotal = 86400;
        int current = (currentHours*60*60) + (currentMinutes*60) + currentSeconds;

        System.out.println("Remaining seconds today: " + (dayTotal - current));

        //Task HelloUser

        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + " !");*/

        //Task MileToKmConvertor
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        /*System.out.println("Input distance in miles as a decimal number: ");
        double distMiles = scanner.nextDouble();
        System.out.println("Distance in kilometers is: " + distMiles * 1.60934);*/

        //Task AnimalsAndLegs
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        /*System.out.println("How many chicken  does the farmer have? ");
        int chicken = scanner.nextInt();
        System.out.println("How many pigs  does the farmer have? ");
        int pigs = scanner.nextInt();

        System.out.println("Total number of legs of all animals is: " + (chicken*2 + pigs * 4));*/

        //Task AverageOfInput

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        /*int sum = 0;
        System.out.println("Input 5 integers in a row");
        sum += scanner.nextInt();
        sum += scanner.nextInt();
        sum += scanner.nextInt();
        sum += scanner.nextInt();
        sum += scanner.nextInt();

        System.out.println("Sum: " + sum + " , Average: " + (sum/5.));*/

        //OddEven
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        /*System.out.println("Type an integer: ");
        int input = scanner.nextInt();

        if(input % 2 == 0){
            System.out.println("The provided number is even");
        }
        else{
            System.out.println("The provided number is odd");
        }*/

        //Task OneTwoALot
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot

       /* System.out.println("Type a number: ");
        double x = scanner.nextDouble();

        if(x <= 0){
            System.out.println("Not enough");
        }
        else if(x == 1){
            System.out.println("One");
        }
        else if(x == 2){
            System.out.println("Two");
        }
        else{
            System.out.println("A lot");
        }*/
        //Task PrintBigger
        // Write a program that asks for two numbers and prints the bigger one

        /*System.out.println("Input 2 numbers to compare");
        double p = scanner.nextDouble();
        double r = scanner.nextDouble();

        if(p>r){
            System.out.println(p);
        }
        else if( r>p){
            System.out.println(r);
        }
        else {
            System.out.println("Even");
        }*/

        //Task PartyIndicator
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second represents the number of boys
        //
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        // it should print: The party is excellent!
        //
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        // it should print: Quite a cool party!
        //
        // If there are less people coming than 20
        // it should print: Average party...
        //
        // If no girls are coming, regardless the count of the people
        // it should print: Sausage party

       /* System.out.println("Input number of girls in the party");
        int girls = scanner.nextInt();
        System.out.println("Input number of guys in the party");
        int guys = scanner.nextInt();

        int people = girls+guys;

        if(girls == guys && people>= 20 && girls != 0){
            System.out.println("The party is excellent");
        }
        else if(girls != guys && people >= 20 && girls != 0){
            System.out.println("Quite a cool party");
        }
        else if(people < 20 && girls != 0){
            System.out.println("Average party");
        }
        else if(girls == 0){
            System.out.println("Sausage party");
        }

        //Task ConditionVariablesMutation

        double q = 24;
        int output1 = 0;
        // if a is even increment out by one
        if(q%2 == 0){
            output1++;
        }

        System.out.println(output1);*/


        b = 13;
        String output2 = "";
        // if b is between 10 and 20 set out2 to "SSweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"
        if(b<10){
            output2 = "Less!";
        }
        else if(b>=10 && b<=20){
            output2 = "Sweet!";
        }
        else{
            output2 = "More!";
        }

        System.out.println(output2);


        c = 123;
        int credits = 10;
        boolean isBonus = false;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2

        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1

        // if isBonus is true c should remain the same

        if(isBonus == false) {
            if (credits >= 50 && isBonus == false) {
                c -= 2;
            } else if (credits < 50 && isBonus == false) {
                c -= 1;
            }
        }
        System.out.println(c);


        d = 8;
        int time = 150;
        String output3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"

        // if time is more than 200
        // set out3 to "Time out"

        // otherwise set out3 to "Run Forest Run!"

        if(time <=200){
            if(d % 4 == 0){
                output3 = "check";
            }
            else{
                output3 = "Run Forest Run!";
            }
        }
        else{
            output3 = "Time out";
        }


        System.out.println(output3);

        //Task IWontCheatOnExams
        // Create a program that writes this line 100 times:
        // "I won't cheat on the exam!"

      /*  int counter = 0;
        while(counter  < 100){
            System.out.println("I won't cheat on the exam!");
            counter++;
        }*/

        //Task PrintEven
        // Create a program that prints all the even numbers between 0 and 500

       /* for (int i = 0; i < 500; i+=2) {
            System.out.println(i);
        }*/

        //Task
        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75
        // 6 * 15 = 90
        // 7 * 15 = 105
        // 8 * 15 = 120
        // 9 * 15 = 135
        // 10 * 15 = 150

        /*int input = scanner.nextInt();

        for (int i = 1; i <11 ; i++) {
            System.out.println(i + " * " + input + " = " + (i*input));
        }
*/
        //Task CountFromTo
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

       /* System.out.println("Input 2 number: first the lower(start of count, second the higher(end of count");
        int smaller = scanner.nextInt();
        int bigger = scanner.nextInt();

        if(bigger > smaller){
            for ( int i = smaller ; smaller < bigger ; smaller++) {
                System.out.println(smaller);
            }
        }
        else{
            System.out.println("The second number should be bigger");
        }*/

        //Task FizzBuzz
        // Write a program that prints the numbers from 1 to 100
        // but for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.

        for (int i = 1; i < 100; i++) {
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }

        }
        //Task
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

       /* int triangleNum = scanner.nextInt();
        String output = "";

        for (int i = 1; i <= triangleNum; i++){
            output += "*";
            System.out.println(output);
        }*/

        //Task DrawDiagonal

        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

       /* int x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {   //current line
            if(i == 1 || i ==x){
                for (int st = 0; st < x; st++){   //prints first and last line of the shape
                    System.out.print("%");
                }
            }
            else{
                for (int k = 1; k <= x ; k++) {    // prints left and right borders and diagonal
                    if(k ==1 || k== x || k == i){
                        System.out.print("%");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                }

            System.out.println();
        }*/

        //Task
        // Write a program that stores a number and the user has to figure it out
        // The user can input guesses
        // After each guess the program would tell one of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        /*int guessNumber = 10;
        int input = scanner.nextInt();

        while(input != guessNumber){
            if (input > guessNumber){
                System.out.println("Stored number is lower");
                input = scanner.nextInt();
            }
            else{
                System.out.println("Stored number is higher");
                input = scanner.nextInt();
            }

        }
        System.out.println("You found the number:" + guessNumber);*/

        //Task
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        /*System.out.println("Please, type number of rows");
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            if(i % 2 != 0){
                System.out.println(" % % % %");
            }
            else{
                System.out.println("% % % % ");
            }

        }*/

        //Task DrawPyramid
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

       /* int input = scanner.nextInt();
        for (int i = 0; i <= input; i++) {  //Iterates over lines
            for (int k = 0; k < input -i; k++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2* i -1  ; star++) {
                System.out.print("*");

            }
            System.out.println();

        }
*/
        //Task DrawDiamond
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        /*int diamond = scanner.nextInt();

        for (int i = 0; i <= (diamond+1)/2; i++) {  //Iterates over lines
            for (int k = 0; k < diamond/2 - i +1; k++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * i - 1; star++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = diamond/2; i >= 0; i--) {
            for(int space = diamond/2+1; space > i  ; space--){
                System.out.print(" ");
            }
            for (int star = 1; star <= i*2-1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Task
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was


        /*int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int p = 0; p <= lines-1; p++)
                if(i == 0 || i == lines-1 || p == 0 || p == lines-1) {
                    System.out.print("%");
                    }

                else {
                    System.out.print(" ");


            }
            System.out.println();

        }*/

        //Task ParametricAverage
        // Write a program that asks for a number
        // It would ask this many times to enter an integer
        // If all the integers are entered it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

      /*  System.out.println("Input number of numbers to be averaged");
        int count = scanner.nextInt();
        int sum = 0;
        for(int numbers = 0; numbers < count; numbers++){
            System.out.println("Input a number to be averaged: ");
            sum += scanner.nextInt();
        }
        System.out.println("Sum is:" + sum + "Average is: " + (sum/count));*/






























    }
}
