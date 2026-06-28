package androidx.fragment.app;

import android.os.Bundle;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0012\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001aJ\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00050\b\u001a\u0012\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "requestKey", "Landroid/os/Bundle;", "result", "Lkotlin/r2;", "setFragmentResult", "clearFragmentResult", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "bundle", "listener", "setFragmentResultListener", "clearFragmentResultListener", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FragmentKt {
    public static final void clearFragmentResult(@p4.l Fragment fragment, @p4.l String requestKey) {
        l0.p(fragment, "<this>");
        l0.p(requestKey, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResult(requestKey);
    }

    public static final void clearFragmentResultListener(@p4.l Fragment fragment, @p4.l String requestKey) {
        l0.p(fragment, "<this>");
        l0.p(requestKey, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResultListener(requestKey);
    }

    public static final void setFragmentResult(@p4.l Fragment fragment, @p4.l String requestKey, @p4.l Bundle result) {
        l0.p(fragment, "<this>");
        l0.p(requestKey, "requestKey");
        l0.p(result, "result");
        fragment.getParentFragmentManager().setFragmentResult(requestKey, result);
    }

    public static final void setFragmentResultListener(@p4.l Fragment fragment, @p4.l String requestKey, @p4.l final v3.p<? super String, ? super Bundle, r2> listener) {
        l0.p(fragment, "<this>");
        l0.p(requestKey, "requestKey");
        l0.p(listener, "listener");
        fragment.getParentFragmentManager().setFragmentResultListener(requestKey, fragment, new FragmentResultListener() { // from class: androidx.fragment.app.n
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                FragmentKt.setFragmentResultListener$lambda$0(v3.p.this, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFragmentResultListener$lambda$0(v3.p tmp0, String p02, Bundle p12) {
        l0.p(tmp0, "$tmp0");
        l0.p(p02, "p0");
        l0.p(p12, "p1");
        tmp0.invoke(p02, p12);
    }
}
