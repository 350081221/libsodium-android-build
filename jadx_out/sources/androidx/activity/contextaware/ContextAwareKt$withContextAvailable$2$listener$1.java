package androidx.activity.contextaware;

import android.content.Context;
import com.umeng.analytics.pro.d;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.p;
import v3.l;

@i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1", "Landroidx/activity/contextaware/OnContextAvailableListener;", "Landroid/content/Context;", d.X, "Lkotlin/r2;", "onContextAvailable", "activity_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ p<R> $co;
    final /* synthetic */ l<Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(p<R> pVar, l<Context, R> lVar) {
        this.$co = pVar;
        this.$onContextAvailable = lVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(@p4.l Context context) {
        Object m6444constructorimpl;
        l0.p(context, "context");
        kotlin.coroutines.d dVar = this.$co;
        l<Context, R> lVar = this.$onContextAvailable;
        try {
            d1.a aVar = d1.Companion;
            m6444constructorimpl = d1.m6444constructorimpl(lVar.invoke(context));
        } catch (Throwable th) {
            d1.a aVar2 = d1.Companion;
            m6444constructorimpl = d1.m6444constructorimpl(e1.a(th));
        }
        dVar.resumeWith(m6444constructorimpl);
    }
}
