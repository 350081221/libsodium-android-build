package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.x;
import kotlin.collections.z0;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.r2;
import kotlin.ranges.u;
import kotlin.u0;
import p4.l;

@i0(d1 = {"\u0000<\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a-\u0010\n\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b\u001a#\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b\u001a\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\"\u001a\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "generateSemanticsId", "Landroidx/compose/ui/Modifier;", "", "mergeDescendants", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "Lkotlin/u;", "properties", "semantics", "clearAndSetSemantics", "Landroidx/compose/ui/platform/InspectorInfo;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "addSemanticsPropertiesFrom", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "lastIdentifier", "Ljava/util/concurrent/atomic/AtomicInteger;", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n1179#2,2:210\n1253#2,4:212\n*S KotlinDebug\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n205#1:210,2\n205#1:212,4\n*E\n"})
/* loaded from: classes.dex */
public final class SemanticsModifierKt {

    @l
    private static AtomicInteger lastIdentifier = new AtomicInteger(0);

    public static final void addSemanticsPropertiesFrom(InspectorInfo inspectorInfo, SemanticsConfiguration semanticsConfiguration) {
        int Y;
        int j5;
        int u4;
        ValueElementSequence properties = inspectorInfo.getProperties();
        Y = x.Y(semanticsConfiguration, 10);
        j5 = z0.j(Y);
        u4 = u.u(j5, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u4);
        for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> entry : semanticsConfiguration) {
            SemanticsPropertyKey<?> key = entry.getKey();
            u0 a5 = q1.a(key.getName(), entry.getValue());
            linkedHashMap.put(a5.getFirst(), a5.getSecond());
        }
        properties.set("properties", linkedHashMap);
    }

    @l
    public static final Modifier clearAndSetSemantics(@l Modifier modifier, @l v3.l<? super SemanticsPropertyReceiver, r2> lVar) {
        return modifier.then(new ClearAndSetSemanticsElement(lVar));
    }

    public static final int generateSemanticsId() {
        return lastIdentifier.addAndGet(1);
    }

    @l
    public static final Modifier semantics(@l Modifier modifier, boolean z4, @l v3.l<? super SemanticsPropertyReceiver, r2> lVar) {
        return modifier.then(new AppendedSemanticsElement(z4, lVar));
    }

    public static /* synthetic */ Modifier semantics$default(Modifier modifier, boolean z4, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        return semantics(modifier, z4, lVar);
    }
}
