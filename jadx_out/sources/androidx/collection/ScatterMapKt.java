package androidx.collection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.u0;
import p4.l;
import p4.m;
import t0.b;
import u3.e;

@i0(d1 = {"\u0000h\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0001\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u001a\u001e\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u001aQ\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u0005\u0010\t\u001a\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0080\b\u001a\u0011\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0080\b\u001a\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0000\u001a\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\fH\u0081\b\u001a!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0019H\u0080\b\u001a\u0019\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\fH\u0080\b\u001a\u0019\u0010\"\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\fH\u0080\b\u001a\u0019\u0010#\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\fH\u0080\b\u001a\u0011\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u0019H\u0081\b\u001a\u0011\u0010%\u001a\u00020\f*\u00060\u0019j\u0002`$H\u0081\b\u001a\u0011\u0010'\u001a\u00020\f*\u00060\u0019j\u0002`&H\u0080\b\u001a\u0011\u0010(\u001a\u00020\u0019*\u00060\u0019j\u0002`&H\u0080\b\u001a\u0011\u0010)\u001a\u00020 *\u00060\u0019j\u0002`&H\u0080\b\u001a\u001d\u0010+\u001a\u00060\u0019j\u0002`*2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\fH\u0080\b\u001a\u001d\u0010-\u001a\u00060\u0019j\u0002`&*\u00060\u0019j\u0002`*2\u0006\u0010,\u001a\u00020\fH\u0081\b\u001a\u0015\u0010.\u001a\u00060\u0019j\u0002`&*\u00060\u0019j\u0002`*H\u0080\b\u001a\u0015\u0010/\u001a\u00060\u0019j\u0002`&*\u00060\u0019j\u0002`*H\u0081\b\"\u0014\u00100\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00102\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u00101\"\u0014\u00103\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u00101\"\u001a\u00104\u001a\u00020\u00198\u0000X\u0081T¢\u0006\f\n\u0004\b4\u00101\u0012\u0004\b5\u00106\"\u0014\u00107\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u00109\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u0010:\"\u0014\u0010;\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u0010:\"\u0014\u0010<\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010:\"\"\u0010>\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020=0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\"\u0014\u0010@\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u0010:\"\u001a\u0010A\u001a\u00020\u00198\u0000X\u0081T¢\u0006\f\n\u0004\bA\u00101\u0012\u0004\bB\u00106\"\u001a\u0010C\u001a\u00020\u00198\u0000X\u0081T¢\u0006\f\n\u0004\bC\u00101\u0012\u0004\bD\u00106*\f\b\u0000\u0010E\"\u00020\u00192\u00020\u0019*\f\b\u0000\u0010F\"\u00020\u00192\u00020\u0019*\f\b\u0000\u0010G\"\u00020\u00192\u00020\u0019¨\u0006H"}, d2 = {"K", "V", "Landroidx/collection/ScatterMap;", "emptyScatterMap", "Landroidx/collection/MutableScatterMap;", "mutableScatterMapOf", "", "Lkotlin/u0;", "pairs", "([Lkotlin/u0;)Landroidx/collection/MutableScatterMap;", "", "k", "", "hash", "h1", "h2", "capacity", "nextCapacity", "n", "normalizeCapacity", "loadedCapacity", "unloadedCapacity", "", "data", TypedValues.CycleType.S_WAVE_OFFSET, "", "readRawMetadata", b.f22420d, "Lkotlin/r2;", "writeRawMetadata", "metadata", "index", "", "isEmpty", "isDeleted", "isFull", "Landroidx/collection/StaticBitmask;", "lowestBitSet", "Landroidx/collection/Bitmask;", "get", "next", "hasNext", "Landroidx/collection/Group;", "group", "m", "match", "maskEmpty", "maskEmptyOrDeleted", "AllEmpty", "J", "Empty", "Deleted", "Sentinel", "getSentinel$annotations", "()V", "EmptyGroup", "[J", "GroupWidth", "I", "ClonedMetadataCount", "DefaultScatterCapacity", "", "EmptyScatterMap", "Landroidx/collection/MutableScatterMap;", "MurmurHashC1", "BitmaskLsb", "getBitmaskLsb$annotations", "BitmaskMsb", "getBitmaskMsb$annotations", "Bitmask", "Group", "StaticBitmask", "collection"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n1645#1:1835\n1645#1:1836\n1645#1:1837\n1699#1:1838\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1664#1:1835\n1666#1:1836\n1669#1:1837\n1705#1:1838\n*E\n"})
/* loaded from: classes.dex */
public final class ScatterMapKt {
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;

    @l
    @e
    public static final long[] EmptyGroup = {-9187201950435737345L, -1};

    @l
    private static final MutableScatterMap EmptyScatterMap = new MutableScatterMap(0);
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    @l
    public static final <K, V> ScatterMap<K, V> emptyScatterMap() {
        MutableScatterMap mutableScatterMap = EmptyScatterMap;
        l0.n(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    public static final int get(long j5) {
        return Long.numberOfTrailingZeros(j5) >> 3;
    }

    @a1
    public static /* synthetic */ void getBitmaskLsb$annotations() {
    }

    @a1
    public static /* synthetic */ void getBitmaskMsb$annotations() {
    }

    @a1
    public static /* synthetic */ void getSentinel$annotations() {
    }

    public static final long group(@l long[] metadata, int i5) {
        l0.p(metadata, "metadata");
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        return (((-i7) >> 63) & (metadata[i6 + 1] << (64 - i7))) | (metadata[i6] >>> i7);
    }

    public static final int h1(int i5) {
        return i5 >>> 7;
    }

    public static final int h2(int i5) {
        return i5 & 127;
    }

    public static final boolean hasNext(long j5) {
        return j5 != 0;
    }

    public static final int hash(@m Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * MurmurHashC1;
        return hashCode ^ (hashCode << 16);
    }

    public static final boolean isDeleted(@l long[] metadata, int i5) {
        l0.p(metadata, "metadata");
        if (((metadata[i5 >> 3] >> ((i5 & 7) << 3)) & 255) == 254) {
            return true;
        }
        return false;
    }

    public static final boolean isEmpty(@l long[] metadata, int i5) {
        l0.p(metadata, "metadata");
        if (((metadata[i5 >> 3] >> ((i5 & 7) << 3)) & 255) == 128) {
            return true;
        }
        return false;
    }

    @a1
    public static final boolean isFull(long j5) {
        return j5 < 128;
    }

    public static final boolean isFull(@l long[] metadata, int i5) {
        l0.p(metadata, "metadata");
        if (((metadata[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
            return true;
        }
        return false;
    }

    public static final int loadedCapacity(int i5) {
        if (i5 == 7) {
            return 6;
        }
        return i5 - (i5 / 8);
    }

    @a1
    public static final int lowestBitSet(long j5) {
        return Long.numberOfTrailingZeros(j5) >> 3;
    }

    public static final long maskEmpty(long j5) {
        return j5 & ((~j5) << 6) & (-9187201950435737472L);
    }

    @a1
    public static final long maskEmptyOrDeleted(long j5) {
        return j5 & ((~j5) << 7) & (-9187201950435737472L);
    }

    @a1
    public static final long match(long j5, int i5) {
        long j6 = j5 ^ (i5 * BitmaskLsb);
        return (~j6) & (j6 - BitmaskLsb) & (-9187201950435737472L);
    }

    @l
    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf() {
        return new MutableScatterMap<>(0, 1, null);
    }

    public static final long next(long j5) {
        return j5 & (j5 - 1);
    }

    public static final int nextCapacity(int i5) {
        if (i5 == 0) {
            return 6;
        }
        return (i5 * 2) + 1;
    }

    public static final int normalizeCapacity(int i5) {
        if (i5 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i5);
        }
        return 0;
    }

    @a1
    public static final long readRawMetadata(@l long[] data, int i5) {
        l0.p(data, "data");
        return (data[i5 >> 3] >> ((i5 & 7) << 3)) & 255;
    }

    public static final int unloadedCapacity(int i5) {
        if (i5 == 7) {
            return 8;
        }
        return i5 + ((i5 - 1) / 7);
    }

    public static final void writeRawMetadata(@l long[] data, int i5, long j5) {
        l0.p(data, "data");
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        data[i6] = (j5 << i7) | (data[i6] & (~(255 << i7)));
    }

    @l
    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf(@l u0<? extends K, ? extends V>... pairs) {
        l0.p(pairs, "pairs");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(pairs.length);
        mutableScatterMap.putAll(pairs);
        return mutableScatterMap;
    }
}
