package com.ss.android.downloadlib.addownload.compliance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.gromore.R;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import java.util.List;

@Instrumented
/* loaded from: classes3.dex */
public class AppDetailInfoActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f9695a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f9696b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f9697c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f9698d;

    /* renamed from: e, reason: collision with root package name */
    private long f9699e;

    /* renamed from: f, reason: collision with root package name */
    private long f9700f;

    /* renamed from: g, reason: collision with root package name */
    private List<Pair<String, String>> f9701g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.Adapter<Object> {
        private a() {
        }
    }

    private void b() {
        this.f9695a = (ImageView) findViewById(R.id.f3531c0);
        this.f9696b = (TextView) findViewById(R.id.K1);
        this.f9698d = (RecyclerView) findViewById(R.id.f3591w0);
        this.f9697c = (LinearLayout) findViewById(R.id.f3558l0);
        if (this.f9701g.isEmpty()) {
            this.f9698d.setVisibility(8);
            this.f9696b.setVisibility(0);
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setOrientation(1);
            this.f9698d.setLayoutManager(linearLayoutManager);
            this.f9698d.setAdapter(new a());
        }
        this.f9695a.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g.a("lp_app_detail_click_close", AppDetailInfoActivity.this.f9700f);
                AppDetailInfoActivity.this.finish();
            }
        });
        this.f9697c.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g.a("lp_app_detail_click_download", AppDetailInfoActivity.this.f9700f);
                b.a().b(AppDetailInfoActivity.this.f9700f);
                com.ss.android.socialbase.appdownloader.c.a((Activity) AppDetailInfoActivity.this);
                com.ss.android.socialbase.appdownloader.c.a(b.a().b());
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        g.a("lp_app_detail_click_close", this.f9700f);
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        setContentView(R.layout.X);
        if (a()) {
            b();
        } else {
            com.ss.android.socialbase.appdownloader.c.a((Activity) this);
        }
        AppInstrumentation.onActivityCreateEnd();
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
        AppInstrumentation.onActivityResumeEnd();
    }

    @Override // android.app.Activity
    protected void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }

    public static void a(Activity activity, long j5) {
        Intent intent = new Intent(activity, (Class<?>) AppDetailInfoActivity.class);
        intent.putExtra("app_info_id", j5);
        activity.startActivity(intent);
    }

    private boolean a() {
        this.f9699e = getIntent().getLongExtra("app_info_id", 0L);
        com.ss.android.downloadlib.addownload.b.b a5 = c.a().a(this.f9699e);
        if (a5 == null) {
            return false;
        }
        this.f9700f = a5.f9632b;
        this.f9701g = a5.f9638h;
        return true;
    }
}
