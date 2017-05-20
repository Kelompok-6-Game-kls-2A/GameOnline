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