package own.ball;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.TimeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends ApplicationAdapter {
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
	
	
	TextureRegion alien3r;
	TextureRegion alien4r;
	TextureRegion asteroid1r;
	TextureRegion asteroid2r;
	TextureRegion asteroid3r;
	TextureRegion asteroid4r;
	TextureRegion asteroid5r;
	TextureRegion bluemouser;
	TextureRegion element1r;
	TextureRegion element10r;
	TextureRegion element11r;
	TextureRegion element12r;
	TextureRegion element13r;
	TextureRegion element14r;
	TextureRegion element15r;
	TextureRegion element16r;
	TextureRegion element17r;
	TextureRegion element18r;
	TextureRegion element19r;
	TextureRegion element2r;
	TextureRegion element20r;
	TextureRegion element21r;
	TextureRegion element22r;
	TextureRegion element23r;
	TextureRegion element24r;
	TextureRegion element25r;
	TextureRegion element26r;
	TextureRegion element27r;
	TextureRegion element28r;
	TextureRegion element29r;
	TextureRegion element3r;
	TextureRegion element30r;
	TextureRegion element31r;
	TextureRegion element4r;
	TextureRegion element5r;
	TextureRegion element6r;
	TextureRegion element7r;
	TextureRegion element8r;
	TextureRegion element9r;
	TextureRegion fireflyr;
	TextureRegion largemoonr;
	TextureRegion lightr;
	TextureRegion lightoffr;
	TextureRegion lightonr;
	TextureRegion moonr;
	TextureRegion pixelflyr;
	TextureRegion planet1r;
	TextureRegion planet10r;
	TextureRegion planet11r;
	TextureRegion planet12r;
	TextureRegion planet13r;
	TextureRegion planet2r;
	TextureRegion planet3r;
	TextureRegion planet4r;
	TextureRegion planet5r;
	TextureRegion planet6r;
	TextureRegion planet7r;
	TextureRegion planet8r;
	TextureRegion planet9r;
	TextureRegion star32r;
	TextureRegion tinyufor;	



	private SpriteBatch batch;	
	private OrthographicCamera camera;
    Ball ball;
	
	ArrayList<Ball> balls = new ArrayList<>();
	
	ArrayList<Planet> planets = new ArrayList<>();
    ArrayList<Planet> ufos = new ArrayList<>();
	Random r = new Random();

    @Override
    public void create() {
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
		
		
		alien3r = new TextureRegion(alien3);
		alien4r = new TextureRegion(alien4);
		asteroid1r = new TextureRegion(asteroid1);
		asteroid2r = new TextureRegion(asteroid2);
		asteroid3r = new TextureRegion(asteroid3);
		asteroid4r = new TextureRegion(asteroid4);
		asteroid5r = new TextureRegion(asteroid5);
		bluemouser = new TextureRegion(bluemouse);
		element1r = new TextureRegion(element1);
		element10r = new TextureRegion(element10);
		element11r = new TextureRegion(element11);
		element12r = new TextureRegion(element12);
		element13r = new TextureRegion(element13);
		element14r = new TextureRegion(element14);
		element15r = new TextureRegion(element15);
		element16r = new TextureRegion(element16);
		element17r = new TextureRegion(element17);
		element18r = new TextureRegion(element18);
		element19r = new TextureRegion(element19);
		element2r = new TextureRegion(element2);
		element20r = new TextureRegion(element20);
		element21r = new TextureRegion(element21);
		element22r = new TextureRegion(element22);
		element23r = new TextureRegion(element23);
		element24r = new TextureRegion(element24);
		element25r = new TextureRegion(element25);
		element26r = new TextureRegion(element26);
		element27r = new TextureRegion(element27);
		element28r = new TextureRegion(element28);
		element29r = new TextureRegion(element29);
		element3r = new TextureRegion(element3);
		element30r = new TextureRegion(element30);
		element31r = new TextureRegion(element31);
		element4r = new TextureRegion(element4);
		element5r = new TextureRegion(element5);
		element6r = new TextureRegion(element6);
		element7r = new TextureRegion(element7);
		element8r = new TextureRegion(element8);
		element9r = new TextureRegion(element9);
		fireflyr = new TextureRegion(firefly);
		largemoonr = new TextureRegion(largemoon);
		lightr = new TextureRegion(light);
		lightoffr = new TextureRegion(lightoff);
		lightonr = new TextureRegion(lighton);
		moonr = new TextureRegion(moon);
		pixelflyr = new TextureRegion(pixelfly);
		planet1r = new TextureRegion(planet1);
		planet10r = new TextureRegion(planet10);
		planet11r = new TextureRegion(planet11);
		planet12r = new TextureRegion(planet12);
		planet13r = new TextureRegion(planet13);
		planet2r = new TextureRegion(planet2);
		planet3r = new TextureRegion(planet3);
		planet4r = new TextureRegion(planet4);
		planet5r = new TextureRegion(planet5);
		planet6r = new TextureRegion(planet6);
		planet7r = new TextureRegion(planet7);
		planet8r = new TextureRegion(planet8);
		planet9r = new TextureRegion(planet9);
		star32r = new TextureRegion(star32);
		tinyufor = new TextureRegion(tinyufo);



       // create the camera and the SpriteBatch
       camera = new OrthographicCamera();
       camera.setToOrtho(false, 800, 600);
       batch = new SpriteBatch();



	 for (int i = 0; i < 19; i++) {
		int randx = MathUtils.random(0, 900); 
		int randy = MathUtils.random(0, 600);
		 
		balls.add(new Ball(batch, element1, element1r, randx, randy, 1, 1));
   	} 


	 for (int i = 0; i < 10; i++) {
		int randx = MathUtils.random(0, 900); 
		int randy = MathUtils.random(0, 600);		 
		planets.add(new Planet(batch, element2, element2r, randx, randy, 1, 1));
   	} 
	
	
	
	for (int i = 0; i < 3; i++) {
		int randx = MathUtils.random(0, 900); 
		int randy = MathUtils.random(0, 600);		 
		ufos.add(new Planet(batch, tinyufo, tinyufor, randx, randy, 1, 1));
   	}


	 
	  //public Ball(int x, int y, int size, int xSpeed, int ySpeed)
	  //public Ball(SpriteBatch batch, Texture image, TextureRegion imager, int x, int y, int xSpeed, int ySpeed)
      ball = new Ball(batch, alien3, alien3r, 1, 1, 1, 1);


    }

    @Override
    public void render() {
        
		ScreenUtils.clear(0, 0, 0.2f, 1);
		camera.update();
        batch.setProjectionMatrix(camera.combined);
	  
		
		batch.begin();
	    batch.enableBlending();
	    //background
	    batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
	

		for (Ball ball : balls) {
		ball.update(element1);
		ball.draw(batch, element1, element1r);
		}

		for (Planet planet : planets) {
		planet.update(element2);
		planet.draw(batch, element2, element2r);
		}		


		for (Planet ufo : ufos) {
		ufo.update(tinyufo);
		ufo.draw(batch, tinyufo, tinyufor);
		}
		
		//alien 
        ball.update(alien3);
        ball.draw(batch, alien3, alien3r);
		




		batch.end();
		
		
    }

}
