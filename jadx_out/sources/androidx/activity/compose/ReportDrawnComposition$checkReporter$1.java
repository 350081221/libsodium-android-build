package androidx.activity.compose;

import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class ReportDrawnComposition$checkReporter$1 extends h0 implements l<v3.a<? extends Boolean>, r2> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ReportDrawnComposition$checkReporter$1(Object obj) {
        super(1, obj, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(v3.a<? extends Boolean> aVar) {
        invoke2((v3.a<Boolean>) aVar);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l v3.a<Boolean> aVar) {
        ((ReportDrawnComposition) this.receiver).observeReporter(aVar);
    }
}
