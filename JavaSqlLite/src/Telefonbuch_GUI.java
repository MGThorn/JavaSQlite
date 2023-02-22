import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Toolkit;

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
import javax.swing.JList;


public class Telefonbuch_GUI {
	
	static SQL s = new SQL();

	private JFrame frm;
	
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
	
	
	
	private JTextField textField_arten_bezeichnung;
	private JTextField textField_arten_lebensraum;
	private JTextField textField_arten_latbezeichnung;

	private JTextField textField_futter_bezeichnung;
	private JTextField textField_futterdetails_menge;
	private JTextField textField_futterdetails_uhrzeit;
	private JTextPane textPane_pfleger_listenausgabe;
	private JTextPane textPane_arten_listenausgabe;
	private JTextPane textPane_futter_listenausgabe;
	private JTextPane textPane_futterdetails_listenausgabe;
	
	private String[] Art_Bezeichnung;
	private String[] Gehege_Name;
	private String[] Pfleger_Nummer;
	private String[] Tier_Name;
	private String[] Futter_Bezeichnung;
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
					Telefonbuch_GUI window = new Telefonbuch_GUI();
					window.frm.setVisible(true);
					//window.frmDatenbankDesFrankfurter.setSize(Toolkit.getDefaultToolkit().getScreenSize());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Telefonbuch_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		
//Hauptmenü------------------------------------------------------------------------------------------------------------
		
		
		frm = new JFrame();
		frm.setTitle("Datenbank des Frankfurter Zoos");
		frm.setBounds(0, 0, 836, 536);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Arial", Font.BOLD, 15));
		frm.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_haupt = new JPanel();
		panel_haupt.setBackground(Color.PINK);
		tabbedPane.addTab("Hauptmenü", null, panel_haupt, null);
		panel_haupt.setLayout(null);
		
		JLabel label_hauptmenue_ueberschrift_1 = new JLabel("Datenbank des Telefonbuchs");
		label_hauptmenue_ueberschrift_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_hauptmenue_ueberschrift_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_hauptmenue_ueberschrift_1.setBounds(165, 25, 505, 94);
		panel_haupt.add(label_hauptmenue_ueberschrift_1);
		
		JLabel label_hauptmenue_ueberschrift_2 = new JLabel("Benutzeroberfl�che");
		label_hauptmenue_ueberschrift_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_hauptmenue_ueberschrift_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_hauptmenue_ueberschrift_2.setBounds(175, 72, 505, 94);
		panel_haupt.add(label_hauptmenue_ueberschrift_2);
		
		JLabel label_hauptmenue_anweisung = new JLabel("Zwischen den Tabs im oberen Bereich klicken, um die gew\u00FCnschten Bereiche zu wecheseln.");
		label_hauptmenue_anweisung.setFont(new Font("Tahoma", Font.ITALIC, 15));
		label_hauptmenue_anweisung.setVerticalAlignment(SwingConstants.TOP);
		label_hauptmenue_anweisung.setBounds(128, 155, 612, 29);
		panel_haupt.add(label_hauptmenue_anweisung);
		
		JLabel lblInDemTab = new JLabel("In dem Tab \"Bearbeiten\" neue Eintr\u00E4ge in der Datenbank anlegen/\u00E4ndern/l\u00F6schen.");
		lblInDemTab.setVerticalAlignment(SwingConstants.TOP);
		lblInDemTab.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInDemTab.setBounds(128, 235, 612, 29);
		panel_haupt.add(lblInDemTab);
		
		JLabel lblMitDemTab = new JLabel("In dem Tab  \"Eintr\u00E4ge\" zu einer Ansicht Eintr\u00E4ge und Eintr\u00E4ge suchen");
		lblMitDemTab.setVerticalAlignment(SwingConstants.TOP);
		lblMitDemTab.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMitDemTab.setBounds(128, 275, 612, 29);
		panel_haupt.add(lblMitDemTab);
		
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
				JFrame pwFrame = new JFrame();
				pwFrame.setBounds(500, 300, 300, 100);
				pwFrame.setTitle("Passwort");
		 
				JPanel pwPanel = new JPanel();
				JLabel pwLabel = new JLabel("Admin Passwort");
				JLabel pwALabel = new JLabel("");
				JPasswordField pwField = new JPasswordField(8);
				JButton pwButton = new JButton("RESET");
				JButton exitButton = new JButton("close");
				
