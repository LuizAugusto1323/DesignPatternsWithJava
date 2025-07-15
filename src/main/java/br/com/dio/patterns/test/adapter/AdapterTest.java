package br.com.dio.patterns.test.adapter;

import br.com.dio.patterns.designPatterns.adapter.CardReaderAdapter;
import br.com.dio.patterns.designPatterns.adapter.Computer;
import br.com.dio.patterns.designPatterns.adapter.MemoryCard;

public class AdapterTest {

    public void initTest() {
        Computer computer = new Computer();
        MemoryCard memoryCard = new MemoryCard();
        CardReaderAdapter cardReaderAdapter = new CardReaderAdapter(memoryCard);

        // computer só entende USB
        computer.readData(cardReaderAdapter);
    }

}
