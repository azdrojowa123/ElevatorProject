

import java.util.ArrayList;

public class Map {

    public static Floor[]space=new Floor[3];
    public static Elevator e;
    public static Elevator e2;
    public static ArrayList<Passenger> walking_area=new ArrayList<Passenger>();
    public static ArrayList<Passenger> walking_area_2=new ArrayList<Passenger>();
    public static ArrayList<Passenger> queue=new ArrayList<Passenger>();
    public static ArrayList<Passenger> queue_2=new ArrayList<Passenger>();
    public static Floor f0=new Floor(0,walking_area,queue,e,e2);
    public static Floor f1=new Floor(1,null,null,e,e2);
    public static Floor f2=new Floor(2,walking_area_2,queue_2,e,e2);


    public Map(Elevator e,Elevator e2)
    {
        space[0]=f0;
        space[1]=f1;
        space[2]=f2;

        this.e=e;
        this.e2=e2;
    }


    public Floor[] getspace(){

        return Map.space;
    }
    public static Floor getfloor(int i) {

        return space[i];
    }

    public void add_passenger(Passenger p) {


        if(p.place=='s') {
            Map.space[p.floor].walking_area_list[p.number]=p.getid();
            Map.space[p.floor].walking_area.add(p);
        }
        if(p.place=='k') {
            Map.space[p.floor].queue_list[p.number]=p.getid();
            Map.space[p.floor].queue.add(p);
        }
    }
    public synchronized static void add_passenger_0(Elevator e) {

        if(Map.space[0].queue != null) {

            if(Map.space[0].queue.isEmpty()==false) {

                System.out.println("TU");
                for(int i=0;i<Map.space[0].queue.size();i++) {
                    System.out.println("Jest do wpakowania na poziomie 0 ludzi: "+Map.space[0].queue.size());
                    if(Map.space[0].queue.get(i)!=null) {
                        for(int j=0;j<4;j++) {
                            if(e.pietro_id[j]==0)
                            {

                                e.pietro_id[j]=Map.space[0].queue.get(i).getid();
                                e.stages[0].add(Map.space[0].queue.get(i));
                                Map.space[0].queue_list[Map.space[0].queue.get(i).number]=0;
                                Map.space[0].queue.get(i).number=j;
                                Map.space[0].queue.remove(i);
                                GUI.update();
                                j=10;
                            }
                            if(e.id==1) {
                                GUI.updateelevator(Map.e);
                            }
                            else
                            {
                                GUI.updateelevator_2(Map.e2);
                            }



                        }}}}}}

    public synchronized static void add_passenger_2(Elevator e) {

        if(Map.space[2].queue.isEmpty()==false) {
            for(int i=0;i<Map.space[2].queue.size();i++) {
                if(Map.space[2].queue.get(i)!=null) {
                    for(int j=0;j<4;j++) {
                        if(e.pietro_id[j]==0)
                        {
                            e.pietro_id[j]=Map.space[2].queue.get(i).getid();

                            e.stages[2].add(Map.space[2].queue.get(i));
                            Map.space[2].queue_list[Map.space[2].queue.get(i).number]=0;
                            Map.space[2].queue.get(i).number=j;
                            Map.space[2].queue.remove(i);

                            GUI.update();
                            if(e.id==1) {
                                GUI.updateelevator(Map.e);
                            }
                            else
                            {
                                GUI.updateelevator_2(Map.e2);

                            }
                            j=10;
                        }




                    }}}}}

    public static void movetospacerowniamap_0(Passenger p,Elevator e,int l) {
        System.out.println("TttUU");
        for(int i=0;i<5;i++) {
            if(Map.space[p.floor].walking_area_list[i]==0) {
                System.out.println("TttUU");
                Map.space[p.floor].walking_area_list[i]=p.getid();
                Map.space[p.floor].walking_area.add(p);
                e.pietro_id[p.number]=0;
                p.place='s';
                p.number=i;
                e.stages[0].remove(l);
                System.out.println("Pasa�er numer"+p.id+" przemie�ci� si� sie na spacerownie nr "+i+"na pietrze "+p.floor);
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
        }}

    public static void movetospacerowniamap_2(Passenger p,Elevator e,int l) {
        System.out.println("TttUU");
        for(int i=0;i<5;i++) {
            if(Map.space[p.floor].walking_area_list[i]==0) {
                System.out.println("TttUU");
                Map.space[p.floor].walking_area_list[i]=p.getid();
                Map.space[p.floor].walking_area.add(p);
                e.pietro_id[p.number]=0;
                p.place='s';
                p.number=i;
                e.stages[2].remove(l);
                System.out.println("Pasa�er numer"+p.id+" przemie�ci� si� sie na spacerownie nr "+i+"na pietrze "+p.floor);
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
        }}

}