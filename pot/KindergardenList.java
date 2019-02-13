package pot;

import java.awt.EventQueue;
import java.sql.Date;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
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

import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class KindergardenList extends JFrame {

	// 추가
	private KindergardenDTO dto;
	private KindergardenDAO dao;
	private Vector<String> col;
	private DefaultTableModel model;

	private JPanel contentPane;
	private JTextField tfNum;
	private JTextField tfName;
	private JLabel label;
	private JTextField tfBirth;
	private JLabel lblNewLabel_2;
	private JTextField tfaddr;
	private JLabel lblNewLabel_3;
	private JTextField tfHeight;
	private JLabel lblNewLabel_4;
	private JTextField tfWeight;
	private JScrollPane scrollPane;
	private JTextField tfCharater;
	private JTable table;
	private JButton btnDelete;
	private JLabel lblNewLabel_7;
	private JTextField tfSearch;
	private JButton btnsearch;
	private JButton btnSave;
	private JButton btnUPdate;
	private JRadioButton rdMan;
	private JRadioButton rdWaman;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KindergardenList frame = new KindergardenList();
					frame.setVisible(true);
					frame.setTitle("원아 관리");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KindergardenList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1272, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("번호");
		lblNewLabel.setBounds(44, 10, 57, 15);
		contentPane.add(lblNewLabel);

		tfNum = new JTextField();
		tfNum.setBounds(113, 7, 116, 21);
		contentPane.add(tfNum);
		tfNum.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(279, 10, 57, 15);
		contentPane.add(lblNewLabel_1);

		tfName = new JTextField();
		tfName.setBounds(360, 7, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);

		label = new JLabel("생일");
		label.setBounds(279, 48, 57, 15);
		contentPane.add(label);

		tfBirth = new JTextField();
		tfBirth.setBounds(360, 45, 116, 21);
		contentPane.add(tfBirth);
		tfBirth.setColumns(10);

		lblNewLabel_2 = new JLabel("주소");
		lblNewLabel_2.setBounds(44, 135, 57, 15);
		contentPane.add(lblNewLabel_2);

		tfaddr = new JTextField();
		tfaddr.setBounds(113, 132, 363, 21);
		contentPane.add(tfaddr);
		tfaddr.setColumns(10);

		lblNewLabel_3 = new JLabel("키");
		lblNewLabel_3.setBounds(44, 93, 57, 15);
		contentPane.add(lblNewLabel_3);

		tfHeight = new JTextField();
		tfHeight.setBounds(113, 90, 116, 21);
		contentPane.add(tfHeight);
		tfHeight.setColumns(10);

		lblNewLabel_4 = new JLabel("몸무게");
		lblNewLabel_4.setBounds(279, 93, 57, 15);
		contentPane.add(lblNewLabel_4);

		tfWeight = new JTextField();
		tfWeight.setBounds(360, 90, 116, 21);
		contentPane.add(tfWeight);
		tfWeight.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("특이 사항");
		lblNewLabel_6.setBounds(549, 10, 57, 15);
		contentPane.add(lblNewLabel_6);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(549, 45, 682, 125);
		contentPane.add(scrollPane);

		tfCharater = new JTextField();
		scrollPane.setViewportView(tfCharater);
		tfCharater.setColumns(10);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 211, 1232, 429);
		contentPane.add(scrollPane_1);

		dao = new KindergardenDAO();
		col = new Vector<String>();
		col.add("번호");
		col.add("이름");
		col.add("성별");
		col.add("생일");
		col.add("키(cm)");
		col.add("몸무게(kg)");
		col.add("주소");
		col.add("특이사항");
		list();

		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx = table.getSelectedRow();
				tfNum.setEditable(false);
				tfNum.setText(table.getValueAt(idx, 0) + "");
				tfName.setText(table.getValueAt(idx, 1) + "");
				
				String gender = table.getValueAt(idx, 2) + "";
				System.out.println(gender);
				if(gender.equals("남")) {
					rdMan.setSelected(true);
				}else if( gender.equals("여")) {
					rdWaman.setSelected(true);
				}
				
				tfBirth.setText(table.getValueAt(idx, 3) + "");
				tfHeight.setText(table.getValueAt(idx, 4) + "");
				tfWeight.setText(table.getValueAt(idx, 5) + "");
				tfaddr.setText(table.getValueAt(idx, 6) + "");
				tfCharater.setText(table.getValueAt(idx, 7) + "");
				
			}
		});
		scrollPane_1.setViewportView(table);

		btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result = dao.insertKindergarden(dto);
				if (result == 1) {
					JOptionPane.showMessageDialog(KindergardenList.this, "저장되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnSave.setBounds(549, 180, 62, 23);
		contentPane.add(btnSave);

		btnUPdate = new JButton("수정");
		btnUPdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result = dao.updateKindergarden(dto);
				if (result == 1) {
					JOptionPane.showMessageDialog(KindergardenList.this, "수정되었습니다.");
					list();
					table.setModel(model);
				}
			}
		});
		btnUPdate.setBounds(623, 180, 62, 23);
		contentPane.add(btnUPdate);

		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String chnum = tfNum.getText();
				int result = 0;
				int response = JOptionPane.showConfirmDialog(KindergardenList.this, "삭제하시겠습니까?");
				if (response == JOptionPane.YES_NO_OPTION) {
					result = dao.deleteKindergarden(chnum);
				}
				if (result == 1) {
					JOptionPane.showMessageDialog(KindergardenList.this, "삭제되어습니다");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnDelete.setBounds(697, 180, 68, 23);
		contentPane.add(btnDelete);

		lblNewLabel_7 = new JLabel("원아 이름");
		lblNewLabel_7.setBounds(44, 179, 62, 15);
		contentPane.add(lblNewLabel_7);

		tfSearch = new JTextField();
		tfSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				search();
			}
		});
		tfSearch.setBounds(113, 180, 116, 21);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);

		btnsearch = new JButton("검색");
		btnsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search();
			}
		});
		btnsearch.setBounds(241, 178, 70, 23);
		contentPane.add(btnsearch);

		JLabel lblNewLabel_5 = new JLabel("성별");
		lblNewLabel_5.setBounds(44, 48, 57, 15);
		contentPane.add(lblNewLabel_5);

		rdMan = new JRadioButton("남");
		rdMan.setBounds(113, 44, 53, 23);
		contentPane.add(rdMan);

		rdWaman = new JRadioButton("여");
		rdWaman.setBounds(170, 44, 42, 23);
		contentPane.add(rdWaman);
		
		ButtonGroup rbntGroup = new ButtonGroup();
		rbntGroup.add(rdMan);
		rbntGroup.add(rdWaman);
	}

	public void search() {
		String chname = tfSearch.getText();
		model = new DefaultTableModel(dao.searchKindergarden(chname), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(model);
	}

	public void input() {
		String chnum = tfNum.getText();
		String chname = tfName.getText();
		String chsex = rdMan.getText();
		if(rdMan.isSelected()) {
			chsex = "남";
		}else if(rdWaman.isSelected()) {
			chsex = "여";
		}
		Date chbirthday = Date.valueOf(tfBirth.getText());
		double height = Double.parseDouble(tfHeight.getText());
		double weight = Double.parseDouble(tfWeight.getText());
		String chaddr = tfaddr.getText();
		String charactor = tfCharater.getText();
		dto = new KindergardenDTO(chnum, chname, chsex, chbirthday, height, weight, chaddr, charactor);
	}

	public void list() {
		model = new DefaultTableModel(dao.kinderList(), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}

	public void clear() {
		tfNum.setText("");
		tfName.setText("");
		rdMan.setText("");
		tfBirth.setText("");
		tfHeight.setText("");
		tfWeight.setText("");
		tfaddr.setText("");
		tfCharater.setText("");
		tfNum.requestFocus();
		tfNum.setEditable(true);
	}
}
