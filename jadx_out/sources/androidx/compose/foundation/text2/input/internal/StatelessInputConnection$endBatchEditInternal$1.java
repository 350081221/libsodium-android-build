package androidx.compose.foundation.text2.input.internal;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/text2/input/internal/EditingBuffer;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text2/input/internal/StatelessInputConnection$endBatchEditInternal$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,372:1\n460#2,11:373\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text2/input/internal/StatelessInputConnection$endBatchEditInternal$1\n*L\n111#1:373,11\n*E\n"})
/* loaded from: classes.dex */
public final class StatelessInputConnection$endBatchEditInternal$1 extends n0 implements l<EditingBuffer, r2> {
    final /* synthetic */ StatelessInputConnection this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatelessInputConnection$endBatchEditInternal$1(StatelessInputConnection statelessInputConnection) {
        super(1);
        this.this$0 = statelessInputConnection;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(EditingBuffer editingBuffer) {
        invoke2(editingBuffer);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l EditingBuffer editingBuffer) {
        MutableVector mutableVector;
        mutableVector = this.this$0.editCommands;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                ((l) content[i5]).invoke(editingBuffer);
                i5++;
            } while (i5 < size);
        }
    }
}
