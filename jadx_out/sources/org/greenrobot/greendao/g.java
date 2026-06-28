package org.greenrobot.greendao;

import android.database.Cursor;
import java.util.List;

/* loaded from: classes4.dex */
public final class g<T> {

    /* renamed from: a, reason: collision with root package name */
    private final a<T, ?> f21354a;

    public g(a<T, ?> aVar) {
        this.f21354a = aVar;
    }

    public static <T2> org.greenrobot.greendao.internal.e b(a<T2, ?> aVar) {
        return aVar.getStatements();
    }

    public org.greenrobot.greendao.internal.e a() {
        return this.f21354a.getStatements();
    }

    public List<T> c(Cursor cursor) {
        return this.f21354a.loadAllAndCloseCursor(cursor);
    }

    public T d(Cursor cursor, int i5, boolean z4) {
        return this.f21354a.loadCurrent(cursor, i5, z4);
    }

    public T e(Cursor cursor) {
        return this.f21354a.loadUniqueAndCloseCursor(cursor);
    }
}
