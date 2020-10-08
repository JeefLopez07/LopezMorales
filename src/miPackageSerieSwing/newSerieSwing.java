package miPackageSerieSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class newSerieSwing extends JFrame {

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
					newSerieSwing frame = new newSerieSwing();
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
	public newSerieSwing() {
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
		
		txtInicio = new JTextField();
		txtInicio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtInicio.setBounds(168, 31, 96, 24);
		contentPane.add(txtInicio);
		txtInicio.setColumns(10);
		
		txtFinal = new JTextField();
		txtFinal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtFinal.setColumns(10);
		txtFinal.setBounds(168, 66, 96, 24);
		contentPane.add(txtFinal);
		
		txtRepeticiones = new JTextField();
		txtRepeticiones.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtRepeticiones.setColumns(10);
		txtRepeticiones.setBounds(168, 125, 96, 24);
		contentPane.add(txtRepeticiones);
		}
	
	}
