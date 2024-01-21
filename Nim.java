import java.util.Arrays;
import java.util.*;
import java.util.Random;

class Nim {

  public static int[] methodRandom(int[] row1, int[] row2, int[] row3, int[] row4) {

    int[][] listOfArrays = { row1, row2, row3, row4 };
    Random rand = new Random();
    int[] randomArray = null;
    int randomRow = 0;
    int j;
    int sum = 0;

    while (sum <= 0) {
      randomRow = rand.nextInt(listOfArrays.length);
      randomArray = listOfArrays[randomRow];
      sum = 0; // Reset the sum for each new randomArray

      for (j = 0; j < randomArray.length; j++) {
        sum += randomArray[j];
      }
    }
    // Select an array with at least 1 stick. The sum of all ones in a array gotta
    // be greater than 0.

    int rowNum = randomRow + 1;
    int length = 0;

    for (int i = 0; i < randomArray.length; i++) { // Count the sticks are in the array
      if (randomArray[i] == 1) {
        length++;
      }
    }

    int randomOnes = 1 + rand.nextInt((length - 1) + 1);
    System.out.println("Computer removed " + randomOnes + " sticks from row " + rowNum);

    for (int i = randomArray.length - 1; 1 <= randomOnes; i--) {

      if (randomArray[i] == 1) {
        randomArray[i] = 0;
        randomOnes--;
      }
    }
    return randomArray;
  }

  public static int[] methodRow1(int[] row1, int[] row2, int[] row3, int[] row4) {

    int[][] list = { row1, row2, row3, row4 };
    int k = 0;

    for (k = 0; k < list.length; k++) {
      System.out.println(Arrays.toString(list[k]));
    }

    Scanner numOfOnes = new Scanner(System.in);
    // System.out.print("How many sticks do you want to remove?:  ");
    int remove = 0;
    while (remove != 1) {
      System.out.println("1 sticks available");
      System.out.print("How many sticks do you want to remove?:  ");
      remove = numOfOnes.nextInt();
      if (remove != 1) {
        System.out.println(remove+" can not be remove :(");
      }
    }

    for (int i = row1.length - 1; 0 < remove; i++) {
      if (row1[i] == 1) {
        row1[i] = 0;
        remove--;
      }
    }
    return row1;
  }

  public static int[] methodRow2(int[] row1, int[] row2, int[] row3, int[] row4) {

    int[][] list = { row1, row2, row3, row4 };
    int k = 0;

    for (k = 0; k < list.length; k++) {
      System.out.println(Arrays.toString(list[k]));
    }
    Scanner numOfOnes = new Scanner(System.in);
    int remove = 5;

    while (remove > Arrays.stream(row2).sum() || remove <= 0) {
      System.out.println(Arrays.stream(row2).sum() + " sticks available");
      System.out.print("How many sticks do you want to remove?:  ");
       remove = numOfOnes.nextInt();
      if (remove > Arrays.stream(row2).sum() || remove < 1){
      System.out.println(remove+" can not be remove :(");
      }
    }


    for (int i = row2.length - 1; 0 < remove; i--) {
      if (row2[i] == 1) {
        row2[i] = 0;
        remove--;
      }
    }
    return row2;
  }

  public static int[] methodRow3(int[] row1, int[] row2, int[] row3, int[] row4) {

    int[][] list = { row1, row2, row3, row4 };
    int k = 0;

    for (k = 0; k < list.length; k++) {
      System.out.println(Arrays.toString(list[k]));
    }
    Scanner numOfOnes = new Scanner(System.in);
    int remove = 6;
    while (remove > Arrays.stream(row3).sum() || remove <= 0) {
      System.out.println(Arrays.stream(row3).sum() + " sticks available");
      System.out.print("How many sticks do you want to remove?:  ");
      remove = numOfOnes.nextInt();
      if (remove > Arrays.stream(row3).sum() || remove < 1){
      System.out.println(remove+" can not be remove :(");
      }

    }


    for (int i = row3.length - 1; 0 < remove; i--) {
      if (row3[i] == 1) {
        row3[i] = 0;
        remove--;
      }
    }
    return row3;
  }

  public static int[] methodRow4(int[] row1, int[] row2, int[] row3, int[] row4) {

    int[][] list = { row1, row2, row3, row4 };
    int k = 0;

    for (k = 0; k < list.length; k++) {
      System.out.println(Arrays.toString(list[k]));
    }
    Scanner numOfOnes = new Scanner(System.in);
    int remove = 8;
    while (remove > Arrays.stream(row4).sum() || remove <= 0) {
      System.out.println(Arrays.stream(row4).sum() + " sticks available");
      System.out.print("How many sticks do you want to remove?:  ");
      remove = numOfOnes.nextInt();
      if (remove > Arrays.stream(row4).sum() || remove < 1){
      System.out.println(remove+" can not be remove :(");
      }

    }

    for (int i = row4.length - 1; 0 < remove; i--) {
      if (row4[i] == 1) {
        row4[i] = 0;
        remove--;
      }
    }
    return row4;
  }

