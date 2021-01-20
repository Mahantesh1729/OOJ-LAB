import java.awt.*;
import java.awt.event.*;
class div extends Dialog implements ActionListener{
	Series d;
	div(Frame parent,String title){ 
		super(parent,title,false); 
		d=(Series)parent;
		setLayout(new FlowLayout());
		setSize(500,200);
		add(new Label(d.er));
		Button b;
		add(b = new Button("OK"));
		b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){ 
		dispose(); 
	} 
}
public class Series extends Frame implements ActionListener{
	TextField n1, n2,r;
	Button Divide;
	String er="";
	public Series()
	{ 
		setLayout(new FlowLayout());
		Divide = new Button("Divide");
		Label n1p = new Label("Num1 : ",Label.RIGHT);
		Label n2p = new Label("Num2 : ",Label.RIGHT);
		n1 = new TextField(10);
		n2 = new TextField(10);
		r = new TextField(10);
		add(n1p);
		add(n1);
		add(n2p);
		add(n2);
		add(Divide);
		add(r);
		Divide.addActionListener(this);
		addWindowListener(new WindowAdapter(){ 
			public void windowClosing(WindowEvent we)
			{ 
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent ae)
	{ 
		int a=0,b=0,c=0,d=0;
		double re=0;
		try{
			a = Integer.parseInt(n1.getText());
		    b = Integer.parseInt(n2.getText());
		}
		catch(NumberFormatException e1){ 
			er="Caught: "+e1; 
		    div dv = new div(this,"Error");
		    dv.setVisible(true); 
		}		   
		try{
			c = Integer.parseInt(n1.getText());
		    d = Integer.parseInt(n2.getText());
			re=c/d;
		}
		catch(ArithmeticException e2){ 
			er="Caught: "+e2+" as n2= "+ n2.getText(); 
		    div di = new div(this,"Error");
		    di.setVisible(true); 
		}
		r.setText(" "+re);
	}

	public static void main(String args[]){ 
		Series appwin = new Series();
		appwin.setSize(new Dimension(800,400));
		appwin.setTitle("Integer Division");
		appwin.setVisible(true);
	}
}
