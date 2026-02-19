package own.spacewallpaper;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;

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
    float slowDown = -5000f; // for half speed


    public Planet(SpriteBatch batch, Texture image, TextureRegion imager) {
        this.batch = batch;
        this.imager = imager;
        //r.nextInt(Gdx.graphics.getWidth()), r.nextInt(Gdx.graphics.getHeight()
        //Random r = new Random();
        //this.x = r.nextInt(windowWidth);
        this.x = MathUtils.random(0, windowWidth);
        //this.y = r.nextInt(windowHeight);
        this.y = MathUtils.random(0, windowHeight);
        //this.x = x;
        //this.y = y;
        this.xSpeed = 1;
        this.ySpeed = 1;
        Width = image.getWidth();
        Height = image.getHeight();
        this.rotation = 0;
        this.clockwise = false;

    }
    public void update() {
        x += xSpeed;
        y += ySpeed;
        //float delta = Gdx.graphics.getDeltaTime();

        //float multiplier = (float) Math.pow(0f, delta * 0f);
        //x *= multiplier;
        //y *= multiplier;

        //x -=Gdx.graphics.getDeltaTime()*-1000;
        //y -=Gdx.graphics.getDeltaTime()*-1000;
        //x += Gdx.graphics.getDeltaTime() * 30f;
        //y += Gdx.graphics.getDeltaTime() * 30f;


        if (x < -100 || x > windowWidth + 100) {
            xSpeed = -xSpeed;
            //x += delta * speed * slowDown;
            //y += delta * speed * slowDown;
            clockwise = true;
        }
        if (y < -100 || y > windowHeight + 100) {
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
        Random r = new Random();
        //batch.draw(region, x, y, originX, originY, width, height, scaleX, scaleY, rotation, clockwise)
        batch.draw(imager, x, y, Width/2, Height/2, Width, Height, 1.0f, 1.0f, rotation, clockwise);
        //batch.draw(imager, r.nextInt(windowWidth), r.nextInt(windowHeight), Width/2, Height/2, Width, Height, 1.0f, 1.0f, rotation, clockwise);
        //batch.draw(imager, MathUtils.random(0, windowWidth), MathUtils.random(0, windowWidth), Width/2, Height/2, Width, Height, 1.0f, 1.0f, rotation, clockwise);


    }

}


