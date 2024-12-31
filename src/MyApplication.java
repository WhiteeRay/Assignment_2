import models.Employee;
import models.Payable;
import models.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyApplication {
    public static void main(String[] args) {
        List<Payable> people = new ArrayList<>();
        String file = "C:\\Users\\AEI\\IdeaProjects\\Assignment_2\\src\\people.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 3) {
                    double gpa = Double.parseDouble(parts[2]);
                    people.add(new Student(parts[0], parts[1], gpa));
                } else if(parts.length==4) {
                    double salary = Double.parseDouble(parts[3]);
                    people.add(new Employee(parts[0], parts[1], parts[2], salary));
                }

            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        people.sort(new Comparator<Payable>(){
            @Override
            public int compare(Payable p1, Payable p2){
                return Double.compare(p1.getPaymentAmount(), p2.getPaymentAmount());
            }

        });

               printData(people);
    }

        public static void printData(Iterable <Payable> payables){
            int count =1;
            for(Payable payable: payables){
                if(payable instanceof Student){
                    System.out.println("Student: " + count++ + ". " + payable.toString() + " earns " + payable.getPaymentAmount() + " tenge" );
                }
                else{
                    System.out.println("Employee: " + count++ + ". " + payable.toString() + " earns " + payable.getPaymentAmount() + " tenge");

                }
            }


    }
}