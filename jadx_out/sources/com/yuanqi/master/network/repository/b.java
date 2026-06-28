package com.yuanqi.master.network.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yuanqi.master.network.model.response.ReverseBaseStationItem;
import java.util.ArrayList;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import retrofit2.Call;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/yuanqi/master/network/repository/LbsApiRepository;", "Lcom/yuanqi/master/network/repository/BaseRepository;", "()V", "getBaseStation", "Lretrofit2/Call;", "Ljava/util/ArrayList;", "Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;", "Lkotlin/collections/ArrayList;", "latitude", "", "longitude", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: g, reason: collision with root package name */
    @l
    public static final b f14842g = new b();

    /* renamed from: h, reason: collision with root package name */
    public static final int f14843h = 0;

    private b() {
    }

    @l
    public final Call<ArrayList<ReverseBaseStationItem>> g(@l String latitude, @l String longitude) {
        l0.p(latitude, "latitude");
        l0.p(longitude, "longitude");
        return b().s(latitude, longitude);
    }
}
