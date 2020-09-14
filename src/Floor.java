

import java.util.ArrayList;

public class Floor  {


    public ArrayList<Passenger> walking_area=new ArrayList<Passenger>();
    public ArrayList<Passenger> queue=new ArrayList<Passenger>();
    public int[] walking_area_list=new int [5];
    public int[] queue_list=new int [5];

    Elevator elevator;
    Elevator elevator2;
    public int number;

    public Floor(int number, ArrayList<Passenger> walking_area,ArrayList<Passenger> queue,Elevator e,Elevator e2) {

        if(number==0 || number==2) {
            this.walking_area=walking_area;
            this.queue=queue;
            this.elevator=e;
            this.elevator2=e2;
            for(int i=0;i<5;i++) {
                walking_area_list[i]=0;
                queue_list[i]=0;
            }

        }

    }

}