				String Passwort = "Admin";
				//char [] Passwort = {'P','a','s','s','w','o','r','t'};
				exitButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pwFrame.dispose();
					}
				});

				pwButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						char [] Pass = pwField.getPassword();
						String pw="";
						for(char Element:Pass) {
							pw+=Element;
						}
						if(pw.equalsIgnoreCase(Passwort)) {
							System.out.println("pw richtig");
							s.deletDatabases();
							s.createDatabases();
							refreshComboBoxes();
							pwFrame.dispose();
						}else {
							pwField.setText("");
							pwALabel.setText("pw falsch");
						}
					}
				});
		 
				pwPanel.add(pwLabel);
				pwPanel.add(pwField);
				pwPanel.add(pwButton);
				pwPanel.add(pwALabel);
				pwPanel.add(exitButton);
		 
				pwFrame.getContentPane().add(pwPanel);
				pwFrame.setAlwaysOnTop(true);
				pwFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				pwFrame.setResizable(false);
				pwFrame.setUndecorated(true);
				pwFrame.setVisible(true);
			}
		});
		btn_Reset.setBounds(360, 395, 297, 39);
		panel_haupt.add(btn_Reset);
		
		JLabel lblResetAllData = new JLabel("RESET FULL DATA BASE:");
		lblResetAllData.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResetAllData.setBounds(128, 395, 222, 39);
		panel_haupt.add(lblResetAllData);
		
			//*Futter--------------------------------
		
		//Futterdetails-------------------------------------------------------------------------------------------------------------
		
		
		JPanel panel_list = new JPanel();
		tabbedPane.addTab("Futterdetails", null, panel_list, null);
		panel_list.setLayout(null);
		
				//Labels----------------------------------------------
		
		JLabel label_futterdetails_ueberschrift = new JLabel("Futterdetails");
		label_futterdetails_ueberschrift.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_futterdetails_ueberschrift.setBounds(64, 56, 147, 25);
		panel_list.add(label_futterdetails_ueberschrift);
		
		JLabel label_futterdetails_menge = new JLabel("Menge:");
		label_futterdetails_menge.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_futterdetails_menge.setBounds(40, 120, 75, 25);
		panel_list.add(label_futterdetails_menge);
		
		JLabel label_futterdetails_uhrzeit = new JLabel("Uhrzeit:");
		label_futterdetails_uhrzeit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_futterdetails_uhrzeit.setBounds(40, 160, 75, 25);
		panel_list.add(label_futterdetails_uhrzeit);
		
					//Textfields-------------------------------------------
					
			textField_futterdetails_menge = new JTextField();
			textField_futterdetails_menge.setBounds(150, 120, 140, 20);
			panel_list.add(textField_futterdetails_menge);
			textField_futterdetails_menge.setColumns(10);
			
			textField_futterdetails_uhrzeit = new JTextField();
			textField_futterdetails_uhrzeit.setBounds(150, 160, 140, 20);
			panel_list.add(textField_futterdetails_uhrzeit);
			textField_futterdetails_uhrzeit.setColumns(10);
			
			textPane_futterdetails_listenausgabe = new JTextPane();
			textPane_futterdetails_listenausgabe.setBounds(446, 62, 316, 316);
			panel_list.add(textPane_futterdetails_listenausgabe);
			
			JButton button_futterdetails_anlegen = new JButton("Anlegen");
			button_futterdetails_anlegen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 try {
						 String temp1 =textField_futterdetails_menge.getText();
						 String temp2 =textField_futterdetails_uhrzeit.getText();
						 
						 

						 if(!temp1.isBlank()&&!temp2.isBlank()&&temp_gehege_PNummerAuswahl!=null) {
							 
							 
							 refreshComboBoxes();
						 }else {
							 		 }
						 
						
						} catch (NumberFormatException expt) {
						
							expt.printStackTrace();
						}
				}
			});
			button_futterdetails_anlegen.setBounds(321, 149, 89, 23);
			panel_list.add(button_futterdetails_anlegen);
			
			JButton button_futterdetails_aendern = new JButton("\u00C4ndern");
			button_futterdetails_aendern.setBounds(321, 183, 89, 23);
			panel_list.add(button_futterdetails_aendern);
			
			JButton button_futterdetails_loeschen = new JButton("L\u00F6schen");
			button_futterdetails_loeschen.setBounds(321, 217, 89, 23);
			panel_list.add(button_futterdetails_loeschen);
			
					
					JButton button_futterdetails_beenden = new JButton("Beenden");
					button_futterdetails_beenden.setBounds(673, 389, 89, 23);
					panel_list.add(button_futterdetails_beenden);
					
					JButton button_futterdetails_listenausgabe = new JButton("Futterdetails ausgeben");
					button_futterdetails_listenausgabe.setBounds(446, 389, 166, 23);
					panel_list.add(button_futterdetails_listenausgabe);
					
					JLabel label_futterdetails_TierName = new JLabel("Name des Tieres:");
					label_futterdetails_TierName.setFont(new Font("Tahoma", Font.PLAIN, 12));
					label_futterdetails_TierName.setBounds(40, 200, 95, 25);
					panel_list.add(label_futterdetails_TierName);
					
					comboBox_futterdetails_TierNameAuswahl = new JComboBox();
					comboBox_futterdetails_TierNameAuswahl.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println(comboBox_futterdetails_TierNameAuswahl.getSelectedItem());
							temp_futterdetails_TierNameAuswahl=(String) comboBox_futterdetails_TierNameAuswahl.getSelectedItem();
						}
					});
					comboBox_futterdetails_TierNameAuswahl.setBounds(150, 200, 140, 20);
					panel_list.add(comboBox_futterdetails_TierNameAuswahl);
					
					JLabel label_futterdetails_NameDesFutters = new JLabel("Name des Futters:");
					label_futterdetails_NameDesFutters.setFont(new Font("Tahoma", Font.PLAIN, 12));
					label_futterdetails_NameDesFutters.setBounds(40, 240, 101, 25);
					panel_list.add(label_futterdetails_NameDesFutters);
					
					comboBox_futterdetails_FutterBezeichnungAuswahl = new JComboBox();
					comboBox_futterdetails_FutterBezeichnungAuswahl.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println(comboBox_futterdetails_FutterBezeichnungAuswahl.getSelectedItem());
							temp_gehege_PNummerAuswahl=(String) comboBox_futterdetails_FutterBezeichnungAuswahl.getSelectedItem();
						}
					});
					comboBox_futterdetails_FutterBezeichnungAuswahl.setBounds(150, 240, 140, 20);
					panel_list.add(comboBox_futterdetails_FutterBezeichnungAuswahl);
		
			//*Gehege----------------------------------------------------------------------------------------------------------------------
		
			//Arten------------------------------------------------------------------------------------------------------------------------
		
		JPanel panel_edit = new JPanel();
		tabbedPane.addTab("Artenverwaltung", null, panel_edit, null);
		panel_edit.setLayout(null);
		
				//Labels---------------------------------------------
		
		JLabel label_arten_ueberschrift = new JLabel("Arten");
		label_arten_ueberschrift.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_arten_ueberschrift.setBounds(71, 44, 100, 25);
		panel_edit.add(label_arten_ueberschrift);
		
		JLabel label_arten_bezeichnung = new JLabel("Bezeichnung:");
		label_arten_bezeichnung.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_arten_bezeichnung.setBounds(71, 100, 100, 25);
		panel_edit.add(label_arten_bezeichnung);
		
		JLabel label_arten_lebensraum = new JLabel("Lebensraum:");
		label_arten_lebensraum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_arten_lebensraum.setBounds(71, 180, 100, 25);
		panel_edit.add(label_arten_lebensraum);
		
		JLabel label_arten_latbezeichnung = new JLabel("lat. Bezeichnung:");
		label_arten_latbezeichnung.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_arten_latbezeichnung.setBounds(71, 140, 100, 25);
		panel_edit.add(label_arten_latbezeichnung);
		
				//Textfields-------------------------------------------
		
		textField_arten_bezeichnung = new JTextField();
		textField_arten_bezeichnung.setBounds(200, 100, 125, 20);
		panel_edit.add(textField_arten_bezeichnung);
		textField_arten_bezeichnung.setColumns(10);
		
		textField_arten_lebensraum = new JTextField();
		textField_arten_lebensraum.setColumns(10);
		textField_arten_lebensraum.setBounds(200, 180, 125, 20);
		panel_edit.add(textField_arten_lebensraum);
		
		textField_arten_latbezeichnung = new JTextField();
		textField_arten_latbezeichnung.setColumns(10);
		textField_arten_latbezeichnung.setBounds(200, 140, 125, 20);
		panel_edit.add(textField_arten_latbezeichnung);
		
		textPane_arten_listenausgabe = new JTextPane();
		textPane_arten_listenausgabe.setBounds(466, 50, 307, 329);
		panel_edit.add(textPane_arten_listenausgabe);
		
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
		panel_edit.add(button_arten_anlegen);
		
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
		panel_edit.add(button_arten_aendern);
		
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
		panel_edit.add(button_arten_loeschen);
		
		JButton button_arten_beenden = new JButton("Beenden");
		button_arten_beenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm.dispose();
			}
		});
		button_arten_beenden.setBounds(684, 390, 89, 23);
		panel_edit.add(button_arten_beenden);
		
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
		panel_edit.add(button_arten_listenausgabe);
		
			//*Arten--------------------------------------------------------------------------------------------------------
		
			//Futter--------------------------------------------------------------------------------------------------------
		
		JPanel panel_delite = new JPanel();
		tabbedPane.addTab("Futterverwaltung", null, panel_delite, null);
		panel_delite.setLayout(null);
		
				//Labels---------------------------------------------
		
		JLabel label_futter_ueberschrift = new JLabel("Futter");
		label_futter_ueberschrift.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_futter_ueberschrift.setBounds(69, 49, 78, 34);
		panel_delite.add(label_futter_ueberschrift);
		
		JLabel label_futter_bezeichnung = new JLabel("Bezeichnung:");
		label_futter_bezeichnung.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label_futter_bezeichnung.setBounds(69, 114, 78, 21);
		panel_delite.add(label_futter_bezeichnung);
		
				//Textfields----------------------------------------
		
		textField_futter_bezeichnung = new JTextField();
		textField_futter_bezeichnung.setBounds(196, 115, 126, 20);
		panel_delite.add(textField_futter_bezeichnung);
		textField_futter_bezeichnung.setColumns(10);
		
		textPane_futter_listenausgabe = new JTextPane();
		textPane_futter_listenausgabe.setBounds(485, 60, 290, 318);
		panel_delite.add(textPane_futter_listenausgabe);
		
				//Buttons-----------------------------------------
		
		JButton button_futter_clear = new JButton("Clear");
		button_futter_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_futter_bezeichnung.setText("");
				textPane_futter_listenausgabe.setText("");
			}
		});
		button_futter_clear.setBounds(354, 59, 89, 23);
		panel_delite.add(button_futter_clear);
		
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
		panel_delite.add(button_futter_anlegen);
		
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
		panel_delite.add(button_futter_loeschen);
		
		
		JButton button_futter_beenden = new JButton("Beenden");
		button_futter_beenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm.dispose();
			}
		});
		button_futter_beenden.setBounds(686, 389, 89, 23);
		panel_delite.add(button_futter_beenden);
		
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
		panel_delite.add(button_futter_listenausgabe);
		
		JLabel lbl_futter_ändern = new JLabel("   \u00C4ndern");
		lbl_futter_ändern.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl_futter_ändern.setBounds(354, 148, 89, 23);
		panel_delite.add(lbl_futter_ändern);
		
		refreshComboBoxes();
		
	}
	public void refreshComboBoxes(){
		try{
			Art_Bezeichnung = s.selectArt_Bezeichnung();
		}catch(Exception ex) {
			System.err.println("ERROR OCCURRED [GUI_FrankfurterZOO](line 1137) \n as refreshComboBoxes() tried to pull Date for Comboxes \n Art Table had no entries");
		}
		try{
			Gehege_Name = s.selectGehege_Name();
		}catch(Exception ex) {
			System.err.println("ERROR OCCURRED [GUI_FrankfurterZOO](line 1144) \n as refreshComboBoxes() tried to pull Date for Comboxes \n Gehege Table had no entries");
		}
		
		try {	
			Pfleger_Nummer = s.selectPfleger_PNummer();
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
