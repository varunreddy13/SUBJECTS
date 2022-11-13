package students;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author merry
 */
public class StudentDriver
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("students.txt"));

		while (sc.hasNext())
		{
			String id = sc.next();
			String classification = sc.nextLine();
			String name = sc.nextLine();
			double gpa = sc.nextDouble();
			Student stu = new Student(id, classification, name, gpa);
			System.out.print(stu + " ");
         System.out.printf("%-10s %2d %-10s %-10s %-10s %-10s",
            stu.getFirstName(), stu.getNameCount(), 
            stu.getName(0), stu.getName(2), stu.getName(5),
            stu.getFirstNameReversed());
			System.out.println();
		}
	}
}
