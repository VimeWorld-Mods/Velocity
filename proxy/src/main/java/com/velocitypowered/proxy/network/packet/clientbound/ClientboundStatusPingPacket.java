package com.velocitypowered.proxy.network.packet.clientbound;

import com.velocitypowered.proxy.network.packet.AbstractStatusPingPacket;
import com.velocitypowered.proxy.network.packet.Packet;
import com.velocitypowered.proxy.network.packet.PacketHandler;
import com.velocitypowered.proxy.network.packet.PacketReader;

public class ClientboundStatusPingPacket extends AbstractStatusPingPacket implements Packet {
  public static final PacketReader<ClientboundStatusPingPacket> DECODER = decoder(ClientboundStatusPingPacket::new);

  public ClientboundStatusPingPacket(final long randomId) {
    super(randomId);
  }

  @Override
  public boolean handle(PacketHandler handler) {
    return handler.handle(this);
  }
}