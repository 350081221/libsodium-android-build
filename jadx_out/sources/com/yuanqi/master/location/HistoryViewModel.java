package com.yuanqi.master.location;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.ViewModel;
import com.yuanqi.group.App;
import com.yuanqi.master.tools.o0;
import kotlin.d0;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u000fJ\u001c\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/yuanqi/master/location/HistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "historyList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/yuanqi/master/database/model/History;", "getHistoryList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "showLoading", "Landroidx/compose/runtime/MutableState;", "", "getShowLoading", "()Landroidx/compose/runtime/MutableState;", "showProgress", "getShowProgress", "", "showDeleteDialog", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "action", "Lkotlin/Function0;", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HistoryViewModel extends ViewModel {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    public static final b f14612d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f14613e = 0;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final d0<HistoryViewModel> f14614f;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final SnapshotStateList<v2.c> f14615a = SnapshotStateKt.mutableStateListOf();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final MutableState<Boolean> f14616b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final MutableState<Boolean> f14617c;

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/yuanqi/master/location/HistoryViewModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends n0 implements v3.a<HistoryViewModel> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final HistoryViewModel invoke() {
            return new HistoryViewModel();
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/location/HistoryViewModel$Companion;", "", "()V", "instance", "Lcom/yuanqi/master/location/HistoryViewModel;", "getInstance", "()Lcom/yuanqi/master/location/HistoryViewModel;", "instance$delegate", "Lkotlin/Lazy;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(w wVar) {
            this();
        }

        @p4.l
        public final HistoryViewModel a() {
            return (HistoryViewModel) HistoryViewModel.f14614f.getValue();
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class c extends n0 implements v3.a<r2> {
        final /* synthetic */ v3.a<r2> $action;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements v3.l<Boolean, r2> {
            final /* synthetic */ v3.a<r2> $action;
            final /* synthetic */ HistoryViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HistoryViewModel historyViewModel, v3.a<r2> aVar) {
                super(1);
                this.this$0 = historyViewModel;
                this.$action = aVar;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r2.f19517a;
            }

            public final void invoke(boolean z4) {
                if (z4) {
                    this.this$0.c();
                    this.$action.invoke();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(v3.a<r2> aVar) {
            super(0);
            this.$action = aVar;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            com.yuanqi.master.network.repository.e.f14846g.k(new a(HistoryViewModel.this, this.$action));
        }
    }

    static {
        d0<HistoryViewModel> b5;
        b5 = f0.b(h0.SYNCHRONIZED, a.INSTANCE);
        f14614f = b5;
    }

    public HistoryViewModel() {
        MutableState<Boolean> mutableStateOf$default;
        MutableState<Boolean> mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f14616b = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.f14617c = mutableStateOf$default2;
    }

    @p4.l
    public final SnapshotStateList<v2.c> b() {
        return this.f14615a;
    }

    public final void c() {
        this.f14615a.clear();
        this.f14615a.addAll(com.yuanqi.master.network.repository.e.f14846g.m());
        com.orhanobut.logger.j.d("historyList:" + App.f13716d.c().z(this.f14615a), new Object[0]);
    }

    @p4.l
    public final MutableState<Boolean> d() {
        return this.f14616b;
    }

    @p4.l
    public final MutableState<Boolean> e() {
        return this.f14617c;
    }

    public final void f(@p4.l Context context, @p4.l v3.a<r2> action) {
        l0.p(context, "context");
        l0.p(action, "action");
        o0.Y(o0.f15213a, context, "温馨提示", "所有历史记录都将被删除，数据无法恢复，您要继续吗？", null, null, false, false, false, false, null, null, null, new c(action), 4056, null);
    }
}
