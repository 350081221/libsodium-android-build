package org.osmdroid.views.overlay.advancedpolyline;

import java.util.List;

/* loaded from: classes4.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final List<Integer> f21868a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f21869b;

    /* renamed from: c, reason: collision with root package name */
    private int f21870c;

    public c(List<Integer> list) {
        this.f21868a = list;
        this.f21869b = null;
    }

    @Override // org.osmdroid.views.overlay.advancedpolyline.b
    public int a(int i5) {
        int i6 = this.f21870c;
        if (i6 > 0 && i5 >= i6) {
            i5 = 0;
        }
        int[] iArr = this.f21869b;
        if (iArr != null) {
            return iArr[i5 % iArr.length];
        }
        List<Integer> list = this.f21868a;
        if (list != null) {
            return list.get(i5 % list.size()).intValue();
        }
        throw new IllegalArgumentException();
    }

    public void b(int i5) {
        this.f21870c = i5;
    }

    public c(int[] iArr) {
        this.f21868a = null;
        this.f21869b = iArr;
    }
}
