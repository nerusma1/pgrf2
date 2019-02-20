package imageData;

import java.awt.image.BufferedImage;

public class ImageBuffer implements Image<Integer> {

    /*private int width;
    private int height;*/
    private Integer value;
    private BufferedImage img;

    public ImageBuffer(BufferedImage img){
        this.img=img;


    }

    @Override
    public int getWidth() {
        return img.getWidth();
    }

    @Override
    public int getHeight() {
        return getHeight();
    }

    @Override
    public Integer getValue(int x, int y) {
        return img.getRGB(x, y);
    }

    @Override
    public void setValue(int x, int y, Integer value) {
        img.setRGB(x, y, value.intValue());

    }
}
