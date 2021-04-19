package org.college;

public class College {

	private void collegeName() {
		System.out.println("The college name is : TVASC ");

	}

	private void collegeCode() {
		System.out.println("The college code is : TVA");
	}

	private void collegeRank() {
		System.out.println("The college Rank is : 1ST ");
	}

	public static void main(String[] args) {

		College co = new College();
		co.collegeName();
		co.collegeCode();
		co.collegeRank();

		Student st = new Student();
		st.studentName();
		st.studentId();
		st.studentDept();

		Hostel ho = new Hostel();
		ho.hostelName();

		Dept de = new Dept();
		de.deptName();
	}
}
