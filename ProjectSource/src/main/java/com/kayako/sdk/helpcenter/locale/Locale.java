package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.base.parser.Resource;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/09/16
 */
public class Locale implements Resource {

    private Long id;
    private String locale;
    private String name;
    private String nativeName;
    private String region;
    private String nativeRegion;
    private Boolean isPublic;
    private Boolean isLocalized;
    private String direction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNativeRegion() {
        return nativeRegion;
    }

    public void setNativeRegion(String nativeRegion) {
        this.nativeRegion = nativeRegion;
    }

    public Boolean isPublic() {
        return isPublic;
    }

    public void setPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean isLocalized() {
        return isLocalized;
    }

    public void setLocalized(Boolean isLocalized) {
        this.isLocalized = isLocalized;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Locale{" +
                "id=" + id +
                ", locale='" + locale + '\'' +
                ", name='" + name + '\'' +
                ", nativeName='" + nativeName + '\'' +
                ", region='" + region + '\'' +
                ", nativeRegion='" + nativeRegion + '\'' +
                ", isPublic=" + isPublic +
                ", isLocalized=" + isLocalized +
                ", direction='" + direction + '\'' +
                '}';
    }
}
