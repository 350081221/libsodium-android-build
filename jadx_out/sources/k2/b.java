package k2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.lzf.easyfloat.core.e;
import com.lzf.easyfloat.data.FloatConfig;
import com.lzf.easyfloat.interfaces.a;
import com.lzf.easyfloat.interfaces.d;
import com.lzf.easyfloat.interfaces.f;
import com.lzf.easyfloat.utils.h;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.u0;
import p4.l;
import p4.m;
import socket.g;
import u3.i;
import v3.q;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lk2/b;", "", "<init>", "()V", bi.ay, "b", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final C0540b f19067a = new C0540b(null);

    @i0(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010G\u001a\u00020E¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u001c\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007J\u001c\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007J$\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u000eH\u0007J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000eJ\u0016\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eJ0\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u000eH\u0007J\u0010\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0005J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020$J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020$J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+J#\u00103\u001a\u00020\u00002\u001b\u00102\u001a\u0017\u0012\b\u0012\u00060/R\u000200\u0012\u0004\u0012\u00020\u00020.¢\u0006\u0002\b1J\u0010\u00106\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u000104J\u000e\u00109\u001a\u00020\u00002\u0006\u00108\u001a\u000207J\u001a\u0010<\u001a\u00020\u00002\b\b\u0002\u0010:\u001a\u00020$2\b\b\u0002\u0010;\u001a\u00020$J)\u0010@\u001a\u00020\u00002\u001a\u0010?\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030>0=\"\u0006\u0012\u0002\b\u00030>¢\u0006\u0004\b@\u0010AJ\u0006\u0010B\u001a\u00020\u0002J\u0010\u0010D\u001a\u00020\u00022\u0006\u0010C\u001a\u00020$H\u0016R\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010I¨\u0006M"}, d2 = {"Lk2/b$a;", "Lcom/lzf/easyfloat/interfaces/g;", "Lkotlin/r2;", "c", g.f22386a, "", MediationConstant.KEY_REASON, "b", "Lm2/b;", "sidePattern", "H", "Lm2/a;", "showPattern", "G", "", "layoutId", "Lcom/lzf/easyfloat/interfaces/f;", "invokeView", "x", "Landroid/view/View;", "layoutView", bi.aG, "gravity", "offsetX", "offsetY", bi.aL, "C", "y", "D", "left", "top", "right", "bottom", "m", "floatTag", "I", "", "dragEnable", bi.aA, "immersionStatusBar", "v", "hasEditText", "d", "Lcom/lzf/easyfloat/interfaces/d;", "callbacks", "f", "Lkotlin/Function1;", "Lcom/lzf/easyfloat/interfaces/a$a;", "Lcom/lzf/easyfloat/interfaces/a;", "Lkotlin/u;", "builder", "e", "Lcom/lzf/easyfloat/interfaces/c;", "floatAnimator", bi.aJ, "Lcom/lzf/easyfloat/interfaces/b;", "displayHeight", "o", "widthMatch", "heightMatch", "E", "", "Ljava/lang/Class;", "clazz", "q", "([Ljava/lang/Class;)Lk2/b$a;", "J", "isOpen", bi.ay, "Landroid/content/Context;", "Landroid/content/Context;", "activity", "Lcom/lzf/easyfloat/data/FloatConfig;", "Lcom/lzf/easyfloat/data/FloatConfig;", "config", "<init>", "(Landroid/content/Context;)V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a implements com.lzf.easyfloat.interfaces.g {

        /* renamed from: a, reason: collision with root package name */
        @l
        private final Context f19068a;

        /* renamed from: b, reason: collision with root package name */
        @l
        private final FloatConfig f19069b;

        public a(@l Context activity) {
            l0.p(activity, "activity");
            this.f19068a = activity;
            this.f19069b = new FloatConfig(null, null, null, false, false, false, false, false, false, null, null, false, false, 0, null, null, 0, 0, 0, 0, null, null, null, null, null, null, false, false, 0, 536870911, null);
        }

        public static /* synthetic */ a A(a aVar, int i5, f fVar, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                fVar = null;
            }
            return aVar.x(i5, fVar);
        }

        public static /* synthetic */ a B(a aVar, View view, f fVar, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                fVar = null;
            }
            return aVar.z(view, fVar);
        }

        public static /* synthetic */ a F(a aVar, boolean z4, boolean z5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                z4 = false;
            }
            if ((i5 & 2) != 0) {
                z5 = false;
            }
            return aVar.E(z4, z5);
        }

        private final void b(String str) {
            a.C0174a a5;
            q<Boolean, String, View, r2> e5;
            d callbacks = this.f19069b.getCallbacks();
            if (callbacks != null) {
                callbacks.d(false, str, null);
            }
            com.lzf.easyfloat.interfaces.a floatCallbacks = this.f19069b.getFloatCallbacks();
            if (floatCallbacks != null && (a5 = floatCallbacks.a()) != null && (e5 = a5.e()) != null) {
                e5.invoke(Boolean.FALSE, str, null);
            }
            h.f9294a.i(str);
            int hashCode = str.hashCode();
            if (hashCode != 324317221) {
                if (hashCode != 832581388) {
                    if (hashCode != 952571600 || !str.equals(c.f19072c)) {
                        return;
                    }
                } else if (!str.equals(c.f19071b)) {
                    return;
                }
            } else if (!str.equals(c.f19074e)) {
                return;
            }
            throw new Exception(str);
        }

        private final void c() {
            e.f9234a.b(this.f19068a, this.f19069b);
        }

        private final void g() {
            Context context = this.f19068a;
            if (context instanceof Activity) {
                n2.c.j((Activity) context, this);
            } else {
                b(c.f19075f);
            }
        }

        public static /* synthetic */ a n(a aVar, int i5, int i6, int i7, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i5 = 0;
            }
            if ((i9 & 2) != 0) {
                i6 = -com.lzf.easyfloat.utils.b.f9276a.g(aVar.f19068a);
            }
            if ((i9 & 4) != 0) {
                i7 = com.lzf.easyfloat.utils.b.f9276a.f(aVar.f19068a);
            }
            if ((i9 & 8) != 0) {
                i8 = com.lzf.easyfloat.utils.b.f9276a.d(aVar.f19068a);
            }
            return aVar.m(i5, i6, i7, i8);
        }

        public static /* synthetic */ a u(a aVar, int i5, int i6, int i7, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                i6 = 0;
            }
            if ((i8 & 4) != 0) {
                i7 = 0;
            }
            return aVar.t(i5, i6, i7);
        }

        @l
        public final a C(int i5) {
            this.f19069b.setLayoutChangedGravity(i5);
            return this;
        }

        @l
        public final a D(int i5, int i6) {
            this.f19069b.setLocationPair(new u0<>(Integer.valueOf(i5), Integer.valueOf(i6)));
            return this;
        }

        @l
        public final a E(boolean z4, boolean z5) {
            this.f19069b.setWidthMatch(z4);
            this.f19069b.setHeightMatch(z5);
            return this;
        }

        @l
        public final a G(@l m2.a showPattern) {
            l0.p(showPattern, "showPattern");
            this.f19069b.setShowPattern(showPattern);
            return this;
        }

        @l
        public final a H(@l m2.b sidePattern) {
            l0.p(sidePattern, "sidePattern");
            this.f19069b.setSidePattern(sidePattern);
            return this;
        }

        @l
        public final a I(@m String str) {
            this.f19069b.setFloatTag(str);
            return this;
        }

        public final void J() {
            if (this.f19069b.getLayoutId() == null && this.f19069b.getLayoutView() == null) {
                b(c.f19071b);
                return;
            }
            if (this.f19069b.getShowPattern() == m2.a.CURRENT_ACTIVITY) {
                c();
            } else if (n2.c.a(this.f19068a)) {
                c();
            } else {
                g();
            }
        }

        @Override // com.lzf.easyfloat.interfaces.g
        public void a(boolean z4) {
            if (z4) {
                c();
            } else {
                b(c.f19070a);
            }
        }

        @l
        public final a d(boolean z4) {
            this.f19069b.setHasEditText(z4);
            return this;
        }

        @l
        public final a e(@l v3.l<? super a.C0174a, r2> builder) {
            l0.p(builder, "builder");
            FloatConfig floatConfig = this.f19069b;
            com.lzf.easyfloat.interfaces.a aVar = new com.lzf.easyfloat.interfaces.a();
            aVar.b(builder);
            r2 r2Var = r2.f19517a;
            floatConfig.setFloatCallbacks(aVar);
            return this;
        }

        @l
        public final a f(@l d callbacks) {
            l0.p(callbacks, "callbacks");
            this.f19069b.setCallbacks(callbacks);
            return this;
        }

        @l
        public final a h(@m com.lzf.easyfloat.interfaces.c cVar) {
            this.f19069b.setFloatAnimator(cVar);
            return this;
        }

        @l
        @i
        public final a i() {
            return n(this, 0, 0, 0, 0, 15, null);
        }

        @l
        @i
        public final a j(int i5) {
            return n(this, i5, 0, 0, 0, 14, null);
        }

        @l
        @i
        public final a k(int i5, int i6) {
            return n(this, i5, i6, 0, 0, 12, null);
        }

        @l
        @i
        public final a l(int i5, int i6, int i7) {
            return n(this, i5, i6, i7, 0, 8, null);
        }

        @l
        @i
        public final a m(int i5, int i6, int i7, int i8) {
            this.f19069b.setLeftBorder(i5);
            this.f19069b.setTopBorder(i6);
            this.f19069b.setRightBorder(i7);
            this.f19069b.setBottomBorder(i8);
            return this;
        }

        @l
        public final a o(@l com.lzf.easyfloat.interfaces.b displayHeight) {
            l0.p(displayHeight, "displayHeight");
            this.f19069b.setDisplayHeight(displayHeight);
            return this;
        }

        @l
        public final a p(boolean z4) {
            this.f19069b.setDragEnable(z4);
            return this;
        }

        @l
        public final a q(@l Class<?>... clazz) {
            l0.p(clazz, "clazz");
            for (Class<?> cls : clazz) {
                Set<String> filterSet = this.f19069b.getFilterSet();
                String name = cls.getName();
                l0.o(name, "it.name");
                filterSet.add(name);
                if ((this.f19068a instanceof Activity) && l0.g(cls.getName(), ((Activity) this.f19068a).getComponentName().getClassName())) {
                    this.f19069b.setFilterSelf$easyfloat_release(true);
                }
            }
            return this;
        }

        @l
        @i
        public final a r(int i5) {
            return u(this, i5, 0, 0, 6, null);
        }

        @l
        @i
        public final a s(int i5, int i6) {
            return u(this, i5, i6, 0, 4, null);
        }

        @l
        @i
        public final a t(int i5, int i6, int i7) {
            this.f19069b.setGravity(i5);
            this.f19069b.setOffsetPair(new u0<>(Integer.valueOf(i6), Integer.valueOf(i7)));
            return this;
        }

        @l
        public final a v(boolean z4) {
            this.f19069b.setImmersionStatusBar(z4);
            return this;
        }

        @l
        @i
        public final a w(int i5) {
            return A(this, i5, null, 2, null);
        }

        @l
        @i
        public final a x(int i5, @m f fVar) {
            this.f19069b.setLayoutId(Integer.valueOf(i5));
            this.f19069b.setInvokeView(fVar);
            return this;
        }

        @l
        @i
        public final a y(@l View layoutView) {
            l0.p(layoutView, "layoutView");
            return B(this, layoutView, null, 2, null);
        }

        @l
        @i
        public final a z(@l View layoutView, @m f fVar) {
            l0.p(layoutView, "layoutView");
            this.f19069b.setLayoutView(layoutView);
            this.f19069b.setInvokeView(fVar);
            return this;
        }
    }

    @i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007J'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0012J%\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007JE\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001f\u0010 J%\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020!2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\"\u0010#J9\u0010'\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u001a\u0010&\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030%0$\"\u0006\u0012\u0002\b\u00030%H\u0007¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020!2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b)\u0010#J9\u0010*\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u001a\u0010&\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030%0$\"\u0006\u0012\u0002\b\u00030%H\u0007¢\u0006\u0004\b*\u0010(J\u001d\u0010+\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b+\u0010\u0012¨\u0006."}, d2 = {"Lk2/b$b;", "", "", TTDownloadField.TT_TAG, "Lcom/lzf/easyfloat/data/FloatConfig;", "q", "", "r", "Landroid/content/Context;", "activity", "Lk2/b$a;", "R", "", TTDownloadField.TT_FORCE, "Lkotlin/r2;", "f", "(Ljava/lang/String;Z)Lkotlin/r2;", "w", "(Ljava/lang/String;)Lkotlin/r2;", "I", "dragEnable", "i", "(ZLjava/lang/String;)Lkotlin/r2;", bi.aG, "Landroid/view/View;", bi.aL, "", "x", "y", "width", "height", "P", "(Ljava/lang/String;IIII)Lkotlin/r2;", "Landroid/app/Activity;", "o", "(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/Boolean;", "", "Ljava/lang/Class;", "clazz", "k", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/Boolean;", "C", "E", "b", "<init>", "()V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: k2.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0540b {
        private C0540b() {
        }

        public /* synthetic */ C0540b(w wVar) {
            this();
        }

        public static /* synthetic */ boolean A(C0540b c0540b, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = null;
            }
            return c0540b.z(str);
        }

        public static /* synthetic */ Boolean D(C0540b c0540b, Activity activity, String str, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                str = null;
            }
            return c0540b.C(activity, str);
        }

        public static /* synthetic */ Boolean G(C0540b c0540b, String str, Class[] clsArr, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = null;
            }
            return c0540b.E(str, clsArr);
        }

        public static /* synthetic */ r2 J(C0540b c0540b, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = null;
            }
            return c0540b.I(str);
        }

        public static /* synthetic */ r2 Q(C0540b c0540b, String str, int i5, int i6, int i7, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                str = null;
            }
            return c0540b.P(str, (i9 & 2) != 0 ? -1 : i5, (i9 & 4) != 0 ? -1 : i6, (i9 & 8) != 0 ? -1 : i7, (i9 & 16) == 0 ? i8 : -1);
        }

        public static /* synthetic */ r2 c(C0540b c0540b, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = null;
            }
            return c0540b.b(str);
        }

        public static /* synthetic */ r2 g(C0540b c0540b, String str, boolean z4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = null;
            }
            if ((i5 & 2) != 0) {
                z4 = false;
            }
            return c0540b.f(str, z4);
        }

        public static /* synthetic */ r2 j(C0540b c0540b, boolean z4, String str, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                str = null;
            }
            return c0540b.i(z4, str);
        }

        public static /* synthetic */ Boolean m(C0540b c0540b, String str, Class[] clsArr, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = null;
            }
            return c0540b.k(str, clsArr);
        }

        public static /* synthetic */ Boolean p(C0540b c0540b, Activity activity, String str, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                str = null;
            }
            return c0540b.o(activity, str);
        }

        private final FloatConfig q(String str) {
            com.lzf.easyfloat.core.d e5 = e.f9234a.e(str);
            if (e5 == null) {
                return null;
            }
            return e5.r();
        }

        private final Set<String> r(String str) {
            FloatConfig q5 = q(str);
            if (q5 == null) {
                return null;
            }
            return q5.getFilterSet();
        }

        public static /* synthetic */ View u(C0540b c0540b, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = null;
            }
            return c0540b.t(str);
        }

        public static /* synthetic */ r2 x(C0540b c0540b, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = null;
            }
            return c0540b.w(str);
        }

        @m
        @i
        @u3.m
        public final Boolean B(@l Activity activity) {
            l0.p(activity, "activity");
            return D(this, activity, null, 2, null);
        }

        @m
        @i
        @u3.m
        public final Boolean C(@l Activity activity, @m String str) {
            l0.p(activity, "activity");
            Set<String> r5 = r(str);
            if (r5 == null) {
                return null;
            }
            return Boolean.valueOf(r5.remove(activity.getComponentName().getClassName()));
        }

        @m
        @i
        @u3.m
        public final Boolean E(@m String str, @l Class<?>... clazz) {
            l0.p(clazz, "clazz");
            Set<String> r5 = r(str);
            if (r5 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(clazz.length);
            for (Class<?> cls : clazz) {
                String name = cls.getName();
                l0.o(name, "it.name");
                arrayList.add(name);
            }
            return Boolean.valueOf(r5.removeAll(arrayList));
        }

        @m
        @i
        @u3.m
        public final Boolean F(@l Class<?>... clazz) {
            l0.p(clazz, "clazz");
            return G(this, null, clazz, 1, null);
        }

        @m
        @i
        @u3.m
        public final r2 H() {
            return J(this, null, 1, null);
        }

        @m
        @i
        @u3.m
        public final r2 I(@m String str) {
            return e.f9234a.i(true, str, true);
        }

        @m
        @i
        @u3.m
        public final r2 K() {
            return Q(this, null, 0, 0, 0, 0, 31, null);
        }

        @m
        @i
        @u3.m
        public final r2 L(@m String str) {
            return Q(this, str, 0, 0, 0, 0, 30, null);
        }

        @m
        @i
        @u3.m
        public final r2 M(@m String str, int i5) {
            return Q(this, str, i5, 0, 0, 0, 28, null);
        }

        @m
        @i
        @u3.m
        public final r2 N(@m String str, int i5, int i6) {
            return Q(this, str, i5, i6, 0, 0, 24, null);
        }

        @m
        @i
        @u3.m
        public final r2 O(@m String str, int i5, int i6, int i7) {
            return Q(this, str, i5, i6, i7, 0, 16, null);
        }

        @m
        @i
        @u3.m
        public final r2 P(@m String str, int i5, int i6, int i7, int i8) {
            com.lzf.easyfloat.core.d e5 = e.f9234a.e(str);
            if (e5 == null) {
                return null;
            }
            e5.L(i5, i6, i7, i8);
            return r2.f19517a;
        }

        @l
        @u3.m
        public final a R(@l Context activity) {
            l0.p(activity, "activity");
            if (activity instanceof Activity) {
                return new a(activity);
            }
            Activity j5 = com.lzf.easyfloat.utils.g.f9290a.j();
            if (j5 != null) {
                activity = j5;
            }
            return new a(activity);
        }

        @m
        @i
        @u3.m
        public final r2 a() {
            return c(this, null, 1, null);
        }

        @m
        @i
        @u3.m
        public final r2 b(@m String str) {
            Set<String> r5 = r(str);
            if (r5 == null) {
                return null;
            }
            r5.clear();
            return r2.f19517a;
        }

        @m
        @i
        @u3.m
        public final r2 d() {
            return g(this, null, false, 3, null);
        }

        @m
        @i
        @u3.m
        public final r2 e(@m String str) {
            return g(this, str, false, 2, null);
        }

        @m
        @i
        @u3.m
        public final r2 f(@m String str, boolean z4) {
            return e.f9234a.c(str, z4);
        }

        @m
        @i
        @u3.m
        public final r2 h(boolean z4) {
            return j(this, z4, null, 2, null);
        }

        @m
        @i
        @u3.m
        public final r2 i(boolean z4, @m String str) {
            FloatConfig q5 = q(str);
            if (q5 == null) {
                return null;
            }
            q5.setDragEnable(z4);
            return r2.f19517a;
        }

        @m
        @i
        @u3.m
        public final Boolean k(@m String str, @l Class<?>... clazz) {
            l0.p(clazz, "clazz");
            Set<String> r5 = r(str);
            if (r5 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(clazz.length);
            for (Class<?> cls : clazz) {
                String name = cls.getName();
                l0.o(name, "it.name");
                arrayList.add(name);
            }
            return Boolean.valueOf(r5.addAll(arrayList));
        }

        @m
        @i
        @u3.m
        public final Boolean l(@l Class<?>... clazz) {
            l0.p(clazz, "clazz");
            return m(this, null, clazz, 1, null);
        }

        @m
        @i
        @u3.m
        public final Boolean n(@l Activity activity) {
            l0.p(activity, "activity");
            return p(this, activity, null, 2, null);
        }

        @m
        @i
        @u3.m
        public final Boolean o(@l Activity activity, @m String str) {
            l0.p(activity, "activity");
            Set<String> r5 = r(str);
            if (r5 == null) {
                return null;
            }
            String className = activity.getComponentName().getClassName();
            l0.o(className, "activity.componentName.className");
            return Boolean.valueOf(r5.add(className));
        }

        @m
        @i
        @u3.m
        public final View s() {
            return u(this, null, 1, null);
        }

        @m
        @i
        @u3.m
        public final View t(@m String str) {
            FloatConfig q5 = q(str);
            if (q5 == null) {
                return null;
            }
            return q5.getLayoutView();
        }

        @m
        @i
        @u3.m
        public final r2 v() {
            return x(this, null, 1, null);
        }

        @m
        @i
        @u3.m
        public final r2 w(@m String str) {
            return e.f9234a.i(false, str, false);
        }

        @i
        @u3.m
        public final boolean y() {
            return A(this, null, 1, null);
        }

        @i
        @u3.m
        public final boolean z(@m String str) {
            FloatConfig q5 = q(str);
            if (q5 == null) {
                return false;
            }
            return q5.isShow();
        }
    }

    @m
    @i
    @u3.m
    public static final r2 A(@m String str, int i5, int i6) {
        return f19067a.N(str, i5, i6);
    }

    @m
    @i
    @u3.m
    public static final r2 B(@m String str, int i5, int i6, int i7) {
        return f19067a.O(str, i5, i6, i7);
    }

    @m
    @i
    @u3.m
    public static final r2 C(@m String str, int i5, int i6, int i7, int i8) {
        return f19067a.P(str, i5, i6, i7, i8);
    }

    @l
    @u3.m
    public static final a D(@l Context context) {
        return f19067a.R(context);
    }

    @m
    @i
    @u3.m
    public static final r2 a() {
        return f19067a.a();
    }

    @m
    @i
    @u3.m
    public static final r2 b(@m String str) {
        return f19067a.b(str);
    }

    @m
    @i
    @u3.m
    public static final r2 c() {
        return f19067a.d();
    }

    @m
    @i
    @u3.m
    public static final r2 d(@m String str) {
        return f19067a.e(str);
    }

    @m
    @i
    @u3.m
    public static final r2 e(@m String str, boolean z4) {
        return f19067a.f(str, z4);
    }

    @m
    @i
    @u3.m
    public static final r2 f(boolean z4) {
        return f19067a.h(z4);
    }

    @m
    @i
    @u3.m
    public static final r2 g(boolean z4, @m String str) {
        return f19067a.i(z4, str);
    }

    @m
    @i
    @u3.m
    public static final Boolean h(@m String str, @l Class<?>... clsArr) {
        return f19067a.k(str, clsArr);
    }

    @m
    @i
    @u3.m
    public static final Boolean i(@l Class<?>... clsArr) {
        return f19067a.l(clsArr);
    }

    @m
    @i
    @u3.m
    public static final Boolean j(@l Activity activity) {
        return f19067a.n(activity);
    }

    @m
    @i
    @u3.m
    public static final Boolean k(@l Activity activity, @m String str) {
        return f19067a.o(activity, str);
    }

    @m
    @i
    @u3.m
    public static final View l() {
        return f19067a.s();
    }

    @m
    @i
    @u3.m
    public static final View m(@m String str) {
        return f19067a.t(str);
    }

    @m
    @i
    @u3.m
    public static final r2 n() {
        return f19067a.v();
    }

    @m
    @i
    @u3.m
    public static final r2 o(@m String str) {
        return f19067a.w(str);
    }

    @i
    @u3.m
    public static final boolean p() {
        return f19067a.y();
    }

    @i
    @u3.m
    public static final boolean q(@m String str) {
        return f19067a.z(str);
    }

    @m
    @i
    @u3.m
    public static final Boolean r(@l Activity activity) {
        return f19067a.B(activity);
    }

    @m
    @i
    @u3.m
    public static final Boolean s(@l Activity activity, @m String str) {
        return f19067a.C(activity, str);
    }

    @m
    @i
    @u3.m
    public static final Boolean t(@m String str, @l Class<?>... clsArr) {
        return f19067a.E(str, clsArr);
    }

    @m
    @i
    @u3.m
    public static final Boolean u(@l Class<?>... clsArr) {
        return f19067a.F(clsArr);
    }

    @m
    @i
    @u3.m
    public static final r2 v() {
        return f19067a.H();
    }

    @m
    @i
    @u3.m
    public static final r2 w(@m String str) {
        return f19067a.I(str);
    }

    @m
    @i
    @u3.m
    public static final r2 x() {
        return f19067a.K();
    }

    @m
    @i
    @u3.m
    public static final r2 y(@m String str) {
        return f19067a.L(str);
    }

    @m
    @i
    @u3.m
    public static final r2 z(@m String str, int i5) {
        return f19067a.M(str, i5);
    }
}
