//Write a java program which accept string from user and Count number of capital characters
import java.util.*;
class StringDemo
{
	 public int CountCapital(String str)
	 {
		  char Arr[]=str.toCharArray();
		  int iCount=0;
		  
		  for(int iCnt=0;iCnt<Arr.length;iCnt++)
		  {
			  if((Arr[iCnt]>='A') && (Arr[iCnt]<='Z'))
			  {
				  iCount++;
			  }  
		  }
		  return iCount;
	 }
}
public class Assignment33_1
{
      public static void main(String arg[])
      {
    	  Scanner sobj=new Scanner(System.in);
    	  
    	  System.out.println("Enter your String:");
    	    String name=sobj.nextLine();
    	    
    	  StringDemo obj=new StringDemo();
    	  int iRet= obj.CountCapital(name);
    	  System.out.println("Number of capital Character are:"+iRet);
    			  
    		sobj.close();
    	  
      }
}
