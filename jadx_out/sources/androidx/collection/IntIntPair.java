package androidx.collection;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import u3.e;
import u3.f;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\u0088\u0001\u0007\u0092\u0001\u00020\b¨\u0006\u001e"}, d2 = {"Landroidx/collection/IntIntPair;", "", "first", "", "second", "constructor-impl", "(II)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)I", "getPackedValue$annotations", "()V", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
@r1({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,83:1\n33#2:84\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n41#1:84\n*E\n"})
/* loaded from: classes.dex */
public final class IntIntPair {

    @e
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j5) {
        this.packedValue = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m13boximpl(long j5) {
        return new IntIntPair(j5);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m14component1impl(long j5) {
        return (int) (j5 >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m15component2impl(long j5) {
        return (int) (j5 & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m16constructorimpl(int i5, int i6) {
        return m17constructorimpl((i6 & 4294967295L) | (i5 << 32));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m17constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m18equalsimpl(long j5, Object obj) {
        return (obj instanceof IntIntPair) && j5 == ((IntIntPair) obj).m24unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m19equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m20getFirstimpl(long j5) {
        return (int) (j5 >> 32);
    }

    @a1
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m21getSecondimpl(long j5) {
        return (int) (j5 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23toStringimpl(long j5) {
        return '(' + m20getFirstimpl(j5) + ", " + m21getSecondimpl(j5) + ')';
    }

    public boolean equals(Object obj) {
        return m18equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m22hashCodeimpl(this.packedValue);
    }

    @l
    public String toString() {
        return m23toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m24unboximpl() {
        return this.packedValue;
    }
}
