package com.prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaRanking extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaRanking frame = new VistaRanking();
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
	public VistaRanking() {
		getContentPane().setLayout(null);
		
		JButton btnTornar = new JButton("Tornar");
		btnTornar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VistaMenuPrincipal nv = new VistaMenuPrincipal();
				nv.setVisible(true);
				VistaRanking.this.dispose();
			}
		});
		btnTornar.setBounds(16, 6, 117, 29);
		getContentPane().add(btnTornar);
		
		String[] ranking;
		ControladorDePresentacio ctrl = new ControladorDePresentacio();
		ranking = ctrl.demana_ranking();
		List list = new List();
		for(int i = 0; i < ranking.length;++i) {
			list.add(ranking[i]);
		}
		list.setBounds(24, 41, 390, 204);
		getContentPane().add(list);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = list.getSelectedIndex();
				String idpartida = ranking[index];
				ctrl.obteseleccionada(idpartida);
				
			}
		});
		btnNewButton.setBounds(297, 251, 117, 29);
		getContentPane().add(btnNewButton);
		
		
	}
}
