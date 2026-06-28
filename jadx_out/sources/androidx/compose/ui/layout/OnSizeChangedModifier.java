package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B4\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/IntSize;", "size", "Lkotlin/r2;", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Lkotlin/Function1;", "onSizeChanged", "Lv3/l;", "getOnSizeChanged", "()Lv3/l;", "previousSize", "J", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/u;", "inspectorInfo", "<init>", "(Lv3/l;Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class OnSizeChangedModifier extends InspectorValueInfo implements OnRemeasuredModifier {

    @l
    private final v3.l<IntSize, r2> onSizeChanged;
    private long previousSize;

    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(@l v3.l<? super IntSize, r2> lVar, @l v3.l<? super InspectorInfo, r2> lVar2) {
        super(lVar2);
        this.onSizeChanged = lVar;
        this.previousSize = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnSizeChangedModifier)) {
            return false;
        }
        return l0.g(this.onSizeChanged, ((OnSizeChangedModifier) obj).onSizeChanged);
    }

    @l
    public final v3.l<IntSize, r2> getOnSizeChanged() {
        return this.onSizeChanged;
    }

    public int hashCode() {
        return this.onSizeChanged.hashCode();
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo5041onRemeasuredozmzZPI(long j5) {
        if (!IntSize.m6212equalsimpl0(this.previousSize, j5)) {
            this.onSizeChanged.invoke(IntSize.m6206boximpl(j5));
            this.previousSize = j5;
        }
    }
}
