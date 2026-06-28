package androidx.compose.runtime.saveable;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/SaveableHolder$valueProvider$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1#2:272\n*E\n"})
/* loaded from: classes.dex */
public final class SaveableHolder$valueProvider$1 extends n0 implements a<Object> {
    final /* synthetic */ SaveableHolder<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableHolder$valueProvider$1(SaveableHolder<T> saveableHolder) {
        super(0);
        this.this$0 = saveableHolder;
    }

    @Override // v3.a
    @m
    public final Object invoke() {
        Saver saver;
        Object obj;
        saver = ((SaveableHolder) this.this$0).saver;
        SaveableHolder<T> saveableHolder = this.this$0;
        obj = ((SaveableHolder) saveableHolder).value;
        if (obj != null) {
            return saver.save(saveableHolder, obj);
        }
        throw new IllegalArgumentException("Value should be initialized".toString());
    }
}
