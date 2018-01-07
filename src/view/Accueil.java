package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import evenement.Debut;


public class Accueil extends JFrame{
	private static final long serialVersionUID = 1L;
	final JLabel saisirLabel;
	final JLabel NLabel;
	final JLabel NtLabel;
	final JLabel NtMaxLabel;
	final JLabel telLabel;
	final JLabel couLabel;
	final JLabel tauxToutLabel;
	final JLabel tauxTelLabel;
	final JLabel delaiLabel;
	final JLabel pondLabel;

	final JTextField NField;
	final JTextField NtField;
	final JTextField NtMaxField;
	final JTextField telField;
	final JTextField couField;
	final JTextField tauxToutField;
	final JTextField tauxTelField;
	final JTextField delaiField;
	final JTextField pondField;

	final JButton confirm;
	final JButton cancel;
	
	public Accueil(){
		// TODO 自动生成的构造函数存根
		this.setTitle(" Simulateur ");
		this.setBounds(200, 200, 600, 490);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);	
		
		saisirLabel = new JLabel("Veuillez entrer les trois valeurs suivantes ici:");
		saisirLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		saisirLabel.setBounds(50, 10, 400, 55);
		this.add(saisirLabel);
		
		NLabel = new JLabel("N :");
		NLabel.setFont(new Font("Cambria", Font.PLAIN, 15));
		NLabel.setBounds(50, 60, 300, 25);
		this.add(NLabel);
		NField = new JTextField();
		NField.setBounds(355, 60, 175, 25);
		this.add(NField);

		NtLabel = new JLabel("Nt :");
		NtLabel.setFont(new Font("Cambria", Font.PLAIN, 15));
		NtLabel.setBounds(50, 90, 300, 25);
		this.add(NtLabel);
		NtField = new JTextField();
		NtField.setBounds(355, 90, 175, 25);
		this.add(NtField);

		NtMaxLabel = new JLabel("NtMax :");
		NtMaxLabel.setFont(new Font("Cambria", Font.PLAIN, 15));
		NtMaxLabel.setBounds(50, 120, 300, 25);
		this.add(NtMaxLabel);
		NtMaxField = new JTextField();
		NtMaxField.setBounds(355, 120, 175, 25);
		this.add(NtMaxField);
		
		telLabel = new JLabel("Taux de traitement de courriel :");
		telLabel.setFont(new Font("Cambria", Font.PLAIN, 15));
		telLabel.setBounds(50, 210, 300, 25);
		this.add(telLabel);
		telField = new JTextField();
		telField.setBounds(355, 210, 175, 25);
		telField.setEditable(false);
		this.add(telField);

		couLabel = new JLabel("Temps moyen d’attente au téléphone :");
		couLabel.setFont(new Font("Cambria", Font.PLAIN, 15));
		couLabel.setBounds(50, 240, 300, 25);
		this.add(couLabel);
		couField = new JTextField();
		couField.setBounds(355, 240, 175, 25);
		couField.setEditable(false);
		this.add(couField);

		tauxToutLabel = new JLabel("Taux d’occupation des téléconseillers :");
		tauxToutLabel.setFont(new Font("Cambria", Font.PLAIN, 15));
		tauxToutLabel.setBounds(50, 270, 300, 25);
		this.add(tauxToutLabel);
		tauxToutField = new JTextField();
		tauxToutField.setBounds(355, 270, 175, 25);
		tauxToutField.setEditable(false);
		this.add(tauxToutField);

		tauxTelLabel = new JLabel("Taux d’occupation des postes téléphoniques :");
		tauxTelLabel.setFont(new Font("Cambria", Font.PLAIN, 15));
		tauxTelLabel.setBounds(50, 300, 300, 25);
		this.add(tauxTelLabel);
		tauxTelField = new JTextField();
		tauxTelField.setBounds(355, 300, 175, 25);
		tauxTelField.setEditable(false);
		this.add(tauxTelField);
		
		delaiLabel = new JLabel("Délai de réponse aux courriels :");
		delaiLabel.setFont(new Font("Cambria", Font.PLAIN, 15));
		delaiLabel.setBounds(50, 330, 300, 25);
		this.add(delaiLabel);
		delaiField = new JTextField();
		delaiField.setBounds(355, 330, 175, 25);
		delaiField.setEditable(false);
		this.add(delaiField);
		
		pondLabel = new JLabel("Pondération :");
		pondLabel.setFont(new Font("Cambria", Font.PLAIN, 15));
		pondLabel.setBounds(50, 360, 300, 25);
		this.add(pondLabel);
		pondField = new JTextField();
		pondField.setBounds(355, 360, 175, 25);
		pondField.setEditable(false);
		this.add(pondField);

		confirm = new JButton("OK");
		cancel = new JButton("Cancel");
		confirm.setBounds(145, 160, 100, 25);
		cancel.setBounds(355, 160, 100, 25);
		this.add(confirm);
		this.add(cancel);	
		this.setVisible(true);
		
		confirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!NField.getText().equals("") && !NtField.getText().equals("") && !NtMaxField.getText().equals("")){
					Debut debut = new Debut();
					//debut.demarrer(Integer.parseInt(NField.getText()), Integer.parseInt(NtField.getText()), Integer.parseInt(NtMaxField.getText()));
				}
				else{
					JOptionPane.showMessageDialog(null, "Les champs \"N\", \"Nt\" et \"NtMax\"\nne peut pas être vides!", "Erreur", JOptionPane.ERROR_MESSAGE); 
				}
			}
		});
		
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}
