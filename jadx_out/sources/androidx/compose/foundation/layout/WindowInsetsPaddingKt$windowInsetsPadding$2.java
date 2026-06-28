package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$windowInsetsPadding$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,286:1\n36#2:287\n1116#3,6:288\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$windowInsetsPadding$2\n*L\n62#1:287\n62#1:288,6\n*E\n"})
/* loaded from: classes.dex */
public final class WindowInsetsPaddingKt$windowInsetsPadding$2 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ WindowInsets $insets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsPaddingKt$windowInsetsPadding$2(WindowInsets windowInsets) {
        super(3);
        this.$insets = windowInsets;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @l
    @Composable
    public final Modifier invoke(@l Modifier modifier, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1415685722);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1415685722, i5, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:61)");
        }
        WindowInsets windowInsets = this.$insets;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(windowInsets);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new InsetsPaddingModifier(windowInsets);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return insetsPaddingModifier;
    }
}
