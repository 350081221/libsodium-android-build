package com.yuanqi.master.network.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/yuanqi/master/network/model/response/VipMealResponse;", "", PluginConstants.KEY_ERROR_CODE, "", "data", "", "Lcom/yuanqi/master/network/model/response/VipMealData;", "msg", "", "(ILjava/util/List;Ljava/lang/String;)V", "getCode", "()I", "getData", "()Ljava/util/List;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VipMealResponse {
    public static final int $stable = 8;
    private final int code;

    @l
    private final List<VipMealData> data;

    @l
    private final String msg;

    public VipMealResponse(int i5, @l List<VipMealData> data, @l String msg) {
        l0.p(data, "data");
        l0.p(msg, "msg");
        this.code = i5;
        this.data = data;
        this.msg = msg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VipMealResponse copy$default(VipMealResponse vipMealResponse, int i5, List list, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = vipMealResponse.code;
        }
        if ((i6 & 2) != 0) {
            list = vipMealResponse.data;
        }
        if ((i6 & 4) != 0) {
            str = vipMealResponse.msg;
        }
        return vipMealResponse.copy(i5, list, str);
    }

    public final int component1() {
        return this.code;
    }

    @l
    public final List<VipMealData> component2() {
        return this.data;
    }

    @l
    public final String component3() {
        return this.msg;
    }

    @l
    public final VipMealResponse copy(int i5, @l List<VipMealData> data, @l String msg) {
        l0.p(data, "data");
        l0.p(msg, "msg");
        return new VipMealResponse(i5, data, msg);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipMealResponse)) {
            return false;
        }
        VipMealResponse vipMealResponse = (VipMealResponse) obj;
        return this.code == vipMealResponse.code && l0.g(this.data, vipMealResponse.data) && l0.g(this.msg, vipMealResponse.msg);
    }

    public final int getCode() {
        return this.code;
    }

    @l
    public final List<VipMealData> getData() {
        return this.data;
    }

    @l
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.code) * 31) + this.data.hashCode()) * 31) + this.msg.hashCode();
    }

    @l
    public String toString() {
        return "VipMealResponse(code=" + this.code + ", data=" + this.data + ", msg=" + this.msg + ')';
    }
}
