package GME;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javafx.beans.binding.StringExpression;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import java.awt.SystemColor;



public class Clan extends JFrame {
	
	protected static final String[] args = null;
	private String namaclan ;
	private String Lvl;
	private String score;
	private String jumlahMember;
	private String member;
 
	 
		public Clan(String namaclan, String lvl, String score, String jumlahMember, String member) throws HeadlessException {
		super();
		this.namaclan = namaclan;
		this.Lvl = lvl;
		this.score = score;
		this.jumlahMember = jumlahMember;
		this.member = member;
		
	}

	public String getNamaclan() {
		return namaclan;
	}

	public void setNamaclan(String namaclan) {
		this.namaclan = namaclan;
	}

	public String getLvl() {
		return Lvl;
	}

	public void setLvl(String lvl) {
		Lvl = lvl;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getJumlahMember() {
		return jumlahMember;
	}

	public void setJumlahMember(String jumlahMember) {
		this.jumlahMember = jumlahMember;
	}
	
	public String getMember() {
		return member; 
	}

	public void setMember(String member) {
		this.member = member;
	}
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clan frame = new Clan();					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Clan() {
		
		//Clandata kclan = new Clandata();
		//player players = new player();
		
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 388);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTopplyayer = new JLabel("1");
		lblTopplyayer.setBackground(Color.ORANGE);
		lblTopplyayer.setBounds(71, 161, 62, 14);
		contentPane.add(lblTopplyayer);
		
		JLabel label = new JLabel("2");
		label.setBackground(Color.ORANGE);
		label.setBounds(71, 207, 62, 14);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("3");
		label_2.setBackground(Color.ORANGE);
		label_2.setBounds(71, 251, 62, 14);
		contentPane.add(label_2);
		
		JLabel lblMembers = new JLabel("Members : 10/10");
		lblMembers.setBounds(682, 161, 111, 14);
		contentPane.add(lblMembers);
		
		JLabel label_10 = new JLabel("Members : 10/10");
		label_10.setBounds(682, 207, 111, 14);
		contentPane.add(label_10);
		
		JLabel label_12 = new JLabel("Members : 10/10");
		label_12.setBounds(682, 251, 111, 14);
		contentPane.add(label_12);
		
		JLabel lblScore = new JLabel("50000");
		lblScore.setBounds(835, 161, 46, 14);
		contentPane.add(lblScore);
		
		JLabel label_15 = new JLabel("45000");
		label_15.setBounds(835, 207, 46, 14);
		contentPane.add(label_15);
		
		JLabel label_17 = new JLabel("40000");
		label_17.setBounds(835, 251, 46, 14);
		contentPane.add(label_17);
		
		JButton btnNewButton = new JButton("Daedra");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				
				namaclan = btnNewButton.getText();
				Lvl = btnNewButton.getText();
				score = btnNewButton.getText();
				jumlahMember = btnNewButton.getText();
				
				if (btnNewButton.equals(btnNewButton)) {
					System.out.println("Clan"+"\t\t"+": Daedra");
					System.out.println("Lvl"+"\t\t"+": 50");
					System.out.println("Score"+"\t\t"+": 3000");
					System.out.println("jumlah Member"+"\t"+": 10/10");
					System.out.println();
					System.out.println("Members");
					
				
				ArrayList<String> member = new ArrayList<String>(10);
				
				member.add("1."+"Dayat \n  Lvl 45 \t Deffensive Won = 5"+"\n  Point 10000 \t Leader");
				member.add("\n2."+"Qhodir \n  Lvl 50 \t Deffensive Won = 5"+"\n  Point 9000 \t Elder");
				member.add("\n3."+"Vincia \n  Lvl 39 \t Deffensive Won = 4"+"\n  Point 9000 \t Co-Leader");
				member.add("\n4."+"Tari \n  Lvl 38 \t Deffensive Won = 4"+"\n  Point 8800");
				member.add("\n5."+"Ica \n  Lvl 46 \t Deffensive Won = 4"+"\n  Point 8850");
				member.add("\n6."+"Inab \n  Lvl 67 \t Deffensive Won = 3"+"\n  Point 8500");
				member.add("\n7."+"Daus \n  Lvl 23 \t Deffensive Won = 3"+"\n  Point 7800");
				member.add("\n8."+"Angga \n  Lvl 47 \t Deffensive Won = 3"+"\n  Point 7500");
				member.add("\n9."+"Riki \n  Lvl 23 \t Deffensive Won = 3"+"\n  Point 7000");
				member.add("\n10."+"Abdul \n  Lvl 10 \t Deffensive Won = 3"+"\n  Point 7100");
				

				
				member.forEach(System.out :: println);
				}
			}	
					
		});

		btnNewButton.setBounds(170, 157, 454, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("WarBee");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				namaclan = btnNewButton.getText();
				Lvl = btnNewButton.getText();
				score = btnNewButton.getText();
				jumlahMember = btnNewButton.getText();
				
				if (btnNewButton.equals(btnNewButton)) {
					System.out.println("Clan"+"\t\t"+": WarBee");
					System.out.println("Lvl"+"\t\t"+": 51");
					System.out.println("Score"+"\t\t"+": 3050");
					System.out.println("jumlah Member"+"\t"+": 10/10");
					System.out.println();
					System.out.println("Members");
					
				
				ArrayList<String> member = new ArrayList<String>(10);
				
				member.add("1."+"Si won \n  Lvl 67 \t Deffensive Won = 9"+"\n  Point 25000 \t Leader");
				member.add("\n2."+"Leeteuk \n  Lvl 60 \t Deffensive Won = 7"+"\n  Point 20000 \t Elder");
				member.add("\n3."+"Heechul \n  Lvl 55 \t Deffensive Won = 8"+"\n  Point 18000 \t Co-Leader");
				member.add("\n4."+"Donghae \n  Lvl 50 \t Deffensive Won = 6"+"\n  Point 17300");
				member.add("\n5."+"Yesung \n  Lvl 46 \t Deffensive Won = 5"+"\n  Point 15000");
				member.add("\n6."+"Kyuhyun \n  Lvl 56 \t Deffensive Won = 4"+"\n  Point 14300");
				member.add("\n7."+"Eunhyuk \n  Lvl 45 \t Deffensive Won = 3"+"\n  Point 12000");
				member.add("\n8."+"Ryeowook \n  Lvl 30 \t Deffensive Won = 2"+"\n  Point 5000");
				member.add("\n9."+"Sungmin \n  Lvl 23 \t Deffensive Won = 5"+"\n  Point 4500");
				member.add("\n10."+"Shindong \n  Lvl 10 \t Deffensive Won = 9"+"\n  Point 1998");
				

				
				member.forEach(System.out :: println);
				}
			}
		});