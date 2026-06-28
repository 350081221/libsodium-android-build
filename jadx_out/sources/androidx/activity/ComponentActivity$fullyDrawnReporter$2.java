package androidx.activity;

import androidx.activity.ComponentActivity;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/activity/FullyDrawnReporter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComponentActivity$fullyDrawnReporter$2 extends n0 implements v3.a<FullyDrawnReporter> {
    final /* synthetic */ ComponentActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.ComponentActivity$fullyDrawnReporter$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements v3.a<r2> {
        final /* synthetic */ ComponentActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComponentActivity componentActivity) {
            super(0);
            this.this$0 = componentActivity;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.reportFullyDrawn();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivity$fullyDrawnReporter$2(ComponentActivity componentActivity) {
        super(0);
        this.this$0 = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final FullyDrawnReporter invoke() {
        ComponentActivity.ReportFullyDrawnExecutor reportFullyDrawnExecutor;
        reportFullyDrawnExecutor = this.this$0.reportFullyDrawnExecutor;
        return new FullyDrawnReporter(reportFullyDrawnExecutor, new AnonymousClass1(this.this$0));
    }
}
