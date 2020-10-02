package miPackageSerieSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class Fibo extends JFrame {

	private JPanel contentPane;
	private JTextField txtInicio;
	private JTextField txtFinal;
	private JTextField txtRepeticiones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibo frame = new Fibo();
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
	public Fibo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor de inicio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(32, 31, 129, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblValorFinal = new JLabel("Valor final");
		lblValorFinal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblValorFinal.setBounds(32, 76, 129, 22);
		contentPane.add(lblValorFinal);
		
		JLabel lblRpeticiones = new JLabel("Repeticiones");
		lblRpeticiones.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRpeticiones.setBounds(32, 121, 129, 22);
		contentPane.add(lblRpeticiones);
		
		txtInicio = new JTextField();
		txtInicio.setBounds(188, 31, 96, 24);
		contentPane.add(txtInicio);
		txtInicio.setColumns(10);
		
		txtFinal = new JTextField();
		txtFinal.setColumns(10);
		txtFinal.setBounds(188, 74, 96, 24);
		contentPane.add(txtFinal);
		
		txtRepeticiones = new JTextField();
		txtRepeticiones.setColumns(10);
		txtRepeticiones.setBounds(188, 115, 96, 24);
		contentPane.add(txtRepeticiones);
		
		
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalir.setBounds(120, 220, 144, 32);
		contentPane.add(btnSalir);
		
		JList list = new JList();		
		list.setBounds(307, 11, 68, 241);
		contentPane.add(list);
		
		Valores miValor=new Valores();
		DefaultListModel sumas=new DefaultListModel();
		JButton btnIniciar = new JButton("Iniciar serie");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				
				miValor.Val1=Integer.parseInt(txtInicio.getText());
				miValor.Val2=Integer.parseInt(txtFinal.getText());
				miValor.Repeticiones=Integer.parseInt(txtRepeticiones.getText());
				
				sumas.addElement(miValor.Val1);
				sumas.addElement(miValor.Val2);
				list.setModel(sumas);
				
				
				for(int j=0;j<miValor.Repeticiones;j++)
				{
					miValor.Val3=miValor.Val1+miValor.Val2;
					miValor.Val1=miValor.Val2;
					miValor.Val2=miValor.Val3;
					sumas.addElement(miValor.Val3);
				}
			}
		});
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIniciar.setBounds(120, 180, 144, 32);
		contentPane.add(btnIniciar);
	}
}
