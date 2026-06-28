package com.yuanqi.master.network.model.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yuanqi/master/network/model/request/SmallRegistrationRequest;", "", "userName", "", "userPhone", PluginConstants.KEY_ERROR_CODE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getUserName", "getUserPhone", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmallRegistrationRequest {
    public static final int $stable = 0;

    @l
    private final String code;

    @l
    private final String userName;

    @l
    private final String userPhone;

    public SmallRegistrationRequest(@l String userName, @l String userPhone, @l String code) {
        l0.p(userName, "userName");
        l0.p(userPhone, "userPhone");
        l0.p(code, "code");
        this.userName = userName;
        this.userPhone = userPhone;
        this.code = code;
    }

    public static /* synthetic */ SmallRegistrationRequest copy$default(SmallRegistrationRequest smallRegistrationRequest, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = smallRegistrationRequest.userName;
        }
        if ((i5 & 2) != 0) {
            str2 = smallRegistrationRequest.userPhone;
        }
        if ((i5 & 4) != 0) {
            str3 = smallRegistrationRequest.code;
        }
        return smallRegistrationRequest.copy(str, str2, str3);
    }

    @l
    public final String component1() {
        return this.userName;
    }

    @l
    public final String component2() {
        return this.userPhone;
    }

    @l
    public final String component3() {
        return this.code;
    }

    @l
    public final SmallRegistrationRequest copy(@l String userName, @l String userPhone, @l String code) {
        l0.p(userName, "userName");
        l0.p(userPhone, "userPhone");
        l0.p(code, "code");
        return new SmallRegistrationRequest(userName, userPhone, code);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallRegistrationRequest)) {
            return false;
        }
        SmallRegistrationRequest smallRegistrationRequest = (SmallRegistrationRequest) obj;
        return l0.g(this.userName, smallRegistrationRequest.userName) && l0.g(this.userPhone, smallRegistrationRequest.userPhone) && l0.g(this.code, smallRegistrationRequest.code);
    }

    @l
    public final String getCode() {
        return this.code;
    }

    @l
    public final String getUserName() {
        return this.userName;
    }

    @l
    public final String getUserPhone() {
        return this.userPhone;
    }

    public int hashCode() {
        return (((this.userName.hashCode() * 31) + this.userPhone.hashCode()) * 31) + this.code.hashCode();
    }

    @l
    public String toString() {
        return "SmallRegistrationRequest(userName=" + this.userName + ", userPhone=" + this.userPhone + ", code=" + this.code + ')';
    }
}
