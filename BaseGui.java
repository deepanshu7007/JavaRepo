import java.awt.*;
class BaseGui
{
	Frame f;
	Button bn,bs,be,bw,bc;
	BaseGui()
	{
		f=new Frame("MyApp");
		bn=new Button("NORTH");
		bs=new Button("SOUTH");
		be=new Button("EAST");
		bw=new Button("WEST");
		bc=new Button("CENTER");
	}
	void show()
	{
		f.setVisible(true);
		f.setSize(400,400);
		f.add(bn,BorderLayout.NORTH );
		f.add(be,BorderLayout.EAST );
		f.add(bw,BorderLayout.WEST );
		f.add(bs,BorderLayout.SOUTH );
		f.add(bc,BorderLayout.CENTER );
	}
	public static void main(String[] args)
	{
		BaseGui b = new BaseGui();
		b.show();
	}
}