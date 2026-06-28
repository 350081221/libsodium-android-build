package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "progress", "Lkotlin/r2;", "invoke", "(FLandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailItem$2$1 extends n0 implements q<Float, Composer, Integer, r2> {
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ p<Composer, Integer, r2> $icon;
    final /* synthetic */ p<Composer, Integer, r2> $styledLabel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationRailKt$NavigationRailItem$2$1(boolean z4, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2) {
        super(3);
        this.$alwaysShowLabel = z4;
        this.$icon = pVar;
        this.$styledLabel = pVar2;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(Float f5, Composer composer, Integer num) {
        invoke(f5.floatValue(), composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(float f5, @m Composer composer, int i5) {
        if ((i5 & 14) == 0) {
            i5 |= composer.changed(f5) ? 4 : 2;
        }
        if ((i5 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(670576792, i5, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:250)");
        }
        if (this.$alwaysShowLabel) {
            f5 = 1.0f;
        }
        NavigationRailKt.NavigationRailItemBaselineLayout(this.$icon, this.$styledLabel, f5, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
