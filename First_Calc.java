//package First_Calc;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;


class First_Calc extends JFrame implements ActionListener 
{ 
    int s1,s2,s3; 
   
    JLabel l1,l2,result;
    JPanel panel1,panel2; 
    JButton add,sub,mul,div; 
    JTextField t1,t2,t3; 
    First_Calc() 
    { 
     panel1=new JPanel(new FlowLayout()); 
      panel2=new JPanel(new FlowLayout()); 
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
   Component add1= panel1.add(l1); 
  Component add2=  panel1.add(t1); 
   Component add3= panel1.add(l2); 
   Component add4= panel1.add(t2); 
   Component add5= panel1.add(result); 
    Component add6 = panel1. add(t3); 
    Component add7 = panel2.   add(add); 
    Component add8 = panel2.   add(sub); 
    Component add9 = panel2.   add(mul); 
    Component add10 = panel2.  add(div); 
     add(panel1,BorderLayout.NORTH); 
    add(panel2,BorderLayout.SOUTH); 
    
     
       
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
