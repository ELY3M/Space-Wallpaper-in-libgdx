package own.spacewallpaper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;

public class Planet {
    SpriteBatch batch;
    TextureRegion imager;
    int windowWidth =  800;
    int windowHeight = 800;
    float x;
    float y;
    float xSpeed;
    float ySpeed;
    int Width;
    int Height;
    int rotation;
    boolean clockwise;

    // Tune this value: lower = slower
    // 30f = slow drift, 60f = medium, 100f = faster
    private static final float SPEED_MULTIPLIER = 8f; //35f;
    private static final float ROTATION_SPEED = 60f; // degrees per second

    public Planet(SpriteBatch batch, Texture image, TextureRegion imager) {
        this.batch = batch;
        this.imager = imager;
        this.x = MathUtils.random(0, windowWidth);
        this.y = MathUtils.random(0, windowHeight);

        // Base direction/speed
        this.xSpeed = 1f;
        this.ySpeed = 1f;

        Width = image.getWidth();
        Height = image.getHeight();
        this.rotation = 0;
        this.clockwise = false;
    }

    public void update() {
        float delta = Gdx.graphics.getDeltaTime();

        // Frame-rate independent movement
        x += xSpeed * SPEED_MULTIPLIER * delta;
        y += ySpeed * SPEED_MULTIPLIER * delta;

        if (x < -100 || x > windowWidth + 100) {
            xSpeed = -xSpeed;
            clockwise = true;
        }
        if (y < -100 || y > windowHeight + 100) {
            ySpeed = -ySpeed;
            clockwise = false;
        }

        // Frame-rate independent rotation
        if (!clockwise) {
            rotation += (int)(ROTATION_SPEED * delta);
        } else {
            rotation -= (int)(ROTATION_SPEED * delta);
        }
    }

    public void draw(SpriteBatch batch, TextureRegion imager) {
        batch.enableBlending();
        batch.draw(imager, x, y, Width / 2f, Height / 2f, Width, Height, 1.0f, 1.0f, rotation, clockwise);
    }
}