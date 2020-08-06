package be.collins.vue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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

	/**
	 * Create the frame.
	 */
	public Dashboard_Admin() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("GranD SLaM");
		initComponents();
		createEvents();
	}

	private void createEvents() {
		// TODO Auto-generated method stub
		btnSimpleMessieurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Simple messieurs");
			}
		});

		btnSimpleDames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		btnDoubleMixte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		btnDoubleDames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		btnDoubleMessieurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
