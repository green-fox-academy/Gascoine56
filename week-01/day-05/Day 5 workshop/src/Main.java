import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task Third
        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print the third element of `numbers`

        /*int [] numbers = {4,5,6,7};
        System.out.println(numbers[2]);*/

        //Task CompareLength
        // - Create an array variable named `firstArrayOfNumbers`
        //   with the following content: `[1, 2, 3]`
        // - Create an array variable named `secondArrayOfNumbers`
        //   with the following content: `[4, 5]`
        // - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
        //   elements than `firstArrayOfNumbers`
        // - Otherwise print: "firstArrayOfNumbers is the longer one"

        /*int [] firstArrayOfNumbers = {1,2,3};
        int [] secondArrayOfNumbers = {4,5};

        if(firstArrayOfNumbers.length > secondArrayOfNumbers.length){
            System.out.println("firsArrayOfNumbers is longer");
        }
        else{
            System.out.println("secondArrayOfNumbers is longer");
        }*/

        //Task SumElements
        // - Create an array variable named `numbers`
        //   with the following content: `[54, 23, 66, 12]`
        // - Print the sum of the second and the third element

        /*int [] numbers = {54,23,66,12};
        System.out.println(numbers[1]+numbers[2]);*/

        //Task ChangeElement
        // - Create an array variable named `numbers`
        //   with the following content: `[1, 2, 3, 8, 5, 6]`
        // - Change the value of the fourth element (8) to 4
        // - Print the fourth element
        /*int numbers[] = {1,2,3,8,5,6};
        numbers[3] = 4;
        System.out.println(numbers[3]);*/

        //Task Increment Element
        // - Create an array variable named `numbers`
        //   with the following content: `[1, 2, 3, 4, 5]`
        // - Increment the third element
        // - Print the third element

        /*int []numbers = {1,2,3,4,5};
        numbers[2] += 1;
        System.out.println(numbers[2]);*/

        //Task PrintElements
        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print all the elements of `numbers`
        /*int []numbers = {4,5,6,7};
        System.out.println(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(Arrays.toString(numbers));*/


        //Task Colors
        // - Create a two dimensional array
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`

        /*String [][]colors = {{"lime", "forest green", "olive", "pale green", "spring green"},
                           {"orange red", "red", "tomato"},
                           {"orchid", "violet", "pink", "hot pink"}};

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++){
                System.out.println(colors[i][j]);
            }
        }*/

        //Task Matrix
        // - Create a two dimensional array dynamically with the following content.
        //   Note that a two dimensional array is often called matrix if every
        //   internal array has the same length.
        //   Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        //   Its length should depend on a variable
        //
        // - Print this two dimensional array to the output

       /* System.out.println("Input matrix length");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int []matrix;

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if(i == j){
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }
            System.out.println();
        }*/










    }
}
