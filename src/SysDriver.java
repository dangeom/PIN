import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Utilities;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextArea;

import com.toedter.calendar.JDateChooser;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Locale;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;

import javax.swing.UIManager;

import java.awt.Label;

import javax.swing.DropMode;

class SysDriver extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4202793154668771304L;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=73,11
	 */
	private final JLabel label = DefaultComponentFactory.getInstance()
			.createTitle("New JGoodies title");

	public JTextField textPlaca;
	private JTextField textPlaca2;
	private JTextField textHrSaida;
	public JComboBox<String> boxMarcas;
	public JDateChooser escolheData;
	public JTextArea textArea;
	private JTextField textField;
	private JTextField textHrEntrada;
	public JComboBox boxModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SysDriver frame = new SysDriver();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public SysDriver() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/car-red.png"));
		setTitle("..::SysDriver::..");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(10, 45, 46, 14);
		contentPane.add(lblPlaca);

		try {
			javax.swing.text.MaskFormatter placa = new javax.swing.text.MaskFormatter(
					"UUU-####");
			textPlaca = new javax.swing.JFormattedTextField(placa);
			lblPlaca.setLabelFor(textPlaca);
			placa.setPlaceholderCharacter('_');

		} catch (Exception e) {
		}

		textPlaca.setBounds(36, 38, 154, 28);
		contentPane.add(textPlaca);
		textPlaca.setColumns(10);

		
	
		
		
		
		
		
		boxMarcas = new JComboBox<String>();
		boxMarcas.setModel(new DefaultComboBoxModel<String>(new String[] { "",
				"Aston Martin", "Audi", "Bentley", "BMW", "Chery", "Chrysler",
				"Citroen", "Chevrolet", "Dodge", "Ferrari", "Ford", "Fiat",
				"Hyundai", "Honda", "Jaguar", "Jeep", "JAC", "Kia", "Lifan",
				"Lexus", "Lamborguini", "Land Rover", "Maserati", "Mini",
				"Mitsubishi", "Mercedes-Benz", "Nissan", "Porshe", "Peugeot",
				"Renault", "Suzuki", "Subaru", "Smart", "Toyota", "Volvo",
				"VolksWagen" }));
		boxMarcas.setBounds(280, 77, 154, 24);
		contentPane.add(boxMarcas);

		boxModelo = new JComboBox();
		boxModelo.setBounds(280, 112, 154, 22);
		contentPane.add(boxModelo);

		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(222, 117, 46, 14);
		contentPane.add(lblNewLabel);

		try {
			javax.swing.text.MaskFormatter placa = new javax.swing.text.MaskFormatter(
					"##:##");
			placa.setPlaceholderCharacter('_');

		} catch (Exception e) {
		}

		JLabel lblCarrosNoEstacionamento = new JLabel(
				"Carros no Estacionamento");
		lblCarrosNoEstacionamento.setBounds(591, 14, 137, 16);
		contentPane.add(lblCarrosNoEstacionamento);

		JSeparator separator = new JSeparator();
		separator.setBounds(29, 193, 387, 14);
		contentPane.add(separator);

		JLabel lblNewLabel_1 = new JLabel("\u2022Entrada");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 11, 180, 16);
		contentPane.add(lblNewLabel_1);

		JLabel lblsaida = new JLabel("\u2022Saida");
		lblsaida.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblsaida.setBounds(69, 219, 180, 16);
		contentPane.add(lblsaida);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textArea.setText(textArea.getText() + textPlaca.getText()
						+ " - " + boxMarcas.getSelectedItem().toString()
						+ " - " + escolheData.getDate() + "\n");

				escolheData.setDate(null);

			}

		});
		btnCadastrar.setBounds(133, 142, 103, 28);
		contentPane.add(btnCadastrar);

		JLabel lblPlaca_1 = new JLabel("Placa");
		lblPlaca_1.setBounds(134, 253, 55, 16);
		contentPane.add(lblPlaca_1);

		try {
			javax.swing.text.MaskFormatter placa = new javax.swing.text.MaskFormatter(
					"UUU-####");
			textPlaca2 = new javax.swing.JFormattedTextField(placa);
			placa.setPlaceholderCharacter('_');

		} catch (Exception e) {
		}

		textPlaca2.setBounds(177, 247, 154, 29);
		contentPane.add(textPlaca2);
		textPlaca2.setColumns(10);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(200, 318, 90, 28);
		contentPane.add(btnEnviar);

		try {
			javax.swing.text.MaskFormatter placa = new javax.swing.text.MaskFormatter(
					"##:##");
			textHrSaida = new javax.swing.JFormattedTextField(placa);
			placa.setPlaceholderCharacter('_');

		} catch (Exception e) {
		}

		textHrSaida.setBounds(177, 280, 67, 28);
		contentPane.add(textHrSaida);
		textHrSaida.setColumns(10);

		JLabel lblHorarioDeSaida = new JLabel("Horario de Saida");
		lblHorarioDeSaida.setBounds(71, 284, 118, 14);
		contentPane.add(lblHorarioDeSaida);

		escolheData = new JDateChooser();
		escolheData.setLocale(new Locale("pt", "BR"));
		escolheData.setBounds(256, 38, 154, 28);
		contentPane.add(escolheData);
		escolheData.setFocusTraversalPolicy(new FocusTraversalOnArray(
				new Component[] { escolheData.getCalendarButton() }));

		JLabel lblData = new JLabel("Data");
		lblData.setBounds(222, 44, 24, 16);
		contentPane.add(lblData);

		JLabel label_1 = new JLabel("Data");
		label_1.setBounds(291, 284, 55, 16);
		contentPane.add(label_1);

		JDateChooser escolheData2 = new JDateChooser();
		escolheData2.setLocale(new Locale("pt", "BR"));
		escolheData2.setBounds(320, 278, 114, 28);
		contentPane.add(escolheData2);

		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(436, 23, 11, 536);
		contentPane.add(separator_1);

		JButton btnLimpar = new JButton("");
		btnLimpar.setIcon(new ImageIcon("img/lixo_16x16.png"));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPlaca.setText("");
			}
		});
		btnLimpar.setBounds(189, 38, 24, 28);
		contentPane.add(btnLimpar);

		JButton btnLimpar2 = new JButton("");
		btnLimpar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escolheData.setDate(null);
			}
		});
		btnLimpar2.setIcon(new ImageIcon("img/lixo_16x16.png"));

		btnLimpar2.setBounds(410, 38, 24, 28);
		contentPane.add(btnLimpar2);

		JButton btnLimpar4 = new JButton("");
		btnLimpar4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPlaca.setText("");
			}
		});
		btnLimpar4.setIcon(new ImageIcon("img/lixo_16x16.png"));
		btnLimpar4.setBounds(244, 278, 24, 28);
		contentPane.add(btnLimpar4);

		JButton btnLimpar3 = new JButton("");
		btnLimpar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPlaca.setText("");
			}
		});
		btnLimpar3.setIcon(new ImageIcon("img/lixo_16x16.png"));
		btnLimpar3.setBounds(333, 248, 24, 28);
		contentPane.add(btnLimpar3);

		JButton btnLimpar_1 = new JButton("Limpar");
		btnLimpar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnLimpar_1.setBounds(605, 513, 98, 26);
		contentPane.add(btnLimpar_1);

		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPlaca.setText("");
				escolheData.setDate(null);
				boxMarcas.setSelectedItem(null);
				textHrEntrada.setText("");
				boxModelo.setSelectedItem(null);

			}
		});
		btnNewButton.setBounds(248, 142, 103, 28);
		contentPane.add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(459, 44, 393, 327);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		textArea.setWrapStyleWord(false);
		textArea.setLineWrap(false);
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);

		JLabel lblNewLabel_2 = new JLabel("Marca");
		lblNewLabel_2.setBounds(224, 82, 46, 14);
		contentPane.add(lblNewLabel_2);

		JButton btnLimparHora = new JButton("");
		btnLimparHora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textHrEntrada.setText("");
			}
		});
		btnLimparHora.setBounds(145, 73, 24, 28);
		contentPane.add(btnLimparHora);

		JLabel lblNewLabel_3 = new JLabel("Hora da entrada");
		lblNewLabel_3.setBounds(10, 82, 79, 14);
		contentPane.add(lblNewLabel_3);

		try {
			javax.swing.text.MaskFormatter horario = new javax.swing.text.MaskFormatter(
					"##:##");
			textHrEntrada = new javax.swing.JFormattedTextField(horario);
			horario.setPlaceholderCharacter('_');

		} catch (Exception e) {
			System.out.println("");
		}

		btnLimparHora.setIcon(new ImageIcon("img/lixo_16x16.png"));
		textHrEntrada.setBounds(91, 73, 55, 28);
		contentPane.add(textHrEntrada);
		textHrEntrada.setColumns(10);

	}

	private void criarListener() {
		// TODO Auto-generated method stub
		
	}

	public JLabel getLabel() {
		return label;
	}
}
