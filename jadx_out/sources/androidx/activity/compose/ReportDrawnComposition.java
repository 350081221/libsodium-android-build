package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0005\u001a\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0002J\t\u0010\u0006\u001a\u00020\u0002H\u0096\u0002J\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/activity/compose/ReportDrawnComposition;", "Lkotlin/Function0;", "Lkotlin/r2;", "", "predicate", "observeReporter", "invoke", "removeReporter", "Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter", "Landroidx/activity/FullyDrawnReporter;", "Lv3/a;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "snapshotStateObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "Lkotlin/Function1;", "checkReporter", "Lv3/l;", "<init>", "(Landroidx/activity/FullyDrawnReporter;Lv3/a;)V", "activity-compose_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ReportDrawnComposition implements v3.a<r2> {

    @l
    private final v3.l<v3.a<Boolean>, r2> checkReporter;

    @l
    private final FullyDrawnReporter fullyDrawnReporter;

    @l
    private final v3.a<Boolean> predicate;

    @l
    private final SnapshotStateObserver snapshotStateObserver;

    public ReportDrawnComposition(@l FullyDrawnReporter fullyDrawnReporter, @l v3.a<Boolean> aVar) {
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = aVar;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(ReportDrawnComposition$snapshotStateObserver$1.INSTANCE);
        snapshotStateObserver.start();
        this.snapshotStateObserver = snapshotStateObserver;
        this.checkReporter = new ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (!fullyDrawnReporter.isFullyDrawnReported()) {
            fullyDrawnReporter.addReporter();
            observeReporter(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeReporter(v3.a<Boolean> aVar) {
        k1.a aVar2 = new k1.a();
        this.snapshotStateObserver.observeReads(aVar, this.checkReporter, new ReportDrawnComposition$observeReporter$1(aVar2, aVar));
        if (aVar2.element) {
            removeReporter();
        }
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    public final void removeReporter() {
        this.snapshotStateObserver.clear(this.predicate);
        if (!this.fullyDrawnReporter.isFullyDrawnReported()) {
            this.fullyDrawnReporter.removeReporter();
        }
        invoke2();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2() {
        this.snapshotStateObserver.clear();
        this.snapshotStateObserver.stop();
    }
}
