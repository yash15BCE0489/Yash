import java.io.*;
import java.awt.*;
import java.awt.event.*;

class MyProgram implements ItemListener,KeyListener
{
Frame f;
Label l;
TextField t2;
Choice c;
Button b;
Panel p1,p2;
List l1,l2;
String path;
String str;
String abc;

public void fill(String path)
{
File f = new File(path+"\\");
File mylist1[] = f.listFiles();
l1.clear();
for(File ff:mylist1)
{
if(ff.isDirectory())
l1.add(ff.getName());
}
}

public void fill(String path,String str)
{
File f = new File(path+"\\"+str+"\\");
File mylist1[] = f.listFiles();
l2.clear();
for(File ff:mylist1)
l2.add(ff.getName());
}

public void fill(String path,String str,String abc)
{
File f = new File(path+"\\"+str+"\\");
File mylist1[] = f.listFiles();
l2.clear();
for(File ff:mylist1)
{
if(ff.getName().startsWith(abc))
l2.add(ff.getName());
}
}


MyProgram()
{
f = new Frame();
l = new Label("Drive");
c = new Choice();
c.add("C:");
c.add("D:");
c.add("E:");
c.add("F:");
t2 = new TextField();
b = new Button("Go");
p1 = new Panel();
p2 = new Panel();
l1 = new List(15,true);
l2 = new List(15,true);
f.setLayout(null);
l.setBounds(10,40,30,20);
c.setBounds(60,40,80,20);
b.setBounds(160,40,40,20);
t2.setBounds(230,40,140,20);
p1.setBounds(10,70,180,250);
p2.setBounds(200,70,180,250);
p1.add(l1);
p2.add(l2);
f.add(l);
f.add(c);
f.add(b);
f.add(t2);
f.add(p1);
f.add(p2);

b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
path = c.getSelectedItem();
fill(path);
}
});

l1.addItemListener(this);

t2.addKeyListener(this);

f.setSize(400,400);
f.setVisible(true);
}

public static void main(String ar[])
{
MyProgram p = new MyProgram();
}


public void itemStateChanged(ItemEvent e)
{
str = l1.getSelectedItem();
fill(path,str);
}

public void keyReleased(KeyEvent e)
{
fill(path,str,t2.getText());
}

public void keyPressed(KeyEvent e)
{
}

public void keyTyped(KeyEvent e)
{
}

}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash Agarwal
 */

