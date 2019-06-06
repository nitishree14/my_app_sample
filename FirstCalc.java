import java.awt.*;
import java.awt.event.*;
public class First_Calc extends Frame implements ActionListener {
	
	First_Calc(){
		Button b1=new Button("add");
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		//Label l1=new Label();
		Label l1 = new Label(""); 
        l1.setBounds(160, 120, 150, 80); 
		b1.setBounds(100,100,40,30);
		tf1.setBounds(20, 100, 40, 30);
		tf2.setBounds(70, 100, 40, 30);// setting button position  
		add(b1);
		add(tf1);
		add(tf2);
		add(l1);//adding button into frame  
		setSize(300,300);//frame size 300 width and 300 height  
		setLayout(null);//no layout manager  
		setVisible(true);   
		/*
		Button b2=new Button("sub");  
		b2.setBounds(60,100,40,30);// setting button position  
		add(b2);//adding button into frame  
		setSize(300,300);//frame size 300 width and 300 height  
		setLayout(null);//no layout manager  
		setVisible(true);
		
		Button b3=new Button("mul");  
		b3.setBounds(110,100,40,30);// setting button position  
		add(b3);//adding button into frame  
		setSize(300,300);//frame size 300 width and 300 height  
		setLayout(null);//no layout manager  
		setVisible(true);
		
		Button b4=new Button("div");  
		b4.setBounds(160,100,40,30);// setting button position  
		add(b4);//adding button into frame  
		setSize(300,300);//frame size 300 width and 300 height  
		setLayout(null);//no layout manager  
		setVisible(true);
		 */
		
		//register listener  
		//b1.addActionListener(this);//passing current instance
		b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
                 int a = Integer.parseInt(tf1.getText());
                 int b = Integer.parseInt(tf2.getText()); 
                 int c = a + b; 
                 l1.setText("Their sum is = " + String.valueOf(c)); 
                                   }
             }); 

		//register listener  
		//b2.addActionListener(this);//passing current instance  
		//register listener  
		//b3.addActionListener(this);//passing current instance  
		//register listener  
		//b4.addActionListener(this);//passing current instance  
	             }
	
	public void actionPerformed(ActionEvent e)
	 	{  
		
		}  

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		First_Calc fc=new First_Calc();
     System.out.println("HIIII");
	}

}
