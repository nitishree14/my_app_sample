//package First_Calc;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;


class First_Calc extends JFrame implements ActionListener 
{ 
    int s1,s2,s3; 
   
    JLabel l1,l2,result,heading;
    JPanel panel1,panel2,panel3; 
    JButton add,sub,mul,div; 
    JTextField t1,t2,t3; 
    First_Calc() 
    { 
     panel1=new JPanel(new FlowLayout()); 
      panel2=new JPanel(new FlowLayout()); 
      panel3=new JPanel(new FlowLayout()); 
      heading=new JLabel("CALCULATOR");
     l1=new JLabel("Number1"); 
     l2=new JLabel("Number2"); 
     result=new JLabel("Result"); 
     
     t1=new JTextField(5); 
     t2=new JTextField(5); 
     t3=new JTextField(5); 
     add=new JButton("+"); 
     sub=new JButton("-"); 
     mul=new JButton("*"); 
     div=new JButton("/"); 
     
     add.addActionListener(this); 
     mul.addActionListener(this); 
     sub.addActionListener(this); 
     div.addActionListener(this); 
     
     Component add1= panel1.add(heading); 
   Component add2= panel2.add(l1); 
  Component add3=  panel2.add(t1); 
   Component add4= panel2.add(l2); 
   Component add5= panel2.add(t2); 
   
    Component add6 = panel3.   add(add); 
    Component add7 = panel3.   add(sub); 
    Component add8 = panel3.   add(mul); 
    Component add9 = panel3.  add(div); 
    Component add10= panel3.add(result); 
    Component add11 = panel3. add(t3); 
    
     add(panel1,BorderLayout.WEST); 
    add(panel2,BorderLayout.NORTH); 
    add(panel3,BorderLayout.SOUTH); 
     
       
     } 
    
    public void actionPerformed(ActionEvent e) 
   { 
      int s1=Integer.parseInt(t1.getText()); 
      int s2=Integer.parseInt(t2.getText()); 
      
      
       if(e.getSource()==add) 
       { 
           s3=s1+s2; 
      System.out.println(s3); 
       t3.setText(Integer.toString(s3)); 
       } 
       else if(e.getSource()==sub) 
       { 
           s3=s1-s2; 
      System.out.println(s3); 
       t3.setText(Integer.toString(s3)); 
       } 
        else if(e.getSource()==div) 
       { 
           s3=s1/s2; 
      System.out.println(s3); 
       t3.setText(Integer.toString(s3)); 
       } 
       else if(e.getSource()==mul) 
       { 
           s3=s1*s2; 
      System.out.println(s3); 
       t3.setText(Integer.toString(s3)); 
       }
} 



   
    public static void main(String[] args) { 
    	First_Calc fc=new First_Calc(); 
       fc.setBounds(200, 150, 120, 550); 
       //cl.setTitle("calculator"); 
       //cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       //cl.setResizable(true); 
       fc.setVisible(true); 
       fc.setSize(500,200); 
    } 
} 
