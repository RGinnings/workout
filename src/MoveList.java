
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

//water moves are all stretches!
public class MoveList {

    String source;
    String move1;
    String move2;
    String move3;
    String move4;
    String move5;
    String completeWorkout;

    MoveList(String name, String act1, String act2, String act3, String act4, String act5, String act6, String act7) throws IOException {
        this.source = "<a href=https://workoutlabs.com/exercise-guide/>Source: WorkoutLabs</a><br/>";

        int moves = 0;
        ArrayList<String> ml = new ArrayList<String>();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("moveList.csv");
        InputStreamReader movelist = new InputStreamReader(is, "UTF-8");
        String line;

        String nm = name.toLowerCase();
        String folder = "PokemonSprites/" + nm + ".png";
        java.net.URL imageURL = workoutGUI.class.getResource(folder);
        ImageIcon icon = new ImageIcon(imageURL);

        // <editor-fold defaultstate="collapsed" desc="Read Move List"> 
        try (BufferedReader br = new BufferedReader(movelist)) {
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                if (act1.equals("Fairy") && !s[3].equalsIgnoreCase("x") || act1.equals("Dragon") && !s[3].equalsIgnoreCase("x")
                        || s[0].equalsIgnoreCase("Bug") && !s[3].equalsIgnoreCase("x") || s[0].equalsIgnoreCase("Dark") && !s[3].equalsIgnoreCase("x")
                        || s[0].equalsIgnoreCase("Dragon") && !s[3].equalsIgnoreCase("x") || s[0].equalsIgnoreCase("Electric") && !s[3].equalsIgnoreCase("x")
                        || s[0].equalsIgnoreCase("Fairy") && !s[3].equalsIgnoreCase("x") || s[0].equalsIgnoreCase("Fighting") && !s[3].equalsIgnoreCase("x")
                        || s[0].equalsIgnoreCase("Fire") && !s[3].equalsIgnoreCase("x") || s[0].equalsIgnoreCase("Flying") && !s[3].equalsIgnoreCase("x")
                        || s[0].equalsIgnoreCase("Ghost") && !s[3].equalsIgnoreCase("x") || s[0].equalsIgnoreCase("Grass") && !s[3].equalsIgnoreCase("x")
                        || s[0].equalsIgnoreCase("Ground") && !s[3].equalsIgnoreCase("x") || s[0].equalsIgnoreCase("Ice") && !s[3].equalsIgnoreCase("x")
                        || s[0].equalsIgnoreCase("Normal") && !s[3].equalsIgnoreCase("x") || s[0].equalsIgnoreCase("Poison") && !s[3].equalsIgnoreCase("x")
                        || s[0].equalsIgnoreCase("Psychic") && !s[3].equalsIgnoreCase("x") || s[0].equalsIgnoreCase("Rock") && !s[3].equalsIgnoreCase("x")
                        || s[0].equalsIgnoreCase("Steel") && !s[3].equalsIgnoreCase("x") || s[0].equalsIgnoreCase("Water") && !s[3].equalsIgnoreCase("x")) {
                    ml.add(s[3]);

                }
                if (s[0].matches(act1) && !s[3].equalsIgnoreCase("x")
                        || s[0].matches(act2) && !s[3].equalsIgnoreCase("x") || s[0].matches(act3) && !s[3].equalsIgnoreCase("x")
                        || s[0].matches(act4) && !s[3].equalsIgnoreCase("x") || s[0].matches(act5) && !s[3].equalsIgnoreCase("x")
                        || s[0].matches(act6) && !s[3].equalsIgnoreCase("x") || s[0].matches(act7) && !s[3].equalsIgnoreCase("x")) {
                    ml.add(s[3]);
                }
            }
            br.close();
        }

        int length = ml.size();
        //</editor-fold>

        //Length of random numbers to pull from to avoid dupliates
        List<Integer> numbers = new ArrayList<Integer>(length);
        for (int n = 0; n <= length; n++) {
            numbers.add(n);
        }
        Collections.shuffle(numbers);
        Random rand = new Random();
        ArrayList<String> moveList1 = new ArrayList<String>();

        //<editor-fold defaultstate="collapsed" desc="1 Type">
        if (act2.equals(" ")) {
            while (moves < 5) {
                int x = rand.nextInt(numbers.size());
                switch (act1) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    default:
                        break;
                }

                moves++;

            }

            JEditorPane ep = new JEditorPane();
            ep.setEditable(false);
            ep.setEditorKit(JEditorPane.createEditorKitForContentType("text/html"));
            move1 = moveList1.get(0);
            move2 = moveList1.get(1);
            move3 = moveList1.get(2);
            move4 = moveList1.get(3);
            move5 = moveList1.get(4);

