package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/node/LayoutNode;", "T", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidView_androidKt$createAndroidViewNodeFactory$1 extends n0 implements v3.a<LayoutNode> {
    final /* synthetic */ int $compositeKeyHash;
    final /* synthetic */ Context $context;
    final /* synthetic */ l<Context, T> $factory;
    final /* synthetic */ View $ownerView;
    final /* synthetic */ CompositionContext $parentReference;
    final /* synthetic */ SaveableStateRegistry $stateRegistry;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidView_androidKt$createAndroidViewNodeFactory$1(Context context, l<? super Context, ? extends T> lVar, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i5, View view) {
        super(0);
        this.$context = context;
        this.$factory = lVar;
        this.$parentReference = compositionContext;
        this.$stateRegistry = saveableStateRegistry;
        this.$compositeKeyHash = i5;
        this.$ownerView = view;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final LayoutNode invoke() {
        Context context = this.$context;
        l<Context, T> lVar = this.$factory;
        CompositionContext compositionContext = this.$parentReference;
        SaveableStateRegistry saveableStateRegistry = this.$stateRegistry;
        int i5 = this.$compositeKeyHash;
        KeyEvent.Callback callback = this.$ownerView;
        l0.n(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new ViewFactoryHolder(context, lVar, compositionContext, saveableStateRegistry, i5, (Owner) callback).getLayoutNode();
    }
}
