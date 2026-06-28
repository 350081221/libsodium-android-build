package androidx.compose.runtime.saveable;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.l;

/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "list", "", "", "invoke", "(Ljava/util/List;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMapSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
/* loaded from: classes.dex */
final class MapSaverKt$mapSaver$2<T> extends n0 implements l<List<? extends Object>, T> {
    final /* synthetic */ l<Map<String, ? extends Object>, T> $restore;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapSaverKt$mapSaver$2(l<? super Map<String, ? extends Object>, ? extends T> lVar) {
        super(1);
        this.$restore = lVar;
    }

    @Override // v3.l
    @m
    public final T invoke(@p4.l List<? extends Object> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() % 2 == 0) {
            for (int i5 = 0; i5 < list.size(); i5 += 2) {
                Object obj = list.get(i5);
                l0.n(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, list.get(i5 + 1));
            }
            return this.$restore.invoke(linkedHashMap);
        }
        throw new IllegalStateException("non-zero remainder".toString());
    }
}
