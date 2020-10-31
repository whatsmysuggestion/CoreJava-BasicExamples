
public class NoArg {

	int display(int m)
	{
		
		if(m==1||m==0)
			return 1;
		else
			
			return(m*display(m-1));
	}
	public static void main(String[] args) {
		NoArg na=new NoArg();
		System.out.println(na.display(5));
			
	}

}
