package ch17;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.SwingConstants;

public class SliderExam extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	//추가
	private int red, green,blue;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SliderExam frame = new SliderExam();
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
	public SliderExam() {
		panel = new JPanel();//패널객체 생성을 맨 위로 올려줌
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSlider sliderR = new JSlider();
		sliderR.setPaintTicks(true);
		sliderR.setPaintLabels(true);
		sliderR.setSnapToTicks(true);
		sliderR.setToolTipText("");
		sliderR.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				red=sliderR.getValue();
				panel.setBackground(new Color(red,green,blue));
			}
		});
		sliderR.setValue(0);
		sliderR.setMaximum(255);
		sliderR.setBounds(81, 10, 341, 23);
		contentPane.add(sliderR);
		
		JSlider sliderG = new JSlider();
		sliderG.setToolTipText("1");
		sliderG.setSnapToTicks(true);
		sliderG.setMinorTickSpacing(1);
		sliderG.setPaintTicks(true);
		sliderG.setPaintLabels(true);
		sliderG.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				green=sliderG.getValue();
				panel.setBackground(new Color(red,green,blue));
			}
		});
		sliderG.setValue(0);
		sliderG.setMaximum(255);
		sliderG.setBounds(81, 68, 341, 23);
		contentPane.add(sliderG);
		
		JSlider sliderB = new JSlider();
		sliderB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				blue=sliderB.getValue();
				panel.setBackground(new Color(red,green,blue));
			}
		});
		sliderB.setValue(0);
		sliderB.setMaximum(255);
		sliderB.setBounds(81, 124, 341, 23);
		contentPane.add(sliderB);
		
		JLabel lblNewLabel = new JLabel("Red");
		lblNewLabel.setBounds(12, 10, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Green");
		lblNewLabel_1.setBounds(12, 56, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Blue");
		lblNewLabel_2.setBounds(12, 91, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		
		panel.setBounds(12, 189, 488, 126);
		contentPane.add(panel);
	}
}
