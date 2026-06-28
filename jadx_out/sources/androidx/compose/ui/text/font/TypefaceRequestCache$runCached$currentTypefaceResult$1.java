package androidx.compose.ui.text.font;

import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult;", "finalResult", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/text/font/TypefaceResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,256:1\n26#2:257\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n*L\n198#1:257\n*E\n"})
/* loaded from: classes.dex */
public final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends n0 implements l<TypefaceResult, r2> {
    final /* synthetic */ TypefaceRequest $typefaceRequest;
    final /* synthetic */ TypefaceRequestCache this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceRequestCache$runCached$currentTypefaceResult$1(TypefaceRequestCache typefaceRequestCache, TypefaceRequest typefaceRequest) {
        super(1);
        this.this$0 = typefaceRequestCache;
        this.$typefaceRequest = typefaceRequest;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(TypefaceResult typefaceResult) {
        invoke2(typefaceResult);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l TypefaceResult typefaceResult) {
        LruCache lruCache;
        LruCache lruCache2;
        SynchronizedObject lock$ui_text_release = this.this$0.getLock$ui_text_release();
        TypefaceRequestCache typefaceRequestCache = this.this$0;
        TypefaceRequest typefaceRequest = this.$typefaceRequest;
        synchronized (lock$ui_text_release) {
            if (typefaceResult.getCacheable()) {
                lruCache2 = typefaceRequestCache.resultCache;
                lruCache2.put(typefaceRequest, typefaceResult);
            } else {
                lruCache = typefaceRequestCache.resultCache;
                lruCache.remove(typefaceRequest);
            }
            r2 r2Var = r2.f19517a;
        }
    }
}
