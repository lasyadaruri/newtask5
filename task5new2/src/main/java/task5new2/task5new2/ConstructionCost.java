package task5new2.task5new2;

import org.apache.logging.log4j.*;   
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code=”ConstructionCost” width=450 height=300>
</applet>
*/
@SuppressWarnings("deprecation")
public class ConstructionCost extends Applet implements ActionListener {
/**
*
*/
private static final Logger logger = LogManager.getLogger(ConstructionCost.class);
private static final long serialVersionUID = 1L;
JButton b1;
JTextField t1,t2,t3,t4;
JLabel l1,l2,l3;
JPanel p;
public void init()
{
// TODO start asynchronous download of heavy resources

l1=new JLabel("material standard");
l2=new JLabel("total area");
l3=new JLabel("fully automated");
b1=new JButton("calculate cost");

t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
t4=new JTextField();

this.setLayout(new GridLayout(4,2));
this.add(l1);
this.add(t1);
this.add(l2);
this.add(t2);
this.add(l3);
this.add(t3);
this.add(b1);
this.add(t4);
b1.addActionListener(this);


}
public void actionPerformed(ActionEvent ae)
{

String materialstandard;
double totalarea,totalcost=0.0;
int constructioncost;
String automated;
materialstandard=t1.getText();
totalarea=Double.parseDouble(t2.getText());
automated=t3.getText().toLowerCase();

if (ae.getSource()==b1)
{
if(materialstandard.equals("standard")) {
constructioncost=1200;
totalcost=constructioncost*totalarea;
}
else if(materialstandard.equals("above standard")) {
constructioncost=1500;
totalcost=constructioncost*totalarea;
}
else if(materialstandard.equals("high standard")) {
constructioncost=1800;
totalcost=constructioncost*totalarea;
}
else if(materialstandard.equals("high standard") && (automated.equals("yes") || automated.equals("true"))) {
constructioncost=2500;
totalcost=constructioncost*totalarea;
}
t4.setText(Double.toString(totalcost));

}
logger.info("standard:"+t1.getText());
logger.info("total area:"+t2.getText());
logger.info("automated:"+t3.getText());  
logger.info("total cost:"+t4.getText());  
 
}

}
