package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\f\u0010\r\u001a\u00020\u0002*\u00020\u0002H\u0000\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "handlePosition", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "CursorHandle-ULxng0E", "(JLandroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "CursorHandle", "DefaultCursorHandle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "drawCursorHandle", "", "Sqrt2", "F", "Landroidx/compose/ui/unit/Dp;", "CursorHandleHeight", "getCursorHandleHeight", "()F", "CursorHandleWidth", "getCursorHandleWidth", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,82:1\n1116#2,6:83\n154#3:89\n88#4:90\n71#4:91\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n*L\n45#1:83,6\n35#1:89\n36#1:90\n36#1:91\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidCursorHandle_androidKt {
    private static final float CursorHandleHeight;
    private static final float CursorHandleWidth;
    private static final float Sqrt2 = 1.4142135f;

    static {
        float m6044constructorimpl = Dp.m6044constructorimpl(25);
        CursorHandleHeight = m6044constructorimpl;
        CursorHandleWidth = Dp.m6044constructorimpl(Dp.m6044constructorimpl(m6044constructorimpl * 2.0f) / 2.4142137f);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: CursorHandle-ULxng0E, reason: not valid java name */
    public static final void m826CursorHandleULxng0E(final long j5, @l Modifier modifier, @m p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-5185995);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(j5)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-5185995, i6, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:42)");
            }
            startRestartGroup.startReplaceableGroup(-1739374713);
            boolean changed = startRestartGroup.changed(j5);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OffsetProvider() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$1$1
                    @Override // androidx.compose.foundation.text.selection.OffsetProvider
                    /* renamed from: provide-F1C5BW0, reason: not valid java name */
                    public final long mo827provideF1C5BW0() {
                        return j5;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidSelectionHandles_androidKt.HandlePopup((OffsetProvider) rememberedValue, HandleReferencePoint.TopMiddle, ComposableLambdaKt.composableLambda(startRestartGroup, -1458480226, true, new AndroidCursorHandle_androidKt$CursorHandle$2(pVar, modifier)), startRestartGroup, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidCursorHandle_androidKt$CursorHandle$3(j5, modifier, pVar, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DefaultCursorHandle(@l Modifier modifier, @m Composer composer, int i5) {
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(694251107);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(694251107, i6, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:57)");
            }
            SpacerKt.Spacer(drawCursorHandle(SizeKt.m604sizeVpY3zN4(modifier, CursorHandleWidth, CursorHandleHeight)), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidCursorHandle_androidKt$DefaultCursorHandle$1(modifier, i5));
        }
    }

    @l
    public static final Modifier drawCursorHandle(@l Modifier modifier) {
        return ComposedModifierKt.composed$default(modifier, null, AndroidCursorHandle_androidKt$drawCursorHandle$1.INSTANCE, 1, null);
    }

    public static final float getCursorHandleHeight() {
        return CursorHandleHeight;
    }

    public static final float getCursorHandleWidth() {
        return CursorHandleWidth;
    }
}
