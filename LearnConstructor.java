package Week3.Day3;

public class LearnConstructor {
	int num;
	String a;
	boolean x;
	LearnConstructor()
	{	
		this("name3");
		System.out.println("Iam a Default Constructor");
		System.out.println(num);
		System.out.println(a);
		System.out.println(x);
	}
	LearnConstructor(String name)
	{
		System.out.println(name);
	}
	LearnConstructor(String name,int id)
	{
		System.out.println(name);
		System.out.println(id);
	}
	public static void main(String[] args) {
		//LearnConstructor o = new LearnConstructor("Name1");
		LearnConstructor obj = new LearnConstructor("Name2",4);
		LearnConstructor o1= new LearnConstructor();
		
	}
	

}
