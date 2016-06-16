import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DriverTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Demo application");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("Name");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Email Id");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JTextField passwordText = new JTextField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);
		
		JLabel age=new JLabel("age");
		age.setBounds(10,70,80,25);
		panel.add(age);
		
		JTextField ageText = new JTextField(20);
		ageText.setBounds(100, 70, 160, 25);
		panel.add(ageText);

		JButton loginButton = new JButton("Submit");
		loginButton.setBounds(10, 100, 80, 25);
		panel.add(loginButton);
		
		JButton upd=new JButton("update");
		upd.setBounds(10, 130, 80, 25);
		panel.add(upd);
		
		loginButton.addActionListener(new ActionListener(){
			
		
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Driv dd=new Driv();
				dd.setName(userText.getText());
				dd.setEmailId(passwordText.getText());
				Data.saveDetails(dd);
			}
			
		});
		
upd.addActionListener(new ActionListener(){
			
		
			
			@Override
			public void actionPerformed(ActionEvent d) {
				// TODO Auto-generated method stub
				Driv dr=new Driv();
				dr.setName(userText.getText());
				
				dr.setAge(Integer.parseInt(ageText.getText()));
				Data.updateDetails(dr);
			}
			
		});
		
	}

}
