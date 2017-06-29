import java.util.Scanner;

public class Student {
	public String id;
	public String name;
	public String score;

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Student peter = new Student();
		System.out.println("請輸入學生Peter的學號:");
		peter.id = scanner.nextLine();
		System.out.println("請輸入學生Peter的姓名:");
		peter.name = scanner.nextLine();
		System.out.println("請輸入學生Peter的分數:");
		peter.score = scanner.nextLine();

		System.out.println("Peter的學號:");
		System.out.println(peter.id);
		System.out.println("Peter的姓名:");
		System.out.println(peter.name);
		System.out.println("Peter的分數:");
		System.out.println(peter.score);

		Student mary = new Student();
		System.out.println("請輸入學生Mary的學號:");
		mary.id = scanner.nextLine();
		System.out.println("請輸入學生Mary的姓名:");
		mary.name = scanner.nextLine();
		System.out.println("請輸入學生Mary的分數:");
		mary.score = scanner.nextLine();

		System.out.println("Mary的學號:");
		System.out.println(mary.id);
		System.out.println("Mary的姓名:");
		System.out.println(mary.name);
		System.out.println("Mary的分數:");
		System.out.println(mary.score);
		scanner.close();
	}
}
