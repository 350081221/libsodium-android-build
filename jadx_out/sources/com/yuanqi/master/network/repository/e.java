package com.yuanqi.master.network.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.orhanobut.logger.j;
import com.yuanqi.group.App;
import com.yuanqi.master.network.model.response.GeocodingResponse;
import com.yuanqi.master.network.model.response.ReverseEncodingResponse;
import com.yuanqi.master.tools.r0;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import retrofit2.Call;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u001f\u0010\r\u001a\u00070\u0004¢\u0006\u0002\b\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u000fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\u0006\u0010\u001a\u001a\u00020\u0017¨\u0006\u001b"}, d2 = {"Lcom/yuanqi/master/network/repository/MapApiRepository;", "Lcom/yuanqi/master/network/repository/BaseRepository;", "()V", "addHistory", "Lio/reactivex/rxjava3/disposables/Disposable;", "Lio/reactivex/rxjava3/annotations/NonNull;", "addHistoryLiveData", "Landroidx/lifecycle/MutableLiveData;", "", a1.h.f116i, "Lcom/yuanqi/master/tools/Failure;", "history", "Lcom/yuanqi/master/database/model/History;", "deleteAllHistory", "action", "Lkotlin/Function1;", "", "getHistoryList", "", "searchAddress", "Lretrofit2/Call;", "Lcom/yuanqi/master/network/model/response/GeocodingResponse;", "ds", "", "searchLatlng", "Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;", "postStr", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends com.yuanqi.master.network.repository.a {

    /* renamed from: g, reason: collision with root package name */
    @l
    public static final e f14846g = new e();

    /* renamed from: h, reason: collision with root package name */
    public static final int f14847h = 0;

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", com.umeng.analytics.pro.d.U, "", "accept"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a<T> implements m3.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableLiveData<Boolean> f14848a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableLiveData<r0> f14849b;

        a(MutableLiveData<Boolean> mutableLiveData, MutableLiveData<r0> mutableLiveData2) {
            this.f14848a = mutableLiveData;
            this.f14849b = mutableLiveData2;
        }

        @Override // m3.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@l Throwable error) {
            l0.p(error, "error");
            this.f14848a.postValue(Boolean.FALSE);
            this.f14849b.postValue(new r0(error, "addHistory: " + error));
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", com.umeng.analytics.pro.d.U, "", "accept"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class b<T> implements m3.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.l<Boolean, r2> f14850a;

        /* JADX WARN: Multi-variable type inference failed */
        b(v3.l<? super Boolean, r2> lVar) {
            this.f14850a = lVar;
        }

        @Override // m3.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@l Throwable error) {
            l0.p(error, "error");
            j.e("deleteAllHistory: " + error, new Object[0]);
            this.f14850a.invoke(Boolean.FALSE);
        }
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(MutableLiveData addHistoryLiveData) {
        l0.p(addHistoryLiveData, "$addHistoryLiveData");
        addHistoryLiveData.postValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(v3.l action) {
        l0.p(action, "$action");
        action.invoke(Boolean.TRUE);
    }

    @l
    public final io.reactivex.rxjava3.disposables.e i(@l final MutableLiveData<Boolean> addHistoryLiveData, @l MutableLiveData<r0> failed, @l v2.c history) {
        l0.p(addHistoryLiveData, "addHistoryLiveData");
        l0.p(failed, "failed");
        l0.p(history, "history");
        com.yuanqi.master.database.a a5 = com.yuanqi.master.database.a.f14574b.a();
        App a6 = App.f13716d.a();
        l0.m(a6);
        io.reactivex.rxjava3.disposables.e X0 = a5.e(a6).b(history).X0(new m3.a() { // from class: com.yuanqi.master.network.repository.d
            @Override // m3.a
            public final void run() {
                e.j(MutableLiveData.this);
            }
        }, new a(addHistoryLiveData, failed));
        l0.o(X0, "subscribe(...)");
        return X0;
    }

    @l
    public final io.reactivex.rxjava3.disposables.e k(@l final v3.l<? super Boolean, r2> action) {
        l0.p(action, "action");
        com.yuanqi.master.database.a a5 = com.yuanqi.master.database.a.f14574b.a();
        App a6 = App.f13716d.a();
        l0.m(a6);
        io.reactivex.rxjava3.disposables.e X0 = a5.e(a6).deleteAll().X0(new m3.a() { // from class: com.yuanqi.master.network.repository.c
            @Override // m3.a
            public final void run() {
                e.l(v3.l.this);
            }
        }, new b(action));
        l0.o(X0, "subscribe(...)");
        return X0;
    }

    @l
    public final List<v2.c> m() {
        com.yuanqi.master.database.a a5 = com.yuanqi.master.database.a.f14574b.a();
        App a6 = App.f13716d.a();
        l0.m(a6);
        return a5.e(a6).getAll();
    }

    @l
    public final Call<GeocodingResponse> n(@l String ds) {
        l0.p(ds, "ds");
        return d().k(ds, com.yuanqi.master.config.c.Y);
    }

    @l
    public final Call<ReverseEncodingResponse> o(@l String postStr) {
        l0.p(postStr, "postStr");
        return d().j(postStr, com.yuanqi.master.config.c.Y);
    }
}
