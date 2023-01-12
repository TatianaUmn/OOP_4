package Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ReadingFile {

    public static List<SingleRow> inputFile(String filename) throws IOException, ParseException {
        // открываем файл
        BufferedReader reader = new BufferedReader(new FileReader(filename));
 
        // считываем построчно
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<SingleRow> empList = new ArrayList<>();
 
        while ((line = reader.readLine()) != null) {
            SingleRow emp = new SingleRow();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String data = scanner.next();
                SimpleDateFormat sd = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZ yyyy", Locale.ENGLISH);
                if (index == 0)
                    emp.setStartDateTime(sd.parse(data));
                else if (index == 1)
                    emp.setSurname(data);
                else if (index == 2)
                    emp.setName(data);
                else if (index == 3)
                    emp.setDescription(data);
                else if (index == 4)
                    emp.setPriority(Integer.valueOf(4));
                else if (index == 5)
                    emp.setDeadline(sd.parse(data));
                else
                    System.out.println("Некорректные данные::" + data);
                index++;
            }
            index = 0;
            empList.add(emp);
        }
        return empList;              
         
    }
    
    public void showPriority (String filename) throws IOException, ParseException {
        List <SingleRow> base = inputFile(filename);
        ArrayList <SingleRow> result = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите приоритет: 1 - низкий, 2 - средний, 3- высокий");
        int priority = input.nextInt();
        System.out.println(priority);
        for (SingleRow x:base
             ) {
            if (priority == x.getPriority()){
                result.add (x);
            }
    
        }
    }
    
}
