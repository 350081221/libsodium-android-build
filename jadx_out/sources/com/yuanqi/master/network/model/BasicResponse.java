package com.yuanqi.master.network.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/yuanqi/master/network/model/BasicResponse;", "", "msg", "", PluginConstants.KEY_ERROR_CODE, "", "(Ljava/lang/String;I)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasicResponse {
    public static final int $stable = 0;
    private final int code;

    @l
    private final String msg;

    public BasicResponse(@l String msg, int i5) {
        l0.p(msg, "msg");
        this.msg = msg;
        this.code = i5;
    }

    public static /* synthetic */ BasicResponse copy$default(BasicResponse basicResponse, String str, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = basicResponse.msg;
        }
        if ((i6 & 2) != 0) {
            i5 = basicResponse.code;
        }
        return basicResponse.copy(str, i5);
    }

    @l
    public final String component1() {
        return this.msg;
    }

    public final int component2() {
        return this.code;
    }

    @l
    public final BasicResponse copy(@l String msg, int i5) {
        l0.p(msg, "msg");
        return new BasicResponse(msg, i5);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicResponse)) {
            return false;
        }
        BasicResponse basicResponse = (BasicResponse) obj;
        return l0.g(this.msg, basicResponse.msg) && this.code == basicResponse.code;
    }

    public final int getCode() {
        return this.code;
    }

    @l
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        return (this.msg.hashCode() * 31) + Integer.hashCode(this.code);
    }

    @l
    public String toString() {
        return "BasicResponse(msg=" + this.msg + ", code=" + this.code + ')';
    }
}
