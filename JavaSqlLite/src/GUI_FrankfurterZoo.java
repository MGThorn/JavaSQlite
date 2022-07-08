import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;


public class GUI_FrankfurterZoo {
	
	static SQL s = new SQL();

	private JFrame frmDatenbankDesFrankfurter;
	
	private JTextField textField_pfleger_pnummer;
	private JTextField textField_pfleger_vorname;
	private JTextField textField_pfleger_nachname;
	private JTextField textField_pfleger_gehalt;
	private JTextField textField_pfleger_gbdatum;
	private JTextField textField_pfleger_etdatum;
	private JTextField textField_pfleger_tnummer;
	private JTextField textField_pfleger_ort;
	private JTextField textField_pfleger_plz;
	private JTextField textField_pfleger_strasse;
	
	private JTextField textField_tiere_abgang;
	private JTextField textField_tiere_zugang;
	private JTextField textField_tiere_geschlecht;
	private JTextField textField_tiere_gbdatum;
	private JTextField textField_tiere_tname;
	
	private JTextField textField_gehege_gehegename;
	private JTextField textField_gehege_baujahr;
	private JTextField textField_gehege_flaeche;
	
	
	
	private JTextField textField_arten_bezeichnung;
	private JTextField textField_arten_lebensraum;
	private JTextField textField_arten_latbezeichnung;

	private JTextField textField_futter_bezeichnung;
	private JTextField textField_futterdetails_menge;
	private JTextField textField_futterdetails_uhrzeit;

	
	private JTextPane textPane_tiere_listausgabe;
	private JTextPane textPane_pfleger_listenausgabe;
	private JTextPane textPane_gehege_listenausgabe;
	private JTextPane textPane_arten_listenausgabe;
	private JTextPane textPane_futter_listenausgabe;
	private JTextPane textPane_futterdetails_listenausgabe;
	
	private String[] Art_Bezeichnung;
	private String[] Gehege_Name;
	private String[] Pfleger_Nummer;
	private String[] Tier_Name;
	private String[] Futter_Bezeichnung;
	
	private JComboBox comboBox_gehege_PNummerAuswahl;
	private JComboBox comboBox_Tier_ArtAuswahl;
	private JComboBox comboBox_Tier_GehegeAuswahl;
	private JComboBox comboBox_pflegt_PNummerAuswahl;
	private JComboBox comboBox_pflegt_TierNameAuswahl;
	private JComboBox comboBox_futterdetails_TierNameAuswahl;
	private JComboBox comboBox_futterdetails_FutterBezeichnungAuswahl;
	
