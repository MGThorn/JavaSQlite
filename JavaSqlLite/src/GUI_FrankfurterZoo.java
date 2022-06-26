import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

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
	private JTextField textField_pfleger_straﬂe;
	private JTextField textField_pfleger_listenausgabe;
	private JTextField textField_tiere_gbdatum;
	private JTextField textField_tiere_geschlecht;
	private JTextField textField_tiere_abgang;
	private JTextField textField_tiere_zugang;
	private JTextField textField_tiere_tname;
	private JTextField textField_gehege_gehegename;
	private JTextField textField_gehege_baujahr;
	private JTextField textField_gehege_flaeche;
	private JTextField textField_gehege_listenausgabe;
	private JTextField textField_arten_bezeichnung;
	private JTextField textField_arten_lebensraum;
	private JTextField textField_arten_latbezeichnung;
	private JTextField textField_arten_listenausgabe;
	private JTextField textField_futter_bezeichnung;
	private JTextField textField_futter_listenausgabe;
	private JTextField textField_futterdetails_menge;
	private JTextField textField_futterdetails_uhrzeit;
	private JTextField textField_futterdetails_listenausgabe;
	
	private JTextPane textPane_tiere_listausgabe;

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
	
		
			// Hauptmen¸-------------------------------------------------------------------------------------------------------------
		
		
		frmDatenbankDesFrankfurter = new JFrame();
		frmDatenbankDesFrankfurter.setTitle("Datenbank des Frankfurter Zoos");
		frmDatenbankDesFrankfurter.setBounds(100, 100, 836, 536);
		frmDatenbankDesFrankfurter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDatenbankDesFrankfurter.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Arial", Font.BOLD, 15));
		frmDatenbankDesFrankfurter.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_haupt = new JPanel();
		tabbedPane.addTab("Hauptmen¸", null, panel_haupt, null);
		panel_haupt.setLayout(null);
		
		JLabel label_hauptmenue_ueberschrift_1 = new JLabel("Datenbank des Frankfurter Zoos\r\n");
		label_hauptmenue_ueberschrift_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_hauptmenue_ueberschrift_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_hauptmenue_ueberschrift_1.setBounds(165, 25, 505, 94);
		panel_haupt.add(label_hauptmenue_ueberschrift_1);
		
		JLabel label_hauptmenue_ueberschrift_2 = new JLabel("Benutzeroberfl\u00E4che");
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
		
		JButton btnNewButton = new JButton("RESET ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.deletDatabases();
				s.createDatabases();
			}
		});
		btnNewButton.setBounds(360, 395, 297, 39);
		panel_haupt.add(btnNewButton);
		
		JLabel lblResetAllData = new JLabel("RESET FULL DATA BASE:");
		lblResetAllData.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResetAllData.setBounds(128, 395, 222, 39);
		panel_haupt.add(lblResetAllData);
		
			
			//*Hauptmen¸------------------------------------------------------------------------------------------------------------------------
		
			// Pfleger--------------------------------------------------------------------------------------------------------------------------
		
		JPanel panel_pfleger = new JPanel();
		tabbedPane.addTab("Pflegerverwaltung", null, panel_pfleger, null);
		panel_pfleger.setLayout(null);
		
	
					//Labels------------------------------------------------
		
		JLabel label_pfleger_ueberschrift = new JLabel("Pfleger/in");
		label_pfleger_ueberschrift.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_pfleger_ueberschrift.setBounds(63, 30, 135, 24);
		panel_pfleger.add(label_pfleger_ueberschrift);
		
		JButton button_pfleger_clear = new JButton("Clear");
		button_pfleger_clear.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_pfleger_clear.setBounds(366, 35, 89, 23);
		panel_pfleger.add(button_pfleger_clear);
		
		JLabel label_pfleger_pnummer = new JLabel("Personalnummer:");
		label_pfleger_pnummer.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_pfleger_pnummer.setBounds(64, 73, 134, 24);
		panel_pfleger.add(label_pfleger_pnummer);
		
		JLabel label_pfleger_vorname = new JLabel("Vorname:");
		label_pfleger_vorname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_vorname.setBounds(64, 108, 134, 24);
		panel_pfleger.add(label_pfleger_vorname);
		
		JLabel label_pfleger_nachname = new JLabel("Nachname");
		label_pfleger_nachname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_nachname.setBounds(64, 143, 134, 24);
		panel_pfleger.add(label_pfleger_nachname);
		
		JLabel label_pfleger_gehalt = new JLabel("Gehalt:");
		label_pfleger_gehalt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_gehalt.setBounds(64, 178, 134, 24);
		panel_pfleger.add(label_pfleger_gehalt);
		
		JLabel label_pfleger_gbdatum = new JLabel("Geburtsdatum:");
		label_pfleger_gbdatum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_gbdatum.setBounds(64, 213, 134, 24);
		panel_pfleger.add(label_pfleger_gbdatum);
		
		JLabel label_pfleger_etdatum = new JLabel("Eintrittsdatum:");
		label_pfleger_etdatum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_etdatum.setBounds(64, 248, 134, 24);
		panel_pfleger.add(label_pfleger_etdatum);
		
		JLabel label_pfleger_tnummer = new JLabel("Tel.-Nummer");
		label_pfleger_tnummer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_tnummer.setBounds(64, 283, 134, 24);
		panel_pfleger.add(label_pfleger_tnummer);
		
		JLabel label_pfleger_ort = new JLabel("Ort:");
		label_pfleger_ort.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_ort.setBounds(64, 318, 134, 24);
		panel_pfleger.add(label_pfleger_ort);
		
		JLabel label_pfleger_plz = new JLabel("PLZ:");
		label_pfleger_plz.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_plz.setBounds(64, 353, 134, 24);
		panel_pfleger.add(label_pfleger_plz);
		
		JLabel label_pfleger_straﬂe = new JLabel("Stra\u00DFe:");
		label_pfleger_straﬂe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_pfleger_straﬂe.setBounds(64, 388, 134, 24);
		panel_pfleger.add(label_pfleger_straﬂe);
		
				//TextFields---------------------------------------
		
		textField_pfleger_pnummer = new JTextField();
		textField_pfleger_pnummer.setBounds(208, 76, 134, 20);
		panel_pfleger.add(textField_pfleger_pnummer);
		textField_pfleger_pnummer.setColumns(10);
		
		textField_pfleger_vorname = new JTextField();
		textField_pfleger_vorname.setColumns(10);
		textField_pfleger_vorname.setBounds(208, 111, 134, 20);
		panel_pfleger.add(textField_pfleger_vorname);
		
		textField_pfleger_nachname = new JTextField();
		textField_pfleger_nachname.setColumns(10);
		textField_pfleger_nachname.setBounds(208, 146, 134, 20);
		panel_pfleger.add(textField_pfleger_nachname);
		
		textField_pfleger_gehalt = new JTextField();
		textField_pfleger_gehalt.setColumns(10);
		textField_pfleger_gehalt.setBounds(208, 181, 134, 20);
		panel_pfleger.add(textField_pfleger_gehalt);
		
		textField_pfleger_gbdatum = new JTextField();
		textField_pfleger_gbdatum.setColumns(10);
		textField_pfleger_gbdatum.setBounds(208, 216, 134, 20);
		panel_pfleger.add(textField_pfleger_gbdatum);
		
		textField_pfleger_etdatum = new JTextField();
		textField_pfleger_etdatum.setColumns(10);
		textField_pfleger_etdatum.setBounds(208, 251, 134, 20);
		panel_pfleger.add(textField_pfleger_etdatum);
		
		textField_pfleger_tnummer = new JTextField();
		textField_pfleger_tnummer.setColumns(10);
		textField_pfleger_tnummer.setBounds(208, 286, 134, 20);
		panel_pfleger.add(textField_pfleger_tnummer);
		
		textField_pfleger_ort = new JTextField();
		textField_pfleger_ort.setColumns(10);
		textField_pfleger_ort.setBounds(208, 321, 134, 20);
		panel_pfleger.add(textField_pfleger_ort);
		
		textField_pfleger_plz = new JTextField();
		textField_pfleger_plz.setColumns(10);
		textField_pfleger_plz.setBounds(208, 356, 134, 20);
		panel_pfleger.add(textField_pfleger_plz);
		
		textField_pfleger_straﬂe = new JTextField();
		textField_pfleger_straﬂe.setColumns(10);
		textField_pfleger_straﬂe.setBounds(208, 391, 134, 20);
		panel_pfleger.add(textField_pfleger_straﬂe);
		
		textField_pfleger_listenausgabe = new JTextField();
		textField_pfleger_listenausgabe.setBounds(484, 31, 293, 334);
		panel_pfleger.add(textField_pfleger_listenausgabe);
		textField_pfleger_listenausgabe.setColumns(10);
		
				//Buttons--------------------------------------
		
		JButton button_pfleger_aendern = new JButton("\u00C4ndern");
		button_pfleger_aendern.setBounds(366, 215, 89, 23);
		panel_pfleger.add(button_pfleger_aendern);
		
		JButton button_pfleger_loeschen = new JButton("L\u00F6schen");
		button_pfleger_loeschen.setBounds(366, 250, 89, 23);
		panel_pfleger.add(button_pfleger_loeschen);
		
		JButton button_pfleger_anlegen = new JButton("Anlegen");
		button_pfleger_anlegen.setBounds(366, 180, 89, 23);
		panel_pfleger.add(button_pfleger_anlegen);
		
		JButton button_pfleger_beenden = new JButton("Beenden");
		button_pfleger_beenden.setBounds(688, 390, 89, 23);
		panel_pfleger.add(button_pfleger_beenden);
		
		JButton button_pfleger_listenausgabe = new JButton("Zeige Pflegerliste");
		button_pfleger_listenausgabe.setBounds(484, 390, 146, 23);
		panel_pfleger.add(button_pfleger_listenausgabe);
		
			//*Pfleger--------------------------------------------------------------------------------------------------------------------
		
			//Tiere-----------------------------------------------------------------------------------------------------------------------
		
		JPanel panel_tier = new JPanel();
		tabbedPane.addTab("Tierverwaltung", null, panel_tier, null);
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
		label_tiere_zugang.setBounds(67, 120, 138, 25);
		panel_tier.add(label_tiere_zugang);
		
		JLabel label_tiere_abgang = new JLabel("Abgang:");
		label_tiere_abgang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_tiere_abgang.setBounds(67, 156, 138, 25);
		panel_tier.add(label_tiere_abgang);
		
		JLabel label_tiere_geschlecht = new JLabel("Geschlecht:");
		label_tiere_geschlecht.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_tiere_geschlecht.setBounds(67, 192, 138, 25);
		panel_tier.add(label_tiere_geschlecht);
		
		JLabel label_tiere_gbdatum = new JLabel("Geburtsdatum:");
		label_tiere_gbdatum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_tiere_gbdatum.setBounds(67, 228, 138, 25);
		panel_tier.add(label_tiere_gbdatum);
		
				//TextFields----------------------------------------------------
		
		textField_tiere_gbdatum = new JTextField();
		textField_tiere_gbdatum.setBounds(194, 231, 138, 20);
		panel_tier.add(textField_tiere_gbdatum);
		textField_tiere_gbdatum.setColumns(10);
		
		textField_tiere_geschlecht = new JTextField();
		textField_tiere_geschlecht.setColumns(10);
		textField_tiere_geschlecht.setBounds(194, 192, 138, 20);
		panel_tier.add(textField_tiere_geschlecht);
		
		textField_tiere_abgang = new JTextField();
		textField_tiere_abgang.setColumns(10);
		textField_tiere_abgang.setBounds(194, 156, 138, 20);
		panel_tier.add(textField_tiere_abgang);
		
		textField_tiere_zugang = new JTextField();
		textField_tiere_zugang.setColumns(10);
		textField_tiere_zugang.setBounds(194, 120, 138, 20);
		panel_tier.add(textField_tiere_zugang);
		
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
				
				textField_tiere_gbdatum.setText(null);
				textField_tiere_geschlecht.setText(null);
				textField_tiere_abgang.setText(null);
				textField_tiere_zugang.setText(null);
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
					 String temp6 ="";
					 String temp7 =""; 	
					 
					 s.changeTier(temp1,temp2,temp3,temp4,temp5,temp6,temp7);
					
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
					 String temp6 ="";
					 String temp7 =""; 	
					 
					 s.insertTier(temp1,temp2,temp3,temp4,temp5,temp6,temp7);
					
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
					 
					 if(s.deletTier(temp1)) {
						 textPane_tiere_listausgabe.setText("Tier erfolgreich gelˆscht"); 
					 }else {
						 textPane_tiere_listausgabe.setText("es ist ein Fehler aufgetreten"); 
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
		label_gehege_gehegename.setBounds(64, 86, 84, 26);
		panel_gehege.add(label_gehege_gehegename);
		
		JLabel label_gehege_baujahr = new JLabel("Baujahr:");
		label_gehege_baujahr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_gehege_baujahr.setBounds(64, 123, 84, 26);
		panel_gehege.add(label_gehege_baujahr);
		
		JLabel label_gehege_flaeche = new JLabel("Fl\u00E4che:");
		label_gehege_flaeche.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_gehege_flaeche.setBounds(64, 160, 84, 26);
		panel_gehege.add(label_gehege_flaeche);
		
				//TextFields--------------------------------------------
		
		textField_gehege_gehegename = new JTextField();
		textField_gehege_gehegename.setBounds(191, 90, 127, 20);
		panel_gehege.add(textField_gehege_gehegename);
		textField_gehege_gehegename.setColumns(10);
		
		textField_gehege_baujahr = new JTextField();
		textField_gehege_baujahr.setColumns(10);
		textField_gehege_baujahr.setBounds(191, 127, 127, 20);
		panel_gehege.add(textField_gehege_baujahr);
		
		textField_gehege_flaeche = new JTextField();
		textField_gehege_flaeche.setColumns(10);
		textField_gehege_flaeche.setBounds(191, 164, 127, 20);
		panel_gehege.add(textField_gehege_flaeche);
		
		textField_gehege_listenausgabe = new JTextField();
		textField_gehege_listenausgabe.setBounds(469, 44, 309, 341);
		panel_gehege.add(textField_gehege_listenausgabe);
		textField_gehege_listenausgabe.setColumns(10);
		
				//Buttons-----------------------------------
		
		JButton button_gehege_clear = new JButton("Clear");
		button_gehege_clear.setBounds(354, 43, 89, 23);
		panel_gehege.add(button_gehege_clear);
		
		JButton button_gehege_anlegen = new JButton("Anlegen");
		button_gehege_anlegen.setBounds(354, 126, 89, 23);
		panel_gehege.add(button_gehege_anlegen);
		
		JButton button_gehege_aendern = new JButton("\u00C4ndern");
		button_gehege_aendern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_gehege_aendern.setBounds(354, 163, 89, 23);
		panel_gehege.add(button_gehege_aendern);
		
		JButton button_gehege_loeschen = new JButton("L\u00F6schen");
		button_gehege_loeschen.setBounds(354, 197, 89, 23);
		panel_gehege.add(button_gehege_loeschen);

		
		JButton button_gehege_beenden = new JButton("Beenden");
		button_gehege_beenden.setBounds(689, 396, 89, 23);
		panel_gehege.add(button_gehege_beenden);
		
		JButton button_gehege_listenausgabe = new JButton("Gehegeliste ausgeben");
		button_gehege_listenausgabe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		label_arten_bezeichnung.setBounds(71, 103, 100, 25);
		panel_art.add(label_arten_bezeichnung);
		
		JLabel label_arten_lebensraum = new JLabel("Lebensraum:");
		label_arten_lebensraum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_arten_lebensraum.setBounds(71, 139, 100, 25);
		panel_art.add(label_arten_lebensraum);
		
		JLabel label_arten_latbezeichnung = new JLabel("lat. Bezeichnung:");
		label_arten_latbezeichnung.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_arten_latbezeichnung.setBounds(71, 175, 100, 25);
		panel_art.add(label_arten_latbezeichnung);
		
				//Textfields-------------------------------------------
		
		textField_arten_bezeichnung = new JTextField();
		textField_arten_bezeichnung.setBounds(200, 106, 125, 20);
		panel_art.add(textField_arten_bezeichnung);
		textField_arten_bezeichnung.setColumns(10);
		
		textField_arten_lebensraum = new JTextField();
		textField_arten_lebensraum.setColumns(10);
		textField_arten_lebensraum.setBounds(200, 142, 125, 20);
		panel_art.add(textField_arten_lebensraum);
		
		textField_arten_latbezeichnung = new JTextField();
		textField_arten_latbezeichnung.setColumns(10);
		textField_arten_latbezeichnung.setBounds(200, 178, 125, 20);
		panel_art.add(textField_arten_latbezeichnung);
		
		textField_arten_listenausgabe = new JTextField();
		textField_arten_listenausgabe.setBounds(466, 50, 307, 329);
		panel_art.add(textField_arten_listenausgabe);
		textField_arten_listenausgabe.setColumns(10);
		
				//Buttons---------------------------------------------------
		
		JButton button_arten_clear = new JButton("Clear");
		button_arten_clear.setBounds(351, 49, 89, 23);
		panel_art.add(button_arten_clear);
		
		JButton button_arten_anlegen = new JButton("Anlegen");
		button_arten_anlegen.setBounds(351, 141, 89, 23);
		panel_art.add(button_arten_anlegen);
		
		JButton button_arten_aendern = new JButton("\u00C4ndern");
		button_arten_aendern.setBounds(351, 177, 89, 23);
		panel_art.add(button_arten_aendern);
		
		JButton button_arten_loeschen = new JButton("L\u00F6schen");
		button_arten_loeschen.setBounds(351, 211, 89, 23);
		panel_art.add(button_arten_loeschen);
		
		JButton button_arten_beenden = new JButton("Beenden");
		button_arten_beenden.setBounds(684, 390, 89, 23);
		panel_art.add(button_arten_beenden);
		
		JButton button_arten_listenausgabe = new JButton("Artenliste ausgeben");
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
		
		textField_futter_listenausgabe = new JTextField();
		textField_futter_listenausgabe.setBounds(485, 60, 290, 318);
		panel_futter.add(textField_futter_listenausgabe);
		textField_futter_listenausgabe.setColumns(10);
		
				//Buttons-----------------------------------------
		
		JButton button_futter_clear = new JButton("Clear");
		button_futter_clear.setBounds(354, 59, 89, 23);
		panel_futter.add(button_futter_clear);
		
		JButton button_futter_anlegen = new JButton("Anlegen");
		button_futter_anlegen.setBounds(354, 114, 89, 23);
		panel_futter.add(button_futter_anlegen);
		
		JButton button_futter_aendern = new JButton("\u00C4ndern");
		button_futter_aendern.setBounds(354, 148, 89, 23);
		panel_futter.add(button_futter_aendern);
		
		JButton button_futter_loeschen = new JButton("L\u00F6schen");
		button_futter_loeschen.setBounds(354, 182, 89, 23);
		panel_futter.add(button_futter_loeschen);
		
		
		JButton button_futter_beenden = new JButton("Beenden");
		button_futter_beenden.setBounds(686, 389, 89, 23);
		panel_futter.add(button_futter_beenden);
		
		JButton button_futter_listenausgabe = new JButton("Futterliste ausgeben");
		button_futter_listenausgabe.setBounds(485, 389, 154, 23);
		panel_futter.add(button_futter_listenausgabe);
		
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
		label_futterdetails_menge.setBounds(64, 113, 75, 25);
		panel_futterdetails.add(label_futterdetails_menge);
		
		JLabel label_futterdetails_uhrzeit = new JLabel("Uhrzeit:");
		label_futterdetails_uhrzeit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_futterdetails_uhrzeit.setBounds(64, 149, 75, 25);
		panel_futterdetails.add(label_futterdetails_uhrzeit);
	
				//Textfields-------------------------------------------
				
		textField_futterdetails_menge = new JTextField();
		textField_futterdetails_menge.setBounds(149, 116, 134, 20);
		panel_futterdetails.add(textField_futterdetails_menge);
		textField_futterdetails_menge.setColumns(10);
		
		textField_futterdetails_uhrzeit = new JTextField();
		textField_futterdetails_uhrzeit.setBounds(149, 152, 134, 20);
		panel_futterdetails.add(textField_futterdetails_uhrzeit);
		textField_futterdetails_uhrzeit.setColumns(10);
		
		textField_futterdetails_listenausgabe = new JTextField();
		textField_futterdetails_listenausgabe.setBounds(446, 62, 316, 316);
		panel_futterdetails.add(textField_futterdetails_listenausgabe);
		textField_futterdetails_listenausgabe.setColumns(10);
		
				//Buttons-----------------------------------------------
		
		JButton button_futterdetails_clear = new JButton("Clear");
		button_futterdetails_clear.setBounds(321, 61, 89, 23);
		panel_futterdetails.add(button_futterdetails_clear);
		
		JButton button_futterdetails_anlegen = new JButton("Anlegen");
		button_futterdetails_anlegen.setBounds(321, 149, 89, 23);
		panel_futterdetails.add(button_futterdetails_anlegen);
		
		JButton button_futterdetails_‰ndern = new JButton("\u00C4ndern");
		button_futterdetails_‰ndern.setBounds(321, 183, 89, 23);
		panel_futterdetails.add(button_futterdetails_‰ndern);
		
		JButton button_futterdetails_loeschen = new JButton("L\u00F6schen");
		button_futterdetails_loeschen.setBounds(321, 217, 89, 23);
		panel_futterdetails.add(button_futterdetails_loeschen);

		
		JButton button_futterdetails_beenden = new JButton("Beenden");
		button_futterdetails_beenden.setBounds(673, 389, 89, 23);
		panel_futterdetails.add(button_futterdetails_beenden);
		
		JButton button_futterdetails_listenausgabe = new JButton("Futterdetails ausgeben");
		button_futterdetails_listenausgabe.setBounds(446, 389, 166, 23);
		panel_futterdetails.add(button_futterdetails_listenausgabe);
		
		//*Futterdetails------------------------------------------------------------------------------------------------------
		
		
	}
}
