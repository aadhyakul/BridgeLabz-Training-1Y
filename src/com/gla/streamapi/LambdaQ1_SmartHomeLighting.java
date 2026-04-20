package com.gla.streamapi;
import java.util.function.Consumer;

public class LambdaQ1_SmartHomeLighting {
    public static void main(String[] args) {
        Consumer<String> motion = room -> System.out.println("Motion detected: Lights ON in " + room);
        Consumer<String> night = room -> System.out.println("Night mode: Dim lights in " + room);
        Consumer<String> voice = room -> System.out.println("Voice command: Toggle lights in " + room);

        motion.accept("Hall");
        night.accept("Bedroom");
        voice.accept("Living Room");
    }
}