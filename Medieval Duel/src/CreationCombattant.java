import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

public class CreationCombattant extends JFrame {
	
	Jouer jeu1;
	
    private String classe;
    
    private int slot;
    
    private LivreCapacite livreCapacite;
    
    private ListeCombattant listeCombattant;
    
    private Container c;
    
    private JTextArea listCapacite;
    
    private JPanel j1;
    
    private JPanel j2;
    
    private JPanel j3;

    private JLabel lAffichePointRestant;

    private JTextField tNom;

    private JLabel lPointForce;

    private JLabel lPointDexterite;

    private JLabel lPointIntel;

    private JLabel lPointConcentration;

    private JButton bForceMoin10;

    private JButton bForceMoin1;

    private JButton bForcePlus1;

    private JButton bForcePlus10;

    private JButton bDexteriteMoin10;

    private JButton bDexteriteMoin1;

    private JButton bDexteritePlus1;

    private JButton bDexteritePlus10;

    private JButton bIntelMoin10;

    private JButton bIntelMoin1;

    private JButton bIntelPlus1;

    private JButton bIntelPlus10;

    private JButton bConcentrationMoin10;

    private JButton bConcentrationMoin1;

    private JButton bConcentrationPlus1;

    private JButton bConcentrationPlus10;
    
    JTextField gCapacite1;
    
    JTextField gCapacite2;

    public Combattant combattant;
    
    public Mage mage;

    public CreationCombattant(String titre, int x, int y, int w, int h,int i) {
        super(titre);
        this.slot = i;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(x,y,w,h);;;
        this.init();
        this.setVisible(true);
    }

