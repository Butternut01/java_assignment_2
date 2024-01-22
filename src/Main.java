import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import models.AbstractPerson;
import models.Employee;
import models.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Asanali", "Bayadilov", 2.89);
        Student s2 = new Student("Asylzhan", "Tattibek", 3.2);
        Student s3 = new Student("Zharkyn", "Abakov", 2.37);
        Employee e1 = new Employee("Alibek", "Bolatbekov", "IT manager", 400000);
        Employee e2 = new Employee("Adilzhan", "Tursunov", "Frontend", 500000);
        Employee e3 = new Employee("Miras", "Akram", "Data scientist", 900000);
        ArrayList<AbstractPerson> people = new ArrayList<>();
        people.add(s1);
        people.add(s2);
        people.add(s3);
        people.add(e1);
        people.add(e2);
        people.add(e3);
        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<AbstractPerson> people){
        for(AbstractPerson person: people){
            printPersonInfo(person);
        }
    }

    public static void printPersonInfo(AbstractPerson person){
        System.out.println(person.toString() + " earns " + person.getPaymentAmount());
    }
}