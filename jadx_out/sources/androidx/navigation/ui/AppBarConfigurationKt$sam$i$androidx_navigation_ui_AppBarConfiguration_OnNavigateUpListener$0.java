package androidx.navigation.ui;

import androidx.navigation.ui.AppBarConfiguration;
import kotlin.i0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.l0;
import kotlin.v;
import p4.l;
import p4.m;

@i0(k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes2.dex */
public final class AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 implements AppBarConfiguration.OnNavigateUpListener, d0 {
    private final /* synthetic */ v3.a function;

    public AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(v3.a function) {
        l0.p(function, "function");
        this.function = function;
    }

    public final boolean equals(@m Object obj) {
        if ((obj instanceof AppBarConfiguration.OnNavigateUpListener) && (obj instanceof d0)) {
            return l0.g(getFunctionDelegate(), ((d0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.d0
    @l
    public final v<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener
    public final /* synthetic */ boolean onNavigateUp() {
        return ((Boolean) this.function.invoke()).booleanValue();
    }
}
