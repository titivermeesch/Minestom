package fr.themode.minestom.net.packet.server.play;

import fr.themode.minestom.net.packet.PacketWriter;
import fr.themode.minestom.net.packet.server.ServerPacket;
import fr.themode.minestom.net.packet.server.ServerPacketIdentifier;

public class ConfirmTransactionPacket implements ServerPacket {

    public int windowId;
    public short actionNumber;
    public boolean accepted;

    @Override
    public void write(PacketWriter writer) {
        writer.writeVarInt(windowId);
        writer.writeShort(actionNumber);
        writer.writeBoolean(accepted);
    }

    @Override
    public int getId() {
        return ServerPacketIdentifier.WINDOW_CONFIRMATION;
    }
}