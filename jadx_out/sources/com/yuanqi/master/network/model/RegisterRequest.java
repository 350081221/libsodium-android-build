package com.yuanqi.master.network.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/yuanqi/master/network/model/RegisterRequest;", "", "userName", "", "userPwd", "userPhone", "userEmail", "coding", "invCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCoding", "()Ljava/lang/String;", "getInvCode", "getUserEmail", "getUserName", "getUserPhone", "getUserPwd", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegisterRequest {
    public static final int $stable = 0;

    @l
    private final String coding;

    @m
    private final String invCode;

    @l
    private final String userEmail;

    @l
    private final String userName;

    @l
    private final String userPhone;

    @l
    private final String userPwd;

    public RegisterRequest(@l String userName, @l String userPwd, @l String userPhone, @l String userEmail, @l String coding, @m String str) {
        l0.p(userName, "userName");
        l0.p(userPwd, "userPwd");
        l0.p(userPhone, "userPhone");
        l0.p(userEmail, "userEmail");
        l0.p(coding, "coding");
        this.userName = userName;
        this.userPwd = userPwd;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.coding = coding;
        this.invCode = str;
    }

    public static /* synthetic */ RegisterRequest copy$default(RegisterRequest registerRequest, String str, String str2, String str3, String str4, String str5, String str6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = registerRequest.userName;
        }
        if ((i5 & 2) != 0) {
            str2 = registerRequest.userPwd;
        }
        String str7 = str2;
        if ((i5 & 4) != 0) {
            str3 = registerRequest.userPhone;
        }
        String str8 = str3;
        if ((i5 & 8) != 0) {
            str4 = registerRequest.userEmail;
        }
        String str9 = str4;
        if ((i5 & 16) != 0) {
            str5 = registerRequest.coding;
        }
        String str10 = str5;
        if ((i5 & 32) != 0) {
            str6 = registerRequest.invCode;
        }
        return registerRequest.copy(str, str7, str8, str9, str10, str6);
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
        return this.userPhone;
    }

    @l
    public final String component4() {
        return this.userEmail;
    }

    @l
    public final String component5() {
        return this.coding;
    }

    @m
    public final String component6() {
        return this.invCode;
    }

    @l
    public final RegisterRequest copy(@l String userName, @l String userPwd, @l String userPhone, @l String userEmail, @l String coding, @m String str) {
        l0.p(userName, "userName");
        l0.p(userPwd, "userPwd");
        l0.p(userPhone, "userPhone");
        l0.p(userEmail, "userEmail");
        l0.p(coding, "coding");
        return new RegisterRequest(userName, userPwd, userPhone, userEmail, coding, str);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        return l0.g(this.userName, registerRequest.userName) && l0.g(this.userPwd, registerRequest.userPwd) && l0.g(this.userPhone, registerRequest.userPhone) && l0.g(this.userEmail, registerRequest.userEmail) && l0.g(this.coding, registerRequest.coding) && l0.g(this.invCode, registerRequest.invCode);
    }

    @l
    public final String getCoding() {
        return this.coding;
    }

    @m
    public final String getInvCode() {
        return this.invCode;
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
        int hashCode = ((((((((this.userName.hashCode() * 31) + this.userPwd.hashCode()) * 31) + this.userPhone.hashCode()) * 31) + this.userEmail.hashCode()) * 31) + this.coding.hashCode()) * 31;
        String str = this.invCode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @l
    public String toString() {
        return "RegisterRequest(userName=" + this.userName + ", userPwd=" + this.userPwd + ", userPhone=" + this.userPhone + ", userEmail=" + this.userEmail + ", coding=" + this.coding + ", invCode=" + this.invCode + ')';
    }

    public /* synthetic */ RegisterRequest(String str, String str2, String str3, String str4, String str5, String str6, int i5, w wVar) {
        this(str, str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) != 0 ? "" : str4, str5, (i5 & 32) != 0 ? null : str6);
    }
}
