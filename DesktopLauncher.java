/*
Лаунчер
*/
package com.java.game;
import java.awt.*;
public class DesktopLauncher {
    public static void main(String[] args) {
        Game game = DesktopGameBuilder.build(new Dimension(640, 480));
        game.setScene(new MainScene(game));
        game.start();
    }
}