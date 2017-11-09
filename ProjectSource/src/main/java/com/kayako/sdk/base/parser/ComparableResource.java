package com.kayako.sdk.base.parser;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 29/03/17
 */
public abstract class ComparableResource implements Resource {

    public abstract String getIdentifier();

    @Override
    public int hashCode() {
        return getIdentifier().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        try {
            return obj.getClass() == getClass()
                    && getIdentifier().equals(((ComparableResource) obj).getIdentifier());
        } catch (Exception e) {
            return false;
        }
    }

}
