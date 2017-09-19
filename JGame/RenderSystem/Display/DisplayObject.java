package JGame.RenderSystem.Display;

import java.util.function.Function;

import JGame.GameCore.GameObject.Component.Anime.AnimeComponent;
import JGame.RenderSystem.Math.Matrix;

/**
 * baseobject that can be render to screen
 * @author Administrator
 *
 */
public abstract class DisplayObject extends EventDispatcher{

	/**
	 * x position of objecy
	 */
	protected int x;
	/**
	 * y position of object
	 */
	protected int y;
	/**
	 * width
	 */
	protected int width;
	/**
	 * height
	 */
	protected int height;
	/**
	 * The rotation value of the object, in radians
	 */
	protected int rotation;
	/**
	 * scale x
	 */
	protected int scaleX;
	/**
	 * scale y
	 */
	protected int scaleY;
	/**
	 * alpha 0~1
	 */
	protected float alpha;
	/**
	 * name of the object
	 */
	protected String name;
	/**
	 * is this object visible?
	 */
	protected boolean visible;
	/**
	 * stage reference
	 */
	protected Stage stage;
	
	
	
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getRotation() {
		return rotation;
	}


	public void setRotation(int rotation) {
		this.rotation = rotation;
	}


	public int getScaleX() {
		return scaleX;
	}


	public void setScaleX(int scaleX) {
		this.scaleX = scaleX;
	}


	public int getScaleY() {
		return scaleY;
	}


	public void setScaleY(int scaleY) {
		this.scaleY = scaleY;
	}


	public float getAlpha() {
		return alpha;
	}


	public void setAlpha(float alpha) {
		this.alpha = alpha;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isVisible() {
		return visible;
	}


	public void setVisible(boolean visible) {
		this.visible = visible;
	}


	public Stage getStage() {
		return stage;
	}


	public DisplayObject() {
		
		

	}

	
	public Matrix getLocalTransform()
	{
		return null;
		
	}
	
	public Matrix getWorldTransform()
	{
		return null;
		
	}
	
//	@Override
//	public void addToGame(JGame jGame) {
//		super.addToGame(jGame);
//		
//
////		//将自己添加到渲染的根对象组中
////		game.getRenderManager().addDisplayObject(this);
//		
//		root=jGame.getRoot();
//		
//		com_anime=new AnimeComponent(this);
//		
//		displayInit();
//	}
//	
	



	

	
}
