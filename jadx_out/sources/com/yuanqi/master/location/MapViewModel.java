package com.yuanqi.master.location;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.yuanqi.master.network.model.CustomAddress;
import com.yuanqi.master.network.model.response.GeocodingResponse;
import com.yuanqi.master.network.model.response.Location;
import com.yuanqi.master.network.model.response.Result;
import com.yuanqi.master.network.model.response.ReverseBaseStationItem;
import com.yuanqi.master.network.model.response.ReverseEncodingResponse;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.r0;
import java.util.ArrayList;
import kotlin.d0;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J>\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112&\u0010\u0013\u001a\"\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017\u0012\u0004\u0012\u00020\u000f0\u0014J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aJ$\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u000f0\u0014J,\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u000f0\u0014R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\""}, d2 = {"Lcom/yuanqi/master/location/MapViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", a1.h.f116i, "Landroidx/lifecycle/MutableLiveData;", "Lcom/yuanqi/master/tools/Failure;", "getFailed", "()Landroidx/lifecycle/MutableLiveData;", "setFailed", "(Landroidx/lifecycle/MutableLiveData;)V", "saveHistoryLiveData", "", "getSaveHistoryLiveData", "setSaveHistoryLiveData", "getBaseStation", "", com.umeng.analytics.pro.d.C, "", com.umeng.analytics.pro.d.D, "action", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;", "Lkotlin/collections/ArrayList;", "saveHistory", "history", "Lcom/yuanqi/master/database/model/History;", "searchAddress", "address", "", "Lcom/yuanqi/master/network/model/CustomAddress;", "searchLatlng", "lon", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapViewModel extends ViewModel {

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    public static final b f14645c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f14646d = 8;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private static final d0<MapViewModel> f14647e;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private MutableLiveData<Boolean> f14648a = new MutableLiveData<>();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private MutableLiveData<r0> f14649b = new MutableLiveData<>();

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/yuanqi/master/location/MapViewModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends n0 implements v3.a<MapViewModel> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final MapViewModel invoke() {
            return new MapViewModel();
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/location/MapViewModel$Companion;", "", "()V", "instance", "Lcom/yuanqi/master/location/MapViewModel;", "getInstance", "()Lcom/yuanqi/master/location/MapViewModel;", "instance$delegate", "Lkotlin/Lazy;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(w wVar) {
            this();
        }

        @p4.l
        public final MapViewModel a() {
            return (MapViewModel) MapViewModel.f14647e.getValue();
        }
    }

    @i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;", "Lkotlin/collections/ArrayList;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class c extends n0 implements v3.l<ArrayList<ReverseBaseStationItem>, r2> {
        final /* synthetic */ v3.l<ArrayList<ReverseBaseStationItem>, r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(v3.l<? super ArrayList<ReverseBaseStationItem>, r2> lVar) {
            super(1);
            this.$action = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ArrayList<ReverseBaseStationItem> arrayList) {
            invoke2(arrayList);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m ArrayList<ReverseBaseStationItem> arrayList) {
            this.$action.invoke(arrayList);
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class d extends n0 implements v3.l<String, r2> {
        final /* synthetic */ v3.l<ArrayList<ReverseBaseStationItem>, r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(v3.l<? super ArrayList<ReverseBaseStationItem>, r2> lVar) {
            super(1);
            this.$action = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            l0.p(it, "it");
            this.$action.invoke(null);
            com.orhanobut.logger.j.d(it, new Object[0]);
            f1.r(it, 0, 2, null);
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/response/GeocodingResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class e extends n0 implements v3.l<GeocodingResponse, r2> {
        final /* synthetic */ v3.l<CustomAddress, r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(v3.l<? super CustomAddress, r2> lVar) {
            super(1);
            this.$action = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(GeocodingResponse geocodingResponse) {
            invoke2(geocodingResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m GeocodingResponse geocodingResponse) {
            if (geocodingResponse == null) {
                this.$action.invoke(null);
                return;
            }
            if (l0.g(geocodingResponse.getStatus(), "0")) {
                Location location = geocodingResponse.getLocation();
                this.$action.invoke(new CustomAddress(location.getKeyWord(), location.getLat(), location.getLon()));
                return;
            }
            this.$action.invoke(null);
            f1.r(geocodingResponse.getStatus(), 0, 2, null);
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class f extends n0 implements v3.l<String, r2> {
        final /* synthetic */ v3.l<CustomAddress, r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(v3.l<? super CustomAddress, r2> lVar) {
            super(1);
            this.$action = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            l0.p(it, "it");
            this.$action.invoke(null);
            com.orhanobut.logger.j.d(it, new Object[0]);
            f1.r(it, 0, 2, null);
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class g extends n0 implements v3.l<ReverseEncodingResponse, r2> {
        final /* synthetic */ v3.l<CustomAddress, r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(v3.l<? super CustomAddress, r2> lVar) {
            super(1);
            this.$action = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ReverseEncodingResponse reverseEncodingResponse) {
            invoke2(reverseEncodingResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m ReverseEncodingResponse reverseEncodingResponse) {
            if (reverseEncodingResponse == null) {
                this.$action.invoke(null);
                return;
            }
            if (l0.g(reverseEncodingResponse.getStatus(), "0")) {
                Result result = reverseEncodingResponse.getResult();
                this.$action.invoke(new CustomAddress(result.getAddressComponent().getAddress(), result.getLocation().getLat(), result.getLocation().getLon()));
                return;
            }
            this.$action.invoke(null);
            f1.r(reverseEncodingResponse.getStatus(), 0, 2, null);
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class h extends n0 implements v3.l<String, r2> {
        final /* synthetic */ v3.l<CustomAddress, r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(v3.l<? super CustomAddress, r2> lVar) {
            super(1);
            this.$action = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            l0.p(it, "it");
            this.$action.invoke(null);
            com.orhanobut.logger.j.d(it, new Object[0]);
            f1.r(it, 0, 2, null);
        }
    }

    static {
        d0<MapViewModel> b5;
        b5 = f0.b(h0.SYNCHRONIZED, a.INSTANCE);
        f14647e = b5;
    }

    public final void b(double d5, double d6, @p4.l v3.l<? super ArrayList<ReverseBaseStationItem>, r2> action) {
        l0.p(action, "action");
        f1.b(com.yuanqi.master.network.repository.b.f14842g.g(String.valueOf(d5), String.valueOf(d6)), new c(action), new d(action));
    }

    @p4.l
    public final MutableLiveData<r0> c() {
        return this.f14649b;
    }

    @p4.l
    public final MutableLiveData<Boolean> d() {
        return this.f14648a;
    }

    public final void e(@p4.l v2.c history) {
        l0.p(history, "history");
        com.yuanqi.master.network.repository.e.f14846g.i(this.f14648a, this.f14649b, history);
    }

    public final void f(@p4.l String address, @p4.l v3.l<? super CustomAddress, r2> action) {
        l0.p(address, "address");
        l0.p(action, "action");
        f1.b(com.yuanqi.master.network.repository.e.f14846g.n("{\"keyWord\":\"" + address + "\"}"), new e(action), new f(action));
    }

    public final void g(@p4.l String lat, @p4.l String lon, @p4.l v3.l<? super CustomAddress, r2> action) {
        l0.p(lat, "lat");
        l0.p(lon, "lon");
        l0.p(action, "action");
        f1.b(com.yuanqi.master.network.repository.e.f14846g.o("{\"lon\":\"" + lon + "\",\"lat\":\"" + lat + "\",\"ver\":\"1\"}"), new g(action), new h(action));
    }

    public final void h(@p4.l MutableLiveData<r0> mutableLiveData) {
        l0.p(mutableLiveData, "<set-?>");
        this.f14649b = mutableLiveData;
    }

    public final void i(@p4.l MutableLiveData<Boolean> mutableLiveData) {
        l0.p(mutableLiveData, "<set-?>");
        this.f14648a = mutableLiveData;
    }
}
