package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.i;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0002H\u0007\u001a&\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0007\u001a\u0014\u0010\u0011\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0007\u001a\f\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0007\u001a8\u0010\u0018\u001a\u00020\u0017*\u00020\u00022\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0087@¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "initialValue", "Landroidx/compose/foundation/text2/input/TextFieldState;", "TextFieldState", "Lkotlinx/coroutines/flow/i;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "textAsFlow", "", "initialText", "Landroidx/compose/ui/text/TextRange;", "initialSelectionInChars", "rememberTextFieldState-Le-punE", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/text2/input/TextFieldState;", "rememberTextFieldState", "text", "Lkotlin/r2;", "setTextAndPlaceCursorAtEnd", "setTextAndSelectAll", "clearText", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "", "forEachTextValue", "(Landroidx/compose/foundation/text2/input/TextFieldState;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n1#1,569:1\n1116#2,6:570\n123#3,4:576\n123#3,4:580\n123#3,4:584\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldStateKt\n*L\n472#1:570,6\n495#1:576,4\n520#1:580,4\n543#1:584,4\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldStateKt {
    @l
    public static final TextFieldState TextFieldState(@l TextFieldValue textFieldValue) {
        return new TextFieldState(textFieldValue.getText(), textFieldValue.m5783getSelectiond9O1mEE(), (w) null);
    }

    @ExperimentalFoundationApi
    public static final void clearText(@l TextFieldState textFieldState) {
        TextFieldBuffer startEdit = textFieldState.startEdit(textFieldState.getText());
        TextFieldBufferKt.delete(startEdit, 0, startEdit.getLength());
        TextFieldBufferKt.placeCursorAtEnd(startEdit);
        textFieldState.commitEdit(startEdit);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @androidx.compose.foundation.ExperimentalFoundationApi
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object forEachTextValue(@p4.l androidx.compose.foundation.text2.input.TextFieldState r4, @p4.l v3.p<? super androidx.compose.foundation.text2.input.TextFieldCharSequence, ? super kotlin.coroutines.d<? super kotlin.r2>, ? extends java.lang.Object> r5, @p4.l kotlin.coroutines.d<?> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.text2.input.TextFieldStateKt$forEachTextValue$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text2.input.TextFieldStateKt$forEachTextValue$1 r0 = (androidx.compose.foundation.text2.input.TextFieldStateKt$forEachTextValue$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text2.input.TextFieldStateKt$forEachTextValue$1 r0 = new androidx.compose.foundation.text2.input.TextFieldStateKt$forEachTextValue$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            kotlin.e1.n(r6)
            goto L41
        L31:
            kotlin.e1.n(r6)
            kotlinx.coroutines.flow.i r4 = textAsFlow(r4)
            r0.label = r3
            java.lang.Object r4 = kotlinx.coroutines.flow.k.A(r4, r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "textAsFlow expected not to complete without exception"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.TextFieldStateKt.forEachTextValue(androidx.compose.foundation.text2.input.TextFieldState, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    @l
    @Composable
    @ExperimentalFoundationApi
    /* renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final TextFieldState m1081rememberTextFieldStateLepunE(@m String str, long j5, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-855595317);
        if ((i6 & 1) != 0) {
            str = "";
        }
        if ((i6 & 2) != 0) {
            j5 = TextRangeKt.TextRange(str.length());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-855595317, i5, -1, "androidx.compose.foundation.text2.input.rememberTextFieldState (TextFieldState.kt:471)");
        }
        Object[] objArr = new Object[0];
        TextFieldState.Saver saver = TextFieldState.Saver.INSTANCE;
        composer.startReplaceableGroup(650674345);
        boolean changed = composer.changed(str) | composer.changed(j5);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextFieldStateKt$rememberTextFieldState$1$1(str, j5);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextFieldState textFieldState = (TextFieldState) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) saver, (String) null, (a) rememberedValue, composer, 56, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldState;
    }

    @ExperimentalFoundationApi
    public static final void setTextAndPlaceCursorAtEnd(@l TextFieldState textFieldState, @l String str) {
        TextFieldBuffer startEdit = textFieldState.startEdit(textFieldState.getText());
        startEdit.replace(0, startEdit.getLength(), str);
        TextFieldBufferKt.placeCursorAtEnd(startEdit);
        textFieldState.commitEdit(startEdit);
    }

    @ExperimentalFoundationApi
    public static final void setTextAndSelectAll(@l TextFieldState textFieldState, @l String str) {
        TextFieldBuffer startEdit = textFieldState.startEdit(textFieldState.getText());
        startEdit.replace(0, startEdit.getLength(), str);
        TextFieldBufferKt.selectAll(startEdit);
        textFieldState.commitEdit(startEdit);
    }

    @l
    @ExperimentalFoundationApi
    public static final i<TextFieldCharSequence> textAsFlow(@l TextFieldState textFieldState) {
        return SnapshotStateKt.snapshotFlow(new TextFieldStateKt$textAsFlow$1(textFieldState));
    }
}
