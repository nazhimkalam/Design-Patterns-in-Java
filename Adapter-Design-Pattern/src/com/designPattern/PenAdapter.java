package com.designPattern;

public class PenAdapter implements Pen{

    PilotPen pp = new PilotPen();    // WE HAVE THE PILOT PEN CLASS, THEN WE USE THAT PILOT PEN TO WRITE OR USE THE PILOT PEN METHOD/S

    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
