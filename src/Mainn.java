

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Mainn  {



    public static void  main(String[] args) throws InterruptedException {
        new Mainn();
    }

    public Mainn() throws InterruptedException {


        ArrayList<Passenger>[]stages=new ArrayList[3];
        ArrayList<Passenger>[]stages_2=new ArrayList[3];

        for(int i=0;i<3;i++) {
            stages[i]=new ArrayList<Passenger>();
            stages_2[i]=new ArrayList<Passenger>();
        }
        int pietro_id[] = {0, 0, 0, 0};
        int pietro_id_2[] = {0, 0, 0, 0};
        Elevator e1=new Elevator(stages,0,1,true,pietro_id);
        Elevator e2=new Elevator(stages_2,2,2,false,pietro_id_2);
        Map map= new Map(e1, e2);
        Passenger p1=new Passenger(0,'s',1,map);
        map.add_passenger(p1);
        Passenger p2=new Passenger(0,'s',3,map);
        map.add_passenger(p2);
        Passenger p3=new Passenger(0,'k',0,map);
        map.add_passenger(p3);
        Passenger p4=new Passenger(0,'k',4,map);
        map.add_passenger(p4);
        Passenger p5=new Passenger(2,'s',3,map);
        Passenger p6=new Passenger(2,'k',3,map);
        Passenger p7=new Passenger(2,'k',2,map);
        Passenger p8=new Passenger(2,'k',1,map);
        Passenger p9=new Passenger(2,'k',0,map);
        Passenger p10=new Passenger(2,'k',4,map);
        map.add_passenger(p5);
        map.add_passenger(p6);
        map.add_passenger(p7);
        map.add_passenger(p8);
        map.add_passenger(p9);
        map.add_passenger(p10);
        GUI g=new GUI(map);
        GUI.update();
        GUI.updateelevator(Map.e);
        GUI.updateelevator_2(Map.e2);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
        p10.start();
        e1.start();e2.start();
        GUI.update();
        GUI.updateelevator(Map.e);
        GUI.updateelevator_2(Map.e2);
    }



}
