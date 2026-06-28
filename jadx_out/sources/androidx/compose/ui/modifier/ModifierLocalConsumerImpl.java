package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u000e\u0012\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R(\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalConsumerImpl;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "Lkotlin/r2;", "onModifierLocalsUpdated", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Lkotlin/Function1;", "Lkotlin/u;", "consumer", "Lv3/l;", "getConsumer", "()Lv3/l;", "Landroidx/compose/ui/platform/InspectorInfo;", "debugInspectorInfo", "<init>", "(Lv3/l;Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ModifierLocalConsumerImpl extends InspectorValueInfo implements ModifierLocalConsumer {

    @l
    private final v3.l<ModifierLocalReadScope, r2> consumer;

    /* JADX WARN: Multi-variable type inference failed */
    public ModifierLocalConsumerImpl(@l v3.l<? super ModifierLocalReadScope, r2> lVar, @l v3.l<? super InspectorInfo, r2> lVar2) {
        super(lVar2);
        this.consumer = lVar;
    }

    public boolean equals(@m Object obj) {
        return (obj instanceof ModifierLocalConsumerImpl) && l0.g(((ModifierLocalConsumerImpl) obj).consumer, this.consumer);
    }

    @l
    public final v3.l<ModifierLocalReadScope, r2> getConsumer() {
        return this.consumer;
    }

    public int hashCode() {
        return this.consumer.hashCode();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@l ModifierLocalReadScope modifierLocalReadScope) {
        this.consumer.invoke(modifierLocalReadScope);
    }
}
