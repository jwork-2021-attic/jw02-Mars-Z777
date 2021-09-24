package work02;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;

public class Color {

	private BufferedImage image;
	
	Color(String name){
		try {
			File f = new File(name);
			image = ImageIO.read(f);
		}catch(IOException e) {
			System.out.println("Error");
		}
	}
	
	public int[] formColorTable() {
		int res[] = new int[64];
		int h = image.getHeight();
		int w = image.getWidth();
		int index = 0;
		for(int i = 0; i < h; i += 27) {
			for(int j = 36; j < w; j += 144) {
				int tmp = image.getRGB(j, i);
				res[index++] = tmp;
			}
		}
		return res;
	}
	
}
