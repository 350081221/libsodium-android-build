package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextKt$Text$4 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ FontFamily $fontFamily;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ FontStyle $fontStyle;
    final /* synthetic */ FontWeight $fontWeight;
    final /* synthetic */ long $letterSpacing;
    final /* synthetic */ long $lineHeight;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ l<TextLayoutResult, r2> $onTextLayout;
    final /* synthetic */ int $overflow;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ TextStyle $style;
    final /* synthetic */ String $text;
    final /* synthetic */ TextAlign $textAlign;
    final /* synthetic */ TextDecoration $textDecoration;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextKt$Text$4(String str, Modifier modifier, long j5, long j6, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j7, TextDecoration textDecoration, TextAlign textAlign, long j8, int i5, boolean z4, int i6, l<? super TextLayoutResult, r2> lVar, TextStyle textStyle, int i7, int i8, int i9) {
        super(2);
        this.$text = str;
        this.$modifier = modifier;
        this.$color = j5;
        this.$fontSize = j6;
        this.$fontStyle = fontStyle;
        this.$fontWeight = fontWeight;
        this.$fontFamily = fontFamily;
        this.$letterSpacing = j7;
        this.$textDecoration = textDecoration;
        this.$textAlign = textAlign;
        this.$lineHeight = j8;
        this.$overflow = i5;
        this.$softWrap = z4;
        this.$maxLines = i6;
        this.$onTextLayout = lVar;
        this.$style = textStyle;
        this.$$changed = i7;
        this.$$changed1 = i8;
        this.$$default = i9;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        TextKt.m1516TextfLXpl1I(this.$text, this.$modifier, this.$color, this.$fontSize, this.$fontStyle, this.$fontWeight, this.$fontFamily, this.$letterSpacing, this.$textDecoration, this.$textAlign, this.$lineHeight, this.$overflow, this.$softWrap, this.$maxLines, this.$onTextLayout, this.$style, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
