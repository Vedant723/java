package dkte.com;

public class Student {

	int rollno;
	String name;
	double marks;
	Student(int rollno,String name,double marks){
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	public int getRollNo() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public double getMarks() {
		return marks;
	}
	public void displayDetails() {
		System.out.println("Roll No: " + rollno +
							" Name: " + name +
							" Marks: " + marks) ;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
