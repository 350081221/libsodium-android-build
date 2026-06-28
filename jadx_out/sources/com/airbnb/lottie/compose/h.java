package com.airbnb.lottie.compose;

import kotlin.i0;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"awaitOrNull", "Lcom/airbnb/lottie/LottieComposition;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "(Lcom/airbnb/lottie/compose/LottieCompositionResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.airbnb.lottie.compose.LottieCompositionResultKt", f = "LottieCompositionResult.kt", i = {}, l = {85}, m = "awaitOrNull", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return h.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@p4.l com.airbnb.lottie.compose.LottieCompositionResult r4, @p4.l kotlin.coroutines.d<? super com.airbnb.lottie.k> r5) {
        /*
            boolean r0 = r5 instanceof com.airbnb.lottie.compose.h.a
            if (r0 == 0) goto L13
            r0 = r5
            com.airbnb.lottie.compose.h$a r0 = (com.airbnb.lottie.compose.h.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.airbnb.lottie.compose.h$a r0 = new com.airbnb.lottie.compose.h$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e1.n(r5)     // Catch: java.lang.Throwable -> L40
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e1.n(r5)
            r0.label = r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r5 = r4.b(r0)     // Catch: java.lang.Throwable -> L40
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.airbnb.lottie.k r5 = (com.airbnb.lottie.k) r5     // Catch: java.lang.Throwable -> L40
            goto L41
        L40:
            r5 = 0
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.h.a(com.airbnb.lottie.compose.LottieCompositionResult, kotlin.coroutines.d):java.lang.Object");
    }
}
