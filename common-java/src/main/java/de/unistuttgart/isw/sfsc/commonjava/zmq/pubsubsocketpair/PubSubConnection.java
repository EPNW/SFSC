package de.unistuttgart.isw.sfsc.commonjava.zmq.pubsubsocketpair;

import com.google.protobuf.Message;
import de.unistuttgart.isw.sfsc.commonjava.zmq.reactor.ReactiveSocket.Inbox;
import de.unistuttgart.isw.sfsc.commonjava.zmq.reactor.ReactiveSocket.Outbox;

public interface PubSubConnection {

  Publisher publisher();

  Inbox dataInbox();

  SubscriptionManager subscriptionManager();

  Inbox subEventInbox();

  interface SubscriptionManager {

    void subscribe(byte[] topic);

    void subscribe(String topic);

    void unsubscribe(byte[] topic);

    void unsubscribe(String topic);

    Outbox outbox();
  }

  interface Publisher {

    void publish(byte[] topic, byte[] data);

    void publish(String topic, byte[] data);

    void publish(byte[] topic, Message data);

    void publish(String topic, Message data);

    Outbox outbox();

  }
}
