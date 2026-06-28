package com.yuanqi.group.abs.nestedadapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class RecyclerViewAdapterWrapper extends RecyclerView.Adapter {

    /* renamed from: b, reason: collision with root package name */
    protected final RecyclerView.Adapter f13724b;

    /* loaded from: classes3.dex */
    class a extends RecyclerView.AdapterDataObserver {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            RecyclerViewAdapterWrapper.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i5, int i6) {
            RecyclerViewAdapterWrapper.this.notifyItemRangeChanged(i5, i6);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i5, int i6) {
            RecyclerViewAdapterWrapper.this.notifyItemRangeInserted(i5, i6);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i5, int i6, int i7) {
            RecyclerViewAdapterWrapper.this.notifyItemMoved(i5, i6);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i5, int i6) {
            RecyclerViewAdapterWrapper.this.notifyItemRangeRemoved(i5, i6);
        }
    }

    public RecyclerViewAdapterWrapper(RecyclerView.Adapter adapter) {
        this.f13724b = adapter;
        adapter.registerAdapterDataObserver(new a());
    }

    public RecyclerView.Adapter a() {
        return this.f13724b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f13724b.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i5) {
        return this.f13724b.getItemId(i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i5) {
        return this.f13724b.getItemViewType(i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f13724b.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i5) {
        this.f13724b.onBindViewHolder(viewHolder, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i5) {
        return this.f13724b.onCreateViewHolder(viewGroup, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f13724b.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return this.f13724b.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.f13724b.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.f13724b.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        this.f13724b.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        this.f13724b.registerAdapterDataObserver(adapterDataObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z4) {
        this.f13724b.setHasStableIds(z4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        this.f13724b.unregisterAdapterDataObserver(adapterDataObserver);
    }
}
