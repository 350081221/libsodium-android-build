package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "Lkotlin/r2;", "it", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Lv3/l;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidView_androidKt$AndroidView$2$3<T> extends n0 implements p<LayoutNode, l<? super T, ? extends r2>, r2> {
    public static final AndroidView_androidKt$AndroidView$2$3 INSTANCE = new AndroidView_androidKt$AndroidView$2$3();

    AndroidView_androidKt$AndroidView$2$3() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(LayoutNode layoutNode, Object obj) {
        invoke(layoutNode, (l) obj);
        return r2.f19517a;
    }

    public final void invoke(@p4.l LayoutNode layoutNode, @p4.l l<? super T, r2> lVar) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        requireViewFactoryHolder.setReleaseBlock(lVar);
    }
}
