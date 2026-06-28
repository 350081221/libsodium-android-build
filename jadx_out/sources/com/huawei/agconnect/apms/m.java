package com.huawei.agconnect.apms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class m {
    public final Object abc = new Object();
    public boolean bcd = false;
    public final ArrayList<l> cde = new ArrayList<>();

    public void abc(l lVar) {
        synchronized (this.cde) {
            this.cde.add(lVar);
        }
    }

    public void bcd(l lVar) {
        synchronized (this.cde) {
            this.cde.remove(lVar);
        }
    }

    public boolean cde() {
        boolean z4;
        synchronized (this.abc) {
            z4 = this.bcd;
        }
        return z4;
    }

    public void abc(k kVar) {
        if (abc()) {
            return;
        }
        Iterator<l> it = bcd().iterator();
        while (it.hasNext()) {
            it.next().bcd(kVar);
        }
    }

    public void bcd(k kVar) {
        if (abc()) {
            return;
        }
        Iterator<l> it = bcd().iterator();
        while (it.hasNext()) {
            it.next().abc(kVar);
        }
    }

    public final boolean abc() {
        boolean cde;
        synchronized (this.abc) {
            cde = cde();
            if (!cde) {
                this.bcd = true;
            }
        }
        return cde;
    }

    public final List<l> bcd() {
        ArrayList arrayList;
        synchronized (this.cde) {
            arrayList = new ArrayList(this.cde);
            this.cde.clear();
        }
        return arrayList;
    }
}
