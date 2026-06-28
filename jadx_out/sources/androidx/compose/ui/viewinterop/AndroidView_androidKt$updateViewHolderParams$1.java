package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/Modifier;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/Modifier;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidView_androidKt$updateViewHolderParams$1 extends n0 implements p<LayoutNode, Modifier, r2> {
    public static final AndroidView_androidKt$updateViewHolderParams$1 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$1();

    AndroidView_androidKt$updateViewHolderParams$1() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(LayoutNode layoutNode, Modifier modifier) {
        invoke2(layoutNode, modifier);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@l LayoutNode layoutNode, @l Modifier modifier) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        requireViewFactoryHolder.setModifier(modifier);
    }
}
