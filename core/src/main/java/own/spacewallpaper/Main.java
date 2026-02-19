package own.spacewallpaper;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;

import java.util.ArrayList;
import java.util.Random;

public class Main extends ApplicationAdapter {


	int windowWidth = 1080;
	int windowHeight = 800;
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



	SpriteBatch batch;
	OrthographicCamera camera;
	FitViewport viewport;

    ArrayList<Planet> alien3s = new ArrayList<>();
    ArrayList<Planet> alien4s = new ArrayList<>();
    ArrayList<Planet> asteroid1s = new ArrayList<>();
    ArrayList<Planet> asteroid2s = new ArrayList<>();
    ArrayList<Planet> asteroid3s = new ArrayList<>();
    ArrayList<Planet> asteroid4s = new ArrayList<>();
    ArrayList<Planet> asteroid5s = new ArrayList<>();
    ArrayList<Planet> bluemouses = new ArrayList<>();
    ArrayList<Planet> element1s = new ArrayList<>();
    ArrayList<Planet> element10s = new ArrayList<>();
    ArrayList<Planet> element11s = new ArrayList<>();
    ArrayList<Planet> element12s = new ArrayList<>();
    ArrayList<Planet> element13s = new ArrayList<>();
    ArrayList<Planet> element14s = new ArrayList<>();
    ArrayList<Planet> element15s = new ArrayList<>();
    ArrayList<Planet> element16s = new ArrayList<>();
    ArrayList<Planet> element17s = new ArrayList<>();
    ArrayList<Planet> element18s = new ArrayList<>();
    ArrayList<Planet> element19s = new ArrayList<>();
    ArrayList<Planet> element2s = new ArrayList<>();
    ArrayList<Planet> element20s = new ArrayList<>();
    ArrayList<Planet> element21s = new ArrayList<>();
    ArrayList<Planet> element22s = new ArrayList<>();
    ArrayList<Planet> element23s = new ArrayList<>();
    ArrayList<Planet> element24s = new ArrayList<>();
    ArrayList<Planet> element25s = new ArrayList<>();
    ArrayList<Planet> element26s = new ArrayList<>();
    ArrayList<Planet> element27s = new ArrayList<>();
    ArrayList<Planet> element28s = new ArrayList<>();
    ArrayList<Planet> element29s = new ArrayList<>();
    ArrayList<Planet> element3s = new ArrayList<>();
    ArrayList<Planet> element30s = new ArrayList<>();
    ArrayList<Planet> element31s = new ArrayList<>();
    ArrayList<Planet> element4s = new ArrayList<>();
    ArrayList<Planet> element5s = new ArrayList<>();
    ArrayList<Planet> element6s = new ArrayList<>();
    ArrayList<Planet> element7s = new ArrayList<>();
    ArrayList<Planet> element8s = new ArrayList<>();
    ArrayList<Planet> element9s = new ArrayList<>();
    ArrayList<Planet> fireflys = new ArrayList<>();
    ArrayList<Planet> largemoons = new ArrayList<>();
    ArrayList<Planet> lights = new ArrayList<>();
    ArrayList<Planet> lightoffs = new ArrayList<>();
    ArrayList<Planet> lightons = new ArrayList<>();
    ArrayList<Planet> moons = new ArrayList<>();
    ArrayList<Planet> pixelflys = new ArrayList<>();
    ArrayList<Planet> planet1s = new ArrayList<>();
    ArrayList<Planet> planet10s = new ArrayList<>();
    ArrayList<Planet> planet11s = new ArrayList<>();
    ArrayList<Planet> planet12s = new ArrayList<>();
    ArrayList<Planet> planet13s = new ArrayList<>();
    ArrayList<Planet> planet2s = new ArrayList<>();
    ArrayList<Planet> planet3s = new ArrayList<>();
    ArrayList<Planet> planet4s = new ArrayList<>();
    ArrayList<Planet> planet5s = new ArrayList<>();
    ArrayList<Planet> planet6s = new ArrayList<>();
    ArrayList<Planet> planet7s = new ArrayList<>();
    ArrayList<Planet> planet8s = new ArrayList<>();
    ArrayList<Planet> planet9s = new ArrayList<>();
    ArrayList<Planet> star32s = new ArrayList<>();
    ArrayList<Planet> tinyufos = new ArrayList<>();

