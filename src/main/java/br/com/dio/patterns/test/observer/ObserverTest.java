package br.com.dio.patterns.test.observer;

import br.com.dio.patterns.designPatterns.observer.EmailObserver;
import br.com.dio.patterns.designPatterns.observer.SMSObserver;
import br.com.dio.patterns.designPatterns.observer.Subject;

public class ObserverTest {
    public void initTest() {
        Subject subject = new Subject();
        EmailObserver emailObserver = new EmailObserver();
        SMSObserver smsObserver = new SMSObserver();

        subject.subscribe(emailObserver);
        subject.subscribe(smsObserver);

        subject.notifyAllObservers("Nova notificacao de evento!");

        subject.unsubscribe(smsObserver);

        subject.notifyAllObservers("Segunda notificacao de evento!");
    }
}
