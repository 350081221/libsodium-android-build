package com.bytedance.mtesttools.d;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.mtesttools.b.h;
import com.bytedance.tools.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class d extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Context f4227a;

    /* renamed from: b, reason: collision with root package name */
    private List<j1.b> f4228b = new ArrayList();

    /* loaded from: classes2.dex */
    class a {

        /* renamed from: a, reason: collision with root package name */
        public LinearLayout f4229a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f4230b;

        /* renamed from: c, reason: collision with root package name */
        public ImageView f4231c;

        /* renamed from: d, reason: collision with root package name */
        public RelativeLayout f4232d;

        /* renamed from: e, reason: collision with root package name */
        public TextView f4233e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.bytedance.mtesttools.d.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class ViewOnClickListenerC0114a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j1.b f4235a;

            ViewOnClickListenerC0114a(j1.b bVar) {
                this.f4235a = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i5;
                if (a.this.f4231c.getVisibility() == 0) {
                    a.this.f4231c.setSelected(!r2.isSelected());
                    a aVar = a.this;
                    RelativeLayout relativeLayout = aVar.f4232d;
                    if (aVar.f4231c.isSelected()) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    relativeLayout.setVisibility(i5);
                    if (a.this.f4229a.getVisibility() == 0) {
                        a.this.d(this.f4235a);
                    }
                }
            }
        }

        a() {
        }

        private String a(Bundle bundle) {
            String str;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("customData");
                Object[] objArr = new Object[4];
                objArr[0] = Boolean.valueOf(bundle.getBoolean("rewardVeridy"));
                objArr[1] = Double.valueOf(bundle.getDouble("rewardAmount"));
                objArr[2] = bundle.getString("rewardName");
                if (bundle2 != null) {
                    str = bundle2.toString();
                } else {
                    str = "null";
                }
                objArr[3] = str;
                return String.format("激励回调信息 ：\nrewardVerify() = %1$s \ngetAmount() = %2$s \ngetRewardName() = %3$s \ngetCustomData(): \n%4$s ", objArr);
            }
            return "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(j1.b bVar) {
            this.f4233e.setText("");
            if (bVar == null) {
                return;
            }
            h a5 = bVar.a();
            com.bytedance.mtesttools.b.a d5 = bVar.d();
            StringBuffer stringBuffer = new StringBuffer();
            if (d5 != null) {
                stringBuffer.append("errorCode:" + d5.f4049a + "\n");
                stringBuffer.append("errorMsg:" + d5.f4050b + "\n");
                stringBuffer.append("thirdErrorCode:" + d5.f4051c + "\n");
                StringBuilder sb = new StringBuilder();
                sb.append("thirdErrorMsg:");
                sb.append(d5.f4052d);
                stringBuffer.append(sb.toString());
            } else if (a5 != null) {
                stringBuffer.append("广告位id:" + a5.d() + "\n");
                stringBuffer.append("代码位id:" + a5.a() + "\n");
                stringBuffer.append("adnName:" + a5.j() + "\n");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ecpm:");
                sb2.append(a5.g());
                stringBuffer.append(sb2.toString());
                if (TextUtils.equals("onRewardVerify", bVar.c())) {
                    String a6 = a(a5.h());
                    if (!TextUtils.isEmpty(a6)) {
                        stringBuffer.append("\n");
                        stringBuffer.append(a6);
                    }
                }
            }
            this.f4233e.setText(stringBuffer.toString());
        }

        public void b(int i5, j1.b bVar) {
            this.f4230b.setText(bVar.c());
            this.f4230b.setEnabled(bVar.e());
            if (bVar.b()) {
                this.f4232d.setVisibility(0);
                this.f4231c.setVisibility(0);
                this.f4231c.setSelected(true);
                d(bVar);
            } else {
                this.f4232d.setVisibility(8);
                this.f4231c.setVisibility(8);
            }
            this.f4229a.setOnClickListener(new ViewOnClickListenerC0114a(bVar));
        }
    }

    public d(Context context) {
        this.f4227a = context;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j1.b getItem(int i5) {
        return this.f4228b.get(i5);
    }

    public void b() {
        Iterator<j1.b> it = this.f4228b.iterator();
        while (it.hasNext()) {
            it.next().a(false);
        }
        notifyDataSetChanged();
    }

    public void c(String str) {
        Iterator<j1.b> it = this.f4228b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            j1.b next = it.next();
            if (next.c().equals(str)) {
                next.a(false);
                next.b(true);
                break;
            }
        }
        notifyDataSetChanged();
    }

    public void d(String str, com.bytedance.mtesttools.b.a aVar) {
        Iterator<j1.b> it = this.f4228b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            j1.b next = it.next();
            if (next.c().equals(str)) {
                next.a(true);
                next.a(aVar);
                next.b(true);
                break;
            }
        }
        notifyDataSetChanged();
    }

    public void e(String str, h hVar) {
        Iterator<j1.b> it = this.f4228b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            j1.b next = it.next();
            if (next.c().equals(str)) {
                next.a(true);
                next.a(hVar);
                next.b(true);
                break;
            }
        }
        notifyDataSetChanged();
    }

    public void f(List<j1.b> list) {
        this.f4228b.clear();
        this.f4228b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4228b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f4227a).inflate(R.layout.H0, viewGroup, false);
            aVar = new a();
            aVar.f4229a = (LinearLayout) view.findViewById(R.id.f5768n0);
            aVar.f4230b = (TextView) view.findViewById(R.id.f5780p0);
            aVar.f4231c = (ImageView) view.findViewById(R.id.F2);
            aVar.f4232d = (RelativeLayout) view.findViewById(R.id.f5762m0);
            aVar.f4233e = (TextView) view.findViewById(R.id.f5756l0);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.b(i5, this.f4228b.get(i5));
        return view;
    }
}
