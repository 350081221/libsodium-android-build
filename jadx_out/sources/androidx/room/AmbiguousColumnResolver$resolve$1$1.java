package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "startIndex", "endIndex", "", "Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "resultColumnsSublist", "Lkotlin/r2;", "invoke", "(IILjava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$resolve$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n11335#2:254\n11670#2,2:255\n11672#2:259\n288#3,2:257\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$resolve$1$1\n*L\n102#1:254\n102#1:255,2\n102#1:259\n103#1:257,2\n*E\n"})
/* loaded from: classes2.dex */
final class AmbiguousColumnResolver$resolve$1$1 extends n0 implements v3.q<Integer, Integer, List<? extends AmbiguousColumnResolver.ResultColumn>, r2> {
    final /* synthetic */ String[] $mapping;
    final /* synthetic */ int $mappingIndex;
    final /* synthetic */ List<List<AmbiguousColumnResolver.Match>> $mappingMatches;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AmbiguousColumnResolver$resolve$1$1(String[] strArr, List<? extends List<AmbiguousColumnResolver.Match>> list, int i5) {
        super(3);
        this.$mapping = strArr;
        this.$mappingMatches = list;
        this.$mappingIndex = i5;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(Integer num, Integer num2, List<? extends AmbiguousColumnResolver.ResultColumn> list) {
        invoke(num.intValue(), num2.intValue(), (List<AmbiguousColumnResolver.ResultColumn>) list);
        return r2.f19517a;
    }

    public final void invoke(int i5, int i6, @p4.l List<AmbiguousColumnResolver.ResultColumn> resultColumnsSublist) {
        Object obj;
        l0.p(resultColumnsSublist, "resultColumnsSublist");
        String[] strArr = this.$mapping;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Iterator<T> it = resultColumnsSublist.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (l0.g(str, ((AmbiguousColumnResolver.ResultColumn) obj).component1())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AmbiguousColumnResolver.ResultColumn resultColumn = (AmbiguousColumnResolver.ResultColumn) obj;
            if (resultColumn == null) {
                return;
            }
            arrayList.add(Integer.valueOf(resultColumn.getIndex()));
        }
        this.$mappingMatches.get(this.$mappingIndex).add(new AmbiguousColumnResolver.Match(new kotlin.ranges.l(i5, i6 - 1), arrayList));
    }
}
