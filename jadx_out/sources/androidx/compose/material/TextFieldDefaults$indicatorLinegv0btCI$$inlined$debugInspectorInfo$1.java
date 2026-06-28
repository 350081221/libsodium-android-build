package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n*L\n1#1,170:1\n292#2,8:171\n*E\n"})
/* renamed from: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1 extends n0 implements l<InspectorInfo, r2> {
    final /* synthetic */ TextFieldColors $colors$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ float $focusedIndicatorLineThickness$inlined;
    final /* synthetic */ InteractionSource $interactionSource$inlined;
    final /* synthetic */ boolean $isError$inlined;
    final /* synthetic */ float $unfocusedIndicatorLineThickness$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(boolean z4, boolean z5, InteractionSource interactionSource, TextFieldColors textFieldColors, float f5, float f6) {
        super(1);
        this.$enabled$inlined = z4;
        this.$isError$inlined = z5;
        this.$interactionSource$inlined = interactionSource;
        this.$colors$inlined = textFieldColors;
        this.$focusedIndicatorLineThickness$inlined = f5;
        this.$unfocusedIndicatorLineThickness$inlined = f6;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("indicatorLine");
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("isError", Boolean.valueOf(this.$isError$inlined));
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
        inspectorInfo.getProperties().set("colors", this.$colors$inlined);
        inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m6042boximpl(this.$focusedIndicatorLineThickness$inlined));
        inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m6042boximpl(this.$unfocusedIndicatorLineThickness$inlined));
    }
}
