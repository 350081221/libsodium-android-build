package androidx.window.layout;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.channels.l;
import kotlinx.coroutines.flow.j;
import p4.m;
import v3.p;

@f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {0, 0, 1, 1}, l = {54, 55}, m = "invokeSuspend", n = {"$this$flow", "listener", "$this$flow", "listener"}, s = {"L$0", "L$1", "L$0", "L$1"})
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Landroidx/window/layout/WindowLayoutInfo;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes2.dex */
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends o implements p<j<? super WindowLayoutInfo>, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, kotlin.coroutines.d<? super WindowInfoTrackerImpl$windowLayoutInfo$1> dVar) {
        super(2, dVar);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0, reason: not valid java name */
    public static final void m6427invokeSuspend$lambda0(l lVar, WindowLayoutInfo info) {
        l0.o(info, "info");
        lVar.p(info);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, dVar);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l j<? super WindowLayoutInfo> jVar, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(jVar, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:11:0x0064, B:16:0x0076, B:18:0x007e), top: B:10:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0093 -> B:10:0x0064). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r9.L$2
            kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
            java.lang.Object r4 = r9.L$1
            androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
            kotlin.e1.n(r10)     // Catch: java.lang.Throwable -> La3
            r10 = r5
            goto L63
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            java.lang.Object r1 = r9.L$2
            kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
            java.lang.Object r4 = r9.L$1
            androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
            kotlin.e1.n(r10)     // Catch: java.lang.Throwable -> La3
            r6 = r5
            r5 = r9
            goto L76
        L39:
            kotlin.e1.n(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
            kotlinx.coroutines.channels.i r1 = kotlinx.coroutines.channels.i.DROP_OLDEST
            r4 = 4
            r5 = 10
            r6 = 0
            kotlinx.coroutines.channels.l r1 = kotlinx.coroutines.channels.o.d(r5, r1, r6, r4, r6)
            androidx.window.layout.d r4 = new androidx.window.layout.d
            r4.<init>()
            androidx.window.layout.WindowInfoTrackerImpl r5 = r9.this$0
            androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
            android.app.Activity r6 = r9.$activity
            androidx.profileinstaller.b r7 = new androidx.profileinstaller.b
            r7.<init>()
            r5.registerLayoutChangeCallback(r6, r7, r4)
            kotlinx.coroutines.channels.n r1 = r1.iterator()     // Catch: java.lang.Throwable -> La3
        L63:
            r5 = r9
        L64:
            r5.L$0 = r10     // Catch: java.lang.Throwable -> La1
            r5.L$1 = r4     // Catch: java.lang.Throwable -> La1
            r5.L$2 = r1     // Catch: java.lang.Throwable -> La1
            r5.label = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r6 = r1.c(r5)     // Catch: java.lang.Throwable -> La1
            if (r6 != r0) goto L73
            return r0
        L73:
            r8 = r6
            r6 = r10
            r10 = r8
        L76:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La1
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La1
            if (r10 == 0) goto L95
            java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> La1
            androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch: java.lang.Throwable -> La1
            r5.L$0 = r6     // Catch: java.lang.Throwable -> La1
            r5.L$1 = r4     // Catch: java.lang.Throwable -> La1
            r5.L$2 = r1     // Catch: java.lang.Throwable -> La1
            r5.label = r2     // Catch: java.lang.Throwable -> La1
            java.lang.Object r10 = r6.emit(r10, r5)     // Catch: java.lang.Throwable -> La1
            if (r10 != r0) goto L93
            return r0
        L93:
            r10 = r6
            goto L64
        L95:
            androidx.window.layout.WindowInfoTrackerImpl r10 = r5.this$0
            androidx.window.layout.WindowBackend r10 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r10)
            r10.unregisterLayoutChangeCallback(r4)
            kotlin.r2 r10 = kotlin.r2.f19517a
            return r10
        La1:
            r10 = move-exception
            goto La5
        La3:
            r10 = move-exception
            r5 = r9
        La5:
            androidx.window.layout.WindowInfoTrackerImpl r0 = r5.this$0
            androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
            r0.unregisterLayoutChangeCallback(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
