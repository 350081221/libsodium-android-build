package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.p;

/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "", "T", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMapSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,55:1\n215#2,2:56\n*S KotlinDebug\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n*L\n36#1:56,2\n*E\n"})
/* loaded from: classes.dex */
final class MapSaverKt$mapSaver$1<T> extends n0 implements p<SaverScope, T, List<? extends Object>> {
    final /* synthetic */ p<SaverScope, T, Map<String, Object>> $save;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapSaverKt$mapSaver$1(p<? super SaverScope, ? super T, ? extends Map<String, ? extends Object>> pVar) {
        super(2);
        this.$save = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.p
    public /* bridge */ /* synthetic */ List<? extends Object> invoke(SaverScope saverScope, Object obj) {
        return invoke2(saverScope, (SaverScope) obj);
    }

    @l
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final List<Object> invoke2(@l SaverScope saverScope, T t5) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : this.$save.invoke(saverScope, t5).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }
}
