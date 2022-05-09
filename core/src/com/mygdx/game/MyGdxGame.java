package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {

	ShapeRenderer renderer;
	Input.Keys keys;

	@Override
	public void create () {
		renderer = new ShapeRenderer(5000);
		keys = new Input.Keys();
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		renderer.begin(ShapeRenderer.ShapeType.Filled);
		renderer.circle(50,50,25);
		if(Gdx.input.isKeyPressed(Input.Keys.A))
			renderer.circle(100,50,25);
		renderer.end();
	}
	
	@Override
	public void dispose () {

	}
}
