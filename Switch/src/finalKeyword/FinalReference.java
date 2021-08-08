package finalKeyword;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinalReference {

	final List foo;
	public FinalReference() {
	    foo=new ArrayList<String>();
		foo.add("foo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          FinalReference f1=new FinalReference();
          f1.foo.add("bar");
          System.out.println(f1.foo);
  //        Scanner sc=new Scanner(new File("/Switch/files/SAPIENS.postman_collectio.json"));
	}

}
