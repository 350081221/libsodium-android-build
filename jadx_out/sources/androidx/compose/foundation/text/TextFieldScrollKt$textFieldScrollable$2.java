package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,371:1\n74#2:372\n1116#3,6:373\n1116#3,6:381\n50#4:379\n49#4:380\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n*L\n69#1:372\n71#1:373,6\n84#1:381,6\n84#1:379\n84#1:380\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldScrollKt$textFieldScrollable$2 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2(TextFieldScrollerPosition textFieldScrollerPosition, boolean z4, MutableInteractionSource mutableInteractionSource) {
        super(3);
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$enabled = z4;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    @p4.l
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.Modifier invoke(@p4.l androidx.compose.ui.Modifier r13, @p4.m androidx.compose.runtime.Composer r14, int r15) {
        /*
            r12 = this;
            r13 = 805428266(0x3001dc2a, float:4.72428E-10)
            r14.startReplaceableGroup(r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L12
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r13, r15, r0, r1)
        L12:
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r13 = r14.consume(r13)
            androidx.compose.ui.unit.LayoutDirection r15 = androidx.compose.ui.unit.LayoutDirection.Rtl
            r0 = 1
            r1 = 0
            if (r13 != r15) goto L22
            r13 = r0
            goto L23
        L22:
            r13 = r1
        L23:
            androidx.compose.foundation.text.TextFieldScrollerPosition r15 = r12.$scrollerPosition
            androidx.compose.foundation.gestures.Orientation r15 = r15.getOrientation()
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r15 == r2) goto L32
            if (r13 != 0) goto L30
            goto L32
        L30:
            r7 = r1
            goto L33
        L32:
            r7 = r0
        L33:
            r13 = 753734506(0x2ced136a, float:6.7381005E-12)
            r14.startReplaceableGroup(r13)
            androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r12.$scrollerPosition
            boolean r13 = r14.changed(r13)
            androidx.compose.foundation.text.TextFieldScrollerPosition r15 = r12.$scrollerPosition
            java.lang.Object r2 = r14.rememberedValue()
            if (r13 != 0) goto L4f
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r13 = r13.getEmpty()
            if (r2 != r13) goto L57
        L4f:
            androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1 r2 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
            r2.<init>(r15)
            r14.updateRememberedValue(r2)
        L57:
            v3.l r2 = (v3.l) r2
            r14.endReplaceableGroup()
            androidx.compose.foundation.gestures.ScrollableState r13 = androidx.compose.foundation.gestures.ScrollableStateKt.rememberScrollableState(r2, r14, r1)
            androidx.compose.foundation.text.TextFieldScrollerPosition r15 = r12.$scrollerPosition
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r14.startReplaceableGroup(r2)
            boolean r2 = r14.changed(r13)
            boolean r3 = r14.changed(r15)
            r2 = r2 | r3
            java.lang.Object r3 = r14.rememberedValue()
            if (r2 != 0) goto L7f
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L87
        L7f:
            androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 r3 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
            r3.<init>(r15)
            r14.updateRememberedValue(r3)
        L87:
            r14.endReplaceableGroup()
            r4 = r3
            androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 r4 = (androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) r4
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r12.$scrollerPosition
            androidx.compose.foundation.gestures.Orientation r5 = r13.getOrientation()
            boolean r13 = r12.$enabled
            if (r13 == 0) goto Lab
            androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r12.$scrollerPosition
            float r13 = r13.getMaximum()
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto La6
            r13 = r0
            goto La7
        La6:
            r13 = r1
        La7:
            if (r13 != 0) goto Lab
            r6 = r0
            goto Lac
        Lab:
            r6 = r1
        Lac:
            r8 = 0
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = r12.$interactionSource
            r10 = 16
            r11 = 0
            androidx.compose.ui.Modifier r13 = androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r15 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r15 == 0) goto Lbf
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lbf:
            r14.endReplaceableGroup()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
