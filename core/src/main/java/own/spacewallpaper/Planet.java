package own.spacewallpaper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import java.util.Random;

public class Planet {
	SpriteBatch batch;
	Texture image;
	TextureRegion imager;
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    int Width; 
	int Height;	
	int rotation = 0;
	boolean clockwise = false;
	Random r = new Random();


    public Planet(SpriteBatch batch, Texture image, TextureRegion imager, int x, int y, int xSpeed, int ySpeed) {
		this.image = image;
		this.imager = imager;
		this.batch = batch;
        this.x = x;
        this.y = y;			
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
		Width = image.getWidth();
		Height = image.getHeight();		
    }

    public void update(Texture image) {
        x += xSpeed;
        y += ySpeed;
        if (x < -100 || x > Gdx.graphics.getWidth() + 100) {
            xSpeed = -xSpeed;
			clockwise = true;
        }
        if (y < -100 || y > Gdx.graphics.getHeight() + 100) {
            ySpeed = -ySpeed;
			clockwise = false;
        }
		
		if (!clockwise) {
		rotation += 1;
		} else {
		rotation -= 1; 	
		}

    }



    public void draw(SpriteBatch batch, Texture image, TextureRegion imager) {
	    batch.enableBlending();

		//batch.draw(region, x, y, originX, originY, width, height, scaleX, scaleY, rotation, clockwise)
		batch.draw(imager, x, y, Width/2, Height/2, Width, Height, 1.0f, 1.0f, rotation, clockwise);

		
		
		
    }




	
}



