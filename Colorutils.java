package clientname.Utils;

import java.awt.Color;

public class Colorutils {
	
	int index = 0;
	long x = 0;
	
public static Color rainbowEffect(float f, float fade){
float hue = (float) (System.nanoTime() + f) / 1.0E10F % 1.0F;
long color = Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(hue, 1.0F, 1.0F)).intValue()), 16);
Color c = new Color((int) color);
return new Color(c.getRed()/255.0F*fade, c.getGreen()/255.0F*fade, c.getBlue()/255.0F*fade, c.getAlpha()/255.0F);
}
}