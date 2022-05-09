package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;


public class MyGdxGame extends ApplicationAdapter {

	ShapeRenderer renderer;
//	Text
	Input.Keys keys;
	GameObject test = new GameObject(120,3);
	int frame;


	@Override
	public void create () {
		renderer = new ShapeRenderer(500000);
		keys = new Input.Keys();

	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);


		renderer.begin(ShapeRenderer.ShapeType.Line);
		renderer.polygon(PolyTools.shift(test.toPolygon(100),425,425));
		frame++;
		renderer.end();
	}
	
	@Override
	public void dispose () {

	}
}
