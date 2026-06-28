package com.yuanqi.master.network.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;", "", "msg", "", "result", "Lcom/yuanqi/master/network/model/response/Result;", "status", "(Ljava/lang/String;Lcom/yuanqi/master/network/model/response/Result;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "getResult", "()Lcom/yuanqi/master/network/model/response/Result;", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReverseEncodingResponse {
    public static final int $stable = 0;

    @l
    private final String msg;

    @l
    private final Result result;

    @l
    private final String status;

    public ReverseEncodingResponse(@l String msg, @l Result result, @l String status) {
        l0.p(msg, "msg");
        l0.p(result, "result");
        l0.p(status, "status");
        this.msg = msg;
        this.result = result;
        this.status = status;
    }

    public static /* synthetic */ ReverseEncodingResponse copy$default(ReverseEncodingResponse reverseEncodingResponse, String str, Result result, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = reverseEncodingResponse.msg;
        }
        if ((i5 & 2) != 0) {
            result = reverseEncodingResponse.result;
        }
        if ((i5 & 4) != 0) {
            str2 = reverseEncodingResponse.status;
        }
        return reverseEncodingResponse.copy(str, result, str2);
    }

    @l
    public final String component1() {
        return this.msg;
    }

    @l
    public final Result component2() {
        return this.result;
    }

    @l
    public final String component3() {
        return this.status;
    }

    @l
    public final ReverseEncodingResponse copy(@l String msg, @l Result result, @l String status) {
        l0.p(msg, "msg");
        l0.p(result, "result");
        l0.p(status, "status");
        return new ReverseEncodingResponse(msg, result, status);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReverseEncodingResponse)) {
            return false;
        }
        ReverseEncodingResponse reverseEncodingResponse = (ReverseEncodingResponse) obj;
        return l0.g(this.msg, reverseEncodingResponse.msg) && l0.g(this.result, reverseEncodingResponse.result) && l0.g(this.status, reverseEncodingResponse.status);
    }

    @l
    public final String getMsg() {
        return this.msg;
    }

    @l
    public final Result getResult() {
        return this.result;
    }

    @l
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.msg.hashCode() * 31) + this.result.hashCode()) * 31) + this.status.hashCode();
    }

    @l
    public String toString() {
        return "ReverseEncodingResponse(msg=" + this.msg + ", result=" + this.result + ", status=" + this.status + ')';
    }
}
