package com.yuanqi.master.network.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yuanqi.master.network.model.BaseResult;
import com.yuanqi.master.network.model.response.ConfigResponse;
import com.yuanqi.master.network.model.response.ForceByVersionResponse;
import com.yuanqi.master.network.model.response.ShareListResponse;
import kotlin.i0;
import p4.l;
import retrofit2.Call;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¨\u0006\u000f"}, d2 = {"Lcom/yuanqi/master/network/repository/OtherRepository;", "Lcom/yuanqi/master/network/repository/BaseRepository;", "()V", "changeDevice", "Lretrofit2/Call;", "Lcom/yuanqi/master/network/model/BaseResult;", "", "getAppConfig", "Lcom/yuanqi/master/network/model/response/ConfigResponse;", "getForceByVersion", "Lcom/yuanqi/master/network/model/response/ForceByVersionResponse;", "version", "", "getShareList", "Lcom/yuanqi/master/network/model/response/ShareListResponse;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends a {

    /* renamed from: g, reason: collision with root package name */
    @l
    public static final f f14851g = new f();

    /* renamed from: h, reason: collision with root package name */
    public static final int f14852h = 0;

    private f() {
    }

    @l
    public final Call<BaseResult<Object>> g() {
        return e().h(c());
    }

    @l
    public final Call<BaseResult<ConfigResponse>> h() {
        return e().m();
    }

    @l
    public final Call<BaseResult<ForceByVersionResponse>> i(int i5) {
        return e().w(i5);
    }

    @l
    public final Call<ShareListResponse> j() {
        return e().r(c());
    }
}
