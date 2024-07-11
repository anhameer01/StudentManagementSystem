package projects;
import java.util.*;

interface innerStudent{
    void name();
    void dep_name();
    void roll_no();
}
class Student  implements innerStudent{
    Scanner s=new Scanner(System.in);
    public void name(){
        System.out.println("enter your name");
        String name=s.next();
		//System.out.println(name);

    }
    public void dep_name(){
        System.out.println("enter your dep ");
        String dep=s.next();
    }
    public void roll_no(){
        System.out.println("enter your roll no ");
		int rol=s.nextInt();
    }
}
/**
 * InnerSMS
 */
interface Marks{

    void sub();
    void cal_your_per();
}
class studentMarks extends Student implements Marks {

    public void sub(){
        System.out.println("enter your marks");
    }
    public void cal_your_per()
	{
		int p=s.nextInt();
        int c=s.nextInt();
        int m=s.nextInt();
		System.out.println("\nMarks are:\n");
		System.out.println("Physics:"+p);
		System.out.println("Chemistry:"+c);
		System.out.println("Maths:"+m);
		
	
    int m1=((p+c+m)*100)/300;
		if(m1>85&&m1<100)
		{
			System.out.println("A\n");
		}
		else if(m1>70&&m1<85)
		{
			System.out.println("B\n");
		}
		else if(m1>50&&m1<70)
		{
			System.out.println("good");
		}
		else if(m1>30&&m1<50)
		{
			System.out.println("pass");
		}
		else if(m1>0&&m1<30)
		{
			System.out.println("Fail");
		}
		else 
		{
			System.out.println("Invalid");
		}
    }
}
public class SMS {
    public static void main(String[] args) {
		studentMarks obj=new studentMarks();
		obj.name();
		obj.dep_name();
		obj.roll_no();
		obj.sub();
		obj.cal_your_per();
	}
}
