
public class Twa {
private boolean[] array;

public Twa(int size) {
	array=new boolean[size];
}
  public void displaySeatStatus(int size){
	  for(int i=0;i<size;i++) {
		  System.out.println("Seat: "+(array[i]?"Occupied":"Unoccupied"));
	  }
  }
  
  public void reserveSeat(int seat) {
	  if(seat<0||seat>array) {
		  
	  }
  }
}
