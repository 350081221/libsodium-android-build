package com.bytedance.tools.ui.ui;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.bytedance.tools.R;
import com.bytedance.tools.d.i;
import com.bytedance.tools.d.j;
import com.bytedance.tools.ui.view.d;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import java.util.List;
import org.json.JSONObject;

@Instrumented
/* loaded from: classes2.dex */
public class ToolRitDetailActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private TextView f6360a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f6361b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f6362c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f6363d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f6364e;

    /* renamed from: f, reason: collision with root package name */
    private Button f6365f;

    /* renamed from: g, reason: collision with root package name */
    private Button f6366g;

    /* renamed from: h, reason: collision with root package name */
    private RadioGroup f6367h;

    /* renamed from: i, reason: collision with root package name */
    private d f6368i;

    /* renamed from: j, reason: collision with root package name */
    private com.bytedance.tools.ui.view.a f6369j;

    /* renamed from: k, reason: collision with root package name */
    private com.bytedance.tools.c.d f6370k;

    /* renamed from: l, reason: collision with root package name */
    private List<com.bytedance.tools.c.b> f6371l;

    /* renamed from: m, reason: collision with root package name */
    private int f6372m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ToolRitDetailActivity.this.D(-1);
            ToolRitDetailActivity.this.f6372m = 0;
            ToolRitDetailActivity.this.M();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ToolRitDetailActivity.this.M();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements RadioGroup.OnCheckedChangeListener {
        c() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i5) {
            if (i5 == -1) {
                ToolRitDetailActivity.this.f6365f.setEnabled(false);
                return;
            }
            ToolRitDetailActivity.this.f6365f.setEnabled(true);
            ToolRitDetailActivity.this.f6372m = i5;
            ToolRitDetailActivity.this.D(i5);
        }
    }

    private void C() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f6370k = com.bytedance.tools.c.d.b(intent.getStringExtra("rit_info"));
        }
        com.bytedance.tools.c.d a5 = com.bytedance.tools.c.d.a(this, this.f6370k.f6301a);
        this.f6370k = a5;
        j.d(this, "test_tool_slot_info_detail", a5.f6301a, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(int i5) {
        boolean z4;
        if (i5 == -1) {
            this.f6367h.clearCheck();
            this.f6368i.h();
            this.f6369j.e();
        }
        for (int i6 = 0; i6 < this.f6367h.getChildCount(); i6++) {
            com.bytedance.tools.ui.view.c cVar = (com.bytedance.tools.ui.view.c) this.f6367h.getChildAt(i6);
            if (cVar.getId() == i5) {
                z4 = true;
            } else {
                z4 = false;
            }
            cVar.setChecked(z4);
        }
    }

    private void I() {
        i.a(this, (Toolbar) findViewById(R.id.f5724f4), "代码位检测详情页");
        this.f6360a = (TextView) findViewById(R.id.f5693a3);
        this.f6361b = (TextView) findViewById(R.id.O2);
        this.f6362c = (TextView) findViewById(R.id.P2);
        this.f6363d = (TextView) findViewById(R.id.M2);
        this.f6364e = (TextView) findViewById(R.id.I2);
        this.f6365f = (Button) findViewById(R.id.S2);
        this.f6366g = (Button) findViewById(R.id.V2);
        this.f6367h = (RadioGroup) findViewById(R.id.T2);
        this.f6365f.setOnClickListener(new a());
        this.f6366g.setOnClickListener(new b());
        this.f6367h.setOnCheckedChangeListener(new c());
        J();
    }

    private void J() {
        L();
        com.bytedance.tools.c.d dVar = this.f6370k;
        com.bytedance.tools.c.b bVar = new com.bytedance.tools.c.b(dVar.f6308h, dVar.f6309i);
        this.f6368i = new d(this, this.f6367h, bVar, this.f6371l);
        this.f6369j = new com.bytedance.tools.ui.view.a(this, this.f6367h, bVar, this.f6371l);
        this.f6367h.addView(this.f6368i);
        this.f6367h.addView(this.f6369j);
        if (this.f6368i.m()) {
            this.f6367h.check(this.f6368i.getId());
        } else {
            this.f6367h.check(this.f6369j.getId());
        }
    }

    private void K() {
        this.f6360a.setText(this.f6370k.f6302b + "");
        this.f6361b.setText(this.f6370k.f6301a);
        this.f6362c.setText(this.f6370k.f6303c + ":" + this.f6370k.f6304d);
        this.f6363d.setText(this.f6370k.f6305e + ":" + this.f6370k.f6306f);
        this.f6364e.setText(this.f6370k.f6307g + "");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092 A[Catch: IOException -> 0x008e, TRY_LEAVE, TryCatch #8 {IOException -> 0x008e, blocks: (B:59:0x008a, B:52:0x0092), top: B:58:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void L() {
        /*
            r6 = this;
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L49
            android.content.res.AssetManager r2 = r6.getAssets()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L49
            java.lang.String r3 = "previewIds_new.json"
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L49
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L49
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L41
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L87
            r3.<init>()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L87
        L1a:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L87
            if (r4 == 0) goto L24
            r3.append(r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L87
            goto L1a
        L24:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L87
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L87
            r4.<init>(r3)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L87
            r2.close()     // Catch: java.io.IOException -> L34
            r1.close()     // Catch: java.io.IOException -> L34
            goto L38
        L34:
            r0 = move-exception
            r0.printStackTrace()
        L38:
            r0 = r4
            goto L60
        L3a:
            r3 = move-exception
            goto L4c
        L3c:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L88
        L41:
            r3 = move-exception
            r2 = r0
            goto L4c
        L44:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L88
        L49:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L4c:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L57
            r2.close()     // Catch: java.io.IOException -> L55
            goto L57
        L55:
            r1 = move-exception
            goto L5d
        L57:
            if (r1 == 0) goto L60
            r1.close()     // Catch: java.io.IOException -> L55
            goto L60
        L5d:
            r1.printStackTrace()
        L60:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.f6371l = r1
            if (r0 != 0) goto L6a
            return
        L6a:
            r1 = 0
        L6b:
            int r2 = r0.length()     // Catch: org.json.JSONException -> L82
            if (r1 >= r2) goto L86
            com.bytedance.tools.c.b r2 = new com.bytedance.tools.c.b     // Catch: org.json.JSONException -> L82
            org.json.JSONObject r3 = r0.getJSONObject(r1)     // Catch: org.json.JSONException -> L82
            r2.<init>(r3)     // Catch: org.json.JSONException -> L82
            java.util.List<com.bytedance.tools.c.b> r3 = r6.f6371l     // Catch: org.json.JSONException -> L82
            r3.add(r2)     // Catch: org.json.JSONException -> L82
            int r1 = r1 + 1
            goto L6b
        L82:
            r0 = move-exception
            r0.printStackTrace()
        L86:
            return
        L87:
            r0 = move-exception
        L88:
            if (r2 == 0) goto L90
            r2.close()     // Catch: java.io.IOException -> L8e
            goto L90
        L8e:
            r1 = move-exception
            goto L96
        L90:
            if (r1 == 0) goto L99
            r1.close()     // Catch: java.io.IOException -> L8e
            goto L99
        L96:
            r1.printStackTrace()
        L99:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tools.ui.ui.ToolRitDetailActivity.L():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        int i5 = this.f6372m;
        if (i5 == 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("config", "");
            com.bytedance.tools.d.d.a(this, "setting_rit", contentValues, "rit=?", new String[]{this.f6370k.f6301a});
            Toast.makeText(this, "清除成功", 0).show();
            j.d(this, "test_preview", this.f6370k.f6301a, "", "");
            return;
        }
        com.bytedance.tools.ui.view.c cVar = (com.bytedance.tools.ui.view.c) findViewById(i5);
        com.bytedance.tools.c.b configModel = cVar.getConfigModel();
        JSONObject jSONObject = new JSONObject();
        try {
            String a5 = configModel.a();
            String d5 = configModel.d();
            if ("1".equals(a5)) {
                jSONObject.put("ext", "{\"headers\":{\"x-tt-env\":\"ppe_live_online\",\"x-use-ppe\":\"1\",\"image-mode\":\"" + cVar.getImageMode() + "\"}}");
            } else {
                if (cVar.d()) {
                    Toast.makeText(this, "参数不合法，请重新设置", 0).show();
                    return;
                }
                jSONObject.put("aid", a5);
                jSONObject.put("cid", d5);
                j.d(this, "test_preview", this.f6370k.f6301a, a5, d5);
                if ("1696550504417319".equals(a5) && "1696824047861763".equals(d5)) {
                    jSONObject.put("ext", "{\"style_ids\":{\"playable_id\":1}}");
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        String c5 = com.bytedance.tools.d.b.c(jSONObject.toString());
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("config", c5);
        com.bytedance.tools.d.d.a(this, "setting_rit", contentValues2, "rit=?", new String[]{this.f6370k.f6301a});
        Toast.makeText(this, "保存成功", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        setContentView(R.layout.D);
        C();
        I();
        K();
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
