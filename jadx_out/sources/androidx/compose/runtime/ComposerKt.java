package androidx.compose.runtime;

import android.net.http.Headers;
import androidx.compose.runtime.collection.IdentityArraySet;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.a1;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.y;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0007\u001a \u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0007\u001a\b\u0010\u0010\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\nH\u0007\u001a(\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\nH\u0007\u001a\b\u0010\u0015\u001a\u00020\fH\u0007\u001a\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u001a\u001a\u00020\f*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u001a\u0014\u0010\u001b\u001a\u00020\f*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u001a&\u0010 \u001a\u00020\f*\u00020\u00172\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002\u001aP\u0010'\u001a>\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010$j\b\u0012\u0004\u0012\u00028\u0001`%0#j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010$j\b\u0012\u0004\u0012\u00028\u0001`%`&\"\u0004\b\u0000\u0010!\"\u0004\b\u0001\u0010\"H\u0002\u001aa\u0010)\u001a\u00020\u0002\"\u0004\b\u0000\u0010!\"\u0004\b\u0001\u0010\"*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010$0#j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010$j\b\u0012\u0004\u0012\u00028\u0001`%`&2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u0001H\u0002¢\u0006\u0004\b)\u0010*\u001ac\u0010+\u001a\u0004\u0018\u00010\f\"\u0004\b\u0000\u0010!\"\u0004\b\u0001\u0010\"*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010$0#j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010$j\b\u0012\u0004\u0012\u00028\u0001`%`&2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u0001H\u0002¢\u0006\u0004\b+\u0010,\u001a[\u0010-\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010!\"\u0004\b\u0001\u0010\"*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010$0#j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010$j\b\u0012\u0004\u0012\u00028\u0001`%`&2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b-\u0010.\u001a(\u00101\u001a\u0004\u0018\u00010\u001e2\b\u0010(\u001a\u0004\u0018\u00010\u001e2\b\u0010/\u001a\u0004\u0018\u00010\u001e2\b\u00100\u001a\u0004\u0018\u00010\u001eH\u0002\u001a\u001a\u00105\u001a\u00020\r*\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u00020\rH\u0002\u001a\u001a\u00106\u001a\u00020\r*\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u00020\rH\u0002\u001a,\u0010:\u001a\u00020\f*\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u00020\r2\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\u001eH\u0002\u001a$\u0010=\u001a\u0004\u0018\u000103*\b\u0012\u0004\u0012\u000203022\u0006\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020\rH\u0002\u001a\u001c\u0010>\u001a\u0004\u0018\u000103*\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u00020\rH\u0002\u001a\"\u0010?\u001a\u00020\f*\b\u0012\u0004\u0012\u000203022\u0006\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020\rH\u0002\u001a(\u0010@\u001a\b\u0012\u0004\u0012\u00020302*\b\u0012\u0004\u0012\u000203022\u0006\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020\rH\u0002\u001a\f\u0010A\u001a\u00020\r*\u00020\u0002H\u0002\u001a\f\u0010B\u001a\u00020\u0002*\u00020\rH\u0002\u001a\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0F*\u00020C2\u0006\u0010E\u001a\u00020DH\u0002\u001a\u001c\u0010J\u001a\u00020\r*\u00020H2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010I\u001a\u00020\rH\u0002\u001a$\u0010N\u001a\u00020\r*\u00020H2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010M\u001a\u00020\rH\u0002\u001a\u001f\u0010P\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u00022\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004H\u0080\b\u001a\u0010\u0010P\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0002H\u0000\u001a\u0010\u0010S\u001a\u00020R2\u0006\u0010Q\u001a\u00020\nH\u0000\"\u001e\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bU\u0010V\u0012\u0004\bW\u0010X\"\u0014\u0010Y\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\bY\u0010Z\"\u0014\u0010[\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b[\u0010Z\"\u0014\u0010\\\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\\\u0010Z\"\u001a\u0010]\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\b]\u0010Z\u0012\u0004\b^\u0010X\" \u0010_\u001a\u00020\u001e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b_\u0010`\u0012\u0004\bc\u0010X\u001a\u0004\ba\u0010b\"\u001a\u0010d\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\bd\u0010Z\u0012\u0004\be\u0010X\" \u0010f\u001a\u00020\u001e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bf\u0010`\u0012\u0004\bh\u0010X\u001a\u0004\bg\u0010b\"\u001a\u0010i\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\bi\u0010Z\u0012\u0004\bj\u0010X\" \u0010k\u001a\u00020\u001e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bk\u0010`\u0012\u0004\bm\u0010X\u001a\u0004\bl\u0010b\"\u001a\u0010n\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\bn\u0010Z\u0012\u0004\bo\u0010X\" \u0010p\u001a\u00020\u001e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bp\u0010`\u0012\u0004\br\u0010X\u001a\u0004\bq\u0010b\"\u001a\u0010s\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\bs\u0010Z\u0012\u0004\bt\u0010X\" \u0010u\u001a\u00020\u001e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bu\u0010`\u0012\u0004\bw\u0010X\u001a\u0004\bv\u0010b\"\u001a\u0010x\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\bx\u0010Z\u0012\u0004\by\u0010X\" \u0010z\u001a\u00020\u001e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bz\u0010`\u0012\u0004\b|\u0010X\u001a\u0004\b{\u0010b\"\u001a\u0010}\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\b}\u0010Z\u0012\u0004\b~\u0010X\"\u0014\u0010\u007f\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u007f\u0010Z\"\u001e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u0002030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u001c\u0010\u0086\u0001\u001a\u00020\u001e*\u00030\u0083\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u0087\u0001"}, d2 = {"T", "Landroidx/compose/runtime/Composer;", "", "invalid", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "block", "cache", "(Landroidx/compose/runtime/Composer;ZLv3/a;)Ljava/lang/Object;", "composer", "", "sourceInformation", "Lkotlin/r2;", "", DatabaseFileArchive.COLUMN_KEY, "sourceInformationMarkerStart", "isTraceInProgress", "info", "traceEventStart", "dirty1", "dirty2", "traceEventEnd", "sourceInformationMarkerEnd", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "removeCurrentGroup", "deactivateCurrentGroup", "group", "index", "", "data", "removeData", "K", "V", "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "multiMap", b.f22420d, "put", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "remove", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/r2;", "pop", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", "left", "right", "getKey", "", "Landroidx/compose/runtime/Invalidation;", Headers.LOCATION, "findLocation", "findInsertLocation", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "insertIfMissing", "start", "end", "firstInRange", "removeLocation", "removeRange", "filterToRange", "asInt", "asBool", "Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/Anchor;", "anchor", "", "collectNodesFrom", "Landroidx/compose/runtime/SlotReader;", "root", "distanceFrom", bi.ay, "b", "common", "nearestCommonRootOf", "lazyMessage", "runtimeCheck", CrashHianalyticsData.MESSAGE, "", "composeRuntimeError", "Landroidx/compose/runtime/CompositionTracer;", "compositionTracer", "Landroidx/compose/runtime/CompositionTracer;", "getCompositionTracer$annotations", "()V", "rootKey", "I", "nodeKey", "defaultsKey", "invocationKey", "getInvocationKey$annotations", "invocation", "Ljava/lang/Object;", "getInvocation", "()Ljava/lang/Object;", "getInvocation$annotations", "providerKey", "getProviderKey$annotations", "provider", "getProvider", "getProvider$annotations", "compositionLocalMapKey", "getCompositionLocalMapKey$annotations", "compositionLocalMap", "getCompositionLocalMap", "getCompositionLocalMap$annotations", "providerValuesKey", "getProviderValuesKey$annotations", "providerValues", "getProviderValues", "getProviderValues$annotations", "providerMapsKey", "getProviderMapsKey$annotations", "providerMaps", "getProviderMaps", "getProviderMaps$annotations", "referenceKey", "getReferenceKey$annotations", "reference", "getReference", "getReference$annotations", "reuseKey", "getReuseKey$annotations", "invalidGroupLocation", "Ljava/util/Comparator;", "InvalidationLocationAscending", "Ljava/util/Comparator;", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "joinedKey", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4197:1\n4178#1,5:4207\n4178#1,5:4227\n1#2:4198\n2049#3,8:4199\n361#4,7:4212\n150#5,8:4219\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n3914#1:4207,5\n4184#1:4227,5\n3893#1:4199,8\n3922#1:4212,7\n4036#1:4219,8\n*E\n"})
/* loaded from: classes.dex */
public final class ComposerKt {
    public static final int compositionLocalMapKey = 202;

    @m
    private static CompositionTracer compositionTracer = null;
    private static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;

    @l
    private static final Object invocation = new OpaqueKey("provider");

    @l
    private static final Object provider = new OpaqueKey("provider");

    @l
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");

    @l
    private static final Object providerValues = new OpaqueKey("providerValues");

    @l
    private static final Object providerMaps = new OpaqueKey("providers");

    @l
    private static final Object reference = new OpaqueKey("reference");

    @l
    private static final Comparator<Invalidation> InvalidationLocationAscending = new Comparator() { // from class: androidx.compose.runtime.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int InvalidationLocationAscending$lambda$15;
            InvalidationLocationAscending$lambda$15 = ComposerKt.InvalidationLocationAscending$lambda$15((Invalidation) obj, (Invalidation) obj2);
            return InvalidationLocationAscending$lambda$15;
        }
    };

    public static final int InvalidationLocationAscending$lambda$15(Invalidation invalidation, Invalidation invalidation2) {
        return l0.t(invalidation.getLocation(), invalidation2.getLocation());
    }

    public static final boolean asBool(int i5) {
        return i5 != 0;
    }

    public static final int asInt(boolean z4) {
        return z4 ? 1 : 0;
    }

    @ComposeCompilerApi
    public static final <T> T cache(@l Composer composer, boolean z4, @l v3.a<? extends T> aVar) {
        T t5 = (T) composer.rememberedValue();
        if (z4 || t5 == Composer.Companion.getEmpty()) {
            T invoke = aVar.invoke();
            composer.updateRememberedValue(invoke);
            return invoke;
        }
        return t5;
    }

    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader openReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$11$collectFromGroup(openReader, arrayList, slotTable.anchorIndex(anchor));
            r2 r2Var = r2.f19517a;
            return arrayList;
        } finally {
            openReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$11$collectFromGroup(SlotReader slotReader, List<Object> list, int i5) {
        if (slotReader.isNode(i5)) {
            list.add(slotReader.node(i5));
            return;
        }
        int i6 = i5 + 1;
        int groupSize = i5 + slotReader.groupSize(i5);
        while (i6 < groupSize) {
            collectNodesFrom$lambda$11$collectFromGroup(slotReader, list, i6);
            i6 += slotReader.groupSize(i6);
        }
    }

    @l
    public static final Void composeRuntimeError(@l String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void deactivateCurrentGroup(@l SlotWriter slotWriter, @l RememberManager rememberManager) {
        int currentGroup = slotWriter.getCurrentGroup();
        int currentGroupEnd = slotWriter.getCurrentGroupEnd();
        while (currentGroup < currentGroupEnd) {
            Object node = slotWriter.node(currentGroup);
            if (node instanceof ComposeNodeLifecycleCallback) {
                rememberManager.deactivating((ComposeNodeLifecycleCallback) node);
            }
            int slotIndex = slotWriter.slotIndex(slotWriter.groups, slotWriter.groupIndexToAddress(currentGroup));
            int i5 = currentGroup + 1;
            int dataIndex = slotWriter.dataIndex(slotWriter.groups, slotWriter.groupIndexToAddress(i5));
            for (int i6 = slotIndex; i6 < dataIndex; i6++) {
                int i7 = i6 - slotIndex;
                Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(i6)];
                if (obj instanceof RememberObserverHolder) {
                    RememberObserver wrapped = ((RememberObserverHolder) obj).getWrapped();
                    if (!(wrapped instanceof ReusableRememberObserver)) {
                        removeData(slotWriter, currentGroup, i7, obj);
                        rememberManager.forgetting(wrapped);
                    }
                } else if (obj instanceof RecomposeScopeImpl) {
                    removeData(slotWriter, currentGroup, i7, obj);
                    ((RecomposeScopeImpl) obj).release();
                }
            }
            currentGroup = i5;
        }
    }

    private static final int distanceFrom(SlotReader slotReader, int i5, int i6) {
        int i7 = 0;
        while (i5 > 0 && i5 != i6) {
            i5 = slotReader.parent(i5);
            i7++;
        }
        return i7;
    }

    public static final List<Invalidation> filterToRange(List<Invalidation> list, int i5, int i6) {
        ArrayList arrayList = new ArrayList();
        for (int findInsertLocation = findInsertLocation(list, i5); findInsertLocation < list.size(); findInsertLocation++) {
            Invalidation invalidation = list.get(findInsertLocation);
            if (invalidation.getLocation() >= i6) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    private static final int findInsertLocation(List<Invalidation> list, int i5) {
        int findLocation = findLocation(list, i5);
        return findLocation < 0 ? -(findLocation + 1) : findLocation;
    }

    private static final int findLocation(List<Invalidation> list, int i5) {
        int size = list.size() - 1;
        int i6 = 0;
        while (i6 <= size) {
            int i7 = (i6 + size) >>> 1;
            int t5 = l0.t(list.get(i7).getLocation(), i5);
            if (t5 < 0) {
                i6 = i7 + 1;
            } else if (t5 > 0) {
                size = i7 - 1;
            } else {
                return i7;
            }
        }
        return -(i6 + 1);
    }

    public static final Invalidation firstInRange(List<Invalidation> list, int i5, int i6) {
        int findInsertLocation = findInsertLocation(list, i5);
        if (findInsertLocation < list.size()) {
            Invalidation invalidation = list.get(findInsertLocation);
            if (invalidation.getLocation() < i6) {
                return invalidation;
            }
            return null;
        }
        return null;
    }

    @l
    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    @a1
    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    @a1
    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    @l
    public static final Object getInvocation() {
        return invocation;
    }

    @a1
    public static /* synthetic */ void getInvocation$annotations() {
    }

    @a1
    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey;
        if (obj instanceof JoinedKey) {
            joinedKey = (JoinedKey) obj;
        } else {
            joinedKey = null;
        }
        if (joinedKey == null) {
            return null;
        }
        if ((!l0.g(joinedKey.getLeft(), obj2) || !l0.g(joinedKey.getRight(), obj3)) && (obj = getKey(joinedKey.getLeft(), obj2, obj3)) == null) {
            obj = getKey(joinedKey.getRight(), obj2, obj3);
        }
        return obj;
    }

    @l
    public static final Object getProvider() {
        return provider;
    }

    @a1
    public static /* synthetic */ void getProvider$annotations() {
    }

    @a1
    public static /* synthetic */ void getProviderKey$annotations() {
    }

    @l
    public static final Object getProviderMaps() {
        return providerMaps;
    }

    @a1
    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    @a1
    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    @l
    public static final Object getProviderValues() {
        return providerValues;
    }

    @a1
    public static /* synthetic */ void getProviderValues$annotations() {
    }

    @a1
    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    @l
    public static final Object getReference() {
        return reference;
    }

    @a1
    public static /* synthetic */ void getReference$annotations() {
    }

    @a1
    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    @a1
    public static /* synthetic */ void getReuseKey$annotations() {
    }

    public static final void insertIfMissing(List<Invalidation> list, int i5, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int findLocation = findLocation(list, i5);
        IdentityArraySet identityArraySet = null;
        if (findLocation < 0) {
            int i6 = -(findLocation + 1);
            if (obj != null) {
                identityArraySet = new IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i6, new Invalidation(recomposeScopeImpl, i5, identityArraySet));
            return;
        }
        if (obj == null) {
            list.get(findLocation).setInstances(null);
            return;
        }
        IdentityArraySet<Object> instances = list.get(findLocation).getInstances();
        if (instances != null) {
            instances.add(obj);
        }
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    public static final <K, V> HashMap<K, LinkedHashSet<V>> multiMap() {
        return new HashMap<>();
    }

    public static final int nearestCommonRootOf(SlotReader slotReader, int i5, int i6, int i7) {
        if (i5 == i6) {
            return i5;
        }
        if (i5 != i7 && i6 != i7) {
            if (slotReader.parent(i5) == i6) {
                return i6;
            }
            if (slotReader.parent(i6) == i5) {
                return i5;
            }
            if (slotReader.parent(i5) == slotReader.parent(i6)) {
                return slotReader.parent(i5);
            }
            int distanceFrom = distanceFrom(slotReader, i5, i7);
            int distanceFrom2 = distanceFrom(slotReader, i6, i7);
            int i8 = distanceFrom - distanceFrom2;
            for (int i9 = 0; i9 < i8; i9++) {
                i5 = slotReader.parent(i5);
            }
            int i10 = distanceFrom2 - distanceFrom;
            for (int i11 = 0; i11 < i10; i11++) {
                i6 = slotReader.parent(i6);
            }
            while (i5 != i6) {
                i5 = slotReader.parent(i5);
                i6 = slotReader.parent(i6);
            }
            return i5;
        }
        return i7;
    }

    public static final <K, V> V pop(HashMap<K, LinkedHashSet<V>> hashMap, K k5) {
        Object B2;
        LinkedHashSet<V> linkedHashSet = hashMap.get(k5);
        if (linkedHashSet != null) {
            B2 = e0.B2(linkedHashSet);
            V v4 = (V) B2;
            if (v4 != null) {
                remove(hashMap, k5, v4);
                return v4;
            }
        }
        return null;
    }

    public static final <K, V> boolean put(HashMap<K, LinkedHashSet<V>> hashMap, K k5, V v4) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k5);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k5, linkedHashSet);
        }
        return linkedHashSet.add(v4);
    }

    private static final <K, V> r2 remove(HashMap<K, LinkedHashSet<V>> hashMap, K k5, V v4) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k5);
        if (linkedHashSet != null) {
            linkedHashSet.remove(v4);
            if (linkedHashSet.isEmpty()) {
                hashMap.remove(k5);
            }
            return r2.f19517a;
        }
        return null;
    }

    public static final void removeCurrentGroup(@l SlotWriter slotWriter, @l RememberManager rememberManager) {
        Iterator<Object> groupSlots = slotWriter.groupSlots();
        while (groupSlots.hasNext()) {
            Object next = groupSlots.next();
            if (next instanceof ComposeNodeLifecycleCallback) {
                rememberManager.releasing((ComposeNodeLifecycleCallback) next);
            }
            if (next instanceof RememberObserverHolder) {
                rememberManager.forgetting(((RememberObserverHolder) next).getWrapped());
            }
            if (next instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) next).release();
            }
        }
        slotWriter.removeGroup();
    }

    private static final void removeData(SlotWriter slotWriter, int i5, int i6, Object obj) {
        boolean z4;
        if (obj == slotWriter.set(i5, i6, Composer.Companion.getEmpty())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        composeRuntimeError("Slot table is out of sync".toString());
        throw new y();
    }

    public static final Invalidation removeLocation(List<Invalidation> list, int i5) {
        int findLocation = findLocation(list, i5);
        if (findLocation >= 0) {
            return list.remove(findLocation);
        }
        return null;
    }

    public static final void removeRange(List<Invalidation> list, int i5, int i6) {
        int findInsertLocation = findInsertLocation(list, i5);
        while (findInsertLocation < list.size() && list.get(findInsertLocation).getLocation() < i6) {
            list.remove(findInsertLocation);
        }
    }

    public static final void runtimeCheck(boolean z4, @l v3.a<? extends Object> aVar) {
        if (z4) {
            return;
        }
        composeRuntimeError(aVar.invoke().toString());
        throw new y();
    }

    @ComposeCompilerApi
    public static final void sourceInformation(@l Composer composer, @l String str) {
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(@l Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(@l Composer composer, int i5, @l String str) {
        composer.sourceInformationMarkerStart(i5, str);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i5, int i6, int i7, @l String str) {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i5, i6, i7, str);
        }
    }

    public static final void runtimeCheck(boolean z4) {
        if (z4) {
            return;
        }
        composeRuntimeError("Check failed".toString());
        throw new y();
    }
}
