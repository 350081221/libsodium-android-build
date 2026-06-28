package androidx.compose.runtime.internal;

import kotlin.i0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "size", "", "keys", "", "values", "", "(I[J[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "find", DatabaseFileArchive.COLUMN_KEY, "", "get", "newWith", b.f22420d, "trySet", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nThreadMap.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n12904#2,3:113\n*S KotlinDebug\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n42#1:113,3\n*E\n"})
/* loaded from: classes.dex */
public final class ThreadMap {
    public static final int $stable = 8;

    @l
    private final long[] keys;
    private final int size;

    @l
    private final Object[] values;

    public ThreadMap(int i5, @l long[] jArr, @l Object[] objArr) {
        this.size = i5;
        this.keys = jArr;
        this.values = objArr;
    }

    private final int find(long j5) {
        int i5 = this.size - 1;
        if (i5 == -1) {
            return -1;
        }
        int i6 = 0;
        if (i5 != 0) {
            while (i6 <= i5) {
                int i7 = (i6 + i5) >>> 1;
                long j6 = this.keys[i7] - j5;
                if (j6 < 0) {
                    i6 = i7 + 1;
                } else if (j6 > 0) {
                    i5 = i7 - 1;
                } else {
                    return i7;
                }
            }
            return -(i6 + 1);
        }
        long j7 = this.keys[0];
        if (j7 == j5) {
            return 0;
        }
        if (j7 <= j5) {
            return -1;
        }
        return -2;
    }

    @m
    public final Object get(long j5) {
        int find = find(j5);
        if (find >= 0) {
            return this.values[find];
        }
        return null;
    }

    @l
    public final ThreadMap newWith(long j5, @m Object obj) {
        int i5 = this.size;
        Object[] objArr = this.values;
        int length = objArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            boolean z4 = true;
            if (i7 >= length) {
                break;
            }
            if (objArr[i7] == null) {
                z4 = false;
            }
            if (z4) {
                i8++;
            }
            i7++;
        }
        int i9 = i8 + 1;
        long[] jArr = new long[i9];
        Object[] objArr2 = new Object[i9];
        if (i9 > 1) {
            int i10 = 0;
            while (true) {
                if (i6 >= i9 || i10 >= i5) {
                    break;
                }
                long j6 = this.keys[i10];
                Object obj2 = this.values[i10];
                if (j6 > j5) {
                    jArr[i6] = j5;
                    objArr2[i6] = obj;
                    i6++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i6] = j6;
                    objArr2[i6] = obj2;
                    i6++;
                }
                i10++;
            }
            if (i10 == i5) {
                int i11 = i9 - 1;
                jArr[i11] = j5;
                objArr2[i11] = obj;
            } else {
                while (i6 < i9) {
                    long j7 = this.keys[i10];
                    Object obj3 = this.values[i10];
                    if (obj3 != null) {
                        jArr[i6] = j7;
                        objArr2[i6] = obj3;
                        i6++;
                    }
                    i10++;
                }
            }
        } else {
            jArr[0] = j5;
            objArr2[0] = obj;
        }
        return new ThreadMap(i9, jArr, objArr2);
    }

    public final boolean trySet(long j5, @m Object obj) {
        int find = find(j5);
        if (find < 0) {
            return false;
        }
        this.values[find] = obj;
        return true;
    }
}
