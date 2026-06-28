package com.yuanqi.master.network.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/yuanqi/master/network/model/LoginResponse;", "", "msg", "", PluginConstants.KEY_ERROR_CODE, "", "token", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoginResponse {
    public static final int $stable = 0;
    private final int code;

    @l
    private final String msg;

    @l
    private final String token;

    public LoginResponse(@l String msg, int i5, @l String token) {
        l0.p(msg, "msg");
        l0.p(token, "token");
        this.msg = msg;
        this.code = i5;
        this.token = token;
    }

    public static /* synthetic */ LoginResponse copy$default(LoginResponse loginResponse, String str, int i5, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = loginResponse.msg;
        }
        if ((i6 & 2) != 0) {
            i5 = loginResponse.code;
        }
        if ((i6 & 4) != 0) {
            str2 = loginResponse.token;
        }
        return loginResponse.copy(str, i5, str2);
    }

    @l
    public final String component1() {
        return this.msg;
    }

    public final int component2() {
        return this.code;
    }

    @l
    public final String component3() {
        return this.token;
    }

    @l
    public final LoginResponse copy(@l String msg, int i5, @l String token) {
        l0.p(msg, "msg");
        l0.p(token, "token");
        return new LoginResponse(msg, i5, token);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResponse)) {
            return false;
        }
        LoginResponse loginResponse = (LoginResponse) obj;
        return l0.g(this.msg, loginResponse.msg) && this.code == loginResponse.code && l0.g(this.token, loginResponse.token);
    }

    public final int getCode() {
        return this.code;
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
        return (((this.msg.hashCode() * 31) + Integer.hashCode(this.code)) * 31) + this.token.hashCode();
    }

    @l
    public String toString() {
        return "LoginResponse(msg=" + this.msg + ", code=" + this.code + ", token=" + this.token + ')';
    }
}
