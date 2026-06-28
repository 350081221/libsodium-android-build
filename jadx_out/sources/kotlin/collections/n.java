package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.d2;
import kotlin.h2;
import kotlin.n2;
import kotlin.z1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00030\u0003¢\u0006\u0002\u0010\u0016\u001a;\u0010\u0017\u001a\u0002H\u0018\"\u0010\b\u0000\u0010\u0019*\u0006\u0012\u0002\b\u00030\u0003*\u0002H\u0018\"\u0004\b\u0001\u0010\u0018*\u0002H\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u00020\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0002\u0010\u001e\u001aG\u0010\u001f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u00150 \"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00180 0\u0003¢\u0006\u0002\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"contentDeepEqualsImpl", "", "T", "", "other", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepToStringImpl", "", "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringInternal", "", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "processed", "", "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "flatten", "", "([[Ljava/lang/Object;)Ljava/util/List;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNullOrEmpty", "([Ljava/lang/Object;)Z", "unzip", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lkotlin/Pair;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
@kotlin.jvm.internal.r1({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* loaded from: classes3.dex */
public class n extends m {
    /* JADX WARN: Multi-variable type inference failed */
    @u3.h(name = "contentDeepEquals")
    @kotlin.g1(version = "1.3")
    @kotlin.a1
    public static final <T> boolean g(@p4.m T[] tArr, @p4.m T[] tArr2) {
        boolean V0;
        boolean T0;
        boolean S0;
        boolean U0;
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            Object[] objArr = tArr[i5];
            Object[] objArr2 = tArr2[i5];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!g(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof z1) && (objArr2 instanceof z1)) {
                    U0 = kotlin.collections.unsigned.c.U0(((z1) objArr).w(), ((z1) objArr2).w());
                    if (!U0) {
                        return false;
                    }
                } else if ((objArr instanceof n2) && (objArr2 instanceof n2)) {
                    S0 = kotlin.collections.unsigned.c.S0(((n2) objArr).w(), ((n2) objArr2).w());
                    if (!S0) {
                        return false;
                    }
                } else if ((objArr instanceof d2) && (objArr2 instanceof d2)) {
                    T0 = kotlin.collections.unsigned.c.T0(((d2) objArr).w(), ((d2) objArr2).w());
                    if (!T0) {
                        return false;
                    }
                } else if ((objArr instanceof h2) && (objArr2 instanceof h2)) {
                    V0 = kotlin.collections.unsigned.c.V0(((h2) objArr).w(), ((h2) objArr2).w());
                    if (!V0) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.l0.g(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @u3.h(name = "contentDeepToString")
    @kotlin.g1(version = "1.3")
    @p4.l
    @kotlin.a1
    public static final <T> String h(@p4.m T[] tArr) {
        int B;
        if (tArr == null) {
            return "null";
        }
        B = kotlin.ranges.u.B(tArr.length, 429496729);
        StringBuilder sb = new StringBuilder((B * 5) + 2);
        i(tArr, sb, new ArrayList());
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void i(T[] tArr, StringBuilder sb, List<Object[]> list) {
        int G;
        String d12;
        String b12;
        String c12;
        String a12;
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i5 != 0) {
                sb.append(", ");
            }
            Object[] objArr = tArr[i5];
            if (objArr == 0) {
                sb.append("null");
            } else if (objArr instanceof Object[]) {
                i(objArr, sb, list);
            } else if (objArr instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) objArr);
                kotlin.jvm.internal.l0.o(arrays, "toString(this)");
                sb.append(arrays);
            } else if (objArr instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) objArr);
                kotlin.jvm.internal.l0.o(arrays2, "toString(this)");
                sb.append(arrays2);
            } else if (objArr instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) objArr);
                kotlin.jvm.internal.l0.o(arrays3, "toString(this)");
                sb.append(arrays3);
            } else if (objArr instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) objArr);
                kotlin.jvm.internal.l0.o(arrays4, "toString(this)");
                sb.append(arrays4);
            } else if (objArr instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) objArr);
                kotlin.jvm.internal.l0.o(arrays5, "toString(this)");
                sb.append(arrays5);
            } else if (objArr instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) objArr);
                kotlin.jvm.internal.l0.o(arrays6, "toString(this)");
                sb.append(arrays6);
            } else if (objArr instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) objArr);
                kotlin.jvm.internal.l0.o(arrays7, "toString(this)");
                sb.append(arrays7);
            } else if (objArr instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) objArr);
                kotlin.jvm.internal.l0.o(arrays8, "toString(this)");
                sb.append(arrays8);
            } else if (objArr instanceof z1) {
                a12 = kotlin.collections.unsigned.c.a1(((z1) objArr).w());
                sb.append(a12);
            } else if (objArr instanceof n2) {
                c12 = kotlin.collections.unsigned.c.c1(((n2) objArr).w());
                sb.append(c12);
            } else if (objArr instanceof d2) {
                b12 = kotlin.collections.unsigned.c.b1(((d2) objArr).w());
                sb.append(b12);
            } else if (objArr instanceof h2) {
                d12 = kotlin.collections.unsigned.c.d1(((h2) objArr).w());
                sb.append(d12);
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(']');
        G = w.G(list);
        list.remove(G);
    }

    @p4.l
    public static final <T> List<T> j(@p4.l T[][] tArr) {
        kotlin.jvm.internal.l0.p(tArr, "<this>");
        int i5 = 0;
        for (T[] tArr2 : tArr) {
            i5 += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i5);
        for (T[] tArr3 : tArr) {
            b0.p0(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lv3/a<+TR;>;)TR; */
    @kotlin.g1(version = "1.3")
    @kotlin.internal.f
    private static final Object k(Object[] objArr, v3.a defaultValue) {
        boolean z4;
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        if (objArr.length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return defaultValue.invoke();
        }
        return objArr;
    }

    @kotlin.g1(version = "1.3")
    @kotlin.internal.f
    private static final boolean l(Object[] objArr) {
        if (objArr != null) {
            return objArr.length == 0;
        }
        return true;
    }

    @p4.l
    public static final <T, R> kotlin.u0<List<T>, List<R>> m(@p4.l kotlin.u0<? extends T, ? extends R>[] u0VarArr) {
        kotlin.jvm.internal.l0.p(u0VarArr, "<this>");
        ArrayList arrayList = new ArrayList(u0VarArr.length);
        ArrayList arrayList2 = new ArrayList(u0VarArr.length);
        for (kotlin.u0<? extends T, ? extends R> u0Var : u0VarArr) {
            arrayList.add(u0Var.getFirst());
            arrayList2.add(u0Var.getSecond());
        }
        return kotlin.q1.a(arrayList, arrayList2);
    }
}
