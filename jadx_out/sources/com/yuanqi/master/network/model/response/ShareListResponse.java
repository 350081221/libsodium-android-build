package com.yuanqi.master.network.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.yuanqi.master.network.model.ShareListData;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/yuanqi/master/network/model/response/ShareListResponse;", "", "msg", "", PluginConstants.KEY_ERROR_CODE, "", "data", "", "Lcom/yuanqi/master/network/model/ShareListData;", "(Ljava/lang/String;ILjava/util/List;)V", "getCode", "()I", "getData", "()Ljava/util/List;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShareListResponse {
    public static final int $stable = 8;
    private final int code;

    @l
    private final List<ShareListData> data;

    @l
    private final String msg;

    public ShareListResponse(@l String msg, int i5, @l List<ShareListData> data) {
        l0.p(msg, "msg");
        l0.p(data, "data");
        this.msg = msg;
        this.code = i5;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareListResponse copy$default(ShareListResponse shareListResponse, String str, int i5, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = shareListResponse.msg;
        }
        if ((i6 & 2) != 0) {
            i5 = shareListResponse.code;
        }
        if ((i6 & 4) != 0) {
            list = shareListResponse.data;
        }
        return shareListResponse.copy(str, i5, list);
    }

    @l
    public final String component1() {
        return this.msg;
    }

    public final int component2() {
        return this.code;
    }

    @l
    public final List<ShareListData> component3() {
        return this.data;
    }

    @l
    public final ShareListResponse copy(@l String msg, int i5, @l List<ShareListData> data) {
        l0.p(msg, "msg");
        l0.p(data, "data");
        return new ShareListResponse(msg, i5, data);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareListResponse)) {
            return false;
        }
        ShareListResponse shareListResponse = (ShareListResponse) obj;
        return l0.g(this.msg, shareListResponse.msg) && this.code == shareListResponse.code && l0.g(this.data, shareListResponse.data);
    }

    public final int getCode() {
        return this.code;
    }

    @l
    public final List<ShareListData> getData() {
        return this.data;
    }

    @l
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        return (((this.msg.hashCode() * 31) + Integer.hashCode(this.code)) * 31) + this.data.hashCode();
    }

    @l
    public String toString() {
        return "ShareListResponse(msg=" + this.msg + ", code=" + this.code + ", data=" + this.data + ')';
    }
}
