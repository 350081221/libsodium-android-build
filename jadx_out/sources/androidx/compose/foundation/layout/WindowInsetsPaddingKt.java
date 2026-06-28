package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a/\u0010\r\u001a\u00020\u0000*\u00020\u00002!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007H\u0007\" \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "windowInsetsPadding", "consumeWindowInsets", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "consumedWindowInsets", "Lkotlin/r2;", "block", "onConsumedWindowInsetsChanged", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalConsumedWindowInsets", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalConsumedWindowInsets", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,286:1\n135#2:287\n135#2:288\n135#2:289\n135#2:290\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n57#1:287\n77#1:288\n101#1:289\n121#1:290\n*E\n"})
/* loaded from: classes.dex */
public final class WindowInsetsPaddingKt {

    @l
    private static final ProvidableModifierLocal<WindowInsets> ModifierLocalConsumedWindowInsets = ModifierLocalKt.modifierLocalOf(WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1.INSTANCE);

    @Stable
    @l
    public static final Modifier consumeWindowInsets(@l Modifier modifier, @l WindowInsets windowInsets) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$1(windowInsets) : InspectableValueKt.getNoInspectorInfo(), new WindowInsetsPaddingKt$consumeWindowInsets$2(windowInsets));
    }

    @l
    public static final ProvidableModifierLocal<WindowInsets> getModifierLocalConsumedWindowInsets() {
        return ModifierLocalConsumedWindowInsets;
    }

    @Stable
    @l
    public static final Modifier onConsumedWindowInsetsChanged(@l Modifier modifier, @l v3.l<? super WindowInsets, r2> lVar) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1(lVar);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2(lVar));
    }

    @Stable
    @l
    public static final Modifier windowInsetsPadding(@l Modifier modifier, @l WindowInsets windowInsets) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1(windowInsets);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPaddingKt$windowInsetsPadding$2(windowInsets));
    }

    @Stable
    @l
    public static final Modifier consumeWindowInsets(@l Modifier modifier, @l PaddingValues paddingValues) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2(paddingValues) : InspectableValueKt.getNoInspectorInfo(), new WindowInsetsPaddingKt$consumeWindowInsets$4(paddingValues));
    }
}
