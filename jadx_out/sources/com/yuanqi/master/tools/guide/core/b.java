package com.yuanqi.master.tools.guide.core;

import android.R;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yuanqi.master.tools.guide.core.GuideLayout;
import com.yuanqi.master.tools.guide.lifecycle.ListenerFragment;
import java.lang.reflect.Field;
import java.security.InvalidParameterException;
import java.util.List;
import y2.e;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: o, reason: collision with root package name */
    private static final String f15138o = "listener_fragment";

    /* renamed from: a, reason: collision with root package name */
    private Activity f15139a;

    /* renamed from: b, reason: collision with root package name */
    private Fragment f15140b;

    /* renamed from: c, reason: collision with root package name */
    private y2.b f15141c;

    /* renamed from: d, reason: collision with root package name */
    private e f15142d;

    /* renamed from: e, reason: collision with root package name */
    private String f15143e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15144f;

    /* renamed from: g, reason: collision with root package name */
    private int f15145g;

    /* renamed from: h, reason: collision with root package name */
    private List<com.yuanqi.master.tools.guide.model.a> f15146h;

    /* renamed from: i, reason: collision with root package name */
    private int f15147i;

    /* renamed from: j, reason: collision with root package name */
    private GuideLayout f15148j;

    /* renamed from: k, reason: collision with root package name */
    private FrameLayout f15149k;

    /* renamed from: l, reason: collision with root package name */
    private SharedPreferences f15150l;

    /* renamed from: m, reason: collision with root package name */
    private int f15151m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15152n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f15153a;

        a(int i5) {
            this.f15153a = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f15146h != null && b.this.f15146h.size() != 0) {
                b.this.f15147i = 0;
                b.this.q();
                if (b.this.f15141c != null) {
                    b.this.f15141c.a(b.this);
                }
                b.this.i();
                b.this.f15150l.edit().putInt(b.this.f15143e, this.f15153a + 1).apply();
                return;
            }
            throw new IllegalStateException("there is no guide to show!! Please add at least one Page.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yuanqi.master.tools.guide.core.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0434b implements GuideLayout.e {
        C0434b() {
        }

        @Override // com.yuanqi.master.tools.guide.core.GuideLayout.e
        public void a(GuideLayout guideLayout) {
            b.this.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements GuideLayout.e {
        c() {
        }

        @Override // com.yuanqi.master.tools.guide.core.GuideLayout.e
        public void a(GuideLayout guideLayout) {
            b.this.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends com.yuanqi.master.tools.guide.lifecycle.b {
        d() {
        }

        @Override // com.yuanqi.master.tools.guide.lifecycle.b, com.yuanqi.master.tools.guide.lifecycle.a
        public void a() {
            z2.a.f("ListenerFragment.onDestroyView");
            b.this.l();
        }
    }

    public b(com.yuanqi.master.tools.guide.core.a aVar) {
        this.f15151m = -1;
        Activity activity = aVar.f15129a;
        this.f15139a = activity;
        this.f15140b = aVar.f15130b;
        this.f15141c = aVar.f15135g;
        this.f15142d = aVar.f15136h;
        this.f15143e = aVar.f15131c;
        this.f15144f = aVar.f15132d;
        this.f15146h = aVar.f15137i;
        this.f15145g = aVar.f15134f;
        View view = aVar.f15133e;
        view = view == null ? activity.findViewById(R.id.content) : view;
        if (view instanceof FrameLayout) {
            this.f15149k = (FrameLayout) view;
        } else {
            FrameLayout frameLayout = new FrameLayout(this.f15139a);
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            this.f15151m = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            int i5 = this.f15151m;
            if (i5 >= 0) {
                viewGroup.addView(frameLayout, i5, view.getLayoutParams());
            } else {
                viewGroup.addView(frameLayout, view.getLayoutParams());
            }
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            this.f15149k = frameLayout;
        }
        this.f15150l = this.f15139a.getSharedPreferences(x2.a.f22642a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Fragment fragment = this.f15140b;
        if (fragment != null) {
            j(fragment);
            FragmentManager childFragmentManager = this.f15140b.getChildFragmentManager();
            ListenerFragment listenerFragment = (ListenerFragment) childFragmentManager.findFragmentByTag(f15138o);
            if (listenerFragment == null) {
                listenerFragment = new ListenerFragment();
                childFragmentManager.beginTransaction().add(listenerFragment, f15138o).commitAllowingStateLoss();
            }
            listenerFragment.b(new d());
        }
    }

    private void j(Fragment fragment) {
        try {
            Field declaredField = Fragment.class.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            declaredField.set(fragment, null);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (NoSuchFieldException e6) {
            throw new RuntimeException(e6);
        }
    }

    private void m() {
        Fragment fragment = this.f15140b;
        if (fragment != null) {
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            ListenerFragment listenerFragment = (ListenerFragment) childFragmentManager.findFragmentByTag(f15138o);
            if (listenerFragment != null) {
                childFragmentManager.beginTransaction().remove(listenerFragment).commitAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        GuideLayout guideLayout = new GuideLayout(this.f15139a, this.f15146h.get(this.f15147i), this);
        guideLayout.setOnGuideLayoutDismissListener(new c());
        this.f15149k.addView(guideLayout, new FrameLayout.LayoutParams(-1, -1));
        this.f15148j = guideLayout;
        e eVar = this.f15142d;
        if (eVar != null) {
            eVar.a(this.f15147i);
        }
        this.f15152n = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.f15147i < this.f15146h.size() - 1) {
            this.f15147i++;
            q();
            return;
        }
        y2.b bVar = this.f15141c;
        if (bVar != null) {
            bVar.b(this);
        }
        m();
        this.f15152n = false;
    }

    public boolean k() {
        return this.f15152n;
    }

    public void l() {
        GuideLayout guideLayout = this.f15148j;
        if (guideLayout != null && guideLayout.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) this.f15148j.getParent();
            viewGroup.removeView(this.f15148j);
            if (!(viewGroup instanceof FrameLayout)) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                View childAt = viewGroup.getChildAt(0);
                viewGroup.removeAllViews();
                if (childAt != null) {
                    int i5 = this.f15151m;
                    if (i5 > 0) {
                        viewGroup2.addView(childAt, i5, viewGroup.getLayoutParams());
                    } else {
                        viewGroup2.addView(childAt, viewGroup.getLayoutParams());
                    }
                }
            }
            y2.b bVar = this.f15141c;
            if (bVar != null) {
                bVar.b(this);
            }
            this.f15148j = null;
        }
        this.f15152n = false;
    }

    public void n() {
        o(this.f15143e);
    }

    public void o(String str) {
        this.f15150l.edit().putInt(str, 0).apply();
    }

    public void p() {
        int i5 = this.f15150l.getInt(this.f15143e, 0);
        if ((!this.f15144f && i5 >= this.f15145g) || this.f15152n) {
            return;
        }
        this.f15152n = true;
        this.f15149k.post(new a(i5));
    }

    public void s(int i5) {
        if (i5 >= 0 && i5 <= this.f15146h.size() - 1) {
            if (this.f15147i == i5) {
                return;
            }
            this.f15147i = i5;
            GuideLayout guideLayout = this.f15148j;
            if (guideLayout != null) {
                guideLayout.setOnGuideLayoutDismissListener(new C0434b());
                this.f15148j.h();
                return;
            } else {
                q();
                return;
            }
        }
        throw new InvalidParameterException("The Guide page position is out of range. current:" + i5 + ", range: [ 0, " + this.f15146h.size() + " )");
    }

    public void t() {
        int i5 = this.f15147i - 1;
        this.f15147i = i5;
        s(i5);
    }
}
