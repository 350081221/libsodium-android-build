package com.yuanqi.master.network.model.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/yuanqi/master/network/model/request/LoginRequest;", "", "userId", "", "(J)V", "getUserId", "()J", "component1", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoginRequest {
    public static final int $stable = 0;
    private final long userId;

    public LoginRequest(long j5) {
        this.userId = j5;
    }

    public static /* synthetic */ LoginRequest copy$default(LoginRequest loginRequest, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = loginRequest.userId;
        }
        return loginRequest.copy(j5);
    }

    public final long component1() {
        return this.userId;
    }

    @l
    public final LoginRequest copy(long j5) {
        return new LoginRequest(j5);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoginRequest) && this.userId == ((LoginRequest) obj).userId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Long.hashCode(this.userId);
    }

    @l
    public String toString() {
        return "LoginRequest(userId=" + this.userId + ')';
    }
}
