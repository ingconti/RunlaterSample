package com.example.runlatersample;

import javafx.application.Platform;
import javafx.stage.Stage;

public class MyThread extends Thread {
    Stage stage;

    public MyThread(Stage stage) {
        this.stage = stage;
    }

    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);

            }
            System.out.println(i);
            String t = "tick: " + i;

            //stage.setTitle(t);
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    stage.setTitle(t);
                }
            });

        }
    }
}