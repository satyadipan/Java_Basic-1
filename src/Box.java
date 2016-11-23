
public class Box {
	int l,w,d;
	static int count;
	Box()//default constructor
	{
		this(-1);
		
	}
	Box(int x)//1 arg constructor
	{
		this.l=x;
		this.w=x;
		this.d=x;
		System.out.println("1 arg constructor called. Box created.");
		count++;
	}
	Box(int x,int y,int z)//3 arg constructor
	{
	this.l=x;
	this.w=y;
	this.d=z;
	count++;
	System.out.println("3 arg constructor called. Box created.");
	}
	Box(Box bb)//copy constructor
	{
		this.l=bb.l;
		this.w=bb.w;
		this.d=bb.w;
		System.out.println("copy constructor called. Box created.");
		count++;
	}
	void box_volume()
	{
		System.out.println("The voulume of the box is "+this.l*d*w);
		
	}
	void show_data()
	{System.out.println("Box Data");
	System.out.println("Length : "+this.l+" Width : "+this.w+" Depth : "+this.d);
	}
	static void no_of_box()
	{
		System.out.println("No of boxes created so far "+count);
		
	}
	void set_Data(int x)
	{
		this.l=x;
		this.w=x;
		this.d=x;
		System.out.println("1 arg set_Data method called.Box initialized.");
	}
	
	void set_Data(int l,int w,int d)
	{
		this.l=l;
		this.w=w;
		this.d=d;
		System.out.println("3 arg set_Data method called.Box initialized.");
	}
	
	Box createClone()
	{Box temp=new Box();
	temp.l=this.l;
	temp.d=this.d;
	temp.w=this.w;
	System.out.println("3 arg setData method called.Box initialized.");
	return temp;
	
	
	}
	
	boolean compare(Box bb)
	{if(bb.l==this.l && bb.w==this.w && bb.d==this.w)
		return true;
	else 
		return false;
	
	}
	
	Box addBox(Box bb)
	{ Box temp=new Box();
	temp.l=bb.l+this.l;
	temp.d=bb.d+this.d;
	temp.w=bb.w+this.w;
		return temp;
		
	}
	
	public static void main(String args[])
	{
		Box b1=new Box();
		b1.set_Data(5);
		b1.show_data();
		b1.box_volume();
		
		Box b2=new Box(3,5,7);
		b2.show_data();
		b2.box_volume();
		
		Box.no_of_box();
		
		Box b3=b2.createClone();
		b3.show_data();
		b3.box_volume();
		
		Box.no_of_box();
		
		boolean chk=b2.compare(b3);
		if(chk==true)
			System.out.println("Two boxes(b2 and b3) are same.");
		else
			System.out.println("Two boxes(b2 and b3) are not same.");
		
		Box b4=b3.addBox(b1);
		b4.show_data();
		b4.box_volume();
		chk=b4.compare(b2);
		if(chk==true)
			System.out.println("Two boxes(b4 and b2) are same.");
		else
			System.out.println("Two boxes(b4 and b2) are not same.");
		
		Box.no_of_box();
		
		
	}
}
