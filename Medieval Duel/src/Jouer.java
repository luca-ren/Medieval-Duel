import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class Jouer extends JFrame {
	CreationCombattant cc;
	ListeCombattant listCombattant ;
	Combattant combattant1;
	Combattant combattant2;
	int numCombattant1;
	int numCombattant2;
	Container c;
	String classej1;
	String classej2;
	JButton j1choix1;
	JButton j1choix2;
	JButton j1choix3;
	JButton j1choix4;
	JButton j1choix5;
	JButton j1choix6;
	JButton j2choix1;
	JButton j2choix2;
	JButton j2choix3;
	JButton j2choix4;
	JButton j2choix5;
	JButton j2choix6;
	
	JTextArea cj1;
	JTextArea cj2;
    public Jouer(String titre, int x, int y, int w, int h) {
        super(titre);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(x,y,w,h);;;
        this.init();
        this.setVisible(true);
    }
    public JPanel creerPanelSud(){
    	JPanel ouest = new JPanel(new GridLayout(2,1,20,20));
    		JPanel choixNouveau = new JPanel(new GridLayout(1,7));
    		JPanel pConfirmer = new JPanel(new FlowLayout());
    		JLabel creerNouveauPersonnage = new JLabel("Nouveau Personnage");
    		BoutonCreerCombattant bcCombattant = new BoutonCreerCombattant();
    		JButton bnCombattant1 = new JButton("Nouveau Slot1");
    		JButton bnCombattant2 = new JButton("Nouveau Slot2");
    		JButton bnCombattant3 = new JButton("Nouveau Slot3");
    		JButton bnCombattant4 = new JButton("Nouveau Slot4");
    		JButton bnCombattant5 = new JButton("Nouveau Slot5");
    		JButton bnCombattant6 = new JButton("Nouveau Slot6");
    		bnCombattant1.addActionListener(bcCombattant);
    		bnCombattant2.addActionListener(bcCombattant);
    		bnCombattant3.addActionListener(bcCombattant);
    		bnCombattant4.addActionListener(bcCombattant);
    		bnCombattant5.addActionListener(bcCombattant);
    		bnCombattant6.addActionListener(bcCombattant);
    		BoutonConfirmer balConfirme = new BoutonConfirmer();
    		JButton bConfirmer = new JButton("Comfirmer");
    		JButton bQuitter = new JButton("Quitter");
    		bConfirmer.addActionListener(balConfirme);
    		bQuitter.addActionListener(balConfirme);
    		choixNouveau.add(creerNouveauPersonnage);
    		choixNouveau.add(bnCombattant1);
    		choixNouveau.add(bnCombattant2);
    		choixNouveau.add(bnCombattant3);
    		choixNouveau.add(bnCombattant4);
    		choixNouveau.add(bnCombattant5);
    		choixNouveau.add(bnCombattant6);
    		pConfirmer.add(bConfirmer);
    		pConfirmer.add(bQuitter);
    		ouest.add(choixNouveau);
    		ouest.add(pConfirmer);
    	return ouest;
    }
    public JPanel creerPanelCentre() throws IOException{
    	JPanel centre = new JPanel(new GridLayout(2,1,20,20));
    	JPanel centrej1 = new JPanel(new GridLayout(2,7,20,20));
    	JPanel centrej2 = new JPanel(new GridLayout(2,7,20,20));
    	listCombattant = new ListeCombattant();
    	String s1 ="";
    	JTextArea c1 = new JTextArea(s1);
    	JTextArea c2 = new JTextArea(s1);
    	JTextArea c3 = new JTextArea(s1);
    	JTextArea c4 = new JTextArea(s1);
    	JTextArea c5 = new JTextArea(s1);
    	JTextArea c6 = new JTextArea(s1);
    	JTextArea c11 = new JTextArea(s1);
    	JTextArea c22 = new JTextArea(s1);
    	JTextArea c33 = new JTextArea(s1);
    	JTextArea c44 = new JTextArea(s1);
    	JTextArea c55 = new JTextArea(s1);
    	JTextArea c66 = new JTextArea(s1);
    	
    	if (listCombattant.getCombattant(0).getNom().equals("Vide")){
    		j1choix1 = new JButton("Vide");
    	}
    	else{
    		j1choix1 = new JButton(listCombattant.getCombattant(0).getNom());
    	}	
    	if (listCombattant.getCombattant(1).getNom().equals("Vide")){
    		j1choix2 = new JButton("Vide");
    	}
    	else{
    		j1choix2 = new JButton(listCombattant.getCombattant(1).getNom());
    	}	
    	if (listCombattant.getCombattant(2).getNom().equals("Vide")){
    		j1choix3 = new JButton("Vide");
    	}
    	else{
    		j1choix3 = new JButton(listCombattant.getCombattant(2).getNom());
    	}	
    	if (listCombattant.getCombattant(3).getNom().equals("Vide")){
    		j1choix4 = new JButton("Vide");
    	}
    	else{
    		j1choix4 = new JButton(listCombattant.getCombattant(3).getNom());
    	}	;
    	if (listCombattant.getCombattant(4).getNom().equals("Vide")){
    		j1choix5 = new JButton("Vide");
    	}
    	else{
    		j1choix5 = new JButton(listCombattant.getCombattant(4).getNom());
    	}	
    	if (listCombattant.getCombattant(5).getNom().equals("Vide")){
    		j1choix6 = new JButton("Vide");
    	}
    	else{
    		j1choix6 = new JButton(listCombattant.getCombattant(5).getNom());
    	}	
    	if (listCombattant.getCombattant(0).getNom().equals("Vide")){
    		j2choix1 = new JButton("Vide");
    	}
    	else{
    		j2choix1 = new JButton(listCombattant.getCombattant(0).getNom());
    	}	
    	if (listCombattant.getCombattant(1).getNom().equals("Vide")){
    		j2choix2 = new JButton("Vide");
    	}
    	else{
    		j2choix2 = new JButton(listCombattant.getCombattant(1).getNom());
    	}	
    	if (listCombattant.getCombattant(2).getNom().equals("Vide")){
    		j2choix3 = new JButton("Vide");
    	}
    	else{
    		j2choix3 = new JButton(listCombattant.getCombattant(2).getNom());
    	}	
    	if (listCombattant.getCombattant(3).getNom().equals("Vide")){
    		j2choix4 = new JButton("Vide");
    	}
    	else{
    		j2choix4 = new JButton(listCombattant.getCombattant(3).getNom());
    	}	
    	if (listCombattant.getCombattant(4).getNom().equals("Vide")){
    		j2choix5 = new JButton("Vide");
    	}
    	else{
    		j2choix5 = new JButton(listCombattant.getCombattant(4).getNom());
    	}	
    	if (listCombattant.getCombattant(5).getNom().equals("Vide")){
    		j2choix6 = new JButton("Vide");
    	}
    	else{
    		j2choix6 = new JButton(listCombattant.getCombattant(5).getNom());
    	}	
    	JPanel j1lchoix = new JPanel(new GridLayout(1,7));
    	JPanel j1bchoix = new JPanel(new GridLayout(1,7));
    	JPanel j2lchoix = new JPanel(new GridLayout(1,7));
    	JPanel j2bchoix = new JPanel(new GridLayout(1,7));
    	for (int i = 0;i < 6;i ++){
    		if(listCombattant.getCombattant(i).getNom().equals("Vide")){
    			s1 = listCombattant.getCombattant(i).getNom();
    		}
    		else{
    			s1 = "Nom : "+listCombattant.getCombattant(i).getNom()+"\nClasse : "+
    	    			listCombattant.getCombattant(i).getClasse()+"\nNiveau "+
    	    			listCombattant.getCombattant(i).getExp()+"\n";
    			for (int j = 0; j < listCombattant.getCombattant(i).getNbCap();j++){
    				s1 = s1 + "Capacite"+(j+1)+" : "+listCombattant.getCombattant(i).getCapacite(j).getNom()+"\n";
    			}
    		}
    		if ( i == 0){
    	    	c1 = new JTextArea(s1);
    	    	c11 = new JTextArea(s1);
    		}
    		else if(i == 1){
    	    	c2 = new JTextArea(s1);
    	    	c22 = new JTextArea(s1);
    		}
    		else if(i == 2){
    	    	c3 = new JTextArea(s1);
    	    	c33 = new JTextArea(s1);
    		}
    		else if(i == 3){
    	    	c4 = new JTextArea(s1);
    	    	c44 = new JTextArea(s1);
    		}
    		else if(i == 4){
    	    	c5 = new JTextArea(s1);
    	    	c55 = new JTextArea(s1);
    		}
    		else if(i == 5){
    	    	c6 = new JTextArea(s1);
    	    	c66 = new JTextArea(s1);
    		}
    	}
    	JLabel lj1= new JLabel("Joueur 1");
    	j1lchoix.add(lj1);
    	j1lchoix.add(c1);
    	j1lchoix.add(c2);
    	j1lchoix.add(c3);
    	j1lchoix.add(c4);
    	j1lchoix.add(c5);
    	j1lchoix.add(c6);
    	centrej1.add(j1lchoix);
    	cj1 = new JTextArea("");
    	j1bchoix.add(cj1);
    	BouttonChoix1 bc1 = new BouttonChoix1();
    	j1choix1.addActionListener(bc1);
    	j1choix2.addActionListener(bc1);
    	j1choix3.addActionListener(bc1);
    	j1choix4.addActionListener(bc1);
    	j1choix5.addActionListener(bc1);
    	j1choix6.addActionListener(bc1);
    	j1bchoix.add(j1choix1);
    	j1bchoix.add(j1choix2);
    	j1bchoix.add(j1choix3);
    	j1bchoix.add(j1choix4);
    	j1bchoix.add(j1choix5);
    	j1bchoix.add(j1choix6);
    	centrej1.add(j1bchoix);
    	
    	JLabel lj2 = new JLabel("Joueur 2");
    	j2lchoix.add(lj2);
    	j2lchoix.add(c11);
    	j2lchoix.add(c22);
    	j2lchoix.add(c33);
    	j2lchoix.add(c44);
    	j2lchoix.add(c55);
    	j2lchoix.add(c66);
    	centrej2.add(j2lchoix);
    	cj2 = new JTextArea("");
    	j2bchoix.add(cj2);
    	BouttonChoix2 bc2 = new BouttonChoix2();
    	j2choix1.addActionListener(bc2);
    	j2choix2.addActionListener(bc2);
    	j2choix3.addActionListener(bc2);
    	j2choix4.addActionListener(bc2);
    	j2choix5.addActionListener(bc2);
    	j2choix6.addActionListener(bc2);
    	j2bchoix.add(j2choix1);
    	j2bchoix.add(j2choix2);
    	j2bchoix.add(j2choix3);
    	j2bchoix.add(j2choix4);
    	j2bchoix.add(j2choix5);
    	j2bchoix.add(j2choix6);
    	centrej1.add(j2bchoix);
    	
    	centrej2.add(j2bchoix);

    	centre.add(centrej1);
    	centre.add(centrej2);
        if(j1choix1.getText().equals("Vide")){
        	j1choix1.setEnabled(false);
    		j2choix1.setEnabled(false);
        }
        if(j1choix2.getText().equals("Vide")){
        	j1choix2.setEnabled(false);
    		j2choix2.setEnabled(false);
        }
        if(j1choix2.getText().equals("Vide")){
        	j1choix2.setEnabled(false);
    		j2choix2.setEnabled(false);
        }
        if(j1choix2.getText().equals("Vide")){
        	j1choix2.setEnabled(false);
    		j2choix2.setEnabled(false);
        }
        if(j1choix2.getText().equals("Vide")){
        	j1choix2.setEnabled(false);
    		j2choix2.setEnabled(false);
        }
        if(j1choix2.getText().equals("Vide")){
        	j1choix2.setEnabled(false);
    		j2choix2.setEnabled(false);
        }
    	return centre;
    	
    }
    class BouttonChoix1 implements ActionListener{
    	public void actionPerformed(ActionEvent e){
            String s = e.getActionCommand();
            String s1 = "";
            j2choix1.setEnabled(true);
       		j2choix2.setEnabled(true);
       		j2choix3.setEnabled(true);
       		j2choix4.setEnabled(true);
       		j2choix5.setEnabled(true);
       		j2choix6.setEnabled(true);
            if (s.equals(j1choix1.getText())){
            	j2choix1.setEnabled(false);
            	numCombattant1 = 0;
            	classej1 = listCombattant.getCombattant(0).getClasse();
            	cj1.setText(s1 = "Nom : "+listCombattant.getCombattant(0).getNom()+"\nClasse : "+
    	    			listCombattant.getCombattant(0).getClasse()+"\nNiveau "+
    	    			listCombattant.getCombattant(0).getExp()+"\n");
            }
            else if (s.equals(j1choix2.getText())){
            	j2choix2.setEnabled(false);
            	numCombattant1 = 1;
            	classej1 = listCombattant.getCombattant(1).getClasse();
            	cj1.setText(s1 = "Nom : "+listCombattant.getCombattant(1).getNom()+"\nClasse : "+
    	    			listCombattant.getCombattant(1).getClasse()+"\nNiveau "+
    	    			listCombattant.getCombattant(1).getExp()+"\n");
            }
            else if (s.equals(j1choix3.getText())){
            	j2choix3.setEnabled(false);
            	numCombattant1 = 2;
            	classej1 = listCombattant.getCombattant(2).getClasse();
            	cj1.setText(s1 = "Nom : "+listCombattant.getCombattant(2).getNom()+"\nClasse : "+
    	    			listCombattant.getCombattant(2).getClasse()+"\nNiveau "+
    	    			listCombattant.getCombattant(2).getExp()+"\n");
            }
            else if (s.equals(j1choix4.getText())){
            	j2choix4.setEnabled(false);
            	numCombattant1 = 3;
            	classej1 = listCombattant.getCombattant(3).getClasse();
            	cj1.setText(s1 = "Nom : "+listCombattant.getCombattant(3).getNom()+"\nClasse : "+
    	    			listCombattant.getCombattant(3).getClasse()+"\nNiveau "+
    	    			listCombattant.getCombattant(3).getExp()+"\n");
            }
            else if (s.equals(j1choix5.getText())){
            	j2choix5.setEnabled(false);
            	numCombattant1 = 4;
            	classej1 = listCombattant.getCombattant(4).getClasse();
            	cj1.setText(s1 = "Nom : "+listCombattant.getCombattant(4).getNom()+"\nClasse : "+
    	    			listCombattant.getCombattant(4).getClasse()+"\nNiveau "+
    	    			listCombattant.getCombattant(4).getExp()+"\n");
            }
            else if (s.equals(j1choix6.getText())){
            	j2choix6.setEnabled(false);
            	numCombattant1 = 5;
            	classej1 = listCombattant.getCombattant(5).getClasse();
            	cj1.setText(s1 = "Nom : "+listCombattant.getCombattant(5).getNom()+"\nClasse : "+
    	    			listCombattant.getCombattant(5).getClasse()+"\nNiveau "+
    	    			listCombattant.getCombattant(5).getExp()+"\n");
            }
            if(j2choix1.getText().equals("Vide"))
            	j2choix1.setEnabled(false);
            if(j2choix2.getText().equals("Vide"))
            	j2choix2.setEnabled(false);
            if(j2choix3.getText().equals("Vide"))
            	j2choix3.setEnabled(false);
            if(j2choix4.getText().equals("Vide"))
            	j2choix4.setEnabled(false);
            if(j2choix5.getText().equals("Vide"))
            	j2choix5.setEnabled(false);
            if(j2choix6.getText().equals("Vide"))
            	j2choix6.setEnabled(false);
    	}
    }
    
    class BouttonChoix2 implements ActionListener{
    	public void actionPerformed(ActionEvent e){
            String s = e.getActionCommand();
            String s1 = "";
            j1choix1.setEnabled(true);
       		j1choix2.setEnabled(true);
       		j1choix3.setEnabled(true);
       		j1choix4.setEnabled(true);
       		j1choix5.setEnabled(true);
       		j1choix6.setEnabled(true);
            if (s.equals(j2choix1.getText())){
            	j1choix1.setEnabled(false);
            	numCombattant2 = 0;
            	classej2 = listCombattant.getCombattant(0).getClasse();
            	cj2.setText(s1 = "Nom : "+listCombattant.getCombattant(0).getNom()+"\nClasse : "+
    	    			listCombattant.getCombattant(0).getClasse()+"\nNiveau "+
    	    			listCombattant.getCombattant(0).getExp()+"\n");
            }
            else if (s.equals(j2choix2.getText())){
            	j1choix2.setEnabled(false);
            	numCombattant2 = 1;
            	classej2 = listCombattant.getCombattant(1).getClasse();
            	cj2.setText(s1 = "Nom : "+listCombattant.getCombattant(1).getNom()+"\nClasse : "+
    	    			listCombattant.getCombattant(1).getClasse()+"\nNiveau "+
    	    			listCombattant.getCombattant(1).getExp()+"\n");
            }
            else if (s.equals(j2choix3.getText())){
            	j1choix3.setEnabled(false);
            	numCombattant2 = 2;
            	classej2 = listCombattant.getCombattant(2).getClasse();
            	cj2.setText(s1 = "Nom : "+listCombattant.getCombattant(2).getNom()+"\nClasse : "+
    	    			listCombattant.getCombattant(2).getClasse()+"\nNiveau "+
    	    			listCombattant.getCombattant(2).getExp()+"\n");
            }
            else if (s.equals(j2choix4.getText())){
            	j1choix4.setEnabled(false);
            	numCombattant2 = 3;
            	classej2 = listCombattant.getCombattant(3).getClasse();
            	cj2.setText(s1 = "Nom : "+listCombattant.getCombattant(3).getNom()+"\nClasse : "+
    	    			listCombattant.getCombattant(3).getClasse()+"\nNiveau "+
    	    			listCombattant.getCombattant(3).getExp()+"\n");
            }
            else if (s.equals(j2choix5.getText())){
            	j1choix5.setEnabled(false);
            	numCombattant2 = 4;
            	classej2 = listCombattant.getCombattant(4).getClasse();
            	cj2.setText(s1 = "Nom : "+listCombattant.getCombattant(4).getNom()+"\nClasse : "+
    	    			listCombattant.getCombattant(4).getClasse()+"\nNiveau "+
    	    			listCombattant.getCombattant(4).getExp()+"\n");
            }
            else if (s.equals(j2choix6.getText())){
            	j1choix6.setEnabled(false);
            	numCombattant2 = 5;
            	classej2 = listCombattant.getCombattant(5).getClasse();
            	cj2.setText(s1 = "Nom : "+listCombattant.getCombattant(5).getNom()+"\nClasse : "+
    	    			listCombattant.getCombattant(5).getClasse()+"\nNiveau "+
    	    			listCombattant.getCombattant(5).getExp()+"\n");
            }
            if(j1choix1.getText().equals("Vide"))
            	j1choix1.setEnabled(false);
            if(j1choix2.getText().equals("Vide"))
            	j1choix2.setEnabled(false);
            if(j1choix3.getText().equals("Vide"))
            	j1choix3.setEnabled(false);
            if(j1choix4.getText().equals("Vide"))
            	j1choix4.setEnabled(false);
            if(j1choix5.getText().equals("Vide"))
            	j1choix5.setEnabled(false);
            if(j1choix6.getText().equals("Vide"))
            	j1choix6.setEnabled(false);
            
            
    	}
    }
    
    class BoutonConfirmer implements ActionListener{
    	public void actionPerformed(ActionEvent e){
            String s = e.getActionCommand();
    		if(s.equals("Confirmer")){
    			if(cj1.getText().equals("")||cj2.getText().equals("")){
    				JOptionPane.showMessageDialog(c, "Veuillez Choisir 2 Combattant !");
    			}
    			else{
    				if (classej1.equals("Guerrier")){
    					combattant1 = new Guerrier(listCombattant.getCombattant(numCombattant1));
    				}
    				else if (classej1.equals("Mage")){
    					combattant1 = new Mage(listCombattant.getCombattant(numCombattant1));
    				}
    				else if (classej1.equals("Chasseur")){
    					combattant1 = new Chasseur(listCombattant.getCombattant(numCombattant1));
    				}
    				if (classej2.equals("Guerrier")){
    					combattant2 = new Guerrier(listCombattant.getCombattant(numCombattant1));
    				}
    				else if (classej2.equals("Mage")){
    					combattant2 = new Mage(listCombattant.getCombattant(numCombattant1));
    				}
    				else if (classej2.equals("Chasseur")){
    					combattant2 = new Chasseur(listCombattant.getCombattant(numCombattant1));
    				}
    	/*	Duel duel = new Duel(combattant1,combattant2);*/
    			}
    		}
            if(s.equals("Quitter"))
                System.exit(0);
    	}
    }
    
    class BoutonCreerCombattant implements ActionListener{
    	public void actionPerformed(ActionEvent e){
            String s = e.getActionCommand();
            if(s.equals("Nouveau Slot1")){
            	cc = new CreationCombattant("Medieval Duel",50,50,Jouer.this.getWidth(),Jouer.this.getHeight(),0);
                cc.setVisible(true);
                Jouer.this.setVisible(false);
            }
            if(s.equals("Nouveau Slot2")){
            	cc = new CreationCombattant("Medieval Duel",50,50,Jouer.this.getWidth(),Jouer.this.getHeight(),1);
                cc.setVisible(true);
                Jouer.this.setVisible(false);
            }
            if(s.equals("Nouveau Slot3")){
            	cc = new CreationCombattant("Medieval Duel",50,50,Jouer.this.getWidth(),Jouer.this.getHeight(),2);
                cc.setVisible(true);
                Jouer.this.setVisible(false);
            }
            if(s.equals("Nouveau Slot4")){
            	 cc = new CreationCombattant("Medieval Duel",50,50,Jouer.this.getWidth(),Jouer.this.getHeight(),3);
                 cc.setVisible(true);
                 Jouer.this.setVisible(false);
            }
            if(s.equals("Nouveau Slot5")){
            	cc = new CreationCombattant("Medieval Duel",50,50,Jouer.this.getWidth(),Jouer.this.getHeight(),4);
                cc.setVisible(true);
                Jouer.this.setVisible(false);
            }
            if(s.equals("Nouveau Slot6")){
            	cc = new CreationCombattant("Medieval Duel",50,50,Jouer.this.getWidth(),Jouer.this.getHeight(),5);
                cc.setVisible(true);
                Jouer.this.setVisible(false);
            }
    	}
    }
    
    
    
    public void init() {
    	c = this.getContentPane();
    	try {
			JPanel j1 = this.creerPanelCentre();
			c.add(j1,"Center");
			JPanel j2 = this.creerPanelSud();
			c.add(j2,"South");
		} catch (IOException e) {
			e.printStackTrace();
		}
    	

    }



}