package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.IMarkerFactory;

/* loaded from: classes4.dex */
public class c implements IMarkerFactory {

    /* renamed from: a, reason: collision with root package name */
    Map f22239a = new HashMap();

    @Override // org.slf4j.IMarkerFactory
    public synchronized org.slf4j.d a(String str) {
        org.slf4j.d dVar;
        if (str != null) {
            dVar = (org.slf4j.d) this.f22239a.get(str);
            if (dVar == null) {
                dVar = new b(str);
                this.f22239a.put(str, dVar);
            }
        } else {
            throw new IllegalArgumentException("Marker name cannot be null");
        }
        return dVar;
    }

    @Override // org.slf4j.IMarkerFactory
    public boolean b(String str) {
        return (str == null || this.f22239a.remove(str) == null) ? false : true;
    }

    @Override // org.slf4j.IMarkerFactory
    public org.slf4j.d c(String str) {
        return new b(str);
    }

    @Override // org.slf4j.IMarkerFactory
    public synchronized boolean d(String str) {
        if (str == null) {
            return false;
        }
        return this.f22239a.containsKey(str);
    }
}
