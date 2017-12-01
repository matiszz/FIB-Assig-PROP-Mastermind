package com.prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VistaDificultatiMode extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaDificultatiMode frame = new VistaDificultatiMode();
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
	public VistaDificultatiMode() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeleccionaUnMode = new JLabel("Selecciona un mode de joc");
		lblSeleccionaUnMode.setBounds(131, 39, 180, 16);
		contentPane.add(lblSeleccionaUnMode);
		
		JRadioButton rdbtnCodebreaker = new JRadioButton("Code Breaker");
		rdbtnCodebreaker.setBounds(170, 66, 141, 23);
		contentPane.add(rdbtnCodebreaker);
		
		JRadioButton rdbtnCodeMaker = new JRadioButton("Code Maker");
		rdbtnCodeMaker.setBounds(170, 101, 141, 23);
		contentPane.add(rdbtnCodeMaker);
		
		ButtonGroup grupMode = new ButtonGroup();
		grupMode.add(rdbtnCodeMaker);
		grupMode.add(rdbtnCodebreaker);

		JLabel lblSeleccionaUnaDificultat = new JLabel("Selecciona una dificultat");
		lblSeleccionaUnaDificultat.setBounds(131, 136, 180, 16);
		contentPane.add(lblSeleccionaUnaDificultat);
		
		JRadioButton rdbtnFcil = new JRadioButton("Fàcil");
		rdbtnFcil.setBounds(170, 164, 141, 23);
		contentPane.add(rdbtnFcil);
		
		JRadioButton rdbtnMitjana = new JRadioButton("Mitjana");
		rdbtnMitjana.setBounds(170, 199, 141, 23);
		contentPane.add(rdbtnMitjana);
		
		JRadioButton rdbtnDifcil = new JRadioButton("Difícil");
		rdbtnDifcil.setBounds(170, 234, 141, 23);
		contentPane.add(rdbtnDifcil);
		
		ButtonGroup grupDificultat = new ButtonGroup();
		grupDificultat.add(rdbtnFcil);
		grupDificultat.add(rdbtnMitjana);
		grupDificultat.add(rdbtnDifcil);
		
		JButton btnNewButton = new JButton("Menú Principal");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VistaMenuPrincipal nv = new VistaMenuPrincipal();
				nv.setVisible(true);
				VistaDificultatiMode.this.dispose();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(2, 6, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnComenar = new JButton("Començar");
		btnComenar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnComenar.setBounds(323, 243, 117, 29);
		contentPane.add(btnComenar);
		
	}
}
