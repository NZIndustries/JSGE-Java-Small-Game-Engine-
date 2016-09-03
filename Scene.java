package com.java.game;
import java.awt.*;
public abstract class Scene {
    protected final Game game;
    public Scene(Game game) {
        this.game = game;
    }
    public abstract void update(long nanosPassed);//обновить состояние сцены
    public abstract void draw(Graphics2D g);//собщение сцене, что ей надо перерисовать своё состояние
}
