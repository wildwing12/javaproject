package ch21;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
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

public class EmpList extends JFrame {

	private EmpDAO dao;
	private Vector<String> col;
	private EmpDTO dto;
	private DefaultTableModel model;
	
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField tfEmpno;
	private JTextField tfEname;
	private JTextField tfDate;
	private JTextField tfSal;
	private JTextField tfSearch;
	private JButton btnUpdate;
	private JButton btnSave;
	private JButton btnNewButton;
	private JButton btnSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpList frame = new EmpList();
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
	public EmpList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("사번");
		lblNewLabel.setBounds(12, 10, 57, 15);
		contentPane.add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 217, 410, 318);
		contentPane.add(scrollPane);
		
		//목추가 
		dao=new EmpDAO();
		
		col=new Vector<String>();
		col.add("사번");
		col.add("이름");
		col.add("입사일자");
		col.add("급여");
		list_1();
		
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			int idx=table.getSelectedRow();
			tfEmpno.setEditable(false);
			tfEmpno.setText(table.getValueAt(idx, 0)+"");
			tfEname.setText(table.getValueAt(idx, 1)+"");
			tfDate.setText(table.getValueAt(idx, 2)+"");
			tfSal.setText(table.getValueAt(idx, 3)+"");
		
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(12, 35, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("입사 일자");
		lblNewLabel_2.setBounds(12, 60, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("급여");
		lblNewLabel_3.setBounds(12, 85, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("검색할 이름을 입력하세요");
		lblNewLabel_4.setBounds(12, 189, 140, 15);
		contentPane.add(lblNewLabel_4);
		
		tfEmpno = new JTextField();
		tfEmpno.setBounds(102, 7, 116, 21);
		contentPane.add(tfEmpno);
		tfEmpno.setColumns(10);
		
		tfEname = new JTextField();
		tfEname.setBounds(102, 32, 116, 21);
		contentPane.add(tfEname);
		tfEname.setColumns(10);
		
		tfDate = new JTextField();
		tfDate.setBounds(102, 57, 116, 21);
		contentPane.add(tfDate);
		tfDate.setColumns(10);
		
		tfSal = new JTextField();
		tfSal.setBounds(102, 82, 116, 21);
		contentPane.add(tfSal);
		tfSal.setColumns(10);
		
		tfSearch = new JTextField();
		tfSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				search();
			}
		});
		tfSearch.setBounds(164, 186, 149, 21);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);
		
		btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			input();
			int result=dao.insertEmp(dto);
			if(result==1) {
				JOptionPane.showMessageDialog(EmpList.this, "저장되었습니다.");
				list_1();
				table.setModel(model);
				clear();
			}
			}
		});
		btnSave.setBounds(230, 6, 97, 23);
		contentPane.add(btnSave);
		
		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result=dao.updateEmp(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(EmpList.this, "수정이 완료되었습니다");
					list_1();
					table.setModel(model);
					clear();
				}
			}
		});
		btnUpdate.setBounds(230, 31, 97, 23);
		contentPane.add(btnUpdate);
		
		btnNewButton = new JButton("삭제");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int empno=Integer.parseInt(tfEmpno.getText());
				int result=0;
				int response=JOptionPane.showConfirmDialog(EmpList.this, "삭제하시겠습니까?");
				if(response==JOptionPane.YES_NO_OPTION) {
					result=dao.deleteEmp(empno);
					
				}
				if(result==1) {
					JOptionPane.showMessageDialog(EmpList.this, "삭제되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnNewButton.setBounds(230, 56, 97, 23);
		contentPane.add(btnNewButton);
		
		btnSearch = new JButton("검색");
		btnSearch.setBounds(325, 184, 97, 23);
		contentPane.add(btnSearch);
	}
	public void search() {
		String ename=tfSearch.getText();
		model=new DefaultTableModel(dao.searchEmp(ename), col) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(model);
	}
	public void input() {
		int empno=Integer.parseInt(tfEmpno.getText());
		String ename=tfEname.getText();
		Date hiredate=Date.valueOf(tfDate.getText());
		int sal=Integer.parseInt(tfSal.getText());
		dto=new EmpDTO(empno, ename, hiredate, sal);
	}
	public void clear() {
		tfEmpno.setText("");
		tfEname.setText("");
		tfDate.setText("");
		tfSal.setText("");
		tfEmpno.requestFocus();
		tfEmpno.setEnabled(true);
	}
	public void list_1() {
		model=new DefaultTableModel(dao.listEmp(), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}
}
