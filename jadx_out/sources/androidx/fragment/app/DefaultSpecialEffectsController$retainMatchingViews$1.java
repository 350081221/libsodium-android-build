package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "entry", "", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultSpecialEffectsController$retainMatchingViews$1 extends n0 implements v3.l<Map.Entry<String, View>, Boolean> {
    final /* synthetic */ Collection<String> $names;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$retainMatchingViews$1(Collection<String> collection) {
        super(1);
        this.$names = collection;
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l Map.Entry<String, View> entry) {
        boolean T1;
        l0.p(entry, "entry");
        T1 = e0.T1(this.$names, ViewCompat.getTransitionName(entry.getValue()));
        return Boolean.valueOf(T1);
    }
}
