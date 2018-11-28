package com.rocoman.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.rocoman.game.Screens.PlayScreen;

public class Rocoman extends Game {
	public  static final int V_WIDTH = 400;
	public  static final int V_HEITGHT = 208;
	public SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new PlayScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}
}
