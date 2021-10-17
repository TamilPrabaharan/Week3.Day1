package week3.day1.assignments;
public class Student {
		public void studentName() {
		System.out.println("Student Name:Tamil Prabaharan");
		}
		public void studentDept() {
		System.out.println("Student Dept: MCA");
	    }
		public void studentId() {
		System.out.println("Student Id: 0154623");
    	}
		public static void main(String[] args) {
			College c=new College();
			c.collegeCode();
			c.collegeName();
			c.collegeRank();
	
			Department d=new Department();
			d.deptName();
	
			Student s=new Student();
			s.studentDept();
			s.studentId();
			s.studentName();
		}
}