	private String temp_gehege_PNummerAuswahl;
	private String temp_pflegt_PNummerAuswahl;
	private String temp_Tier_ArtAuswahl;
	private String temp_Tier_GehegeAuswahl;
	private String temp_pflegt_TierNameAuswahl;
	private String temp_futterdetails_TierNameAuswahl;
	private String temp_futterdetails_FutterBezeichnungAuswahl;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_FrankfurterZoo window = new GUI_FrankfurterZoo();
					window.frmDatenbankDesFrankfurter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_FrankfurterZoo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		
//Hauptmenü------------------------------------------------------------------------------------------------------------
		
		
		frmDatenbankDesFrankfurter = new JFrame();
		frmDatenbankDesFrankfurter.setTitle("Datenbank des Frankfurter Zoos");
		frmDatenbankDesFrankfurter.setBounds(100, 100, 836, 536);
		frmDatenbankDesFrankfurter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDatenbankDesFrankfurter.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Arial", Font.BOLD, 15));
		frmDatenbankDesFrankfurter.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		tabbedPane.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(comboBox_Tier_ArtAuswahl.getSelectedItem());
				//System.out.println("test");
			}
			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
			
		});
		
		JPanel panel_haupt = new JPanel();
		panel_haupt.setBackground(Color.PINK);
		tabbedPane.addTab("Hauptmenü", null, panel_haupt, null);
		panel_haupt.setLayout(null);
		
		JLabel label_hauptmenue_ueberschrift_1 = new JLabel("Datenbank des Frankfurter Zoos\r\n");
		label_hauptmenue_ueberschrift_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_hauptmenue_ueberschrift_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_hauptmenue_ueberschrift_1.setBounds(165, 25, 505, 94);
		panel_haupt.add(label_hauptmenue_ueberschrift_1);
		
		JLabel label_hauptmenue_ueberschrift_2 = new JLabel("Benutzeroberfläche");
		label_hauptmenue_ueberschrift_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_hauptmenue_ueberschrift_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_hauptmenue_ueberschrift_2.setBounds(175, 72, 505, 94);
		panel_haupt.add(label_hauptmenue_ueberschrift_2);
		
		JLabel label_hauptmenue_anweisung = new JLabel("Zwischen den Tabs im oberen Bereich klicken, um die gew\u00FCnschten Bereiche zu wecheseln.");
		label_hauptmenue_anweisung.setFont(new Font("Tahoma", Font.ITALIC, 15));
		label_hauptmenue_anweisung.setVerticalAlignment(SwingConstants.TOP);
		label_hauptmenue_anweisung.setBounds(128, 155, 612, 29);
		panel_haupt.add(label_hauptmenue_anweisung);
		
		JLabel label_hauptmenue_hilfe_1 = new JLabel("Mit dem Button \"Anlegen\" neue Eintr\u00E4ge in der Datenbank anlegen.");
		label_hauptmenue_hilfe_1.setVerticalAlignment(SwingConstants.TOP);
		label_hauptmenue_hilfe_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_hauptmenue_hilfe_1.setBounds(128, 235, 612, 29);
		panel_haupt.add(label_hauptmenue_hilfe_1);
		
		JLabel label_hauptmenue_hilfe_2 = new JLabel("Mit dem Button \"\u00C4ndern\" Eintr\u00E4ge der Datenbank ver\u00E4ndern/anpassen.");
		label_hauptmenue_hilfe_2.setVerticalAlignment(SwingConstants.TOP);
		label_hauptmenue_hilfe_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_hauptmenue_hilfe_2.setBounds(128, 275, 612, 29);
		panel_haupt.add(label_hauptmenue_hilfe_2);
		
		JLabel label_hauptmenue_hilfe_3 = new JLabel("Mit dem Button \"L\u00F6schen\" Eintr\u00E4ge der Datenbank entfernen.");
		label_hauptmenue_hilfe_3.setVerticalAlignment(SwingConstants.TOP);
		label_hauptmenue_hilfe_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_hauptmenue_hilfe_3.setBounds(128, 315, 612, 29);
		panel_haupt.add(label_hauptmenue_hilfe_3);
		
		JLabel label_hauptmenue_hilfe = new JLabel("Hilfe:");
		label_hauptmenue_hilfe.setVerticalAlignment(SwingConstants.TOP);
		label_hauptmenue_hilfe.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_hauptmenue_hilfe.setBounds(128, 195, 612, 29);
		panel_haupt.add(label_hauptmenue_hilfe);
		
		JLabel label_hauptmenue_hilfe_4 = new JLabel("Der Befehl \"[...]-liste ausgeben\" gibt die gew\u00FCnschten Eintr\u00E4ge in einem Textfeld aus.\r\n");
		label_hauptmenue_hilfe_4.setVerticalAlignment(SwingConstants.TOP);
		label_hauptmenue_hilfe_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_hauptmenue_hilfe_4.setBounds(128, 355, 612, 29);
		panel_haupt.add(label_hauptmenue_hilfe_4);
		
		JButton btn_Reset= new JButton("RESET ");
		btn_Reset.setToolTipText("WARNING");
		btn_Reset.setForeground(Color.BLACK);
		btn_Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame meinJFrame = new JFrame();
				meinJFrame.setBounds(500, 300, 300, 100);
				meinJFrame.setTitle("Passwort");
		 
				JPanel meinPanel = new JPanel();
				JLabel pwLabel = new JLabel("Admin Passwort");
		 
				//Passwortfeld wird erzeugt 
				JPasswordField pwField = new 
		                        JPasswordField("meinsupersicherespasswort");
		 
				meinPanel.add(pwLabel);
				meinPanel.add(pwField);
		 
				meinJFrame.add(meinPanel);
				meinJFrame.setVisible(true);
				//s.deletDatabases();
				//s.createDatabases();
				//refreshComboBoxes();
			}
		});
		btn_Reset.setBounds(360, 395, 297, 39);
		panel_haupt.add(btn_Reset);
		
		JLabel lblResetAllData = new JLabel("RESET FULL DATA BASE:");
		lblResetAllData.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResetAllData.setBounds(128, 395, 222, 39);
		panel_haupt.add(lblResetAllData);
		
		//*Futterdetails------------------------------------------------------------------------------------------------------
		
		JPanel panel_pflegt = new JPanel();
		tabbedPane.addTab("Pfleger Tier Zuordnung", null, panel_pflegt, null);
		panel_pflegt.setLayout(null);
		
		JLabel lblPflegerTierZuordnung = new JLabel("Pfleger Tier Zuordnung");
		lblPflegerTierZuordnung.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPflegerTierZuordnung.setBounds(64, 37, 243, 26);
		panel_pflegt.add(lblPflegerTierZuordnung);
		
		JLabel lblTierName = new JLabel("Tier Name:");
		lblTierName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTierName.setBounds(64, 170, 84, 26);
		panel_pflegt.add(lblTierName);
		
		JLabel lblPflegerNummer = new JLabel("Pfleger Nummer:");
		lblPflegerNummer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPflegerNummer.setBounds(64, 210, 117, 26);
		panel_pflegt.add(lblPflegerNummer);
		
		comboBox_pflegt_PNummerAuswahl = new JComboBox();
		comboBox_pflegt_PNummerAuswahl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox_pflegt_PNummerAuswahl.getSelectedItem());
				temp_pflegt_PNummerAuswahl=(String) comboBox_pflegt_PNummerAuswahl.getSelectedItem();
			}
		});
		comboBox_pflegt_PNummerAuswahl.setBounds(191, 210, 127, 20);
		panel_pflegt.add(comboBox_pflegt_PNummerAuswahl);
		
		JTextPane textPane_pflegt_listenausgabe = new JTextPane();
		textPane_pflegt_listenausgabe.setBounds(469, 44, 309, 341);
		panel_pflegt.add(textPane_pflegt_listenausgabe);
		
		JButton button_pflegt_clear = new JButton("Clear");
		button_pflegt_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textPane_pflegt_listenausgabe.setText("");
				
			}
		}); 
		button_pflegt_clear.setBounds(354, 43, 89, 23);
		panel_pflegt.add(button_pflegt_clear);
		
		JButton button_pflegt_anlegen = new JButton("Anlegen");
		button_pflegt_anlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
					 if(temp_pflegt_TierNameAuswahl!=null&&temp_pflegt_PNummerAuswahl!=null) {
						 
						 s.insertPflegt(temp_pflegt_PNummerAuswahl, temp_pflegt_TierNameAuswahl);
						 textPane_pflegt_listenausgabe.setText("successfully added DATA");
						 refreshComboBoxes();
					 }else {
						 textPane_pflegt_listenausgabe.setText("wrong format -pls fill every textField");
					 }
					
					} catch (NumberFormatException expt) {
						textPane_pflegt_listenausgabe.setText("wrong format");
						expt.printStackTrace();
						
					}	
			}
		});
		button_pflegt_anlegen.setBounds(354, 163, 89, 23);
		panel_pflegt.add(button_pflegt_anlegen);
		
		JButton button_pflegt_loeschen = new JButton("L\u00F6schen");
		button_pflegt_loeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 if(temp_pflegt_TierNameAuswahl==null&&temp_pflegt_PNummerAuswahl==null) {
						 textPane_pflegt_listenausgabe.setText("Bitte Gebe eine PflegerID ein");
					 }else {
						 if(s.deletPflegt(temp_pflegt_PNummerAuswahl,temp_pflegt_TierNameAuswahl)) {
							 textPane_pflegt_listenausgabe.setText("Pfleger erfolgreich gel�scht"); 
							 refreshComboBoxes();
						 }else {
							 textPane_pflegt_listenausgabe.setText("es ist ein Fehler aufgetreten"); 
						 }
					 }
					} catch (NumberFormatException expt) {
						textPane_pfleger_listenausgabe.setText("wrong format");
						expt.printStackTrace();
					}
			}
		});
		button_pflegt_loeschen.setBounds(354, 197, 89, 23);
		panel_pflegt.add(button_pflegt_loeschen);
		
		JButton button_pflegt_beenden = new JButton("Beenden");
		button_pflegt_beenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDatenbankDesFrankfurter.dispose();
			}
		});
		button_pflegt_beenden.setBounds(700, 396, 89, 23);
		panel_pflegt.add(button_pflegt_beenden);
		
		JButton button_pflegt_listenausgabe = new JButton("TierPflegerZuordnung ausgeben");
		button_pflegt_listenausgabe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try{
						textPane_pflegt_listenausgabe.setText(s.selectPflegt());
					}catch(Exception exp){
						textPane_pflegt_listenausgabe.setText("Fehler bei der Ausgabe");
						System.err.println(exp);
					}
			}
		});
		button_pflegt_listenausgabe.setBounds(469, 396, 220 , 23);
		panel_pflegt.add(button_pflegt_listenausgabe);
		
		comboBox_pflegt_TierNameAuswahl = new JComboBox();
		comboBox_pflegt_TierNameAuswahl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox_pflegt_TierNameAuswahl.getSelectedItem());
				temp_pflegt_TierNameAuswahl=(String) comboBox_pflegt_TierNameAuswahl.getSelectedItem();
			}
		});
		//comboBox_pflegt_TierNameAuswahl.setSelectedIndex(0);
		comboBox_pflegt_TierNameAuswahl.setBounds(191, 170, 127, 20);
		panel_pflegt.add(comboBox_pflegt_TierNameAuswahl);
		
			
//*Hauptmen�------------------------------------------------------------------------------------------------------------------------
		
