package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextKt$BasicText$7 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Map<String, InlineTextContent> $inlineContent;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ l<TextLayoutResult, r2> $onTextLayout;
    final /* synthetic */ int $overflow;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ TextStyle $style;
    final /* synthetic */ AnnotatedString $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicTextKt$BasicText$7(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, l<? super TextLayoutResult, r2> lVar, int i5, boolean z4, int i6, Map<String, InlineTextContent> map, int i7, int i8) {
        super(2);
        this.$text = annotatedString;
        this.$modifier = modifier;
        this.$style = textStyle;
        this.$onTextLayout = lVar;
        this.$overflow = i5;
        this.$softWrap = z4;
        this.$maxLines = i6;
        this.$inlineContent = map;
        this.$$changed = i7;
        this.$$default = i8;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        BasicTextKt.m828BasicText4YKlhWE(this.$text, this.$modifier, this.$style, this.$onTextLayout, this.$overflow, this.$softWrap, this.$maxLines, this.$inlineContent, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
