package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.ILoggerFactory;

/* loaded from: classes4.dex */
public class k implements ILoggerFactory {

    /* renamed from: a, reason: collision with root package name */
    final List f22248a = new ArrayList();

    @Override // org.slf4j.ILoggerFactory
    public org.slf4j.a a(String str) {
        synchronized (this.f22248a) {
            this.f22248a.add(str);
        }
        return g.NOP_LOGGER;
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f22248a) {
            arrayList.addAll(this.f22248a);
        }
        return arrayList;
    }
}
