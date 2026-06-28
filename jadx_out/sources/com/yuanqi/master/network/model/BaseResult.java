package com.yuanqi.master.network.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000e\u0010\u0012\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/yuanqi/master/network/model/BaseResult;", "T", "", "msg", "", PluginConstants.KEY_ERROR_CODE, "", "data", "(Ljava/lang/String;ILjava/lang/Object;)V", "getCode", "()I", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ILjava/lang/Object;)Lcom/yuanqi/master/network/model/BaseResult;", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaseResult<T> {
    public static final int $stable = 0;
    private final int code;
    private final T data;

    @m
    private final String msg;

    public BaseResult(@m String str, int i5, T t5) {
        this.msg = str;
        this.code = i5;
        this.data = t5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseResult copy$default(BaseResult baseResult, String str, int i5, Object obj, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            str = baseResult.msg;
        }
        if ((i6 & 2) != 0) {
            i5 = baseResult.code;
        }
        if ((i6 & 4) != 0) {
            obj = baseResult.data;
        }
        return baseResult.copy(str, i5, obj);
    }

    @m
    public final String component1() {
        return this.msg;
    }

    public final int component2() {
        return this.code;
    }

    public final T component3() {
        return this.data;
    }

    @l
    public final BaseResult<T> copy(@m String str, int i5, T t5) {
        return new BaseResult<>(str, i5, t5);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseResult)) {
            return false;
        }
        BaseResult baseResult = (BaseResult) obj;
        return l0.g(this.msg, baseResult.msg) && this.code == baseResult.code && l0.g(this.data, baseResult.data);
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    @m
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        String str = this.msg;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.code)) * 31;
        T t5 = this.data;
        return hashCode + (t5 != null ? t5.hashCode() : 0);
    }

    @l
    public String toString() {
        return "BaseResult(msg=" + this.msg + ", code=" + this.code + ", data=" + this.data + ')';
    }
}
