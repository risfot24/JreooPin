package oop01.syntax;

public class Rectangle {
    public int width = 0 ;
    public int height = 0 ;
    public Point origin ;
    
    public Rectangle() {
	    origin = new Point(0,0); //
    	
	}
    /*
    public Rectangle(Point p){
    	origin = p;
    	
    }
    public Rectangle(int w, int h){
    	origin = new Point(0,0);
    	width = w;
    	height = h;
    	 
    }
    public Rectangle(Point p, int w , int h){
    	origin = p;
    	width = w;
    	height = h;
    	
    }
    */
    
    // a method for moving the moving the rectangle
	public void move(int x,int y){
		//���� ��ġ orgin �̶� �Ҷ�
		// �Ķ���� ��ġ�� �ű�� ��ɵ�
		// �ڵ� ȭ
	
	  	//this.width = x;
	  	//this.height = y;
		origin.x = x;  //��
		origin.y = y;  //��
	    
	
	}
	//a method for computing the area of the rectangle
	public int getArea(){
		return origin.x * origin.y; //��
	}  //0��� ������ ��������
    
	
}