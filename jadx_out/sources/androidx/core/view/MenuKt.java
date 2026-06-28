package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

@kotlin.i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\n\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a0\u0010\u0010\u001a\u00020\b*\u00020\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\fH\u0086\b\u001aE\u0010\u0012\u001a\u00020\b*\u00020\u000026\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\u0011H\u0086\b\u001a\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013*\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\u0015\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\"\u0016\u0010\u0018\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/Menu;", "", "index", "Landroid/view/MenuItem;", "get", "item", "", "contains", "Lkotlin/r2;", "minusAssign", "isEmpty", "isNotEmpty", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "action", "forEach", "Lkotlin/Function2;", "forEachIndexed", "", "iterator", "removeItemAt", "getSize", "(Landroid/view/Menu;)I", "size", "Lkotlin/sequences/m;", "getChildren", "(Landroid/view/Menu;)Lkotlin/sequences/m;", "children", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* loaded from: classes2.dex */
public final class MenuKt {
    public static final boolean contains(@p4.l Menu menu, @p4.l MenuItem menuItem) {
        int size = menu.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (kotlin.jvm.internal.l0.g(menu.getItem(i5), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(@p4.l Menu menu, @p4.l v3.l<? super MenuItem, kotlin.r2> lVar) {
        int size = menu.size();
        for (int i5 = 0; i5 < size; i5++) {
            lVar.invoke(menu.getItem(i5));
        }
    }

    public static final void forEachIndexed(@p4.l Menu menu, @p4.l v3.p<? super Integer, ? super MenuItem, kotlin.r2> pVar) {
        int size = menu.size();
        for (int i5 = 0; i5 < size; i5++) {
            pVar.invoke(Integer.valueOf(i5), menu.getItem(i5));
        }
    }

    @p4.l
    public static final MenuItem get(@p4.l Menu menu, int i5) {
        return menu.getItem(i5);
    }

    @p4.l
    public static final kotlin.sequences.m<MenuItem> getChildren(@p4.l final Menu menu) {
        return new kotlin.sequences.m<MenuItem>() { // from class: androidx.core.view.MenuKt$children$1
            @Override // kotlin.sequences.m
            @p4.l
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final int getSize(@p4.l Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(@p4.l Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(@p4.l Menu menu) {
        return menu.size() != 0;
    }

    @p4.l
    public static final Iterator<MenuItem> iterator(@p4.l Menu menu) {
        return new MenuKt$iterator$1(menu);
    }

    public static final void minusAssign(@p4.l Menu menu, @p4.l MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(@p4.l Menu menu, int i5) {
        kotlin.r2 r2Var;
        MenuItem item = menu.getItem(i5);
        if (item != null) {
            menu.removeItem(item.getItemId());
            r2Var = kotlin.r2.f19517a;
        } else {
            r2Var = null;
        }
        if (r2Var == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
