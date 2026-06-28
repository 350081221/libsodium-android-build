package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import java.util.Iterator;

@kotlin.i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a\r\u0010\f\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a0\u0010\u0011\u001a\u00020\b*\u00020\u00002!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\rH\u0086\b\u001aE\u0010\u0013\u001a\u00020\b*\u00020\u000026\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\u0012H\u0086\b\u001a\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014*\u00020\u0000H\u0086\u0002\u001a\u0017\u0010\u0018\u001a\u00020\b*\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0001H\u0086\b\u001a5\u0010\u001d\u001a\u00020\b*\u00020\u00162\b\b\u0003\u0010\u0019\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u00012\b\b\u0003\u0010\u001b\u001a\u00020\u00012\b\b\u0003\u0010\u001c\u001a\u00020\u0001H\u0086\b\u001a5\u0010 \u001a\u00020\b*\u00020\u00162\b\b\u0003\u0010\u001e\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u00012\b\b\u0003\u0010\u001f\u001a\u00020\u00012\b\b\u0003\u0010\u001c\u001a\u00020\u0001H\u0086\b\"\u0016\u0010\u0017\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0016\u0010&\u001a\u00020#*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030'*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030'*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b+\u0010)¨\u0006-"}, d2 = {"Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", "get", "view", "", "contains", "Lkotlin/r2;", "plusAssign", "minusAssign", "isEmpty", "isNotEmpty", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "action", "forEach", "Lkotlin/Function2;", "forEachIndexed", "", "iterator", "Landroid/view/ViewGroup$MarginLayoutParams;", "size", "setMargins", "left", "top", "right", "bottom", "updateMargins", "start", "end", "updateMarginsRelative", "getSize", "(Landroid/view/ViewGroup;)I", "Lkotlin/ranges/l;", "getIndices", "(Landroid/view/ViewGroup;)Lkotlin/ranges/l;", "indices", "Lkotlin/sequences/m;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/m;", "children", "getDescendants", "descendants", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ViewGroupKt {
    public static final boolean contains(@p4.l ViewGroup viewGroup, @p4.l View view) {
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void forEach(@p4.l ViewGroup viewGroup, @p4.l v3.l<? super View, kotlin.r2> lVar) {
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            lVar.invoke(viewGroup.getChildAt(i5));
        }
    }

    public static final void forEachIndexed(@p4.l ViewGroup viewGroup, @p4.l v3.p<? super Integer, ? super View, kotlin.r2> pVar) {
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            pVar.invoke(Integer.valueOf(i5), viewGroup.getChildAt(i5));
        }
    }

    @p4.l
    public static final View get(@p4.l ViewGroup viewGroup, int i5) {
        View childAt = viewGroup.getChildAt(i5);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i5 + ", Size: " + viewGroup.getChildCount());
    }

    @p4.l
    public static final kotlin.sequences.m<View> getChildren(@p4.l final ViewGroup viewGroup) {
        return new kotlin.sequences.m<View>() { // from class: androidx.core.view.ViewGroupKt$children$1
            @Override // kotlin.sequences.m
            @p4.l
            public Iterator<View> iterator() {
                return ViewGroupKt.iterator(viewGroup);
            }
        };
    }

    @p4.l
    public static final kotlin.sequences.m<View> getDescendants(@p4.l final ViewGroup viewGroup) {
        return new kotlin.sequences.m<View>() { // from class: androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
            @Override // kotlin.sequences.m
            @p4.l
            public Iterator<View> iterator() {
                return new TreeIterator(ViewGroupKt.getChildren(viewGroup).iterator(), ViewGroupKt$descendants$1$1.INSTANCE);
            }
        };
    }

    @p4.l
    public static final kotlin.ranges.l getIndices(@p4.l ViewGroup viewGroup) {
        kotlin.ranges.l W1;
        W1 = kotlin.ranges.u.W1(0, viewGroup.getChildCount());
        return W1;
    }

    public static final int getSize(@p4.l ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(@p4.l ViewGroup viewGroup) {
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(@p4.l ViewGroup viewGroup) {
        return viewGroup.getChildCount() != 0;
    }

    @p4.l
    public static final Iterator<View> iterator(@p4.l ViewGroup viewGroup) {
        return new ViewGroupKt$iterator$1(viewGroup);
    }

    public static final void minusAssign(@p4.l ViewGroup viewGroup, @p4.l View view) {
        viewGroup.removeView(view);
    }

    public static final void plusAssign(@p4.l ViewGroup viewGroup, @p4.l View view) {
        viewGroup.addView(view);
    }

    public static final void setMargins(@p4.l ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i5) {
        marginLayoutParams.setMargins(i5, i5, i5, i5);
    }

    public static final void updateMargins(@p4.l ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i5, @Px int i6, @Px int i7, @Px int i8) {
        marginLayoutParams.setMargins(i5, i6, i7, i8);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = marginLayoutParams.leftMargin;
        }
        if ((i9 & 2) != 0) {
            i6 = marginLayoutParams.topMargin;
        }
        if ((i9 & 4) != 0) {
            i7 = marginLayoutParams.rightMargin;
        }
        if ((i9 & 8) != 0) {
            i8 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i5, i6, i7, i8);
    }

    public static final void updateMarginsRelative(@p4.l ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i5, @Px int i6, @Px int i7, @Px int i8) {
        marginLayoutParams.setMarginStart(i5);
        marginLayoutParams.topMargin = i6;
        marginLayoutParams.setMarginEnd(i7);
        marginLayoutParams.bottomMargin = i8;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = marginLayoutParams.getMarginStart();
        }
        if ((i9 & 2) != 0) {
            i6 = marginLayoutParams.topMargin;
        }
        if ((i9 & 4) != 0) {
            i7 = marginLayoutParams.getMarginEnd();
        }
        if ((i9 & 8) != 0) {
            i8 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i5);
        marginLayoutParams.topMargin = i6;
        marginLayoutParams.setMarginEnd(i7);
        marginLayoutParams.bottomMargin = i8;
    }
}
