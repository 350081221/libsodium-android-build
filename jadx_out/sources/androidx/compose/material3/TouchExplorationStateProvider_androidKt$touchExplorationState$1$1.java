package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/r2;", "invoke", "(Landroidx/lifecycle/Lifecycle$Event;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TouchExplorationStateProvider_androidKt$touchExplorationState$1$1 extends kotlin.jvm.internal.n0 implements v3.l<Lifecycle.Event, r2> {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ Listener $listener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchExplorationStateProvider_androidKt$touchExplorationState$1$1(Listener listener, AccessibilityManager accessibilityManager) {
        super(1);
        this.$listener = listener;
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Lifecycle.Event event) {
        invoke2(event);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            this.$listener.register(this.$accessibilityManager);
        }
    }
}
