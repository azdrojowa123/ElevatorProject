
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

        while (!Thread.currentThread().isInterrupted()) {
            synchronized (m) {
                synchronized (this) {
                    try {
                        work();
                        GUI.update();
                        GUI.updateelevator(Map.e);
                        GUI.updateelevator_2(Map.e2);
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
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
                    GUI.update();
                    break;

                }
            }
            this.place='k';

            System.out.println("Passenger number "+this.id+" go to queue");

        }



    }

    public void movetospacerownia(Passenger p,Elevator e) throws InterruptedException{

        for(int i=0;i<5;i++) {
            if(Map.space[p.floor].walking_area_list[i]==0) {
                Map.space[p.floor].walking_area_list[i]=this.getid();
                Map.space[p.floor].walking_area.add(p);
                p.place='s';
                p.number=i;

                System.out.println("Passenger number "+this.id+" go to walker on floor "+floor);
                if(e.id==1) {
                    GUI.update();
                    GUI.updateelevator(e);
                }
                else
                {
                    GUI.update();
                    GUI.updateelevator_2(e);
                }
                break;
            }
        }
    }

    public int getid() {
        return this.id;
    }


}

