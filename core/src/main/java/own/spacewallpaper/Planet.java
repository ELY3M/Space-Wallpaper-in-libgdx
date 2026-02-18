package own.spacewallpaper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.Random;


public class Planet {
    SpriteBatch batch;
    TextureRegion imager;
    int windowWidth = 1080;
    int windowHeight = 800;
    int x;
    int y;
    float xSpeed;
    float ySpeed;
    int Width;
    int Height;
    int rotation;
    boolean clockwise;
    float speed = 0.5f;
    float slowDown = 50f; // for half speed


    public Planet(SpriteBatch batch, Texture image, TextureRegion imager) {
        this.batch = batch;
        this.imager = imager;
        //r.nextInt(Gdx.graphics.getWidth()), r.nextInt(Gdx.graphics.getHeight()
        Random r = new Random();
        this.x = r.nextInt(windowWidth);
        this.y = r.nextInt(windowHeight);
        this.xSpeed = 1f;
        this.ySpeed = 1f;
        Width = image.getWidth();
        Height = image.getHeight();
        this.rotation = 0;
        this.clockwise = false;

    }
    public void update() {
        x += xSpeed;
        y += ySpeed;
        //float delta = Gdx.graphics.getDeltaTime();
        ///float multiplier = (float) Math.pow(3f, delta * 30.0f);
        //x *= multiplier;
        //y *= multiplier;
        //x+=Gdx.graphics.getDeltaTime()*30;
        //y+=Gdx.graphics.getDeltaTime()*30;

        if (x < -50 || x > windowWidth + 50) {
            xSpeed = -xSpeed;
            //x += delta * speed * slowDown;
            //y += delta * speed * slowDown;
            clockwise = true;
        }
        if (y < -50 || y > windowHeight + 50) {
            ySpeed = -ySpeed;
            //x += delta * speed * slowDown;
            //y += delta * speed * slowDown;
            clockwise = false;
        }

        if (!clockwise) {
            rotation += 1;
        } else {
            rotation -= 1;
        }


    }


    public void draw(SpriteBatch batch, TextureRegion imager) {
        batch.enableBlending();
        //batch.draw(region, x, y, originX, originY, width, height, scaleX, scaleY, rotation, clockwise)
        batch.draw(imager, x, y, Width/2, Height/2, Width, Height, 1.0f, 1.0f, rotation, clockwise);


    }

}


