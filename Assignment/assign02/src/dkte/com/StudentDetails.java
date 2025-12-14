package dkte.com;
import java.util.*;
public class StudentDetails {
    public static void main(String[] args) {
        List<Student>list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Search Student by Roll No");
            System.out.println("4.Sort by Roll No");
            System.out.println("5.Sort by Name");
            System.out.println("6.Sort by Marks");
            System.out.println("0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter roll no: ");
                    int rn = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String nm = sc.nextLine();
                    System.out.print("Enter marks: ");
                    double mrks=sc.nextDouble();
                    list.add(new Student(rn,nm,mrks));
                    System.out.println("Student Added");
                    break;
                case 2:
                    for (Student s:list)
                        s.displayDetails();
                    break;
                case 3:
                    System.out.print("Enter roll no: ");
                    int rollSearch=sc.nextInt();
                    boolean found = false;
                    for (Student s:list) {
                        if (s.getRollNo()==rollSearch) {
                            s.displayDetails();
                            found=true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Student not found");
                    break;
                case 4:
                    Collections.sort(list,Comparator.comparingInt(Student::getRollNo));
                    System.out.println("Sorted by Roll No");
                    System.out.println(list.toString());
                    break;
                case 5:
                    Collections.sort(list,Comparator.comparing(Student::getName));
                    System.out.println("Sorted by Name");
                    System.out.println(list.toString());
                    break;
                case 6:
                    Collections.sort(list,Comparator.comparingDouble(Student::getMarks));
                    System.out.println("Sorted by Marks");
                    System.out.println(list.toString());
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }while(choice!=0);
    }
}