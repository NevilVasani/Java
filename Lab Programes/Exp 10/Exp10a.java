import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Exp10a {

	public static void converter()
	{
		JFrame f = new JFrame("CONVERTER");
		JLabel l1, l2;
		JTextField t1, t2;
		JButton b1;

		l1 = new JLabel("Rupees:");
		l1.setBounds(20, 40, 60, 30);
		l2 = new JLabel("Dollars:");
		l2.setBounds(170, 40, 60, 30);
		
		t1 = new JTextField();
		t1.setBounds(80, 40, 50, 30);
		t2 = new JTextField();
		t2.setBounds(240, 40, 50, 30);

		b1 = new JButton("Convert");
		b1.setBounds(50, 80, 100, 40);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
			double d = Double.parseDouble(t1.getText());
			double d1 = (d * 82.12);
			String str1 = String.valueOf(d1);
			t2.setText(str1);
			}
		});

		f.add(l1);f.add(t1);f.add(l2);f.add(t2);f.add(b1);
		f.setLayout(null);
		f.setSize(400, 300);
		f.setVisible(true);
	}

	// Driver code
	public static void main(String args[])
	{
		converter();
	}
}
