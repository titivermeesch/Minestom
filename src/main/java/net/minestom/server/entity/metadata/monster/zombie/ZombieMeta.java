package net.minestom.server.entity.metadata.monster.zombie;

import net.minestom.server.collision.BoundingBox;
import net.minestom.server.entity.Entity;
import net.minestom.server.entity.Metadata;
import net.minestom.server.entity.metadata.monster.MonsterMeta;
import org.jetbrains.annotations.NotNull;

public class ZombieMeta extends MonsterMeta {

    public ZombieMeta(@NotNull Entity entity, @NotNull Metadata metadata) {
        super(entity, metadata);
    }

    public boolean isBaby() {
        return super.metadata.getIndex((byte) 15, false);
    }

    public void setBaby(boolean value) {
        if (isBaby() == value) {
            return;
        }
        BoundingBox bb = this.entity.getBoundingBox();
        if (value) {
            setBoundingBox(bb.getWidth() / 2, bb.getHeight() / 2);
        } else {
            setBoundingBox(bb.getWidth() * 2, bb.getHeight() * 2);
        }
        super.metadata.setIndex((byte) 15, Metadata.Boolean(value));
    }

    public boolean isBecomingDrowned() {
        return super.metadata.getIndex((byte) 17, false);
    }

    public void setBecomingDrowned(boolean value) {
        super.metadata.setIndex((byte) 17, Metadata.Boolean(value));
    }

}
