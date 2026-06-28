package androidx.navigation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;

@i0(d1 = {"\u0000&\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001aC\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003H\u0000¨\u0006\u000b"}, d2 = {"", "", "Landroidx/navigation/NavArgument;", "Lkotlin/Function1;", "Lkotlin/v0;", "name", DatabaseFileArchive.COLUMN_KEY, "", "isArgumentMissing", "", "missingRequiredArguments", "navigation-common_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nNavArgument.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n483#2,7:205\n766#3:212\n857#3,2:213\n*S KotlinDebug\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n*L\n197#1:205,7\n202#1:212\n202#1:213,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavArgumentKt {
    @l
    public static final List<String> missingRequiredArguments(@l Map<String, NavArgument> map, @l v3.l<? super String, Boolean> isArgumentMissing) {
        l0.p(map, "<this>");
        l0.p(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, NavArgument> entry : map.entrySet()) {
            NavArgument value = entry.getValue();
            boolean z4 = false;
            if (value != null && !value.isNullable() && !value.isDefaultValuePresent()) {
                z4 = true;
            }
            if (z4) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (isArgumentMissing.invoke((String) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
