package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes4.dex */
abstract class j implements org.slf4j.a, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    @Override // org.slf4j.a
    public String getName() {
        return this.name;
    }

    protected Object readResolve() throws ObjectStreamException {
        return org.slf4j.b.g(getName());
    }
}
