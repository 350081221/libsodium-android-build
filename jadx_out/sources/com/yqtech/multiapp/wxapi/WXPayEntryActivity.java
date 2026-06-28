package com.yqtech.multiapp.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.compose.runtime.internal.StabilityInferred;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.yuanqi.master.config.c;
import com.yuanqi.master.mine.account.a;
import com.yuanqi.master.tools.f1;
import java.lang.ref.WeakReference;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;", "Landroid/app/Activity;", "Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;", "()V", "api", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "handler", "Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$MyHandler;", "goToShowMsg", "", "showReq", "Lcom/tencent/mm/opensdk/modelmsg/ShowMessageFromWX$Req;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "onReq", HiAnalyticsConstant.Direction.REQUEST, "Lcom/tencent/mm/opensdk/modelbase/BaseReq;", "onResp", "resp", "Lcom/tencent/mm/opensdk/modelbase/BaseResp;", "Companion", "MyHandler", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Instrumented
/* loaded from: classes3.dex */
public final class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {

    @l
    private static final String TAG = "MicroMsg.WXEntryActivity";

    @m
    private IWXAPI api;

    @m
    private MyHandler handler;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$Companion;", "", "()V", "TAG", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$MyHandler;", "Landroid/os/Handler;", "wxEntryActivity", "Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;", "(Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;)V", "wxEntryActivityWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "handleMessage", "", "msg", "Landroid/os/Message;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class MyHandler extends Handler {

        @l
        private final WeakReference<WXPayEntryActivity> wxEntryActivityWeakReference;

        public MyHandler(@l WXPayEntryActivity wxEntryActivity) {
            l0.p(wxEntryActivity, "wxEntryActivity");
            this.wxEntryActivityWeakReference = new WeakReference<>(wxEntryActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(@l Message msg) {
            l0.p(msg, "msg");
            int i5 = msg.what;
        }
    }

    private final void goToShowMsg(ShowMessageFromWX.Req req) {
    }

    @Override // android.app.Activity
    public void onCreate(@m Bundle bundle) {
        TraceManager.startActivityTrace(WXPayEntryActivity.class.getName());
        super.onCreate(bundle);
        this.api = WXAPIFactory.createWXAPI(this, c.f14520a0, false);
        this.handler = new MyHandler(this);
        try {
            Intent intent = getIntent();
            IWXAPI iwxapi = this.api;
            if (iwxapi != null) {
                iwxapi.handleIntent(intent, this);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onNewIntent(@l Intent intent) {
        l0.p(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        IWXAPI iwxapi = this.api;
        l0.m(iwxapi);
        iwxapi.handleIntent(intent, this);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(@l BaseReq req) {
        l0.p(req, "req");
        if (req.getType() == 4) {
            goToShowMsg((ShowMessageFromWX.Req) req);
        }
        finish();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(@l BaseResp resp) {
        l0.p(resp, "resp");
        int i5 = resp.errCode;
        if (i5 != -2) {
            if (i5 == 0) {
                f1.r("支付成功", 0, 2, null);
                a.f14786a.n(t0.a(k1.a()), WXPayEntryActivity$onResp$1.INSTANCE);
            }
        } else {
            f1.r("取消支付", 0, 2, null);
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(WXPayEntryActivity.class.getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    @Override // android.app.Activity
    protected void onResume() {
        AppInstrumentation.onActivityResumeBegin(WXPayEntryActivity.class.getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    @Override // android.app.Activity
    protected void onStart() {
        AppInstrumentation.onActivityStartBegin(WXPayEntryActivity.class.getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
