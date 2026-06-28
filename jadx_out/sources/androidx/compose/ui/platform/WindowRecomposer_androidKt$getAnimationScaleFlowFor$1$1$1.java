package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", i = {0, 1}, l = {115, 121}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.flow.j<? super Float>, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ kotlinx.coroutines.channels.l<r2> $channel;
    final /* synthetic */ WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, kotlinx.coroutines.channels.l<r2> lVar, Context context, kotlin.coroutines.d<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> dVar) {
        super(2, dVar);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.$channel = lVar;
        this.$applicationContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, dVar);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super Float> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(jVar, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:11:0x0049, B:16:0x0059, B:18:0x0061), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0083 -> B:10:0x0049). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L31
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
            java.lang.Object r4 = r9.L$0
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
            kotlin.e1.n(r10)     // Catch: java.lang.Throwable -> L91
            r10 = r4
            goto L48
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
            java.lang.Object r4 = r9.L$0
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
            kotlin.e1.n(r10)     // Catch: java.lang.Throwable -> L91
            r5 = r4
            r4 = r9
            goto L59
        L31:
            kotlin.e1.n(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
            android.content.ContentResolver r1 = r9.$resolver
            android.net.Uri r4 = r9.$animationScaleUri
            r5 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r6 = r9.$contentObserver
            r1.registerContentObserver(r4, r5, r6)
            kotlinx.coroutines.channels.l<kotlin.r2> r1 = r9.$channel     // Catch: java.lang.Throwable -> L91
            kotlinx.coroutines.channels.n r1 = r1.iterator()     // Catch: java.lang.Throwable -> L91
        L48:
            r4 = r9
        L49:
            r4.L$0 = r10     // Catch: java.lang.Throwable -> L8f
            r4.L$1 = r1     // Catch: java.lang.Throwable -> L8f
            r4.label = r3     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r5 = r1.c(r4)     // Catch: java.lang.Throwable -> L8f
            if (r5 != r0) goto L56
            return r0
        L56:
            r8 = r5
            r5 = r10
            r10 = r8
        L59:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L8f
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L8f
            if (r10 == 0) goto L85
            r1.next()     // Catch: java.lang.Throwable -> L8f
            android.content.Context r10 = r4.$applicationContext     // Catch: java.lang.Throwable -> L8f
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L8f
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.b.e(r10)     // Catch: java.lang.Throwable -> L8f
            r4.L$0 = r5     // Catch: java.lang.Throwable -> L8f
            r4.L$1 = r1     // Catch: java.lang.Throwable -> L8f
            r4.label = r2     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r10 = r5.emit(r10, r4)     // Catch: java.lang.Throwable -> L8f
            if (r10 != r0) goto L83
            return r0
        L83:
            r10 = r5
            goto L49
        L85:
            android.content.ContentResolver r10 = r4.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r0 = r4.$contentObserver
            r10.unregisterContentObserver(r0)
            kotlin.r2 r10 = kotlin.r2.f19517a
            return r10
        L8f:
            r10 = move-exception
            goto L93
        L91:
            r10 = move-exception
            r4 = r9
        L93:
            android.content.ContentResolver r0 = r4.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r1 = r4.$contentObserver
            r0.unregisterContentObserver(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
