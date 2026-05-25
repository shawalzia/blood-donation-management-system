package com.example.demo11;

import java.io.Serializable;
import java.util.Objects;
public class BloodGroup implements Serializable {
    private String type;
    private String rhFactor;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getRhFactor() {
        return rhFactor;
    }
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
    public BloodGroup(String type, String rhFactor) {
        this.type = type;
        this.rhFactor = rhFactor;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BloodGroup that = (BloodGroup) o;
        return Objects.equals(type, that.type) && Objects.equals(rhFactor,
                that.rhFactor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, rhFactor);
    }
}
