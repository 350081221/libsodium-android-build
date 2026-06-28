package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SnapshotStateList$retainAll$1<T> extends n0 implements l<List<T>, Boolean> {
    final /* synthetic */ Collection<T> $elements;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateList$retainAll$1(Collection<? extends T> collection) {
        super(1);
        this.$elements = collection;
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l List<T> list) {
        return Boolean.valueOf(list.retainAll(this.$elements));
    }
}