            if (act1.equals("Water") || act2.equals("Water") || act3.equals("Water") || act4.equals("Water") || act5.equals("Water") || act6.equals("Water") || act7.equals("Water")) {
                completeWorkout = "REST DAY";
            } else {
                completeWorkout = source + "\n" + move1 + "\n" + move2 + "\n" + move3 + "\n" + move4 + "\n" + move5;
            }
//            System.out.println(completeWorkout);
            ep.setText("<html>" + completeWorkout + "</html>"); //change url and name to workout demo
            ep.addHyperlinkListener((HyperlinkEvent e) -> {
                if (HyperlinkEvent.EventType.ACTIVATED.equals(e.getEventType())) {
                    if (Desktop.isDesktopSupported()) {
                        try {
                            Desktop.getDesktop().browse(e.getURL().toURI()); //here is where the error points to
                        } catch (IOException | URISyntaxException e1) {
                        }
                    }
                }
            });
            CustomPane.showOptionDialog(ep, icon);

        } //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="2 Types"> //doesnt stop when 5 is met
        else if (act3.equals(" ")) {
            while (moves < 5) {
                int x = rand.nextInt(numbers.size());
                int a = rand.nextInt(numbers.size());
                switch (act1) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    default:
                        break;
                }
                moves++;

                if (moves == 5) {
                    break;
                }

                switch (act2) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(a)));
                        //linkList1.add(m2.get(numbers.remove(a)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }

            }
            JEditorPane ep = new JEditorPane();
            ep.setEditable(false);
            ep.setEditorKit(JEditorPane.createEditorKitForContentType("text/html"));

            move1 = moveList1.get(0);
            move2 = moveList1.get(1);
            move3 = moveList1.get(2);
            move4 = moveList1.get(3);
            move5 = moveList1.get(4);

            if (act1.equals("Water") || act2.equals("Water") || act3.equals("Water") || act4.equals("Water") || act5.equals("Water") || act6.equals("Water") || act7.equals("Water")) {
                completeWorkout = "REST DAY";
            } else {
                completeWorkout = source + "\n" + move1 + "\n" + move2 + "\n" + move3 + "\n" + move4 + "\n" + move5;

            }
//            System.out.println(completeWorkout);
            ep.setText("<html>" + completeWorkout + "</html>"); //change url and name to workout demo
            ep.addHyperlinkListener(new HyperlinkListener() {
                @Override
                public void hyperlinkUpdate(HyperlinkEvent e) {
                    if (HyperlinkEvent.EventType.ACTIVATED.equals(e.getEventType())) {
                        if (Desktop.isDesktopSupported()) {
                            try {
                                Desktop.getDesktop().browse(e.getURL().toURI()); //here is where the error points to
                            } catch (IOException | URISyntaxException e1) {
                            }
                        }
                    }
                }
            });
            CustomPane.showOptionDialog(ep, icon);

////            //System.out.println(String.valueOf(folder));
        } //</editor-fold>        
        //<editor-fold defaultstate="collapsed" desc="3 Types"> //doesnt stop when 5 is met
        else if (act4.equals(" ")) {
            while (moves < 5) {
                int x = rand.nextInt(numbers.size());
                int b = rand.nextInt(numbers.size());
                int c = rand.nextInt(numbers.size());
                switch (act1) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    default:
                        break;

                }
                moves++;

                if (moves == 5) {
                    break;
                }

                switch (act2) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
                switch (act3) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
            }
            JEditorPane ep = new JEditorPane();
            ep.setEditable(false);
            ep.setEditorKit(JEditorPane.createEditorKitForContentType("text/html"));

            move1 = moveList1.get(0);
            move2 = moveList1.get(1);
            move3 = moveList1.get(2);
            move4 = moveList1.get(3);
            move5 = moveList1.get(4);

            if (act1.equals("Water") || act2.equals("Water") || act3.equals("Water") || act4.equals("Water") || act5.equals("Water") || act6.equals("Water") || act7.equals("Water")) {
                completeWorkout = "REST DAY";
            } else {
                completeWorkout = source + "\n" + move1 + "\n" + move2 + "\n" + move3 + "\n" + move4 + "\n" + move5;

            }
