package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElement;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 2)
@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\f\u0010\f\u001a\u00020\b*\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH&J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH¦\u0002R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "N", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectableValue;", "create", "()Landroidx/compose/ui/Modifier$Node;", "node", "Lkotlin/r2;", "update", "(Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "_inspectorValues", "Landroidx/compose/ui/platform/InspectorInfo;", "getInspectorValues", "()Landroidx/compose/ui/platform/InspectorInfo;", "inspectorValues", "", "getNameFallback", "()Ljava/lang/String;", "nameFallback", "getValueOverride", "()Ljava/lang/Object;", "valueOverride", "Lkotlin/sequences/m;", "Landroidx/compose/ui/platform/ValueElement;", "getInspectableElements", "()Lkotlin/sequences/m;", "inspectableElements", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nModifierNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierNodeElement.kt\nandroidx/compose/ui/node/ModifierNodeElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: classes.dex */
public abstract class ModifierNodeElement<N extends Modifier.Node> implements Modifier.Element, InspectableValue {
    public static final int $stable = 0;

    @m
    private InspectorInfo _inspectorValues;

    private final InspectorInfo getInspectorValues() {
        InspectorInfo inspectorInfo = this._inspectorValues;
        if (inspectorInfo == null) {
            InspectorInfo inspectorInfo2 = new InspectorInfo();
            inspectorInfo2.setName(l1.d(getClass()).t());
            inspectableProperties(inspectorInfo2);
            this._inspectorValues = inspectorInfo2;
            return inspectorInfo2;
        }
        return inspectorInfo;
    }

    @l
    public abstract N create();

    public abstract boolean equals(@m Object obj);

    @Override // androidx.compose.ui.platform.InspectableValue
    @l
    public final kotlin.sequences.m<ValueElement> getInspectableElements() {
        return getInspectorValues().getProperties();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @m
    public final String getNameFallback() {
        return getInspectorValues().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @m
    public final Object getValueOverride() {
        return getInspectorValues().getValue();
    }

    public abstract int hashCode();

    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        Actual_jvmKt.tryPopulateReflectively(inspectorInfo, this);
    }

    public abstract void update(@l N n5);
}
