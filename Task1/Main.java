package Task1;

import java.io.IOException;
import java.text.ParseException;


public class Main {
    
    public static void main(String[] args) throws IOException, ParseException {
        AddTask addTask = new AddTask();
        addTask.fillTask();
        addTask.outputToCsvFile("Task1/Test", addTask.getTask());
        
        ReadingFile abc = new ReadingFile();
        System.out.println(abc.inputFile("Task1/Test.csv"));
    
    }
}