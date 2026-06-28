package androidx.activity;

import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class OnBackPressedDispatcher$addCancellableCallback$1 extends h0 implements v3.a<r2> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public OnBackPressedDispatcher$addCancellableCallback$1(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
    }
}
