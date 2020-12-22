package com.sap.mervyn.spring.soundsystem;

public interface CompactDisc {

    void play();

    default void playTrack(int trackNumber) {}

}
