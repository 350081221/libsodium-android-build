package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Lkotlin/r2;", "TextFieldSelectionHandle", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "isSelectionHandleInVisibleBound", "Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "Landroidx/compose/ui/geometry/Offset;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "calculateSelectionMagnifierCenterAndroid", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1049:1\n50#2:1050\n49#2:1051\n1116#3,6:1052\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n*L\n959#1:1050\n959#1:1051\n959#1:1052,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionManagerKt {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldSelectionHandle(final boolean z4, @l ResolvedTextDirection resolvedTextDirection, @l final TextFieldSelectionManager textFieldSelectionManager, @m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-1344558920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344558920, i5, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:957)");
        }
        Boolean valueOf = Boolean.valueOf(z4);
        startRestartGroup.startReplaceableGroup(511388516);
        boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(textFieldSelectionManager);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = textFieldSelectionManager.handleDragObserver$foundation_release(z4);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
        OffsetProvider offsetProvider = new OffsetProvider() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1
            @Override // androidx.compose.foundation.text.selection.OffsetProvider
            /* renamed from: provide-F1C5BW0 */
            public final long mo827provideF1C5BW0() {
                return TextFieldSelectionManager.this.m1053getHandlePositiontuRUvjQ$foundation_release(z4);
            }
        };
        boolean m5544getReversedimpl = TextRange.m5544getReversedimpl(textFieldSelectionManager.getValue$foundation_release().m5783getSelectiond9O1mEE());
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textDragObserver, new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(textDragObserver, null));
        int i6 = i5 << 3;
        AndroidSelectionHandles_androidKt.SelectionHandle(offsetProvider, z4, resolvedTextDirection, m5544getReversedimpl, pointerInput, startRestartGroup, (i6 & 112) | (i6 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextFieldSelectionManagerKt$TextFieldSelectionHandle$3(z4, resolvedTextDirection, textFieldSelectionManager, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m1054calculateSelectionMagnifierCenterAndroidO0kMr_c(@p4.l androidx.compose.foundation.text.selection.TextFieldSelectionManager r7, long r8) {
        /*
            androidx.compose.ui.geometry.Offset r0 = r7.m1051getCurrentDragPosition_m7T9E()
            if (r0 == 0) goto Lf3
            long r0 = r0.m3503unboximpl()
            androidx.compose.ui.text.AnnotatedString r2 = r7.getTransformedText$foundation_release()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1f
            int r2 = r2.length()
            if (r2 != 0) goto L1a
            r2 = r3
            goto L1b
        L1a:
            r2 = r4
        L1b:
            if (r2 != 0) goto L1f
            r2 = r3
            goto L20
        L1f:
            r2 = r4
        L20:
            if (r2 != 0) goto L29
            androidx.compose.ui.geometry.Offset$Companion r7 = androidx.compose.ui.geometry.Offset.Companion
            long r7 = r7.m3508getUnspecifiedF1C5BW0()
            return r7
        L29:
            androidx.compose.foundation.text.Handle r2 = r7.getDraggingHandle()
            r5 = -1
            if (r2 != 0) goto L32
            r2 = r5
            goto L3a
        L32:
            int[] r6 = androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r6[r2]
        L3a:
            if (r2 == r5) goto Lec
            r5 = 2
            if (r2 == r3) goto L57
            if (r2 == r5) goto L57
            r3 = 3
            if (r2 != r3) goto L51
            androidx.compose.ui.text.input.TextFieldValue r2 = r7.getValue$foundation_release()
            long r2 = r2.m5783getSelectiond9O1mEE()
            int r2 = androidx.compose.ui.text.TextRange.m5540getEndimpl(r2)
            goto L63
        L51:
            kotlin.j0 r7 = new kotlin.j0
            r7.<init>()
            throw r7
        L57:
            androidx.compose.ui.text.input.TextFieldValue r2 = r7.getValue$foundation_release()
            long r2 = r2.m5783getSelectiond9O1mEE()
            int r2 = androidx.compose.ui.text.TextRange.m5545getStartimpl(r2)
        L63:
            androidx.compose.foundation.text.TextFieldState r3 = r7.getState$foundation_release()
            if (r3 == 0) goto Le5
            androidx.compose.foundation.text.TextLayoutResultProxy r3 = r3.getLayoutResult()
            if (r3 != 0) goto L70
            goto Le5
        L70:
            androidx.compose.foundation.text.TextFieldState r6 = r7.getState$foundation_release()
            if (r6 == 0) goto Lde
            androidx.compose.foundation.text.TextDelegate r6 = r6.getTextDelegate()
            if (r6 == 0) goto Lde
            androidx.compose.ui.text.AnnotatedString r6 = r6.getText()
            if (r6 != 0) goto L83
            goto Lde
        L83:
            androidx.compose.ui.text.input.OffsetMapping r7 = r7.getOffsetMapping$foundation_release()
            int r7 = r7.originalToTransformed(r2)
            int r2 = r6.length()
            int r7 = kotlin.ranges.s.I(r7, r4, r2)
            long r0 = r3.m931translateDecorationToInnerCoordinatesMKHz9U$foundation_release(r0)
            float r0 = androidx.compose.ui.geometry.Offset.m3493getXimpl(r0)
            androidx.compose.ui.text.TextLayoutResult r1 = r3.getValue()
            int r7 = r1.getLineForOffset(r7)
            float r2 = r1.getLineLeft(r7)
            float r3 = r1.getLineRight(r7)
            float r4 = java.lang.Math.min(r2, r3)
            float r2 = java.lang.Math.max(r2, r3)
            float r2 = kotlin.ranges.s.H(r0, r4, r2)
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r8 = androidx.compose.ui.unit.IntSize.m6214getWidthimpl(r8)
            int r8 = r8 / r5
            float r8 = (float) r8
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 <= 0) goto Lcd
            androidx.compose.ui.geometry.Offset$Companion r7 = androidx.compose.ui.geometry.Offset.Companion
            long r7 = r7.m3508getUnspecifiedF1C5BW0()
            return r7
        Lcd:
            float r8 = r1.getLineTop(r7)
            float r7 = r1.getLineBottom(r7)
            float r7 = r7 - r8
            float r9 = (float) r5
            float r7 = r7 / r9
            float r7 = r7 + r8
            long r7 = androidx.compose.ui.geometry.OffsetKt.Offset(r2, r7)
            return r7
        Lde:
            androidx.compose.ui.geometry.Offset$Companion r7 = androidx.compose.ui.geometry.Offset.Companion
            long r7 = r7.m3508getUnspecifiedF1C5BW0()
            return r7
        Le5:
            androidx.compose.ui.geometry.Offset$Companion r7 = androidx.compose.ui.geometry.Offset.Companion
            long r7 = r7.m3508getUnspecifiedF1C5BW0()
            return r7
        Lec:
            androidx.compose.ui.geometry.Offset$Companion r7 = androidx.compose.ui.geometry.Offset.Companion
            long r7 = r7.m3508getUnspecifiedF1C5BW0()
            return r7
        Lf3:
            androidx.compose.ui.geometry.Offset$Companion r7 = androidx.compose.ui.geometry.Offset.Companion
            long r7 = r7.m3508getUnspecifiedF1C5BW0()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.m1054calculateSelectionMagnifierCenterAndroidO0kMr_c(androidx.compose.foundation.text.selection.TextFieldSelectionManager, long):long");
    }

    public static final boolean isSelectionHandleInVisibleBound(@l TextFieldSelectionManager textFieldSelectionManager, boolean z4) {
        LayoutCoordinates layoutCoordinates;
        Rect visibleBounds;
        TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release != null && (layoutCoordinates = state$foundation_release.getLayoutCoordinates()) != null && (visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates)) != null) {
            return SelectionManagerKt.m1031containsInclusiveUv8p0NA(visibleBounds, textFieldSelectionManager.m1053getHandlePositiontuRUvjQ$foundation_release(z4));
        }
        return false;
    }
}
