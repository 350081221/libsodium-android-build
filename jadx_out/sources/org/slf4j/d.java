package org.slf4j;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes4.dex */
public interface d extends Serializable {
    public static final String ANY_MARKER = "*";
    public static final String ANY_NON_NULL_MARKER = "+";

    void add(d dVar);

    boolean contains(String str);

    boolean contains(d dVar);

    boolean equals(Object obj);

    String getName();

    boolean hasChildren();

    boolean hasReferences();

    int hashCode();

    Iterator iterator();

    boolean remove(d dVar);
}