    public JPanel creerPanelOuest() {
        JPanel ouest = new JPanel(new GridLayout(9,1,5,5));
        JPanel pNom = new JPanel(new FlowLayout());
        JLabel lNom = new JLabel("Nom");
        pNom.add(lNom);
        tNom = new JTextField(10);
        pNom.add(tNom);
        ouest.add(pNom);
        ContrainteListener bContraint = new ContrainteListener();
        
        JPanel pForce = new JPanel(new FlowLayout());
        BoutonForce bForce = new BoutonForce();
        JLabel lForce = new JLabel("Force");
        pForce.add(lForce);
        lForce.setPreferredSize(new Dimension(80,30));
        bForceMoin10 = new JButton("-10");
        pForce.add(bForceMoin10);
        bForceMoin1 = new JButton("-1");
        pForce.add(bForceMoin1);
        
        lPointForce = new JLabel("0");
        pForce.add(lPointForce);
        lPointForce.setPreferredSize(new Dimension(20,20));
        bForcePlus1 = new JButton("+1");
        pForce.add(bForcePlus1);
        bForcePlus10 = new JButton("+10");
        pForce.add(bForcePlus10);
        
        
        bForceMoin1.addActionListener(bContraint);
        bForceMoin10.addActionListener(bContraint);
        bForcePlus10.addActionListener(bContraint);
        bForcePlus1.addActionListener(bContraint);
        bForcePlus10.addActionListener(bForce);
        bForceMoin1.addActionListener(bForce);
        bForcePlus1.addActionListener(bForce);
        bForceMoin10.addActionListener(bForce);
        ouest.add(pForce);
        
        
        
        
        JPanel pDexterite = new JPanel(new FlowLayout());
        BoutonDexterite bDexterite = new BoutonDexterite();
        JLabel lDexterite = new JLabel("Dexterite");
        pDexterite.add(lDexterite);
        lDexterite.setPreferredSize(new Dimension(80,30));
        bDexteriteMoin10 = new JButton("-10");
        pDexterite.add(bDexteriteMoin10);
        bDexteriteMoin1 = new JButton("-1");
        pDexterite.add(bDexteriteMoin1);
        lPointDexterite = new JLabel("0");
        pDexterite.add(lPointDexterite);
        lPointDexterite.setPreferredSize(new Dimension(20,20));
        bDexteritePlus1 = new JButton("+1");
        pDexterite.add(bDexteritePlus1);
        bDexteritePlus10 = new JButton("+10");
        pDexterite.add(bDexteritePlus10);
        
        bDexteriteMoin1.addActionListener(bContraint);
        bDexteriteMoin10.addActionListener(bContraint);
        bDexteritePlus10.addActionListener(bContraint);
        bDexteritePlus1.addActionListener(bContraint);
        bDexteritePlus10.addActionListener(bDexterite);
        bDexteritePlus1.addActionListener(bDexterite);
        bDexteriteMoin1.addActionListener(bDexterite);
        bDexteriteMoin10.addActionListener(bDexterite);
        ouest.add(pDexterite);
        
        JPanel pIntel = new JPanel(new FlowLayout());
        BoutonIntel bIntel = new BoutonIntel();
        JLabel lIntel = new JLabel("Intel");
        pIntel.add(lIntel);
        lIntel.setPreferredSize(new Dimension(80,30));
        bIntelMoin10 = new JButton("-10");
        pIntel.add(bIntelMoin10);
        bIntelMoin1 = new JButton("-1");
        pIntel.add(bIntelMoin1);
        lPointIntel = new JLabel("0");
        pIntel.add(lPointIntel);
        lPointIntel.setPreferredSize(new Dimension(20,20));
        bIntelPlus1 = new JButton("+1");
        pIntel.add(bIntelPlus1);
        bIntelPlus10 = new JButton("+10");
        pIntel.add(bIntelPlus10);
        
        bIntelMoin1.addActionListener(bContraint);
        bIntelMoin10.addActionListener(bContraint);
        bIntelPlus10.addActionListener(bContraint);
        bIntelPlus1.addActionListener(bContraint);
        
        bIntelPlus10.addActionListener(bIntel);
        bIntelPlus1.addActionListener(bIntel);
        bIntelMoin1.addActionListener(bIntel);
        bIntelMoin10.addActionListener(bIntel);
        
        
        ouest.add(pIntel);
        
        JPanel pConcentration = new JPanel(new FlowLayout());
        BoutonConcentration bConcentration = new BoutonConcentration();
        JLabel lConcentration = new JLabel("Concentration");
        pConcentration.add(lConcentration);
        lConcentration.setPreferredSize(new Dimension(80,30));
        bConcentrationMoin10 = new JButton("-10");
        pConcentration.add(bConcentrationMoin10);
        bConcentrationMoin1 = new JButton("-1");
        pConcentration.add(bConcentrationMoin1);
        lPointConcentration = new JLabel("0");
        pConcentration.add(lPointConcentration);
        lPointConcentration.setPreferredSize(new Dimension(20,20));
        bConcentrationPlus1 = new JButton("+1");
        pConcentration.add(bConcentrationPlus1);
        bConcentrationPlus10 = new JButton("+10");
        pConcentration.add(bConcentrationPlus10);
        
        bConcentrationMoin1.addActionListener(bContraint);
        bConcentrationMoin10.addActionListener(bContraint);
        bConcentrationPlus10.addActionListener(bContraint);
        bConcentrationPlus1.addActionListener(bContraint);
        
        bConcentrationMoin10.addActionListener(bConcentration);
        bConcentrationMoin1.addActionListener(bConcentration);
        bConcentrationPlus1.addActionListener(bConcentration);
        bConcentrationPlus10.addActionListener(bConcentration);
        
        ouest.add(pConcentration);
        
        JPanel pCapacite1 = new JPanel(new FlowLayout());
        JLabel lCapacite1 = new JLabel("Nom Capacite 1");
        pCapacite1.add(lCapacite1);
        gCapacite1 = new JTextField(10);
        pCapacite1.add(gCapacite1);
        ouest.add(pCapacite1);
        
        JPanel pCapacite2 = new JPanel(new FlowLayout());
        JLabel lCapacite2 = new JLabel("Nom Capacite 2");
        pCapacite2.add(lCapacite2);
        gCapacite2 = new JTextField(10);
        pCapacite2.add(gCapacite2);
        ouest.add(pCapacite2);
        
        JPanel pPointRestant = new JPanel(new FlowLayout());
        JLabel lPointRestant = new JLabel("PointRestant :");
        pPointRestant.add(lPointRestant);
        lAffichePointRestant = new JLabel("101");
        pPointRestant.add(lAffichePointRestant);
        ouest.add(pPointRestant);
        
        JPanel pComfirmer = new JPanel (new FlowLayout());
        JButton bComfirmer = new JButton("Confirmer");
        pComfirmer.add(bComfirmer);
        BoutonConfirmer bcComfirmer = new BoutonConfirmer();
        bComfirmer.addActionListener(bcComfirmer);
        ouest.add(pComfirmer);
        return ouest;
    }
    
    class BoutonConfirmer implements ActionListener{
    	
