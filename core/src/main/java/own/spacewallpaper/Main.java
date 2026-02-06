package own.spacewallpaper;

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
	//1920×1080
		
	int windowWidth = 1920; 
	int windowHeight = 1080; 
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
    Planet alien3p;
    Planet alien4p;		
	Planet asteroid1p;
	Planet asteroid2p;
	Planet asteroid3p;
	Planet asteroid4p;
	Planet asteroid5p;
    Planet bluemousep;
    Planet element1p;
	Planet element10p;
	Planet element11p;
	Planet element12p;
	Planet element13p;
	Planet element14p;
    Planet element15p;
    Planet element16p;
	Planet element17p;
	Planet element18p;
	Planet element19p;
	Planet element2p; 
	Planet element20p;
    Planet element21p;
    Planet element22p;
	Planet element23p;
	Planet element24p;
	Planet element25p;
	Planet element26p;
	Planet element27p;
    Planet element28p;
    Planet element29p;
	Planet element3p; 
	Planet element30p;
	Planet element31p;
	Planet element4p;
	Planet element5p; 
    Planet element6p; 
    Planet element7p; 
	Planet element8p; 
	Planet element9p; 
	Planet fireflyp;
	Planet largemoonp; 
	Planet lightp;
    Planet lightoffp;  
    Planet lightonp;
	Planet moonp;
	Planet pixelflyp; 
	Planet planet1p;
	Planet planet10p; 
	Planet planet11p; 
    Planet planet12p; 
    Planet planet13p; 
	Planet planet2p;
	Planet planet3p;
	Planet planet4p;
	Planet planet5p;
	Planet planet6p;
    Planet planet7p;
    Planet planet8p;
	Planet planet9p;
	Planet star32p; 
	Planet tinyufop;


	ArrayList<Planet> moons = new ArrayList<>();
	ArrayList<Planet> planets = new ArrayList<>();
    ArrayList<Planet> ufos = new ArrayList<>();
	ArrayList<Planet> stars = new ArrayList<>();
	
	Random r = new Random();

    @Override
    public void create() {
		
	    int h = Gdx.graphics.getWidth();
	    int w = Gdx.graphics.getHeight();
	
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
       camera.setToOrtho(false, windowWidth, windowHeight);
	   camera.position.set(windowWidth / 2, windowHeight / 2, 0);
       batch = new SpriteBatch();


	//speed test 
	int speed = 0;

	 for (int i = 0; i < 30; i++) {		 
		moons.add(new Planet(batch, element1, element1r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed));
   	} 


	 for (int i = 0; i < 15; i++) {		 
		planets.add(new Planet(batch, element2, element2r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed));
   	} 
	

	for (int i = 0; i < 6; i++) {		 
		stars.add(new Planet(batch, star32, star32r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed));
   	}	
	
	for (int i = 0; i < 6; i++) {		 
		ufos.add(new Planet(batch, tinyufo, tinyufor, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed));
   	}


	 

      //Planet(SpriteBatch batch, Texture image, TextureRegion imager, int x, int y, int xSpeed, int ySpeed)
	  

      alien3p = new Planet(batch, alien3, alien3r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  alien4p = new Planet(batch, alien4, alien4r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  asteroid1p = new Planet(batch, asteroid1, asteroid1r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  asteroid2p = new Planet(batch, asteroid2, asteroid2r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  asteroid3p = new Planet(batch, asteroid3, asteroid3r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  asteroid4p = new Planet(batch, asteroid4, asteroid4r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  asteroid5p = new Planet(batch, asteroid5, asteroid5r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  bluemousep = new Planet(batch, bluemouse, bluemouser, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  
	  element1p = new Planet(batch, element1, element1r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element10p = new Planet(batch, element10, element10r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element11p = new Planet(batch, element11, element11r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element12p = new Planet(batch, element12, element12r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element13p = new Planet(batch, element13, element13r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element14p = new Planet(batch, element14, element14r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element15p = new Planet(batch, element15, element15r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element16p = new Planet(batch, element16, element16r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element17p = new Planet(batch, element17, element17r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element18p = new Planet(batch, element18, element18r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element19p = new Planet(batch, element19, element19r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element2p = new Planet(batch, element2, element2r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  element20p = new Planet(batch, element20, element20r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element21p = new Planet(batch, element21, element21r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element22p = new Planet(batch, element22, element22r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element23p = new Planet(batch, element23, element23r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element24p = new Planet(batch, element24, element24r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element25p = new Planet(batch, element25, element25r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element26p = new Planet(batch, element26, element26r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element27p = new Planet(batch, element27, element27r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element28p = new Planet(batch, element28, element28r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element29p = new Planet(batch, element29, element29r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element3p = new Planet(batch, element3, element3r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  element30p = new Planet(batch, element30, element30r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element31p = new Planet(batch, element31, element31r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element4p = new Planet(batch, element4, element4r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  element5p = new Planet(batch, element5, element5r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  element6p = new Planet(batch, element6, element6r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  element7p = new Planet(batch, element7, element7r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  element8p = new Planet(batch, element8, element8r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  element9p = new Planet(batch, element9, element9r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  fireflyp = new Planet(batch, firefly, fireflyr, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  largemoonp = new Planet(batch, largemoon, largemoonr, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  lightp = new Planet(batch, light, lightr, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  lightoffp = new Planet(batch, lightoff, lightoffr, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);  
	  lightonp = new Planet(batch, lighton, lightonr, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  moonp = new Planet(batch, moon, moonr, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  pixelflyp = new Planet(batch, pixelfly, pixelflyr, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  
	  planet1p = new Planet(batch, planet1, planet1r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  planet10p = new Planet(batch, planet10, planet10r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  planet11p = new Planet(batch, planet11, planet11r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  planet12p = new Planet(batch, planet12, planet12r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  planet13p = new Planet(batch, planet13, planet13r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  planet2p = new Planet(batch, planet2, planet2r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  planet3p = new Planet(batch, planet3, planet3r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  planet4p = new Planet(batch, planet4, planet4r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  planet5p = new Planet(batch, planet5, planet5r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  planet6p = new Planet(batch, planet6, planet6r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  planet7p = new Planet(batch, planet7, planet7r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  planet8p = new Planet(batch, planet8, planet8r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  planet9p = new Planet(batch, planet9, planet9r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);
	  
	  star32p = new Planet(batch, star32, star32r, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed); 
	  tinyufop = new Planet(batch, tinyufo, tinyufor, MathUtils.random(0, windowWidth + 150), MathUtils.random(0, windowHeight + 150), speed, speed);


    }

    @Override
    public void render() {
        
		ScreenUtils.clear(0, 0, 0, 1);
		camera.update();
        batch.setProjectionMatrix(camera.combined);
	  
		
		batch.begin();
	    batch.enableBlending();
	    //background
	    batch.draw(background, 0, 0, windowWidth, windowHeight);
		
	

		for (Planet moon : moons) {
		moon.update(element1);
		moon.draw(batch, element1, element1r);
		}

		for (Planet planet : planets) {
		planet.update(element2);
		planet.draw(batch, element2, element2r);
		}		

		for (Planet star : stars) {
		star.update(star32);
		star.draw(batch, star32, star32r);
		}

		for (Planet ufo : ufos) {
		ufo.update(tinyufo);
		ufo.draw(batch, tinyufo, tinyufor);
		}
		
		//misc stuff
        alien3p.update(alien3);
        alien3p.draw(batch, alien3, alien3r);

        alien4p.update(alien4);
        alien4p.draw(batch, alien4, alien4r);		

        asteroid1p.update(asteroid1);
        asteroid1p.draw(batch, asteroid1, asteroid1r);

        asteroid2p.update(asteroid2);
        asteroid2p.draw(batch, asteroid2, asteroid2r);
		
		asteroid3p.update(asteroid3);
        asteroid3p.draw(batch, asteroid3, asteroid3r);

        asteroid4p.update(asteroid4);
        asteroid4p.draw(batch, asteroid4, asteroid4r);
		
        asteroid5p.update(asteroid5);
        asteroid5p.draw(batch, asteroid5, asteroid5r);

        bluemousep.update(bluemouse);
        bluemousep.draw(batch, bluemouse, bluemouser);		

				

		batch.end();
		
		
    }

}
