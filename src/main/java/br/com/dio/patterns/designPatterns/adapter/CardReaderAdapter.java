package br.com.dio.patterns.designPatterns.adapter;

public class CardReaderAdapter implements USB {

    private final MemoryCard memoryCard;

    public CardReaderAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsbCable() {
        memoryCard.readData();
    }
}
