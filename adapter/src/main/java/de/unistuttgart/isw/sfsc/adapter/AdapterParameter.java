package de.unistuttgart.isw.sfsc.adapter;

import java.util.Objects;

public class AdapterParameter {
  private final String adapterId;

  private final String coreHost;
  private final int corePort;

  private final int controlTimeoutMs;
  private final int heartbeatSendRateMs;
  private final int heartbeatDeadlineIncomingMs;
  private final int registryPollingRateMs;

  private final String bootstrapCoreTopic;
  private final String handshakeCoreTopic;
  private final String handshakeAdapterTopic;
  private final String heartbeatCoreTopic;
  private final String heartbeatAdapterTopic;
  private final String registryCoreQueryTopic;
  private final String registryCoreCommandTopic;
  private final String registryCoreEventTopic;
  private final String registryAdapterQueryTopic;
  private final String registryAdapterCommandTopic;

  public AdapterParameter(String adapterId, String coreHost, int corePort, int controlTimeoutMs, int heartbeatSendRateMs,
      int heartbeatDeadlineIncomingMs, int registryPollingRateMs, String bootstrapCoreTopic, String handshakeCoreTopic,
      String handshakeAdapterTopic, String heartbeatCoreTopic, String heartbeatAdapterTopic, String registryCoreQueryTopic,
      String registryCoreCommandTopic, String registryCoreEventTopic, String registryAdapterQueryTopic,
      String registryAdapterCommandTopic) {
    Objects.requireNonNull(this.adapterId = adapterId);
    Objects.requireNonNull(this.coreHost = coreHost);
    this.corePort = corePort;
    this.controlTimeoutMs = controlTimeoutMs;
    this.heartbeatSendRateMs = heartbeatSendRateMs;
    this.heartbeatDeadlineIncomingMs = heartbeatDeadlineIncomingMs;
    this.registryPollingRateMs = registryPollingRateMs;
    Objects.requireNonNull(this.bootstrapCoreTopic = bootstrapCoreTopic);
    Objects.requireNonNull(this.handshakeCoreTopic = handshakeCoreTopic);
    Objects.requireNonNull(this.handshakeAdapterTopic = handshakeAdapterTopic);
    Objects.requireNonNull(this.heartbeatCoreTopic = heartbeatCoreTopic);
    Objects.requireNonNull(this.heartbeatAdapterTopic = heartbeatAdapterTopic);
    Objects.requireNonNull(this.registryCoreQueryTopic = registryCoreQueryTopic);
    Objects.requireNonNull(this.registryCoreCommandTopic = registryCoreCommandTopic);
    Objects.requireNonNull(this.registryCoreEventTopic = registryCoreEventTopic);
    Objects.requireNonNull(this.registryAdapterQueryTopic = registryAdapterQueryTopic);
    Objects.requireNonNull(this.registryAdapterCommandTopic = registryAdapterCommandTopic);
  }

  public String getCoreHost() {
    return coreHost;
  }

  public int getCorePort() {
    return corePort;
  }

  public String getAdapterId() {
    return adapterId;
  }

  public int getControlTimeoutMs() {
    return controlTimeoutMs;
  }

  public int getHeartbeatSendRateMs() {
    return heartbeatSendRateMs;
  }

  public int getHeartbeatDeadlineIncomingMs() {
    return heartbeatDeadlineIncomingMs;
  }

  public int getRegistryPollingRateMs() {
    return registryPollingRateMs;
  }

  public String getBootstrapCoreTopic() {
    return bootstrapCoreTopic;
  }

  public String getHandshakeCoreTopic() {
    return handshakeCoreTopic;
  }

  public String getHandshakeAdapterTopic() {
    return handshakeAdapterTopic;
  }

  public String getHeartbeatCoreTopic() {
    return heartbeatCoreTopic;
  }

  public String getHeartbeatAdapterTopic() {
    return heartbeatAdapterTopic;
  }

  public String getRegistryCoreQueryTopic() {
    return registryCoreQueryTopic;
  }

  public String getRegistryCoreCommandTopic() {
    return registryCoreCommandTopic;
  }

  public String getRegistryCoreEventTopic() {
    return registryCoreEventTopic;
  }

  public String getRegistryAdapterQueryTopic() {
    return registryAdapterQueryTopic;
  }

  public String getRegistryAdapterCommandTopic() {
    return registryAdapterCommandTopic;
  }
}
