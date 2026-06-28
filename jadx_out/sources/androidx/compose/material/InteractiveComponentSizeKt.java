package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import p4.l;

@i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\n\u001a\u00020\r*\u00020\r\"\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u000e"}, d2 = {"LocalMinimumInteractiveComponentEnforcement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "getLocalMinimumInteractiveComponentEnforcement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalMinimumTouchTargetEnforcement", "getLocalMinimumTouchTargetEnforcement$annotations", "getLocalMinimumTouchTargetEnforcement", "minimumInteractiveComponentSize", "Landroidx/compose/ui/unit/DpSize;", "J", "Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,169:1\n154#2:170\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n*L\n168#1:170\n*E\n"})
/* loaded from: classes.dex */
public final class InteractiveComponentSizeKt {

    @l
    private static final ProvidableCompositionLocal<Boolean> LocalMinimumInteractiveComponentEnforcement;

    @l
    private static final ProvidableCompositionLocal<Boolean> LocalMinimumTouchTargetEnforcement;
    private static final long minimumInteractiveComponentSize;

    static {
        ProvidableCompositionLocal<Boolean> staticCompositionLocalOf = CompositionLocalKt.staticCompositionLocalOf(InteractiveComponentSizeKt$LocalMinimumInteractiveComponentEnforcement$1.INSTANCE);
        LocalMinimumInteractiveComponentEnforcement = staticCompositionLocalOf;
        LocalMinimumTouchTargetEnforcement = staticCompositionLocalOf;
        float f5 = 48;
        minimumInteractiveComponentSize = DpKt.m6066DpSizeYgX7TsA(Dp.m6044constructorimpl(f5), Dp.m6044constructorimpl(f5));
    }

    @l
    @ExperimentalMaterialApi
    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumInteractiveComponentEnforcement() {
        return LocalMinimumInteractiveComponentEnforcement;
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getLocalMinimumInteractiveComponentEnforcement$annotations() {
    }

    @l
    @ExperimentalMaterialApi
    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumTouchTargetEnforcement() {
        return LocalMinimumTouchTargetEnforcement;
    }

    @k(level = m.WARNING, message = "Use LocalMinimumInteractiveComponentEnforcement instead.", replaceWith = @b1(expression = "LocalMinimumInteractiveComponentEnforcement", imports = {}))
    @ExperimentalMaterialApi
    public static /* synthetic */ void getLocalMinimumTouchTargetEnforcement$annotations() {
    }

    @l
    public static final Modifier minimumInteractiveComponentSize(@l Modifier modifier) {
        return modifier.then(MinimumInteractiveModifier.INSTANCE);
    }
}
