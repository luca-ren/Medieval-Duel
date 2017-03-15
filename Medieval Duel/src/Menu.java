import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame {
    public Jouer menuSelectionPersonnage;

    public Menu(String titre, int x, int y, int w, int h) {
        super(titre);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(x,y,w,h);;;
        this.init();
        this.setVisible(true);
    }

    public JPanel creePanelCentre() {
        JPanel pan = new JPanel(new GridLayout(2,1,10,10));
        JPanel iconMilieu = new JPanel(new FlowLayout());
        pan.add(iconMilieu);
        
        ImageIcon jeuIcon = new ImageIcon("Medieval Duel.gif");
        JLabel image = new JLabel();
        image.setIcon(jeuIcon);
        iconMilieu.add(image);
        
        JPanel choix = new JPanel(new GridLayout(3,1));
        BoutonListener menu = new BoutonListener();
        
        JPanel pChoixCombattant = new JPanel();
        choix.add(pChoixCombattant);
        JButton choixCombattant = new JButton("Jouer");
        choixCombattant.setPreferredSize(new Dimension(125,30));
        choixCombattant.addActionListener(menu);
        pChoixCombattant.add(choixCombattant);
        
        
        JPanel pQuitter = new JPanel();
        choix.add(pQuitter);
        JButton quitter = new JButton("Quitter");
        quitter.setPreferredSize(new Dimension(125,30));
        quitter.addActionListener(menu);
        pQuitter.add(quitter);
        
        pan.add(choix);
        return pan;
    }

    public void init() {
        Container c = this.getContentPane();
        JPanel j2 = this.creePanelCentre();
        c.add(j2);
    }

    public static void main(String[] args) {
        Menu menu = new Menu("Medieval Duel",50,50,1000,650);
    }

    class BoutonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            if(s.equals("Jouer")){
                    menuSelectionPersonnage = new Jouer("Medieval Duel",50,50,Menu.this.getWidth(),Menu.this.getHeight());
                    menuSelectionPersonnage.setVisible(true);
                    Menu.this.setVisible(false);
            }
            if(s.equals("Quitter"))
                    System.exit(0);
        }

    }

}
