import java.awt.*;
import java.awt.event.*;
public class First_Calc extends Frame implements ActionListener {
	
	 	int s1,s2,s3; 
	   
	    Label l1,l2,result;
	    //Panel panel1,panel2; 
	    Button add,sub,mul,div; 
	    TextField t1,t2,t3; 
	
	First_Calc(){
		l1=new Label("Number1"); 
	     l2=new Label("Number2"); 
	     result=new Label("Result"); 
	     
	     t1=new TextField(5); 
	     t2=new TextField(5); 
	     t3=new TextField(5); 
	     add=new Button("+"); 
	     sub=new Button("-"); 
	     mul=new Button("*"); 
	     div=new Button("/"); 
        l1.setBounds(10, 120, 80, 60);
        l2.setBounds(60, 150, 80, 60);
        result.setBounds(110, 120, 150, 80);
        add.setBounds(10,200,40,30);
        sub.setBounds(60,200,40,30);
        mul.setBounds(110,200,40,30);
        div.setBounds(160,200,40,30);
		t1.setBounds(90, 100, 40, 30);
		t2.setBounds(90, 150, 40, 30);// setting button position  
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(t1);
		add(t2);
		add(l1);
		add(l2)//adding button into frame  
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
