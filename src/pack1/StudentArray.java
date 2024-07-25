package pack1;

public class StudentArray {

	public static void main(String[] args) {

		Student students[] = new Student[5];

		students[0] = new Student(111, "Pankaj", 90.00f);
		students[1] = new Student(112, "Aditya", 91.00f);
		students[2] = new Student(113, "Raj", 92.00f);
		students[3] = new Student(114, "Tanmay", 93.00f);
		students[4] = new Student(115, "Nayan", 89.00f);

		System.out.println("Students Details");
		for (int i = 0; i < students.length; i++) {
			System.out.println("RollNo : " + students[i].getRollNo());
			System.out.println("Student Name : " + students[i].getName());
			System.out.println("Percentage : " + students[i].getPercentage());

			System.out.println("------------------------------");
		}
 
	}

}
/*
 * ctrl + alt + down --- copy line down 
 * ctrl + alt + up --- copy line up
 * alt + down --- line down
 * alt + up --- line up
 * ctrl + D ---- line delete
 * ctrl + / ----- single line comment
 * ctrl + shift + / --- multi line comment
 */

