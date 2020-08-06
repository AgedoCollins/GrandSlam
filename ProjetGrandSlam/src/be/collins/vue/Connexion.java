package be.collins.vue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.collins.pojo.*;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.EventQueue;

public class Connexion extends JFrame {

	private static final long serialVersionUID = 5802302544469570734L;
	private JPanel contentPane;
	private JTextField textFieldPseudo;
	@SuppressWarnings("unused")
	private JPasswordField MdpTextField;
	private JLabel labelMsgErreur;
	private JButton btnConnexion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connexion frame = new Connexion();
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
	public Connexion() {
		setTitle("Projet pr\u00EAt de Tennis - Connexion");
		initComponents();
		createEvents();
	}

	///////////////////////////////////////////////////////////////////////////////
	// Cette méthode contient le code pour la création et l'initialisation //
	// des composants //
	////////////////////////////////////////////////////////////////////////////
	private void initComponents() {
		// TODO Auto-generated method stub
		setBackground(Color.WHITE);
		setTitle("Projet pr\u00EAt de jeu - Connexion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 269);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUser = new JLabel("Pseudo");
		lblUser.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblUser.setBounds(73, 37, 83, 21);
		contentPane.add(lblUser);

		JLabel lblPassword = new JLabel("Mot de passe");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblPassword.setBounds(73, 83, 103, 24);
		contentPane.add(lblPassword);

		textFieldPseudo = new JTextField();
		textFieldPseudo.setBounds(253, 31, 171, 27);
		contentPane.add(textFieldPseudo);
		textFieldPseudo.setColumns(10);

		MdpTextField = new JPasswordField();
		MdpTextField.setBounds(253, 80, 171, 27);
		contentPane.add(MdpTextField);

		labelMsgErreur = new JLabel("");
		labelMsgErreur.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		labelMsgErreur.setForeground(Color.RED);
		labelMsgErreur.setBounds(90, 194, 334, 24);
		contentPane.add(labelMsgErreur);

		btnConnexion = new JButton("Connexion");
		btnConnexion.setFont(new Font("Tahoma", Font.ITALIC, 12));
		btnConnexion.setForeground(Color.BLACK);
		btnConnexion.setBackground(UIManager.getColor("Button.background"));
		btnConnexion.setBounds(206, 161, 109, 23);
		contentPane.add(btnConnexion);
	}

	///////////////////////////////////////////////////////////////////////////
	// Cette méthode contient le code pour la création des evenements //
	/////////////////////////////////////////////////////////////////////////
	private void createEvents() {
		// TODO Auto-generated method stub
		btnConnexion.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			public boolean champsVide() {
				boolean vide = false;
				if (textFieldPseudo.getText().isEmpty() || MdpTextField.getText().isEmpty()) {
					labelMsgErreur.setText("Veuillez remplir tous les champs.");
					vide = true;
				}
				return vide;
			}

			public void loginpasswordIncorrect() {
				labelMsgErreur.setText("Login et/ou mot de passe incorrect.");

			}

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (!champsVide()) {
					Admin administrateur = new Admin();
					if (administrateur.connexionAdministrateur(textFieldPseudo.getText(), MdpTextField.getText())) {
						Dashboard_Admin dashboard_Admin = new Dashboard_Admin();
						dispose();
						dashboard_Admin.setVisible(true);
						dashboard_Admin.setResizable(false);
					} else {
						loginpasswordIncorrect();
					}
				}

			}
		});
	}
}