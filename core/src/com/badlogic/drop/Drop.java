package com.badlogic.drop;

import java.util.Iterator;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.TimeUtils;

public class Drop extends ApplicationAdapter {
	Texture background;
	Texture alien3;
	Texture alien4;
	Texture asteroid1;
	Texture asteroid2;
	Texture asteroid3;
	Texture asteroid4;
	Texture asteroid5;
	Texture bluemouse;
	Texture element1;
	Texture element10;
	Texture element11;
	Texture element12;
	Texture element13;
	Texture element14;
	Texture element15;
	Texture element16;
	Texture element17;
	Texture element18;
	Texture element19;
	Texture element2;
	Texture element20;
	Texture element21;
	Texture element22;
	Texture element23;
	Texture element24;
	Texture element25;
	Texture element26;
	Texture element27;
	Texture element28;
	Texture element29;
	Texture element3;
	Texture element30;
	Texture element31;
	Texture element4;
	Texture element5;
	Texture element6;
	Texture element7;
	Texture element8;
	Texture element9;
	Texture firefly;
	Texture largemoon;
	Texture light;
	Texture lightoff;
	Texture lighton;
	Texture moon;
	Texture pixelfly;
	Texture planet1;
	Texture planet10;
	Texture planet11;
	Texture planet12;
	Texture planet13;
	Texture planet2;
	Texture planet3;
	Texture planet4;
	Texture planet5;
	Texture planet6;
	Texture planet7;
	Texture planet8;
	Texture planet9;
	Texture star32;
	Texture tinyufo;	

	private SpriteBatch batch;
	private OrthographicCamera camera;
	private Array<Rectangle> raindrops;
	private long lastDropTime;

   @Override
   public void create() {
	   
        // load the images
		background = new Texture("background.png");
		
		alien3 = new Texture("alien3.png");
		alien4 = new Texture("alien4.png");
		asteroid1 = new Texture("asteroid1.png");
		asteroid2 = new Texture("asteroid2.png");
		asteroid3 = new Texture("asteroid3.png");
		asteroid4 = new Texture("asteroid4.png");
		asteroid5 = new Texture("asteroid5.png");
		bluemouse = new Texture("bluemouse.png");
		element1 = new Texture("element1.png");
		element10 = new Texture("element10.png");
		element11 = new Texture("element11.png");
		element12 = new Texture("element12.png");
		element13 = new Texture("element13.png");
		element14 = new Texture("element14.png");
		element15 = new Texture("element15.png");
		element16 = new Texture("element16.png");
		element17 = new Texture("element17.png");
		element18 = new Texture("element18.png");
		element19 = new Texture("element19.png");
		element2 = new Texture("element2.png");
		element20 = new Texture("element20.png");
		element21 = new Texture("element21.png");
		element22 = new Texture("element22.png");
		element23 = new Texture("element23.png");
		element24 = new Texture("element24.png");
		element25 = new Texture("element25.png");
		element26 = new Texture("element26.png");
		element27 = new Texture("element27.png");
		element28 = new Texture("element28.png");
		element29 = new Texture("element29.png");
		element3 = new Texture("element3.png");
		element30 = new Texture("element30.png");
		element31 = new Texture("element31.png");
		element4 = new Texture("element4.png");
		element5 = new Texture("element5.png");
		element6 = new Texture("element6.png");
		element7 = new Texture("element7.png");
		element8 = new Texture("element8.png");
		element9 = new Texture("element9.png");
		firefly = new Texture("firefly.png");
		largemoon = new Texture("largemoon.png");
		light = new Texture("light.png");
		lightoff = new Texture("lightoff.png");
		lighton = new Texture("lighton.png");
		moon = new Texture("moon.png");
		pixelfly = new Texture("pixelfly.png");
		planet1 = new Texture("planet1.png");
		planet10 = new Texture("planet10.png");
		planet11 = new Texture("planet11.png");
		planet12 = new Texture("planet12.png");
		planet13 = new Texture("planet13.png");
		planet2 = new Texture("planet2.png");
		planet3 = new Texture("planet3.png");
		planet4 = new Texture("planet4.png");
		planet5 = new Texture("planet5.png");
		planet6 = new Texture("planet6.png");
		planet7 = new Texture("planet7.png");
		planet8 = new Texture("planet8.png");
		planet9 = new Texture("planet9.png");
		star32 = new Texture("star32.png");
		tinyufo = new Texture("tinyufo.png");



      // create the camera and the SpriteBatch
      camera = new OrthographicCamera();
      camera.setToOrtho(false, 800, 480);
      batch = new SpriteBatch();



      // create the raindrops array and spawn the first raindrop
      raindrops = new Array<Rectangle>();
      spawnRaindrop();
   }

   private void spawnRaindrop() {
      Rectangle raindrop = new Rectangle();
	  //org
	  //raindrop.x = MathUtils.random(0, 800-64);
      //raindrop.y = 480;
	  
      //raindrop.x = MathUtils.random(0, 800);
      //raindrop.y = MathUtils.random(0, 500);
      
	  raindrop.width = 64;
      raindrop.height = 64;
      raindrops.add(raindrop);
      lastDropTime = TimeUtils.nanoTime();
   }



   @Override
   public void render() {
      // clear the screen with a dark blue color. The
      // arguments to clear are the red, green
      // blue and alpha component in the range [0,1]
      // of the color to be used to clear the screen.
      ScreenUtils.clear(0, 0, 0.2f, 1);

      // tell the camera to update its matrices.
      camera.update();
      batch.setProjectionMatrix(camera.combined);

      // begin a new batch and draw the bucket and
      // all drops
      batch.begin();
	  batch.enableBlending();
	  //background
	  batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		

	  //spawn 
      for(Rectangle raindrop: raindrops) {
		 //org 
         //batch.draw(element1, raindrop.x, raindrop.y);
		 batch.draw(element1, MathUtils.random(0, 850), MathUtils.random(0, 500));
      }
	  
	  
      batch.end();




      // check if we need to create a new raindrop
      if(TimeUtils.nanoTime() - lastDropTime > 1000000000) spawnRaindrop();

      // move the raindrops, remove any that are beneath the bottom edge of
      // the screen or that hit the bucket. 
      for (Iterator<Rectangle> iter = raindrops.iterator(); iter.hasNext(); ) {
         Rectangle raindrop = iter.next();
		 //org
		 //raindrop.y -= 200 * Gdx.graphics.getDeltaTime();
		 
		 
		 //raindrop.y -= //0 * Gdx.graphics.getDeltaTime();
		 //raindrop.x -= //0 * Gdx.graphics.getDeltaTime();
		 
		 raindrop.y -= 99999 * Gdx.graphics.getDeltaTime();
         //raindrop.x -= 1 * Gdx.graphics.getDeltaTime();
		 
		 
         //if(raindrop.y + 900 < 0) { iter.remove(); } 

      }
   }
   
   
   

   @Override
   public void dispose() {
      // dispose of all the native resources
      background.dispose();
	  element1.dispose();
      batch.dispose();
   }
}













