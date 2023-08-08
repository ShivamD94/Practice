package collections;

public class Stud  implements Comparable<Stud>
{
	
	 int rollno;
	String name;
	String school;
	
	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	
	
	public Stud(int r ,String name ,String school )
	{
		this.rollno=r;
		this.name=name;
		this.school=school;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.name +""+ this. rollno +" "+this. school ;
}
	
	
	  @Override public int compareTo(Stud o) { if(rollno>o.rollno) return 1; else
	  if(rollno==o.rollno) return 0; else return -1; }
	 
	  
//	  @Override public int compareTo(Stud o) {
//		  return this.name.compareTo(o.name);
//	  }
	  

	 
}
