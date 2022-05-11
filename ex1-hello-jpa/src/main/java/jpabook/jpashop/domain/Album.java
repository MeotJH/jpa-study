package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Album extends Item {

    private String artits;

    private String etc;

    public String getArtits() {
        return artits;
    }

    public void setArtits(String artits) {
        this.artits = artits;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

}
