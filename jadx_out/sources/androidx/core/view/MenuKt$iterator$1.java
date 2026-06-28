package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

@kotlin.i0(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/core/view/MenuKt$iterator$1", "", "Landroid/view/MenuItem;", "", "hasNext", "next", "Lkotlin/r2;", "remove", "", "index", "I", "core-ktx_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n83#2:91\n1#3:92\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n*L\n74#1:91\n74#1:92\n*E\n"})
/* loaded from: classes2.dex */
public final class MenuKt$iterator$1 implements Iterator<MenuItem>, w3.d {
    final /* synthetic */ Menu $this_iterator;
    private int index;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuKt$iterator$1(Menu menu) {
        this.$this_iterator = menu;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.$this_iterator.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        kotlin.r2 r2Var;
        Menu menu = this.$this_iterator;
        int i5 = this.index - 1;
        this.index = i5;
        MenuItem item = menu.getItem(i5);
        if (item != null) {
            menu.removeItem(item.getItemId());
            r2Var = kotlin.r2.f19517a;
        } else {
            r2Var = null;
        }
        if (r2Var != null) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @p4.l
    public MenuItem next() {
        Menu menu = this.$this_iterator;
        int i5 = this.index;
        this.index = i5 + 1;
        MenuItem item = menu.getItem(i5);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }
}
