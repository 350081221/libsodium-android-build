package androidx.compose.ui.viewinterop;

import android.os.Handler;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends n0 implements l<AndroidViewHolder, r2> {
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 INSTANCE = new AndroidViewHolder$Companion$OnCommitAffectingUpdate$1();

    AndroidViewHolder$Companion$OnCommitAffectingUpdate$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(AndroidViewHolder androidViewHolder) {
        invoke2(androidViewHolder);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l AndroidViewHolder androidViewHolder) {
        final v3.a aVar;
        Handler handler = androidViewHolder.getHandler();
        aVar = androidViewHolder.runUpdate;
        handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.b
            @Override // java.lang.Runnable
            public final void run() {
                v3.a.this.invoke();
            }
        });
    }
}
