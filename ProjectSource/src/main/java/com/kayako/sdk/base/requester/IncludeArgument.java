package com.kayako.sdk.base.requester;

import java.util.*;

/**
 * This class has been created separately because it defines the relationship between the requester and parser classes.
 * The parser class expects certain resources to be included in the response which the requester will be passing forward.
 * <p>
 * Note: IncludeArgument should include itself.
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public abstract class IncludeArgument {

    private static final String COMMA = ",";

    private Set<String> resources; // resources to include

    /**
     * @param resources as a String array
     */
    public IncludeArgument(String[] resources) {
        this.resources = new HashSet<>(Arrays.asList(resources));
    }

    /**
     * @param resources as a Set
     */
    public IncludeArgument(Set<String> resources) {
        this.resources = resources;
    }

    public void append(Set<String> newResources) {
        resources.addAll(newResources);
    }

    public void append(IncludeArgument includeArgument) {
        resources.addAll(includeArgument.getResources());
    }

    @Override
    public String toString() {
        if (resources == null || resources.size() == 0) {
            return ""; // Blank
        }

        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = resources.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next());

            // Add comma only if there is another resource after
            if (iterator.hasNext()) {
                stringBuilder.append(COMMA);
            }
        }

        return stringBuilder.toString();
    }

    public Set<String> getResources() {
        return resources;
    }
}
