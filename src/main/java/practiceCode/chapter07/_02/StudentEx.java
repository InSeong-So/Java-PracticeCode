package practiceCode.chapter07._02;

public class StudentEx {

	public static void main(String[] args) {

		Student student = new Student("김민수", "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}
}
