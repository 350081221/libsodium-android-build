package com.yuanqi.master.location;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.yqtech.multiapp.databinding.ItemAddressBinding;
import com.yuanqi.master.network.model.CustomAddress;
import com.yuanqi.master.tools.z0;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/yuanqi/master/location/AddressAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/yuanqi/master/location/AddressAdapter$ViewHolder;", "mList", "", "Lcom/yuanqi/master/network/model/CustomAddress;", "(Ljava/util/List;)V", "mOnItemClickListener", "Lcom/yuanqi/master/tools/OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "ViewHolder", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f14603d = 8;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final List<CustomAddress> f14604b;

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private z0 f14605c;

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/location/AddressAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Lcom/yqtech/multiapp/databinding/ItemAddressBinding;", "(Lcom/yqtech/multiapp/databinding/ItemAddressBinding;)V", "binding", "getBinding", "()Lcom/yqtech/multiapp/databinding/ItemAddressBinding;", "setBinding", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: b, reason: collision with root package name */
        public static final int f14606b = 8;

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private ItemAddressBinding f14607a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@p4.l ItemAddressBinding itemView) {
            super(itemView.getRoot());
            l0.p(itemView, "itemView");
            this.f14607a = itemView;
        }

        @p4.l
        public final ItemAddressBinding a() {
            return this.f14607a;
        }

        public final void b(@p4.l ItemAddressBinding itemAddressBinding) {
            l0.p(itemAddressBinding, "<set-?>");
            this.f14607a = itemAddressBinding;
        }
    }

    public AddressAdapter(@p4.l List<CustomAddress> mList) {
        l0.p(mList, "mList");
        this.f14604b = mList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AddressAdapter this$0, ViewHolder viewHolder, View view) {
        l0.p(this$0, "this$0");
        l0.p(viewHolder, "$viewHolder");
        z0 z0Var = this$0.f14605c;
        if (z0Var != null) {
            l0.m(z0Var);
            z0Var.a(view, viewHolder.getAdapterPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@p4.l ViewHolder holder, int i5) {
        l0.p(holder, "holder");
        CustomAddress customAddress = this.f14604b.get(i5);
        ItemAddressBinding a5 = holder.a();
        a5.tvAddress.setText(customAddress.getAddress());
        a5.tvLat.setText(String.valueOf(customAddress.getLat()));
        a5.tvLng.setText(String.valueOf(customAddress.getLng()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @p4.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(@p4.l ViewGroup parent, int i5) {
        l0.p(parent, "parent");
        ItemAddressBinding inflate = ItemAddressBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        l0.o(inflate, "inflate(...)");
        final ViewHolder viewHolder = new ViewHolder(inflate);
        viewHolder.a().layAddress.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.location.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressAdapter.d(AddressAdapter.this, viewHolder, view);
            }
        });
        return viewHolder;
    }

    public final void e(@p4.m z0 z0Var) {
        this.f14605c = z0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f14604b.size();
    }
}
