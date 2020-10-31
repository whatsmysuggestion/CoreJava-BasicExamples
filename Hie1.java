class First1
{
	String getFirstName()
	{
		return "Venkat";
	}
	
	String getLastName()
	{
		return "Reddy";
	}
}


class Second1 extends First1
{
	String getFullName()
	{
		return getFirstName()+getLastName();
	}
}


class Third1 extends First1
{
	String getFullNameWithSal()
	{
		return "MR"+getFirstName()+getLastName();
	}
}



public class Hie1 {

	public static void main(String[] args) {
		Second1 s1=new Second1();
		System.out.println(s1.getFullName());
		
		Third1 t1=new Third1();
		System.out.println(t1.getFullNameWithSal());

	}

}
