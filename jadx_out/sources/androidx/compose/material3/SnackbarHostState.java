package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.d1;
import kotlin.jvm.internal.r1;

@Stable
@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\n\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R/\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "", "", CrashHianalyticsData.MESSAGE, "actionLabel", "", "withDismissAction", "Landroidx/compose/material3/SnackbarDuration;", "duration", "Landroidx/compose/material3/SnackbarResult;", "showSnackbar", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/material3/SnackbarVisuals;", "visuals", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/sync/a;", "mutex", "Lkotlinx/coroutines/sync/a;", "Landroidx/compose/material3/SnackbarData;", "<set-?>", "currentSnackbarData$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentSnackbarData", "()Landroidx/compose/material3/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material3/SnackbarData;)V", "currentSnackbarData", "<init>", "()V", "SnackbarDataImpl", "SnackbarVisualsImpl", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,464:1\n81#2:465\n107#2,2:466\n120#3,8:468\n129#3:487\n314#4,11:476\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n*L\n73#1:465\n73#1:466,2\n129#1:468,8\n129#1:487\n131#1:476,11\n*E\n"})
/* loaded from: classes.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;

    @p4.l
    private final MutableState currentSnackbarData$delegate;

    @p4.l
    private final kotlinx.coroutines.sync.a mutex = kotlinx.coroutines.sync.c.b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material3/SnackbarData;", "Lkotlin/r2;", "performAction", "dismiss", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/material3/SnackbarVisuals;", "visuals", "Landroidx/compose/material3/SnackbarVisuals;", "getVisuals", "()Landroidx/compose/material3/SnackbarVisuals;", "Lkotlinx/coroutines/p;", "Landroidx/compose/material3/SnackbarResult;", "continuation", "Lkotlinx/coroutines/p;", "<init>", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlinx/coroutines/p;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class SnackbarDataImpl implements SnackbarData {

        @p4.l
        private final kotlinx.coroutines.p<SnackbarResult> continuation;

        @p4.l
        private final SnackbarVisuals visuals;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(@p4.l SnackbarVisuals snackbarVisuals, @p4.l kotlinx.coroutines.p<? super SnackbarResult> pVar) {
            this.visuals = snackbarVisuals;
            this.continuation = pVar;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                kotlinx.coroutines.p<SnackbarResult> pVar = this.continuation;
                d1.a aVar = d1.Companion;
                pVar.resumeWith(d1.m6444constructorimpl(SnackbarResult.Dismissed));
            }
        }

        public boolean equals(@p4.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarDataImpl.class != obj.getClass()) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) obj;
            if (kotlin.jvm.internal.l0.g(getVisuals(), snackbarDataImpl.getVisuals()) && kotlin.jvm.internal.l0.g(this.continuation, snackbarDataImpl.continuation)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.material3.SnackbarData
        @p4.l
        public SnackbarVisuals getVisuals() {
            return this.visuals;
        }

        public int hashCode() {
            return (getVisuals().hashCode() * 31) + this.continuation.hashCode();
        }

        @Override // androidx.compose.material3.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                kotlinx.coroutines.p<SnackbarResult> pVar = this.continuation;
                d1.a aVar = d1.Companion;
                pVar.resumeWith(d1.m6444constructorimpl(SnackbarResult.ActionPerformed));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarVisualsImpl;", "Landroidx/compose/material3/SnackbarVisuals;", CrashHianalyticsData.MESSAGE, "", "actionLabel", "withDismissAction", "", "duration", "Landroidx/compose/material3/SnackbarDuration;", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;)V", "getActionLabel", "()Ljava/lang/String;", "getDuration", "()Landroidx/compose/material3/SnackbarDuration;", "getMessage", "getWithDismissAction", "()Z", "equals", "other", "", TTDownloadField.TT_HASHCODE, "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SnackbarVisualsImpl implements SnackbarVisuals {

        @p4.m
        private final String actionLabel;

        @p4.l
        private final SnackbarDuration duration;

        @p4.l
        private final String message;
        private final boolean withDismissAction;

        public SnackbarVisualsImpl(@p4.l String str, @p4.m String str2, boolean z4, @p4.l SnackbarDuration snackbarDuration) {
            this.message = str;
            this.actionLabel = str2;
            this.withDismissAction = z4;
            this.duration = snackbarDuration;
        }

        public boolean equals(@p4.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarVisualsImpl.class != obj.getClass()) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) obj;
            if (kotlin.jvm.internal.l0.g(getMessage(), snackbarVisualsImpl.getMessage()) && kotlin.jvm.internal.l0.g(getActionLabel(), snackbarVisualsImpl.getActionLabel()) && getWithDismissAction() == snackbarVisualsImpl.getWithDismissAction() && getDuration() == snackbarVisualsImpl.getDuration()) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        @p4.m
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        @p4.l
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        @p4.l
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        public int hashCode() {
            int i5;
            int hashCode = getMessage().hashCode() * 31;
            String actionLabel = getActionLabel();
            if (actionLabel != null) {
                i5 = actionLabel.hashCode();
            } else {
                i5 = 0;
            }
            return ((((hashCode + i5) * 31) + Boolean.hashCode(getWithDismissAction())) * 31) + getDuration().hashCode();
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

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, boolean z4, SnackbarDuration snackbarDuration, kotlin.coroutines.d dVar, int i5, Object obj) {
        SnackbarDuration snackbarDuration2;
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        boolean z5 = z4;
        if ((i5 & 8) != 0) {
            if (str3 == null) {
                snackbarDuration2 = SnackbarDuration.Short;
            } else {
                snackbarDuration2 = SnackbarDuration.Indefinite;
            }
            snackbarDuration = snackbarDuration2;
        }
        return snackbarHostState.showSnackbar(str, str3, z5, snackbarDuration, dVar);
    }

    @p4.m
    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    @p4.m
    public final Object showSnackbar(@p4.l String str, @p4.m String str2, boolean z4, @p4.l SnackbarDuration snackbarDuration, @p4.l kotlin.coroutines.d<? super SnackbarResult> dVar) {
        return showSnackbar(new SnackbarVisualsImpl(str, str2, z4, snackbarDuration), dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #1 {all -> 0x00a8, blocks: (B:26:0x006f, B:28:0x0097), top: B:25:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showSnackbar(@p4.l androidx.compose.material3.SnackbarVisuals r9, @p4.l kotlin.coroutines.d<? super androidx.compose.material3.SnackbarResult> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.SnackbarHostState$showSnackbar$2
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = new androidx.compose.material3.SnackbarHostState$showSnackbar$2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5a
            if (r2 == r4) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r9 = r0.L$3
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r9 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r9
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.a) r9
            java.lang.Object r1 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r1 = (androidx.compose.material3.SnackbarVisuals) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.SnackbarHostState r0 = (androidx.compose.material3.SnackbarHostState) r0
            kotlin.e1.n(r10)     // Catch: java.lang.Throwable -> L3d
            goto La1
        L3d:
            r10 = move-exception
            goto Lad
        L40:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L48:
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.a) r9
            java.lang.Object r2 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r2 = (androidx.compose.material3.SnackbarVisuals) r2
            java.lang.Object r6 = r0.L$0
            androidx.compose.material3.SnackbarHostState r6 = (androidx.compose.material3.SnackbarHostState) r6
            kotlin.e1.n(r10)
            r10 = r9
            r9 = r2
            goto L6f
        L5a:
            kotlin.e1.n(r10)
            kotlinx.coroutines.sync.a r10 = r8.mutex
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r2 = r10.f(r5, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r6 = r8
        L6f:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> La8
            r0.L$1 = r9     // Catch: java.lang.Throwable -> La8
            r0.L$2 = r10     // Catch: java.lang.Throwable -> La8
            r0.L$3 = r0     // Catch: java.lang.Throwable -> La8
            r0.label = r3     // Catch: java.lang.Throwable -> La8
            kotlinx.coroutines.q r2 = new kotlinx.coroutines.q     // Catch: java.lang.Throwable -> La8
            kotlin.coroutines.d r3 = kotlin.coroutines.intrinsics.b.e(r0)     // Catch: java.lang.Throwable -> La8
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> La8
            r2.B()     // Catch: java.lang.Throwable -> La8
            androidx.compose.material3.SnackbarHostState$SnackbarDataImpl r3 = new androidx.compose.material3.SnackbarHostState$SnackbarDataImpl     // Catch: java.lang.Throwable -> La8
            r3.<init>(r9, r2)     // Catch: java.lang.Throwable -> La8
            access$setCurrentSnackbarData(r6, r3)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r9 = r2.E()     // Catch: java.lang.Throwable -> La8
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()     // Catch: java.lang.Throwable -> La8
            if (r9 != r2) goto L9a
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> La8
        L9a:
            if (r9 != r1) goto L9d
            return r1
        L9d:
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        La1:
            r0.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> Lb1
            r9.g(r5)
            return r10
        La8:
            r9 = move-exception
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        Lad:
            r0.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> Lb1
            throw r10     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r10 = move-exception
            r9.g(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostState.showSnackbar(androidx.compose.material3.SnackbarVisuals, kotlin.coroutines.d):java.lang.Object");
    }
}
