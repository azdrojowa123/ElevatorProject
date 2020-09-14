
import java.util.Objects;
import java.util.Random;


public class Passenger extends Thread {

    public int floor;
    public char place;
    int number;

    public int id;
    private Map m;


    public Passenger(int floor,char place,int number,Map m) {

        this.floor=floor;
        this.place=place;
        this.number=number;
        this.m=m;
        this.id=(int)(Math.random()*(99 - 5));


    }
    public void run() {
        while(!Thread.currentThread().isInterrupted()) {
            try {
                synchronized(m) {
                    synchronized(this)
                    {
                        work();
                        GUI.update();
                        GUI.updateelevator(Map.e);
                        GUI.updateelevator_2(Map.e2);
                        sleep(5000);
                    }




                }}
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }



    }
    public void work() throws InterruptedException {

        if(place=='s') {
            movetoqueue();

        }


    }
    public  void movetoqueue() throws InterruptedException {

        if(Map.space[this.floor].queue.size()<5)
        {

            Map.space[this.floor].queue.add(this);
            Map.space[this.floor].walking_area_list[this.number]=0;
            Map.space[this.floor].walking_area.remove(this);
            for(int i=0;i<5;i++) {

                if(Map.space[this.floor].queue_list[i]==0)
                {

                    Map.space[this.floor].queue_list[i]=this.id;
                    this.number=i;
                    i=10;
                }
            }
            this.place='k';
            System.out.println("Pasazer numer"+this.id+"przemiescil sie na kolejke nr"+this.number);

        }



    }

    public synchronized void movetospacerownia(Passenger p,Elevator e) throws InterruptedException{

        System.out.println("TttUU");
        for(int i=0;i<5;i++) {
            if(Map.space[p.floor].walking_area_list[i]==0) {
                System.out.println("TttUU");
                Map.space[p.floor].walking_area_list[i]=this.getid();
                Map.space[p.floor].walking_area.add(p);
                p.place='s';
                p.number=i;
                System.out.println("Pasa�er numer"+this.id+" przemie�ci� si� sie na spacerownie nr "+i+"na pietrze "+floor);
                if(e.id==1) {
                    GUI.update();
                    GUI.updateelevator(e);
                }
                else
                {
                    GUI.update();
                    GUI.updateelevator_2(e);
                }
                i=10;
            }
        }
    }

    public int getid() {
        return this.id;
    }


}

