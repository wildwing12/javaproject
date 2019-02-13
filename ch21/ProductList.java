package ch21;

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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductList extends JFrame {
	
	private ProductDTO dto;
	private ProductDAO dao;
	private Vector<String> col;
	private DefaultTableModel model;

	private JPanel contentPane;
	private JTextField tfProduct_no;
	private JTextField tfPlocal;
	private JTextField tfPname;
	private JTextField tfCompany;
	private JTextField tfUprice;
	private JTextField tfAcc;
	private JTextField tfSprice;
	private JTextField tfSearch;
	private JTable table;
	private JButton btnSave;
	private JButton btnUpdate;
	private JButton btnDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductList frame = new ProductList();
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
	public ProductList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1132, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("제품번호");
		lblNewLabel.setBounds(12, 90, 57, 15);
		contentPane.add(lblNewLabel);
		
		
		tfProduct_no = new JTextField();
		tfProduct_no.setBounds(81, 87, 116, 21);
		contentPane.add(tfProduct_no);
		tfProduct_no.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("지점");
		lblNewLabel_1.setBounds(243, 90, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfPlocal = new JTextField();
		tfPlocal.setBounds(336, 87, 116, 21);
		contentPane.add(tfPlocal);
		tfPlocal.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("제품명");
		lblNewLabel_2.setBounds(12, 173, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		tfPname = new JTextField();
		tfPname.setBounds(81, 170, 116, 21);
		contentPane.add(tfPname);
		tfPname.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("제조회사");
		lblNewLabel_3.setBounds(243, 173, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		tfCompany = new JTextField();
		tfCompany.setBounds(336, 170, 116, 21);
		contentPane.add(tfCompany);
		tfCompany.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("단가");
		lblNewLabel_4.setBounds(12, 250, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		tfUprice = new JTextField();
		tfUprice.setBounds(81, 247, 116, 21);
		contentPane.add(tfUprice);
		tfUprice.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("수량");
		lblNewLabel_5.setBounds(243, 250, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		tfAcc = new JTextField();
		tfAcc.setBounds(336, 247, 116, 21);
		contentPane.add(tfAcc);
		tfAcc.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("총금액");
		lblNewLabel_6.setBounds(73, 346, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		tfSprice = new JTextField();
		tfSprice.setBounds(184, 343, 116, 21);
		contentPane.add(tfSprice);
		tfSprice.setColumns(10);
		
		btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result=dao.insertProduct(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(ProductList.this, "저장되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnSave.setBounds(57, 443, 97, 23);
		contentPane.add(btnSave);
		
		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result = dao.updateProduct(dto);
				if(result==1) {
					JOptionPane.showMessageDialog(ProductList.this, "수정되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnUpdate.setBounds(216, 443, 97, 23);
		contentPane.add(btnUpdate);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String product_no=tfProduct_no.getText();
				int result=0;
				int response=JOptionPane.showConfirmDialog(ProductList.this, "삭제하시겠습니까?");
				if(response==JOptionPane.YES_NO_OPTION) {
					result=dao.deleteProduck(product_no);
				}
				if(result==1) {
					JOptionPane.showMessageDialog(ProductList.this, "삭제되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnDelete.setBounds(355, 443, 97, 23);
		contentPane.add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(464, 130, 628, 367);
		contentPane.add(scrollPane);
		
		dao=new ProductDAO();
		col=new Vector<String>();
		col.add("제품번호");
		col.add("지점");
		col.add("재품명");
		col.add("제조회사");
		col.add("단가");
		col.add("수량");
		col.add("총금액");
		
		list();
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx=table.getSelectedRow();
				tfProduct_no.setEditable(false);
				tfProduct_no.setText(table.getValueAt(idx,0)+"");
				tfPlocal.setText(table.getValueAt(idx, 1)+"");
				tfPname.setText(table.getValueAt(idx, 2)+"");
				tfCompany.setText(table.getValueAt(idx, 3)+"");
				tfUprice.setText(table.getValueAt(idx, 4)+"");
				tfAcc.setText(table.getValueAt(idx, 5)+"");
				tfSprice.setText(table.getValueAt(idx, 6)+"");	
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_7 = new JLabel("회사명");
		lblNewLabel_7.setBounds(660, 90, 41, 15);
		contentPane.add(lblNewLabel_7);
		
		tfSearch = new JTextField();
		tfSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				search();
			}
		});
		tfSearch.setBounds(749, 87, 116, 21);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setBounds(910, 86, 97, 23);
		contentPane.add(btnSearch);
	}
	public void search() {
		String company=tfSearch.getText();
		model=new DefaultTableModel(dao.searchProduct(company), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(model);
	}
	public void input() {
		String product_no=tfProduct_no.getText();
		String plocal=tfPlocal.getText();
		String pname=tfPname.getText();
		String company=tfCompany.getText();
		int uprice=Integer.parseInt(tfUprice.getText());
		int acc=Integer.parseInt(tfAcc.getText());
//		int sprice=Integer.parseInt(tfSprice.getText());
		dto=new ProductDTO(product_no, plocal, pname, company, uprice, acc);
	}
	public void list() {
		model=new DefaultTableModel(dao.ProductList(), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}
	public void clear() {
		tfProduct_no.setText("");
		tfPlocal.setText("");
		tfPname.setText("");
		tfCompany.setText("");
		tfUprice.setText("");
		tfAcc.setText("");
		tfSprice.setText("");
		tfProduct_no.requestFocus();
		tfProduct_no.setEnabled(true);
	}
	
}
