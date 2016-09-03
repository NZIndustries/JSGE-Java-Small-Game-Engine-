/*
Сам "уровень"
*/
package com.java.game;
import java.awt.*;
public class MainScene extends Scene {
    public MainScene(Game game) {
        super(game);
    }
    @Override
    public void update(long nanosPassed) {
    
    }
    @Override
    public void draw(Graphics2D g) {//устанавливает шрифт и рисует этим шрифтом фразу
        g.setFont(new Font("Default", Font.BOLD, 30));
        g.drawString("Работает!", 64, 64);
    }
}