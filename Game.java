package com.java.game;
import java.awt.*;
public interface Game {
    void start();//думаю понятно, что это
    void pause();//пауза
    Dimension getScreenSize();
    Input getInput();//получаем объект, который хранит все пользовательские манипуляции с контроллерами
    void setScene(Scene scene);//меняет текущую сцену
}
