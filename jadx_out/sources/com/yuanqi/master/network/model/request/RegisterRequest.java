package com.yuanqi.master.network.model.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/yuanqi/master/network/model/request/RegisterRequest;", "", ServiceManagerNative.ACCOUNT, "", "invCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "getInvCode", "component1", "component2", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegisterRequest {
    public static final int $stable = 0;

    @l
    private final String account;

    @l
    private final String invCode;

    public RegisterRequest(@l String account, @l String invCode) {
        l0.p(account, "account");
        l0.p(invCode, "invCode");
        this.account = account;
        this.invCode = invCode;
    }

    public static /* synthetic */ RegisterRequest copy$default(RegisterRequest registerRequest, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = registerRequest.account;
        }
        if ((i5 & 2) != 0) {
            str2 = registerRequest.invCode;
        }
        return registerRequest.copy(str, str2);
    }

    @l
    public final String component1() {
        return this.account;
    }

    @l
    public final String component2() {
        return this.invCode;
    }

    @l
    public final RegisterRequest copy(@l String account, @l String invCode) {
        l0.p(account, "account");
        l0.p(invCode, "invCode");
        return new RegisterRequest(account, invCode);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        return l0.g(this.account, registerRequest.account) && l0.g(this.invCode, registerRequest.invCode);
    }

    @l
    public final String getAccount() {
        return this.account;
    }

    @l
    public final String getInvCode() {
        return this.invCode;
    }

    public int hashCode() {
        return (this.account.hashCode() * 31) + this.invCode.hashCode();
    }

    @l
    public String toString() {
        return "RegisterRequest(account=" + this.account + ", invCode=" + this.invCode + ')';
    }
}
