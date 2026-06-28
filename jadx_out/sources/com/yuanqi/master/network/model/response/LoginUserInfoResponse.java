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
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;", "", PluginConstants.KEY_ERROR_CODE, "", "data", "", "Lcom/yuanqi/master/network/model/response/UserInfo;", "msg", "", "token", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getData", "()Ljava/util/List;", "getMsg", "()Ljava/lang/String;", "getToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoginUserInfoResponse {
    public static final int $stable = 8;
    private final int code;

    @l
    private final List<UserInfo> data;

    @l
    private final String msg;

    @l
    private final String token;

    public LoginUserInfoResponse(int i5, @l List<UserInfo> data, @l String msg, @l String token) {
        l0.p(data, "data");
        l0.p(msg, "msg");
        l0.p(token, "token");
        this.code = i5;
        this.data = data;
        this.msg = msg;
        this.token = token;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoginUserInfoResponse copy$default(LoginUserInfoResponse loginUserInfoResponse, int i5, List list, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = loginUserInfoResponse.code;
        }
        if ((i6 & 2) != 0) {
            list = loginUserInfoResponse.data;
        }
        if ((i6 & 4) != 0) {
            str = loginUserInfoResponse.msg;
        }
        if ((i6 & 8) != 0) {
            str2 = loginUserInfoResponse.token;
        }
        return loginUserInfoResponse.copy(i5, list, str, str2);
    }

    public final int component1() {
        return this.code;
    }

    @l
    public final List<UserInfo> component2() {
        return this.data;
    }

    @l
    public final String component3() {
        return this.msg;
    }

    @l
    public final String component4() {
        return this.token;
    }

    @l
    public final LoginUserInfoResponse copy(int i5, @l List<UserInfo> data, @l String msg, @l String token) {
        l0.p(data, "data");
        l0.p(msg, "msg");
        l0.p(token, "token");
        return new LoginUserInfoResponse(i5, data, msg, token);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginUserInfoResponse)) {
            return false;
        }
        LoginUserInfoResponse loginUserInfoResponse = (LoginUserInfoResponse) obj;
        return this.code == loginUserInfoResponse.code && l0.g(this.data, loginUserInfoResponse.data) && l0.g(this.msg, loginUserInfoResponse.msg) && l0.g(this.token, loginUserInfoResponse.token);
    }

    public final int getCode() {
        return this.code;
    }

    @l
    public final List<UserInfo> getData() {
        return this.data;
    }

    @l
    public final String getMsg() {
        return this.msg;
    }

    @l
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.code) * 31) + this.data.hashCode()) * 31) + this.msg.hashCode()) * 31) + this.token.hashCode();
    }

    @l
    public String toString() {
        return "LoginUserInfoResponse(code=" + this.code + ", data=" + this.data + ", msg=" + this.msg + ", token=" + this.token + ')';
    }
}