// Pfleger--------------------------------------------------------------------------------------------------------------------------
		
		JPanel panel_pfleger = new JPanel();
		tabbedPane.addTab("Pflegerverwaltung", null, panel_pfleger, null);
		panel_pfleger.setLayout(null);
		
	
	//Labels------------------------------------------------
		
		JLabel label_pfleger_ueberschrift = new JLabel("Pfleger/in");
		label_pfleger_ueberschrift.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_pfleger_ueberschrift.setBounds(63, 30, 135, 24);
		panel_pfleger.add(label_pfleger_ueberschrift);
		
		JLabel label_pfleger_pnummer = new JLabel("Personalnummer:");
		label_pfleger_pnummer.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_pfleger_pnummer.setBounds(64, 80, 134, 24);
		panel_pfleger.add(label_pfleger_pnummer);
		
		JLabel label_pfleger_vorname = new JLabel("Vorname:");
		label_pfleger_vorname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_vorname.setBounds(64, 140, 134, 24);
		panel_pfleger.add(label_pfleger_vorname);
		
		JLabel label_pfleger_nachname = new JLabel("Nachname");
		label_pfleger_nachname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_nachname.setBounds(64, 110, 134, 24);
		panel_pfleger.add(label_pfleger_nachname);
		
		JLabel label_pfleger_gehalt = new JLabel("Gehalt:");
		label_pfleger_gehalt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_gehalt.setBounds(64, 350, 134, 24);
		panel_pfleger.add(label_pfleger_gehalt);
		
		JLabel label_pfleger_gbdatum = new JLabel("Geburtsdatum:");
		label_pfleger_gbdatum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_gbdatum.setBounds(64, 170, 134, 24);
		panel_pfleger.add(label_pfleger_gbdatum);
		
		JLabel label_pfleger_etdatum = new JLabel("Eintrittsdatum:");
		label_pfleger_etdatum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_etdatum.setBounds(64, 320, 134, 24);
		panel_pfleger.add(label_pfleger_etdatum);
		
		JLabel label_pfleger_tnummer = new JLabel("Tel.-Nummer");
		label_pfleger_tnummer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_tnummer.setBounds(64, 290, 134, 24);
		panel_pfleger.add(label_pfleger_tnummer);
		
		JLabel label_pfleger_ort = new JLabel("Ort:");
		label_pfleger_ort.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_ort.setBounds(64, 230, 134, 24);
		panel_pfleger.add(label_pfleger_ort);
		
		JLabel label_pfleger_plz = new JLabel("PLZ:");
		label_pfleger_plz.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_plz.setBounds(64, 200, 134, 24);
		panel_pfleger.add(label_pfleger_plz);
		
		JLabel label_pfleger_strasse = new JLabel("Stra\u00DFe:");
		label_pfleger_strasse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_strasse.setBounds(64, 260, 134, 24);
		panel_pfleger.add(label_pfleger_strasse);
		
	//TextFields---------------------------------------
		
		textField_pfleger_pnummer = new JTextField();
		textField_pfleger_pnummer.setBounds(208, 80, 134, 20);
		panel_pfleger.add(textField_pfleger_pnummer);
		textField_pfleger_pnummer.setColumns(10);
		
		textField_pfleger_vorname = new JTextField();
		textField_pfleger_vorname.setColumns(10);
		textField_pfleger_vorname.setBounds(208, 140, 134, 20);
		panel_pfleger.add(textField_pfleger_vorname);
		
		textField_pfleger_nachname = new JTextField();
		textField_pfleger_nachname.setColumns(10);
		textField_pfleger_nachname.setBounds(208, 110, 134, 20);
		panel_pfleger.add(textField_pfleger_nachname);
		
		textField_pfleger_gehalt = new JTextField();
		textField_pfleger_gehalt.setColumns(10);
		textField_pfleger_gehalt.setBounds(208, 350, 134, 20);
		panel_pfleger.add(textField_pfleger_gehalt);
		
		textField_pfleger_gbdatum = new JTextField();
		textField_pfleger_gbdatum.setColumns(10);
		textField_pfleger_gbdatum.setBounds(208, 170, 134, 20);
		panel_pfleger.add(textField_pfleger_gbdatum);
		
		textField_pfleger_etdatum = new JTextField();
		textField_pfleger_etdatum.setColumns(10);
		textField_pfleger_etdatum.setBounds(208, 320, 134, 20);
		panel_pfleger.add(textField_pfleger_etdatum);
		
		textField_pfleger_tnummer = new JTextField();
		textField_pfleger_tnummer.setColumns(10);
		textField_pfleger_tnummer.setBounds(208, 290, 134, 20);
		panel_pfleger.add(textField_pfleger_tnummer);
		
		textField_pfleger_ort = new JTextField();
		textField_pfleger_ort.setColumns(10);
		textField_pfleger_ort.setBounds(208, 230, 134, 20);
		panel_pfleger.add(textField_pfleger_ort);
		
		textField_pfleger_plz = new JTextField();
		textField_pfleger_plz.setColumns(10);
		textField_pfleger_plz.setBounds(208, 200, 134, 20);
		panel_pfleger.add(textField_pfleger_plz);
		
		textField_pfleger_strasse = new JTextField();
		textField_pfleger_strasse.setColumns(10);
		textField_pfleger_strasse.setBounds(208, 260, 134, 20);
		panel_pfleger.add(textField_pfleger_strasse);
		
		textPane_pfleger_listenausgabe = new JTextPane();
		textPane_pfleger_listenausgabe.setBounds(484, 31, 293, 334);
		panel_pfleger.add(textPane_pfleger_listenausgabe);
		
	//Buttons--------------------------------------
		JButton button_pfleger_clear = new JButton("Clear");
		button_pfleger_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField_pfleger_pnummer.setText("");
				 textField_pfleger_vorname.setText("");
				 textField_pfleger_nachname.setText("");
				 textField_pfleger_gehalt.setText("");
				 textField_pfleger_gbdatum.setText("");
				 textField_pfleger_etdatum.setText("");
				 textField_pfleger_tnummer.setText("");
				 textField_pfleger_ort.setText("");
				 textField_pfleger_plz.setText("");
				 textField_pfleger_strasse.setText("");
				 textPane_pfleger_listenausgabe.setText("");
				
			}
		});
		button_pfleger_clear.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_pfleger_clear.setBounds(366, 35, 89, 23);
		panel_pfleger.add(button_pfleger_clear);
		
		JButton button_pfleger_aendern = new JButton("\u00C4ndern");
		button_pfleger_aendern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
					 String temp1 =textField_pfleger_pnummer.getText();
					 String temp2 =textField_pfleger_nachname.getText();
					 String temp3 =textField_pfleger_vorname.getText();
					 String temp4 =textField_pfleger_gbdatum.getText();
					 String temp5 =textField_pfleger_plz.getText();
					 String temp6 =textField_pfleger_ort.getText();
					 String temp7 =textField_pfleger_strasse.getText();
					 String temp8 =textField_pfleger_tnummer.getText();
					 String temp9 =textField_pfleger_etdatum.getText();
					 String temp10 =textField_pfleger_gehalt.getText();

					 if(!temp1.isBlank()&&!temp2.isBlank()&&!temp3.isBlank()&&!temp4.isBlank()&&!temp5.isBlank()&&!temp6.isBlank()&&!temp7.isBlank()&&!temp8.isBlank()&&!temp9.isBlank()&&!temp10.isBlank()) {
						 s.changePfleger(temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8, temp9, temp10);
						 textPane_pfleger_listenausgabe.setText("successfully merged DATA");
						 refreshComboBoxes();
					 }else {
						 textPane_pfleger_listenausgabe.setText("wrong format -pls fill every textField");
					 }
					
					} catch (NumberFormatException expt) {
						textPane_pfleger_listenausgabe.setText("wrong format");
						expt.printStackTrace();
						
					}	
			}
		});
		button_pfleger_aendern.setBounds(366, 215, 89, 23);
		panel_pfleger.add(button_pfleger_aendern);
		
		JButton button_pfleger_loeschen = new JButton("L\u00F6schen");
		button_pfleger_loeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					 String temp1 =textField_pfleger_pnummer.getText();
					 if(temp1.isBlank()) {
						 textPane_pfleger_listenausgabe.setText("Bitte Gebe eine PflegerID ein");
					 }else {
						 if(s.deletPfleger(temp1)) {
							 textPane_pfleger_listenausgabe.setText("Pfleger erfolgreich gel�scht"); 
							 refreshComboBoxes();
						 }else {
							 textPane_pfleger_listenausgabe.setText("es ist ein Fehler aufgetreten"); 
						 }
					 }
					} catch (NumberFormatException expt) {
						textPane_pfleger_listenausgabe.setText("wrong format");
						expt.printStackTrace();
					}
					
			}
		});
		button_pfleger_loeschen.setBounds(366, 250, 89, 23);
		panel_pfleger.add(button_pfleger_loeschen);
		
		JButton button_pfleger_anlegen = new JButton("Anlegen");
		button_pfleger_anlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
					 String temp1 =textField_pfleger_pnummer.getText();
					 String temp2 =textField_pfleger_nachname.getText();
					 String temp3 =textField_pfleger_vorname.getText();
					 String temp4 =textField_pfleger_gbdatum.getText();
					 String temp5 =textField_pfleger_plz.getText();
					 String temp6 =textField_pfleger_ort.getText();
					 String temp7 =textField_pfleger_strasse.getText();
					 String temp8 =textField_pfleger_tnummer.getText();
					 String temp9 =textField_pfleger_etdatum.getText();
					 String temp10 =textField_pfleger_gehalt.getText();

					 if(!temp1.isBlank()&&!temp2.isBlank()&&!temp3.isBlank()&&!temp4.isBlank()&&!temp5.isBlank()&&!temp6.isBlank()&&!temp7.isBlank()&&!temp8.isBlank()&&!temp9.isBlank()&&!temp10.isBlank()) {
						 s.insertPfleger(temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8, temp9, temp10);
						 textPane_pfleger_listenausgabe.setText("successfully added DATA");
						 refreshComboBoxes();
					 }else {
						 textPane_pfleger_listenausgabe.setText("wrong format -pls fill every textField");
					 }
					
					} catch (NumberFormatException expt) {
						textPane_pfleger_listenausgabe.setText("wrong format");
						expt.printStackTrace();
						
					}	
			}
		});
		button_pfleger_anlegen.setBounds(366, 180, 89, 23);
		panel_pfleger.add(button_pfleger_anlegen);
		
		JButton button_pfleger_beenden = new JButton("Beenden");
		button_pfleger_beenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDatenbankDesFrankfurter.dispose();
			}
		});
		button_pfleger_beenden.setBounds(688, 390, 89, 23);
		panel_pfleger.add(button_pfleger_beenden);
		
		JButton button_pfleger_listenausgabe = new JButton("Zeige Pflegerliste");
		button_pfleger_listenausgabe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					textPane_pfleger_listenausgabe.setText(s.selectPfleger());
				}catch(Exception exp){
					textPane_pfleger_listenausgabe.setText("Fehler bei der Ausgabe");
					System.err.println(exp);
				}
			}
		});
		button_pfleger_listenausgabe.setBounds(484, 390, 146, 23);
		panel_pfleger.add(button_pfleger_listenausgabe);
		
