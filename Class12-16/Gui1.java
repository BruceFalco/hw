import javax.swing.*;
import java.awt.*;
public class Gui1 extends JFrame {

    private JButton b1,b2;
    private Container pane;
    private JLabel label ;
    private JTextArea text;
    private JPanel canvas;


    public Gui1(){
	setTitle("My First Gui");
	setSize(600,600);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  
	pane = getContentPane();
	//	pane.setLayout(new GridLayout(3,3));

	/*	b1= new JButton("Click me");
	pane.add(b1);
	b2 = new JButton("exit");
	pane.add(b2);
	pane.add(new JButton("button 0")); */

	label = new JLabel("The Label");
	text = new JTextArea();
	text.setColumns(40);
	text.setRows(5);
	pane.add(text);

	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300,300));
	pane.add(canvas);

	/*
	JPanel buttongrid = new JPanel();
	buttongrid.setLayout(new GridLayout(3,3));
	buttongrid.add(new JButton("button 0"));
	buttongrid.add(new JButton("button 1"));
	buttongrid.add(new JButton("button 2"));
	pane.add(buttongrid);
*/

    }

    // EVENT-DRIVEN PROGRAMMING
    // we can click whenever, if at all, type whenever, do whatever at whenever
    // in the interface -- driven by events, non-linear

    // EVENT HANDLERS -- tied to buttons or widgets taht can be clicked
    // click anything else, don't care; click one of those buttons,
    // routine is triggered
    // callback

    public static void main(String[] args) {
	Gui1 f = new Gui1();
	f.setVisible(true);
    }

}
