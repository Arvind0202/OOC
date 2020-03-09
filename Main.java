import java.awt.*;

import java.awt.event.*;

import java.applet.*;

/*<applet code="Main" width =300 height=300></applet>*/

public class Main extends Applet implements MouseListener

{
    String msg="hj";
    
int mx=0,my=0;
    
public void init()
    
{
        
addMouseListener(this);
    
}
    
public void mousePressed(MouseEvent m)
    
{
        
mx=m.getX();
        my=m.getY();
        msg="hai";
        
repaint();
            }
            
public void paint(Graphics g)
            
{
                g.drawString(msg,mx,my);
            
}
}