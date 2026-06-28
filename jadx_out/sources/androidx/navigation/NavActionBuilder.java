package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.c1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.u0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u0007\u001a\u00020\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/navigation/NavActionBuilder;", "", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/r2;", "Lkotlin/u;", "optionsBuilder", "navOptions", "Landroidx/navigation/NavAction;", "build$navigation_common_release", "()Landroidx/navigation/NavAction;", "build", "", "destinationId", "I", "getDestinationId", "()I", "setDestinationId", "(I)V", "", "", "defaultArguments", "Ljava/util/Map;", "getDefaultArguments", "()Ljava/util/Map;", "Landroidx/navigation/NavOptions;", "Landroidx/navigation/NavOptions;", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@NavDestinationDsl
@r1({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavActionBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,260:1\n37#2,2:261\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavActionBuilder\n*L\n206#1:261,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavActionBuilder {

    @l
    private final Map<String, Object> defaultArguments = new LinkedHashMap();
    private int destinationId;

    @m
    private NavOptions navOptions;

    @l
    public final NavAction build$navigation_common_release() {
        List J1;
        Bundle bundleOf;
        int i5 = this.destinationId;
        NavOptions navOptions = this.navOptions;
        if (this.defaultArguments.isEmpty()) {
            bundleOf = null;
        } else {
            J1 = c1.J1(this.defaultArguments);
            u0[] u0VarArr = (u0[]) J1.toArray(new u0[0]);
            bundleOf = BundleKt.bundleOf((u0[]) Arrays.copyOf(u0VarArr, u0VarArr.length));
        }
        return new NavAction(i5, navOptions, bundleOf);
    }

    @l
    public final Map<String, Object> getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final void navOptions(@l v3.l<? super NavOptionsBuilder, r2> optionsBuilder) {
        l0.p(optionsBuilder, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        optionsBuilder.invoke(navOptionsBuilder);
        this.navOptions = navOptionsBuilder.build$navigation_common_release();
    }

    public final void setDestinationId(int i5) {
        this.destinationId = i5;
    }
}
