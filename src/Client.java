import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class Client
{
Frame f;
TextField t;
List l;
Button b;
Socket s;

Client()
{
f = new Frame("Client");
t = new TextField();
l = new List();
b = new Button("Send");

b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try
{
ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
oos.writeObject(t.getText());
l.add("Me :-- "+t.getText());
t.setText("");
}
catch(Exception e1)
{
System.out.println(e1.getMessage());
}
}
}
);

f.add(t,BorderLayout.NORTH);
f.add(l);
f.add(b,BorderLayout.SOUTH);
f.setVisible(true);
f.setSize(400,400);

try
{
s = new Socket("localhost",4045);
while(true)
{
ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
String str = ois.readObject().toString();
l.add("Friend :-- "+str);
}
}

catch(Exception e)
{
System.out.println(e.getMessage());
}
}

public static void main(String ar[])
{
Client c = new Client();
}
}
