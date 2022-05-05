package own.ball;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import java.util.Random;

public class Ball {
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


    public Ball(SpriteBatch batch, Texture image, TextureRegion imager, int x, int y, int xSpeed, int ySpeed) {
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
		batch.draw(imager, x, y, Width/2, Height/2, Width, Height, 1, 1, rotation, clockwise);

		
		
		
    }




	
}


/*


public class Planet {



	private Texture Planet;
	private TextureRegion planetRegion;
	private int x, y, OriginX, OriginY, Width, Height;
	private int rotation = 0;
	

	public Planet(int x, int y, Texture Planet, TextureRegion PlanetRegion) {
		
		this.x = x;
		this.y = y;
		this.Planet = Planet;
		this.planetRegion = PlanetRegion;
		Width = Planet.getWidth();
		Height = Planet.getHeight();
		OriginX = (x + Width)/2;
		OriginY = (y + Height)/2;

		
	}

	public void render(SpriteBatch batch) {

	batch.draw(planetRegion, x, y, OriginX, OriginY, Width, Height, 1, 1, rotation, false);

	}

	public void update() {
		rotation += 1;
	}

}



for(int u = 0; u < 25; u++) { 
planetList.add(new Planet(400*i, 400*u, Planet, planetRegion));
				}
			}




*/
