package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "T", "", "E", "Landroidx/compose/runtime/Applier;", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/ComposablesKt$ComposeNode$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1 extends n0 implements v3.a<LayoutNode> {
    final /* synthetic */ v3.a $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1(v3.a aVar) {
        super(0);
        this.$factory = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
    @Override // v3.a
    @l
    public final LayoutNode invoke() {
        return this.$factory.invoke();
    }
}
