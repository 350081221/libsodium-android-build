package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.lifecycle.SavedStateHandle;
import kotlin.i0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.v;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class SavedStateHandleSaverKt$saveable$1$1$1 implements SaverScope, d0 {
    final /* synthetic */ SavedStateHandle.Companion $tmp0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion companion) {
        this.$tmp0 = companion;
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public final boolean canBeSaved(@m Object obj) {
        return this.$tmp0.validateValue(obj);
    }

    public final boolean equals(@m Object obj) {
        if ((obj instanceof SaverScope) && (obj instanceof d0)) {
            return l0.g(getFunctionDelegate(), ((d0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.d0
    @l
    public final v<?> getFunctionDelegate() {
        return new h0(1, this.$tmp0, SavedStateHandle.Companion.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
