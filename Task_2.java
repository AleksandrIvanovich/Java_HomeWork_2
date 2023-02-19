/*
 * 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
 */

package HW_2;

import java.io.*;

public class Task_2 {
   
    public static void main(String[] args) {
        String line = "empty";
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);

            if (file.createNewFile()) {
                System.out.println("Файл создан");
            }
            else {
                System.out.println("Такой файл уже существует");
                // FileWriter fileWriter = new FileWriter(file, true); // true - добавляет в файл
                FileWriter fileWriter = new FileWriter(file, false); // false - перезаписывает файл

                fileWriter.append(System.lineSeparator());
                int n = 1;
                int i = 0;
              while (i < 100) {
                // fileWriter.write("TEST" + n + " \n"); // Запись на новой строке
                fileWriter.append("TEST" + n + " "); // Запись в одну строку
                i ++;
                n ++;
              }
                
                // fileWriter.flush();
                fileWriter.close();
              
            }
        } catch (Exception e) {
          
        } finally {
            System.out.println(line);
        }
    }
}

        

