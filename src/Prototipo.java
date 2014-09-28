import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;
import java.util.Locale;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class Prototipo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4008074765022393437L;
	private JTextField txtJoo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prototipo frame = new Prototipo();
					frame.setVisible(true);
					frame.setSize(new Dimension(800, 600));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Prototipo() {
		getContentPane().setLocale(new Locale("pt", "BR"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu fileMenu = new JMenu("Cadastro");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu);
		JMenuItem newMenuItem = new JMenuItem("Funcionario", KeyEvent.VK_N);
		fileMenu.add(newMenuItem);
		JMenuItem newMenuItem2 = new JMenuItem("Carros", KeyEvent.VK_N);
		fileMenu.add(newMenuItem2);
		JMenuItem newMenuItem3 = new JMenuItem("Saida", KeyEvent.VK_N);
		fileMenu.add(newMenuItem3);
		JMenu fileMenu2 = new JMenu("Estacionamento Virtual");
		fileMenu2.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu2);
		JMenuItem newMenuItem4 = new JMenuItem("Vizualizar", KeyEvent.VK_N);
		fileMenu2.add(newMenuItem4);
		JMenuItem newMenuItem5 = new JMenuItem("Gerenciar", KeyEvent.VK_N);
		fileMenu2.add(newMenuItem5);
		JMenu fileMenu3 = new JMenu("Suporte Tecnico");
		fileMenu3.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu3);
		JMenuItem newMenuItem6 = new JMenuItem("Técnicos da Região",
				KeyEvent.VK_N);
		fileMenu3.add(newMenuItem6);
		JMenuItem newMenuItem7 = new JMenuItem("Manual", KeyEvent.VK_N);
		fileMenu3.add(newMenuItem7);
		JMenu fileMenu4 = new JMenu("Sistema de Ponto");
		fileMenu4.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu4);
		JMenuItem newMenuItem8 = new JMenuItem("Entrada", KeyEvent.VK_N);
		fileMenu4.add(newMenuItem8);
		JMenuItem newMenuItem9 = new JMenuItem("Log", KeyEvent.VK_N);
		fileMenu4.add(newMenuItem9);
		getContentPane().setLayout(null);
		
		JMenu fileMenu5 = new JMenu("Caixa");
	    fileMenu5.setMnemonic(KeyEvent.VK_F);
	    menuBar.add(fileMenu5);
	    JMenuItem newMenuItem10 = new JMenuItem("Emitir cobrança", KeyEvent.VK_N);
	    fileMenu5.add(newMenuItem10);
	    JMenuItem newMenuItem11 = new JMenuItem("Log", KeyEvent.VK_N);
	    fileMenu5.add(newMenuItem11);
	    getContentPane().setLayout(null);
		
		txtJoo = new JTextField();
		txtJoo.setHorizontalAlignment(SwingConstants.LEFT);
		txtJoo.setText("Jo\u00E3o- 8756-1132 - Aldeota\r\n");
		txtJoo.setToolTipText("Jo\u00E3o- 8756-1132 - Aldeota\r\n");
		txtJoo.setBounds(287, 108, 180, 167);
		getContentPane().add(txtJoo);
		txtJoo.setColumns(10);
		
		JLabel lblTcnicosDaRegio = new JLabel("T\u00E9cnicos da Regi\u00E3o");
		lblTcnicosDaRegio.setBounds(178, 110, 108, 14);
		getContentPane().add(lblTcnicosDaRegio);
		System.out.println("Oi");

	}
}
