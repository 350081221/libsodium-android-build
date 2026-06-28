package androidx.constraintlayout.compose;

import android.os.Handler;
import android.os.Looper;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ConstraintSetForInlineDsl$observer$1 extends n0 implements l<v3.a<? extends r2>, r2> {
    final /* synthetic */ ConstraintSetForInlineDsl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintSetForInlineDsl$observer$1(ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(1);
        this.this$0 = constraintSetForInlineDsl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final void m6348invoke$lambda1(v3.a tmp0) {
        l0.p(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(v3.a<? extends r2> aVar) {
        invoke2((v3.a<r2>) aVar);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l final v3.a<r2> it) {
        Handler handler;
        l0.p(it, "it");
        if (l0.g(Looper.myLooper(), Looper.getMainLooper())) {
            it.invoke();
            return;
        }
        handler = this.this$0.handler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            this.this$0.handler = handler;
        }
        handler.post(new Runnable() { // from class: androidx.constraintlayout.compose.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintSetForInlineDsl$observer$1.m6348invoke$lambda1(v3.a.this);
            }
        });
    }
}
