package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.umeng.analytics.pro.bi;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.p;
import kotlin.comparisons.g;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\t\u001a\u00020\b*\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0000¨\u0006\n"}, d2 = {"", bi.ay, "b", "", "areObjectsOfSameType", "Landroidx/compose/ui/platform/InspectorInfo;", "Landroidx/compose/ui/node/ModifierNodeElement;", "element", "Lkotlin/r2;", "tryPopulateReflectively", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nActual.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,50:1\n6442#2:51\n33#3,6:52\n*S KotlinDebug\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n*L\n34#1:51\n35#1:52,6\n*E\n"})
/* loaded from: classes.dex */
public final class Actual_jvmKt {
    public static final boolean areObjectsOfSameType(@l Object obj, @l Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final void tryPopulateReflectively(@l InspectorInfo inspectorInfo, @l ModifierNodeElement<?> modifierNodeElement) {
        List Lv;
        Lv = p.Lv(modifierNodeElement.getClass().getDeclaredFields(), new Comparator() { // from class: androidx.compose.ui.Actual_jvmKt$tryPopulateReflectively$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t5, T t6) {
                int l5;
                l5 = g.l(((Field) t5).getName(), ((Field) t6).getName());
                return l5;
            }
        });
        int size = Lv.size();
        for (int i5 = 0; i5 < size; i5++) {
            Field field = (Field) Lv.get(i5);
            if (!field.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class)) {
                try {
                    field.setAccessible(true);
                    inspectorInfo.getProperties().set(field.getName(), field.get(modifierNodeElement));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
