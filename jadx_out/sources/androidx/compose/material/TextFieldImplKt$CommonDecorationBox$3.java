package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.p;
import v3.t;

@i0(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "labelProgress", "Landroidx/compose/ui/graphics/Color;", "labelTextStyleColor", "labelContentColor", "placeholderAlphaProgress", "Lkotlin/r2;", "invoke-RIQooxk", "(FJJFLandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,369:1\n25#2:370\n1116#3,6:371\n1116#3,6:377\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3\n*L\n178#1:370\n178#1:371,6\n196#1:377,6\n*E\n"})
/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$3 extends n0 implements t<Float, Color, Color, Float, Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $border;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ p<Composer, Integer, r2> $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ p<Composer, Integer, r2> $label;
    final /* synthetic */ p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ p<Composer, Integer, r2> $placeholder;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ p<Composer, Integer, r2> $trailingIcon;
    final /* synthetic */ String $transformedText;
    final /* synthetic */ TextFieldType $type;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
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
    public TextFieldImplKt$CommonDecorationBox$3(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, String str, TextFieldColors textFieldColors, boolean z4, boolean z5, InteractionSource interactionSource, p<? super Composer, ? super Integer, r2> pVar3, p<? super Composer, ? super Integer, r2> pVar4, TextFieldType textFieldType, p<? super Composer, ? super Integer, r2> pVar5, boolean z6, PaddingValues paddingValues, boolean z7, p<? super Composer, ? super Integer, r2> pVar6) {
        super(6);
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$transformedText = str;
        this.$colors = textFieldColors;
        this.$enabled = z4;
        this.$isError = z5;
        this.$interactionSource = interactionSource;
        this.$leadingIcon = pVar3;
        this.$trailingIcon = pVar4;
        this.$type = textFieldType;
        this.$innerTextField = pVar5;
        this.$singleLine = z6;
        this.$contentPadding = paddingValues;
        this.$shouldOverrideTextStyleColor = z7;
        this.$border = pVar6;
    }

    @Override // v3.t
    public /* bridge */ /* synthetic */ r2 invoke(Float f5, Color color, Color color2, Float f6, Composer composer, Integer num) {
        m1505invokeRIQooxk(f5.floatValue(), color.m3744unboximpl(), color2.m3744unboximpl(), f6.floatValue(), composer, num.intValue());
        return r2.f19517a;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: invoke-RIQooxk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1505invokeRIQooxk(float r19, long r20, long r22, float r24, @p4.m androidx.compose.runtime.Composer r25, int r26) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.m1505invokeRIQooxk(float, long, long, float, androidx.compose.runtime.Composer, int):void");
    }
}
