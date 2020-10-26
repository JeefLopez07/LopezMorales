package miPackageLoginList;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class LoginList extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginList frame = new LoginList();
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
	public LoginList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(33, 43, 97, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasea.setBounds(33, 99, 97, 37);
		contentPane.add(lblContrasea);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtUsuario.setBounds(169, 53, 106, 27);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtClave = new JTextField();
		txtClave.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtClave.setColumns(10);
		txtClave.setBounds(169, 99, 106, 27);
		contentPane.add(txtClave);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				List<String> Usuarios=new ArrayList<String>();				
				
				Usuarios.add("Roberto");
				Usuarios.add("Jair");
				Usuarios.add("Carlos");
				Usuarios.add("Juan");
				
				List<String> Claves=new ArrayList<String>();
				
				Claves.add("r1j2l3");
				Claves.add("lop007");
				Claves.add("yes4517");
				Claves.add("mayo1010");
				
				if(Usuarios.contains(txtUsuario.getText()) && Claves.contains(txtClave.getText()))
				{
					JOptionPane.showMessageDialog(null, "Bienvenido "+txtUsuario.getText());
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El usuario no existe");
				}
			
			}
		});
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnIngresar.setBounds(26, 209, 127, 27);
		contentPane.add(btnIngresar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSalir.setBounds(186, 209, 127, 27);
		contentPane.add(btnSalir);
	}
}
