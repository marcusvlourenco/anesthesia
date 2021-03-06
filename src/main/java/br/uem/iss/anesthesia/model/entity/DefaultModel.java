package br.uem.iss.anesthesia.model.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class DefaultModel implements Serializable, Cloneable, Comparable {

    @Id
    @GeneratedValue
    private Long id;

    public DefaultModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    protected DefaultModel clone() throws CloneNotSupportedException {
        DefaultModel clone = (DefaultModel) super.clone();
        clone.setId(id);
        return clone;
    }

    public boolean isNew() {
        return id == null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
