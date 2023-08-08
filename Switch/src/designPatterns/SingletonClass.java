package designPatterns;

public class SingletonClass {

	


		private SingletonClass(){}

		public static SingletonClass singletonIns=null;

		public static SingletonClass getSingletonInstace()
		{
		      if(singletonIns==null)
			  {
			       singletonIns=new SingletonClass();
			  } return singletonIns ;
		}

		public static void main(String Args[])
		  {
		  
			SingletonClass sc1= SingletonClass.getSingletonInstace();
			System.out.println(sc1);
			SingletonClass sc2 = SingletonClass.getSingletonInstace();
			System.out.println(sc2);
		  }
		
}
