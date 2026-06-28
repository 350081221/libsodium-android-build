package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import com.swift.sandhook.annotation.MethodReflectParams;
import external.org.apache.commons.lang3.d;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.s1;
import kotlin.ranges.u;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u0002H\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0082\b¢\u0006\u0002\u0010\r\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\bH\u0002\u001a7\u0010\u0010\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u001a\u0010\u0014\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\n\"\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0002\u0010\u0015\u001a\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u0006\u0012\u0002\b\u00030\u0011H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"BITS_PER_INT", "", "changedParamCount", "realValueParams", "thisParams", "defaultParamCount", "asComposableMethod", "Landroidx/compose/runtime/reflect/ComposableMethod;", "Ljava/lang/reflect/Method;", "dup", "", "T", "count", "(Ljava/lang/Object;I)[Ljava/lang/Object;", "getComposableInfo", "Landroidx/compose/runtime/reflect/ComposableInfo;", "getDeclaredComposableMethod", "Ljava/lang/Class;", "methodName", "", "args", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Landroidx/compose/runtime/reflect/ComposableMethod;", "getDefaultValue", "", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@h(name = "ComposableMethodKt")
@r1({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,222:1\n187#1:235\n187#1:242\n187#1:249\n1735#2,6:223\n1549#3:229\n1620#3,3:230\n1549#3:236\n1620#3,3:237\n1549#3:243\n1620#3,3:244\n1549#3:250\n1620#3,3:251\n37#4,2:233\n37#4,2:240\n37#4,2:247\n37#4,2:254\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n*L\n203#1:235\n212#1:242\n213#1:249\n59#1:223,6\n187#1:229\n187#1:230,3\n203#1:236\n203#1:237,3\n212#1:243\n212#1:244,3\n213#1:250\n213#1:251,3\n187#1:233,2\n203#1:240,2\n212#1:247,2\n213#1:254,2\n*E\n"})
/* loaded from: classes.dex */
public final class ComposableMethodKt {
    private static final int BITS_PER_INT = 31;

    @m
    public static final ComposableMethod asComposableMethod(@l Method method) {
        ComposableInfo composableInfo = getComposableInfo(method);
        if (composableInfo.isComposable()) {
            return new ComposableMethod(method, composableInfo);
        }
        return null;
    }

    private static final int changedParamCount(int i5, int i6) {
        if (i5 == 0) {
            return 1;
        }
        return (int) Math.ceil((i5 + i6) / 10.0d);
    }

    private static final int defaultParamCount(int i5) {
        return (int) Math.ceil(i5 / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T[] dup(T t5, int i5) {
        kotlin.ranges.l W1;
        int Y;
        W1 = u.W1(0, i5);
        Y = x.Y(W1, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            ((s0) it).nextInt();
            arrayList.add(t5);
        }
        l0.y(0, "T?");
        return (T[]) arrayList.toArray(new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final ComposableInfo getComposableInfo(Method method) {
        Object[] objArr;
        int i5;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i6 = length - 1;
                if (l0.g(parameterTypes[length], Composer.class)) {
                    break;
                }
                if (i6 < 0) {
                    break;
                }
                length = i6;
            }
        }
        length = -1;
        boolean z4 = false;
        if (length == -1) {
            return new ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        }
        int changedParamCount = changedParamCount(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i7 = length + 1 + changedParamCount;
        int length2 = method.getParameterTypes().length;
        if (length2 != i7) {
            objArr = true;
        } else {
            objArr = false;
        }
        if (objArr != false) {
            i5 = defaultParamCount(length);
        } else {
            i5 = 0;
        }
        if (i7 + i5 == length2) {
            z4 = true;
        }
        return new ComposableInfo(z4, length, changedParamCount, i5);
    }

    @l
    public static final ComposableMethod getDeclaredComposableMethod(@l Class<?> cls, @l String str, @l Class<?>... clsArr) throws NoSuchMethodException {
        Method method;
        kotlin.ranges.l W1;
        int Y;
        kotlin.ranges.l W12;
        int Y2;
        kotlin.ranges.l W13;
        int Y3;
        int changedParamCount = changedParamCount(clsArr.length, 0);
        try {
            s1 s1Var = new s1(3);
            s1Var.b(clsArr);
            s1Var.a(Composer.class);
            Class cls2 = Integer.TYPE;
            W13 = u.W1(0, changedParamCount);
            Y3 = x.Y(W13, 10);
            ArrayList arrayList = new ArrayList(Y3);
            Iterator<Integer> it = W13.iterator();
            while (it.hasNext()) {
                ((s0) it).nextInt();
                arrayList.add(cls2);
            }
            s1Var.b(arrayList.toArray(new Class[0]));
            method = cls.getDeclaredMethod(str, (Class[]) s1Var.d(new Class[s1Var.c()]));
        } catch (ReflectiveOperationException unused) {
            int defaultParamCount = defaultParamCount(clsArr.length);
            try {
                s1 s1Var2 = new s1(4);
                s1Var2.b(clsArr);
                s1Var2.a(Composer.class);
                Class cls3 = Integer.TYPE;
                W1 = u.W1(0, changedParamCount);
                Y = x.Y(W1, 10);
                ArrayList arrayList2 = new ArrayList(Y);
                Iterator<Integer> it2 = W1.iterator();
                while (it2.hasNext()) {
                    ((s0) it2).nextInt();
                    arrayList2.add(cls3);
                }
                s1Var2.b(arrayList2.toArray(new Class[0]));
                Class cls4 = Integer.TYPE;
                W12 = u.W1(0, defaultParamCount);
                Y2 = x.Y(W12, 10);
                ArrayList arrayList3 = new ArrayList(Y2);
                Iterator<Integer> it3 = W12.iterator();
                while (it3.hasNext()) {
                    ((s0) it3).nextInt();
                    arrayList3.add(cls4);
                }
                s1Var2.b(arrayList3.toArray(new Class[0]));
                method = cls.getDeclaredMethod(str, (Class[]) s1Var2.d(new Class[s1Var2.c()]));
            } catch (ReflectiveOperationException unused2) {
                method = null;
            }
        }
        if (method != null) {
            ComposableMethod asComposableMethod = asComposableMethod(method);
            l0.m(asComposableMethod);
            return asComposableMethod;
        }
        throw new NoSuchMethodException(cls.getName() + d.f15957a + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals(MethodReflectParams.DOUBLE)) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                if (name.equals(MethodReflectParams.INT)) {
                    return 0;
                }
                return null;
            case 3039496:
                if (name.equals(MethodReflectParams.BYTE)) {
                    return (byte) 0;
                }
                return null;
            case 3052374:
                if (name.equals(MethodReflectParams.CHAR)) {
                    return (char) 0;
                }
                return null;
            case 3327612:
                if (name.equals(MethodReflectParams.LONG)) {
                    return 0L;
                }
                return null;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                if (name.equals(MethodReflectParams.SHORT)) {
                    return (short) 0;
                }
                return null;
            default:
                return null;
        }
    }
}
