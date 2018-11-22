import java.util.*;

class Student implements Comparable {
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}

    @Override
    public String toString() {
        return fname;
    }

    public int compareTo(Object obj) {
        Student s = (Student) obj;

        if(this.getCgpa() != s.getCgpa()) return this.getCgpa() - s.getCgpa() > 0 ? -1 : 1;

        if(this.getFname() != s.getFname()) return this.getFname().compareTo(s.getFname()) > 0 ? 1 : -1;

        return this.getId() - s.getId();
    }
}

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

        Collections.sort(studentList);

      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}