package com.bytedance.tools.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.LocationProvider;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.tools.R;
import com.bytedance.tools.ToolsProvider;
import com.bytedance.tools.d.g;
import com.bytedance.tools.ui.ui.a.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b extends FoldSpinnerView {

    /* renamed from: f, reason: collision with root package name */
    private com.bytedance.tools.c.a f6435f;

    /* renamed from: g, reason: collision with root package name */
    private Context f6436g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bytedance.tools.c.a f6437a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f6438b;

        /* renamed from: com.bytedance.tools.ui.view.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0134a implements a.c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.bytedance.tools.ui.ui.a.a f6440a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6441b;

            C0134a(com.bytedance.tools.ui.ui.a.a aVar, String str) {
                this.f6440a = aVar;
                this.f6441b = str;
            }

            @Override // com.bytedance.tools.ui.ui.a.a.c
            public void a() {
                String str;
                com.bytedance.tools.ui.ui.a.a aVar = this.f6440a;
                if (aVar instanceof com.bytedance.tools.ui.ui.a.c) {
                    com.bytedance.tools.c.a aVar2 = a.this.f6437a;
                    if (((com.bytedance.tools.ui.ui.a.c) aVar).h()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    aVar2.h(str);
                } else if (aVar instanceof com.bytedance.tools.ui.ui.a.b) {
                    a.this.f6437a.h(((com.bytedance.tools.ui.ui.a.b) aVar).i());
                }
                if (!a.this.f6437a.i().equals(this.f6441b)) {
                    g.c(b.this.f6436g, a.this.f6437a.p(), a.this.f6437a.i());
                    a aVar3 = a.this;
                    if (b.this.m(aVar3.f6437a)) {
                        ((ImageView) a.this.f6438b.findViewById(R.id.v4)).setImageResource(R.drawable.H0);
                    } else {
                        ((ImageView) a.this.f6438b.findViewById(R.id.v4)).setImageResource(R.drawable.I0);
                    }
                }
                this.f6440a.dismiss();
                a aVar4 = a.this;
                b.this.i(aVar4.f6437a);
            }

            @Override // com.bytedance.tools.ui.ui.a.a.c
            public void b() {
                this.f6440a.dismiss();
            }
        }

        a(com.bytedance.tools.c.a aVar, View view) {
            this.f6437a = aVar;
            this.f6438b = view;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.bytedance.tools.ui.ui.a.c cVar;
            if (this.f6437a.o() == 1) {
                com.bytedance.tools.ui.ui.a.b bVar = new com.bytedance.tools.ui.ui.a.b(b.this.f6436g);
                bVar.h(b.this.g(this.f6437a.p(), this.f6437a.i()));
                cVar = bVar;
            } else {
                com.bytedance.tools.ui.ui.a.c cVar2 = new com.bytedance.tools.ui.ui.a.c(b.this.f6436g);
                cVar2.g("1".equals(this.f6437a.i()));
                cVar = cVar2;
            }
            String i5 = this.f6437a.i();
            cVar.c(this.f6437a.f());
            cVar.b(new C0134a(cVar, i5));
            cVar.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tools.ui.view.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0135b extends TTCustomController {

        /* renamed from: com.bytedance.tools.ui.view.b$b$a */
        /* loaded from: classes2.dex */
        class a implements LocationProvider {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f6444a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6445b;

            a(String str, String str2) {
                this.f6444a = str;
                this.f6445b = str2;
            }

            @Override // com.bytedance.sdk.openadsdk.LocationProvider
            public double getLatitude() {
                if (TextUtils.isEmpty(this.f6444a)) {
                    return 0.0d;
                }
                return Double.valueOf(this.f6444a).doubleValue();
            }

            @Override // com.bytedance.sdk.openadsdk.LocationProvider
            public double getLongitude() {
                if (TextUtils.isEmpty(this.f6445b)) {
                    return 0.0d;
                }
                return Double.valueOf(this.f6445b).doubleValue();
            }
        }

        C0135b() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public boolean alist() {
            return "1".equals(g.a(ToolsProvider.f6267a, 17));
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        @Nullable
        public String getDevImei() {
            return g.a(ToolsProvider.f6267a, 10);
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        @Nullable
        public String getDevOaid() {
            return g.a(ToolsProvider.f6267a, 13);
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        @Nullable
        public String getMacAddress() {
            return g.a(ToolsProvider.f6267a, 18);
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        @Nullable
        public LocationProvider getTTLocation() {
            String[] split;
            String str;
            String a5 = g.a(ToolsProvider.f6267a, 8);
            if (!TextUtils.isEmpty(a5) && !"null".equals(a5) && (split = a5.split(",")) != null) {
                String str2 = "";
                if (split.length <= 0) {
                    str = "";
                } else {
                    str = split[0];
                }
                if (split.length > 1) {
                    str2 = split[1];
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    return null;
                }
                return new a(str, str2);
            }
            return super.getTTLocation();
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public boolean isCanUseAndroidId() {
            return "1".equals(g.a(ToolsProvider.f6267a, 22));
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public boolean isCanUseLocation() {
            return "1".equals(g.a(ToolsProvider.f6267a, 7));
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public boolean isCanUsePermissionRecordAudio() {
            return false;
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public boolean isCanUsePhoneState() {
            return "1".equals(g.a(ToolsProvider.f6267a, 9));
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public boolean isCanUseWifiState() {
            return "1".equals(g.a(ToolsProvider.f6267a, 11));
        }

        @Override // com.bytedance.sdk.openadsdk.TTCustomController
        public boolean isCanUseWriteExternal() {
            return "1".equals(g.a(ToolsProvider.f6267a, 12));
        }
    }

    public b(Context context, String str, com.bytedance.tools.c.a aVar, boolean z4) {
        super(context, str, z4);
        this.f6435f = aVar;
        this.f6436g = context;
        e();
    }

    private void e() {
        for (int i5 = 0; i5 < this.f6435f.k().size(); i5++) {
            com.bytedance.tools.c.a aVar = this.f6435f.k().get(i5);
            View inflate = LayoutInflater.from(this.f6436g).inflate(R.layout.U, (ViewGroup) this, false);
            ((TextView) inflate.findViewById(R.id.f5763m1)).setText(aVar.f());
            if (m(aVar)) {
                ((ImageView) inflate.findViewById(R.id.v4)).setImageResource(R.drawable.H0);
            } else {
                ((ImageView) inflate.findViewById(R.id.v4)).setImageResource(R.drawable.I0);
            }
            if (aVar.n()) {
                inflate.setOnClickListener(new a(aVar, inflate));
            } else {
                inflate.setOnClickListener(null);
            }
            addView(inflate);
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Pair<String, String>> g(int i5, String str) {
        String str2;
        String[] split;
        String str3;
        ArrayList arrayList = new ArrayList();
        if (i5 != 8) {
            if (i5 != 10) {
                if (i5 != 13) {
                    if (i5 != 18) {
                        return arrayList;
                    }
                    arrayList.add(new Pair("MAC", str));
                    return arrayList;
                }
                arrayList.add(new Pair("OAID", str));
                return arrayList;
            }
            arrayList.add(new Pair("IMEI", str));
            return arrayList;
        }
        String str4 = "";
        if (TextUtils.isEmpty(str) || (split = str.split(",")) == null) {
            str2 = "";
        } else {
            if (split.length <= 0) {
                str3 = "";
            } else {
                str3 = split[0];
            }
            if (split.length > 1) {
                str4 = split[1];
            }
            str2 = str4;
            str4 = str3;
        }
        arrayList.add(new Pair("Latitude", str4));
        arrayList.add(new Pair("Longitude", str2));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(com.bytedance.tools.c.a aVar) {
        if (aVar == null) {
            return;
        }
        int p5 = aVar.p();
        if (p5 == 22 || p5 == 7 || p5 == 17 || p5 == 9 || p5 == 11 || p5 == 12 || p5 == 10 || p5 == 18 || p5 == 8 || p5 == 13) {
            try {
                Class.forName("i1.a").getMethod("updateMediationPrivacyConfig", TTCustomController.class).invoke(null, new C0135b());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(com.bytedance.tools.c.a aVar) {
        String[] strArr;
        if (aVar.o() == 0) {
            return "1".equals(aVar.i());
        }
        if (aVar.o() == 1) {
            if (aVar.i() != null) {
                strArr = aVar.i().split(",");
            } else {
                strArr = null;
            }
            if (strArr == null && strArr.length == 0) {
                return false;
            }
            for (String str : strArr) {
                if (!"null".equals(str) && !TextUtils.isEmpty(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.tools.ui.view.FoldSpinnerView
    protected void b(boolean z4) {
        this.f6435f.e(z4);
    }

    public void j(String str, com.bytedance.tools.c.a aVar, boolean z4) {
        this.f6435f = aVar;
        setIsFold(z4);
        setTitleText(str);
        for (int childCount = getChildCount() - 1; childCount >= 1; childCount--) {
            removeView(getChildAt(childCount));
        }
        e();
    }
}
