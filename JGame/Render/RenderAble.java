package JGame.Render;

import java.awt.image.BufferedImage;

import JGame.GameObject.DisplayObject;

public interface RenderAble {

	/**
	 * 渲染对象
	 * @param displayObject
	 */
	void render(BufferedImage image,int x,int y,int width,int height,int angle);
	/**
	 * 清屏
	 */
	void clear();
	
}