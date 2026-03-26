class revise
{
	void bio(String name, int age)
	{
		System.out.println("name : "+name);
		System.out.println("age  : "+age);
	}

	void bio(String name, int age, String location){
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("location : "+location);
	}
}
class run{
	public static void main(String args[]){
		revise a =  new revise();
		
		a.bio("raj",12);
	}
}	

