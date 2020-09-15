
import java.util.ArrayList;


public class Elevator extends Thread {

    public ArrayList<Passenger>[]stages=new ArrayList[3];
    public int []pietro_id=new int [4];
    int aktualne_pietro;
    int id;
    boolean direction;
    int licznik=0;
    int waiting=0;



    public Elevator(ArrayList<Passenger>[] stages, int pietro, int id, boolean direction, int[]pietro_id) {
        this.stages=stages;
        this.aktualne_pietro=pietro;
        this.id=id;
        this.direction=direction;
        this.pietro_id=pietro_id;

    }
    public void run() {
        while(!Thread.currentThread().isInterrupted()) {
            synchronized (Map.class) {
                synchronized (this) {

                    if (id == 1) {
                        try {
                            work();
                            GUI.updateelevator(this);
                            GUI.update();
                            sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();

                        }

                    } else if (this.id == 2) {
                        try {
                            work();
                            GUI.update();
                            GUI.updateelevator_2(this);
                            sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            
                        }

                    }

                }
            }
        }
    }



    public void work() throws InterruptedException
    {
        if(this.aktualne_pietro==0) {
            this.move_start_0();
        }
        else if(this.aktualne_pietro==2){
            this.move_start_2();
        }
        else if(this.aktualne_pietro==1 && direction==true) {

            this.aktualne_pietro=2;
            this.licznik++;
            this.stages[2]=this.stages[1];
            this.stages[1]=null;
            this.waiting=0;
            System.out.println("Elevator's number"+this.id+" on level 2");

        }
        else if (this.aktualne_pietro==1 && direction ==false) {
            this.licznik++;
            this.aktualne_pietro=0;
            this.stages[0]=this.stages[1];
            stages[1]=null;
            this.waiting=0;
            System.out.println("Elevator's number "+this.id+" on level 0");

        }
    }


    public synchronized void move_start_2() throws InterruptedException {

        if(licznik==2) {
            ArrayList<Passenger>pomocna=this.stages[2];
            for(int i=0;i<pomocna.size();i++)
            {
                pomocna.get(i).floor=2;
                Map.movetospacerowniamap_2(pomocna.get(i), this,i);

            }

            System.out.println("Elevator's  number:  "+this.id+" unpacked people on ground floor walker");
            if(this.stages[2].isEmpty()==true) {
                this.stages[2]=null;
                this.stages[2]=new ArrayList<Passenger>();
                this.direction=false;
                this.licznik=0;
                this.waiting=0;

            }
        }
        else if( this.if_fully(this)==false && this.waiting<3) {
            Map.add_passenger_2(this);
            this.waiting++;
        }
        else if(this.waiting>=3) {
            this.aktualne_pietro=1;
            this.licznik++;
            this.stages[1]=this.stages[2];
            this.stages[2]=new ArrayList<Passenger>();
            this.waiting=0;
            System.out.println("Elevator's  number: "+this.id+" go on level 1");
        }

        else if(this.if_fully(this)==true && this.licznik<2) {
            this.aktualne_pietro=1;
            this.licznik++;
            this.stages[1]=this.stages[2];
            this.stages[2]=new ArrayList<Passenger>();
            this.waiting=0;
            System.out.println("Elevator's  number: "+this.id+" go on level 1");
        }

    }

    public synchronized void move_start_0() throws InterruptedException {

        if(licznik==2)
        {
            ArrayList<Passenger>pomocna=this.stages[0];
            for(int i=0;i<pomocna.size();i++)
            {
                pomocna.get(i).floor=0;
                Map.movetospacerowniamap_0(pomocna.get(i), this,i);

            }
            if(this.stages[0].isEmpty()==true) {
                System.out.println("Elevator's  number: "+this.id+" unpacked people on ground floor walker");
                this.stages[0]=null;
                this.stages[0]=new ArrayList<Passenger>();
                this.direction=true;
                this.licznik=0;
                this.waiting=0;
            }

        }
        else if( this.if_fully(this)==false && this.waiting<3) {
            Map.add_passenger_0(this);
            this.waiting++;
        }
        else if(this.waiting>=3) {
            this.aktualne_pietro=1;
            this.licznik++;
            this.stages[1]=this.stages[0];
            this.stages[0]=new ArrayList<Passenger>();
            this.waiting=0;
            System.out.println("Elevator's  number: "+this.id+" go to level 1");
        }
        else if(this.if_fully(this)==true && this.licznik<2) {
            this.aktualne_pietro=1;
            this.licznik++;
            this.stages[1]=this.stages[0];
            this.stages[0]=new ArrayList<Passenger>();
            this.waiting=0;
            System.out.println("Elevator's  number: "+this.id+" go to level 1");
        }

    }

    public boolean if_fully(Elevator e) {
        int licznik=0;
        for(int i=0;i<4;i++) {
            if(e.pietro_id[i]!=0) {
                licznik++;
            }
        }
        if(licznik==4) {
            return true;
        }
        else {
            return false;
        }
    }


}

