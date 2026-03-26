public class nestif
{
  public static void main(String[] args)
  {
   int a = 20;
   String voterid ="yes";

   if(a>=18)
    {
      System.out.print("18 age above, ");
	if(voterid=="yes"){
		System.out.println("and has voter id so eligible");
	}
	else{
		System.out.println("but not have voter id not eligible");
	}
     }
     else 
    {
      System.out.println("18 age less then not eligible for vote");
     }
   }
}