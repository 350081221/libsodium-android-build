package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WindowInsetsConnection_androidKt$imeNestedScroll$2 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    public static final WindowInsetsConnection_androidKt$imeNestedScroll$2 INSTANCE = new WindowInsetsConnection_androidKt$imeNestedScroll$2();

    WindowInsetsConnection_androidKt$imeNestedScroll$2() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @l
    @Composable
    public final Modifier invoke(@l Modifier modifier, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-369978792);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-369978792, i5, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:80)");
        }
        Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifier, WindowInsetsConnection_androidKt.m625rememberWindowInsetsConnectionVRgvIgI(WindowInsetsHolder.Companion.current(composer, 8).getIme(), WindowInsetsSides.Companion.m647getBottomJoeWqyM(), composer, 48), null, 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return nestedScroll$default;
    }
}
