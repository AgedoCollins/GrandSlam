package be.collins.vue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.collins.exception.TournoiException;
import be.collins.pojo.Tournoi;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard_Admin extends JFrame {

	private JPanel contentPane;
	private JButton btnSimpleMessieurs;
	private JButton btnDoubleDames;
	private JButton btnDoubleMixte;
	private JButton btnDoubleMessieurs;
	private JButton btnSimpleDames;
	private Tournoi newTournoi;

	/**
	 * Create the frame.
	 */
	public Dashboard_Admin() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("GranD SLaM");
		newTournoi = new Tournoi();
		initComponents();
		createEvents();
	}

	private void createEvents() {
		// TODO Auto-generated method stub
		btnSimpleMessieurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Simple messieurs");
				try {
					newTournoi.createTypeTournoi(1, true);
				} catch (TournoiException e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});

		btnSimpleDames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					newTournoi.createTypeTournoi(2, false);
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});

		btnDoubleMixte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					newTournoi.createTypeTournoi(5, false);
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});

		btnDoubleDames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					newTournoi.createTypeTournoi(3, false);
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});

		btnDoubleMessieurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					newTournoi.createTypeTournoi(4, true);
					
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
		setBounds(100, 100, 500, 300);
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

	}
}
