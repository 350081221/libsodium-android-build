package com.yuanqi.group.widgets;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class DragSelectRecyclerViewAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: c, reason: collision with root package name */
    private a f14116c;

    /* renamed from: d, reason: collision with root package name */
    private int f14117d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f14118e = -1;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<Integer> f14115b = new ArrayList<>();

    /* loaded from: classes3.dex */
    public interface a {
        void a(int i5);
    }

    protected DragSelectRecyclerViewAdapter() {
    }

    private void b() {
        if (this.f14117d == this.f14115b.size()) {
            return;
        }
        int size = this.f14115b.size();
        this.f14117d = size;
        a aVar = this.f14116c;
        if (aVar != null) {
            aVar.a(size);
        }
    }

    public final void a() {
        this.f14115b.clear();
        notifyDataSetChanged();
        b();
    }

    public final int c() {
        return this.f14115b.size();
    }

    public final Integer[] d() {
        ArrayList<Integer> arrayList = this.f14115b;
        return (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e(int i5) {
        return true;
    }

    public final boolean f(int i5) {
        return this.f14115b.contains(Integer.valueOf(i5));
    }

    public void g(String str, Bundle bundle) {
        if (bundle != null && bundle.containsKey(str)) {
            ArrayList<Integer> arrayList = (ArrayList) bundle.getSerializable(str);
            this.f14115b = arrayList;
            if (arrayList == null) {
                this.f14115b = new ArrayList<>();
            } else {
                b();
            }
        }
    }

    public void h(Bundle bundle) {
        i("selected_indices", bundle);
    }

    public void i(String str, Bundle bundle) {
        bundle.putSerializable(str, this.f14115b);
    }

    public final void j() {
        int itemCount = getItemCount();
        this.f14115b.clear();
        for (int i5 = 0; i5 < itemCount; i5++) {
            if (e(i5)) {
                this.f14115b.add(Integer.valueOf(i5));
            }
        }
        notifyDataSetChanged();
        b();
    }

    public final void k(int i5, int i6, int i7, int i8) {
        if (i5 == i6) {
            while (i7 <= i8) {
                if (i7 != i5) {
                    m(i7, false);
                }
                i7++;
            }
            b();
            return;
        }
        if (i6 < i5) {
            for (int i9 = i6; i9 <= i5; i9++) {
                m(i9, true);
            }
            if (i7 > -1 && i7 < i6) {
                while (i7 < i6) {
                    if (i7 != i5) {
                        m(i7, false);
                    }
                    i7++;
                }
            }
            if (i8 > -1) {
                for (int i10 = i5 + 1; i10 <= i8; i10++) {
                    m(i10, false);
                }
            }
        } else {
            for (int i11 = i5; i11 <= i6; i11++) {
                m(i11, true);
            }
            if (i8 > -1 && i8 > i6) {
                for (int i12 = i6 + 1; i12 <= i8; i12++) {
                    if (i12 != i5) {
                        m(i12, false);
                    }
                }
            }
            if (i7 > -1) {
                while (i7 < i5) {
                    m(i7, false);
                    i7++;
                }
            }
        }
        b();
    }

    public void l(int i5) {
        this.f14118e = i5;
    }

    public final void m(int i5, boolean z4) {
        if (!e(i5)) {
            z4 = false;
        }
        if (z4) {
            if (!this.f14115b.contains(Integer.valueOf(i5)) && (this.f14118e == -1 || this.f14115b.size() < this.f14118e)) {
                this.f14115b.add(Integer.valueOf(i5));
                notifyItemChanged(i5);
            }
        } else if (this.f14115b.contains(Integer.valueOf(i5))) {
            this.f14115b.remove(Integer.valueOf(i5));
            notifyItemChanged(i5);
        }
        b();
    }

    public void n(a aVar) {
        this.f14116c = aVar;
    }

    public final boolean o(int i5) {
        boolean z4 = false;
        if (e(i5)) {
            if (this.f14115b.contains(Integer.valueOf(i5))) {
                this.f14115b.remove(Integer.valueOf(i5));
            } else if (this.f14118e == -1 || this.f14115b.size() < this.f14118e) {
                this.f14115b.add(Integer.valueOf(i5));
                z4 = true;
            }
            notifyItemChanged(i5);
        }
        b();
        return z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onBindViewHolder(VH vh, int i5) {
        vh.itemView.setTag(vh);
    }

    public void restoreInstanceState(Bundle bundle) {
        g("selected_indices", bundle);
    }
}
