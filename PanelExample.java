    import java.awt.*;  
    public class PanelExample {  
         PanelExample()  
            {  
            Frame f= new Frame("Panel Example");    
            Panel panel=new Panel();  
            panel.setBounds(80,80,400,400);    
            panel.setBackground(Color.gray);  
            Button b1=new Button("Button 1");     
            b1.setBounds(50,100,80,30);     
            Button b2=new Button("Button 2");   
            b2.setBounds(100,100,80,30);     
            panel.add(b1); panel.add(b2);  
            f.add(panel);  
            f.setSize(400,400);    
            f.setLayout(null);    
            f.setVisible(true);    
            }  
            public static void main(String args[])  
            {  
            new PanelExample();  
            }  
    }  