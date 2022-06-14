package tech.w3n.draft.rfrissue.vo;


import java.time.ZoneId;
import javax.validation.constraints.NotNull;

public class RetrieveUserVO {
    private String id;
    @NotNull
    private ZoneId zoneId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ZoneId getZoneId() {
        return zoneId;
    }

    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }
}
