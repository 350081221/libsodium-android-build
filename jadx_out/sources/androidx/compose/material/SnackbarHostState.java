package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.coroutines.d;
import kotlin.d1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.c;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR/\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "", "", CrashHianalyticsData.MESSAGE, "actionLabel", "Landroidx/compose/material/SnackbarDuration;", "duration", "Landroidx/compose/material/SnackbarResult;", "showSnackbar", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/sync/a;", "mutex", "Lkotlinx/coroutines/sync/a;", "Landroidx/compose/material/SnackbarData;", "<set-?>", "currentSnackbarData$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentSnackbarData", "()Landroidx/compose/material/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material/SnackbarData;)V", "currentSnackbarData", "<init>", "()V", "SnackbarDataImpl", "material_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,381:1\n81#2:382\n107#2,2:383\n120#3,8:385\n129#3:404\n314#4,11:393\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n*L\n75#1:382\n75#1:383,2\n105#1:385,8\n105#1:404\n107#1:393,11\n*E\n"})
/* loaded from: classes.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;

    @l
    private final MutableState currentSnackbarData$delegate;

    @l
    private final a mutex = c.b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    @Stable
    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material/SnackbarData;", "Lkotlin/r2;", "performAction", "dismiss", "", CrashHianalyticsData.MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "actionLabel", "getActionLabel", "Landroidx/compose/material/SnackbarDuration;", "duration", "Landroidx/compose/material/SnackbarDuration;", "getDuration", "()Landroidx/compose/material/SnackbarDuration;", "Lkotlinx/coroutines/p;", "Landroidx/compose/material/SnackbarResult;", "continuation", "Lkotlinx/coroutines/p;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlinx/coroutines/p;)V", "material_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class SnackbarDataImpl implements SnackbarData {

        @m
        private final String actionLabel;

        @l
        private final p<SnackbarResult> continuation;

        @l
        private final SnackbarDuration duration;

        @l
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(@l String str, @m String str2, @l SnackbarDuration snackbarDuration, @l p<? super SnackbarResult> pVar) {
            this.message = str;
            this.actionLabel = str2;
            this.duration = snackbarDuration;
            this.continuation = pVar;
        }

        @Override // androidx.compose.material.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                p<SnackbarResult> pVar = this.continuation;
                d1.a aVar = d1.Companion;
                pVar.resumeWith(d1.m6444constructorimpl(SnackbarResult.Dismissed));
            }
        }

        @Override // androidx.compose.material.SnackbarData
        @m
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material.SnackbarData
        @l
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material.SnackbarData
        @l
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                p<SnackbarResult> pVar = this.continuation;
                d1.a aVar = d1.Companion;
                pVar.resumeWith(d1.m6444constructorimpl(SnackbarResult.ActionPerformed));
            }
        }
    }

    public SnackbarHostState() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentSnackbarData$delegate = mutableStateOf$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData$delegate.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        if ((i5 & 4) != 0) {
            snackbarDuration = SnackbarDuration.Short;
        }
        return snackbarHostState.showSnackbar(str, str2, snackbarDuration, dVar);
    }

    @m
    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6 A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #0 {all -> 0x00c6, blocks: (B:26:0x008a, B:28:0x00b6), top: B:25:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showSnackbar(@p4.l java.lang.String r9, @p4.m java.lang.String r10, @p4.l androidx.compose.material.SnackbarDuration r11, @p4.l kotlin.coroutines.d<? super androidx.compose.material.SnackbarResult> r12) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostState.showSnackbar(java.lang.String, java.lang.String, androidx.compose.material.SnackbarDuration, kotlin.coroutines.d):java.lang.Object");
    }
}
