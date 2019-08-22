
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Raymond Ginnings This is a project for my wife and children to give
 * her motivation to workout and to help her change her workout day to day
 */
public class workoutGUI extends javax.swing.JFrame {

    Random r = new Random();

    public void warning() throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("disclaimer.txt");
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String nextLine;
        List<String> a = new ArrayList<String>();
        while ((nextLine = br.readLine()) != null) {
            a.add(nextLine);
        }
        StringBuilder builder = new StringBuilder();
        for (String value : a) {
            builder.append(value);
            builder.append("\n");
        }
        String message = builder.toString();
        JTextArea ta = new JTextArea(35, 70);
        ta.setText(message);
        ta.setCaretPosition(0);
        JScrollPane jsp = new JScrollPane(ta);
        Object[] choices = {"I have read and agree to the above disclaimers"};
        Object defaultChoice = choices[0];
        JOptionPane.showOptionDialog(null, jsp, "Disclaimers", JOptionPane.OK_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, choices, defaultChoice);

    }

    public void randomPokemon() {
        rdm.addActionListener((ActionEvent e) -> {
            getMoves.setEnabled(true);
            InputStream is;
            try {
                String x1 = String.valueOf(r.nextInt(809));
                pkmNum.setText(x1);
                //<editor-fold defaultstate="collapsed" desc="Find Pokemon in Array">
                pkmName.setText(" ");
                pkmType1.setText(" ");
                pkmType2.setText(" ");
                pkmType3.setText(" ");
                pkmType4.setText(" ");
                pkmType5.setText(" ");
                pkmType6.setText(" ");
                pkmType7.setText(" ");
//                    wrkt.setText(" ");
                ClassLoader classloader = Thread.currentThread().getContextClassLoader();
                is = classloader.getResourceAsStream("pokedex.csv");
                InputStreamReader POKEDEX = new InputStreamReader(is, "UTF-8");
                String line;
                String cvsSplitBy = ",";
                try (final BufferedReader br = new BufferedReader(POKEDEX)) {
                    while ((line = br.readLine()) != null) {
                        // use comma as separator
                        String[] pok = line.split(cvsSplitBy);
                        if (pok[0].matches(x1)) {
                            //"479" to check Rotom = all types
                            pkmName.setText(pok[1]);
                            pkmType1.setText(pok[2]);
                            if (pok[3].matches("xxxxx")) {

                            } else if (pok[4].matches("xxxxx")) {
                                pkmType2.setText(pok[3]);

                            } else if (pok[5].matches("xxxxx")) {
                                pkmType2.setText(pok[3]);
                                pkmType3.setText(pok[4]);

                            } else if (pok[6].matches("xxxxx")) {
                                pkmType2.setText(pok[3]);
                                pkmType3.setText(pok[4]);
                                pkmType4.setText(pok[5]);

                            } else if (pok[7].matches("xxxxx")) {
                                pkmType2.setText(pok[3]);
                                pkmType3.setText(pok[4]);
                                pkmType4.setText(pok[5]);
                                pkmType5.setText(pok[6]);

                            } else if (pok[8].matches("xxxxx")) {
                                pkmType2.setText(pok[3]);
                                pkmType3.setText(pok[4]);
                                pkmType4.setText(pok[5]);
                                pkmType5.setText(pok[6]);
                                pkmType6.setText(pok[7]);
                            } else {
                                pkmType2.setText(pok[3]);
                                pkmType3.setText(pok[4]);
                                pkmType4.setText(pok[5]);
                                pkmType5.setText(pok[6]);
                                pkmType6.setText(pok[7]);
                                pkmType7.setText(pok[8]);
                            }

//<editor-fold defaultstate="collapsed" desc="Workout Type">
                            WrktType wrkttp = new WrktType(pok);
//                                wrkt.setText(WrktType.move1 + WrktType.move2 + WrktType.move3 + WrktType.move4 + WrktType.move5 + WrktType.move6 + WrktType.move7);

//</editor-fold>
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(workoutGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                //</editor-fold>
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(workoutGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public void getMoveset() {

        getMoves.addActionListener((ActionEvent e) -> {
            String act1 = pkmType1.getText();
            String act2 = pkmType2.getText();
            String act3 = pkmType3.getText();
            String act4 = pkmType4.getText();
            String act5 = pkmType5.getText();
            String act6 = pkmType6.getText();
            String act7 = pkmType7.getText();
            String name1 = pkmName.getText();
            try {
                MoveList moveset1 = new MoveList(name1, act1, act2, act3, act4, act5, act6, act7);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(workoutGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(workoutGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
    }

    public workoutGUI() throws IOException {
        initComponents();
        warning();
        randomPokemon();
        getMoveset();
        getMoves.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pkmNum = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pkmName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pkmType1 = new javax.swing.JLabel();
        pkmType2 = new javax.swing.JLabel();
        pkmType3 = new javax.swing.JLabel();
        pkmType4 = new javax.swing.JLabel();
        pkmType5 = new javax.swing.JLabel();
        pkmType6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pkmType7 = new javax.swing.JLabel();
        getMoves = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rdm.setText("Get Pokemon");

        jLabel1.setText("Pokemon Number");

        pkmNum.setText("     ");
        pkmNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Pokemon Name");

        pkmName.setText("     ");
        pkmName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Pokemon Type 1");

        jLabel4.setText("Pokemon Type 2");

        jLabel5.setText("Pokemon Type 3");

        jLabel6.setText("Pokemon Type 4");

        jLabel7.setText("Pokemon Type 5");

        jLabel8.setText("Pokemon Type 6");

        pkmType1.setText("     ");
        pkmType1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pkmType2.setText("     ");
        pkmType2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pkmType3.setText("      ");
        pkmType3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pkmType4.setText("     ");
        pkmType4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pkmType5.setText("     ");
        pkmType5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pkmType6.setText("     ");
        pkmType6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Pokemon Type 7");

        pkmType7.setText("     ");
        pkmType7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        getMoves.setText("Get Moves");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(getMoves, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pkmName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pkmNum, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pkmType7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pkmType6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pkmType5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pkmType4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pkmType3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pkmType2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pkmType1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pkmNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pkmName)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pkmType1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pkmType2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pkmType3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pkmType4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pkmType5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pkmType6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pkmType7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdm)
                    .addComponent(getMoves))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(workoutGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new workoutGUI().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(workoutGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Variable Declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getMoves;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel pkmName;
    private javax.swing.JLabel pkmNum;
    private javax.swing.JLabel pkmType1;
    private javax.swing.JLabel pkmType2;
    private javax.swing.JLabel pkmType3;
    private javax.swing.JLabel pkmType4;
    private javax.swing.JLabel pkmType5;
    private javax.swing.JLabel pkmType6;
    private javax.swing.JLabel pkmType7;
    private javax.swing.JButton rdm;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
