package JGame.RenderSystem.Math;

public class Rect {


	public double x;
	public double y;
	public double width;
	public double height;

	
	
	
		/**
		 * 
		 * @param	x
		 * @param	y
		 * @param	width
		 * @param	height
		 * @param	inputPoint 如果为true 则输入的后两个按照x y坐标而不是宽高来解释
		 */
		public Rect(double x, double y, double width, double height,Boolean inputPoint)
		{
				this.x = x;
				this.y = y;
				
				if (!inputPoint)
				{
				this.width = width;
				this.height = height;
				}
				else
				{
				this.width = width - x;
				this.height = height - y;
				}
				
	
		}
		
		/**
		 * 
		 * @param	x
		 * @param	y
		 * @param	width
		 * @param	height
		 * @param	inputPoint 如果为true 则输入的后两个按照x y坐标而不是宽高来解释
		 */
		public Rect(double x, double y, double width, double height)
		{
				this(x, y, width, height, false);
	
		}
		
	
		public Rect scale(double a)
		{
			
			return new Rect(x,y,width*a,height*a);
		}

		public Vector2 getRightDownPoint() {
			// TODO Auto-generated method stub
			return new Vector2(getMaxX(), getMaxY());
		}

		public Vector2 getLeftTopPoint() {
			// TODO Auto-generated method stub
			return new Vector2(getMinX(), getMinY());
		}

		public Vector2 getRightTopPoint() {
			// TODO Auto-generated method stub
			return new Vector2(getMaxX(), getMinY());
		}

		public Vector2 getLeftDownPoint() {
			// TODO Auto-generated method stub
			return new Vector2(getMinX(), getMaxY());
		}

	
	
		public double getMinX()
		{
			return x;
		}
		
		public void setMinX(double value)
		{
			x=value;
			width+=Math.abs(value);
		}
		
		public double getMaxX()
		{
			return x+width;
		}
		
		public void setMaxX(double value)
		{
			width=value-x;
		}
		
		public double getMinY()
		{
			return y;
		}

		public void setMinY(double value)
		{
			y=value;
			height+=Math.abs(value);
		}
		
		public double getMaxY()
		{
			return y+height;
		}
		
		public void setMaxY(double value)
		{
			height=value-y;
		}

		


}
