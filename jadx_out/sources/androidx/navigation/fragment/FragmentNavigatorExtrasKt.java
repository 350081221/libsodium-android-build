package androidx.navigation.fragment;

import android.view.View;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.u0;
import p4.l;

@i0(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0006\u001a\u00020\u00052*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lkotlin/u0;", "Landroid/view/View;", "", "sharedElements", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "FragmentNavigatorExtras", "([Lkotlin/u0;)Landroidx/navigation/fragment/FragmentNavigator$Extras;", "navigation-fragment_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nFragmentNavigatorExtras.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigatorExtras.kt\nandroidx/navigation/fragment/FragmentNavigatorExtrasKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,35:1\n13579#2,2:36\n*S KotlinDebug\n*F\n+ 1 FragmentNavigatorExtras.kt\nandroidx/navigation/fragment/FragmentNavigatorExtrasKt\n*L\n31#1:36,2\n*E\n"})
/* loaded from: classes2.dex */
public final class FragmentNavigatorExtrasKt {
    @l
    public static final FragmentNavigator.Extras FragmentNavigatorExtras(@l u0<? extends View, String>... sharedElements) {
        l0.p(sharedElements, "sharedElements");
        FragmentNavigator.Extras.Builder builder = new FragmentNavigator.Extras.Builder();
        for (u0<? extends View, String> u0Var : sharedElements) {
            builder.addSharedElement(u0Var.component1(), u0Var.component2());
        }
        return builder.build();
    }
}
