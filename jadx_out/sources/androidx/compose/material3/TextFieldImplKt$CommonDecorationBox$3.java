package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "labelProgress", "Landroidx/compose/ui/graphics/Color;", "labelTextStyleColor", "labelContentColor", "placeholderAlphaProgress", "prefixSuffixAlphaProgress", "Lkotlin/r2;", "invoke-eopBjH0", "(FJJFFLandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,433:1\n1116#2,6:434\n1116#2,6:440\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3\n*L\n223#1:434,6\n246#1:440,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldImplKt$CommonDecorationBox$3 extends kotlin.jvm.internal.n0 implements v3.u<Float, Color, Color, Float, Float, Composer, Integer, r2> {
    final /* synthetic */ TextStyle $bodyLarge;
    final /* synthetic */ TextStyle $bodySmall;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ v3.p<Composer, Integer, r2> $container;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ v3.p<Composer, Integer, r2> $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ v3.p<Composer, Integer, r2> $placeholder;
    final /* synthetic */ v3.p<Composer, Integer, r2> $prefix;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ v3.p<Composer, Integer, r2> $suffix;
    final /* synthetic */ v3.p<Composer, Integer, r2> $supportingText;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;
    final /* synthetic */ String $transformedText;
    final /* synthetic */ TextFieldType $type;

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldImplKt$CommonDecorationBox$3(v3.p<? super Composer, ? super Integer, r2> pVar, TextFieldColors textFieldColors, boolean z4, boolean z5, InteractionSource interactionSource, v3.p<? super Composer, ? super Integer, r2> pVar2, String str, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.p<? super Composer, ? super Integer, r2> pVar5, v3.p<? super Composer, ? super Integer, r2> pVar6, v3.p<? super Composer, ? super Integer, r2> pVar7, TextFieldType textFieldType, v3.p<? super Composer, ? super Integer, r2> pVar8, boolean z6, PaddingValues paddingValues, boolean z7, TextStyle textStyle, TextStyle textStyle2, v3.p<? super Composer, ? super Integer, r2> pVar9) {
        super(7);
        this.$label = pVar;
        this.$colors = textFieldColors;
        this.$enabled = z4;
        this.$isError = z5;
        this.$interactionSource = interactionSource;
        this.$placeholder = pVar2;
        this.$transformedText = str;
        this.$prefix = pVar3;
        this.$suffix = pVar4;
        this.$leadingIcon = pVar5;
        this.$trailingIcon = pVar6;
        this.$supportingText = pVar7;
        this.$type = textFieldType;
        this.$innerTextField = pVar8;
        this.$singleLine = z6;
        this.$contentPadding = paddingValues;
        this.$shouldOverrideTextStyleColor = z7;
        this.$bodyLarge = textStyle;
        this.$bodySmall = textStyle2;
        this.$container = pVar9;
    }

    @Override // v3.u
    public /* bridge */ /* synthetic */ r2 invoke(Float f5, Color color, Color color2, Float f6, Float f7, Composer composer, Integer num) {
        m2443invokeeopBjH0(f5.floatValue(), color.m3744unboximpl(), color2.m3744unboximpl(), f6.floatValue(), f7.floatValue(), composer, num.intValue());
        return r2.f19517a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: invoke-eopBjH0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2443invokeeopBjH0(float r24, long r25, long r27, float r29, float r30, @p4.m androidx.compose.runtime.Composer r31, int r32) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3.m2443invokeeopBjH0(float, long, long, float, float, androidx.compose.runtime.Composer, int):void");
    }
}