    @Override
    public void create() {

		background = new Texture("background-test.png");
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
       camera = new OrthographicCamera(windowWidth, windowHeight);
	   viewport = new FitViewport(1080, 800, camera);
       batch = new SpriteBatch();


	//speed test
	int speed = 0;


	 for (int i = 0; i < 60; i++) {
		element1s.add(new Planet(batch, element1, element1r));
   	 }
     for (int i = 0; i < 15; i++) {
         element2s.add(new Planet(batch, element2, element2r));
     }
     for (int i = 0; i < 5; i++) {
         element3s.add(new Planet(batch, element3, element3r));
     }
     for (int i = 0; i < 5; i++) {
         element4s.add(new Planet(batch, element4, element4r));
     }
     for (int i = 0; i < 5; i++) {
         element5s.add(new Planet(batch, element5, element5r));
     }
     for (int i = 0; i < 5; i++) {
         element6s.add(new Planet(batch, element6, element6r));
     }
     for (int i = 0; i < 5; i++) {
         element7s.add(new Planet(batch, element7, element7r));
     }
     for (int i = 0; i < 5; i++) {
         element8s.add(new Planet(batch, element8, element8r));
     }
     for (int i = 0; i < 5; i++) {
         element9s.add(new Planet(batch, element9, element9r));
     }
     for (int i = 0; i < 5; i++) {
         element10s.add(new Planet(batch, element10, element10r));
     }
     for (int i = 0; i < 5; i++) {
         element10s.add(new Planet(batch, element11, element11r));
     }
     for (int i = 0; i < 5; i++) {
         element10s.add(new Planet(batch, element12, element12r));
     }
     for (int i = 0; i < 5; i++) {
         element10s.add(new Planet(batch, element13, element13r));
     }
     for (int i = 0; i < 5; i++) {
         element10s.add(new Planet(batch, element14, element14r));
     }
     for (int i = 0; i < 5; i++) {
         element10s.add(new Planet(batch, element15, element15r));
     }
     for (int i = 0; i < 5; i++) {
         element10s.add(new Planet(batch, element16, element16r));
     }
     for (int i = 0; i < 3; i++) {
         bluemouses.add(new Planet(batch, bluemouse, bluemouser));
     }

     for (int i = 0; i < 3; i++) {
         star32s.add(new Planet(batch, star32, star32r));
     }
     for (int i = 0; i < 3; i++) {
         moons.add(new Planet(batch, moon, moonr));
     }
     for (int i = 0; i < 3; i++) {
         fireflys.add(new Planet(batch, firefly, fireflyr));
     }
     for (int i = 0; i < 3; i++) {
         lights.add(new Planet(batch, light, lightr));
     }
     for (int i = 0; i < 3; i++) {
         lightons.add(new Planet(batch, lighton, lightonr));
     }
     for (int i = 0; i < 3; i++) {
         lightoffs.add(new Planet(batch, lightoff, lightoffr));
     }
     for (int i = 0; i < 3; i++) {
         pixelflys.add(new Planet(batch, pixelfly, pixelflyr));
     }


	for (int i = 0; i < 3; i++) {
		tinyufos.add(new Planet(batch, tinyufo, tinyufor));
   	}
    for (int i = 0; i < 3; i++) {
        alien3s.add(new Planet(batch, alien3, alien3r));
    }
    for (int i = 0; i < 3; i++) {
        alien4s.add(new Planet(batch, alien4, alien4r));
    }

    for (int i = 0; i < 2; i++) {
        asteroid1s.add(new Planet(batch, asteroid1, asteroid1r));
    }
    for (int i = 0; i < 2; i++) {
        asteroid1s.add(new Planet(batch, asteroid2, asteroid2r));
    }
    for (int i = 0; i < 2; i++) {
        asteroid1s.add(new Planet(batch, asteroid3, asteroid3r));
    }
    for (int i = 0; i < 2; i++) {
        asteroid1s.add(new Planet(batch, asteroid4, asteroid4r));
    }
    for (int i = 0; i < 2; i++) {
        asteroid1s.add(new Planet(batch, asteroid5, asteroid5r));
    }

    }

