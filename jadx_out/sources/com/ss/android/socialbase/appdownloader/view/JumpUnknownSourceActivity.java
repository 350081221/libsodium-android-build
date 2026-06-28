package com.ss.android.socialbase.appdownloader.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.socialbase.appdownloader.b;
import com.ss.android.socialbase.appdownloader.c;
import com.ss.android.socialbase.appdownloader.c.k;
import com.ss.android.socialbase.appdownloader.c.l;
import com.ss.android.socialbase.appdownloader.d;
import com.ss.android.socialbase.appdownloader.h;
import com.ss.android.socialbase.appdownloader.i;
import org.json.JSONObject;

@Instrumented
/* loaded from: classes3.dex */
public class JumpUnknownSourceActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private k f10397a;

    /* renamed from: b, reason: collision with root package name */
    private Intent f10398b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private Intent f10399c;

    /* renamed from: d, reason: collision with root package name */
    private int f10400d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f10401e;

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        a();
        h.a().a(this);
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        h.a().a(this);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    @Override // android.app.Activity
    protected void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        Intent intent = getIntent();
        this.f10398b = intent;
        if (intent != null) {
            this.f10399c = (Intent) intent.getParcelableExtra(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            this.f10400d = intent.getIntExtra("id", -1);
            try {
                this.f10401e = new JSONObject(intent.getStringExtra("config"));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (this.f10401e == null) {
            c.a((Activity) this);
            AppInstrumentation.onActivityResumeEnd();
            return;
        }
        b();
        k kVar = this.f10397a;
        if (kVar != null && !kVar.b()) {
            this.f10397a.a();
        } else if (this.f10397a == null) {
            finish();
        }
        AppInstrumentation.onActivityResumeEnd();
    }

    @Override // android.app.Activity
    protected void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }

    private void a() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    private void b() {
        if (this.f10397a != null || this.f10398b == null) {
            return;
        }
        try {
            com.ss.android.socialbase.appdownloader.c.c a5 = d.j().a();
            l a6 = a5 != null ? a5.a(this) : null;
            if (a6 == null) {
                a6 = new com.ss.android.socialbase.appdownloader.d.a(this);
            }
            int a7 = i.a(this, "tt_appdownloader_tip");
            int a8 = i.a(this, "tt_appdownloader_label_ok");
            int a9 = i.a(this, "tt_appdownloader_label_cancel");
            String optString = this.f10401e.optString("jump_unknown_source_tips");
            if (TextUtils.isEmpty(optString)) {
                optString = getString(i.a(this, "tt_appdownloader_jump_unknown_source_tips"));
            }
            a6.a(a7).a(optString).a(a8, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i5) {
                    JumpUnknownSourceActivity jumpUnknownSourceActivity = JumpUnknownSourceActivity.this;
                    if (!b.a(jumpUnknownSourceActivity, jumpUnknownSourceActivity.f10399c, JumpUnknownSourceActivity.this.f10400d, JumpUnknownSourceActivity.this.f10401e)) {
                        JumpUnknownSourceActivity jumpUnknownSourceActivity2 = JumpUnknownSourceActivity.this;
                        b.a((Context) jumpUnknownSourceActivity2, jumpUnknownSourceActivity2.f10399c, true);
                    } else {
                        b.c(JumpUnknownSourceActivity.this.f10400d, JumpUnknownSourceActivity.this.f10401e);
                    }
                    b.a(JumpUnknownSourceActivity.this.f10400d, JumpUnknownSourceActivity.this.f10401e);
                    JumpUnknownSourceActivity.this.finish();
                }
            }).b(a9, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i5) {
                    if (JumpUnknownSourceActivity.this.f10399c != null) {
                        JumpUnknownSourceActivity jumpUnknownSourceActivity = JumpUnknownSourceActivity.this;
                        b.a((Context) jumpUnknownSourceActivity, jumpUnknownSourceActivity.f10399c, true);
                    }
                    b.b(JumpUnknownSourceActivity.this.f10400d, JumpUnknownSourceActivity.this.f10401e);
                    JumpUnknownSourceActivity.this.finish();
                }
            }).a(new DialogInterface.OnCancelListener() { // from class: com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity.1
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    if (JumpUnknownSourceActivity.this.f10399c != null) {
                        JumpUnknownSourceActivity jumpUnknownSourceActivity = JumpUnknownSourceActivity.this;
                        b.a((Context) jumpUnknownSourceActivity, jumpUnknownSourceActivity.f10399c, true);
                    }
                    b.b(JumpUnknownSourceActivity.this.f10400d, JumpUnknownSourceActivity.this.f10401e);
                    JumpUnknownSourceActivity.this.finish();
                }
            }).a(false);
            this.f10397a = a6.a();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
