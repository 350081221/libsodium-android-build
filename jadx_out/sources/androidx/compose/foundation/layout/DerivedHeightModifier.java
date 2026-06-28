package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@Stable
@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BG\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000f0'¢\u0006\u0002\b\u001c\u0012\u001d\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001a¢\u0006\u0002\b\u001c¢\u0006\u0004\b*\u0010+J&\u0010\f\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R+\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001a¢\u0006\u0002\b\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR+\u0010&\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/DerivedHeightModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "Lkotlin/r2;", "onModifierLocalsUpdated", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/u;", "heightCalc", "Lv3/p;", "<set-?>", "unconsumedInsets$delegate", "Landroidx/compose/runtime/MutableState;", "getUnconsumedInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "setUnconsumedInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "unconsumedInsets", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;Lv3/l;Lv3/p;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,214:1\n81#2:215\n107#2,2:216\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n*L\n180#1:215\n180#1:216,2\n*E\n"})
/* loaded from: classes.dex */
final class DerivedHeightModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {

    @l
    private final p<WindowInsets, Density, Integer> heightCalc;

    @l
    private final WindowInsets insets;

    @l
    private final MutableState unconsumedInsets$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedHeightModifier(@l WindowInsets windowInsets, @l v3.l<? super InspectorInfo, r2> lVar, @l p<? super WindowInsets, ? super Density, Integer> pVar) {
        super(lVar);
        MutableState mutableStateOf$default;
        this.insets = windowInsets;
        this.heightCalc = pVar;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
        this.unconsumedInsets$delegate = mutableStateOf$default;
    }

    private final WindowInsets getUnconsumedInsets() {
        return (WindowInsets) this.unconsumedInsets$delegate.getValue();
    }

    private final void setUnconsumedInsets(WindowInsets windowInsets) {
        this.unconsumedInsets$delegate.setValue(windowInsets);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedHeightModifier)) {
            return false;
        }
        DerivedHeightModifier derivedHeightModifier = (DerivedHeightModifier) obj;
        if (l0.g(this.insets, derivedHeightModifier.insets) && l0.g(this.heightCalc, derivedHeightModifier.heightCalc)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.heightCalc.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo56measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        int intValue = this.heightCalc.invoke(getUnconsumedInsets(), measureScope).intValue();
        if (intValue == 0) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, DerivedHeightModifier$measure$1.INSTANCE, 4, null);
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, intValue, intValue, 3, null));
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), intValue, null, new DerivedHeightModifier$measure$2(mo4998measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@l ModifierLocalReadScope modifierLocalReadScope) {
        setUnconsumedInsets(WindowInsetsKt.exclude(this.insets, (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }
}
