import java.awt.*;
public class Test {
    Test()
    {
        MenuBar mb;
        Menu mf,me,ms;
        MenuItem mn,mo,md,mp;
        mb=new MenuBar();
        mf=new Menu("File");
        me=new Menu("Edit");
        mn=new Menu("New");
        mo=new Menu("Open");
        ms=new Menu("Save");
        mp=new Menu("as PDF");
        md=new Menu("as DOC");
        TextField t = new TextField(20);
        Frame f= new Frame("Panel Example");
        Panel panel1=new Panel();
        Panel panel=new Panel();
        panel.setBounds(80,60,200,30);
        panel1.setBounds(60,100,250,250);
        panel.setBackground(Color.gray);
        panel1.setBackground(Color.blue);
        Button b1=new Button("1");
        //b1.setBounds(50,100,100,100);
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        Button b7=new Button("7");
        Button b8=new Button("8");
        Button b9=new Button("9");
        Button b10=new Button("+");
        Button b11=new Button("-");
        Button b12=new Button("=");
        //b2.setBounds(100,100,80,30);
        panel1.setLayout(new GridLayout(3,3,4,4));
        panel1.add(b1); panel1.add(b2);panel1.add(b3);panel1.add(b4);panel1.add(b5);panel1.add(b6);panel1.add(b7);panel1.add(b8);panel1.add(b9);panel1.add(b10);panel1.add(b11);panel1.add(b12);
        panel.add(t);
        f.add(panel);
        f.add(panel1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setMenuBar(mb);
        mb.add(mf);
        mb.add(me);
        mf.add(mn);
        mf.add(mo);
        mf.addSeparator();
        mf.add(ms);
        ms.add(mp);
        ms.add(md);

    }
    public static void main(String args[])

    {
        new Test();
    }
}