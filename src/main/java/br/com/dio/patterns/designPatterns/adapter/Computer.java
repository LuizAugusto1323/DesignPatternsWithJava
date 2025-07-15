package br.com.dio.patterns.designPatterns.adapter;

public class Computer {

    public void readData(USB usb) {
        usb.connectWithUsbCable();
    }

}
