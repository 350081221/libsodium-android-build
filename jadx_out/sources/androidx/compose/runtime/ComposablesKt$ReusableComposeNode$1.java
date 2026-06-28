package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;

/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "", "E", "Landroidx/compose/runtime/Applier;", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
/* loaded from: classes.dex */
public final class ComposablesKt$ReusableComposeNode$1<T> extends n0 implements v3.a<T> {
    final /* synthetic */ v3.a<T> $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposablesKt$ReusableComposeNode$1(v3.a<? extends T> aVar) {
        super(0);
        this.$factory = aVar;
    }

    @Override // v3.a
    @l
    public final T invoke() {
        return this.$factory.invoke();
    }
}
