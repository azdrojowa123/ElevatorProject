

import java.util.ArrayList;


import javax.swing.JFrame;
import javax.swing.JPanel;



import javax.swing.JLabel;

public class GUI extends JFrame {



    private JPanel sp_p=new JPanel();
    private JPanel ko_p=new JPanel();
    private static JLabel sp_p_0 = new JLabel("New label");
    private static JLabel sp_p_1 = new JLabel("New label");
    private static JLabel sp_p_2 = new JLabel("New label");
    private static JLabel sp_p_4 = new JLabel("New label");
    private static JLabel ko_p_0 = new JLabel("New label");
    private static JLabel ko_p_1 = new JLabel("New label");
    private static JLabel ko_p_2 = new JLabel("New label");
    private static JLabel ko_p_3 = new JLabel("New label");
    private static JLabel ko_p_4 = new JLabel("New label");
    private  static JPanel winda1_1 = new JPanel();
    private  static JLabel pietro1_1_1 = new JLabel("New label");
    private  static JLabel pietro1_1_2 = new JLabel("New label");
    private  static JLabel pietro1_1_3 = new JLabel("New label");
    private static JLabel pietro1_1_0 = new JLabel("New label");
    private static JLabel sp_p_3 = new JLabel("New label");
    private static JPanel winda1_0 = new JPanel();
    private static JLabel pietro1_0_1 = new JLabel("New label");
    private static JLabel pietro1_0_2 = new JLabel("New label");
    private static JLabel pietro1_0_3 = new JLabel("New label");
    private static JLabel pietro1_0_0 = new JLabel("New label");
    private static JPanel winda1_2 = new JPanel();
    private static JLabel pietro1_2_1 = new JLabel("New label");
    private static JLabel pietro1_2_2 = new JLabel("New label");
    private static JLabel pietro1_2_3 = new JLabel("New label");
    private static JLabel pietro1_2_0 = new JLabel("New label");
    private static JPanel ko_t = new JPanel();
    private static JLabel ko_t_0 = new JLabel("New label");
    private static JLabel ko_t_1 = new JLabel("New label");
    private static JLabel ko_t_2 = new JLabel("New label");
    private static JLabel ko_t_3 = new JLabel("New label");
    private static JLabel ko_t_4 = new JLabel("New label");
    private static JPanel sp_t = new JPanel();
    private static JLabel sp_t_0 = new JLabel("New label");
    private static JLabel sp_t_1 = new JLabel("New label");
    private static JLabel sp_t_2 = new JLabel("New label");
    private static JLabel sp_t_3 = new JLabel("New label");
    private static JLabel sp_t_4 = new JLabel("New label");
    private static JPanel winda2_0 = new JPanel();
    private static JLabel pietro2_0_1 = new JLabel("New label");
    private static JLabel pietro2_0_2 = new JLabel("New label");
    private static JLabel pietro2_0_3 = new JLabel("New label");
    private static JLabel pietro2_0_0 = new JLabel("New label");
    private static JPanel winda2_1 = new JPanel();
    private static JLabel pietro2_1_1 = new JLabel("New label");
    private static JLabel pietro2_1_2 = new JLabel("New label");
    private static JLabel pietro2_1_3 = new JLabel("New label");
    private static JLabel pietro2_1_0 = new JLabel("New label");
    private static JPanel winda2_2 = new JPanel();
    private static JLabel pietro2_2_1 = new JLabel("New label");
    private static JLabel pietro2_2_2 = new JLabel("New label");
    private static JLabel pietro2_2_3 = new JLabel("New label");
    private static JLabel pietro2_2_0 = new JLabel("New label");
    private static JLabel winda20 = new JLabel("New label");
    private static JLabel winda21 = new JLabel("New label");
    private static JLabel winda22 = new JLabel("New label");
    private static JLabel winda10 = new JLabel("New label");
    private static JLabel winda11 = new JLabel("New label");
    private static JLabel winda12 = new JLabel("New label");


