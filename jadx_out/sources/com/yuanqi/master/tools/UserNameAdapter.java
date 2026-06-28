package com.yuanqi.master.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.yqtech.multiapp.R;
import com.yqtech.multiapp.databinding.ItemUserInfoBinding;
import com.yuanqi.master.network.model.response.UserInfo;
import java.util.List;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/yuanqi/master/tools/UserNameAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/yuanqi/master/tools/UserNameAdapter$ViewHolder;", "mList", "", "Lcom/yuanqi/master/network/model/response/UserInfo;", "(Ljava/util/List;)V", "mContext", "Landroid/content/Context;", "mOnItemClickListener", "Lcom/yuanqi/master/tools/OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "ViewHolder", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nUserNameAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserNameAdapter.kt\ncom/yuanqi/master/tools/UserNameAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
/* loaded from: classes3.dex */
public final class UserNameAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f15039e = 8;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final List<UserInfo> f15040b;

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private z0 f15041c;

    /* renamed from: d, reason: collision with root package name */
    private Context f15042d;

    @StabilityInferred(parameters = 0)
    @kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/tools/UserNameAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;", "(Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;)V", "binding", "getBinding", "()Lcom/yqtech/multiapp/databinding/ItemUserInfoBinding;", "setBinding", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: b, reason: collision with root package name */
        public static final int f15043b = 8;

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private ItemUserInfoBinding f15044a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@p4.l ItemUserInfoBinding itemView) {
            super(itemView.getRoot());
            kotlin.jvm.internal.l0.p(itemView, "itemView");
            this.f15044a = itemView;
        }

        @p4.l
        public final ItemUserInfoBinding a() {
            return this.f15044a;
        }

        public final void b(@p4.l ItemUserInfoBinding itemUserInfoBinding) {
            kotlin.jvm.internal.l0.p(itemUserInfoBinding, "<set-?>");
            this.f15044a = itemUserInfoBinding;
        }
    }

    public UserNameAdapter(@p4.l List<UserInfo> mList) {
        kotlin.jvm.internal.l0.p(mList, "mList");
        this.f15040b = mList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(UserNameAdapter this$0, ViewHolder viewHolder, View view) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(viewHolder, "$viewHolder");
        z0 z0Var = this$0.f15041c;
        if (z0Var != null) {
            kotlin.jvm.internal.l0.m(z0Var);
            z0Var.a(view, viewHolder.getAdapterPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@p4.l ViewHolder holder, int i5) {
        int i6;
        boolean z4;
        kotlin.jvm.internal.l0.p(holder, "holder");
        UserInfo userInfo = this.f15040b.get(i5);
        ItemUserInfoBinding a5 = holder.a();
        TextView textView = a5.tvUserName;
        Context context = null;
        if (kotlin.jvm.internal.l0.g(userInfo.isVip(), "1")) {
            Context context2 = this.f15042d;
            if (context2 == null) {
                kotlin.jvm.internal.l0.S("mContext");
            } else {
                context = context2;
            }
            i6 = R.color.vip_color;
        } else {
            Context context3 = this.f15042d;
            if (context3 == null) {
                kotlin.jvm.internal.l0.S("mContext");
            } else {
                context = context3;
            }
            i6 = R.color.gray3;
        }
        textView.setTextColor(ContextCompat.getColor(context, i6));
        TextView textView2 = a5.tvUserName;
        String userName = userInfo.getUserName();
        if (userName.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            userName = String.valueOf(userInfo.getUserId());
        }
        textView2.setText(userName);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @p4.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(@p4.l ViewGroup parent, int i5) {
        kotlin.jvm.internal.l0.p(parent, "parent");
        Context context = parent.getContext();
        kotlin.jvm.internal.l0.o(context, "getContext(...)");
        this.f15042d = context;
        ItemUserInfoBinding inflate = ItemUserInfoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        final ViewHolder viewHolder = new ViewHolder(inflate);
        viewHolder.a().tvUserName.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserNameAdapter.d(UserNameAdapter.this, viewHolder, view);
            }
        });
        return viewHolder;
    }

    public final void e(@p4.m z0 z0Var) {
        this.f15041c = z0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f15040b.size();
    }
}
