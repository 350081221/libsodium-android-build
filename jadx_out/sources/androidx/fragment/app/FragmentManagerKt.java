package androidx.fragment.app;

import androidx.annotation.MainThread;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a3\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000\u001a=\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Landroidx/fragment/app/FragmentManager;", "", "allowStateLoss", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/r2;", "Lkotlin/u;", "body", "commit", "commitNow", "now", "transaction", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FragmentManagerKt {
    public static final void commit(@p4.l FragmentManager fragmentManager, boolean z4, @p4.l v3.l<? super FragmentTransaction, r2> body) {
        l0.p(fragmentManager, "<this>");
        l0.p(body, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        l0.o(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z4) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void commit$default(FragmentManager fragmentManager, boolean z4, v3.l body, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        l0.p(fragmentManager, "<this>");
        l0.p(body, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        l0.o(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z4) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    @MainThread
    public static final void commitNow(@p4.l FragmentManager fragmentManager, boolean z4, @p4.l v3.l<? super FragmentTransaction, r2> body) {
        l0.p(fragmentManager, "<this>");
        l0.p(body, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        l0.o(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z4) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager fragmentManager, boolean z4, v3.l body, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        l0.p(fragmentManager, "<this>");
        l0.p(body, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        l0.o(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z4) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    @kotlin.k(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void transaction(@p4.l FragmentManager fragmentManager, boolean z4, boolean z5, @p4.l v3.l<? super FragmentTransaction, r2> body) {
        l0.p(fragmentManager, "<this>");
        l0.p(body, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        l0.o(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z4) {
            if (z5) {
                beginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                beginTransaction.commitNow();
                return;
            }
        }
        if (z5) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void transaction$default(FragmentManager fragmentManager, boolean z4, boolean z5, v3.l body, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        l0.p(fragmentManager, "<this>");
        l0.p(body, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        l0.o(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z4) {
            if (z5) {
                beginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                beginTransaction.commitNow();
                return;
            }
        }
        if (z5) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }
}
