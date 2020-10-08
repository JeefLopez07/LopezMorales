package miPackageLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtContraseña;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newLogin frame = new newLogin();
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
	public newLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(35, 41, 104, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrsea = new JLabel("Contrse\u00F1a");
		lblContrsea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrsea.setBounds(35, 87, 104, 22);
		contentPane.add(lblContrsea);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNombre.setBounds(139, 45, 140, 28);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtContraseña = new JTextField();
		txtContraseña.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtContraseña.setColumns(10);
		txtContraseña.setBounds(139, 98, 140, 28);
		contentPane.add(txtContraseña);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String miNombre,miContraseña,miResultado;
				
				
				miNombre=txtNombre.getText();
				miContraseña= new String(txtContraseña.getText());
				
				if(miNombre.equals("Roberto")&&miContraseña.equals("Lopez007"))
				{
					miResultado= "Login Correcto";
				}else
				{
					miResultado= "Login Incorrecto";
				}
				txtResultado.setText(miResultado);
				
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAceptar.setBounds(40, 147, 114, 31);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancelar.setBounds(206, 147, 114, 31);
		contentPane.add(btnCancelar);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtResultado.setColumns(10);
		txtResultado.setBounds(122, 211, 155, 31);
		contentPane.add(txtResultado);
		}
	}

