
class Demo1
{
	int geta()
	{
		return 10;
	}
}
public class FunctionOverLoading extends Demo1 {
	
	float geta(int a)
	{
		return a;
	}
	
	void display()
	{
		System.out.println(geta()+geta(100));
	}
	
	public static void main(String[] args) {
		FunctionOverLoading fr=new FunctionOverLoading();
		fr.display();

	}

}
