package org.slf4j.helpers;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* loaded from: classes4.dex */
public class b implements org.slf4j.d {
    private static String CLOSE = " ]";
    private static String OPEN = "[ ";
    private static String SEP = ", ";
    private static final long serialVersionUID = 1803952589649545191L;
    private final String name;
    private List refereceList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str) {
        if (str != null) {
            this.name = str;
            return;
        }
        throw new IllegalArgumentException("A marker name cannot be null");
    }

    @Override // org.slf4j.d
    public synchronized void add(org.slf4j.d dVar) {
        if (dVar != null) {
            if (contains(dVar)) {
                return;
            }
            if (dVar.contains(this)) {
                return;
            }
            if (this.refereceList == null) {
                this.refereceList = new Vector();
            }
            this.refereceList.add(dVar);
            return;
        }
        throw new IllegalArgumentException("A null value cannot be added to a Marker as reference.");
    }

    @Override // org.slf4j.d
    public boolean contains(org.slf4j.d dVar) {
        if (dVar != null) {
            if (equals(dVar)) {
                return true;
            }
            if (hasReferences()) {
                for (int i5 = 0; i5 < this.refereceList.size(); i5++) {
                    if (((org.slf4j.d) this.refereceList.get(i5)).contains(dVar)) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("Other cannot be null");
    }

    @Override // org.slf4j.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof org.slf4j.d)) {
            return false;
        }
        return this.name.equals(((org.slf4j.d) obj).getName());
    }

    @Override // org.slf4j.d
    public String getName() {
        return this.name;
    }

    @Override // org.slf4j.d
    public boolean hasChildren() {
        return hasReferences();
    }

    @Override // org.slf4j.d
    public synchronized boolean hasReferences() {
        boolean z4;
        List list = this.refereceList;
        if (list != null) {
            if (list.size() > 0) {
                z4 = true;
            }
        }
        z4 = false;
        return z4;
    }

    @Override // org.slf4j.d
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override // org.slf4j.d
    public synchronized Iterator iterator() {
        List list = this.refereceList;
        if (list != null) {
            return list.iterator();
        }
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // org.slf4j.d
    public synchronized boolean remove(org.slf4j.d dVar) {
        List list = this.refereceList;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (dVar.equals((org.slf4j.d) this.refereceList.get(i5))) {
                this.refereceList.remove(i5);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        if (!hasReferences()) {
            return getName();
        }
        Iterator it = iterator();
        StringBuffer stringBuffer = new StringBuffer(getName());
        stringBuffer.append(' ');
        stringBuffer.append(OPEN);
        while (it.hasNext()) {
            stringBuffer.append(((org.slf4j.d) it.next()).getName());
            if (it.hasNext()) {
                stringBuffer.append(SEP);
            }
        }
        stringBuffer.append(CLOSE);
        return stringBuffer.toString();
    }

    @Override // org.slf4j.d
    public boolean contains(String str) {
        if (str != null) {
            if (this.name.equals(str)) {
                return true;
            }
            if (hasReferences()) {
                for (int i5 = 0; i5 < this.refereceList.size(); i5++) {
                    if (((org.slf4j.d) this.refereceList.get(i5)).contains(str)) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("Other cannot be null");
    }
}
