package com.yuanqi.master.network.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yuanqi.master.network.model.BasicResponse;
import com.yuanqi.master.network.model.ResultModel;
import com.yuanqi.master.network.model.request.CreateOrderRequest;
import com.yuanqi.master.network.model.response.VipMealResponse;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import retrofit2.Call;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¨\u0006\r"}, d2 = {"Lcom/yuanqi/master/network/repository/VipRepository;", "Lcom/yuanqi/master/network/repository/BaseRepository;", "()V", "createAliPayOrder", "Lretrofit2/Call;", "Lcom/yuanqi/master/network/model/ResultModel;", "type", "", "createWxPayOrder", "getVipMeal", "Lcom/yuanqi/master/network/model/response/VipMealResponse;", "giveVip", "Lcom/yuanqi/master/network/model/BasicResponse;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends a {

    /* renamed from: g, reason: collision with root package name */
    @l
    public static final h f14855g = new h();

    /* renamed from: h, reason: collision with root package name */
    public static final int f14856h = 0;

    private h() {
    }

    @l
    public final Call<ResultModel> g(@l String type) {
        l0.p(type, "type");
        return e().B(c(), type, new CreateOrderRequest("1"));
    }

    @l
    public final Call<ResultModel> h(@l String type) {
        l0.p(type, "type");
        return e().n(c(), type, new CreateOrderRequest("2"));
    }

    @l
    public final Call<VipMealResponse> i() {
        return e().g(c());
    }

    @l
    public final Call<BasicResponse> j() {
        return e().b(c());
    }
}
