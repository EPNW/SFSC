package servicepatterns.api;

import de.unistuttgart.isw.sfsc.commonjava.util.NotThrowingAutoCloseable;

public interface SfscSubscriber extends NotThrowingAutoCloseable {

  @Override
  void close();

}