  public static void main(String[] args) {

    int[] row1 = new int[] { 1 };
    int[] row2 = new int[] { 1, 1, 1 };
    int[] row3 = new int[] { 1, 1, 1, 1, 1 };
    int[] row4 = new int[] { 1, 1, 1, 1, 1, 1, 1 };
    int[][] list = { row1, row2, row3, row4 };
    int player = 0;
    int computer = 0;
    int i = 0;

    for (i = 0; i < list.length; i++) {
      System.out.println(Arrays.toString(list[i]));
    }

    while (Arrays.stream(row1).sum() + Arrays.stream(row2).sum() + Arrays.stream(row3).sum()
        + Arrays.stream(row4).sum() != 0) {

      Scanner row = new Scanner(System.in);
      System.out.print("Select an row: ");
      int rowNum = row.nextInt();

      if (rowNum == 2 && Arrays.stream(row2).sum() > 0) {
        row2 = methodRow2(row1, row2, row3, row4);
        player++;
        i = 0;
        for (i = 0; i < list.length; i++) {
          System.out.println(Arrays.toString(list[i]));
        }

        if (Arrays.stream(row1).sum() + Arrays.stream(row2).sum() + Arrays.stream(row3).sum()
            + Arrays.stream(row4).sum() != 0) {
          computer++;
          methodRandom(row1, row2, row3, row4);
          i = 0;
          for (i = 0; i < list.length; i++) {
            System.out.println(Arrays.toString(list[i]));
          }
        }
      }
      if (Arrays.stream(row2).sum() == 0 && rowNum == 2) {
        System.out.println("row 2 has no sticks left.");

      } else if (rowNum == 3 && Arrays.stream(row3).sum() > 0) {
        player++;
        row3 = methodRow3(row1, row2, row3, row4);
        i = 0;
        for (i = 0; i < list.length; i++) {
          System.out.println(Arrays.toString(list[i]));
        }

        if (Arrays.stream(row1).sum() + Arrays.stream(row2).sum() + Arrays.stream(row3).sum()
            + Arrays.stream(row4).sum() != 0) {
          computer++;
          methodRandom(row1, row2, row3, row4);
          i = 0;
          for (i = 0; i < list.length; i++) {
            System.out.println(Arrays.toString(list[i]));
          }
        }
      }
      if (Arrays.stream(row3).sum() == 0 && rowNum == 3) {
        System.out.println("row 3 has no sticks left.");

      } else if (rowNum == 1 && Arrays.stream(row1).sum() > 0) {
        player++;
        row1 = methodRow1(row1, row2, row3, row4);
        i = 0;

        for (i = 0; i < list.length; i++) {
          System.out.println(Arrays.toString(list[i]));
        }

        if (Arrays.stream(row1).sum() + Arrays.stream(row2).sum() + Arrays.stream(row3).sum()
            + Arrays.stream(row4).sum() != 0) {
          computer++;
          methodRandom(row1, row2, row3, row4);
          i = 0;
          for (i = 0; i < list.length; i++) {
            System.out.println(Arrays.toString(list[i]));
          }
        }
      }
      if (Arrays.stream(row1).sum() == 0 && rowNum == 1) {
        System.out.println("row 1 has no sticks left");

      } else if (rowNum == 4 && Arrays.stream(row4).sum() > 0) {
        player++;
        row4 = methodRow4(row1, row2, row3, row4);
        i = 0;
        for (i = 0; i < list.length; i++) {
          System.out.println(Arrays.toString(list[i]));
        }

        if (Arrays.stream(row1).sum() + Arrays.stream(row2).sum() + Arrays.stream(row3).sum()
            + Arrays.stream(row4).sum() != 0) {
          computer++;
          methodRandom(row1, row2, row3, row4);
          i = 0;
          for (i = 0; i < list.length; i++) {
            System.out.println(Arrays.toString(list[i]));
          }
        }
      }
      if (Arrays.stream(row4).sum() == 0 && rowNum == 4) {
        System.out.println("row 4 has no sticks left");
      }
    }
    if (player > computer)
      System.out.println("Computer: Sorry.. I won!");
    else
      System.out.println("You win");
  }
}

