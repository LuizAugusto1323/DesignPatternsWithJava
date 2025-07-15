package br.com.dio.patterns.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o) {
        observers.add(o);
    }

    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    public void notifyAllObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}
