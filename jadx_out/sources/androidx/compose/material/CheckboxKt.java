package androidx.compose.material;

import androidx.compose.runtime.State;
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
import kotlin.i0;
import kotlin.jvm.internal.r1;
import t0.b;

@i0(d1 = {"\u0000`\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010 \u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a>\u0010)\u001a\u00020\u0003*\u00020\u00172\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020%H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(\"\u0014\u0010+\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010,\"\u0014\u0010.\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010,\"\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101\"\u0014\u00103\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101\"\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101\"\u0014\u00105\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068²\u0006\f\u00106\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u00107\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "Lkotlin/r2;", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/CheckboxColors;", "colors", "Checkbox", "(ZLv3/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "TriStateCheckbox", "(Landroidx/compose/ui/state/ToggleableState;Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", b.f22420d, "CheckboxImpl", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "boxColor", "borderColor", "", "radius", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawBox", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "Landroidx/compose/material/CheckDrawingCache;", "drawingCache", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V", "drawCheck", "", "BoxInDuration", "I", "BoxOutDuration", "CheckAnimationDuration", "Landroidx/compose/ui/unit/Dp;", "CheckboxRippleRadius", "F", "CheckboxDefaultPadding", "CheckboxSize", "StrokeWidth", "RadiusSize", "checkDrawFraction", "checkCenterGravitationShiftFraction", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,485:1\n25#2:486\n25#2:499\n25#2:524\n1116#3,6:487\n1116#3,6:493\n1116#3,6:500\n1116#3,6:525\n1116#3,6:531\n1163#4,4:506\n1083#4,5:510\n1163#4,4:515\n1083#4,5:519\n81#5:537\n81#5:538\n81#5:539\n81#5:540\n81#5:541\n154#6:542\n154#6:543\n154#6:544\n154#6:545\n154#6:546\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n*L\n91#1:486\n137#1:499\n297#1:524\n91#1:487,6\n96#1:493,6\n137#1:500,6\n297#1:525,6\n301#1:531,6\n266#1:506,4\n266#1:510,5\n282#1:515,4\n282#1:519,5\n266#1:537\n282#1:538\n298#1:539\n299#1:540\n300#1:541\n480#1:542\n481#1:543\n482#1:544\n483#1:545\n484#1:546\n*E\n"})
/* loaded from: classes.dex */
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxRippleRadius = Dp.m6044constructorimpl(24);
    private static final float CheckboxSize = Dp.m6044constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0060  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Checkbox(boolean r27, @p4.m v3.l<? super java.lang.Boolean, kotlin.r2> r28, @p4.m androidx.compose.ui.Modifier r29, boolean r30, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r31, @p4.m androidx.compose.material.CheckboxColors r32, @p4.m androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.Checkbox(boolean, v3.l, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b3  */
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
    /* JADX WARN: Type inference failed for: r15v8 */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CheckboxImpl(boolean r37, androidx.compose.ui.state.ToggleableState r38, androidx.compose.ui.Modifier r39, androidx.compose.material.CheckboxColors r40, androidx.compose.runtime.Composer r41, int r42) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.CheckboxImpl(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.Modifier, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$10(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CheckboxImpl$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CheckboxImpl$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$8(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$9(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0062  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TriStateCheckbox(@p4.l androidx.compose.ui.state.ToggleableState r24, @p4.m v3.a<kotlin.r2> r25, @p4.m androidx.compose.ui.Modifier r26, boolean r27, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r28, @p4.m androidx.compose.material.CheckboxColors r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.TriStateCheckbox(androidx.compose.ui.state.ToggleableState, v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.CheckboxColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawBox-1wkBAMs, reason: not valid java name */
    public static final void m1256drawBox1wkBAMs(DrawScope drawScope, long j5, long j6, float f5, float f6) {
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
    public static final void m1257drawCheck3IgeMak(DrawScope drawScope, long j5, float f5, float f6, float f7, CheckDrawingCache checkDrawingCache) {
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
