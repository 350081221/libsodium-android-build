package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Add missing generic type declarations: [Original] */
@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Original", "Saveable", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nListSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListSaver.kt\nandroidx/compose/runtime/saveable/ListSaverKt$listSaver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: classes.dex */
final class ListSaverKt$listSaver$1<Original> extends n0 implements p<SaverScope, Original, Object> {
    final /* synthetic */ p<SaverScope, Original, List<Saveable>> $save;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListSaverKt$listSaver$1(p<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> pVar) {
        super(2);
        this.$save = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.p
    public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Object obj) {
        return invoke2(saverScope, (SaverScope) obj);
    }

    @m
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@l SaverScope saverScope, Original original) {
        List list = (List) this.$save.invoke(saverScope, original);
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            if (obj != null && !saverScope.canBeSaved(obj)) {
                throw new IllegalArgumentException("item can't be saved".toString());
            }
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            return new ArrayList(list2);
        }
        return null;
    }
}
