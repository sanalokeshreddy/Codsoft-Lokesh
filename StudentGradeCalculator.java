import java.util.*;
public class StudentGradeCalculator
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        int i;
        float totalmarks=0, avg;
        Scanner scanner = new Scanner(System.in);
		for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           totalmarks = totalmarks + marks[i];
        }
        System.out.println("Total marks is:"+totalmarks);
        avg = ((totalmarks/6)/100)*100;
        System.out.println("Total average is:"+avg+"%");
        System.out.print("The student Grade is: ");
        if(avg>=90)
        {
            System.out.print("A*");
        }
        else if(avg>=80 && avg<90)
        {
            System.out.print("A");
        }
        else if(avg>=70 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=60 && avg<70)
        {
            System.out.print("C");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.print("D");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.print("E");
        }
        else
        {
            System.out.print("FAIL");  
        }
    }
}