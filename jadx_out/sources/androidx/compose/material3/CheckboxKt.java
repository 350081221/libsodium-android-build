package androidx.compose.material3;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import com.android.dx.io.Opcodes;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000`\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010 \u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a>\u0010)\u001a\u00020\u0003*\u00020\u00172\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020%H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(\"\u0014\u0010+\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010,\"\u0014\u0010.\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010,\"\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101\"\u0014\u00103\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101\"\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"", "checked", "Lkotlin/Function1;", "Lkotlin/r2;", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/material3/CheckboxColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Checkbox", "(ZLv3/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "TriStateCheckbox", "(Landroidx/compose/ui/state/ToggleableState;Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", t0.b.f22420d, "CheckboxImpl", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "boxColor", "borderColor", "", "radius", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawBox", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "Landroidx/compose/material3/CheckDrawingCache;", "drawingCache", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material3/CheckDrawingCache;)V", "drawCheck", "", "BoxInDuration", "I", "BoxOutDuration", "CheckAnimationDuration", "Landroidx/compose/ui/unit/Dp;", "CheckboxDefaultPadding", "F", "CheckboxSize", "StrokeWidth", "RadiusSize", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,597:1\n1116#2,6:598\n1116#2,6:604\n1116#2,6:610\n1116#2,6:635\n1116#2,6:641\n75#3:616\n1163#4,4:617\n1083#4,5:621\n1163#4,4:626\n1083#4,5:630\n154#5:647\n154#5:648\n154#5:649\n154#5:650\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n*L\n94#1:598,6\n99#1:604,6\n144#1:610,6\n297#1:635,6\n305#1:641,6\n157#1:616\n266#1:617,4\n266#1:621,5\n282#1:626,4\n282#1:630,5\n593#1:647\n594#1:648\n595#1:649\n596#1:650\n*E\n"})
/* loaded from: classes.dex */
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxSize = Dp.m6044constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f5 = 2;
        CheckboxDefaultPadding = Dp.m6044constructorimpl(f5);
        StrokeWidth = Dp.m6044constructorimpl(f5);
        RadiusSize = Dp.m6044constructorimpl(f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0061  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Checkbox(boolean r19, @p4.m v3.l<? super java.lang.Boolean, kotlin.r2> r20, @p4.m androidx.compose.ui.Modifier r21, boolean r22, @p4.m androidx.compose.material3.CheckboxColors r23, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r24, @p4.m androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.Checkbox(boolean, v3.l, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.CheckboxColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0215  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CheckboxImpl(boolean r37, androidx.compose.ui.state.ToggleableState r38, androidx.compose.ui.Modifier r39, androidx.compose.material3.CheckboxColors r40, androidx.compose.runtime.Composer r41, int r42) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.CheckboxImpl(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.Modifier, androidx.compose.material3.CheckboxColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0063  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TriStateCheckbox(@p4.l androidx.compose.ui.state.ToggleableState r19, @p4.m v3.a<kotlin.r2> r20, @p4.m androidx.compose.ui.Modifier r21, boolean r22, @p4.m androidx.compose.material3.CheckboxColors r23, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r24, @p4.m androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.TriStateCheckbox(androidx.compose.ui.state.ToggleableState, v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.CheckboxColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawBox-1wkBAMs, reason: not valid java name */
    public static final void m1645drawBox1wkBAMs(DrawScope drawScope, long j5, long j6, float f5, float f6) {
        float f7 = f6 / 2.0f;
        Stroke stroke = new Stroke(f6, 0.0f, 0, 0, null, 30, null);
        float m3562getWidthimpl = Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc());
        if (Color.m3735equalsimpl0(j5, j6)) {
            DrawScope.m4274drawRoundRectuAw5IA$default(drawScope, j5, 0L, SizeKt.Size(m3562getWidthimpl, m3562getWidthimpl), CornerRadiusKt.CornerRadius$default(f5, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, Opcodes.USHR_INT_LIT8, null);
            return;
        }
        float f8 = m3562getWidthimpl - (2 * f6);
        DrawScope.m4274drawRoundRectuAw5IA$default(drawScope, j5, OffsetKt.Offset(f6, f6), SizeKt.Size(f8, f8), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f5 - f6), 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, Opcodes.SHL_INT_LIT8, null);
        float f9 = m3562getWidthimpl - f6;
        DrawScope.m4274drawRoundRectuAw5IA$default(drawScope, j6, OffsetKt.Offset(f7, f7), SizeKt.Size(f9, f9), CornerRadiusKt.CornerRadius$default(f5 - f7, 0.0f, 2, null), stroke, 0.0f, null, 0, Opcodes.SHL_INT_LIT8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCheck-3IgeMak, reason: not valid java name */
    public static final void m1646drawCheck3IgeMak(DrawScope drawScope, long j5, float f5, float f6, float f7, CheckDrawingCache checkDrawingCache) {
        Stroke stroke = new Stroke(f7, 0.0f, StrokeCap.Companion.m4087getSquareKaPHkGw(), 0, null, 26, null);
        float m3562getWidthimpl = Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc());
        float lerp = MathHelpersKt.lerp(0.4f, 0.5f, f6);
        float lerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f6);
        float lerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f6);
        float lerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f6);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * m3562getWidthimpl, lerp3 * m3562getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(lerp * m3562getWidthimpl, lerp2 * m3562getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(0.8f * m3562getWidthimpl, m3562getWidthimpl * lerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f5, checkDrawingCache.getPathToDraw(), true);
        DrawScope.m4268drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j5, 0.0f, stroke, null, 0, 52, null);
    }
}
