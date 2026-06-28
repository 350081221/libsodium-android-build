package com.ss.android.socialbase.downloader.i;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class h<K, T> extends LinkedHashMap<K, T> {

    /* renamed from: a, reason: collision with root package name */
    private int f10966a;

    public h() {
        this(4, 4);
    }

    public void a(int i5) {
        this.f10966a = i5;
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<K, T> entry) {
        return size() > this.f10966a;
    }

    public h(int i5, int i6) {
        this(i5, i6, true);
    }

    public h(int i5, int i6, boolean z4) {
        super(i5, 0.75f, z4);
        a(i6);
    }
}
