package androidx.compose.foundation.text2;

import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000\u0092\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aï\u0001\u0010'\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u001228\b\u0002\u0010\u001c\u001a2\u0012\u0004\u0012\u00020\u0015\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014¢\u0006\u0002\b\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(\u001aÛ\u0001\u0010'\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u001228\b\u0002\u0010\u001c\u001a2\u0012\u0004\u0012\u00020\u0015\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014¢\u0006\u0002\b\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010+\u001a\u0017\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b.\u0010/\u001a\u0017\u00100\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b0\u0010/\"\u001a\u00101\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u00104¨\u00067²\u0006\u000e\u00106\u001a\u0002058\n@\nX\u008a\u008e\u0002"}, d2 = {"", b.f22420d, "Lkotlin/Function1;", "Lkotlin/r2;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/foundation/text2/input/InputTransformation;", "inputTransformation", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "lineLimits", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/v0;", "name", "getResult", "Lkotlin/u;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "codepointTransformation", "Landroidx/compose/foundation/text2/TextFieldDecorator;", "decorator", "Landroidx/compose/foundation/ScrollState;", "scrollState", "BasicTextField2", "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lv3/p;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text2/input/TextFieldState;", "state", "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lv3/p;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "selectionState", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V", "TextFieldSelectionHandles", "DefaultTextFieldDecorator", "Landroidx/compose/foundation/text2/TextFieldDecorator;", "getDefaultTextFieldDecorator$annotations", "()V", "Landroidx/compose/ui/text/input/TextFieldValue;", "valueWithSelection", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,543:1\n25#2:544\n25#2:551\n25#2:567\n67#2,3:574\n66#2:577\n36#2:585\n36#2:592\n456#2,8:619\n464#2,3:633\n467#2,3:637\n1116#3,6:545\n1116#3,6:552\n1116#3,6:558\n1116#3,6:568\n1116#3,3:578\n1119#3,3:582\n1116#3,6:586\n1116#3,6:593\n1116#3,6:642\n74#4:564\n74#4:565\n74#4:566\n74#4:599\n74#4:600\n74#4:601\n1#5:581\n68#6,6:602\n74#6:636\n78#6:641\n79#7,11:608\n92#7:640\n3737#8,6:627\n81#9:648\n107#9,2:649\n*S KotlinDebug\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt\n*L\n191#1:544\n201#1:551\n342#1:567\n347#1:574,3\n347#1:577\n358#1:585\n360#1:592\n424#1:619,8\n424#1:633,3\n424#1:637,3\n191#1:545,6\n201#1:552,6\n216#1:558,6\n342#1:568,6\n347#1:578,3\n347#1:582,3\n358#1:586,6\n360#1:593,6\n494#1:642,6\n336#1:564\n337#1:565\n338#1:566\n370#1:599\n371#1:600\n372#1:601\n424#1:602,6\n424#1:636\n424#1:641\n424#1:608,11\n424#1:640\n424#1:627,6\n201#1:648\n201#1:649,2\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTextField2Kt {

    @l
    private static final TextFieldDecorator DefaultTextFieldDecorator = BasicTextField2Kt$DefaultTextFieldDecorator$1.INSTANCE;

    /* JADX WARN: Removed duplicated region for block: B:101:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0264  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField2(@p4.l java.lang.String r40, @p4.l v3.l<? super java.lang.String, kotlin.r2> r41, @p4.m androidx.compose.ui.Modifier r42, boolean r43, boolean r44, @p4.m androidx.compose.foundation.text2.input.InputTransformation r45, @p4.m androidx.compose.ui.text.TextStyle r46, @p4.m androidx.compose.foundation.text.KeyboardOptions r47, @p4.m androidx.compose.foundation.text.KeyboardActions r48, @p4.m androidx.compose.foundation.text2.input.TextFieldLineLimits r49, @p4.m v3.p<? super androidx.compose.ui.unit.Density, ? super v3.a<androidx.compose.ui.text.TextLayoutResult>, kotlin.r2> r50, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r51, @p4.m androidx.compose.ui.graphics.Brush r52, @p4.m androidx.compose.foundation.text2.input.CodepointTransformation r53, @p4.m androidx.compose.foundation.text2.TextFieldDecorator r54, @p4.m androidx.compose.foundation.ScrollState r55, @p4.m androidx.compose.runtime.Composer r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2(java.lang.String, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text2.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.foundation.text2.input.TextFieldLineLimits, v3.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text2.input.CodepointTransformation, androidx.compose.foundation.text2.TextFieldDecorator, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField2$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldCursorHandle(@l TextFieldSelectionState textFieldSelectionState, @m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(773754631);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(773754631, i5, -1, "androidx.compose.foundation.text2.TextFieldCursorHandle (BasicTextField2.kt:487)");
        }
        TextFieldHandleState cursorHandle = textFieldSelectionState.getCursorHandle();
        if (cursorHandle.getVisible()) {
            long m1156getPositionF1C5BW0 = cursorHandle.m1156getPositionF1C5BW0();
            Modifier.Companion companion = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(1290415310);
            boolean changed = startRestartGroup.changed(cursorHandle);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BasicTextField2Kt$TextFieldCursorHandle$1$1(cursorHandle);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m826CursorHandleULxng0E(m1156getPositionF1C5BW0, SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics$default(companion, false, (v3.l) rememberedValue, 1, null), textFieldSelectionState, new BasicTextField2Kt$TextFieldCursorHandle$2(textFieldSelectionState, null)), null, startRestartGroup, 384);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BasicTextField2Kt$TextFieldCursorHandle$3(textFieldSelectionState, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldSelectionHandles(@l final TextFieldSelectionState textFieldSelectionState, @m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-1194626330);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1194626330, i5, -1, "androidx.compose.foundation.text2.TextFieldSelectionHandles (BasicTextField2.kt:512)");
        }
        TextFieldHandleState startSelectionHandle = textFieldSelectionState.getStartSelectionHandle();
        startRestartGroup.startReplaceableGroup(-1453543870);
        if (startSelectionHandle.getVisible()) {
            AndroidSelectionHandles_androidKt.SelectionHandle(new OffsetProvider() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$1
                @Override // androidx.compose.foundation.text.selection.OffsetProvider
                /* renamed from: provide-F1C5BW0 */
                public final long mo827provideF1C5BW0() {
                    return TextFieldSelectionState.this.getStartSelectionHandle().m1156getPositionF1C5BW0();
                }
            }, true, startSelectionHandle.getDirection(), startSelectionHandle.getHandlesCrossed(), SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textFieldSelectionState, new BasicTextField2Kt$TextFieldSelectionHandles$2(textFieldSelectionState, null)), startRestartGroup, 48);
        }
        startRestartGroup.endReplaceableGroup();
        TextFieldHandleState endSelectionHandle = textFieldSelectionState.getEndSelectionHandle();
        if (endSelectionHandle.getVisible()) {
            AndroidSelectionHandles_androidKt.SelectionHandle(new OffsetProvider() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$3
                @Override // androidx.compose.foundation.text.selection.OffsetProvider
                /* renamed from: provide-F1C5BW0 */
                public final long mo827provideF1C5BW0() {
                    return TextFieldSelectionState.this.getEndSelectionHandle().m1156getPositionF1C5BW0();
                }
            }, false, endSelectionHandle.getDirection(), endSelectionHandle.getHandlesCrossed(), SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textFieldSelectionState, new BasicTextField2Kt$TextFieldSelectionHandles$4(textFieldSelectionState, null)), startRestartGroup, 48);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BasicTextField2Kt$TextFieldSelectionHandles$5(textFieldSelectionState, i5));
        }
    }

    private static /* synthetic */ void getDefaultTextFieldDecorator$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0384, code lost:
    
        if (r14 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L240;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03da  */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v32, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r46v0, types: [java.lang.Object, androidx.compose.foundation.text2.TextFieldDecorator] */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField2(@p4.l androidx.compose.foundation.text2.input.TextFieldState r33, @p4.m androidx.compose.ui.Modifier r34, boolean r35, boolean r36, @p4.m androidx.compose.foundation.text2.input.InputTransformation r37, @p4.m androidx.compose.ui.text.TextStyle r38, @p4.m androidx.compose.foundation.text.KeyboardOptions r39, @p4.m androidx.compose.foundation.text.KeyboardActions r40, @p4.m androidx.compose.foundation.text2.input.TextFieldLineLimits r41, @p4.m v3.p<? super androidx.compose.ui.unit.Density, ? super v3.a<androidx.compose.ui.text.TextLayoutResult>, kotlin.r2> r42, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r43, @p4.m androidx.compose.ui.graphics.Brush r44, @p4.m androidx.compose.foundation.text2.input.CodepointTransformation r45, @p4.m androidx.compose.foundation.text2.TextFieldDecorator r46, @p4.m androidx.compose.foundation.ScrollState r47, @p4.m androidx.compose.runtime.Composer r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 1474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2(androidx.compose.foundation.text2.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text2.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.foundation.text2.input.TextFieldLineLimits, v3.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text2.input.CodepointTransformation, androidx.compose.foundation.text2.TextFieldDecorator, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