        public void actionPerformed(ActionEvent e) {
        		try {
					listeCombattant = new ListeCombattant();
					for (int i = 0; i < ListeCombattant.MAXCOMB;i++){
						System.out.println(listeCombattant.getCombattant(i).getNom());
					}
				} catch (IOException e2) {
					e2.printStackTrace();
				}
        		LivreCapacite choixCap = new LivreCapacite();
        		boolean bonCap1 = false;
        		boolean bonCap2 = false;
        		for(int i = 0; i < 20; i ++){
        			if(choixCap.getCapacite(i).getNom().equals(gCapacite1.getText()))
        				bonCap1 = true;
        			if(choixCap.getCapacite(i).getNom().equals(gCapacite2.getText()))
        				bonCap2 = true;
        		}
        		
        		if(classe.equals("Guerrier") && gCapacite1.getText().equals("Purge") ||
        				gCapacite1.getText().equals("Resurection") ||gCapacite1.getText().equals("Lumi¨¨re Divine") ||
        				gCapacite1.getText().equals("Purge") ||gCapacite1.getText().equals("Resurection") ||
        				gCapacite1.getText().equals("Lumi¨¨re Divine")){
        			
        		}
        		if(tNom.getText().equals("")){
        			JOptionPane.showMessageDialog(c, "Vous n'avez pas choisi de nom pour votre Personnage!");
        		}
        		else if(tNom.getText().equals(listeCombattant.getCombattant(0).getNom()) ||
        				tNom.getText().equals(listeCombattant.getCombattant(1).getNom()) ||
        				tNom.getText().equals(listeCombattant.getCombattant(2).getNom()) ||
        				tNom.getText().equals(listeCombattant.getCombattant(3).getNom()) ||
        				tNom.getText().equals(listeCombattant.getCombattant(4).getNom()) ||
        				tNom.getText().equals(listeCombattant.getCombattant(5).getNom())){
        				JOptionPane.showMessageDialog(c, "Ce nom est d¨¦ja Pris!");
        		}
        		else if((101 !=(Integer.parseInt(lPointForce.getText())+Integer.parseInt(lPointDexterite.getText())+
        				Integer.parseInt(lPointIntel.getText())+Integer.parseInt(lPointConcentration.getText())))){
        			JOptionPane.showMessageDialog(c, "Vous n'avez pas depense toutes vos point de caracteristique");
        		}
        		else if(gCapacite1.getText().equals("") || gCapacite2.getText().equals("")){
        			JOptionPane.showMessageDialog(c, "Vous n'avez pas choisi toutes vos capacites");
        		}
        		else if(!bonCap1){
        			JOptionPane.showMessageDialog(c, "Votre Premiere Capacite N'existe pas!");
        		}
        		else if(!bonCap2){
        			JOptionPane.showMessageDialog(c, "Votre Deuxieme Capacite N'existe pas!");
        		}
        		else if(gCapacite1.getText().equals(gCapacite2.getText())){
        			JOptionPane.showMessageDialog(c, "Vous avez Choisi deux fois la meme capacite!");
        		}
        		else if(!choixCap.getCapacite(gCapacite1.getText()).getType().equals("Arme") &&
        				!choixCap.getCapacite(gCapacite1.getText()).getType().equals("SortAtt")&&
        				!choixCap.getCapacite(gCapacite2.getText()).getType().equals("Arme")&&
        				!choixCap.getCapacite(gCapacite2.getText()).getType().equals("SortAtt")){
        			JOptionPane.showMessageDialog(c, "Il vous faut au minimun une capacite d'attaque");	
        		}
        		else if(classe.equals("Guerrier") && gCapacite1.getText().equals("Purge") ||
        				gCapacite1.getText().equals("Resurection") ||gCapacite1.getText().equals("Lumi¨¨re Divine") ||
        				gCapacite1.getText().equals("Purge") ||gCapacite1.getText().equals("Resurection") ||
        				gCapacite1.getText().equals("Lumi¨¨re Divine")){
        			bonCap1 = false;
        			bonCap2 = false;
        			JOptionPane.showMessageDialog(c, "Une de vos Capacite est interdite pour votre classe!");	
        		}else{
        			Capacite cap1;
        			if(choixCap.getCapacite(gCapacite1.getText()).getType().equals("Arme")){
            			cap1 = new Arme(choixCap.getCapacite(gCapacite1.getText()));;
        			}
        			else if(choixCap.getCapacite(gCapacite1.getText()).getType().equals("Bouclier")){
            			cap1 = new Bouclier(choixCap.getCapacite(gCapacite1.getText()));
        			}
        			else if(choixCap.getCapacite(gCapacite1.getText()).getType().equals("Remede")){
            			cap1 = new Remede(choixCap.getCapacite(gCapacite1.getText()));
        			}
        			else if(choixCap.getCapacite(gCapacite1.getText()).getType().equals("SortAtt")){
            			cap1 = new SortAtt(choixCap.getCapacite(gCapacite1.getText()));
        			}
        			else if(choixCap.getCapacite(gCapacite1.getText()).getType().equals("SortDef")){
            			cap1 = new SortDef(choixCap.getCapacite(gCapacite1.getText()));
        			}
        			else {
        				cap1 = new SortSoin(choixCap.getCapacite(gCapacite1.getText()));
        			}
        			
        			Capacite cap2;
        			if(choixCap.getCapacite(gCapacite2.getText()).getType().equals("Arme")){
            			cap2 = new Arme(choixCap.getCapacite(gCapacite2.getText()));
            			
        			}
        			else if(choixCap.getCapacite(gCapacite2.getText()).getType().equals("Bouclier")){
            			cap2 = new Bouclier(choixCap.getCapacite(gCapacite2.getText()));
        			}
        			else if(choixCap.getCapacite(gCapacite2.getText()).getType().equals("Remede")){
            			cap2 = new Remede(choixCap.getCapacite(gCapacite2.getText()));
        			}
        			else if(choixCap.getCapacite(gCapacite2.getText()).getType().equals("SortAtt")){
            			cap2 = new SortAtt(choixCap.getCapacite(gCapacite2.getText()));
        			}
        			else if(choixCap.getCapacite(gCapacite2.getText()).getType().equals("SortDef")){
            			cap2 = new SortDef(choixCap.getCapacite(gCapacite2.getText()));
        			}
        			else {
        				cap2 = new SortSoin(choixCap.getCapacite(gCapacite2.getText()));
        			}
        					if(classe.equals("Guerrier")){
        						Combattant nSauvegarde = new Guerrier(tNom.getText(),Integer.parseInt(lPointForce.getText()),
        								Integer.parseInt(lPointDexterite.getText()),Integer.parseInt(lPointIntel.getText()),
        								Integer.parseInt(lPointConcentration.getText()),cap1,cap2); 
        						System.out.println(nSauvegarde.toString());
        						
        						try {
									listeCombattant.sauvegarderCombattant(nSauvegarde,slot);
					        		jeu1 = new Jouer("Medieval Duel",50,50,CreationCombattant.this.getWidth(),CreationCombattant.this.getHeight());
					        		jeu1.setVisible(true);
					        		CreationCombattant.this.setVisible(false);
								} catch (IOException e1) {
									e1.printStackTrace();
								}
        								
        					}
        					else if(classe.equals("Mage")){
        						Combattant nSauvegarde = new Mage(tNom.getText(),Integer.parseInt(lPointForce.getText()),
        								Integer.parseInt(lPointDexterite.getText()),Integer.parseInt(lPointIntel.getText()),
        								Integer.parseInt(lPointConcentration.getText()),cap1,cap2);
        						try {
									listeCombattant.sauvegarderCombattant(nSauvegarde,slot);
					        		jeu1 = new Jouer("Medieval Duel",50,50,CreationCombattant.this.getWidth(),CreationCombattant.this.getHeight());
					        		jeu1.setVisible(true);
					        		CreationCombattant.this.setVisible(false);
								} catch (IOException e1) {
									e1.printStackTrace();
								}
        								
        					}
        					else if(classe.equals("Chasseur")){
        						Combattant nSauvegarde = new Chasseur(tNom.getText(),Integer.parseInt(lPointForce.getText()),
        								Integer.parseInt(lPointDexterite.getText()),Integer.parseInt(lPointIntel.getText()),
        								Integer.parseInt(lPointConcentration.getText()),cap1,cap2);
        						try {
									listeCombattant.sauvegarderCombattant(nSauvegarde,slot);
					        		jeu1 = new Jouer("Medieval Duel",50,50,CreationCombattant.this.getWidth(),CreationCombattant.this.getHeight());
					        		jeu1.setVisible(true);
					        		CreationCombattant.this.setVisible(false);
								} catch (IOException e1) {
									e1.printStackTrace();
								}
        								
        					}
        		
        				}
        			}
        		
       
        		
        
    }

