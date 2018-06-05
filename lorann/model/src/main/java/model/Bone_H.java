package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * <h1>The Class Bone_H allows the initialization and downloading of Bone_H.</h1>
 *
 * @author Alyssa
 * @version 1.0
 * @see Image
 * @see ImageIcon
 */

public class Bone_H extends Walls{

	/** The image Bone_H */
	Image Bone_H;
	
	/** The initialize the Bone_H.
	 * 	Load image.
	 * @param OriginX
	 * 			the Origin X
	 * @param OriginY
	 * 			the Origin Y
	 */
	public Bone_H(int OriginX, int OriginY) {
		
		this.x = OriginX;
		this.y = OriginY;
		
		ImageIcon BoneHImg = new ImageIcon("../sprite/horizontal_bone.png");
		Bone_H = BoneHImg.getImage();
	}
	
	/**
	 * Get Image.
	 * 
	 * @return Bone_H
	 */
	public Image getImage() {
		
		return Bone_H;
		
	}
	
}