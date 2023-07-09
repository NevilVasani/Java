//Implementation of Finding Ip Address of Diff Websites
import java.net.*; 
import javax.swing.*;  
import java.awt.event.*;  

public class Exp10b extends JFrame implements ActionListener{  
    JLabel l;  
    JTextField tf;  
    JButton b;  
Exp10b(){  
    super("IP Address Finder");  
    l=new JLabel("Enter the URL:");  
    l.setBounds(60,85,170,30);;  
    tf=new JTextField();  
    tf.setBounds(60,120,225,30);  
      
    b=new JButton("Find IP Address!");  
    b.setBounds(60,160,150,30);  
    b.addActionListener(this);  
    add(l);  
    add(tf);  
    add(b);  
    setSize(400,400);  
    setLayout(null);  
    setVisible(true);  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
public void windowClosed(WindowEvent e){
    System.exit(0);
}
public void actionPerformed(ActionEvent e){  
    String url=tf.getText();  
    try {  
        InetAddress inet=InetAddress.getByName(url); // this takes given url (Ex:www.sid.com, etc)
        String ipa=inet.getHostAddress();  // this finds the given host address
        JOptionPane.showMessageDialog(this,ipa);  // it shows standard dialog box with address
    } catch (UnknownHostException e1) {  
        JOptionPane.showMessageDialog(this,e1.toString());  // Thrown to indicate that the IP address of a host could not be determined.
    }  
}  
public static void main(String[] args) {  
    new Exp10b();  
}  
}  