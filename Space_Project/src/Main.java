import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Objects
        Rocky_Planet Earth = new Rocky_Planet("Earth", 9.81, 365);
        Gas_Giant_Planet Jupiter = new Gas_Giant_Planet("Jupiter", 24.79, 4333);
        Ice_Giant_Planet Neptune = new Ice_Giant_Planet("Neptune", 11.15, 60190);
        Gas_Giant_Planet Saturn = new Gas_Giant_Planet("Saturn", 10.44, 10756);
        Moon Luna = new Moon("Luna", Earth);
        Moon Io = new Moon("Io", Jupiter);
        Moon Callisto = new Moon("Callisto", Jupiter);
        Moon Titan = new Moon("Titan", Saturn);
        Moon Triton = new Moon("Triton", Neptune);

        Planet[] planets = new Planet[]{Earth, Jupiter, Neptune, Saturn};

        Moon[] moons = new Moon[]{Luna, Io, Callisto, Titan, Triton};


        //Making the gui frame for the player to see
        JFrame frame = new JFrame();
        frame.setSize(600, 600);

        JPanel panel = new JPanel();

        frame.add(panel);

        final DefaultListModel planet_name = new DefaultListModel();

        //Displaying Planets Info
        for(int i = 0; i < planets.length; i++){
            if(planets[i] == planets[0]){
                System.out.println("Planets:");
                System.out.println("--------------");
            }
            planet_name.addElement(planets[i].name);
            planets[i].display();
            System.out.println("--------------");
        }

        //Displaying Moons Info
        for(int i = 0; i < moons.length; i++){
            if(moons[i] == moons[1]){
                System.out.println("Moons:");
                System.out.println("--------------");
            }
            moons[i].display();
            System.out.println("--------------");
        }

        final JList planet_list = new JList(planet_name);

        planet_list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        planet_list.setSelectedIndex(0);
        planet_list.setVisibleRowCount(5);

        JScrollPane pane = new JScrollPane(planet_list);

        panel.add(pane);

        frame.setVisible(true);



    }
}