/*
Ввод
*/
package com.java.game;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
public class Input implements KeyListener {//нажатие клавиши
    private final Collection<KeyEvent> keyPressedEvents;
    private final Collection<KeyEvent> keyReleasedEvents;
    public Input() {
        keyPressedEvents = new ArrayList<KeyEvent>();
        keyReleasedEvents = new ArrayList<KeyEvent>();
    }
    @Override
    public void keyTyped(KeyEvent event) {
    }
    @Override
    public synchronized void keyPressed(KeyEvent event) {//когда пользователь нажал клавишу
        keyPressedEvents.add(event);
    }
    public synchronized Collection<KeyEvent> getKeyPressedEvents() {//сохраняем в коллекцию
        Collection<KeyEvent> events = new ArrayList<KeyEvent>(keyPressedEvents);
        keyPressedEvents.clear();
        return events;
    }
    @Override
    public synchronized void keyReleased(KeyEvent event) {//когда пользователь отпустил клавишу
        keyReleasedEvents.add(event);
    }
    public synchronized Collection<KeyEvent> getKeyReleasedEvents() {//сохраняем в коллекцию
        Collection<KeyEvent> events = new ArrayList<KeyEvent>(keyReleasedEvents);
        keyReleasedEvents.clear();
        return events;
    }
}