package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.collections.s0;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0003J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\bH\u0016J:\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u001d\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/reflect/ComposableMethod;", "", "method", "Ljava/lang/reflect/Method;", "composableInfo", "Landroidx/compose/runtime/reflect/ComposableInfo;", "(Ljava/lang/reflect/Method;Landroidx/compose/runtime/reflect/ComposableInfo;)V", "parameterCount", "", "getParameterCount", "()I", "parameterTypes", "", "Ljava/lang/Class;", "getParameterTypes", "()[Ljava/lang/Class;", "parameters", "Ljava/lang/reflect/Parameter;", "getParameters", "()[Ljava/lang/reflect/Parameter;", "asMethod", "equals", "", "other", TTDownloadField.TT_HASHCODE, "invoke", "composer", "Landroidx/compose/runtime/Composer;", "instance", "args", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n1549#2:223\n1620#2,3:224\n1804#2,4:227\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n*L\n145#1:223\n145#1:224,3\n146#1:227,4\n*E\n"})
/* loaded from: classes.dex */
public final class ComposableMethod {
    public static final int $stable = 8;

    @l
    private final ComposableInfo composableInfo;

    @l
    private final Method method;

    public ComposableMethod(@l Method method, @l ComposableInfo composableInfo) {
        this.method = method;
        this.composableInfo = composableInfo;
    }

    @l
    public final Method asMethod() {
        return this.method;
    }

    public boolean equals(@m Object obj) {
        if (obj instanceof ComposableMethod) {
            return l0.g(this.method, ((ComposableMethod) obj).method);
        }
        return false;
    }

    public final int getParameterCount() {
        return this.composableInfo.getRealParamsCount();
    }

    @l
    public final Class<?>[] getParameterTypes() {
        Object[] l12;
        l12 = o.l1(this.method.getParameterTypes(), 0, this.composableInfo.getRealParamsCount());
        return (Class[]) l12;
    }

    @l
    public final Parameter[] getParameters() {
        Parameter[] parameters;
        Object[] l12;
        parameters = this.method.getParameters();
        l12 = o.l1(parameters, 0, this.composableInfo.getRealParamsCount());
        return (Parameter[]) l12;
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    @m
    public final Object invoke(@l Composer composer, @m Object obj, @l Object... objArr) {
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj2;
        int we;
        kotlin.ranges.l W1;
        int Y;
        int i5;
        ComposableInfo composableInfo = this.composableInfo;
        int component2 = composableInfo.component2();
        int component3 = composableInfo.component3();
        int component4 = composableInfo.component4();
        int length = this.method.getParameterTypes().length;
        int i6 = component2 + 1;
        int i7 = component3 + i6;
        Object[] objArr2 = new Integer[component4];
        for (int i8 = 0; i8 < component4; i8++) {
            int i9 = i8 * 31;
            W1 = u.W1(i9, Math.min(i9 + 31, component2));
            Y = x.Y(W1, 10);
            ArrayList arrayList = new ArrayList(Y);
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                int nextInt = ((s0) it).nextInt();
                if (nextInt < objArr.length && objArr[nextInt] != null) {
                    i5 = 0;
                } else {
                    i5 = 1;
                }
                arrayList.add(Integer.valueOf(i5));
            }
            int i10 = 0;
            int i11 = 0;
            for (Object obj3 : arrayList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    w.W();
                }
                i10 |= ((Number) obj3).intValue() << i11;
                i11 = i12;
            }
            objArr2[i8] = Integer.valueOf(i10);
        }
        Object[] objArr3 = new Object[length];
        for (int i13 = 0; i13 < length; i13++) {
            if (i13 >= 0 && i13 < component2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (i13 >= 0) {
                    we = p.we(objArr);
                    if (i13 <= we) {
                        obj2 = objArr[i13];
                    }
                }
                obj2 = ComposableMethodKt.getDefaultValue(this.method.getParameterTypes()[i13]);
            } else if (i13 == component2) {
                obj2 = composer;
            } else {
                if (i13 != i6) {
                    if (i6 + 1 <= i13 && i13 < i7) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        if (i7 <= i13 && i13 < length) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            obj2 = objArr2[i13 - i7];
                        } else {
                            throw new IllegalStateException("Unexpected index".toString());
                        }
                    }
                }
                obj2 = 0;
            }
            objArr3[i13] = obj2;
        }
        return this.method.invoke(obj, Arrays.copyOf(objArr3, length));
    }
}
