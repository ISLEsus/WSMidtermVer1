package kz.iitu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

@WebService
@Component("scheduler")
public class Scheduler {

    @Autowired
    @Qualifier("schedulerSubjects")
    private List<Subject> subjects;

    @WebMethod
    public void showMenu() {
        Boolean IsDisplayed = true;
        while(IsDisplayed) {
            System.out.println("\n1. Display subjects by Day");
            System.out.println("2. Display subjects by Teacher");
            System.out.println("3. Display subjects by Student Group");
            System.out.println("4. Exit");
            System.out.println("\nPlease enter your choice: ");

            Scanner scanner = new Scanner(System.in);
            Integer choice = scanner.nextInt();

            if (choice == 1) {
                //DISPLAY SUBJECTS BY DAY
                System.out.println("Please enter a day (Monday, Tuesday, etc):");
                String query = scanner.next();
                //check if query = a day of the week; throw exception if failed.
                System.out.println("Displaying " + query + " subjects...");

                Integer counter = 0;
                for (Subject subject : subjects){
                    //System.out.println("Check if " + query + " equals to " + subject.getSubjectDay());
                    if (Objects.equals(query, subject.getSubjectDay())) {
                        subject.Display();
                        counter++;
                    }
                }
                //check if counter > 0; throw exception if failed.
                System.out.println("There are a total of " + counter + " subjects on " + query +"s");
            }

            else if (choice == 2) {
                //DISPLAY SUBJECTS BY TEACHER
                System.out.println("Please enter the Teacher's name:");
                String query = scanner.next();
                System.out.println("Displaying subjects taught by " + query + "...");

                Integer counter = 0;
                for (Subject subject : subjects){
                    if (Objects.equals(query, subject.getSubjectTeacher())) {
                        subject.Display();
                        counter++;
                    }
                }
                //check if counter > 0; throw exception if failed.
                System.out.println("There are a total of " + counter + " subjects taught by " + query);
            }

            else if (choice == 3) {
                //DISPLAY SUBJECTS BY STUDENT GROUP
                System.out.println("Please enter the Group's name:");
                String query = scanner.next();
                System.out.println("Displaying subjects studied by " + query + "...");

                Integer counter = 0;
                for (Subject subject : subjects){
                    if (Objects.equals(query, subject.getSubjectGroup())) {
                        subject.Display();
                        counter++;
                    }
                }
                //check if counter > 0; throw exception if failed.
                System.out.println("There are a total of " + counter + " subjects studied by " + query);
            }

            else if (choice == 4) {
                //EXIT
                IsDisplayed = false;
                System.out.println("Exiting menu...");
            }
        }
    }
}