	@Override
	public void resize(int width, int height) {
		viewport.update(width, height, true);
		batch.setProjectionMatrix(camera.combined);
	}


    @Override
    public void render() {

		ScreenUtils.clear(0, 0, 0, 1);
		camera.update();
        batch.setProjectionMatrix(camera.combined);


		batch.begin();
	    batch.enableBlending();
	    batch.draw(background, 0, 0, windowWidth, windowHeight);



        for (Planet element : element1s) {
		    element.update();
		    element.draw(batch, element1r);
		}
		for (Planet element : element2s) {
		    element.update();
		    element.draw(batch, element2r);
		}
        for (Planet element : element3s) {
            element.update();
            element.draw(batch, element3r);
        }
        for (Planet element : element4s) {
            element.update();
            element.draw(batch, element4r);
        }
        for (Planet element : element5s) {
            element.update();
            element.draw(batch, element5r);
        }
        for (Planet element : element6s) {
            element.update();
            element.draw(batch, element6r);
        }
        for (Planet element : element7s) {
            element.update();
            element.draw(batch, element7r);
        }
        for (Planet element : element8s) {
            element.update();
            element.draw(batch, element8r);
        }
        for (Planet element : element9s) {
            element.update();
            element.draw(batch, element9r);
        }
        for (Planet element : element10s) {
            element.update();
            element.draw(batch, element10r);
        }
        for (Planet element : element11s) {
            element.update();
            element.draw(batch, element11r);
        }
        for (Planet element : element12s) {
            element.update();
            element.draw(batch, element12r);
        }
        for (Planet element : element13s) {
            element.update();
            element.draw(batch, element13r);
        }
        for (Planet element : element14s) {
            element.update();
            element.draw(batch, element14r);
        }
        for (Planet element : element15s) {
            element.update();
            element.draw(batch, element15r);
        }
        for (Planet element : element16s) {
            element.update();
            element.draw(batch, element16r);
        }

        for (Planet pixel : bluemouses) {
            pixel.update();
            pixel.draw(batch, bluemouser);
        }
        for (Planet pixel : star32s) {
            pixel.update();
            pixel.draw(batch, star32r);
        }
        for (Planet pixel : moons) {
            pixel.update();
            pixel.draw(batch, moonr);
        }
        for (Planet pixel : fireflys) {
            pixel.update();
            pixel.draw(batch, fireflyr);
        }
        for (Planet pixel : lights) {
            pixel.update();
            pixel.draw(batch, lightr);
        }
        for (Planet pixel : lightons) {
            pixel.update();
            pixel.draw(batch, lightonr);
        }
        for (Planet pixel : lightoffs) {
            pixel.update();
            pixel.draw(batch, lightoffr);
        }
        for (Planet pixel : pixelflys) {
            pixel.update();
            pixel.draw(batch, pixelflyr);
        }

		for (Planet ufo : tinyufos) {
		    ufo.update();
		    ufo.draw(batch, tinyufor);
		}
        for (Planet alien3 : alien3s) {
            alien3.update();
            alien3.draw(batch, alien3r);
        }
        for (Planet alien4 : alien4s) {
            alien4.update();
            alien4.draw(batch, alien4r);
        }


        for (Planet asteroid : asteroid1s) {
            asteroid.update();
            asteroid.draw(batch, asteroid1r);
        }
        for (Planet asteroid : asteroid2s) {
            asteroid.update();
            asteroid.draw(batch, asteroid2r);
        }
        for (Planet asteroid : asteroid3s) {
            asteroid.update();
            asteroid.draw(batch, asteroid3r);
        }
        for (Planet asteroid : asteroid4s) {
            asteroid.update();
            asteroid.draw(batch, asteroid4r);
        }
        for (Planet asteroid : asteroid5s) {
            asteroid.update();
            asteroid.draw(batch, asteroid5r);
        }

		batch.end();


    }

}
