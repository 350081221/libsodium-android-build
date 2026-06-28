package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Add missing generic type declarations: [E] */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AbstractPersistentList$removeAll$1<E> extends n0 implements l<E, Boolean> {
    final /* synthetic */ Collection<E> $elements;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractPersistentList$removeAll$1(Collection<? extends E> collection) {
        super(1);
        this.$elements = collection;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @p4.l
    public final Boolean invoke(E e5) {
        return Boolean.valueOf(this.$elements.contains(e5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.l
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((AbstractPersistentList$removeAll$1<E>) obj);
    }
}
