package Task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class AddTask {
    ArrayList<SingleRow> task = new ArrayList<>();

    public ArrayList<SingleRow> getTask() {
        return task;
    }

    public void setTask(ArrayList<SingleRow> task) {
        this.task = task;
    }
    
    public void fillTask() {
        ArrayList<SingleRow> task = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        SingleRow singleRow = new SingleRow();
        Date start = new Date();
        singleRow.setStartDateTime(start);
        System.out.println("¬ведите фамилию: ");
        singleRow.setSurname(in.nextLine());
        System.out.println("¬ведите им€: ");
        singleRow.setName(in.nextLine());
        System.out.println("¬ведите описание задачи: ");
        singleRow.setDescription(in.nextLine());
        System.out.println("¬ведите приоритет: ");
        singleRow.setPriority(in.nextInt());
        singleRow.createDeadline();
        System.out.println("\n");
        task.add(singleRow);
        setTask(task);
    }

    public void outputToCsvFile(String filename, ArrayList<SingleRow> n) throws IOException {
        filename = filename + ".csv";
        FileWriter fileWriter = new FileWriter(filename, true);
        for (SingleRow x : n) {
            fileWriter.write(x.getStartDateTime() + ", "+ x.getSurname() + ", " + x.getName() + ", " + 
                    x.getDescription() + ", " +x.getPriority() + ", " + x.getDeadline() + "\n");

        }
        fileWriter.flush();
        fileWriter.close();
    }
}
