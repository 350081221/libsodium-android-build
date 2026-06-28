package com.yuanqi.master.network.model.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/yuanqi/master/network/model/request/ForgetPwdRequest;", "", "userName", "", "userPwd", "coding", "userPhone", "userEmail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCoding", "()Ljava/lang/String;", "getUserEmail", "getUserName", "getUserPhone", "getUserPwd", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ForgetPwdRequest {
    public static final int $stable = 0;

    @l
    private final String coding;

    @l
    private final String userEmail;

    @l
    private final String userName;

    @l
    private final String userPhone;

    @l
    private final String userPwd;

    public ForgetPwdRequest(@l String userName, @l String userPwd, @l String coding, @l String userPhone, @l String userEmail) {
        l0.p(userName, "userName");
        l0.p(userPwd, "userPwd");
        l0.p(coding, "coding");
        l0.p(userPhone, "userPhone");
        l0.p(userEmail, "userEmail");
        this.userName = userName;
        this.userPwd = userPwd;
        this.coding = coding;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
    }

    public static /* synthetic */ ForgetPwdRequest copy$default(ForgetPwdRequest forgetPwdRequest, String str, String str2, String str3, String str4, String str5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = forgetPwdRequest.userName;
        }
        if ((i5 & 2) != 0) {
            str2 = forgetPwdRequest.userPwd;
        }
        String str6 = str2;
        if ((i5 & 4) != 0) {
            str3 = forgetPwdRequest.coding;
        }
        String str7 = str3;
        if ((i5 & 8) != 0) {
            str4 = forgetPwdRequest.userPhone;
        }
        String str8 = str4;
        if ((i5 & 16) != 0) {
            str5 = forgetPwdRequest.userEmail;
        }
        return forgetPwdRequest.copy(str, str6, str7, str8, str5);
    }

    @l
    public final String component1() {
        return this.userName;
    }

    @l
    public final String component2() {
        return this.userPwd;
    }

    @l
    public final String component3() {
        return this.coding;
    }

    @l
    public final String component4() {
        return this.userPhone;
    }

    @l
    public final String component5() {
        return this.userEmail;
    }

    @l
    public final ForgetPwdRequest copy(@l String userName, @l String userPwd, @l String coding, @l String userPhone, @l String userEmail) {
        l0.p(userName, "userName");
        l0.p(userPwd, "userPwd");
        l0.p(coding, "coding");
        l0.p(userPhone, "userPhone");
        l0.p(userEmail, "userEmail");
        return new ForgetPwdRequest(userName, userPwd, coding, userPhone, userEmail);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForgetPwdRequest)) {
            return false;
        }
        ForgetPwdRequest forgetPwdRequest = (ForgetPwdRequest) obj;
        return l0.g(this.userName, forgetPwdRequest.userName) && l0.g(this.userPwd, forgetPwdRequest.userPwd) && l0.g(this.coding, forgetPwdRequest.coding) && l0.g(this.userPhone, forgetPwdRequest.userPhone) && l0.g(this.userEmail, forgetPwdRequest.userEmail);
    }

    @l
    public final String getCoding() {
        return this.coding;
    }

    @l
    public final String getUserEmail() {
        return this.userEmail;
    }

    @l
    public final String getUserName() {
        return this.userName;
    }

    @l
    public final String getUserPhone() {
        return this.userPhone;
    }

    @l
    public final String getUserPwd() {
        return this.userPwd;
    }

    public int hashCode() {
        return (((((((this.userName.hashCode() * 31) + this.userPwd.hashCode()) * 31) + this.coding.hashCode()) * 31) + this.userPhone.hashCode()) * 31) + this.userEmail.hashCode();
    }

    @l
    public String toString() {
        return "ForgetPwdRequest(userName=" + this.userName + ", userPwd=" + this.userPwd + ", coding=" + this.coding + ", userPhone=" + this.userPhone + ", userEmail=" + this.userEmail + ')';
    }

    public /* synthetic */ ForgetPwdRequest(String str, String str2, String str3, String str4, String str5, int i5, w wVar) {
        this(str, str2, str3, (i5 & 8) != 0 ? "" : str4, (i5 & 16) != 0 ? "" : str5);
    }
}
