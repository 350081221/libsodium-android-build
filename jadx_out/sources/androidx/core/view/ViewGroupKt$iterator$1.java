package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

@kotlin.i0(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/core/view/ViewGroupKt$iterator$1", "", "Landroid/view/View;", "", "hasNext", "next", "Lkotlin/r2;", "remove", "", "index", "I", "core-ktx_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ViewGroupKt$iterator$1 implements Iterator<View>, w3.d {
    final /* synthetic */ ViewGroup $this_iterator;
    private int index;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewGroupKt$iterator$1(ViewGroup viewGroup) {
        this.$this_iterator = viewGroup;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.$this_iterator.getChildCount();
    }

    @Override // java.util.Iterator
    public void remove() {
        ViewGroup viewGroup = this.$this_iterator;
        int i5 = this.index - 1;
        this.index = i5;
        viewGroup.removeViewAt(i5);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @p4.l
    public View next() {
        ViewGroup viewGroup = this.$this_iterator;
        int i5 = this.index;
        this.index = i5 + 1;
        View childAt = viewGroup.getChildAt(i5);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }
}
