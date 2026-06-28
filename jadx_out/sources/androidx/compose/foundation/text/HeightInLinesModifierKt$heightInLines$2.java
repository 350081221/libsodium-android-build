package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,135:1\n74#2:136\n74#2:137\n74#2:138\n50#3:139\n49#3:140\n50#3:147\n49#3:148\n83#3,3:155\n83#3,3:164\n1116#4,6:141\n1116#4,6:149\n1116#4,6:158\n1116#4,6:167\n81#5:173\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n*L\n63#1:136\n64#1:137\n65#1:138\n69#1:139\n69#1:140\n72#1:147\n72#1:148\n81#1:155,3\n97#1:164,3\n69#1:141,6\n72#1:149,6\n81#1:158,6\n97#1:167,6\n72#1:173\n*E\n"})
/* loaded from: classes.dex */
public final class HeightInLinesModifierKt$heightInLines$2 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ TextStyle $textStyle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeightInLinesModifierKt$heightInLines$2(int i5, int i6, TextStyle textStyle) {
        super(3);
        this.$minLines = i5;
        this.$maxLines = i6;
        this.$textStyle = textStyle;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @l
    @Composable
    public final Modifier invoke(@l Modifier modifier, @m Composer composer, int i5) {
        composer.startReplaceableGroup(408240218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(408240218, i5, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
        }
        HeightInLinesModifierKt.validateMinMaxLines(this.$minLines, this.$maxLines);
        if (this.$minLines == 1 && this.$maxLines == Integer.MAX_VALUE) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return companion;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        TextStyle textStyle = this.$textStyle;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(textStyle) | composer.changed(layoutDirection);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextStyle textStyle2 = (TextStyle) rememberedValue;
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(resolver) | composer.changed(textStyle2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            FontFamily fontFamily = textStyle2.getFontFamily();
            FontWeight fontWeight = textStyle2.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m5577getFontStyle4Lr2A7w = textStyle2.m5577getFontStyle4Lr2A7w();
            int m5657unboximpl = m5577getFontStyle4Lr2A7w != null ? m5577getFontStyle4Lr2A7w.m5657unboximpl() : FontStyle.Companion.m5661getNormal_LCdwA();
            FontSynthesis m5578getFontSynthesisZQGJjVo = textStyle2.m5578getFontSynthesisZQGJjVo();
            rememberedValue2 = resolver.mo5629resolveDPcqOEQ(fontFamily, fontWeight, m5657unboximpl, m5578getFontSynthesisZQGJjVo != null ? m5578getFontSynthesisZQGJjVo.m5670unboximpl() : FontSynthesis.Companion.m5671getAllGVVA2EU());
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        State state = (State) rememberedValue2;
        Object[] objArr = {density, resolver, this.$textStyle, layoutDirection, state.getValue()};
        composer.startReplaceableGroup(-568225417);
        boolean z4 = false;
        for (int i6 = 0; i6 < 5; i6++) {
            z4 |= composer.changed(objArr[i6]);
        }
        Object rememberedValue3 = composer.rememberedValue();
        if (z4 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = Integer.valueOf(IntSize.m6213getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        int intValue = ((Number) rememberedValue3).intValue();
        Object[] objArr2 = {density, resolver, this.$textStyle, layoutDirection, state.getValue()};
        composer.startReplaceableGroup(-568225417);
        boolean z5 = false;
        for (int i7 = 0; i7 < 5; i7++) {
            z5 |= composer.changed(objArr2[i7]);
        }
        Object rememberedValue4 = composer.rememberedValue();
        if (z5 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = Integer.valueOf(IntSize.m6213getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        int intValue2 = ((Number) rememberedValue4).intValue() - intValue;
        int i8 = this.$minLines;
        Integer valueOf = i8 == 1 ? null : Integer.valueOf(((i8 - 1) * intValue2) + intValue);
        int i9 = this.$maxLines;
        Integer valueOf2 = i9 != Integer.MAX_VALUE ? Integer.valueOf(intValue + (intValue2 * (i9 - 1))) : null;
        Modifier m589heightInVpY3zN4 = SizeKt.m589heightInVpY3zN4(Modifier.Companion, valueOf != null ? density.mo301toDpu2uoSUM(valueOf.intValue()) : Dp.Companion.m6064getUnspecifiedD9Ej5fM(), valueOf2 != null ? density.mo301toDpu2uoSUM(valueOf2.intValue()) : Dp.Companion.m6064getUnspecifiedD9Ej5fM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m589heightInVpY3zN4;
    }
}
