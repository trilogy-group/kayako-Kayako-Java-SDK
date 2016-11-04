package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.base.parser.Resource;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/09/16
 */
public class Locale implements Resource {

    private long id;
    private String locale;
    private String name;
    private String nativeName;
    private String region;
    private String nativeRegion;
    private boolean isPublic;
    private boolean isLocalized;
    private String direction;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public boolean isLocalized() {
        return isLocalized;
    }

    public void setLocalized(boolean isLocalized) {
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
