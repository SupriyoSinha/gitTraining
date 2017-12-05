
public class Student {
int rollNo;
String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int i, String string) {
		this.rollNo=i;
		this.name=string;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
		return result;
	}

	
}
