package androidx.navigation;

import androidx.collection.SparseArrayCompat;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import w3.d;

@i0(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/navigation/NavGraph$iterator$1", "", "Landroidx/navigation/NavDestination;", "", "hasNext", "next", "Lkotlin/r2;", "remove", "", "index", "I", "wentToNext", "Z", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph$iterator$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,478:1\n1#2:479\n*E\n"})
/* loaded from: classes2.dex */
public final class NavGraph$iterator$1 implements Iterator<NavDestination>, d {
    private int index = -1;
    final /* synthetic */ NavGraph this$0;
    private boolean wentToNext;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NavGraph$iterator$1(NavGraph navGraph) {
        this.this$0 = navGraph;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index + 1 < this.this$0.getNodes().size();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.wentToNext) {
            SparseArrayCompat<NavDestination> nodes = this.this$0.getNodes();
            nodes.valueAt(this.index).setParent(null);
            nodes.removeAt(this.index);
            this.index--;
            this.wentToNext = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element".toString());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @l
    public NavDestination next() {
        if (hasNext()) {
            this.wentToNext = true;
            SparseArrayCompat<NavDestination> nodes = this.this$0.getNodes();
            int i5 = this.index + 1;
            this.index = i5;
            NavDestination valueAt = nodes.valueAt(i5);
            l0.o(valueAt, "nodes.valueAt(++index)");
            return valueAt;
        }
        throw new NoSuchElementException();
    }
}
