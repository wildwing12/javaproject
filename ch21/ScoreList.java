package ch21;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

public class ScoreList extends JFrame {

	//추가
	private ScoreDAO dao;
	private Vector<String> col;
	private ScoreDTO dto;
	private DefaultTableModel model;
	
	private JPanel contentPane;
	private JTable table;
	private JTextField tfStudentNo;
	private JTextField tfName;
	private JLabel lblNewLabel_2;
	private JTextField tfKor;
	private JLabel lblNewLabel_3;
	private JTextField tfEng;
	private JLabel lblNewLabel_4;
	private JTextField tfMat;
	private JLabel lblNewLabel_5;
	private JTextField tfSearch;
	private JButton btnDelete;
	private JButton btnSearch;
	private JButton btnUpdate;
	private JButton btnSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreList frame = new ScoreList();
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
	public ScoreList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 237, 410, 281);
		contentPane.add(scrollPane);
		
		//추가
		dao=new ScoreDAO();//dao인스턴스 생성
		
		col=new Vector<String>();
		col.add("학번");
		col.add("이름");
		col.add("국어");
		col.add("영어");
		col.add("수학");
		col.add("총점");
		col.add("평균");
		
		list();
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//현재 클릭한 행의 인덱스 값
				int idx=table.getSelectedRow();
				//수정모드에서는 학번 입력 제한하도록 텍스트 필드 입력 기능을 false로 바꿈
				tfStudentNo.setEditable(false);
				tfStudentNo.setText(table.getValueAt(idx, 0)+"");
				//0행 0열의 학번, geValueAt은 object타입이기 때문에
				//
				tfName.setText(table.getValueAt(idx, 1)+"");//0행1열이름
				tfKor.setText(table.getValueAt(idx, 2)+"");
				tfEng.setText(table.getValueAt(idx, 3)+"");
				tfMat.setText(table.getValueAt(idx, 4)+"");
				
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("학번");
		lblNewLabel.setBounds(12, 10, 57, 15);
		contentPane.add(lblNewLabel);
		
		tfStudentNo = new JTextField();
		tfStudentNo.setBounds(101, 7, 116, 21);
		contentPane.add(tfStudentNo);
		tfStudentNo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(12, 35, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfName = new JTextField();
		tfName.setBounds(101, 32, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		lblNewLabel_2 = new JLabel("국어");
		lblNewLabel_2.setBounds(12, 66, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		tfKor = new JTextField();
		tfKor.setBounds(101, 63, 116, 21);
		contentPane.add(tfKor);
		tfKor.setColumns(10);
		
		lblNewLabel_3 = new JLabel("영어");
		lblNewLabel_3.setBounds(12, 97, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		tfEng = new JTextField();
		tfEng.setBounds(101, 94, 116, 21);
		contentPane.add(tfEng);
		tfEng.setColumns(10);
		
		lblNewLabel_4 = new JLabel("수학");
		lblNewLabel_4.setBounds(12, 122, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		tfMat = new JTextField();
		tfMat.setBounds(101, 119, 116, 21);
		contentPane.add(tfMat);
		tfMat.setColumns(10);
		
		lblNewLabel_5 = new JLabel("이름을 입력하세요");
		lblNewLabel_5.setBounds(12, 187, 107, 15);
		contentPane.add(lblNewLabel_5);
		
		tfSearch = new JTextField();
		tfSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				search();
			}
		});
		tfSearch.setBounds(142, 184, 116, 21);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);
		
		btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//사용자가 입력한 값을 dto에 저장
				input();
				//레코드 저장
				int result=dao.insertScore(dto);
				if(result ==1) {//insert 성공
					 JOptionPane.showMessageDialog(ScoreList.this, "저장되었습니다.");
					 list();
					 table.setModel(model);
					 clear();
					
				}
			}
		});
		btnSave.setBounds(229, 6, 97, 23);
		contentPane.add(btnSave);
		
		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//수정한 값
				input();
				//update method 호출
				int result=dao.updateScore(dto);
				//화면갱신
				if(result==1) {
					JOptionPane.showMessageDialog(ScoreList.this, "수정되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnUpdate.setBounds(229, 31, 97, 23);
		contentPane.add(btnUpdate);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//현재 선택한 행의 학번
				String student_no=tfStudentNo.getText();
				int result=0;
				int response=JOptionPane.showConfirmDialog(ScoreList.this, "삭제하시겠습니까?");
				//yes버튼을 놀렀을 때
				if(response==JOptionPane.YES_NO_OPTION) {
					result=dao.deleteScore(student_no);
					
				}
				if(result==1) {//삭제된 레코드의 갯수가 1이면
					JOptionPane.showMessageDialog(ScoreList.this, "삭제되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnDelete.setBounds(229, 62, 97, 23);
		contentPane.add(btnDelete);
		
		btnSearch = new JButton("찾기");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search();
			}
		});
		btnSearch.setBounds(267, 183, 97, 23);
		contentPane.add(btnSearch);
	}
	
	public void search() {
		String name=tfSearch.getText();
		model =new DefaultTableModel(dao.searchScore(name), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
			return false;
				
			}
		};
		table.setModel(model);
	}
	public void input() {
		String student_no=tfStudentNo.getText();
		String name= tfName.getText();
		int kor=Integer.parseInt(tfKor.getText());//String=>int변환
		int eng=Integer.parseInt(tfEng.getText());
		int mat=Integer.parseInt(tfMat.getText());
		dto=new ScoreDTO(student_no, name, kor, eng, mat);
		
		
	}
	public void clear() {
		tfStudentNo.setText("");
		tfName.setText("");
		tfKor.setText("");
		tfEng.setText("");
		tfMat.setText("");
		tfStudentNo.requestFocus();
		tfStudentNo.setEnabled(true);
	}
	
	public void list() {
		model = new DefaultTableModel(dao.listScore(), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}//end list()
}//end class
