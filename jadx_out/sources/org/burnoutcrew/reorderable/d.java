package org.burnoutcrew.reorderable;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lorg/burnoutcrew/reorderable/d;", "", "", bi.ay, "b", "index", DatabaseFileArchive.COLUMN_KEY, "c", "", "toString", TTDownloadField.TT_HASHCODE, "other", "", "equals", "I", "e", "()I", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "<init>", "(ILjava/lang/Object;)V", "reorderable"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21097c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final int f21098a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private final Object f21099b;

    public d(int i5, @p4.m Object obj) {
        this.f21098a = i5;
        this.f21099b = obj;
    }

    public static /* synthetic */ d d(d dVar, int i5, Object obj, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            i5 = dVar.f21098a;
        }
        if ((i6 & 2) != 0) {
            obj = dVar.f21099b;
        }
        return dVar.c(i5, obj);
    }

    public final int a() {
        return this.f21098a;
    }

    @p4.m
    public final Object b() {
        return this.f21099b;
    }

    @p4.l
    public final d c(int i5, @p4.m Object obj) {
        return new d(i5, obj);
    }

    public final int e() {
        return this.f21098a;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f21098a == dVar.f21098a && l0.g(this.f21099b, dVar.f21099b);
    }

    @p4.m
    public final Object f() {
        return this.f21099b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f21098a) * 31;
        Object obj = this.f21099b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @p4.l
    public String toString() {
        return "ItemPosition(index=" + this.f21098a + ", key=" + this.f21099b + ')';
    }
}
