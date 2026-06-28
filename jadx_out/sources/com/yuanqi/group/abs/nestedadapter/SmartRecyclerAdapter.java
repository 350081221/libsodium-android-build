package com.yuanqi.group.abs.nestedadapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes3.dex */
public class SmartRecyclerAdapter extends RecyclerViewAdapterWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static final int f13726f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f13727g = -2;

    /* renamed from: c, reason: collision with root package name */
    private RecyclerView.LayoutManager f13728c;

    /* renamed from: d, reason: collision with root package name */
    private View f13729d;

    /* renamed from: e, reason: collision with root package name */
    private View f13730e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends GridLayoutManager.SpanSizeLookup {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f13731a;

        a(GridLayoutManager gridLayoutManager) {
            this.f13731a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i5) {
            boolean z4;
            boolean z5 = false;
            if (i5 == 0 && SmartRecyclerAdapter.this.e()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i5 == SmartRecyclerAdapter.this.getItemCount() - 1 && SmartRecyclerAdapter.this.d()) {
                z5 = true;
            }
            if (!z5 && !z4) {
                return 1;
            }
            return this.f13731a.getSpanCount();
        }
    }

    /* loaded from: classes3.dex */
    class b extends RecyclerView.ViewHolder {
        b(View view) {
            super(view);
        }
    }

    public SmartRecyclerAdapter(@NonNull RecyclerView.Adapter adapter) {
        super(adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        return this.f13730e != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        return this.f13729d != null;
    }

    private void i(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
        }
    }

    public void f() {
        this.f13730e = null;
        a().notifyDataSetChanged();
    }

    public void g() {
        this.f13729d = null;
        a().notifyDataSetChanged();
    }

    @Override // com.yuanqi.group.abs.nestedadapter.RecyclerViewAdapterWrapper, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return super.getItemCount() + (e() ? 1 : 0) + (d() ? 1 : 0);
    }

    @Override // com.yuanqi.group.abs.nestedadapter.RecyclerViewAdapterWrapper, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i5) {
        if (e() && i5 == 0) {
            return -1;
        }
        if (d() && i5 == getItemCount() - 1) {
            return -2;
        }
        if (e()) {
            i5--;
        }
        return super.getItemViewType(i5);
    }

    public void h(View view) {
        this.f13730e = view;
        a().notifyDataSetChanged();
    }

    public void j(View view) {
        this.f13729d = view;
        a().notifyDataSetChanged();
    }

    @Override // com.yuanqi.group.abs.nestedadapter.RecyclerViewAdapterWrapper, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        this.f13728c = layoutManager;
        i(layoutManager);
    }

    @Override // com.yuanqi.group.abs.nestedadapter.RecyclerViewAdapterWrapper, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i5) {
        if (getItemViewType(i5) != -1 && getItemViewType(i5) != -2) {
            if (e()) {
                i5--;
            }
            super.onBindViewHolder(viewHolder, i5);
        }
    }

    @Override // com.yuanqi.group.abs.nestedadapter.RecyclerViewAdapterWrapper, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i5) {
        View view;
        StaggeredGridLayoutManager.LayoutParams layoutParams;
        if (i5 == -1) {
            view = this.f13729d;
        } else if (i5 == -2) {
            view = this.f13730e;
        } else {
            view = null;
        }
        if (view != null) {
            if (this.f13728c instanceof StaggeredGridLayoutManager) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams = new StaggeredGridLayoutManager.LayoutParams(layoutParams2.width, layoutParams2.height);
                } else {
                    layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
                }
                layoutParams.setFullSpan(true);
                view.setLayoutParams(layoutParams);
            }
            return new b(view);
        }
        return super.onCreateViewHolder(viewGroup, i5);
    }
}
