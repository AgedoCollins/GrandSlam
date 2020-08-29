package be.collins.vue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.collins.pojo.Tournoi;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Acceuil extends JFrame {

	private JPanel contentPane;
	private JButton btnSimpleMessieurs;
	private JButton btnDoubleDames;
	private JButton btnDoubleMixte;
	private JButton btnDoubleMessieurs;
	private JButton btnSimpleDames;
	private Tournoi newTournoi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceuil frame = new Acceuil();
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
	public Acceuil() {
		setResizable(false);
		setTitle("GranD SLaM");
		newTournoi = new Tournoi();
		newTournoi.createTournoi();
		initComponents();
		createEvents();
	}

	private void createEvents() {
		// TODO Auto-generated method stub
		btnSimpleMessieurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					newTournoi.TypeTournoi(1);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});

		btnSimpleDames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					newTournoi.TypeTournoi(2);
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});

		btnDoubleMixte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					newTournoi.TypeTournoi(5);
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});

		btnDoubleDames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					newTournoi.TypeTournoi(3);
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});

		btnDoubleMessieurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					newTournoi.TypeTournoi(4);

				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnSimpleMessieurs = new JButton("Simple messieurs");
		btnSimpleMessieurs.setBounds(33, 10, 141, 64);
		contentPane.add(btnSimpleMessieurs);

		btnSimpleDames = new JButton("Simple dames");
		btnSimpleDames.setBounds(336, 10, 118, 64);
		contentPane.add(btnSimpleDames);

		btnDoubleMessieurs = new JButton("Double messieurs");
		btnDoubleMessieurs.setBounds(33, 192, 141, 64);
		contentPane.add(btnDoubleMessieurs);

		btnDoubleDames = new JButton("Double Dames");
		btnDoubleDames.setBounds(336, 192, 118, 64);
		contentPane.add(btnDoubleDames);

		btnDoubleMixte = new JButton("Double mixte");
		btnDoubleMixte.setBounds(191, 103, 118, 64);
		contentPane.add(btnDoubleMixte);

		JButton btnCreerUnNouveau = new JButton("Creer un nouveau tournoi");
		btnCreerUnNouveau.setForeground(Color.WHITE);
		btnCreerUnNouveau.setBackground(Color.GREEN);
		btnCreerUnNouveau.setBounds(298, 284, 201, 21);
		contentPane.add(btnCreerUnNouveau);

	}
}
