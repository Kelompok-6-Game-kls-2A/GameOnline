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
					CLan frame = new CLan();					
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
	public CLan() {
		
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
		
		