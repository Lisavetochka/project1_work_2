package laba2;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        System.out.print("Введіть кількість чисел в масиві: ");
        Scanner sc = new Scanner(System.in, "cp1251");
        try {
            int num = Integer.parseInt(sc.next()); //checking for type int
            if (num >0) {
                int[] myArray = new int[num];
                System.out.println("Заповніть масив числами:");
                for (num = 0; num < myArray.length; num++) {
                    myArray[num] = Integer.parseInt(sc.next()); //checking for type int
                    // fill array from keyboard
                }
                System.out.print("\nОтриманий масив:");
                for (num = 0; num < myArray.length; num++) {
                    System.out.print(myArray[num] + " "); // Displaying the resulting array
                }

                int indMax = 0;
                int max = myArray[indMax];
                try {
                    for (int i = 0; i < myArray.length; i++) { //finding the maximum number that is divisible by 3
                        if ( myArray[i] > max  && myArray[i] % 3 == 0  ) {
                            max = myArray[i];
                            indMax = i;

                        } else if ( myArray[i] > max && myArray[i] % 3 != 0) { //if there is no number in the array that is divisible by 3
                            throw new Error("\nВ масиві немає числа, яке кратне 3.");
                        }
                    }System.out.print("\nМаксимальне число: " + max + ", a його індекс: " + indMax);

                } catch (Error e) { //caught an error when there is no number divisible by 3 in the array
                    System.out.println("\n\n!!!Помилка. Перезапустіть програму " + e);
                }
            }else throw new Exception ("Кількість елементів в масиві не може бути від'ємною.");
        } catch (NumberFormatException e ){ //caught error when user enters letters instead of numbers
            System.out.print("\n!!!Помилка, ви ввели некоректні дані. Перезапустіть програму. \nІнформація про помилку: \n"+ e);
        } catch (Exception e){ //caught an error when the user entered a negative number of elements in the array
            System.out.print("\n!!!Помилка. Перезапустіть програму. Інформація про помилку: \n"+ e);}

    }
}
