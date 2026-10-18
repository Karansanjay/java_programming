import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in 3 subjects: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a + b + c;
        double average = total / 3.0;

        System.out.println("Student: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (average >= 90)
            System.out.println("Grade: A");
        else if (average >= 75)
            System.out.println("Grade: B");
        else if (average >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");

        sc.close();
    }
}
