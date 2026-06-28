package org.osmdroid.views.overlay.advancedpolyline;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final List<Integer> f21871a = new ArrayList();

    @Override // org.osmdroid.views.overlay.advancedpolyline.b
    public int a(int i5) {
        return this.f21871a.get(i5).intValue();
    }

    public void b(float f5) {
        this.f21871a.add(Integer.valueOf(c(f5)));
    }

    protected abstract int c(float f5);

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(int i5, float f5) {
        this.f21871a.set(i5, Integer.valueOf(c(f5)));
    }
}
