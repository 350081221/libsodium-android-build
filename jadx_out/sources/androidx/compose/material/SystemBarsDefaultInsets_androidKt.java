package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"systemBarsForVisualComponents", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets$Companion;", "getSystemBarsForVisualComponents", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SystemBarsDefaultInsets_androidKt {
    @l
    @h(name = "getSystemBarsForVisualComponents")
    @Composable
    public static final WindowInsets getSystemBarsForVisualComponents(@l WindowInsets.Companion companion, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1520067638);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1520067638, i5, -1, "androidx.compose.material.<get-systemBarsForVisualComponents> (SystemBarsDefaultInsets.android.kt:24)");
        }
        WindowInsets systemBars = WindowInsets_androidKt.getSystemBars(companion, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemBars;
    }
}
