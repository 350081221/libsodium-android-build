package n2;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.lzf.easyfloat.interfaces.g;
import com.lzf.easyfloat.utils.h;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"Ln2/b;", "Landroid/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/r2;", "onActivityCreated", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "<init>", "()V", bi.ay, "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class b extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f20813a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @m
    private static g f20814b;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\u000b"}, d2 = {"Ln2/b$a;", "", "Landroid/app/Activity;", "activity", "Lcom/lzf/easyfloat/interfaces/g;", "onPermissionResult", "Lkotlin/r2;", bi.ay, "Lcom/lzf/easyfloat/interfaces/g;", "<init>", "()V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        public final void a(@l Activity activity, @l g onPermissionResult) {
            l0.p(activity, "activity");
            l0.p(onPermissionResult, "onPermissionResult");
            b.f20814b = onPermissionResult;
            activity.getFragmentManager().beginTransaction().add(new b(), activity.getLocalClassName()).commitAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(b this$0) {
        l0.p(this$0, "this$0");
        Activity activity = this$0.getActivity();
        if (activity == null) {
            return;
        }
        boolean a5 = c.a(activity);
        h.f9294a.e(l0.C("PermissionFragment onActivityResult: ", Boolean.valueOf(a5)));
        g gVar = f20814b;
        if (gVar != null) {
            gVar.a(a5);
        }
        f20814b = null;
        this$0.getFragmentManager().beginTransaction().remove(this$0).commitAllowingStateLoss();
    }

    public void b() {
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@m Bundle bundle) {
        super.onActivityCreated(bundle);
        c.f20815a.k(this);
        h.f9294a.e("PermissionFragment：requestPermission");
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i5, int i6, @m Intent intent) {
        if (i5 == 199) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: n2.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.d(b.this);
                }
            }, 500L);
        }
    }
}
