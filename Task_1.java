package HW_2;

/**
 * 1. Создать метод, который проверяет, является ли строка палиндромом.
 */

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        try (Scanner getStr = new Scanner(System.in)) {
            System.out.print("Введите несколько символов: ");
            String str = getStr.nextLine();  
            System.out.println(str);

            char[] array = str.toCharArray();

            if (isPalindrom(array) == true){
            System.out.println("Это палиндром");
            }
            else {
                System.out.println("Это НЕпалиндром"); 
            }
        }
    }
        public static boolean isPalindrom(char[] str){
            int i = 0;
            int j = str.length - 1;
            while (j > i) {
                if (str[i] != str[j]) {
                    return false;
                }
                ++i;
                --j;
            }
            return true;
        }
    }



    
    
    

