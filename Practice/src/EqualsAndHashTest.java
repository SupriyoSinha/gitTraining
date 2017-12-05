
public class EqualsAndHashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1=new Student(1,"Supriyo");
    Student s2=new Student(1,"Supriyo");
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s1.equals(s2));
	}

}