    public JPanel creerPanelEst(){
    	JPanel est = new JPanel(new GridLayout(5,4,10,10));
    	livreCapacite = new LivreCapacite();
    	Capacite cSort;
    	int i;
    	for (i = 0; i < 20; i ++){
    		
    		cSort = livreCapacite.getCapacite(i);
    		if(classe.equals("Guerrier") && !(cSort.getType().equals("SortSoin"))){
    			listCapacite = new JTextArea(cSort.toString());
    			listCapacite.setEditable(false);
    			est.add(listCapacite);
    		}
    		else if (!(classe.equals("Guerrier"))) {
    			listCapacite = new JTextArea(cSort.toString());
    			listCapacite.setEditable(false);
    			est.add(listCapacite);	
    		}
    	}
    	return est;
    }
    public JPanel creerPanelSud() {
        JPanel sud = new JPanel(new FlowLayout());
        ChangementClasse changement = new ChangementClasse();
        JButton guerrier = new JButton("Guerrier");
        sud.add(guerrier);
        guerrier.addActionListener(changement);
        JButton mage = new JButton("Mage");
        sud.add(mage);
        mage.addActionListener(changement);
        JButton chasseur = new JButton("Chasseur");;
        sud.add(chasseur);
        chasseur.addActionListener(changement);
        return sud;
    }

