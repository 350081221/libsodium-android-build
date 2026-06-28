package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import java.util.List;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ScaffoldKt$LegacyScaffoldLayout$1$1$1$bodyContentPlaceables$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ Integer $bottomBarHeight;
    final /* synthetic */ List<Placeable> $bottomBarPlaceables;
    final /* synthetic */ v3.q<PaddingValues, Composer, Integer, r2> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
    final /* synthetic */ int $topBarHeight;
    final /* synthetic */ List<Placeable> $topBarPlaceables;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$LegacyScaffoldLayout$1$1$1$bodyContentPlaceables$1(WindowInsets windowInsets, SubcomposeMeasureScope subcomposeMeasureScope, List<? extends Placeable> list, int i5, List<? extends Placeable> list2, Integer num, v3.q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$contentWindowInsets = windowInsets;
        this.$this_SubcomposeLayout = subcomposeMeasureScope;
        this.$topBarPlaceables = list;
        this.$topBarHeight = i5;
        this.$bottomBarPlaceables = list2;
        this.$bottomBarHeight = num;
        this.$content = qVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        float mo301toDpu2uoSUM;
        float mo503calculateBottomPaddingD9Ej5fM;
        Integer num;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(495329982, i5, -1, "androidx.compose.material3.LegacyScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:456)");
        }
        PaddingValues asPaddingValues = WindowInsetsKt.asPaddingValues(this.$contentWindowInsets, this.$this_SubcomposeLayout);
        if (this.$topBarPlaceables.isEmpty()) {
            mo301toDpu2uoSUM = asPaddingValues.mo506calculateTopPaddingD9Ej5fM();
        } else {
            mo301toDpu2uoSUM = this.$this_SubcomposeLayout.mo301toDpu2uoSUM(this.$topBarHeight);
        }
        if (!this.$bottomBarPlaceables.isEmpty() && (num = this.$bottomBarHeight) != null) {
            mo503calculateBottomPaddingD9Ej5fM = this.$this_SubcomposeLayout.mo301toDpu2uoSUM(num.intValue());
        } else {
            mo503calculateBottomPaddingD9Ej5fM = asPaddingValues.mo503calculateBottomPaddingD9Ej5fM();
        }
        this.$content.invoke(PaddingKt.m549PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(asPaddingValues, this.$this_SubcomposeLayout.getLayoutDirection()), mo301toDpu2uoSUM, PaddingKt.calculateEndPadding(asPaddingValues, this.$this_SubcomposeLayout.getLayoutDirection()), mo503calculateBottomPaddingD9Ej5fM), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
