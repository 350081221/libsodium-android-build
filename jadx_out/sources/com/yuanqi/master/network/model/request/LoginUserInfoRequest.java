package com.yuanqi.master.network.model.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yuanqi/master/network/model/request/LoginUserInfoRequest;", "", ServiceManagerNative.ACCOUNT, "", PluginConstants.KEY_ERROR_CODE, "invCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "getCode", "getInvCode", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoginUserInfoRequest {
    public static final int $stable = 0;

    @l
    private final String account;

    @l
    private final String code;

    @l
    private final String invCode;

    public LoginUserInfoRequest(@l String account, @l String code, @l String invCode) {
        l0.p(account, "account");
        l0.p(code, "code");
        l0.p(invCode, "invCode");
        this.account = account;
        this.code = code;
        this.invCode = invCode;
    }

    public static /* synthetic */ LoginUserInfoRequest copy$default(LoginUserInfoRequest loginUserInfoRequest, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = loginUserInfoRequest.account;
        }
        if ((i5 & 2) != 0) {
            str2 = loginUserInfoRequest.code;
        }
        if ((i5 & 4) != 0) {
            str3 = loginUserInfoRequest.invCode;
        }
        return loginUserInfoRequest.copy(str, str2, str3);
    }

    @l
    public final String component1() {
        return this.account;
    }

    @l
    public final String component2() {
        return this.code;
    }

    @l
    public final String component3() {
        return this.invCode;
    }

    @l
    public final LoginUserInfoRequest copy(@l String account, @l String code, @l String invCode) {
        l0.p(account, "account");
        l0.p(code, "code");
        l0.p(invCode, "invCode");
        return new LoginUserInfoRequest(account, code, invCode);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginUserInfoRequest)) {
            return false;
        }
        LoginUserInfoRequest loginUserInfoRequest = (LoginUserInfoRequest) obj;
        return l0.g(this.account, loginUserInfoRequest.account) && l0.g(this.code, loginUserInfoRequest.code) && l0.g(this.invCode, loginUserInfoRequest.invCode);
    }

    @l
    public final String getAccount() {
        return this.account;
    }

    @l
    public final String getCode() {
        return this.code;
    }

    @l
    public final String getInvCode() {
        return this.invCode;
    }

    public int hashCode() {
        return (((this.account.hashCode() * 31) + this.code.hashCode()) * 31) + this.invCode.hashCode();
    }

    @l
    public String toString() {
        return "LoginUserInfoRequest(account=" + this.account + ", code=" + this.code + ", invCode=" + this.invCode + ')';
    }
}