//            System.out.println(completeWorkout);
            ep.setText("<html>" + completeWorkout + "</html>"); //change url and name to workout demo
            ep.addHyperlinkListener(new HyperlinkListener() {
                @Override
                public void hyperlinkUpdate(HyperlinkEvent e) {
                    if (HyperlinkEvent.EventType.ACTIVATED.equals(e.getEventType())) {
                        if (Desktop.isDesktopSupported()) {
                            try {
                                Desktop.getDesktop().browse(e.getURL().toURI()); //here is where the error points to
                            } catch (IOException | URISyntaxException e1) {
                            }
                        }
                    }
                }
            });
            CustomPane.showOptionDialog(ep, icon);

        } //</editor-fold>  
        //<editor-fold defaultstate="collapsed" desc="4 Types"> //doesnt stop when 5 is met
        else if (act5.equals(" ")) {
            while (moves < 5) {
                int x = rand.nextInt(numbers.size());
                int b = rand.nextInt(numbers.size());
                int c = rand.nextInt(numbers.size());
                int d = rand.nextInt(numbers.size());
                switch (act1) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    default:
                        break;

                }
                moves++;

                if (moves == 5) {
                    break;
                }

                switch (act2) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        ;
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
                switch (act3) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        ;
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
                switch (act4) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        ;
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
            }
            JEditorPane ep = new JEditorPane();
            ep.setEditable(false);
            ep.setEditorKit(JEditorPane.createEditorKitForContentType("text/html"));

            move1 = moveList1.get(0);
            move2 = moveList1.get(1);
            move3 = moveList1.get(2);
            move4 = moveList1.get(3);
            move5 = moveList1.get(4);

            if (act1.equals("Water") || act2.equals("Water") || act3.equals("Water") || act4.equals("Water") || act5.equals("Water") || act6.equals("Water") || act7.equals("Water")) {
                completeWorkout = "REST DAY";
            } else {
                completeWorkout = source + "\n" + move1 + "\n" + move2 + "\n" + move3 + "\n" + move4 + "\n" + move5;

            }
//            System.out.println(completeWorkout);
            ep.setText("<html>" + completeWorkout + "</html>"); //change url and name to workout demo
            ep.addHyperlinkListener(new HyperlinkListener() {
                @Override
                public void hyperlinkUpdate(HyperlinkEvent e) {
                    if (HyperlinkEvent.EventType.ACTIVATED.equals(e.getEventType())) {
                        if (Desktop.isDesktopSupported()) {
                            try {
                                Desktop.getDesktop().browse(e.getURL().toURI()); //here is where the error points to
                            } catch (IOException | URISyntaxException e1) {
                            }
                        }
                    }
                }
            });
            CustomPane.showOptionDialog(ep, icon);

        } //</editor-fold>  
        //<editor-fold defaultstate="collapsed" desc="5 Types"> //doesnt stop when 5 is met
        else if (act6.equals(" ")) {
            while (moves < 5) {
                int x = rand.nextInt(numbers.size());
                int b = rand.nextInt(numbers.size());
                int c = rand.nextInt(numbers.size());
                int d = rand.nextInt(numbers.size());
                int e = rand.nextInt(numbers.size());
                switch (act1) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    default:
                        break;

                }
                moves++;

                if (moves == 5) {
                    break;
                }

                switch (act2) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
                switch (act3) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
                switch (act4) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
                switch (act5) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
            }
            JEditorPane ep = new JEditorPane();
            ep.setEditable(false);
            ep.setEditorKit(JEditorPane.createEditorKitForContentType("text/html"));

            move1 = moveList1.get(0);
            move2 = moveList1.get(1);
            move3 = moveList1.get(2);
            move4 = moveList1.get(3);
            move5 = moveList1.get(4);

            if (act1.equals("Water") || act2.equals("Water") || act3.equals("Water") || act4.equals("Water") || act5.equals("Water") || act6.equals("Water") || act7.equals("Water")) {
                completeWorkout = "REST DAY";
            } else {
                completeWorkout = source + "\n" + move1 + "\n" + move2 + "\n" + move3 + "\n" + move4 + "\n" + move5;

            }
//            System.out.println(completeWorkout);
            ep.setText("<html>" + completeWorkout + "</html>"); //change url and name to workout demo
            ep.addHyperlinkListener(new HyperlinkListener() {
                @Override
                public void hyperlinkUpdate(HyperlinkEvent e) {
                    if (HyperlinkEvent.EventType.ACTIVATED.equals(e.getEventType())) {
                        if (Desktop.isDesktopSupported()) {
                            try {
                                Desktop.getDesktop().browse(e.getURL().toURI()); //here is where the error points to
                            } catch (IOException | URISyntaxException e1) {
                            }
                        }
                    }
                }
            });
            CustomPane.showOptionDialog(ep, icon);

        } //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="6 Types">
        else if (act7.equals(" ")) {
            while (moves < 5) {
                int x = rand.nextInt(numbers.size());
                int b = rand.nextInt(numbers.size());
                int c = rand.nextInt(numbers.size());
                int d = rand.nextInt(numbers.size());
                int e = rand.nextInt(numbers.size());
                int f = rand.nextInt(numbers.size());
                switch (act1) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    default:
                        break;

                }
                moves++;

                if (moves == 5) {
                    break;
                }

                switch (act2) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
                switch (act3) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
                switch (act4) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    default:
                        break;
                }
                moves++;

                if (moves == 5) {
                    break;
                }

                switch (act5) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
                switch (act6) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
            }
            JEditorPane ep = new JEditorPane();
            ep.setEditable(false);
            ep.setEditorKit(JEditorPane.createEditorKitForContentType("text/html"));

            move1 = moveList1.get(0);
            move2 = moveList1.get(1);
            move3 = moveList1.get(2);
            move4 = moveList1.get(3);
            move5 = moveList1.get(4);

            if (act1.equals("Water") || act2.equals("Water") || act3.equals("Water") || act4.equals("Water") || act5.equals("Water") || act6.equals("Water") || act7.equals("Water")) {
                completeWorkout = "REST DAY";
            } else {
                completeWorkout = source + "\n" + move1 + "\n" + move2 + "\n" + move3 + "\n" + move4 + "\n" + move5;

            }
