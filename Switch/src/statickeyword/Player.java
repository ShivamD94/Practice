package statickeyword;

public class Player {

  int id;
  String name;
  static int playerCounter=0;
  
  Player(String name)
  {
	  this.name=name;
	  id=++playerCounter;
  }
void Print()
{System.out.println("Id="+id+" "+name);}
}
