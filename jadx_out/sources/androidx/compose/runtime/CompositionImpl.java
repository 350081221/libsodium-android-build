package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.animation.core.h;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.compose.ComposeNavigator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.e0;
import kotlin.collections.o;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.u0;
import kotlin.y;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002¶\u0001B+\u0012\u0006\u0010g\u001a\u00020f\u0012\n\u0010j\u001a\u0006\u0012\u0002\b\u00030i\u0012\f\b\u0002\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u0097\u0001¢\u0006\u0006\b´\u0001\u0010µ\u0001J\"\u0010\t\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002JD\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f*\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001e\u0010\u0014\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0002J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002JM\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c25\u0010\"\u001a1\u0012'\u0012%\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001f0\u001e¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00028\u00000\u001dH\u0082\b¢\u0006\u0004\b#\u0010$J$\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0082\b¢\u0006\u0004\b%\u0010&J\b\u0010'\u001a\u00020\u0006H\u0002J\u001a\u0010*\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0010H\u0002J\"\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+2\b\u0010)\u001a\u0004\u0018\u00010\u0010H\u0002J\u001c\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001f0\u001eH\u0002J\u0010\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u000200H\u0002J$\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0082\b¢\u0006\u0004\b3\u0010&J\n\u00105\u001a\u0004\u0018\u000104H\u0002J\"\u00106\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b6\u0010\nJ\"\u00107\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b7\u0010\nJ\u0017\u0010;\u001a\u0002082\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b9\u0010:J\u000e\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020<J\"\u0010?\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b?\u0010\nJ\b\u0010@\u001a\u00020\u0006H\u0016J\u0016\u0010A\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0016J\u0016\u0010B\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0016J\u0016\u0010C\u001a\u00020\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010D\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010E\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010F\u001a\u00020\u0012H\u0016J$\u0010K\u001a\u00020\u00062\u001a\u0010J\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020I\u0012\u0006\u0012\u0004\u0018\u00010I0H0GH\u0016J\u0010\u0010N\u001a\u00020\u00062\u0006\u0010M\u001a\u00020LH\u0016J\b\u0010O\u001a\u00020\u0006H\u0016J\b\u0010P\u001a\u00020\u0006H\u0016J\b\u0010Q\u001a\u00020\u0006H\u0016J\b\u0010R\u001a\u00020\u0006H\u0016J\b\u0010S\u001a\u00020\u0006H\u0016J5\u0010W\u001a\u00028\u0000\"\u0004\b\u0000\u0010T2\b\u0010U\u001a\u0004\u0018\u00010\u00012\u0006\u0010V\u001a\u00020<2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\bW\u0010XJ\u001a\u0010Y\u001a\u00020-2\u0006\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010Z\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u000eH\u0016J%\u0010\\\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001c2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u000eH\u0000¢\u0006\u0004\b^\u0010_J\u001b\u0010d\u001a\u00020\u00062\n\u0010M\u001a\u0006\u0012\u0002\b\u00030aH\u0000¢\u0006\u0004\bb\u0010cJ\b\u0010e\u001a\u00020\u0006H\u0016R\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0006\u0012\u0002\b\u00030i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR(\u0010n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00100lj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010`m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR$\u0010s\u001a\u0012\u0012\u0004\u0012\u00020r0\rj\b\u0012\u0004\u0012\u00020r`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR \u00101\u001a\u0002008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b1\u0010u\u0012\u0004\bx\u0010y\u001a\u0004\bv\u0010wR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000e0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R$\u0010}\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010tR\u001e\u0010~\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030a0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010|R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u007fR\u0016\u0010\u0080\u0001\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010|R-\u0010\u0082\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001f0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R0\u0010\u0084\u0001\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u001f\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u0012\u0005\b\u008a\u0001\u0010y\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008d\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R \u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001c\u0010\u009a\u0001\u001a\u00020\u00128\u0006¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0085\u0001\u001a\u0006\b\u009a\u0001\u0010\u0087\u0001R\u0019\u0010\u009b\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0085\u0001R3\u0010\u009c\u0001\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0005\b \u0001\u0010\nR\u0017\u0010¢\u0001\u001a\u00020\u00128BX\u0082\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u0087\u0001R\u001d\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158AX\u0080\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u001d\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158AX\u0080\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010¤\u0001R\u001d\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0G8AX\u0080\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R\u0015\u0010\u00ad\u0001\u001a\u00030\u0097\u00018F¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0017\u0010®\u0001\u001a\u00020\u00128VX\u0096\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010\u0087\u0001R\u0017\u0010¯\u0001\u001a\u00020\u00128VX\u0096\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010\u0087\u0001R\u0017\u0010±\u0001\u001a\u00020\u00128VX\u0096\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010\u0087\u0001R\u0017\u0010³\u0001\u001a\u00020\u00128VX\u0096\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010\u0087\u0001¨\u0006·\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial", "(Lv3/p;)V", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "Ljava/util/HashSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Lkotlin/collections/HashSet;", "", b.f22420d, "", "forgetConditionalScopes", "addPendingInvalidationsLocked", "", "values", "cleanUpDerivedStateObservations", "invalidateScopeOfLocked", "Landroidx/compose/runtime/changelist/ChangeList;", "changes", "applyChangesInLocked", "T", "Lkotlin/Function1;", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "Lkotlin/v0;", "name", "block", "guardInvalidationsLocked", "(Lv3/l;)Ljava/lang/Object;", "guardChanges", "(Lv3/a;)Ljava/lang/Object;", "abandonChanges", "scope", "instance", "tryImminentInvalidation", "Landroidx/compose/runtime/Anchor;", "anchor", "Landroidx/compose/runtime/InvalidationResult;", "invalidateChecked", "takeInvalidations", "Landroidx/compose/runtime/SlotTable;", "slotTable", "validateRecomposeScopeAnchors", "trackAbandonedValues", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observer", "setContent", "setContentWithReuse", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe$runtime_release", "(Landroidx/compose/runtime/tooling/CompositionObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe", "", DatabaseFileArchive.COLUMN_KEY, "invalidateGroupsWithKey", "composeContent", "dispose", "recordModificationsOf", "observesAnyOf", "prepareCompose", "recordReadOf", "recordWriteOf", "recompose", "", "Lkotlin/u0;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContent", "Landroidx/compose/runtime/MovableContentState;", "state", "disposeUnusedMovableContent", "applyChanges", "applyLateChanges", "changesApplied", "invalidateAll", "verifyConsistent", "R", TypedValues.TransitionType.S_TO, "groupIndex", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILv3/a;)Ljava/lang/Object;", "invalidate", "recomposeScopeReleased", "Landroidx/compose/runtime/CompositionServiceKey;", "getCompositionService", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "removeObservation$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation", "Landroidx/compose/runtime/DerivedState;", "removeDerivedStateObservation$runtime_release", "(Landroidx/compose/runtime/DerivedState;)V", "removeDerivedStateObservation", "deactivate", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "lock", "Ljava/lang/Object;", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Ljava/util/HashSet;", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release$annotations", "()V", "Landroidx/compose/runtime/collection/ScopeMap;", "observations", "Landroidx/compose/runtime/collection/ScopeMap;", "conditionallyInvalidatedScopes", "derivedStates", "Landroidx/compose/runtime/changelist/ChangeList;", "lateChanges", "observationsProcessed", "invalidations", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "pendingInvalidScopes", "Z", "getPendingInvalidScopes$runtime_release", "()Z", "setPendingInvalidScopes$runtime_release", "(Z)V", "getPendingInvalidScopes$runtime_release$annotations", "invalidationDelegate", "Landroidx/compose/runtime/CompositionImpl;", "invalidationDelegateGroup", "I", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "Lkotlin/coroutines/g;", "_recomposeContext", "Lkotlin/coroutines/g;", "isRoot", "disposed", ComposeNavigator.NAME, "Lv3/p;", "getComposable", "()Lv3/p;", "setComposable", "getAreChildrenComposing", "areChildrenComposing", "getObservedObjects$runtime_release", "()Ljava/util/Set;", "observedObjects", "getDerivedStateDependencies$runtime_release", "derivedStateDependencies", "getConditionalScopes$runtime_release", "()Ljava/util/List;", "conditionalScopes", "getRecomposeContext", "()Lkotlin/coroutines/g;", "recomposeContext", "isComposing", "isDisposed", "getHasPendingChanges", "hasPendingChanges", "getHasInvalidations", "hasInvalidations", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/g;)V", "RememberEventDispatcher", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 7 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 15 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 16 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 17 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 18 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 19 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1381:1\n1047#1,2:1396\n1205#1,3:1398\n1037#1,6:1402\n1208#1,7:1408\n1049#1,4:1415\n1047#1,2:1850\n1205#1,3:1852\n1037#1,6:1855\n1208#1,7:1861\n1049#1,4:1868\n1047#1,2:1881\n1205#1,10:1883\n1049#1,4:1893\n1047#1,2:1988\n1205#1,10:1990\n1049#1,4:2000\n1047#1,2:2005\n1205#1,10:2007\n1049#1,4:2017\n1047#1,2:2022\n1205#1,10:2024\n1049#1,4:2034\n1205#1,10:2038\n82#2:1382\n82#2:1384\n82#2:1385\n82#2:1401\n82#2:1419\n82#2:1428\n82#2:1429\n82#2:1812\n82#2:1849\n82#2:1987\n82#2:2004\n82#2:2021\n82#2:2048\n82#2:2051\n82#2:2052\n82#2:2053\n1#3:1383\n1#3:2064\n93#4,2:1386\n33#4,4:1388\n95#4,2:1392\n38#4:1394\n97#4:1395\n110#4,2:1872\n33#4,6:1874\n112#4:1880\n33#4,6:2067\n166#5,8:1420\n166#5,8:1897\n166#5,8:1908\n166#5,8:2076\n108#6,7:1430\n108#6,5:1475\n114#6:1516\n70#7,5:1437\n78#7,4:1469\n70#7,5:1480\n78#7,4:1512\n124#7:1546\n125#7,5:1562\n130#7,5:1594\n138#7:1609\n124#7:1610\n125#7,5:1626\n130#7,5:1660\n138#7:1675\n124#7:1676\n125#7,5:1692\n130#7,5:1726\n138#7:1741\n70#7,5:1776\n78#7,4:1808\n70#7,5:1813\n78#7,4:1845\n124#7:1920\n125#7,5:1936\n130#7,5:1970\n138#7:1985\n267#8,4:1442\n237#8,7:1446\n248#8,3:1454\n251#8,2:1458\n272#8,2:1460\n254#8,6:1462\n274#8:1468\n267#8,4:1485\n237#8,7:1489\n248#8,3:1497\n251#8,2:1501\n272#8,2:1503\n254#8,6:1505\n274#8:1511\n237#8,16:1519\n272#8,2:1535\n254#8,6:1537\n274#8:1543\n237#8,7:1569\n248#8,3:1577\n251#8,2:1581\n254#8,6:1587\n237#8,16:1633\n254#8,6:1653\n237#8,16:1699\n254#8,6:1719\n267#8,4:1781\n237#8,7:1785\n248#8,3:1793\n251#8,2:1797\n272#8,2:1799\n254#8,6:1801\n274#8:1807\n267#8,4:1818\n237#8,7:1822\n248#8,3:1830\n251#8,2:1834\n272#8,2:1836\n254#8,6:1838\n274#8:1844\n237#8,16:1943\n254#8,6:1963\n1810#9:1453\n1672#9:1457\n1810#9:1496\n1672#9:1500\n1810#9:1554\n1672#9:1558\n1810#9:1576\n1672#9:1580\n1810#9:1618\n1672#9:1622\n1810#9:1684\n1672#9:1688\n1810#9:1759\n1672#9:1763\n1810#9:1792\n1672#9:1796\n1810#9:1829\n1672#9:1833\n1810#9:1928\n1672#9:1932\n396#10,2:1473\n399#10:1517\n401#10:1545\n1855#11:1518\n1856#11:1544\n1047#12:1547\n1049#12:1561\n1050#12,3:1599\n1053#12:1608\n1047#12:1611\n1049#12:1625\n1050#12,3:1665\n1053#12:1674\n1047#12:1677\n1049#12:1691\n1050#12,3:1731\n1053#12:1740\n1047#12:1921\n1049#12:1935\n1050#12,3:1975\n1053#12:1984\n363#13,6:1548\n373#13,3:1555\n376#13,2:1559\n379#13,6:1602\n363#13,6:1612\n373#13,3:1619\n376#13,2:1623\n379#13,6:1668\n363#13,6:1678\n373#13,3:1685\n376#13,2:1689\n379#13,6:1734\n363#13,6:1922\n373#13,3:1929\n376#13,2:1933\n379#13,6:1978\n842#14,2:1567\n845#14,4:1583\n849#14:1593\n842#14,2:1631\n845#14,4:1649\n849#14:1659\n842#14,2:1697\n845#14,4:1715\n849#14:1725\n842#14,2:1941\n845#14,4:1959\n849#14:1969\n1368#15,7:1742\n50#16:1749\n50#16:1767\n415#17,3:1750\n373#17,6:1753\n383#17,3:1760\n386#17,2:1764\n419#17:1766\n420#17:1768\n389#17,6:1769\n421#17:1775\n46#18,3:1905\n50#18:1916\n46#18,3:1917\n50#18:1986\n46#18,3:2073\n50#18:2084\n13579#19,2:2049\n11653#19,9:2054\n13579#19:2063\n13580#19:2065\n11662#19:2066\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n715#1:1396,2\n715#1:1398,3\n718#1:1402,6\n715#1:1408,7\n715#1:1415,4\n932#1:1850,2\n932#1:1852,3\n933#1:1855,6\n932#1:1861,7\n932#1:1868,4\n953#1:1881,2\n953#1:1883,10\n953#1:1893,4\n1004#1:1988,2\n1004#1:1990,10\n1004#1:2000,4\n1013#1:2005,2\n1013#1:2007,10\n1013#1:2017,4\n1023#1:2022,2\n1023#1:2024,10\n1023#1:2034,4\n1048#1:2038,10\n616#1:1382\n638#1:1384\n655#1:1385\n716#1:1401\n733#1:1419\n779#1:1428\n800#1:1429\n920#1:1812\n930#1:1849\n1003#1:1987\n1012#1:2004\n1022#1:2021\n1062#1:2048\n1068#1:2051\n1103#1:2052\n1130#1:2053\n1192#1:2064\n662#1:1386,2\n662#1:1388,4\n662#1:1392,2\n662#1:1394\n662#1:1395\n952#1:1872,2\n952#1:1874,6\n952#1:1880\n1193#1:2067,6\n764#1:1420,8\n961#1:1897,8\n975#1:1908,8\n1335#1:2076,8\n811#1:1430,7\n848#1:1475,5\n848#1:1516\n829#1:1437,5\n829#1:1469,4\n854#1:1480,5\n854#1:1512,4\n862#1:1546\n862#1:1562,5\n862#1:1594,5\n862#1:1609\n869#1:1610\n869#1:1626,5\n869#1:1660,5\n869#1:1675\n876#1:1676\n876#1:1692,5\n876#1:1726,5\n876#1:1741\n912#1:1776,5\n912#1:1808,4\n925#1:1813,5\n925#1:1845,4\n990#1:1920\n990#1:1936,5\n990#1:1970,5\n990#1:1985\n829#1:1442,4\n829#1:1446,7\n829#1:1454,3\n829#1:1458,2\n829#1:1460,2\n829#1:1462,6\n829#1:1468\n854#1:1485,4\n854#1:1489,7\n854#1:1497,3\n854#1:1501,2\n854#1:1503,2\n854#1:1505,6\n854#1:1511\n854#1:1519,16\n854#1:1535,2\n854#1:1537,6\n854#1:1543\n862#1:1569,7\n862#1:1577,3\n862#1:1581,2\n862#1:1587,6\n869#1:1633,16\n869#1:1653,6\n876#1:1699,16\n876#1:1719,6\n912#1:1781,4\n912#1:1785,7\n912#1:1793,3\n912#1:1797,2\n912#1:1799,2\n912#1:1801,6\n912#1:1807\n925#1:1818,4\n925#1:1822,7\n925#1:1830,3\n925#1:1834,2\n925#1:1836,2\n925#1:1838,6\n925#1:1844\n990#1:1943,16\n990#1:1963,6\n829#1:1453\n829#1:1457\n854#1:1496\n854#1:1500\n862#1:1554\n862#1:1558\n862#1:1576\n862#1:1580\n869#1:1618\n869#1:1622\n876#1:1684\n876#1:1688\n898#1:1759\n898#1:1763\n912#1:1792\n912#1:1796\n925#1:1829\n925#1:1833\n990#1:1928\n990#1:1932\n848#1:1473,2\n848#1:1517\n848#1:1545\n848#1:1518\n848#1:1544\n862#1:1547\n862#1:1561\n862#1:1599,3\n862#1:1608\n869#1:1611\n869#1:1625\n869#1:1665,3\n869#1:1674\n876#1:1677\n876#1:1691\n876#1:1731,3\n876#1:1740\n990#1:1921\n990#1:1935\n990#1:1975,3\n990#1:1984\n862#1:1548,6\n862#1:1555,3\n862#1:1559,2\n862#1:1602,6\n869#1:1612,6\n869#1:1619,3\n869#1:1623,2\n869#1:1668,6\n876#1:1678,6\n876#1:1685,3\n876#1:1689,2\n876#1:1734,6\n990#1:1922,6\n990#1:1929,3\n990#1:1933,2\n990#1:1978,6\n862#1:1567,2\n862#1:1583,4\n862#1:1593\n869#1:1631,2\n869#1:1649,4\n869#1:1659\n876#1:1697,2\n876#1:1715,4\n876#1:1725\n990#1:1941,2\n990#1:1959,4\n990#1:1969\n878#1:1742,7\n890#1:1749\n900#1:1767\n898#1:1750,3\n898#1:1753,6\n898#1:1760,3\n898#1:1764,2\n898#1:1766\n898#1:1768\n898#1:1769,6\n898#1:1775\n971#1:1905,3\n971#1:1916\n988#1:1917,3\n988#1:1986\n1331#1:2073,3\n1331#1:2084\n1063#1:2049,2\n1192#1:2054,9\n1192#1:2063\n1192#1:2065\n1192#1:2066\n*E\n"})
/* loaded from: classes.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices {
    public static final int $stable = 8;

    @m
    private final g _recomposeContext;

    @l
    private final HashSet<RememberObserver> abandonSet;

    @l
    private final Applier<?> applier;

    @l
    private final ChangeList changes;

    @l
    private p<? super Composer, ? super Integer, r2> composable;

    @l
    private final ComposerImpl composer;

    @l
    private final HashSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;

    @l
    private final ScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;

    @m
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;

    @l
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;

    @l
    private final ChangeList lateChanges;

    @l
    private final Object lock;

    @l
    private final ScopeMap<RecomposeScopeImpl> observations;

    @l
    private final ScopeMap<RecomposeScopeImpl> observationsProcessed;

    @l
    private final CompositionObserverHolder observerHolder;

    @l
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;

    @l
    private final AtomicReference<Object> pendingModifications;

    @l
    private final SlotTable slotTable;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "Landroidx/compose/runtime/RememberObserver;", "instance", "Lkotlin/r2;", "remembering", "forgetting", "Lkotlin/Function0;", "effect", "sideEffect", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "deactivating", "releasing", "dispatchRememberObservers", "dispatchSideEffects", "dispatchAbandons", "", "abandoning", "Ljava/util/Set;", "", "Ljava/util/List;", "", "sideEffects", "Landroidx/collection/MutableScatterSet;", "Landroidx/collection/MutableScatterSet;", "<init>", "(Ljava/util/Set;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1381:1\n1#2:1382\n46#3,5:1383\n46#3,3:1388\n50#3:1397\n46#3,3:1398\n50#3:1407\n46#3,5:1408\n33#4,6:1391\n33#4,6:1401\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n*L\n1270#1:1383,5\n1292#1:1388,3\n1292#1:1397\n1303#1:1398,3\n1303#1:1407\n1314#1:1408,5\n1293#1:1391,6\n1304#1:1401,6\n*E\n"})
    /* loaded from: classes.dex */
    public static final class RememberEventDispatcher implements RememberManager {

        @l
        private final Set<RememberObserver> abandoning;

        @m
        private MutableScatterSet<ComposeNodeLifecycleCallback> releasing;

        @l
        private final List<RememberObserver> remembering = new ArrayList();

        @l
        private final List<Object> forgetting = new ArrayList();

        @l
        private final List<v3.a<r2>> sideEffects = new ArrayList();

        public RememberEventDispatcher(@l Set<RememberObserver> set) {
            this.abandoning = set;
        }

        @Override // androidx.compose.runtime.RememberManager
        public void deactivating(@l ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
            this.forgetting.add(composeNodeLifecycleCallback);
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator<RememberObserver> it = this.abandoning.iterator();
                    while (it.hasNext()) {
                        RememberObserver next = it.next();
                        it.remove();
                        next.onAbandoned();
                    }
                    r2 r2Var = r2.f19517a;
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
        }

        public final void dispatchRememberObservers() {
            Object beginSection;
            if (!this.forgetting.isEmpty()) {
                beginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    ScatterSet scatterSet = this.releasing;
                    for (int size = this.forgetting.size() - 1; -1 < size; size--) {
                        Object obj = this.forgetting.get(size);
                        u1.a(this.abandoning).remove(obj);
                        if (obj instanceof RememberObserver) {
                            ((RememberObserver) obj).onForgotten();
                        }
                        if (obj instanceof ComposeNodeLifecycleCallback) {
                            if (scatterSet != null && scatterSet.contains(obj)) {
                                ((ComposeNodeLifecycleCallback) obj).onRelease();
                            } else {
                                ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                            }
                        }
                    }
                    r2 r2Var = r2.f19517a;
                } finally {
                }
            }
            if (!this.remembering.isEmpty()) {
                beginSection = Trace.INSTANCE.beginSection("Compose:onRemembered");
                try {
                    List<RememberObserver> list = this.remembering;
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        RememberObserver rememberObserver = list.get(i5);
                        this.abandoning.remove(rememberObserver);
                        rememberObserver.onRemembered();
                    }
                    r2 r2Var2 = r2.f19517a;
                } finally {
                }
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
                try {
                    List<v3.a<r2>> list = this.sideEffects;
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        list.get(i5).invoke();
                    }
                    this.sideEffects.clear();
                    r2 r2Var = r2.f19517a;
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(@l RememberObserver rememberObserver) {
            this.forgetting.add(rememberObserver);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void releasing(@l ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
            MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSet = this.releasing;
            if (mutableScatterSet == null) {
                mutableScatterSet = ScatterSetKt.mutableScatterSetOf();
                this.releasing = mutableScatterSet;
            }
            mutableScatterSet.plusAssign((MutableScatterSet<ComposeNodeLifecycleCallback>) composeNodeLifecycleCallback);
            this.forgetting.add(composeNodeLifecycleCallback);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(@l RememberObserver rememberObserver) {
            this.remembering.add(rememberObserver);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(@l v3.a<r2> aVar) {
            this.sideEffects.add(aVar);
        }
    }

    public CompositionImpl(@l CompositionContext compositionContext, @l Applier<?> applier, @m g gVar) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable = new SlotTable();
        this.slotTable = slotTable;
        this.observations = new ScopeMap<>();
        this.conditionallyInvalidatedScopes = new HashSet<>();
        this.derivedStates = new ScopeMap<>();
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = new ScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, hashSet, changeList, changeList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = gVar;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m3239getLambda1$runtime_release();
    }

    private final void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        this.abandonSet.clear();
    }

    private final HashSet<RecomposeScopeImpl> addPendingInvalidationsLocked(HashSet<RecomposeScopeImpl> hashSet, Object obj, boolean z4) {
        HashSet<RecomposeScopeImpl> hashSet2;
        Object obj2 = this.observations.getMap().get(obj);
        if (obj2 != null) {
            if (obj2 instanceof MutableScatterSet) {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    hashSet2 = hashSet;
                    int i5 = 0;
                    while (true) {
                        long j5 = jArr[i5];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j5) < 128) {
                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i5 << 3) + i7];
                                    if (!this.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                                        if (recomposeScopeImpl.isConditional() && !z4) {
                                            this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                                        } else {
                                            if (hashSet2 == null) {
                                                hashSet2 = new HashSet<>();
                                            }
                                            hashSet2.add(recomposeScopeImpl);
                                        }
                                    }
                                }
                                j5 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                    }
                } else {
                    hashSet2 = hashSet;
                }
                return hashSet2;
            }
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj2;
            if (!this.observationsProcessed.remove(obj, recomposeScopeImpl2) && recomposeScopeImpl2.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                if (recomposeScopeImpl2.isConditional() && !z4) {
                    this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
                } else {
                    HashSet<RecomposeScopeImpl> hashSet3 = hashSet == null ? new HashSet<>() : hashSet;
                    hashSet3.add(recomposeScopeImpl2);
                    return hashSet3;
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applyChangesInLocked(androidx.compose.runtime.changelist.ChangeList r32) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.applyChangesInLocked(androidx.compose.runtime.changelist.ChangeList):void");
    }

    private final void cleanUpDerivedStateObservations() {
        long[] jArr;
        boolean z4;
        long[] jArr2;
        int i5;
        int i6;
        long j5;
        int i7;
        boolean z5;
        Object[] objArr;
        boolean z6;
        Object[] objArr2;
        MutableScatterMap<Object, Object> map = this.derivedStates.getMap();
        long[] jArr3 = map.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j6 = jArr3[i8];
                char c5 = 7;
                long j7 = -9187201950435737472L;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & 255) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            int i12 = (i8 << 3) + i11;
                            Object obj = map.keys[i12];
                            Object obj2 = map.values[i12];
                            if (obj2 instanceof MutableScatterSet) {
                                l0.n(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr3 = mutableScatterSet.elements;
                                long[] jArr4 = mutableScatterSet.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                i5 = length;
                                if (length2 >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j8 = jArr4[i13];
                                        i6 = i10;
                                        long[] jArr5 = jArr4;
                                        j5 = -9187201950435737472L;
                                        if ((((~j8) << c5) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j8 & 255) < 128) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (z6) {
                                                    int i16 = (i13 << 3) + i15;
                                                    objArr2 = objArr3;
                                                    if (!this.observations.contains((DerivedState) objArr3[i16])) {
                                                        mutableScatterSet.removeElementAt(i16);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                }
                                                j8 >>= 8;
                                                i15++;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i14 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i13 == length2) {
                                            break;
                                        }
                                        i13++;
                                        c5 = 7;
                                        i10 = i6;
                                        jArr4 = jArr5;
                                        objArr3 = objArr;
                                    }
                                } else {
                                    i6 = i10;
                                    j5 = -9187201950435737472L;
                                }
                                z5 = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr3;
                                i5 = length;
                                i6 = i10;
                                j5 = j7;
                                l0.n(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                if (!this.observations.contains((DerivedState) obj2)) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                            }
                            if (z5) {
                                map.removeValueAt(i12);
                            }
                            i7 = 8;
                        } else {
                            jArr2 = jArr3;
                            i5 = length;
                            i6 = i10;
                            j5 = j7;
                            i7 = i9;
                        }
                        j6 >>= i7;
                        i11++;
                        i9 = i7;
                        j7 = j5;
                        jArr3 = jArr2;
                        length = i5;
                        i10 = i6;
                        c5 = 7;
                    }
                    jArr = jArr3;
                    int i17 = length;
                    if (i10 != i9) {
                        break;
                    } else {
                        length = i17;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                jArr3 = jArr;
            }
        }
        if (!this.conditionallyInvalidatedScopes.isEmpty()) {
            Iterator<RecomposeScopeImpl> it = this.conditionallyInvalidatedScopes.iterator();
            while (it.hasNext()) {
                if (!it.next().isConditional()) {
                    it.remove();
                }
            }
        }
    }

    private final void composeInitial(p<? super Composer, ? super Integer, r2> pVar) {
        if (!this.disposed) {
            this.composable = pVar;
            this.parent.composeInitial$runtime_release(this, pVar);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object obj;
        Object obj2;
        AtomicReference<Object> atomicReference = this.pendingModifications;
        obj = CompositionKt.PendingApplyNoModifications;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = CompositionKt.PendingApplyNoModifications;
            if (!l0.g(andSet, obj2)) {
                if (andSet instanceof Set) {
                    addPendingInvalidationsLocked((Set) andSet, true);
                    return;
                }
                if (andSet instanceof Object[]) {
                    for (Set<? extends Object> set : (Set[]) andSet) {
                        addPendingInvalidationsLocked(set, true);
                    }
                    return;
                }
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new y();
            }
            ComposerKt.composeRuntimeError("pending composition has not been applied");
            throw new y();
        }
    }

    private final void drainPendingModificationsLocked() {
        Object obj;
        Object andSet = this.pendingModifications.getAndSet(null);
        obj = CompositionKt.PendingApplyNoModifications;
        if (!l0.g(andSet, obj)) {
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set<? extends Object> set : (Set[]) andSet) {
                    addPendingInvalidationsLocked(set, false);
                }
                return;
            }
            if (andSet == null) {
                ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new y();
            }
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new y();
        }
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime_release$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime_release$annotations() {
    }

    private final <T> T guardChanges(v3.a<? extends T> aVar) {
        try {
            try {
                T invoke = aVar.invoke();
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                return invoke;
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        } catch (Exception e5) {
            abandonChanges();
            throw e5;
        }
    }

    private final <T> T guardInvalidationsLocked(v3.l<? super IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>>, ? extends T> lVar) {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations = takeInvalidations();
        try {
            return lVar.invoke(takeInvalidations);
        } catch (Exception e5) {
            this.invalidations = takeInvalidations;
            throw e5;
        }
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl recomposeScopeImpl, Anchor anchor, Object obj) {
        synchronized (this.lock) {
            CompositionImpl compositionImpl = this.invalidationDelegate;
            if (compositionImpl == null || !this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                compositionImpl = null;
            }
            if (compositionImpl == null) {
                if (tryImminentInvalidation(recomposeScopeImpl, obj)) {
                    return InvalidationResult.IMMINENT;
                }
                if (obj == null) {
                    this.invalidations.set(recomposeScopeImpl, null);
                } else {
                    CompositionKt.addValue(this.invalidations, recomposeScopeImpl, obj);
                }
            }
            if (compositionImpl != null) {
                return compositionImpl.invalidateChecked(recomposeScopeImpl, anchor, obj);
            }
            this.parent.invalidate$runtime_release(this);
            if (isComposing()) {
                return InvalidationResult.DEFERRED;
            }
            return InvalidationResult.SCHEDULED;
        }
    }

    private final void invalidateScopeOfLocked(Object obj) {
        boolean z4;
        Object obj2 = this.observations.getMap().get(obj);
        if (obj2 != null) {
            if (obj2 instanceof MutableScatterSet) {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j5 = jArr[i5];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j5) < 128) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i5 << 3) + i7];
                                    if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                                        this.observationsProcessed.add(obj, recomposeScopeImpl);
                                    }
                                }
                                j5 >>= 8;
                            }
                            if (i6 != 8) {
                                return;
                            }
                        }
                        if (i5 != length) {
                            i5++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj2;
                if (recomposeScopeImpl2.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.add(obj, recomposeScopeImpl2);
                }
            }
        }
    }

    private final CompositionObserver observer() {
        CompositionObserver compositionObserver;
        CompositionObserverHolder compositionObserverHolder = this.observerHolder;
        if (compositionObserverHolder.getRoot()) {
            return compositionObserverHolder.getObserver();
        }
        CompositionObserverHolder observerHolder$runtime_release = this.parent.getObserverHolder$runtime_release();
        if (observerHolder$runtime_release != null) {
            compositionObserver = observerHolder$runtime_release.getObserver();
        } else {
            compositionObserver = null;
        }
        if (!l0.g(compositionObserver, compositionObserverHolder.getObserver())) {
            compositionObserverHolder.setObserver(compositionObserver);
        }
        return compositionObserver;
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        return identityArrayMap;
    }

    private final <T> T trackAbandonedValues(v3.a<? extends T> aVar) {
        try {
            T invoke = aVar.invoke();
            kotlin.jvm.internal.i0.d(1);
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } catch (Throwable th) {
            kotlin.jvm.internal.i0.d(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            kotlin.jvm.internal.i0.c(1);
            throw th;
        }
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime_release(recomposeScopeImpl, obj);
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        int If;
        RecomposeScopeImpl recomposeScopeImpl;
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            if (obj instanceof RecomposeScopeImpl) {
                recomposeScopeImpl = (RecomposeScopeImpl) obj;
            } else {
                recomposeScopeImpl = null;
            }
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i5);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                If = kotlin.collections.p.If(slotTable.getSlots(), recomposeScopeImpl2);
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + If).toString());
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                r2 r2Var = r2.f19517a;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e5) {
                    abandonChanges();
                    throw e5;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                r2 r2Var = r2.f19517a;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e5) {
                    abandonChanges();
                    throw e5;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                r2 r2Var = r2.f19517a;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e5) {
                    abandonChanges();
                    throw e5;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(@l p<? super Composer, ? super Integer, r2> pVar) {
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations = takeInvalidations();
                try {
                    CompositionObserver observer = observer();
                    if (observer != null) {
                        Map<RecomposeScopeImpl, IdentityArraySet<Object>> asMap = takeInvalidations.asMap();
                        l0.n(asMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        observer.onBeginComposition(this, asMap);
                    }
                    this.composer.composeContent$runtime_release(takeInvalidations, pVar);
                    if (observer != null) {
                        observer.onEndComposition(this);
                        r2 r2Var = r2.f19517a;
                    }
                } catch (Exception e5) {
                    this.invalidations = takeInvalidations;
                    throw e5;
                }
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        boolean z4;
        if (this.slotTable.getGroupsSize() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || (true ^ this.abandonSet.isEmpty())) {
            Trace trace = Trace.INSTANCE;
            Object beginSection = trace.beginSection("Compose:deactivate");
            try {
                RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                if (z4) {
                    this.applier.onBeginChanges();
                    SlotWriter openWriter = this.slotTable.openWriter();
                    try {
                        ComposerKt.deactivateCurrentGroup(openWriter, rememberEventDispatcher);
                        r2 r2Var = r2.f19517a;
                        openWriter.close();
                        this.applier.onEndChanges();
                        rememberEventDispatcher.dispatchRememberObservers();
                    } catch (Throwable th) {
                        openWriter.close();
                        throw th;
                    }
                }
                rememberEventDispatcher.dispatchAbandons();
                r2 r2Var2 = r2.f19517a;
                trace.endSection(beginSection);
            } catch (Throwable th2) {
                Trace.INSTANCE.endSection(beginSection);
                throw th2;
            }
        }
        this.observations.clear();
        this.derivedStates.clear();
        this.invalidations.clear();
        this.changes.clear();
        this.composer.deactivate$runtime_release();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(@m ControlledComposition controlledComposition, int i5, @l v3.a<? extends R> aVar) {
        if (controlledComposition != null && !l0.g(controlledComposition, this) && i5 >= 0) {
            this.invalidationDelegate = (CompositionImpl) controlledComposition;
            this.invalidationDelegateGroup = i5;
            try {
                return aVar.invoke();
            } finally {
                this.invalidationDelegate = null;
                this.invalidationDelegateGroup = 0;
            }
        }
        return aVar.invoke();
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        boolean z4;
        synchronized (this.lock) {
            if (!this.composer.isComposing$runtime_release()) {
                if (!this.disposed) {
                    this.disposed = true;
                    this.composable = ComposableSingletons$CompositionKt.INSTANCE.m3240getLambda2$runtime_release();
                    ChangeList deferredChanges$runtime_release = this.composer.getDeferredChanges$runtime_release();
                    if (deferredChanges$runtime_release != null) {
                        applyChangesInLocked(deferredChanges$runtime_release);
                    }
                    if (this.slotTable.getGroupsSize() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 || (true ^ this.abandonSet.isEmpty())) {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                        if (z4) {
                            this.applier.onBeginChanges();
                            SlotWriter openWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
                                r2 r2Var = r2.f19517a;
                                openWriter.close();
                                this.applier.clear();
                                this.applier.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            } catch (Throwable th) {
                                openWriter.close();
                                throw th;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                    }
                    this.composer.dispose$runtime_release();
                }
                r2 r2Var2 = r2.f19517a;
            } else {
                throw new IllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.".toString());
            }
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(@l MovableContentState movableContentState) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter openWriter = movableContentState.getSlotTable$runtime_release().openWriter();
        try {
            ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
            r2 r2Var = r2.f19517a;
            openWriter.close();
            rememberEventDispatcher.dispatchRememberObservers();
        } catch (Throwable th) {
            openWriter.close();
            throw th;
        }
    }

    @l
    public final p<Composer, Integer, r2> getComposable() {
        return this.composable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionServices
    @m
    public <T> T getCompositionService(@l CompositionServiceKey<T> compositionServiceKey) {
        if (l0.g(compositionServiceKey, CompositionKt.getCompositionImplServiceKey())) {
            return this;
        }
        return null;
    }

    @l
    @p4.p
    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        List<RecomposeScopeImpl> S5;
        S5 = e0.S5(this.conditionallyInvalidatedScopes);
        return S5;
    }

    @l
    @p4.p
    public final Set<Object> getDerivedStateDependencies$runtime_release() {
        return this.derivedStates.getMap().asMap().keySet();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z4;
        synchronized (this.lock) {
            if (this.invalidations.getSize() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    @l
    @p4.p
    public final Set<Object> getObservedObjects$runtime_release() {
        return this.observations.getMap().asMap().keySet();
    }

    @l
    public final CompositionObserverHolder getObserverHolder$runtime_release() {
        return this.observerHolder;
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.pendingInvalidScopes;
    }

    @l
    public final g getRecomposeContext() {
        g gVar = this._recomposeContext;
        return gVar == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : gVar;
    }

    @l
    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(@l List<u0<MovableContentStateReference, MovableContentStateReference>> list) {
        int size = list.size();
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                if (!l0.g(list.get(i5).getFirst().getComposition$runtime_release(), this)) {
                    break;
                } else {
                    i5++;
                }
            } else {
                z4 = true;
                break;
            }
        }
        ComposerKt.runtimeCheck(z4);
        try {
            this.composer.insertMovableContentReferences(list);
            r2 r2Var = r2.f19517a;
        } finally {
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    @l
    public InvalidationResult invalidate(@l RecomposeScopeImpl recomposeScopeImpl, @m Object obj) {
        CompositionImpl compositionImpl;
        boolean z4 = true;
        if (recomposeScopeImpl.getDefaultsInScope()) {
            recomposeScopeImpl.setDefaultsInvalid(true);
        }
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor != null && anchor.getValid()) {
            if (!this.slotTable.ownsAnchor(anchor)) {
                synchronized (this.lock) {
                    compositionImpl = this.invalidationDelegate;
                }
                if (compositionImpl == null || !compositionImpl.tryImminentInvalidation(recomposeScopeImpl, obj)) {
                    z4 = false;
                }
                if (z4) {
                    return InvalidationResult.IMMINENT;
                }
                return InvalidationResult.IGNORED;
            }
            if (!recomposeScopeImpl.getCanRecompose()) {
                return InvalidationResult.IGNORED;
            }
            return invalidateChecked(recomposeScopeImpl, anchor, obj);
        }
        return InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        RecomposeScopeImpl recomposeScopeImpl;
        synchronized (this.lock) {
            for (Object obj : this.slotTable.getSlots()) {
                if (obj instanceof RecomposeScopeImpl) {
                    recomposeScopeImpl = (RecomposeScopeImpl) obj;
                } else {
                    recomposeScopeImpl = null;
                }
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            r2 r2Var = r2.f19517a;
        }
    }

    public final void invalidateGroupsWithKey(int i5) {
        List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release;
        boolean z4;
        boolean z5;
        synchronized (this.lock) {
            invalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(i5);
        }
        boolean z6 = true;
        if (invalidateGroupsWithKey$runtime_release != null) {
            int size = invalidateGroupsWithKey$runtime_release.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    if (invalidateGroupsWithKey$runtime_release.get(i6).invalidateForResult(null) == InvalidationResult.IGNORED) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        z4 = true;
                        break;
                    }
                    i6++;
                } else {
                    z4 = false;
                    break;
                }
            }
            if (!z4) {
                z6 = false;
            }
        }
        if (z6 && this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.isComposing$runtime_release();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.disposed;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    @l
    public final CompositionObserverHandle observe$runtime_release(@l final CompositionObserver compositionObserver) {
        synchronized (this.lock) {
            this.observerHolder.setObserver(compositionObserver);
            this.observerHolder.setRoot(true);
            r2 r2Var = r2.f19517a;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj;
                obj = CompositionImpl.this.lock;
                CompositionImpl compositionImpl = CompositionImpl.this;
                CompositionObserver compositionObserver2 = compositionObserver;
                synchronized (obj) {
                    if (l0.g(compositionImpl.getObserverHolder$runtime_release().getObserver(), compositionObserver2)) {
                        compositionImpl.getObserverHolder$runtime_release().setObserver(null);
                        compositionImpl.getObserverHolder$runtime_release().setRoot(false);
                    }
                    r2 r2Var2 = r2.f19517a;
                }
            }
        };
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(@l Set<? extends Object> set) {
        if (set instanceof IdentityArraySet) {
            IdentityArraySet identityArraySet = (IdentityArraySet) set;
            Object[] values = identityArraySet.getValues();
            int size = identityArraySet.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = values[i5];
                l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (this.observations.contains(obj) || this.derivedStates.contains(obj)) {
                    return true;
                }
            }
            return false;
        }
        for (Object obj2 : set) {
            if (this.observations.contains(obj2) || this.derivedStates.contains(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@l v3.a<r2> aVar) {
        this.composer.prepareCompose$runtime_release(aVar);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean recompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            try {
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations = takeInvalidations();
                try {
                    CompositionObserver observer = observer();
                    if (observer != null) {
                        Map<RecomposeScopeImpl, IdentityArraySet<Object>> asMap = takeInvalidations.asMap();
                        l0.n(asMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        observer.onBeginComposition(this, asMap);
                    }
                    recompose$runtime_release = this.composer.recompose$runtime_release(takeInvalidations);
                    if (!recompose$runtime_release) {
                        drainPendingModificationsLocked();
                    }
                    if (observer != null) {
                        observer.onEndComposition(this);
                    }
                } catch (Exception e5) {
                    this.invalidations = takeInvalidations;
                    throw e5;
                }
            } finally {
            }
        }
        return recompose$runtime_release;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(@l RecomposeScopeImpl recomposeScopeImpl) {
        this.pendingInvalidScopes = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@l Set<? extends Object> set) {
        Object obj;
        Object obj2;
        boolean g5;
        ?? w32;
        Set<? extends Object> set2;
        do {
            obj = this.pendingModifications.get();
            if (obj == null) {
                g5 = true;
            } else {
                obj2 = CompositionKt.PendingApplyNoModifications;
                g5 = l0.g(obj, obj2);
            }
            if (g5) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{obj, set};
            } else if (obj instanceof Object[]) {
                l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                w32 = o.w3((Set[]) obj, set);
                set2 = w32;
            } else {
                throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
            }
        } while (!h.a(this.pendingModifications, obj, set2));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                r2 r2Var = r2.f19517a;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(@l Object obj) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        boolean z4;
        if (!getAreChildrenComposing() && (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) != null) {
            currentRecomposeScope$runtime_release.setUsed(true);
            if (!currentRecomposeScope$runtime_release.recordRead(obj)) {
                if (obj instanceof StateObjectImpl) {
                    ReaderKind.Companion companion = ReaderKind.Companion;
                    ((StateObjectImpl) obj).m3369recordReadInh_f27i8$runtime_release(ReaderKind.m3356constructorimpl(1));
                }
                this.observations.add(obj, currentRecomposeScope$runtime_release);
                if (obj instanceof DerivedState) {
                    this.derivedStates.removeScope(obj);
                    ObjectIntMap<StateObject> dependencies = ((DerivedState) obj).getCurrentRecord().getDependencies();
                    Object[] objArr = dependencies.keys;
                    long[] jArr = dependencies.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j5 = jArr[i5];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((255 & j5) < 128) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        StateObject stateObject = (StateObject) objArr[(i5 << 3) + i7];
                                        if (stateObject instanceof StateObjectImpl) {
                                            ReaderKind.Companion companion2 = ReaderKind.Companion;
                                            ((StateObjectImpl) stateObject).m3369recordReadInh_f27i8$runtime_release(ReaderKind.m3356constructorimpl(1));
                                        }
                                        this.derivedStates.add(stateObject, obj);
                                    }
                                    j5 >>= 8;
                                }
                                if (i6 != 8) {
                                    return;
                                }
                            }
                            if (i5 != length) {
                                i5++;
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(@l Object obj) {
        boolean z4;
        synchronized (this.lock) {
            invalidateScopeOfLocked(obj);
            Object obj2 = this.derivedStates.getMap().get(obj);
            if (obj2 != null) {
                if (obj2 instanceof MutableScatterSet) {
                    MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                    Object[] objArr = mutableScatterSet.elements;
                    long[] jArr = mutableScatterSet.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j5 = jArr[i5];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((255 & j5) < 128) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        invalidateScopeOfLocked((DerivedState) objArr[(i5 << 3) + i7]);
                                    }
                                    j5 >>= 8;
                                }
                                if (i6 != 8) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                } else {
                    invalidateScopeOfLocked((DerivedState) obj2);
                }
            }
            r2 r2Var = r2.f19517a;
        }
    }

    public final void removeDerivedStateObservation$runtime_release(@l DerivedState<?> derivedState) {
        if (!this.observations.contains(derivedState)) {
            this.derivedStates.removeScope(derivedState);
        }
    }

    public final void removeObservation$runtime_release(@l Object obj, @l RecomposeScopeImpl recomposeScopeImpl) {
        this.observations.remove(obj, recomposeScopeImpl);
    }

    public final void setComposable(@l p<? super Composer, ? super Integer, r2> pVar) {
        this.composable = pVar;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@l p<? super Composer, ? super Integer, r2> pVar) {
        composeInitial(pVar);
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(@l p<? super Composer, ? super Integer, r2> pVar) {
        this.composer.startReuseFromRoot();
        composeInitial(pVar);
        this.composer.endReuseFromRoot();
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z4) {
        this.pendingInvalidScopes = z4;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime_release();
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            r2 r2Var = r2.f19517a;
        }
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, g gVar, int i5, w wVar) {
        this(compositionContext, applier, (i5 & 4) != 0 ? null : gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0218 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.addPendingInvalidationsLocked(java.util.Set, boolean):void");
    }
}
