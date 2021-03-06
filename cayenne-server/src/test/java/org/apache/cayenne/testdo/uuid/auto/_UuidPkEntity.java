package org.apache.cayenne.testdo.uuid.auto;

import java.util.UUID;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _UuidPkEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UuidPkEntity extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<UUID> ID = Property.create("id", UUID.class);

    public void setId(UUID id) {
        writeProperty("id", id);
    }
    public UUID getId() {
        return (UUID)readProperty("id");
    }

}
