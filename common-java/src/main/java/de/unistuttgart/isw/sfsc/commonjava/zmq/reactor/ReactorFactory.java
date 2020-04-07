package de.unistuttgart.isw.sfsc.commonjava.zmq.reactor;

import de.unistuttgart.isw.sfsc.commonjava.zmq.reactor.java.JmqReactor;
import de.unistuttgart.isw.sfsc.commonjava.zmq.reactor.jni.JniReactor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReactorFactory {

  private static final Logger logger = LoggerFactory.getLogger(ReactorFactory.class);
  static final boolean useNative;

  static {
    boolean useNativeTemp;
    try {
      System.loadLibrary("zmqLoopLib");
      System.loadLibrary("jniZmq");
      useNativeTemp = true;
    } catch (UnsatisfiedLinkError e) {
      e.printStackTrace(); //todo
      useNativeTemp = false;
    }
    useNative = useNativeTemp;
    logger.info("using native lib: " + useNative);
  }

  public static Reactor create(ContextConfiguration contextConfiguration) throws InterruptedException {
    return useNative ? JniReactor.create() : JmqReactor.create(contextConfiguration); //todo use in native
  }
}