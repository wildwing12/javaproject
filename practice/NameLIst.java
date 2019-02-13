package practice;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NameLIst extends JFrame {
	private NameDTO dto;
	private NameDAO dao;
	private Vector<String> col;
	private DefaultTableModel model;
	
	private JPanel contentPane;
	private JTable table;
	private JTextField tfNum;
	private JTextField tfName;
	private JTextField tfAge;
	private JTextField tfSal;
	private JTextField tfSearch;
	private JButton btnSave;
	private JButton btnSearch;
	private JButton btnDelete;
	private JButton btnUpdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NameLIst frame = new NameLIst();
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
	public NameLIst() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 590);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 281, 410, 261);
		contentPane.add(scrollPane);
		
		dao=new NameDAO();
		
		col= new Vector<String>();
		col.add("사번");
		col.add("이름");
		col.add("나이");
		col.add("급여");
		
		list();
		
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx=table.getSelectedRow();
				 tfNum.setEditable(false);
				 tfNum.setText(table.getValueAt(idx, 0)+"");
				 tfName.setText(table.getValueAt(idx, 1)+"");
				 tfAge.setText(table.getValueAt(idx, 2)+"");
				 tfSal.setText(table.getValueAt(idx, 3)+"");
			}
		});
		table.setForeground(Color.MAGENTA);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("사번");
		lblNewLabel.setBounds(12, 22, 57, 15);
		contentPane.add(lblNewLabel);
		
		tfNum = new JTextField();
		tfNum.setBounds(81, 19, 116, 21);
		contentPane.add(tfNum);
		tfNum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(12, 52, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfName = new JTextField();
		tfName.setBounds(81, 50, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("나이");
		lblNewLabel_2.setBounds(12, 84, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		tfAge = new JTextField();
		tfAge.setBounds(81, 81, 116, 21);
		contentPane.add(tfAge);
		tfAge.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("급여");
		lblNewLabel_3.setBounds(12, 109, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		tfSal = new JTextField();
		tfSal.setBounds(81, 106, 116, 21);
		contentPane.add(tfSal);
		tfSal.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("검색할 이름을 입력하세요");
		lblNewLabel_4.setBounds(12, 256, 140, 15);
		contentPane.add(lblNewLabel_4);
		
		tfSearch = new JTextField();
		tfSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				search();
			}
		});
		tfSearch.setBounds(164, 253, 116, 21);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);
		
		btnSearch = new JButton("검색");
		btnSearch.setBounds(292, 252, 97, 23);
		contentPane.add(btnSearch);
		
		btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input();
				int result=dao.insertName(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(NameLIst.this, "저장되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnSave.setBounds(209, 18, 97, 23);
		contentPane.add(btnSave);
		
		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result=dao.updateName(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(NameLIst.this, "수정되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnUpdate.setBounds(209, 48, 97, 23);
		contentPane.add(btnUpdate);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=Integer.parseInt(tfNum.getText());
				int result=0;
				int response=JOptionPane.showConfirmDialog(NameLIst.this, "삭제하시겠습니까?");
				if(response==JOptionPane.YES_NO_OPTION) {
					result=dao.deleteName(num);
				}
				if(result==1) {
					JOptionPane.showMessageDialog(NameLIst.this, "삭제되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnDelete.setBounds(209, 80, 97, 23);
		contentPane.add(btnDelete);
	}
	public void list() {
		model=new DefaultTableModel(dao.nameList(), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				
				return false;
			}
		};
	}
	public void input() {
		int num=Integer.parseInt(tfNum.getText());
		String name=tfName.getName();
		int age=Integer.parseInt(tfAge.getText());
		int sal=Integer.parseInt(tfSal.getText());
		dto=new NameDTO(num, name, age, sal);
	}
	public void clear() {
		tfNum.setText("");
		tfName.setText("");
		tfAge.setText("");
		tfSal.setText("");
		tfNum.requestFocus();
		tfNum.setEnabled(true);
	}
	public void search() {
		String name=tfSearch.getText();
		model=new DefaultTableModel(dao.searchName(name), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				
				return false;
			}
		};
	}
}
