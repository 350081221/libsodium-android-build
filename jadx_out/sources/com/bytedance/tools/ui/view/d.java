package com.bytedance.tools.ui.view;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.tools.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class d extends com.bytedance.tools.ui.view.c {

    /* renamed from: g, reason: collision with root package name */
    private final int f6454g;

    /* renamed from: h, reason: collision with root package name */
    private View f6455h;

    /* renamed from: i, reason: collision with root package name */
    private View f6456i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f6457j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f6458k;

    /* renamed from: l, reason: collision with root package name */
    private com.bytedance.tools.c.b f6459l;

    /* renamed from: m, reason: collision with root package name */
    private com.bytedance.tools.c.c f6460m;

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f6461a;

        /* renamed from: com.bytedance.tools.ui.view.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0136a implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.bytedance.tools.ui.a.a f6463a;

            C0136a(com.bytedance.tools.ui.a.a aVar) {
                this.f6463a = aVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
                this.f6463a.b(i5);
            }
        }

        /* loaded from: classes2.dex */
        class b implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.bytedance.tools.ui.a.a f6465a;

            b(com.bytedance.tools.ui.a.a aVar) {
                this.f6465a = aVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f6465a.a() != null) {
                    if (!this.f6465a.a().b(d.this.f6459l)) {
                        d.this.f6459l = this.f6465a.a();
                        d.this.f6460m = null;
                        d.this.f6458k.setText("");
                    }
                    d.this.f6457j.setText(d.this.f6459l.f());
                }
            }
        }

        a(List list) {
            this.f6461a = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.bytedance.tools.ui.a.a aVar = new com.bytedance.tools.ui.a.a(d.this.getContext(), this.f6461a);
            d.this.i(aVar, new C0136a(aVar), new b(aVar));
        }
    }

    /* loaded from: classes2.dex */
    class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f6467a;

        /* loaded from: classes2.dex */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.bytedance.tools.ui.a.b f6469a;

            a(com.bytedance.tools.ui.a.b bVar) {
                this.f6469a = bVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
                this.f6469a.b(i5);
            }
        }

        /* renamed from: com.bytedance.tools.ui.view.d$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class ViewOnClickListenerC0137b implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.bytedance.tools.ui.a.b f6471a;

            ViewOnClickListenerC0137b(com.bytedance.tools.ui.a.b bVar) {
                this.f6471a = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f6471a.a() != null) {
                    d.this.f6460m = this.f6471a.a();
                    d.this.f6458k.setText(d.this.f6460m.d());
                }
            }
        }

        b(List list) {
            this.f6467a = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.bytedance.tools.ui.a.b bVar = new com.bytedance.tools.ui.a.b(d.this.getContext(), new ArrayList());
            for (int i5 = 0; i5 < this.f6467a.size(); i5++) {
                if (((com.bytedance.tools.c.b) this.f6467a.get(i5)).b(d.this.f6459l)) {
                    bVar.c(((com.bytedance.tools.c.b) this.f6467a.get(i5)).e());
                    d.this.i(bVar, new a(bVar), new ViewOnClickListenerC0137b(bVar));
                    return;
                }
            }
            Toast.makeText(d.this.getContext(), "请先选中aid，再选择cid", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Dialog f6473a;

        c(Dialog dialog) {
            this.f6473a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f6473a.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tools.ui.view.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC0138d implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f6475a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Dialog f6476b;

        ViewOnClickListenerC0138d(View.OnClickListener onClickListener, Dialog dialog) {
            this.f6475a = onClickListener;
            this.f6476b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View.OnClickListener onClickListener = this.f6475a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            this.f6476b.dismiss();
        }
    }

    public d(Context context, RadioGroup radioGroup, com.bytedance.tools.c.b bVar, List<com.bytedance.tools.c.b> list) {
        super(context, radioGroup, bVar, list);
        this.f6454g = 66666688;
        setTitle("选择广告类型");
        setId(66666688);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(BaseAdapter baseAdapter, AdapterView.OnItemClickListener onItemClickListener, View.OnClickListener onClickListener) {
        Dialog dialog = new Dialog(getContext(), R.style.f6006g2);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.Q, (ViewGroup) null);
        ListView listView = (ListView) inflate.findViewById(R.id.f5746j2);
        listView.setAdapter((ListAdapter) baseAdapter);
        listView.setOnItemClickListener(onItemClickListener);
        inflate.findViewById(R.id.f5734h2).setOnClickListener(new c(dialog));
        inflate.findViewById(R.id.f5740i2).setOnClickListener(new ViewOnClickListenerC0138d(onClickListener, dialog));
        dialog.setContentView(inflate);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        layoutParams.width = getResources().getDisplayMetrics().widthPixels;
        inflate.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(80);
        dialog.getWindow().setWindowAnimations(R.style.p6);
        dialog.show();
    }

    private void o() {
        List<com.bytedance.tools.c.b> list = this.f6452f;
        if (list != null && list.size() != 0) {
            for (int i5 = 0; i5 < this.f6452f.size(); i5++) {
                if (this.f6452f.get(i5).b(this.f6451e)) {
                    com.bytedance.tools.c.b bVar = this.f6452f.get(i5);
                    this.f6459l = bVar;
                    this.f6457j.setText(bVar.f());
                    if (this.f6459l.e() != null && this.f6459l.e().size() != 0) {
                        for (int i6 = 0; i6 < this.f6459l.e().size(); i6++) {
                            if (this.f6459l.e().get(i6).b().equals(this.f6451e.d())) {
                                com.bytedance.tools.c.c cVar = this.f6459l.e().get(i6);
                                this.f6460m = cVar;
                                this.f6458k.setText(cVar.d());
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.tools.ui.view.c
    public void b(RadioGroup radioGroup, com.bytedance.tools.c.b bVar, List<com.bytedance.tools.c.b> list) {
        super.b(radioGroup, bVar, list);
        View.inflate(getContext(), R.layout.P, this.f6450d);
        this.f6455h = findViewById(R.id.W2);
        this.f6456i = findViewById(R.id.Y2);
        this.f6457j = (TextView) findViewById(R.id.X2);
        this.f6458k = (TextView) findViewById(R.id.Z2);
        o();
        this.f6455h.setOnClickListener(new a(list));
        this.f6456i.setOnClickListener(new b(list));
    }

    @Override // com.bytedance.tools.ui.view.c
    public boolean d() {
        String str;
        com.bytedance.tools.c.b bVar = this.f6459l;
        String str2 = "";
        if (bVar == null) {
            str = "";
        } else {
            str = bVar.a();
        }
        com.bytedance.tools.c.c cVar = this.f6460m;
        if (cVar != null) {
            str2 = cVar.b();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && TextUtils.getTrimmedLength(str) == 16 && TextUtils.getTrimmedLength(str2) == 16) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.tools.ui.view.c
    public com.bytedance.tools.c.b getConfigModel() {
        String str;
        com.bytedance.tools.c.b bVar = this.f6459l;
        String str2 = "";
        if (bVar == null) {
            str = "";
        } else {
            str = bVar.a();
        }
        com.bytedance.tools.c.c cVar = this.f6460m;
        if (cVar != null) {
            str2 = cVar.b();
        }
        return new com.bytedance.tools.c.b(str, str2);
    }

    @Override // com.bytedance.tools.ui.view.c
    public String getImageMode() {
        com.bytedance.tools.c.c cVar = this.f6460m;
        return cVar != null ? cVar.a() : "";
    }

    public void h() {
        this.f6457j.setText("");
        this.f6458k.setText("");
    }

    public boolean m() {
        List<com.bytedance.tools.c.b> list = this.f6452f;
        if (list != null && list.size() != 0) {
            for (int i5 = 0; i5 < this.f6452f.size(); i5++) {
                if (this.f6452f.get(i5).b(this.f6451e)) {
                    return true;
                }
            }
        }
        return false;
    }
}
