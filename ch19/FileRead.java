package ch19;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FileRead extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	private JTextArea ta;
	//엔코딩 타입이 틀리면 글자가 깨진다.예)ANSI(MS949)방식=>utf-8

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileRead frame = new FileRead();
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
	public FileRead() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("파일이름");
		panel.add(lblNewLabel);
		
		tf = new JTextField();
		panel.add(tf);
		tf.setColumns(15);
		
		JButton button1 = new JButton("확인");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String file=tf.getText();
				String str="";
				BufferedReader reader=null;
				//프로그램=>파일(outputStream)
				//프로그램<=파일(InputStream)
				try {
					//
					reader=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
					//FileInputStream은 파일의 내용을 읽어오는  stream
					ta.setText("");//텍스트 초기화)(화면 지우기)
					while((str=reader.readLine())!=null) {
						ta.append(str+"\n");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}finally {
					try {
						if(reader!=null) reader.close();
					} catch (Exception e3) {
						e3.printStackTrace();
					}
				}
				
			}
		});
		panel.add(button1);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
	}

}