    public GUI(Map m) {

        this.setTitle("Symulacja");
        this.setSize(500,800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        getContentPane().setLayout(null);
        sp_p.setBounds(132, 285, 202, 30);
        getContentPane().add(sp_p);
        sp_p.setLayout(null);
        sp_p_0.setBounds(10, 5, 30, 30);

        sp_p.add(sp_p_0);
        sp_p_1.setBounds(52, 5, 30, 30);
        sp_p.add(sp_p_1);
        sp_p_2.setBounds(92, 5, 30, 30);
        sp_p.add(sp_p_2);
        sp_p_4.setBounds(172, 5, 30, 30);
        sp_p.add(sp_p_4);
        sp_p_3.setBounds(132, 5, 30, 30);

        sp_p.add(sp_p_3);
        winda1_1.setLayout(null);
        winda1_1.setBounds(234, 194, 120, 30);

        getContentPane().add(winda1_1);
        pietro1_1_1.setBounds(32, 0, 23, 30);

        winda1_1.add(pietro1_1_1);
        pietro1_1_2.setBounds(65, 0, 23, 30);

        winda1_1.add(pietro1_1_2);
        pietro1_1_3.setBounds(98, 0, 23, 30);

        winda1_1.add(pietro1_1_3);
        pietro1_1_0.setBounds(0, 0, 24, 30);

        winda1_1.add(pietro1_1_0);
        ko_p.setBounds(132, 254, 202, 30);
        getContentPane().add(ko_p);
        ko_p.setLayout(null);
        ko_p_0.setSize(30, 30);
        ko_p_0.setLocation(10, 0);
        ko_p.add(ko_p_0);
        ko_p_1.setSize(30, 30);
        ko_p_1.setLocation(52, 0);
        ko_p.add(ko_p_1);
        ko_p_2.setSize(30, 30);
        ko_p_2.setLocation(92, 0);
        ko_p.add(ko_p_2);
        ko_p_3.setSize(30, 30);
        ko_p_3.setLocation(132, 0);
        ko_p.add(ko_p_3);
        ko_p_4.setSize(30, 30);
        ko_p_4.setLocation(172, 0);
        ko_p.add(ko_p_4);
        winda1_0.setLayout(null);
        winda1_0.setBounds(234, 224, 120, 30);

        getContentPane().add(winda1_0);
        pietro1_0_1.setBounds(32, 0, 23, 30);

        winda1_0.add(pietro1_0_1);
        pietro1_0_2.setBounds(65, 0, 23, 30);

        winda1_0.add(pietro1_0_2);
        pietro1_0_3.setBounds(98, 0, 23, 30);

        winda1_0.add(pietro1_0_3);
        pietro1_0_0.setBounds(0, 0, 24, 30);

        winda1_0.add(pietro1_0_0);
        winda1_2.setLayout(null);
        winda1_2.setBounds(234, 165, 120, 30);

        getContentPane().add(winda1_2);
        pietro1_2_1.setBounds(32, 0, 23, 30);

        winda1_2.add(pietro1_2_1);
        pietro1_2_2.setBounds(65, 0, 23, 30);

        winda1_2.add(pietro1_2_2);
        pietro1_2_3.setBounds(98, 0, 23, 30);

        winda1_2.add(pietro1_2_3);
        pietro1_2_0.setBounds(0, 0, 24, 30);

        winda1_2.add(pietro1_2_0);
        ko_t.setLayout(null);
        ko_t.setBounds(132, 136, 202, 30);

        getContentPane().add(ko_t);
        ko_t_0.setBounds(10, 0, 30, 30);

        ko_t.add(ko_t_0);
        ko_t_1.setBounds(52, 0, 30, 30);

        ko_t.add(ko_t_1);
        ko_t_2.setBounds(92, 0, 30, 30);

        ko_t.add(ko_t_2);
        ko_t_3.setBounds(132, 0, 30, 30);

        ko_t.add(ko_t_3);
        ko_t_4.setBounds(172, 0, 30, 30);

        ko_t.add(ko_t_4);
        sp_t.setLayout(null);
        sp_t.setBounds(132, 105, 202, 30);

        getContentPane().add(sp_t);
        sp_t_0.setBounds(10, 0, 30, 30);

        sp_t.add(sp_t_0);
        sp_t_1.setBounds(52, 0, 30, 30);

        sp_t.add(sp_t_1);
        sp_t_2.setBounds(92, 0, 30, 30);

        sp_t.add(sp_t_2);
        sp_t_3.setBounds(132, 0, 30, 30);

        sp_t.add(sp_t_3);
        sp_t_4.setBounds(172, 0, 30, 30);

        sp_t.add(sp_t_4);
        winda2_0.setLayout(null);
        winda2_0.setBounds(112, 224, 120, 30);

        getContentPane().add(winda2_0);
        pietro2_0_1.setBounds(32, 0, 23, 30);

        winda2_0.add(pietro2_0_1);
        pietro2_0_2.setBounds(65, 0, 23, 30);

        winda2_0.add(pietro2_0_2);
        pietro2_0_3.setBounds(98, 0, 23, 30);

        winda2_0.add(pietro2_0_3);
        pietro2_0_0.setBounds(0, 0, 24, 30);

        winda2_0.add(pietro2_0_0);
        winda2_1.setLayout(null);
        winda2_1.setBounds(112, 194, 120, 30);

        getContentPane().add(winda2_1);
        pietro2_1_1.setBounds(32, 0, 23, 30);

        winda2_1.add(pietro2_1_1);
        pietro2_1_2.setBounds(65, 0, 23, 30);

        winda2_1.add(pietro2_1_2);
        pietro2_1_3.setBounds(98, 0, 23, 30);

        winda2_1.add(pietro2_1_3);
        pietro2_1_0.setBounds(0, 0, 24, 30);

        winda2_1.add(pietro2_1_0);
        winda2_2.setLayout(null);
        winda2_2.setBounds(112, 165, 120, 30);

        getContentPane().add(winda2_2);
        pietro2_2_1.setBounds(32, 0, 23, 30);

        winda2_2.add(pietro2_2_1);
        pietro2_2_2.setBounds(65, 0, 23, 30);

        winda2_2.add(pietro2_2_2);
        pietro2_2_3.setBounds(98, 0, 23, 30);

        winda2_2.add(pietro2_2_3);
        pietro2_2_0.setBounds(0, 0, 24, 30);

        winda2_2.add(pietro2_2_0);
        winda20.setBounds(53, 235, 49, 14);

        getContentPane().add(winda20);
        winda21.setBounds(53, 210, 49, 14);

        getContentPane().add(winda21);
        winda22.setBounds(53, 181, 49, 14);

        getContentPane().add(winda22);
        winda10.setBounds(364, 234, 49, 14);

        getContentPane().add(winda10);
        winda11.setBounds(364, 210, 49, 14);

        getContentPane().add(winda11);
        winda12.setBounds(364, 181, 49, 14);

        getContentPane().add(winda12);


    }
    public static void updateelevator_2(Elevator e) {
        if(e.aktualne_pietro==0) {
            pietro2_0_0.setText(Integer.toString(e.pietro_id[0]));
            pietro2_0_1.setText(Integer.toString(e.pietro_id[1]));
            pietro2_0_2.setText(Integer.toString(e.pietro_id[2]));
            pietro2_0_3.setText(Integer.toString(e.pietro_id[3]));
            winda20.setText("-->");
            winda21.setText("");
            winda22.setText("");
            pietro2_2_0.setText(Integer.toString(0));
            pietro2_2_1.setText(Integer.toString(0));
            pietro2_2_2.setText(Integer.toString(0));
            pietro2_2_3.setText(Integer.toString(0));
            pietro2_1_0.setText(Integer.toString(0));
            pietro2_1_1.setText(Integer.toString(0));
            pietro2_1_2.setText(Integer.toString(0));
            pietro2_1_3.setText(Integer.toString(0));
        }


        if(e.aktualne_pietro==1) {
            pietro2_1_0.setText(Integer.toString(e.pietro_id[0]));
            pietro2_1_1.setText(Integer.toString(e.pietro_id[1]));
            pietro2_1_2.setText(Integer.toString(e.pietro_id[2]));
            pietro2_1_3.setText(Integer.toString(e.pietro_id[3]));
            pietro2_0_0.setText(Integer.toString(0));
            pietro2_0_1.setText(Integer.toString(0));
            pietro2_0_2.setText(Integer.toString(0));
            pietro2_0_3.setText(Integer.toString(0));
            pietro2_2_0.setText(Integer.toString(0));
            pietro2_2_1.setText(Integer.toString(0));
            pietro2_2_2.setText(Integer.toString(0));
            pietro2_2_3.setText(Integer.toString(0));
            winda20.setText("");
            winda21.setText("-->");
            winda22.setText("");

        }
        if(e.aktualne_pietro==2) {
            pietro2_2_0.setText(Integer.toString(e.pietro_id[0]));
            pietro2_2_1.setText(Integer.toString(e.pietro_id[1]));
            pietro2_2_2.setText(Integer.toString(e.pietro_id[2]));
            pietro2_2_3.setText(Integer.toString(e.pietro_id[3]));
            pietro2_0_0.setText(Integer.toString(0));
            pietro2_0_1.setText(Integer.toString(0));
            pietro2_0_2.setText(Integer.toString(0));
            pietro2_0_3.setText(Integer.toString(0));
            pietro2_1_0.setText(Integer.toString(0));
            pietro2_1_1.setText(Integer.toString(0));
            pietro2_1_2.setText(Integer.toString(0));
            pietro2_1_3.setText(Integer.toString(0));
            winda20.setText("");
            winda21.setText("");
            winda22.setText("-->");

        }

    }



    public static void updateelevator(Elevator e) {
        if(e.aktualne_pietro==0) {
            pietro1_0_0.setText(Integer.toString(e.pietro_id[0]));
            pietro1_0_1.setText(Integer.toString(e.pietro_id[1]));
            pietro1_0_2.setText(Integer.toString(e.pietro_id[2]));
            pietro1_0_3.setText(Integer.toString(e.pietro_id[3]));
            pietro1_2_0.setText(Integer.toString(0));
            pietro1_2_1.setText(Integer.toString(0));
            pietro1_2_2.setText(Integer.toString(0));
            pietro1_2_3.setText(Integer.toString(0));
            pietro1_1_0.setText(Integer.toString(0));
            pietro1_1_1.setText(Integer.toString(0));
            pietro1_1_2.setText(Integer.toString(0));
            pietro1_1_3.setText(Integer.toString(0));
            winda10.setText("<--");
            winda11.setText("");
            winda12.setText("");
        }


        if(e.aktualne_pietro==1) {
            pietro1_1_0.setText(Integer.toString(e.pietro_id[0]));
            pietro1_1_1.setText(Integer.toString(e.pietro_id[1]));
            pietro1_1_2.setText(Integer.toString(e.pietro_id[2]));
            pietro1_1_3.setText(Integer.toString(e.pietro_id[3]));
            pietro1_0_0.setText(Integer.toString(0));
            pietro1_0_1.setText(Integer.toString(0));
            pietro1_0_2.setText(Integer.toString(0));
            pietro1_0_3.setText(Integer.toString(0));
            pietro1_2_0.setText(Integer.toString(0));
            pietro1_2_1.setText(Integer.toString(0));
            pietro1_2_2.setText(Integer.toString(0));
            pietro1_2_3.setText(Integer.toString(0));
            winda10.setText("");
            winda11.setText("<--");
            winda12.setText("");
        }
        if(e.aktualne_pietro==2) {
            pietro1_2_0.setText(Integer.toString(e.pietro_id[0]));
            pietro1_2_1.setText(Integer.toString(e.pietro_id[1]));
            pietro1_2_2.setText(Integer.toString(e.pietro_id[2]));
            pietro1_2_3.setText(Integer.toString(e.pietro_id[3]));
            pietro1_0_0.setText(Integer.toString(0));
            pietro1_0_1.setText(Integer.toString(0));
            pietro1_0_2.setText(Integer.toString(0));
            pietro1_0_3.setText(Integer.toString(0));
            pietro1_1_0.setText(Integer.toString(0));
            pietro1_1_1.setText(Integer.toString(0));
            pietro1_1_2.setText(Integer.toString(0));
            pietro1_1_3.setText(Integer.toString(0));
            winda10.setText("");
            winda11.setText("");
            winda12.setText("<--");
        }

    }

    public static void update() {
        Floor f2=Map.getfloor(2);
        Floor f1=Map.getfloor(0);
        sp_p_0.setText(Integer.toString(f1.walking_area_list[0]));
        sp_p_1.setText(Integer.toString(f1.walking_area_list[1]));
        sp_p_2.setText(Integer.toString(f1.walking_area_list[2]));
        sp_p_3.setText(Integer.toString(f1.walking_area_list[3]));
        sp_p_4.setText(Integer.toString(f1.walking_area_list[4]));
        ko_p_0.setText(Integer.toString(f1.queue_list[0]));
        ko_p_1.setText(Integer.toString(f1.queue_list[1]));
        ko_p_2.setText(Integer.toString(f1.queue_list[2]));
        ko_p_3.setText(Integer.toString(f1.queue_list[3]));
        ko_p_4.setText(Integer.toString(f1.queue_list[4]));
        sp_t_0.setText(Integer.toString(f2.walking_area_list[0]));
        sp_t_1.setText(Integer.toString(f2.walking_area_list[1]));
        sp_t_2.setText(Integer.toString(f2.walking_area_list[2]));
        sp_t_3.setText(Integer.toString(f2.walking_area_list[3]));
        sp_t_4.setText(Integer.toString(f2.walking_area_list[4]));
        ko_t_0.setText(Integer.toString(f2.queue_list[0]));
        ko_t_1.setText(Integer.toString(f2.queue_list[1]));
        ko_t_2.setText(Integer.toString(f2.queue_list[2]));
        ko_t_3.setText(Integer.toString(f2.queue_list[3]));
        ko_t_4.setText(Integer.toString(f2.queue_list[4]));




    }



}