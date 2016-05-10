package com.froad.beans;

// Generated 2014-8-4 9:40:50 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RckflowId generated by hbm2java
 */
@Embeddable
public class RckflowId implements java.io.Serializable {

    private String rcktype;
    private int rckorder;

    public RckflowId() {
    }

    public RckflowId(String rcktype, int rckorder) {
        this.rcktype = rcktype;
        this.rckorder = rckorder;
    }

    @Column(name = "RCKTYPE", nullable = false, length = 20)
    public String getRcktype() {
        return this.rcktype;
    }

    public void setRcktype(String rcktype) {
        this.rcktype = rcktype;
    }

    @Column(name = "RCKORDER", nullable = false, precision = 9, scale = 0)
    public int getRckorder() {
        return this.rckorder;
    }

    public void setRckorder(int rckorder) {
        this.rckorder = rckorder;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof RckflowId))
            return false;
        RckflowId castOther = (RckflowId) other;

        return ((this.getRcktype() == castOther.getRcktype()) || (this
                .getRcktype() != null && castOther.getRcktype() != null && this
                .getRcktype().equals(castOther.getRcktype())))
                && (this.getRckorder() == castOther.getRckorder());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result
                + (getRcktype() == null ? 0 : this.getRcktype().hashCode());
        result = 37 * result + this.getRckorder();
        return result;
    }

}
