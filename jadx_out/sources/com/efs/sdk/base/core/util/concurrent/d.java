package com.efs.sdk.base.core.util.concurrent;

import androidx.annotation.NonNull;
import com.efs.sdk.base.core.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class d<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private List<b<T>> f6648a = new ArrayList(5);

    /* renamed from: b, reason: collision with root package name */
    private c<T> f6649b;

    public d(@NonNull c<T> cVar) {
        this.f6649b = cVar;
    }

    public final void a(@NonNull List<b<T>> list) {
        this.f6648a.addAll(list);
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
    }

    public final T a() {
        T t5 = null;
        try {
            Iterator<b<T>> it = this.f6648a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            t5 = this.f6649b.a();
            Iterator<b<T>> it2 = this.f6648a.iterator();
            while (it2.hasNext()) {
                it2.next().a(this.f6649b, t5);
            }
            Iterator<b<T>> it3 = this.f6648a.iterator();
            while (it3.hasNext()) {
                it3.next().result(t5);
            }
        } catch (Throwable th) {
            Log.w("efs.util.concurrent", th);
            Iterator<b<T>> it4 = this.f6648a.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        return t5;
    }
}
