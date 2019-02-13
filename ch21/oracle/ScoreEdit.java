package ch21.oracle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreEdit extends JFrame {

	private JPanel contentPane;
	private JTextField tfStudentNo;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfMat;
	//변수 추가
	private ScoreList parent; //화면 갱신용
	private ScoreDAO dao;
	private ScoreDTO dto;
	private String student_no;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ScoreEdit frame = new ScoreEdit();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public ScoreEdit(ScoreList parent, String student_no) {
		//ScoreList 프레임의 주소값을 저장
		this.parent = parent;
		this.student_no=student_no;
		System.out.println(parent);
		
		setTitle("점수편집");
		//현재 창만 닫는 옵션(DISPOSE_ON_CLOSE)
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 264, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("학번");
		lblNewLabel.setBounds(12, 10, 57, 15);
		contentPane.add(lblNewLabel);
		
		tfStudentNo = new JTextField();
		tfStudentNo.setBounds(81, 7, 116, 21);
		contentPane.add(tfStudentNo);
		tfStudentNo.setColumns(10);
		
		JLabel label = new JLabel("이름");
		label.setBounds(12, 38, 57, 15);
		contentPane.add(label);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(81, 35, 116, 21);
		contentPane.add(tfName);
		
		JLabel lblRnrdj = new JLabel("국어");
		lblRnrdj.setBounds(12, 66, 57, 15);
		contentPane.add(lblRnrdj);
		
		tfKor = new JTextField();
		tfKor.setColumns(10);
		tfKor.setBounds(81, 63, 116, 21);
		contentPane.add(tfKor);
		
		JLabel label_2 = new JLabel("영어");
		label_2.setBounds(12, 94, 57, 15);
		contentPane.add(label_2);
		
		tfEng = new JTextField();
		tfEng.setColumns(10);
		tfEng.setBounds(81, 91, 116, 21);
		contentPane.add(tfEng);
		
		JLabel label_3 = new JLabel("수학");
		label_3.setBounds(12, 122, 57, 15);
		contentPane.add(label_3);
		
		tfMat = new JTextField();
		tfMat.setColumns(10);
		tfMat.setBounds(81, 119, 116, 21);
		contentPane.add(tfMat);
		
		//dto값을 텍스트필드에 출력
		dao=new ScoreDAO();
		dto=dao.viewScore(student_no);
		tfStudentNo.setText(dto.getStudent_no());
		tfName.setText(dto.getName());
		tfKor.setText(dto.getKor()+"");//점수지만 ""로 String화함
		tfEng.setText(dto.getEng()+"");
		tfMat.setText(dto.getMat()+"");
		
		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String student_no=tfStudentNo.getText();
				String name=tfName.getText();
				int kor=Integer.parseInt(tfKor.getText());
				int eng=Integer.parseInt(tfEng.getText());
				int mat=Integer.parseInt(tfMat.getText());
				ScoreDTO dto=
						new ScoreDTO(student_no, name, kor, eng, mat);
				//dao에 수정요청
				int result=dao.updateScore(dto);
				if(result == 1) {//수정 성공시
					JOptionPane.showMessageDialog(
							ScoreEdit.this, "수정되었습니다.");
					parent.refreshTable();//ScoreList갱신
					dispose();//현재 프레임 닫기
				}
				
			}
		});
		btnUpdate.setBounds(12, 171, 97, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String student_no=tfStudentNo.getText();
				int result=0;
				int response=JOptionPane.showConfirmDialog(
						ScoreEdit.this, "삭제하시겠습니까?");
				if(response==JOptionPane.YES_OPTION) {
					result=dao.deleteScore(student_no);
				}
				if(result==1) {//삭제가 성공했으면
					JOptionPane.showMessageDialog(
							ScoreEdit.this, "삭제되었습니다.");
					parent.refreshTable();
					dispose();//현재 프레임 닫는 Window메소드
				}
			}
		});
		btnDelete.setBounds(121, 171, 97, 23);
		contentPane.add(btnDelete);
	}

}
