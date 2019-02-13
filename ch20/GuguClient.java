package ch20;

import java.awt.EventQueue;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class GuguClient extends JFrame {

	private JPanel contentPane;
	private JTextArea taResult;
	private JComboBox choDan;
	//변수 추가
	private Socket socket;
	private DataInputStream dis;
	private DataOutputStream dos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuguClient frame = new GuguClient();
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
	public GuguClient() {
		try {
			socket =new Socket("192.168.0.7",9999);
			//데이터 입출력을 위한 스트림 생성
			dis=new DataInputStream(socket.getInputStream());
			dos=new DataOutputStream(socket.getOutputStream());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 226, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("단을 입력하세요");
		lblNewLabel.setBounds(12, 10, 102, 15);
		contentPane.add(lblNewLabel);
		
		choDan = new JComboBox();
		choDan.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					int dan=Integer.parseInt(choDan.getSelectedItem().toString());
					try {
						dos.writeInt(dan);
						taResult.setText(dis.readUTF());
					} catch (Exception e2) {
						
					}
				}
			}
		});
		choDan.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "6", "7", "8", "9"}));
		choDan.setBounds(158, 7, 46, 21);
		contentPane.add(choDan);
		
		taResult = new JTextArea();
		taResult.setBounds(12, 35, 192, 227);
		contentPane.add(taResult);
	}
}