//*Pfleger--------------------------------------------------------------------------------------------------------------------
		
//Tiere-----------------------------------------------------------------------------------------------------------------------
		
		JPanel panel_tier = new JPanel();
		tabbedPane.addTab("Tierverwaltung", null, panel_tier, "");
		panel_tier.setLayout(null);
		
	//Labels-------------------------------------------------
		
		JLabel label_tiere_ueberschrift = new JLabel("Tiere");
		label_tiere_ueberschrift.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_tiere_ueberschrift.setBounds(67, 33, 78, 25);
		panel_tier.add(label_tiere_ueberschrift);
		
		JLabel label_tiere_tname = new JLabel("Tiername:");
		label_tiere_tname.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_tiere_tname.setBounds(67, 84, 138, 25);
		panel_tier.add(label_tiere_tname);
		
		JLabel label_tiere_zugang = new JLabel("Zugang:");
		label_tiere_zugang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_tiere_zugang.setBounds(67, 192, 138, 25);
		panel_tier.add(label_tiere_zugang);
		
		JLabel label_tiere_abgang = new JLabel("Abgang:");
		label_tiere_abgang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_tiere_abgang.setBounds(67, 228, 138, 25);
		panel_tier.add(label_tiere_abgang);
		
		JLabel label_tiere_geschlecht = new JLabel("Geschlecht:");
		label_tiere_geschlecht.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_tiere_geschlecht.setBounds(67, 156, 138, 25);
		panel_tier.add(label_tiere_geschlecht);
		
		JLabel label_tiere_gbdatum = new JLabel("Geburtsdatum:");
		label_tiere_gbdatum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_tiere_gbdatum.setBounds(67, 120, 138, 25);
		panel_tier.add(label_tiere_gbdatum);
		
	//TextFields----------------------------------------------------
		
		textField_tiere_abgang = new JTextField();
		textField_tiere_abgang.setBounds(194, 231, 138, 20);
		panel_tier.add(textField_tiere_abgang);
		textField_tiere_abgang.setColumns(10);
		
		textField_tiere_zugang = new JTextField();
		textField_tiere_zugang.setColumns(10);
		textField_tiere_zugang.setBounds(194, 192, 138, 20);
		panel_tier.add(textField_tiere_zugang);
		
		textField_tiere_geschlecht = new JTextField();
		textField_tiere_geschlecht.setColumns(10);
		textField_tiere_geschlecht.setBounds(194, 156, 138, 20);
		panel_tier.add(textField_tiere_geschlecht);
		
		textField_tiere_gbdatum = new JTextField();
		textField_tiere_gbdatum.setColumns(10);
		textField_tiere_gbdatum.setBounds(194, 120, 138, 20);
		panel_tier.add(textField_tiere_gbdatum);
		
		textField_tiere_tname = new JTextField();
		textField_tiere_tname.setColumns(10);
		textField_tiere_tname.setBounds(194, 87, 138, 20);
		panel_tier.add(textField_tiere_tname);
		
		
		textPane_tiere_listausgabe = new JTextPane();
		textPane_tiere_listausgabe.setBounds(491, 39, 283, 337);
		panel_tier.add(textPane_tiere_listausgabe);
		
		
		
	//Buttons-------------------------------------------------
		
		JButton button_tiere_clear = new JButton("Clear");
		button_tiere_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_tiere_abgang.setText(null);
				textField_tiere_zugang.setText(null);
				textField_tiere_geschlecht.setText(null);
				textField_tiere_gbdatum.setText(null);
				textField_tiere_tname.setText(null);
				textPane_tiere_listausgabe.setText(null);
				
			}
		});
		button_tiere_clear.setBounds(370, 38, 89, 23);
		panel_tier.add(button_tiere_clear);
		
		JButton button_tiere_aendern = new JButton("\u00C4ndern");
		button_tiere_aendern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
					 String temp1 =textField_tiere_tname.getText();
					 String temp2 =textField_tiere_gbdatum.getText();
					 String temp3 =textField_tiere_geschlecht.getText();
					 String temp4 =textField_tiere_zugang.getText();
					 String temp5 =textField_tiere_abgang.getText();

					 
					
				
					 
					 if(!temp1.isBlank()&&!temp2.isBlank()&&!temp3.isBlank()&&!temp4.isBlank()&&!temp5.isBlank()&&temp_Tier_ArtAuswahl!=null) {
						 s.changeTier(temp1,temp2,temp3,temp4,temp5,temp_Tier_GehegeAuswahl,temp_Tier_ArtAuswahl);
						 textPane_tiere_listausgabe.setText("successfully merged DATA");
						 refreshComboBoxes();
					 }else {
						 textPane_tiere_listausgabe.setText("wrong format -pls fill every textField");
					 }
					
					} catch (NumberFormatException expt) {
						textPane_tiere_listausgabe.setText("wrong format");
						expt.printStackTrace();
						
					}	
				
			}
		});
		button_tiere_aendern.setBounds(370, 158, 89, 23);
		panel_tier.add(button_tiere_aendern);
		
		JButton button_tiere_anlegen = new JButton("Anlegen");
		button_tiere_anlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
					 String temp1 =textField_tiere_tname.getText();
					 String temp2 =textField_tiere_gbdatum.getText();
					 String temp3 =textField_tiere_geschlecht.getText();
					 String temp4 =textField_tiere_zugang.getText();
					 String temp5 =textField_tiere_abgang.getText();
					 
					 
					 	
					 if(!temp1.isBlank()&&!temp2.isBlank()&&!temp3.isBlank()&&!temp4.isBlank()&&!temp5.isBlank()&&temp_Tier_ArtAuswahl!=null) {
						 s.insertTier(temp1,temp2,temp3,temp4,temp5,temp_Tier_GehegeAuswahl,temp_Tier_ArtAuswahl);
						 textPane_tiere_listausgabe.setText("successfully added DATA");
						 refreshComboBoxes();
					 }else {
						 textPane_tiere_listausgabe.setText("wrong format -pls fill every textField");
					 }
					 
					
					} catch (NumberFormatException expt) {
						textPane_tiere_listausgabe.setText("wrong format");
						expt.printStackTrace();
					}	
				
					
					
				
					
				
			}
		});
		button_tiere_anlegen.setBounds(370, 122, 89, 23);
		panel_tier.add(button_tiere_anlegen);
		
		JButton button_tiere_loeschen = new JButton("L\u00F6schen");
		button_tiere_loeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 String temp1 =textField_tiere_tname.getText();
					 if(temp1.isBlank()) {
						 textPane_tiere_listausgabe.setText("Bitte Gebe einen Tier Namen ein");
					 }else {
						 if(s.deletTier(temp1)) {
							 textPane_tiere_listausgabe.setText("Tier erfolgreich gel�scht"); 
							 refreshComboBoxes();
						 }else {
							 textPane_tiere_listausgabe.setText("es ist ein Fehler aufgetreten"); 
						 }
					 }
					} catch (NumberFormatException expt) {
						textPane_tiere_listausgabe.setText("wrong format");
						expt.printStackTrace();
					}
					
			}
		});
		button_tiere_loeschen.setBounds(370, 194, 89, 23);
		panel_tier.add(button_tiere_loeschen);
		
		
		JButton button_tiere_beenden = new JButton("Beenden");
		button_tiere_beenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDatenbankDesFrankfurter.dispose();
			}
		});
		button_tiere_beenden.setBounds(685, 387, 89, 23);
		panel_tier.add(button_tiere_beenden);
		
		JButton button_tiere_listenausgabe = new JButton("Tierliste ausgeben");
		button_tiere_listenausgabe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					textPane_tiere_listausgabe.setText(s.selectTiere());
				}catch(Exception exp){
					textPane_tiere_listausgabe.setText("Fehler bei der Ausgabe");
					System.err.println(exp);
				}
			}
		});
		button_tiere_listenausgabe.setBounds(491, 387, 146, 23);
		panel_tier.add(button_tiere_listenausgabe);
		
		JLabel lblTierGehege = new JLabel("Gehege Name:");
		lblTierGehege.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTierGehege.setBounds(67, 260, 138, 25);
		panel_tier.add(lblTierGehege);
		
		comboBox_Tier_ArtAuswahl = new JComboBox();
		comboBox_Tier_ArtAuswahl.setBounds(194, 290, 138, 20);
		comboBox_Tier_ArtAuswahl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox_Tier_ArtAuswahl.getSelectedItem());
				temp_Tier_ArtAuswahl=(String) comboBox_Tier_ArtAuswahl.getSelectedItem();
			}
		});
		panel_tier.add(comboBox_Tier_ArtAuswahl);
		
		comboBox_Tier_GehegeAuswahl = new JComboBox();
		comboBox_Tier_GehegeAuswahl.setBounds(194, 260, 138, 20);
		comboBox_Tier_GehegeAuswahl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox_Tier_GehegeAuswahl.getSelectedItem());
				temp_Tier_GehegeAuswahl= (String) comboBox_Tier_GehegeAuswahl.getSelectedItem();
			}
		});
		panel_tier.add(comboBox_Tier_GehegeAuswahl);
		
		JLabel lblTierArt = new JLabel("Tier Art:");
		lblTierArt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTierArt.setBounds(67, 290, 138, 25);
		panel_tier.add(lblTierArt);
		
	
			//*Tiere-----------------------------------------------------------------------------------------------------------------
		
			//Gehege-----------------------------------------------------------------------------------------------------------------
		
		JPanel panel_gehege = new JPanel();
		tabbedPane.addTab("Gehegeverwaltung", null, panel_gehege, null);
		panel_gehege.setLayout(null);
		
					//Labels-------------------------------------------------
		
		JLabel label_gehege_ueberschrift = new JLabel("Gehege");
		label_gehege_ueberschrift.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_gehege_ueberschrift.setBounds(64, 37, 84, 26);
		panel_gehege.add(label_gehege_ueberschrift);
		
		JLabel label_gehege_gehegename = new JLabel("Gehegename:");
		label_gehege_gehegename.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_gehege_gehegename.setBounds(64, 90, 84, 26);
		panel_gehege.add(label_gehege_gehegename);
		
		JLabel label_gehege_baujahr = new JLabel("Baujahr:");
		label_gehege_baujahr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_gehege_baujahr.setBounds(64, 170, 84, 26);
		panel_gehege.add(label_gehege_baujahr);
		
		JLabel label_gehege_flaeche = new JLabel("Fl\u00E4che:");
		label_gehege_flaeche.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_gehege_flaeche.setBounds(64, 130, 84, 26);
		panel_gehege.add(label_gehege_flaeche);
		
		JLabel label_gehege_pnummer = new JLabel("Personal Nummer:");
		label_gehege_pnummer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_gehege_pnummer.setBounds(64, 210, 84, 26);
		panel_gehege.add(label_gehege_pnummer);
		
				//TextFields--------------------------------------------
		
		textField_gehege_gehegename = new JTextField();
		textField_gehege_gehegename.setBounds(191, 90, 127, 20);
		panel_gehege.add(textField_gehege_gehegename);
		textField_gehege_gehegename.setColumns(10);
		
		textField_gehege_baujahr = new JTextField();
		textField_gehege_baujahr.setColumns(10);
		textField_gehege_baujahr.setBounds(191, 170, 127, 20);
		panel_gehege.add(textField_gehege_baujahr);
		
		textField_gehege_flaeche = new JTextField();
		textField_gehege_flaeche.setColumns(10);
		textField_gehege_flaeche.setBounds(191, 130, 127, 20);
		panel_gehege.add(textField_gehege_flaeche);
		
		comboBox_gehege_PNummerAuswahl = new JComboBox();
		comboBox_gehege_PNummerAuswahl.setBounds(191, 210, 127, 20);
		comboBox_gehege_PNummerAuswahl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox_gehege_PNummerAuswahl.getSelectedItem());
				temp_gehege_PNummerAuswahl=(String) comboBox_gehege_PNummerAuswahl.getSelectedItem();
			}
		});
		panel_gehege.add(comboBox_gehege_PNummerAuswahl);
		
		textPane_gehege_listenausgabe = new JTextPane();
		textPane_gehege_listenausgabe.setBounds(469, 44, 309, 341);
		panel_gehege.add(textPane_gehege_listenausgabe);
		
				//Buttons-----------------------------------
		
		JButton button_gehege_clear = new JButton("Clear");
		button_gehege_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_gehege_gehegename.setText("");
				textField_gehege_baujahr.setText("");
				textField_gehege_flaeche.setText("");
				textPane_gehege_listenausgabe.setText("");
			}
		});
		button_gehege_clear.setBounds(354, 43, 89, 23);
		panel_gehege.add(button_gehege_clear);
		
		JButton button_gehege_anlegen = new JButton("Anlegen");
		button_gehege_anlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
					 String temp1 =textField_gehege_gehegename.getText();
					 String temp2 =textField_gehege_baujahr.getText();
					 String temp3 =textField_gehege_flaeche.getText();
					 

					 if(!temp1.isBlank()&&!temp2.isBlank()&&!temp3.isBlank()&&temp_gehege_PNummerAuswahl!=null) {
						 s.insertGehege(temp1,temp2,temp3,temp_gehege_PNummerAuswahl);
						 textPane_gehege_listenausgabe.setText("successfully added DATA");
						 refreshComboBoxes();
					 }else {
						 textPane_gehege_listenausgabe.setText("wrong format -pls fill every textField");
					 }
					 
					
					} catch (NumberFormatException expt) {
						textPane_gehege_listenausgabe.setText("wrong format");
						expt.printStackTrace();
					}
			}
		});
		button_gehege_anlegen.setBounds(354, 126, 89, 23);
		panel_gehege.add(button_gehege_anlegen);
		
		JButton button_gehege_aendern = new JButton("\u00C4ndern");
		button_gehege_aendern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
					 String temp1 =textField_gehege_gehegename.getText();
					 String temp2 =textField_gehege_baujahr.getText();
					 String temp3 =textField_gehege_flaeche.getText();
					 

					 if(!temp1.isBlank()&&!temp2.isBlank()&&!temp3.isBlank()&&temp_gehege_PNummerAuswahl!=null) {
						 s.changeGehege(temp1,temp2,temp3,temp_gehege_PNummerAuswahl);
						 textPane_gehege_listenausgabe.setText("successfully merged DATA");
						 refreshComboBoxes();
					 }else {
						 textPane_gehege_listenausgabe.setText("wrong format -pls fill every textField");
					 }
					 
					
					} catch (NumberFormatException expt) {
						textPane_gehege_listenausgabe.setText("wrong format");
						expt.printStackTrace();
					}
			}
		});
		button_gehege_aendern.setBounds(354, 163, 89, 23);
		panel_gehege.add(button_gehege_aendern);
		
		JButton button_gehege_loeschen = new JButton("L\u00F6schen");
		button_gehege_loeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 String temp1 =textField_gehege_gehegename.getText();
					 if(temp1.isBlank()) {
						 textPane_gehege_listenausgabe.setText("Bitte Gebe einen Tier Namen ein");
					 }else {
						 if(s.deletGehege(temp1)) {
							 textPane_gehege_listenausgabe.setText("Tier erfolgreich gel�scht"); 
							 refreshComboBoxes();
						 }else {
							 textPane_gehege_listenausgabe.setText("es ist ein Fehler aufgetreten"); 
						 }
					 }
					} catch (NumberFormatException expt) {
						textPane_gehege_listenausgabe.setText("wrong format");
						expt.printStackTrace();
					}
			}
		});
		button_gehege_loeschen.setBounds(354, 197, 89, 23);
		panel_gehege.add(button_gehege_loeschen);

		
		JButton button_gehege_beenden = new JButton("Beenden");
		button_gehege_beenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDatenbankDesFrankfurter.dispose();
			}
		});
		button_gehege_beenden.setBounds(689, 396, 89, 23);
		panel_gehege.add(button_gehege_beenden);
		
		JButton button_gehege_listenausgabe = new JButton("Gehegeliste ausgeben");
		button_gehege_listenausgabe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try{
					textPane_gehege_listenausgabe.setText(s.selectGehege());
				}catch(Exception exp){
					textPane_gehege_listenausgabe.setText("Fehler bei der Ausgabe");
					System.err.println(exp);
				}
			}
		});
		button_gehege_listenausgabe.setBounds(469, 396, 164, 23);
		panel_gehege.add(button_gehege_listenausgabe);
		
			//*Gehege----------------------------------------------------------------------------------------------------------------------
		
			//Arten------------------------------------------------------------------------------------------------------------------------
		
		JPanel panel_art = new JPanel();
		tabbedPane.addTab("Artenverwaltung", null, panel_art, null);
		panel_art.setLayout(null);
		
				//Labels---------------------------------------------
		
		JLabel label_arten_ueberschrift = new JLabel("Arten");
		label_arten_ueberschrift.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_arten_ueberschrift.setBounds(71, 44, 100, 25);
		panel_art.add(label_arten_ueberschrift);
		
		JLabel label_arten_bezeichnung = new JLabel("Bezeichnung:");
		label_arten_bezeichnung.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_arten_bezeichnung.setBounds(71, 100, 100, 25);
		panel_art.add(label_arten_bezeichnung);
		
		JLabel label_arten_lebensraum = new JLabel("Lebensraum:");
		label_arten_lebensraum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_arten_lebensraum.setBounds(71, 180, 100, 25);
		panel_art.add(label_arten_lebensraum);
		
		JLabel label_arten_latbezeichnung = new JLabel("lat. Bezeichnung:");
		label_arten_latbezeichnung.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_arten_latbezeichnung.setBounds(71, 140, 100, 25);
		panel_art.add(label_arten_latbezeichnung);
		
				//Textfields-------------------------------------------
		
		textField_arten_bezeichnung = new JTextField();
		textField_arten_bezeichnung.setBounds(200, 100, 125, 20);
		panel_art.add(textField_arten_bezeichnung);
		textField_arten_bezeichnung.setColumns(10);
		
		textField_arten_lebensraum = new JTextField();
		textField_arten_lebensraum.setColumns(10);
		textField_arten_lebensraum.setBounds(200, 180, 125, 20);
		panel_art.add(textField_arten_lebensraum);
		
		textField_arten_latbezeichnung = new JTextField();
		textField_arten_latbezeichnung.setColumns(10);
		textField_arten_latbezeichnung.setBounds(200, 140, 125, 20);
		panel_art.add(textField_arten_latbezeichnung);
		
		textPane_arten_listenausgabe = new JTextPane();
		textPane_arten_listenausgabe.setBounds(466, 50, 307, 329);
		panel_art.add(textPane_arten_listenausgabe);
		
				//Buttons---------------------------------------------------
		
		JButton button_arten_clear = new JButton("Clear");
		button_arten_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_arten_bezeichnung.setText("");
				textField_arten_latbezeichnung.setText("");
				textField_arten_lebensraum.setText("");
				textPane_arten_listenausgabe.setText("");
			}
		});
		button_arten_clear.setBounds(351, 49, 89, 23);
		panel_art.add(button_arten_clear);
		
		JButton button_arten_anlegen = new JButton("Anlegen");
		button_arten_anlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 String temp1 =textField_arten_bezeichnung.getText();
					 String temp2 =textField_arten_latbezeichnung.getText();
					 String temp3 =textField_arten_lebensraum.getText();
					 

					 if(!temp1.isBlank()&&!temp2.isBlank()&&!temp3.isBlank()) {
						 s.insertArt(temp1,temp2,temp3);
						 textPane_arten_listenausgabe.setText("successfully added DATA");
						 refreshComboBoxes();
					 }else {
						 textPane_arten_listenausgabe.setText("wrong format -pls fill every textField");
					 }
					 
					
					} catch (NumberFormatException expt) {
						textPane_arten_listenausgabe.setText("wrong format");
						expt.printStackTrace();
					}
			}
		});
		button_arten_anlegen.setBounds(351, 141, 89, 23);
		panel_art.add(button_arten_anlegen);
		
		JButton button_arten_aendern = new JButton("\u00C4ndern");
		button_arten_aendern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
					 String temp1 =textField_arten_bezeichnung.getText();
					 String temp2 =textField_arten_latbezeichnung.getText();
					 String temp3 =textField_arten_lebensraum.getText();
					 

					 if(!temp1.isBlank()&&!temp2.isBlank()&&!temp3.isBlank()) {
						 s.changeArt(temp1,temp2,temp3);
						 textPane_arten_listenausgabe.setText("successfully added DATA");
						 refreshComboBoxes();
					 }else {
						 textPane_arten_listenausgabe.setText("wrong format -pls fill every textField");
					 }
					 
					
					} catch (NumberFormatException expt) {
						textPane_arten_listenausgabe.setText("wrong format");
						expt.printStackTrace();
					}
			}
		});
		button_arten_aendern.setBounds(351, 177, 89, 23);
		panel_art.add(button_arten_aendern);
		
		JButton button_arten_loeschen = new JButton("L\u00F6schen");
		button_arten_loeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 String temp1 =textField_arten_bezeichnung.getText();
					 if(temp1.isBlank()) {
						 textPane_arten_listenausgabe.setText("Bitte Gebe einen Tier Namen ein");
					 }else {
						 if(s.deletGehege(temp1)) {
							 textPane_arten_listenausgabe.setText("Tier erfolgreich gel�scht"); 
							 refreshComboBoxes();
						 }else {
							 textPane_arten_listenausgabe.setText("es ist ein Fehler aufgetreten"); 
						 }
					 }
					} catch (NumberFormatException expt) {
						textPane_arten_listenausgabe.setText("wrong format");
						expt.printStackTrace();
					}
			}
		});
		button_arten_loeschen.setBounds(351, 211, 89, 23);
		panel_art.add(button_arten_loeschen);
		
		JButton button_arten_beenden = new JButton("Beenden");
		button_arten_beenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDatenbankDesFrankfurter.dispose();
			}
		});
		button_arten_beenden.setBounds(684, 390, 89, 23);
		panel_art.add(button_arten_beenden);
		
		JButton button_arten_listenausgabe = new JButton("Artenliste ausgeben");
		button_arten_listenausgabe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try{
					textPane_arten_listenausgabe.setText(s.selectArt());
				}catch(Exception exp){
					textPane_arten_listenausgabe.setText("Fehler bei der Ausgabe");
					System.err.println(exp);
				}
			}
		});
		button_arten_listenausgabe.setBounds(466, 390, 148, 23);
		panel_art.add(button_arten_listenausgabe);
		
			//*Arten--------------------------------------------------------------------------------------------------------
		
			//Futter--------------------------------------------------------------------------------------------------------
		
		JPanel panel_futter = new JPanel();
		tabbedPane.addTab("Futterverwaltung", null, panel_futter, null);
		panel_futter.setLayout(null);
		
				//Labels---------------------------------------------
		
		JLabel label_futter_ueberschrift = new JLabel("Futter");
		label_futter_ueberschrift.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_futter_ueberschrift.setBounds(69, 49, 78, 34);
		panel_futter.add(label_futter_ueberschrift);
		
		JLabel label_futter_bezeichnung = new JLabel("Bezeichnung:");
		label_futter_bezeichnung.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_futter_bezeichnung.setBounds(69, 114, 78, 21);
		panel_futter.add(label_futter_bezeichnung);
		
				//Textfields----------------------------------------
		
		textField_futter_bezeichnung = new JTextField();
		textField_futter_bezeichnung.setBounds(196, 115, 126, 20);
		panel_futter.add(textField_futter_bezeichnung);
		textField_futter_bezeichnung.setColumns(10);
		
		textPane_futter_listenausgabe = new JTextPane();
		textPane_futter_listenausgabe.setBounds(485, 60, 290, 318);
		panel_futter.add(textPane_futter_listenausgabe);
		
				//Buttons-----------------------------------------
		
		JButton button_futter_clear = new JButton("Clear");
		button_futter_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_futter_bezeichnung.setText("");
				textPane_futter_listenausgabe.setText("");
			}
		});
		button_futter_clear.setBounds(354, 59, 89, 23);
		panel_futter.add(button_futter_clear);
		
		JButton button_futter_anlegen = new JButton("Anlegen");
		button_futter_anlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 String temp1 =textField_futter_bezeichnung.getText();			 

					 if(!temp1.isBlank()) {
						 s.insertFutter(temp1);
						 textPane_futter_listenausgabe.setText("successfully added DATA");
						 refreshComboBoxes();
					 }else {
						 textPane_futter_listenausgabe.setText("wrong format -pls fill every textField");
					 }
					 
					
					} catch (NumberFormatException expt) {
						textPane_futter_listenausgabe.setText("wrong format");
						expt.printStackTrace();
					}
					
					
			}
		});
		button_futter_anlegen.setBounds(354, 114, 89, 23);
		panel_futter.add(button_futter_anlegen);
		
		JButton button_futter_loeschen = new JButton("L\u00F6schen");
		button_futter_loeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 String temp1 =textField_futter_bezeichnung.getText();
					 if(temp1.isBlank()) {
						 textPane_futter_listenausgabe.setText("Bitte Gebe einen Tier Namen ein");
					 }else {
						 if(s.deletFutter(temp1)) {
							 textPane_futter_listenausgabe.setText("Tier erfolgreich gel�scht"); 
							 refreshComboBoxes();
						 }else {
							 textPane_futter_listenausgabe.setText("es ist ein Fehler aufgetreten"); 
						 }
					 }
					} catch (NumberFormatException expt) {
						textPane_futter_listenausgabe.setText("wrong format");
						expt.printStackTrace();
					}
				
			}
		});
		button_futter_loeschen.setBounds(354, 182, 89, 23);
		panel_futter.add(button_futter_loeschen);
		
		
		JButton button_futter_beenden = new JButton("Beenden");
		button_futter_beenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDatenbankDesFrankfurter.dispose();
			}
		});
		button_futter_beenden.setBounds(686, 389, 89, 23);
		panel_futter.add(button_futter_beenden);
		
		JButton button_futter_listenausgabe = new JButton("Futterliste ausgeben");
		button_futter_listenausgabe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					textPane_futter_listenausgabe.setText(s.selectFutter());
				}catch(Exception exp){
					textPane_futter_listenausgabe.setText("Fehler bei der Ausgabe");
					System.err.println(exp);
				}
			}
		});
		button_futter_listenausgabe.setBounds(485, 389, 154, 23);
		panel_futter.add(button_futter_listenausgabe);
		
		JLabel lbl_futter_ändern = new JLabel("   \u00C4ndern");
		lbl_futter_ändern.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl_futter_ändern.setBounds(354, 148, 89, 23);
		panel_futter.add(lbl_futter_ändern);
		
			//*Futter--------------------------------
		
		//Futterdetails-------------------------------------------------------------------------------------------------------------
		
		
		JPanel panel_futterdetails = new JPanel();
		tabbedPane.addTab("Futterdetails", null, panel_futterdetails, null);
		panel_futterdetails.setLayout(null);
		
				//Labels----------------------------------------------
		
		JLabel label_futterdetails_ueberschrift = new JLabel("Futterdetails");
		label_futterdetails_ueberschrift.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_futterdetails_ueberschrift.setBounds(64, 56, 147, 25);
		panel_futterdetails.add(label_futterdetails_ueberschrift);
		
		JLabel label_futterdetails_menge = new JLabel("Menge:");
		label_futterdetails_menge.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_futterdetails_menge.setBounds(40, 120, 75, 25);
		panel_futterdetails.add(label_futterdetails_menge);
		
		JLabel label_futterdetails_uhrzeit = new JLabel("Uhrzeit:");
		label_futterdetails_uhrzeit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_futterdetails_uhrzeit.setBounds(40, 160, 75, 25);
		panel_futterdetails.add(label_futterdetails_uhrzeit);
	
				//Textfields-------------------------------------------
				
		textField_futterdetails_menge = new JTextField();
		textField_futterdetails_menge.setBounds(150, 120, 140, 20);
		panel_futterdetails.add(textField_futterdetails_menge);
		textField_futterdetails_menge.setColumns(10);
		
		textField_futterdetails_uhrzeit = new JTextField();
		textField_futterdetails_uhrzeit.setBounds(150, 160, 140, 20);
		panel_futterdetails.add(textField_futterdetails_uhrzeit);
		textField_futterdetails_uhrzeit.setColumns(10);
		
		textPane_futterdetails_listenausgabe = new JTextPane();
		textPane_futterdetails_listenausgabe.setBounds(446, 62, 316, 316);
		panel_futterdetails.add(textPane_futterdetails_listenausgabe);
		
				//Buttons-----------------------------------------------
		
		JButton button_futterdetails_clear = new JButton("Clear");
		button_futterdetails_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_futterdetails_menge.setText("");
				textField_futterdetails_uhrzeit.setText("");
				textPane_futterdetails_listenausgabe.setText("");
				}
		});
		button_futterdetails_clear.setBounds(321, 61, 89, 23);
		panel_futterdetails.add(button_futterdetails_clear);
		
		JButton button_futterdetails_anlegen = new JButton("Anlegen");
		button_futterdetails_anlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
					 String temp1 =textField_futterdetails_menge.getText();
					 String temp2 =textField_futterdetails_uhrzeit.getText();
					 
					 

					 if(!temp1.isBlank()&&!temp2.isBlank()&&temp_gehege_PNummerAuswahl!=null) {
						 
						 textPane_gehege_listenausgabe.setText("successfully added DATA");
						 refreshComboBoxes();
					 }else {
						 textPane_gehege_listenausgabe.setText("wrong format -pls fill every textField");
					 }
					 
					
					} catch (NumberFormatException expt) {
						textPane_gehege_listenausgabe.setText("wrong format");
						expt.printStackTrace();
					}
			}
		});
		button_futterdetails_anlegen.setBounds(321, 149, 89, 23);
		panel_futterdetails.add(button_futterdetails_anlegen);
		
		JButton button_futterdetails_aendern = new JButton("\u00C4ndern");
		button_futterdetails_aendern.setBounds(321, 183, 89, 23);
		panel_futterdetails.add(button_futterdetails_aendern);
		
		JButton button_futterdetails_loeschen = new JButton("L\u00F6schen");
		button_futterdetails_loeschen.setBounds(321, 217, 89, 23);
		panel_futterdetails.add(button_futterdetails_loeschen);

		
		JButton button_futterdetails_beenden = new JButton("Beenden");
		button_futterdetails_beenden.setBounds(673, 389, 89, 23);
		panel_futterdetails.add(button_futterdetails_beenden);
		
		JButton button_futterdetails_listenausgabe = new JButton("Futterdetails ausgeben");
		button_futterdetails_listenausgabe.setBounds(446, 389, 166, 23);
		panel_futterdetails.add(button_futterdetails_listenausgabe);
		
		JLabel label_futterdetails_TierName = new JLabel("Name des Tieres:");
		label_futterdetails_TierName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_futterdetails_TierName.setBounds(40, 200, 95, 25);
		panel_futterdetails.add(label_futterdetails_TierName);
		
		comboBox_futterdetails_TierNameAuswahl = new JComboBox();
		comboBox_futterdetails_TierNameAuswahl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox_futterdetails_TierNameAuswahl.getSelectedItem());
				temp_futterdetails_TierNameAuswahl=(String) comboBox_futterdetails_TierNameAuswahl.getSelectedItem();
			}
		});
		comboBox_futterdetails_TierNameAuswahl.setBounds(150, 200, 140, 20);
		panel_futterdetails.add(comboBox_futterdetails_TierNameAuswahl);
		
		JLabel label_futterdetails_NameDesFutters = new JLabel("Name des Futters:");
		label_futterdetails_NameDesFutters.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_futterdetails_NameDesFutters.setBounds(40, 240, 101, 25);
		panel_futterdetails.add(label_futterdetails_NameDesFutters);
		
		comboBox_futterdetails_FutterBezeichnungAuswahl = new JComboBox();
		comboBox_futterdetails_FutterBezeichnungAuswahl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox_futterdetails_FutterBezeichnungAuswahl.getSelectedItem());
				temp_gehege_PNummerAuswahl=(String) comboBox_futterdetails_FutterBezeichnungAuswahl.getSelectedItem();
			}
		});
		comboBox_futterdetails_FutterBezeichnungAuswahl.setBounds(150, 240, 140, 20);
		panel_futterdetails.add(comboBox_futterdetails_FutterBezeichnungAuswahl);
		
		refreshComboBoxes();
		
	}
	public void refreshComboBoxes(){
		try{
			Art_Bezeichnung = s.selectArt_Bezeichnung();	
			comboBox_Tier_ArtAuswahl.setModel(new DefaultComboBoxModel(Art_Bezeichnung));					
			comboBox_Tier_ArtAuswahl.setSelectedIndex(0);	
		}catch(Exception ex) {
			System.err.println("ERROR OCCURRED [GUI_FrankfurterZOO](line 1137) \n as refreshComboBoxes() tried to pull Date for Comboxes \n Art Table had no entries");
		}
		try{
			Gehege_Name = s.selectGehege_Name();	
			comboBox_Tier_GehegeAuswahl.setModel(new DefaultComboBoxModel(Gehege_Name));					
			comboBox_Tier_GehegeAuswahl.setSelectedIndex(0);	
		}catch(Exception ex) {
			System.err.println("ERROR OCCURRED [GUI_FrankfurterZOO](line 1144) \n as refreshComboBoxes() tried to pull Date for Comboxes \n Gehege Table had no entries");
		}
		
		try {	
			Pfleger_Nummer = s.selectPfleger_PNummer();
			comboBox_gehege_PNummerAuswahl.setModel(new DefaultComboBoxModel(Pfleger_Nummer));					
			comboBox_gehege_PNummerAuswahl.setSelectedIndex(0);
			comboBox_pflegt_PNummerAuswahl.setModel(new DefaultComboBoxModel(Pfleger_Nummer));					
			comboBox_pflegt_PNummerAuswahl.setSelectedIndex(0);
		}catch(Exception ex) {
			System.err.println("ERROR OCCURRED [GUI_FrankfurterZOO](line 1152) \n as refreshComboBoxes() tried to pull Date for Comboxes \n Pfleger Table had no entries");
		}
		try {	
			Tier_Name = s.selectTier_TName();
			comboBox_pflegt_TierNameAuswahl.setModel(new DefaultComboBoxModel(Tier_Name));					
			comboBox_pflegt_TierNameAuswahl.setSelectedIndex(0);
			comboBox_futterdetails_TierNameAuswahl.setModel(new DefaultComboBoxModel(Tier_Name));					
			comboBox_futterdetails_TierNameAuswahl.setSelectedIndex(0);
		}catch(Exception ex) {
			System.err.println("ERROR OCCURRED [GUI_FrankfurterZOO](line 1152) \n as refreshComboBoxes() tried to pull Date for Comboxes \n Pfleger Table had no entries");
		}
		try {	
			Futter_Bezeichnung = s.selectFutter_Bezeichnung();
			comboBox_futterdetails_FutterBezeichnungAuswahl.setModel(new DefaultComboBoxModel(Futter_Bezeichnung));					
			comboBox_futterdetails_FutterBezeichnungAuswahl.setSelectedIndex(0);
		}catch(Exception ex) {
			System.err.println("ERROR OCCURRED [GUI_FrankfurterZOO](line 1152) \n as refreshComboBoxes() tried to pull Date for Comboxes \n Pfleger Table had no entries");
		}
		
	}
}
