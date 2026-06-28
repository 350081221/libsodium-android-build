package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import kotlin.r2;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/app/Activity;", "Landroid/view/View;", "view", "Lkotlin/r2;", "trackPipAnimationHintView", "(Landroid/app/Activity;Landroid/view/View;Lkotlin/coroutines/d;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PipHintTrackerKt {
    @RequiresApi(26)
    @p4.m
    public static final Object trackPipAnimationHintView(@p4.l final Activity activity, @p4.l View view, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object collect = kotlinx.coroutines.flow.k.s(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new kotlinx.coroutines.flow.j() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$2
            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar2) {
                return emit((Rect) obj, (kotlin.coroutines.d<? super r2>) dVar2);
            }

            @p4.m
            public final Object emit(@p4.l Rect rect, @p4.l kotlin.coroutines.d<? super r2> dVar2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return r2.f19517a;
            }
        }, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (collect == l5) {
            return collect;
        }
        return r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
