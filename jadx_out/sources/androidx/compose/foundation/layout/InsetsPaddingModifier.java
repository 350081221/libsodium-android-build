package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.ConstraintsKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b,\u0010 J&\u0010\r\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R+\u0010!\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/foundation/layout/InsetsPaddingModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "Lkotlin/r2;", "onModifierLocalsUpdated", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "<set-?>", "unconsumedInsets$delegate", "Landroidx/compose/runtime/MutableState;", "getUnconsumedInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "setUnconsumedInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "unconsumedInsets", "consumedInsets$delegate", "getConsumedInsets", "setConsumedInsets", "consumedInsets", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", DatabaseFileArchive.COLUMN_KEY, "getValue", t0.b.f22420d, "<init>", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,286:1\n81#2:287\n107#2,2:288\n81#2:290\n107#2,2:291\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n*L\n139#1:287\n139#1:288,2\n140#1:290\n140#1:291,2\n*E\n"})
/* loaded from: classes.dex */
public final class InsetsPaddingModifier implements LayoutModifier, ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {
    public static final int $stable = 0;

    @l
    private final MutableState consumedInsets$delegate;

    @l
    private final WindowInsets insets;

    @l
    private final MutableState unconsumedInsets$delegate;

    public InsetsPaddingModifier(@l WindowInsets windowInsets) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.insets = windowInsets;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
        this.unconsumedInsets$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
        this.consumedInsets$delegate = mutableStateOf$default2;
    }

    private final WindowInsets getConsumedInsets() {
        return (WindowInsets) this.consumedInsets$delegate.getValue();
    }

    private final WindowInsets getUnconsumedInsets() {
        return (WindowInsets) this.unconsumedInsets$delegate.getValue();
    }

    private final void setConsumedInsets(WindowInsets windowInsets) {
        this.consumedInsets$delegate.setValue(windowInsets);
    }

    private final void setUnconsumedInsets(WindowInsets windowInsets) {
        this.unconsumedInsets$delegate.setValue(windowInsets);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingModifier)) {
            return false;
        }
        return l0.g(((InsetsPaddingModifier) obj).insets, this.insets);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @l
    public ProvidableModifierLocal<WindowInsets> getKey() {
        return WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets();
    }

    public int hashCode() {
        return this.insets.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo56measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        int left = getUnconsumedInsets().getLeft(measureScope, measureScope.getLayoutDirection());
        int top = getUnconsumedInsets().getTop(measureScope);
        int right = getUnconsumedInsets().getRight(measureScope, measureScope.getLayoutDirection()) + left;
        int bottom = getUnconsumedInsets().getBottom(measureScope) + top;
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(ConstraintsKt.m6016offsetNN6EwU(j5, -right, -bottom));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m6014constrainWidthK40F9xA(j5, mo4998measureBRTryo0.getWidth() + right), ConstraintsKt.m6013constrainHeightK40F9xA(j5, mo4998measureBRTryo0.getHeight() + bottom), null, new InsetsPaddingModifier$measure$1(mo4998measureBRTryo0, left, top), 4, null);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@l ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        setUnconsumedInsets(WindowInsetsKt.exclude(this.insets, windowInsets));
        setConsumedInsets(WindowInsetsKt.union(windowInsets, this.insets));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @l
    public WindowInsets getValue() {
        return getConsumedInsets();
    }
}
