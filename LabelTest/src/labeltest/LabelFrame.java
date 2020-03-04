
package labeltest;
import java.util.Scanner; 
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame {
     
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public LabelFrame(){
       super("Testing JLabel");
       setLayout(new FlowLayout());
       label1= new JLabel("aiiii");
       label1.setToolTipText("aaa");
       
       
       Icon bug = new ImageIcon( getClass().getResource("bug1.png"));
       label2= new JLabel("123",bug,SwingConstants.LEFT);
       add(label2);
       label3= new JLabel();
       label3.setText("aaaa");
       label3.setIcon(bug);
       label3.setHorizontalTextPosition(SwingConstants.CENTER);
       label3.setVerticalTextPosition(SwingConstants.BOTTOM);
       label3.setToolTipText("aaaaaa");
       add(label3);         
    }  
}

