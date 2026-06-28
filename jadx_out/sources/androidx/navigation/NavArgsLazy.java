package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.d0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.d;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/navigation/NavArgsLazy;", "Landroidx/navigation/NavArgs;", "Args", "Lkotlin/d0;", "", "isInitialized", "Lkotlin/reflect/d;", "navArgsClass", "Lkotlin/reflect/d;", "Lkotlin/Function0;", "Landroid/os/Bundle;", "argumentProducer", "Lv3/a;", "cached", "Landroidx/navigation/NavArgs;", "getValue", "()Landroidx/navigation/NavArgs;", t0.b.f22420d, "<init>", "(Lkotlin/reflect/d;Lv3/a;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavArgsLazy<Args extends NavArgs> implements d0<Args> {

    @l
    private final v3.a<Bundle> argumentProducer;

    @m
    private Args cached;

    @l
    private final d<Args> navArgsClass;

    public NavArgsLazy(@l d<Args> navArgsClass, @l v3.a<Bundle> argumentProducer) {
        l0.p(navArgsClass, "navArgsClass");
        l0.p(argumentProducer, "argumentProducer");
        this.navArgsClass = navArgsClass;
        this.argumentProducer = argumentProducer;
    }

    @Override // kotlin.d0
    public boolean isInitialized() {
        return this.cached != null;
    }

    @Override // kotlin.d0
    @l
    public Args getValue() {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle invoke = this.argumentProducer.invoke();
        Method method = NavArgsLazyKt.getMethodMap().get(this.navArgsClass);
        if (method == null) {
            Class e5 = u3.a.e(this.navArgsClass);
            Class<Bundle>[] methodSignature = NavArgsLazyKt.getMethodSignature();
            method = e5.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
            NavArgsLazyKt.getMethodMap().put(this.navArgsClass, method);
            l0.o(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object invoke2 = method.invoke(null, invoke);
        l0.n(invoke2, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        Args args2 = (Args) invoke2;
        this.cached = args2;
        return args2;
    }
}