//            System.out.println(completeWorkout);
            ep.setText("<html>" + completeWorkout + "</html>"); //change url and name to workout demo
            ep.addHyperlinkListener(new HyperlinkListener() {
                @Override
                public void hyperlinkUpdate(HyperlinkEvent e) {
                    if (HyperlinkEvent.EventType.ACTIVATED.equals(e.getEventType())) {
                        if (Desktop.isDesktopSupported()) {
                            try {
                                Desktop.getDesktop().browse(e.getURL().toURI()); //here is where the error points to
                            } catch (IOException | URISyntaxException e1) {
                            }
                        }
                    }
                }
            });
            CustomPane.showOptionDialog(ep, icon);

        } //</editor-fold>     
        //<editor-fold defaultstate="collapsed" desc="7 Types">
        else {
            while (moves < 5) {
                int x = rand.nextInt(numbers.size());
                int b = rand.nextInt(numbers.size());
                int c = rand.nextInt(numbers.size());
                int d = rand.nextInt(numbers.size());
                int e = rand.nextInt(numbers.size());
                int f = rand.nextInt(numbers.size());
                int g = rand.nextInt(numbers.size());
                switch (act1) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(x)));
                        //linkList1.add(m2.get(numbers.remove(x)));
                        break;
                    default:
                        break;

                }
                moves++;

                if (moves == 5) {
                    break;
                }

                switch (act2) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(b)));
                        //linkList1.add(m2.get(numbers.remove(b)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
                switch (act3) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(c)));
                        //linkList1.add(m2.get(numbers.remove(c)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
                switch (act4) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(d)));
                        //linkList1.add(m2.get(numbers.remove(d)));
                        break;
                    default:
                        break;
                }
                moves++;

                if (moves == 5) {
                    break;
                }

                switch (act5) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(e)));
                        //linkList1.add(m2.get(numbers.remove(e)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
                switch (act6) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(f)));
                        //linkList1.add(m2.get(numbers.remove(f)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
                switch (act7) {
                    case "Bug":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Dark":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Dragon":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Electric":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Fairy":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Fighting":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Fire":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Flying":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Ghost":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Grass":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Ground":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Ice":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Normal":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Poison":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Psychic":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Rock":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Steel":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    case "Water":
                        moveList1.add(ml.get(numbers.remove(g)));
                        //linkList1.add(m2.get(numbers.remove(g)));
                        break;
                    default:
                        break;
                }
                moves++;
                if (moves == 5) {
                    break;
                }
            }
            JEditorPane ep = new JEditorPane();
            ep.setEditable(false);
            ep.setEditorKit(JEditorPane.createEditorKitForContentType("text/html"));

            move1 = moveList1.get(0);
            move2 = moveList1.get(1);
            move3 = moveList1.get(2);
            move4 = moveList1.get(3);
            move5 = moveList1.get(4);

            if (act1.equals("Water") || act2.equals("Water") || act3.equals("Water") || act4.equals("Water") || act5.equals("Water") || act6.equals("Water") || act7.equals("Water")) {
                completeWorkout = "REST DAY";
            } else {
                completeWorkout = source + "\n" + move1 + "\n" + move2 + "\n" + move3 + "\n" + move4 + "\n" + move5;

            }
//            System.out.println(completeWorkout);
            ep.setText("<html>" + completeWorkout + "</html>"); //change url and name to workout demo
            ep.addHyperlinkListener(new HyperlinkListener() {
                @Override
                public void hyperlinkUpdate(HyperlinkEvent e) {
                    if (HyperlinkEvent.EventType.ACTIVATED.equals(e.getEventType())) {
                        if (Desktop.isDesktopSupported()) {
                            try {
                                Desktop.getDesktop().browse(e.getURL().toURI()); //here is where the error points to
                            } catch (IOException | URISyntaxException e1) {
                            }
                        }
                    }
                }
            });
            CustomPane.showOptionDialog(ep, icon);

//</editor-fold>    
        }
    }

}
