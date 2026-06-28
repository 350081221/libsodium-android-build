package com.umeng.analytics.pro;

import androidx.core.app.FrameMetricsAggregator;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class bs {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator f12361a = new a();

    /* loaded from: classes3.dex */
    private static class a implements Comparator {
        private a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            if (obj instanceof List) {
                return bs.a((List) obj, (List) obj2);
            }
            if (obj instanceof Set) {
                return bs.a((Set) obj, (Set) obj2);
            }
            if (obj instanceof Map) {
                return bs.a((Map) obj, (Map) obj2);
            }
            if (obj instanceof byte[]) {
                return bs.a((byte[]) obj, (byte[]) obj2);
            }
            return bs.a((Comparable) obj, (Comparable) obj2);
        }
    }

    private bs() {
    }

    public static int a(byte b5, byte b6) {
        if (b5 < b6) {
            return -1;
        }
        return b6 < b5 ? 1 : 0;
    }

    public static int a(double d5, double d6) {
        if (d5 < d6) {
            return -1;
        }
        return d6 < d5 ? 1 : 0;
    }

    public static int a(int i5, int i6) {
        if (i5 < i6) {
            return -1;
        }
        return i6 < i5 ? 1 : 0;
    }

    public static int a(long j5, long j6) {
        if (j5 < j6) {
            return -1;
        }
        return j6 < j5 ? 1 : 0;
    }

    public static int a(Object obj, Object obj2) {
        if (obj instanceof Comparable) {
            return a((Comparable) obj, (Comparable) obj2);
        }
        if (obj instanceof List) {
            return a((List) obj, (List) obj2);
        }
        if (obj instanceof Set) {
            return a((Set) obj, (Set) obj2);
        }
        if (obj instanceof Map) {
            return a((Map) obj, (Map) obj2);
        }
        if (obj instanceof byte[]) {
            return a((byte[]) obj, (byte[]) obj2);
        }
        throw new IllegalArgumentException("Cannot compare objects of type " + obj.getClass());
    }

    public static int a(short s5, short s6) {
        if (s5 < s6) {
            return -1;
        }
        return s6 < s5 ? 1 : 0;
    }

    public static boolean b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity()) {
            return true;
        }
        return false;
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (b(byteBuffer)) {
            return byteBuffer;
        }
        return ByteBuffer.wrap(a(byteBuffer));
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(new byte[byteBuffer.remaining()]);
        if (byteBuffer.hasArray()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), wrap.array(), 0, byteBuffer.remaining());
        } else {
            byteBuffer.slice().get(wrap.array());
        }
        return wrap;
    }

    public static int a(boolean z4, boolean z5) {
        return Boolean.valueOf(z4).compareTo(Boolean.valueOf(z5));
    }

    public static int a(String str, String str2) {
        return str.compareTo(str2);
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        int a5 = a(bArr.length, bArr2.length);
        if (a5 != 0) {
            return a5;
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int a6 = a(bArr[i5], bArr2[i5]);
            if (a6 != 0) {
                return a6;
            }
        }
        return 0;
    }

    public static int a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static int a(List list, List list2) {
        int a5 = a(list.size(), list2.size());
        if (a5 != 0) {
            return a5;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            int compare = f12361a.compare(list.get(i5), list2.get(i5));
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    public static int a(Set set, Set set2) {
        int a5 = a(set.size(), set2.size());
        if (a5 != 0) {
            return a5;
        }
        Comparator comparator = f12361a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compare = f12361a.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    public static int a(Map map, Map map2) {
        int a5 = a(map.size(), map2.size());
        if (a5 != 0) {
            return a5;
        }
        Comparator comparator = f12361a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f12361a;
            int compare = comparator2.compare(entry.getKey(), entry2.getKey());
            if (compare != 0) {
                return compare;
            }
            int compare2 = comparator2.compare(entry.getValue(), entry2.getValue());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }

    public static void a(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        int position = byteBuffer.position() + arrayOffset;
        int limit = arrayOffset + byteBuffer.limit();
        int i5 = limit - position > 128 ? position + 128 : limit;
        for (int i6 = position; i6 < i5; i6++) {
            if (i6 > position) {
                sb.append(" ");
            }
            sb.append(a(array[i6]));
        }
        if (limit != i5) {
            sb.append("...");
        }
    }

    public static String a(byte b5) {
        return Integer.toHexString((b5 | 256) & FrameMetricsAggregator.EVERY_DURATION).toUpperCase().substring(1);
    }

    public static byte[] a(ByteBuffer byteBuffer) {
        if (b(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        a(byteBuffer, bArr, 0);
        return bArr;
    }

    public static int a(ByteBuffer byteBuffer, byte[] bArr, int i5) {
        int remaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i5, remaining);
        return remaining;
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
