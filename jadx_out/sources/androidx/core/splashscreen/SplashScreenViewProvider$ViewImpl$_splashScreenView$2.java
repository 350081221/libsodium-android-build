package androidx.core.splashscreen;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.splashscreen.SplashScreenViewProvider;
import kotlin.i0;
import kotlin.jvm.internal.n0;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SplashScreenViewProvider$ViewImpl$_splashScreenView$2 extends n0 implements v3.a<ViewGroup> {
    final /* synthetic */ SplashScreenViewProvider.ViewImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenViewProvider$ViewImpl$_splashScreenView$2(SplashScreenViewProvider.ViewImpl viewImpl) {
        super(0);
        this.this$0 = viewImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final ViewGroup invoke() {
        View inflate = View.inflate(this.this$0.getActivity(), R.layout.splash_screen_view, null);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
