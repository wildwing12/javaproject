package ch21.oracle;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ComboExam extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private List list;
	//변수 추가
	private DeptDAO deptDao;
	private ArrayList<DeptDTO> deptList;
	private EmpDAO empDao;
	private ArrayList<EmpDTO> empList;
	//JTable을 쓸 때만 Vector를 씀.

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboExam frame = new ComboExam();
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
	public ComboExam() {
		deptDao=new DeptDAO();
		//부서목록을 ArrayList로 받아옴
		deptList=deptDao.listDept();
		empDao=new EmpDAO();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		list = new List();
		contentPane.add(list, BorderLayout.CENTER);	
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//콤보박스에서 선택된 값 처리
				int idx=comboBox.getSelectedIndex();
				int deptno=deptList.get(idx).getDeptno();
				System.out.println("deptno:"+deptno);
				empList=empDao.listEmp(deptno);
				list.removeAll();//리스트의 목록 초기화
				for(EmpDTO dto : empList) {
					//List에 사원이름 추가
					list.add(dto.getEname());
				}
			}
		});
		for(DeptDTO dto : deptList) {
			comboBox.addItem(dto.getDname());
		}
		contentPane.add(comboBox, BorderLayout.NORTH);
		

	}

}
