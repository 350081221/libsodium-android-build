package g0;

import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* loaded from: classes2.dex */
public enum c {
    SUCCEEDED(9000, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(AuthCode.StatusCode.WAITING_CONNECT, "用户取消"),
    NETWORK_ERROR(AuthCode.StatusCode.AUTH_INFO_NOT_EXIST, "网络连接异常"),
    ACTIVITY_NOT_START_EXIT(6007, "支付未完成"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(com.alipay.sdk.app.b.f3003h, "重复请求"),
    PAY_WAITTING(JosStatusCodes.RTN_CODE_COMMON_ERROR, "支付结果确认中");


    /* renamed from: a, reason: collision with root package name */
    public int f16101a;

    /* renamed from: b, reason: collision with root package name */
    public String f16102b;

    c(int i5, String str) {
        this.f16101a = i5;
        this.f16102b = str;
    }

    public void a(int i5) {
        this.f16101a = i5;
    }

    public int b() {
        return this.f16101a;
    }

    public static c b(int i5) {
        if (i5 == 4001) {
            return PARAMS_ERROR;
        }
        if (i5 == 5000) {
            return DOUBLE_REQUEST;
        }
        if (i5 == 8000) {
            return PAY_WAITTING;
        }
        if (i5 == 9000) {
            return SUCCEEDED;
        }
        if (i5 == 6001) {
            return CANCELED;
        }
        if (i5 != 6002) {
            return FAILED;
        }
        return NETWORK_ERROR;
    }

    public void a(String str) {
        this.f16102b = str;
    }

    public String a() {
        return this.f16102b;
    }
}