    public void init() {
        c = this.getContentPane();
        j1 = this.creerPanelSud();
        c.add(j1,"South");
        j2 = this.creerPanelOuest();
        c.add(j2,"West");	
        j2.setVisible(false);
    }

    class BoutonForce implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            int valeur;
            if(s.equals("+10")){
                valeur = Integer.parseInt(lPointForce.getText());
                valeur = valeur +10;
                lPointForce.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())-10));
            }
            if(s.equals("+1")){
                valeur = Integer.parseInt(lPointForce.getText());
                valeur = valeur +1;
                lPointForce.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())-1));
            }
            if(s.equals("-10")){
                valeur = Integer.parseInt(lPointForce.getText());
                valeur = valeur -10;
                lPointForce.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())+10));
            }
            if(s.equals("-1"))
            {
                valeur = Integer.parseInt(lPointForce.getText());
                valeur = valeur -1;
                lPointForce.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())+1));
            }
        }

    }


    class BoutonDexterite implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            int valeur;
            if(s.equals("+10")){
                valeur = Integer.parseInt(lPointDexterite.getText());
                valeur = valeur +10;
                lPointDexterite.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())-10));
            }
            if(s.equals("+1")){
                valeur = Integer.parseInt(lPointDexterite.getText());
                valeur = valeur +1;
                lPointDexterite.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())-1));
            }
            if(s.equals("-10")){
                valeur = Integer.parseInt(lPointDexterite.getText());
                valeur = valeur -10;
                lPointDexterite.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())+10));
            }
            if(s.equals("-1"))
            {
                valeur = Integer.parseInt(lPointDexterite.getText());
                valeur = valeur -1;
                lPointDexterite.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())+1));
            }
        }

    }


    class BoutonIntel implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            int valeur;
            if(s.equals("+10")){
                valeur = Integer.parseInt(lPointIntel.getText());
                valeur = valeur +10;
                lPointIntel.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())-10));
            }
            if(s.equals("+1")){
                valeur = Integer.parseInt(lPointIntel.getText());
                valeur = valeur +1;
                lPointIntel.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())-1));
            }
            if(s.equals("-10")){
                valeur = Integer.parseInt(lPointIntel.getText());
                valeur = valeur -10;
                lPointIntel.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())+10));
            }
            if(s.equals("-1"))
            {
                valeur = Integer.parseInt(lPointIntel.getText());
                valeur = valeur -1;
                lPointIntel.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())+1));
            }
        }

    }


    class BoutonConcentration implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            int valeur;
            
            if(s.equals("+10")){
                valeur = Integer.parseInt(lPointConcentration.getText());
                valeur = valeur +10;
                lPointConcentration.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())-10));
            }
            if(s.equals("+1")){
                valeur = Integer.parseInt(lPointConcentration.getText());
                valeur = valeur +1;
                lPointConcentration.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())-1));
            }
            if(s.equals("-10")){
                valeur = Integer.parseInt(lPointConcentration.getText());
                valeur = valeur -10;
                lPointConcentration.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())+10));
            }
            if(s.equals("-1"))
            {
                valeur = Integer.parseInt(lPointConcentration.getText());
                valeur = valeur -1;
                lPointConcentration.setText(String.valueOf(valeur));
                lAffichePointRestant.setText(String.valueOf(Integer.parseInt(lAffichePointRestant.getText())+1));
            }
        }

    }


    class ContrainteListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (classe.equals("Chasseur")){
                if(Integer.parseInt(lPointForce.getText())-1 < 20)
                    bForceMoin1.setEnabled(false);
                else
                    bForceMoin1.setEnabled(true);
                if(Integer.parseInt(lPointForce.getText())-10 < 20)
                    bForceMoin10.setEnabled(false);
                else 
                    bForceMoin10.setEnabled(true);
                if(Integer.parseInt(lPointForce.getText())+1 > 41)
                    bForcePlus1.setEnabled(false);
                else 
                    bForcePlus1.setEnabled(true);
                if(Integer.parseInt(lPointForce.getText())+10 > 41)
                    bForcePlus10.setEnabled(false);
                else 
                    bForcePlus10.setEnabled(true);
                
                if(Integer.parseInt(lPointDexterite.getText())-1 < 20)
                    bDexteriteMoin1.setEnabled(false);
                else 
                    bDexteriteMoin1.setEnabled(true);
                if(Integer.parseInt(lPointDexterite.getText())-10 < 20)
                    bDexteriteMoin10.setEnabled(false);
                else 
                    bDexteriteMoin10.setEnabled(true);
                if(Integer.parseInt(lPointDexterite.getText())+1 > 41)
                    bDexteritePlus1.setEnabled(false);
                else 
                    bDexteritePlus1.setEnabled(true);
                if(Integer.parseInt(lPointDexterite.getText())+10 > 41)
                    bDexteritePlus10.setEnabled(false);
                else 
                    bDexteritePlus10.setEnabled(true);
                
                if(Integer.parseInt(lPointIntel.getText())-1 < 20)
                    bIntelMoin1.setEnabled(false);
                else 
                    bIntelMoin1.setEnabled(true);
                if(Integer.parseInt(lPointIntel.getText())-10 < 20)
                    bIntelMoin10.setEnabled(false);
                else 
                    bIntelMoin10.setEnabled(true);
                if(Integer.parseInt(lPointIntel.getText())+1 > 41)
                    bIntelPlus1.setEnabled(false);
                else 
                    bIntelPlus1.setEnabled(true);
                if(Integer.parseInt(lPointIntel.getText())+10 > 41)
                    bIntelPlus10.setEnabled(false);
                else 
                    bIntelPlus10.setEnabled(true);
                
                if(Integer.parseInt(lPointConcentration.getText())-1 < 20)
                    bConcentrationMoin1.setEnabled(false);
                else 
                    bConcentrationMoin1.setEnabled(true);
                if(Integer.parseInt(lPointConcentration.getText())-10 < 20)
                    bConcentrationMoin10.setEnabled(false);
                else 
                    bConcentrationMoin10.setEnabled(true);
                if(Integer.parseInt(lPointConcentration.getText())+1 > 41)
                    bConcentrationPlus1.setEnabled(false);
                else 
                    bConcentrationPlus1.setEnabled(true);
                if(Integer.parseInt(lPointConcentration.getText())+10 > 41)
                    bConcentrationPlus10.setEnabled(false);
                else 
                    bConcentrationPlus10.setEnabled(true);
            }
            else if(classe.equals("Mage")){
                    if(Integer.parseInt(lPointForce.getText())-1 < 1)
                        bForceMoin1.setEnabled(false);
                    else
                        bForceMoin1.setEnabled(true);
                    if(Integer.parseInt(lPointForce.getText())-10 < 10)
                        bForceMoin10.setEnabled(false);
                    else 
                        bForceMoin10.setEnabled(true);
                    if(Integer.parseInt(lPointForce.getText())+1 > Integer.parseInt(lPointIntel.getText())-15 ||
                            Integer.parseInt(lPointForce.getText())+1 > Integer.parseInt(lPointConcentration.getText())-15 )
                        bForcePlus1.setEnabled(false);
                    else 
                        bForcePlus1.setEnabled(true);
                    if((Integer.parseInt(lPointForce.getText())+10 > Integer.parseInt(lPointIntel.getText())-15 ||
                            Integer.parseInt(lPointForce.getText())+10 > Integer.parseInt(lPointConcentration.getText())-15 ))
                        bForcePlus10.setEnabled(false);
                    else 
                        bForcePlus10.setEnabled(true);
                    
                    if(Integer.parseInt(lPointDexterite.getText())-1 < 1)
                        bDexteriteMoin1.setEnabled(false);
                    else 
                        bDexteriteMoin1.setEnabled(true);
                    if(Integer.parseInt(lPointDexterite.getText())-10 < 10)
                        bDexteriteMoin10.setEnabled(false);
                    else 
                        bDexteriteMoin10.setEnabled(true);
                    if((Integer.parseInt(lPointDexterite.getText())+1 > Integer.parseInt(lPointIntel.getText())-15 ||
                            Integer.parseInt(lPointDexterite.getText())+1 > Integer.parseInt(lPointConcentration.getText())-15 ))
                        bDexteritePlus1.setEnabled(false);
                    else 
                        bDexteritePlus1.setEnabled(true);
                    if((Integer.parseInt(lPointDexterite.getText())+10 > Integer.parseInt(lPointIntel.getText())-15 ||
                            Integer.parseInt(lPointDexterite.getText())+10 > Integer.parseInt(lPointConcentration.getText())-15 ))
                        bDexteritePlus10.setEnabled(false);
                    else 
                        bDexteritePlus10.setEnabled(true);
                    
                    if(Integer.parseInt(lPointIntel.getText())-1 < CreationCombattant.this.mage.maxForceDex()+15)
                        bIntelMoin1.setEnabled(false);
                    else 
                        bIntelMoin1.setEnabled(true);
                    if(Integer.parseInt(lPointIntel.getText())-10 < CreationCombattant.this.mage.maxForceDex()+15)
                        bIntelMoin10.setEnabled(false);
                    else 
                        bIntelMoin10.setEnabled(true);
            
                        bIntelPlus1.setEnabled(true);
                        
                        bIntelPlus10.setEnabled(true);
                    
                    if(Integer.parseInt(lPointConcentration.getText())-1 < CreationCombattant.this.mage.maxForceDex()+15)
                        bConcentrationMoin1.setEnabled(false);
                    else 
                        bConcentrationMoin1.setEnabled(true);
                    if(Integer.parseInt(lPointConcentration.getText())-10 < CreationCombattant.this.mage.maxForceDex()+15)
                        bConcentrationMoin10.setEnabled(false);
                    else 
                        bConcentrationMoin10.setEnabled(true);
            
                        bConcentrationPlus1.setEnabled(true);
                        
                        bConcentrationPlus10.setEnabled(true);
                        CreationCombattant.this.mage = new Mage(tNom.getText(),Integer.parseInt(lPointForce.getText()),Integer.parseInt(lPointDexterite.getText())
                                ,Integer.parseInt(lPointIntel.getText()),Integer.parseInt(lPointConcentration.getText()));    
                        
            }
            else if(classe.equals("Guerrier")){
                if(Integer.parseInt(lPointForce.getText())-1 < Integer.parseInt(lPointDexterite.getText())+10)
                    bForceMoin1.setEnabled(false);
                else
                    bForceMoin1.setEnabled(true);
                if(Integer.parseInt(lPointForce.getText())-10 < Integer.parseInt(lPointDexterite.getText())+10)
                    bForceMoin10.setEnabled(false);
                else 
                    bForceMoin10.setEnabled(true);
            
                    bForcePlus1.setEnabled(true);
            
                    bForcePlus10.setEnabled(true);
                
                if(Integer.parseInt(lPointDexterite.getText())-1 < Integer.parseInt(lPointIntel.getText())
                        || Integer.parseInt(lPointIntel.getText()) -1 < 1)
                    bDexteriteMoin1.setEnabled(false);
                else 
                    bDexteriteMoin1.setEnabled(true);
                if(Integer.parseInt(lPointDexterite.getText())-10 < Integer.parseInt(lPointIntel.getText())
                        || Integer.parseInt(lPointDexterite.getText()) -10 < 10)
                    bDexteriteMoin10.setEnabled(false);
                else 
                    bDexteriteMoin10.setEnabled(true);
                if(Integer.parseInt(lPointDexterite.getText())+11 > Integer.parseInt(lPointForce.getText()))
                    bDexteritePlus1.setEnabled(false);
                else 
                    bDexteritePlus1.setEnabled(true);
                if(Integer.parseInt(lPointDexterite.getText())+20 > Integer.parseInt(lPointForce.getText()))
                    bDexteritePlus10.setEnabled(false);
                else 
                    bDexteritePlus10.setEnabled(true);
                
                if(Integer.parseInt(lPointConcentration.getText()) > Integer.parseInt(lPointIntel.getText())+9
                        || Integer.parseInt(lPointIntel.getText()) -1 < 10)
                    bIntelMoin1.setEnabled(false);
                else 
                    bIntelMoin1.setEnabled(true);
                if(Integer.parseInt(lPointConcentration.getText()) > Integer.parseInt(lPointIntel.getText())
                        || Integer.parseInt(lPointIntel.getText()) -10 < 10)
                    bIntelMoin10.setEnabled(false);
                else 
                    bIntelMoin10.setEnabled(true);
                if(Integer.parseInt(lPointDexterite.getText()) < Integer.parseInt(lPointIntel.getText())+1)
                    bIntelPlus1.setEnabled(false);
                else 
                    bIntelPlus1.setEnabled(true);
                if(Integer.parseInt(lPointDexterite.getText()) < Integer.parseInt(lPointIntel.getText())+10)
                    bIntelPlus10.setEnabled(false);
                else
                    bIntelPlus10.setEnabled(true);
                
                if(Integer.parseInt(lPointConcentration.getText())-1 < 1)
                    bConcentrationMoin1.setEnabled(false);
                else
                    bConcentrationMoin1.setEnabled(true);
                if(Integer.parseInt(lPointConcentration.getText())-10 < 11)
                    bConcentrationMoin10.setEnabled(false);
                else 
                    bConcentrationMoin10.setEnabled(true);
                    
                if(Integer.parseInt(lPointConcentration.getText())+1 > Integer.parseInt(lPointIntel.getText())+10)
                    bConcentrationPlus1.setEnabled(false);
                else 
                    bConcentrationPlus1.setEnabled(true);
                if(Integer.parseInt(lPointConcentration.getText())+10 > Integer.parseInt(lPointIntel.getText())+10)
                    bConcentrationPlus10.setEnabled(false);
                else 
                    bConcentrationPlus10.setEnabled(true);
            }
            
            
            if (Integer.parseInt(lAffichePointRestant.getText()) < 10){
                bForcePlus10.setEnabled(false);
                bDexteritePlus10.setEnabled(false);
                bIntelPlus10.setEnabled(false);
                bConcentrationPlus10.setEnabled(false);
            }
            
            if (Integer.parseInt(lAffichePointRestant.getText()) < 1){
            bForcePlus1.setEnabled(false);
            bDexteritePlus1.setEnabled(false);
            bIntelPlus1.setEnabled(false);
            bConcentrationPlus1.setEnabled(false);
            }
        }

    }

    class ChangementClasse implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            j2.setVisible(true);
            if(s.equals("Guerrier")){
                lPointForce.setText("41");
                lPointDexterite.setText("21");
                lPointIntel.setText("11");
                lPointConcentration.setText("11");
                lAffichePointRestant.setText("17");
                classe = "Guerrier";
                bForceMoin10.setEnabled(true);
                bForceMoin1.setEnabled(true);
                bDexteriteMoin10.setEnabled(true);
                bDexteriteMoin1.setEnabled(true);
                bIntelMoin10.setEnabled(true);
                bIntelMoin1.setEnabled(true);
                bConcentrationMoin10.setEnabled(true);
                bConcentrationMoin1.setEnabled(true);
                bForcePlus10.setEnabled(true);
                bForcePlus1.setEnabled(true);
                bDexteritePlus10.setEnabled(true);
                bDexteritePlus1.setEnabled(true);
                bIntelPlus10.setEnabled(true);
                bIntelPlus1.setEnabled(true);
                bConcentrationPlus10.setEnabled(true);
                bConcentrationPlus1.setEnabled(true);
            }
                
            if(s.equals("Mage")){
                lPointForce.setText("5");
                lPointDexterite.setText("5");
                lPointIntel.setText("30");
                lPointConcentration.setText("30");
                lAffichePointRestant.setText("31");
                classe = "Mage";
                bForceMoin10.setEnabled(false);
                bForceMoin1.setEnabled(true);
                bDexteriteMoin10.setEnabled(false);
                bDexteriteMoin1.setEnabled(true);
                bIntelMoin10.setEnabled(false);
                bIntelMoin1.setEnabled(true);
                bConcentrationMoin10.setEnabled(false);
                bConcentrationMoin1.setEnabled(true);
                bForcePlus10.setEnabled(true);
                bForcePlus1.setEnabled(true);
                bDexteritePlus10.setEnabled(true);
                bDexteritePlus1.setEnabled(true);
                bIntelPlus10.setEnabled(true);
                bIntelPlus1.setEnabled(true);
                bConcentrationPlus10.setEnabled(true);
                bConcentrationPlus1.setEnabled(true);
                CreationCombattant.this.mage = new Mage(tNom.getText(),Integer.parseInt(lPointForce.getText()),Integer.parseInt(lPointDexterite.getText())
                        ,Integer.parseInt(lPointIntel.getText()),Integer.parseInt(lPointConcentration.getText()));
            }
            if(s.equals("Chasseur")){
                lPointForce.setText("20");
                lPointDexterite.setText("20");
                lPointIntel.setText("20");
                lPointConcentration.setText("20");
                lAffichePointRestant.setText("21");
                classe = "Chasseur";
                bForceMoin10.setEnabled(false);
                bForceMoin1.setEnabled(false);
                bDexteriteMoin10.setEnabled(false);
                bDexteriteMoin1.setEnabled(false);
                bIntelMoin10.setEnabled(false);
                bIntelMoin1.setEnabled(false);
                bConcentrationMoin10.setEnabled(false);
                bConcentrationMoin1.setEnabled(false);
                bForcePlus10.setEnabled(true);
                bForcePlus1.setEnabled(true);
                bDexteritePlus10.setEnabled(true);
                bDexteritePlus1.setEnabled(true);
                bIntelPlus10.setEnabled(true);
                bIntelPlus1.setEnabled(true);
                bConcentrationPlus10.setEnabled(true);
                bConcentrationPlus1.setEnabled(true);
                
            }
            
            j3 =CreationCombattant.this.creerPanelEst();
            c.add(j3,"East");
            j3.setVisible(true);
        }

    }

}
