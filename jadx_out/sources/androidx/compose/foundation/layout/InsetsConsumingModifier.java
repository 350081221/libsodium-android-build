package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;

@Stable
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b3\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R+\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/InsetsConsumingModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/foundation/layout/WindowInsets;", "modifierLocalInsets", "calculateInsets", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "Lkotlin/r2;", "onModifierLocalsUpdated", "<set-?>", "consumedInsets$delegate", "Landroidx/compose/runtime/MutableState;", "getConsumedInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "setConsumedInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "consumedInsets", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", DatabaseFileArchive.COLUMN_KEY, "getValue", t0.b.f22420d, "<init>", "()V", "Landroidx/compose/foundation/layout/PaddingValuesConsumingModifier;", "Landroidx/compose/foundation/layout/UnionInsetsConsumingModifier;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,286:1\n81#2:287\n107#2,2:288\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n*L\n198#1:287\n198#1:288,2\n*E\n"})
/* loaded from: classes.dex */
abstract class InsetsConsumingModifier implements ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {

    @l
    private final MutableState consumedInsets$delegate;

    private InsetsConsumingModifier() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(WindowInsetsKt.WindowInsets(0, 0, 0, 0), null, 2, null);
        this.consumedInsets$delegate = mutableStateOf$default;
    }

    public /* synthetic */ InsetsConsumingModifier(w wVar) {
        this();
    }

    private final WindowInsets getConsumedInsets() {
        return (WindowInsets) this.consumedInsets$delegate.getValue();
    }

    private final void setConsumedInsets(WindowInsets windowInsets) {
        this.consumedInsets$delegate.setValue(windowInsets);
    }

    @l
    public abstract WindowInsets calculateInsets(@l WindowInsets windowInsets);

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @l
    public ProvidableModifierLocal<WindowInsets> getKey() {
        return WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@l ModifierLocalReadScope modifierLocalReadScope) {
        setConsumedInsets(calculateInsets((WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @l
    public WindowInsets getValue() {
        return getConsumedInsets();
    }
}
