package com.lzf.easyfloat.utils;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.lzf.easyfloat.R;
import com.lzf.easyfloat.interfaces.a;
import com.lzf.easyfloat.widget.BaseSwitchView;
import com.umeng.analytics.pro.bi;
import k2.b;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import u3.i;
import v3.q;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0013JF\u0010\u0018\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0004H\u0007J<\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%¨\u0006."}, d2 = {"Lcom/lzf/easyfloat/utils/c;", "", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "progress", "Lcom/lzf/easyfloat/interfaces/h;", "listener", "", "layoutId", "Lkotlin/r2;", "r", bi.aL, "Lm2/a;", "showPattern", "Lcom/lzf/easyfloat/interfaces/c;", "appFloatAnimator", bi.aK, "c", "()Lkotlin/r2;", "d", "slideOffset", "start", "end", bi.aA, "i", "", "b", "Ljava/lang/String;", c.f9279b, c.f9280c, "Lcom/lzf/easyfloat/widget/BaseSwitchView;", "Lcom/lzf/easyfloat/widget/BaseSwitchView;", "addView", "e", "closeView", "f", "F", "downX", socket.g.f22386a, "I", "screenWidth", bi.aJ, TypedValues.CycleType.S_WAVE_OFFSET, "<init>", "()V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final c f9278a = new c();

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final String f9279b = "ADD_TAG";

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final String f9280c = "CLOSE_TAG";

    /* renamed from: d, reason: collision with root package name */
    @m
    private static BaseSwitchView f9281d;

    /* renamed from: e, reason: collision with root package name */
    @m
    private static BaseSwitchView f9282e;

    /* renamed from: f, reason: collision with root package name */
    private static float f9283f;

    /* renamed from: g, reason: collision with root package name */
    private static int f9284g;

    /* renamed from: h, reason: collision with root package name */
    private static float f9285h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\u00060\u0000R\u00020\u0001H\n"}, d2 = {"Lcom/lzf/easyfloat/interfaces/a$a;", "Lcom/lzf/easyfloat/interfaces/a;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements v3.l<a.C0174a, r2> {
        public static final a INSTANCE = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"", "isCreated", "", "<anonymous parameter 1>", "Landroid/view/View;", "view", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: com.lzf.easyfloat.utils.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0175a extends n0 implements q<Boolean, String, View, r2> {
            public static final C0175a INSTANCE = new C0175a();

            C0175a() {
                super(3);
            }

            @Override // v3.q
            public /* bridge */ /* synthetic */ r2 invoke(Boolean bool, String str, View view) {
                invoke(bool.booleanValue(), str, view);
                return r2.f19517a;
            }

            public final void invoke(boolean z4, @m String str, @m View view) {
                if (!z4 || view == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    if (childAt instanceof BaseSwitchView) {
                        c cVar = c.f9278a;
                        BaseSwitchView baseSwitchView = (BaseSwitchView) childAt;
                        c.f9281d = baseSwitchView;
                        baseSwitchView.setTranslationX(baseSwitchView.getWidth());
                        baseSwitchView.setTranslationY(baseSwitchView.getWidth());
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* loaded from: classes3.dex */
        public static final class b extends n0 implements v3.a<r2> {
            public static final b INSTANCE = new b();

            b() {
                super(0);
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                c cVar = c.f9278a;
                c.f9281d = null;
            }
        }

        a() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(a.C0174a c0174a) {
            invoke2(c0174a);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l a.C0174a registerCallback) {
            l0.p(registerCallback, "$this$registerCallback");
            registerCallback.a(C0175a.INSTANCE);
            registerCallback.b(b.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\u00060\u0000R\u00020\u0001H\n"}, d2 = {"Lcom/lzf/easyfloat/interfaces/a$a;", "Lcom/lzf/easyfloat/interfaces/a;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements v3.l<a.C0174a, r2> {
        public static final b INSTANCE = new b();

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"", "isCreated", "", "<anonymous parameter 1>", "Landroid/view/View;", "view", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements q<Boolean, String, View, r2> {
            public static final a INSTANCE = new a();

            a() {
                super(3);
            }

            @Override // v3.q
            public /* bridge */ /* synthetic */ r2 invoke(Boolean bool, String str, View view) {
                invoke(bool.booleanValue(), str, view);
                return r2.f19517a;
            }

            public final void invoke(boolean z4, @m String str, @m View view) {
                if (!z4 || view == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    if (childAt instanceof BaseSwitchView) {
                        c cVar = c.f9278a;
                        c.f9282e = (BaseSwitchView) childAt;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: com.lzf.easyfloat.utils.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0176b extends n0 implements v3.a<r2> {
            public static final C0176b INSTANCE = new C0176b();

            C0176b() {
                super(0);
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                c cVar = c.f9278a;
                c.f9282e = null;
            }
        }

        b() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(a.C0174a c0174a) {
            invoke2(c0174a);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l a.C0174a registerCallback) {
            l0.p(registerCallback, "$this$registerCallback");
            registerCallback.a(a.INSTANCE);
            registerCallback.b(C0176b.INSTANCE);
        }
    }

    private c() {
    }

    private final r2 c() {
        return b.C0540b.g(k2.b.f19067a, f9279b, false, 2, null);
    }

    private final r2 d() {
        return b.C0540b.g(k2.b.f19067a, f9280c, false, 2, null);
    }

    public static /* synthetic */ void j(c cVar, MotionEvent motionEvent, com.lzf.easyfloat.interfaces.h hVar, int i5, m2.a aVar, com.lzf.easyfloat.interfaces.c cVar2, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            hVar = null;
        }
        com.lzf.easyfloat.interfaces.h hVar2 = hVar;
        if ((i6 & 4) != 0) {
            i5 = R.layout.f9189b;
        }
        int i7 = i5;
        if ((i6 & 8) != 0) {
            aVar = m2.a.CURRENT_ACTIVITY;
        }
        m2.a aVar2 = aVar;
        if ((i6 & 16) != 0) {
            cVar2 = new l2.c();
        }
        cVar.i(motionEvent, hVar2, i7, aVar2, cVar2);
    }

    public static /* synthetic */ void q(c cVar, MotionEvent motionEvent, com.lzf.easyfloat.interfaces.h hVar, int i5, float f5, float f6, float f7, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            hVar = null;
        }
        com.lzf.easyfloat.interfaces.h hVar2 = hVar;
        if ((i6 & 4) != 0) {
            i5 = R.layout.f9188a;
        }
        int i7 = i5;
        if ((i6 & 8) != 0) {
            f5 = -1.0f;
        }
        float f8 = f5;
        if ((i6 & 16) != 0) {
            f6 = 0.1f;
        }
        float f9 = f6;
        if ((i6 & 32) != 0) {
            f7 = 0.5f;
        }
        cVar.p(motionEvent, hVar2, i7, f8, f9, f7);
    }

    private final void r(MotionEvent motionEvent, float f5, com.lzf.easyfloat.interfaces.h hVar, int i5) {
        BaseSwitchView baseSwitchView = f9281d;
        if (baseSwitchView != null) {
            baseSwitchView.setTouchRangeListener(motionEvent, hVar);
            float f6 = 1 - f5;
            baseSwitchView.setTranslationX(baseSwitchView.getWidth() * f6);
            baseSwitchView.setTranslationY(baseSwitchView.getWidth() * f6);
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            t(i5);
        } else {
            c();
        }
    }

    static /* synthetic */ void s(c cVar, MotionEvent motionEvent, float f5, com.lzf.easyfloat.interfaces.h hVar, int i5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            hVar = null;
        }
        cVar.r(motionEvent, f5, hVar, i5);
    }

    private final void t(int i5) {
        b.C0540b c0540b = k2.b.f19067a;
        if (c0540b.z(f9279b)) {
            return;
        }
        b.a.u(b.a.A(c0540b.R(g.f9290a.i()), i5, null, 2, null).G(m2.a.CURRENT_ACTIVITY).I(f9279b).p(false).H(m2.b.BOTTOM), 8388693, 0, 0, 6, null).h(null).e(a.INSTANCE).J();
    }

    private final void u(int i5, m2.a aVar, com.lzf.easyfloat.interfaces.c cVar) {
        b.C0540b c0540b = k2.b.f19067a;
        if (c0540b.z(f9280c)) {
            return;
        }
        b.a.u(b.a.F(b.a.A(c0540b.R(g.f9290a.i()), i5, null, 2, null).G(aVar), true, false, 2, null).I(f9280c).H(m2.b.BOTTOM), 80, 0, 0, 6, null).h(cVar).e(b.INSTANCE).J();
    }

    @i
    public final void e(@l MotionEvent event) {
        l0.p(event, "event");
        j(this, event, null, 0, null, null, 30, null);
    }

    @i
    public final void f(@l MotionEvent event, @m com.lzf.easyfloat.interfaces.h hVar) {
        l0.p(event, "event");
        j(this, event, hVar, 0, null, null, 28, null);
    }

    @i
    public final void g(@l MotionEvent event, @m com.lzf.easyfloat.interfaces.h hVar, int i5) {
        l0.p(event, "event");
        j(this, event, hVar, i5, null, null, 24, null);
    }

    @i
    public final void h(@l MotionEvent event, @m com.lzf.easyfloat.interfaces.h hVar, int i5, @l m2.a showPattern) {
        l0.p(event, "event");
        l0.p(showPattern, "showPattern");
        j(this, event, hVar, i5, showPattern, null, 16, null);
    }

    @i
    public final void i(@l MotionEvent event, @m com.lzf.easyfloat.interfaces.h hVar, int i5, @l m2.a showPattern, @m com.lzf.easyfloat.interfaces.c cVar) {
        l0.p(event, "event");
        l0.p(showPattern, "showPattern");
        u(i5, showPattern, cVar);
        BaseSwitchView baseSwitchView = f9282e;
        if (baseSwitchView != null) {
            baseSwitchView.setTouchRangeListener(event, hVar);
        }
        if (event.getAction() == 1 || event.getAction() == 3) {
            d();
        }
    }

    @i
    public final void k(@m MotionEvent motionEvent) {
        q(this, motionEvent, null, 0, 0.0f, 0.0f, 0.0f, 62, null);
    }

    @i
    public final void l(@m MotionEvent motionEvent, @m com.lzf.easyfloat.interfaces.h hVar) {
        q(this, motionEvent, hVar, 0, 0.0f, 0.0f, 0.0f, 60, null);
    }

    @i
    public final void m(@m MotionEvent motionEvent, @m com.lzf.easyfloat.interfaces.h hVar, int i5) {
        q(this, motionEvent, hVar, i5, 0.0f, 0.0f, 0.0f, 56, null);
    }

    @i
    public final void n(@m MotionEvent motionEvent, @m com.lzf.easyfloat.interfaces.h hVar, int i5, float f5) {
        q(this, motionEvent, hVar, i5, f5, 0.0f, 0.0f, 48, null);
    }

    @i
    public final void o(@m MotionEvent motionEvent, @m com.lzf.easyfloat.interfaces.h hVar, int i5, float f5, float f6) {
        q(this, motionEvent, hVar, i5, f5, f6, 0.0f, 32, null);
    }

    @i
    public final void p(@m MotionEvent motionEvent, @m com.lzf.easyfloat.interfaces.h hVar, int i5, float f5, float f6, float f7) {
        boolean z4;
        if (motionEvent == null) {
            return;
        }
        if (f5 == -1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            if (f5 >= f6) {
                r(motionEvent, Math.min((f5 - f6) / (f7 - f6), 1.0f), hVar, i5);
                return;
            } else {
                c();
                return;
            }
        }
        f9284g = com.lzf.easyfloat.utils.b.f9276a.f(g.f9290a.i());
        f9285h = motionEvent.getRawX() / f9284g;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                } else {
                    if (f9283f < f9284g * f6) {
                        float f8 = f9285h;
                        if (f8 >= f6) {
                            r(motionEvent, Math.min((f8 - f6) / (f7 - f6), 1.0f), hVar, i5);
                            return;
                        }
                    }
                    c();
                    return;
                }
            }
            f9283f = 0.0f;
            r(motionEvent, f9285h, hVar, i5);
            return;
        }
        f9283f = motionEvent.getRawX();
    }
}
