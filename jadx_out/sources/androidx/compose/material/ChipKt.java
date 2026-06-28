package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0090\u0001\u0010\u0015\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aÆ\u0001\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00182\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f\"\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f\"\u0014\u0010\"\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001f\"\u0014\u0010$\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001f\"\u0014\u0010%\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001f\"\u0014\u0010&\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001f¨\u0006*²\u0006\f\u0010(\u001a\u00020'8\nX\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u00020'8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/foundation/BorderStroke;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/material/ChipColors;", "colors", "Landroidx/compose/runtime/Composable;", "leadingIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/u;", "content", "Chip", "(Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lv3/p;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "FilterChip", "(ZLv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lv3/p;Lv3/p;Lv3/p;Lv3/q;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/unit/Dp;", "HorizontalPadding", "F", "LeadingIconStartSpacing", "LeadingIconEndSpacing", "TrailingIconSpacing", "", "SurfaceOverlayOpacity", "SelectedOverlayOpacity", "SelectedIconContainerSize", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,761:1\n25#2:762\n25#2:769\n1116#3,6:763\n1116#3,6:770\n81#4:776\n154#5:777\n154#5:778\n154#5:779\n154#5:780\n154#5:781\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n*L\n93#1:762\n190#1:769\n93#1:763,6\n190#1:770,6\n100#1:776\n730#1:777\n735#1:778\n740#1:779\n745#1:780\n760#1:781\n*E\n"})
/* loaded from: classes.dex */
public final class ChipKt {
    private static final float LeadingIconEndSpacing;
    private static final float SelectedOverlayOpacity = 0.16f;
    private static final float SurfaceOverlayOpacity = 0.12f;
    private static final float TrailingIconSpacing;
    private static final float HorizontalPadding = Dp.m6044constructorimpl(12);
    private static final float LeadingIconStartSpacing = Dp.m6044constructorimpl(4);
    private static final float SelectedIconContainerSize = Dp.m6044constructorimpl(24);

    static {
        float f5 = 8;
        LeadingIconEndSpacing = Dp.m6044constructorimpl(f5);
        TrailingIconSpacing = Dp.m6044constructorimpl(f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0102  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Chip(@p4.l v3.a<kotlin.r2> r30, @p4.m androidx.compose.ui.Modifier r31, boolean r32, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r33, @p4.m androidx.compose.ui.graphics.Shape r34, @p4.m androidx.compose.foundation.BorderStroke r35, @p4.m androidx.compose.material.ChipColors r36, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r37, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt.Chip(v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ChipColors, v3.p, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Chip$lambda$1(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0260  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FilterChip(boolean r44, @p4.l v3.a<kotlin.r2> r45, @p4.m androidx.compose.ui.Modifier r46, boolean r47, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r48, @p4.m androidx.compose.ui.graphics.Shape r49, @p4.m androidx.compose.foundation.BorderStroke r50, @p4.m androidx.compose.material.SelectableChipColors r51, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r52, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r53, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r54, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r55, @p4.m androidx.compose.runtime.Composer r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt.FilterChip(boolean, v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.SelectableChipColors, v3.p, v3.p, v3.p, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
