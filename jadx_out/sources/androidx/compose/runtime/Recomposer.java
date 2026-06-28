package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.navigation.compose.ComposeNavigator;
import com.bytedance.android.live.base.api.push.ILivePush;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.b1;
import kotlin.collections.x;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.c;
import kotlin.coroutines.jvm.internal.h;
import kotlin.d1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.v0;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q;
import kotlinx.coroutines.s0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 Ñ\u00012\u00020\u0001:\nÑ\u0001Ò\u0001Ó\u0001Ô\u0001Õ\u0001B\u0012\u0012\u0007\u0010¤\u0001\u001a\u00020A¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u001d\u0010\u0006\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0082\bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J*\u0010\u0012\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003H\u0082@¢\u0006\u0004\b \u0010!JN\u0010*\u001a\u00020\u00032<\u0010)\u001a8\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030&\u0012\u0006\u0012\u0004\u0018\u00010'0\"¢\u0006\u0002\b(H\u0082@¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0002J\"\u0010/\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\b2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010-H\u0002J,\u00103\u001a\b\u0012\u0004\u0012\u00020\b002\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010-H\u0002J\b\u00104\u001a\u00020\u0003H\u0002J\u001c\u00105\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0014\u001a\u00020\bH\u0002J,\u00106\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0014\u001a\u00020\b2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010-H\u0002J<\u00109\u001a\u00028\u0000\"\u0004\b\u0000\u001072\u0006\u0010\u0014\u001a\u00020\b2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010-2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u000008H\u0082\b¢\u0006\u0004\b9\u0010:J\u0010\u0010=\u001a\u00020\u00032\u0006\u0010<\u001a\u00020;H\u0002J\u0006\u0010?\u001a\u00020>J\u0010\u0010@\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b@\u0010!J\u0018\u0010C\u001a\u00020\u00032\u0006\u0010B\u001a\u00020AH\u0087@¢\u0006\u0004\bC\u0010DJ\u0006\u0010E\u001a\u00020\u0003J\u0006\u0010F\u001a\u00020\u0003J\u0010\u0010G\u001a\u00020\u0003H\u0086@¢\u0006\u0004\bG\u0010!J*\u0010L\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\b2\u0011\u0010I\u001a\r\u0012\u0004\u0012\u00020\u000308¢\u0006\u0002\bHH\u0010¢\u0006\u0004\bJ\u0010KJ\u0010\u0010M\u001a\u00020\u0003H\u0086@¢\u0006\u0004\bM\u0010!J\u0006\u0010N\u001a\u00020\u0003J\u0006\u0010O\u001a\u00020\u0003J\u001d\u0010U\u001a\u00020\u00032\f\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0PH\u0010¢\u0006\u0004\bS\u0010TJ\u0017\u0010X\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0010¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0010¢\u0006\u0004\bY\u0010WJ\u0017\u0010\\\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0010¢\u0006\u0004\b[\u0010WJ\u0017\u0010a\u001a\u00020\u00032\u0006\u0010^\u001a\u00020]H\u0010¢\u0006\u0004\b_\u0010`J\u0017\u0010e\u001a\u00020\u00032\u0006\u0010b\u001a\u000201H\u0010¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\u00032\u0006\u0010b\u001a\u000201H\u0010¢\u0006\u0004\bf\u0010dJ\u001f\u0010l\u001a\u00020\u00032\u0006\u0010b\u001a\u0002012\u0006\u0010i\u001a\u00020hH\u0010¢\u0006\u0004\bj\u0010kJ\u0017\u0010n\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0010¢\u0006\u0004\bm\u0010WJ\u0019\u0010q\u001a\u0004\u0018\u00010h2\u0006\u0010b\u001a\u000201H\u0010¢\u0006\u0004\bo\u0010pR$\u0010t\u001a\u00020r2\u0006\u0010s\u001a\u00020r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010{\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010}\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\b0\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R!\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0084\u0001R\u001f\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020'0-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\b0\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0084\u0001R\u001e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\b0\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0084\u0001R\u001e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u0002010\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0084\u0001R4\u0010\u008d\u0001\u001a\u001f\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010'0\u008c\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002010\u0082\u00010\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R$\u0010\u008f\u0001\u001a\u000f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020h0\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001R\"\u0010\u0090\u0001\u001a\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0084\u0001R!\u0010\u0091\u0001\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010\u0093\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0099\u0001R\u001f\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030\u009e\u00010\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001f\u0010¤\u0001\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u001c\u0010©\u0001\u001a\u00070¨\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001d\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020\b008BX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0017\u0010°\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0017\u0010²\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010¯\u0001R\u0017\u0010´\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010¯\u0001R\u0017\u0010¶\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¯\u0001R\u0017\u0010¸\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¯\u0001R\u0017\u0010º\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010¯\u0001R\u0016\u0010B\u001a\u00020A8PX\u0090\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010§\u0001R'\u0010Á\u0001\u001a\n\u0012\u0005\u0012\u00030\u009e\u00010¼\u00018FX\u0087\u0004¢\u0006\u0010\u0012\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R\u001c\u0010Å\u0001\u001a\n\u0012\u0005\u0012\u00030\u009e\u00010Â\u00018F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0014\u0010Ç\u0001\u001a\u00020\u00058F¢\u0006\b\u001a\u0006\bÆ\u0001\u0010¯\u0001R\u0018\u0010Ê\u0001\u001a\u00030\u0095\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0017\u0010Ì\u0001\u001a\u00020\u00058PX\u0090\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010¯\u0001R\u0017\u0010Î\u0001\u001a\u00020\u00058PX\u0090\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010¯\u0001¨\u0006Ö\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Lkotlinx/coroutines/p;", "Lkotlin/r2;", "deriveStateLocked", "", "recordComposerModifications", "Lkotlin/Function1;", "Landroidx/compose/runtime/ControlledComposition;", "onEachInvalidComposition", "Lkotlinx/coroutines/l2;", "callingJob", "registerRunnerJob", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failedInitialComposition", "recoverable", "processCompositionError", "clearKnownCompositionsLocked", "composition", "removeKnownCompositionLocked", "addKnownCompositionLocked", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "resetErrorState", "retryFailedCompositions", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Landroidx/compose/runtime/ProduceFrameSignal;", "frameSignal", "runFrameLoop", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/d;)Ljava/lang/Object;", "awaitWorkAvailable", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/s0;", "Lkotlin/v0;", "name", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "recompositionRunner", "(Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "performInitialMovableContentInserts", "Landroidx/compose/runtime/collection/IdentityArraySet;", "modifiedValues", "performRecompose", "", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "performInsertValues", "discardUnusedValues", "readObserverOf", "writeObserverOf", "T", "Lkotlin/Function0;", "composing", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;Lv3/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshot", "applyAndCheck", "Landroidx/compose/runtime/RecomposerInfo;", "asRecomposerInfo", "runRecomposeAndApplyChanges", "Lkotlin/coroutines/g;", "recomposeCoroutineContext", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "cancel", ILivePush.ClickType.CLOSE, "join", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lv3/p;)V", "composeInitial", "awaitIdle", "pauseCompositionFrameClock", "resumeCompositionFrameClock", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "registerComposition$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "invalidate$runtime_release", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", "reference", "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V", "movableContentStateReleased", "reportRemovedComposition$runtime_release", "reportRemovedComposition", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "", "<set-?>", "changeCount", "J", "getChangeCount", "()J", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "stateLock", "Ljava/lang/Object;", "runnerJob", "Lkotlinx/coroutines/l2;", "", "closeCause", "Ljava/lang/Throwable;", "", "_knownCompositions", "Ljava/util/List;", "_knownCompositionsCache", "snapshotInvalidations", "Landroidx/compose/runtime/collection/IdentityArraySet;", "compositionInvalidations", "compositionsAwaitingApply", "compositionValuesAwaitingInsert", "", "Landroidx/compose/runtime/MovableContent;", "compositionValuesRemoved", "Ljava/util/Map;", "compositionValueStatesAvailable", "failedCompositions", "compositionsRemoved", "Ljava/util/Set;", "workContinuation", "Lkotlinx/coroutines/p;", "", "concurrentCompositionsOutstanding", "I", "isClosed", "Z", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "frameClockPaused", "Lkotlinx/coroutines/flow/e0;", "Landroidx/compose/runtime/Recomposer$State;", "_state", "Lkotlinx/coroutines/flow/e0;", "Lkotlinx/coroutines/b0;", "effectJob", "Lkotlinx/coroutines/b0;", "effectCoroutineContext", "Lkotlin/coroutines/g;", "getEffectCoroutineContext", "()Lkotlin/coroutines/g;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "getKnownCompositions", "()Ljava/util/List;", "knownCompositions", "getHasBroadcastFrameClockAwaitersLocked", "()Z", "hasBroadcastFrameClockAwaitersLocked", "getHasBroadcastFrameClockAwaiters", "hasBroadcastFrameClockAwaiters", "getShouldKeepRecomposing", "shouldKeepRecomposing", "getHasSchedulingWork", "hasSchedulingWork", "getHasFrameWorkLocked", "hasFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasConcurrentFrameWorkLocked", "getRecomposeCoroutineContext$runtime_release", "Lkotlinx/coroutines/flow/i;", "getState", "()Lkotlinx/coroutines/flow/i;", "getState$annotations", "()V", "state", "Lkotlinx/coroutines/flow/t0;", "getCurrentState", "()Lkotlinx/coroutines/flow/t0;", "currentState", "getHasPendingWork", "hasPendingWork", "getCompoundHashKey$runtime_release", "()I", "compoundHashKey", "getCollectingParameterInformation$runtime_release", "collectingParameterInformation", "getCollectingSourceInformation$runtime_release", "collectingSourceInformation", "<init>", "(Lkotlin/coroutines/g;)V", "Companion", "HotReloadable", "RecomposerErrorState", "RecomposerInfoImpl", "State", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1564:1\n1220#1,5:1613\n1226#1:1623\n1220#1,5:1636\n1226#1:1646\n1220#1,5:1667\n1226#1:1688\n82#2:1565\n82#2:1566\n82#2:1569\n82#2:1571\n82#2:1578\n82#2:1579\n82#2:1592\n82#2:1593\n82#2:1594\n82#2:1595\n82#2:1596\n82#2:1597\n82#2:1598\n82#2:1608\n82#2:1611\n82#2:1612\n82#2:1624\n82#2:1625\n82#2:1675\n82#2:1689\n82#2:1712\n82#2:1713\n82#2:1714\n82#2:1715\n82#2:1716\n82#2:1717\n82#2:1718\n82#2:1719\n82#2:1720\n82#2:1721\n82#2:1722\n82#2:1723\n1229#3,2:1567\n1#4:1570\n33#5,6:1572\n33#5,6:1580\n33#5,6:1586\n93#5,2:1626\n33#5,4:1628\n95#5,2:1632\n38#5:1634\n97#5:1635\n120#5,3:1647\n33#5,4:1650\n123#5,2:1654\n125#5,2:1663\n38#5:1665\n127#5:1666\n82#5,3:1676\n33#5,4:1679\n85#5,2:1683\n38#5:1685\n87#5:1686\n82#5,3:1690\n33#5,4:1693\n85#5,2:1697\n38#5:1699\n87#5:1700\n33#5,6:1701\n314#6,9:1599\n323#6,2:1609\n129#7,5:1618\n129#7,5:1641\n129#7,3:1672\n133#7:1687\n129#7,5:1707\n361#8,7:1656\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1070#1:1613,5\n1070#1:1623\n1147#1:1636,5\n1147#1:1646\n1167#1:1667,5\n1167#1:1688\n292#1:1565\n342#1:1566\n436#1:1569\n440#1:1571\n461#1:1578\n466#1:1579\n492#1:1592\n705#1:1593\n743#1:1594\n774#1:1595\n786#1:1596\n803#1:1597\n939#1:1598\n951#1:1608\n1035#1:1611\n1051#1:1612\n1083#1:1624\n1114#1:1625\n1170#1:1675\n1183#1:1689\n1250#1:1712\n1287#1:1713\n1302#1:1714\n1331#1:1715\n1339#1:1716\n1348#1:1717\n1355#1:1718\n1362#1:1719\n1371#1:1720\n1377#1:1721\n1389#1:1722\n1120#1:1723\n343#1:1567,2\n446#1:1572,6\n479#1:1580,6\n484#1:1586,6\n1115#1:1626,2\n1115#1:1628,4\n1115#1:1632,2\n1115#1:1634\n1115#1:1635\n1164#1:1647,3\n1164#1:1650,4\n1164#1:1654,2\n1164#1:1663,2\n1164#1:1665\n1164#1:1666\n1171#1:1676,3\n1171#1:1679,4\n1171#1:1683,2\n1171#1:1685\n1171#1:1686\n1187#1:1690,3\n1187#1:1693,4\n1187#1:1697,2\n1187#1:1699\n1187#1:1700\n1194#1:1701,6\n950#1:1599,9\n950#1:1609,2\n1070#1:1618,5\n1147#1:1641,5\n1167#1:1672,3\n1167#1:1687\n1224#1:1707,5\n1164#1:1656,7\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer extends CompositionContext {

    @l
    private final List<ControlledComposition> _knownCompositions;

    @m
    private List<? extends ControlledComposition> _knownCompositionsCache;

    @l
    private final e0<State> _state;

    @l
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;

    @m
    private Throwable closeCause;

    @l
    private final List<ControlledComposition> compositionInvalidations;

    @l
    private final Map<MovableContentStateReference, MovableContentState> compositionValueStatesAvailable;

    @l
    private final List<MovableContentStateReference> compositionValuesAwaitingInsert;

    @l
    private final Map<MovableContent<Object>, List<MovableContentStateReference>> compositionValuesRemoved;

    @l
    private final List<ControlledComposition> compositionsAwaitingApply;

    @m
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;

    @l
    private final g effectCoroutineContext;

    @l
    private final b0 effectJob;

    @m
    private RecomposerErrorState errorState;

    @m
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;

    @l
    private final RecomposerInfoImpl recomposerInfo;

    @m
    private l2 runnerJob;

    @l
    private IdentityArraySet<Object> snapshotInvalidations;

    @l
    private final Object stateLock;

    @m
    private p<? super r2> workContinuation;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final e0<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = v0.a(ExtensionsKt.persistentSetOf());

    @l
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    @i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u0010\u001fJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002J\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!8F¢\u0006\u0006\u001a\u0004\b$\u0010%R4\u0010*\u001a\"\u0012\f\u0012\n (*\u0004\u0018\u00010\b0\b0'j\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010\b0\b`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010.\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002R\u00020\u00030-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "info", "Lkotlin/r2;", "addRunning", "removeRunning", "", b.f22420d, "setHotReloadEnabled$runtime_release", "(Z)V", "setHotReloadEnabled", "saveStateAndDisposeForHotReload$runtime_release", "()Ljava/lang/Object;", "saveStateAndDisposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime_release", "(Ljava/lang/Object;)V", "loadStateAndComposeForHotReload", "", DatabaseFileArchive.COLUMN_KEY, "invalidateGroupsWithKey$runtime_release", "(I)V", "invalidateGroupsWithKey", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "()Ljava/util/List;", "getCurrentErrors", "clearErrors$runtime_release", "()V", "clearErrors", "Lkotlinx/coroutines/flow/t0;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/t0;", "runningRecomposers", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/flow/e0;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "_runningRecomposers", "Lkotlinx/coroutines/flow/e0;", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1564:1\n1360#2:1565\n1446#2,5:1566\n1855#2,2:1571\n1855#2,2:1585\n1855#2,2:1587\n1603#2,9:1589\n1855#2:1598\n1856#2:1600\n1612#2:1601\n1603#2,9:1602\n1855#2:1611\n1856#2:1613\n1612#2:1614\n33#3,6:1573\n33#3,6:1579\n1#4:1599\n1#4:1612\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1440#1:1565\n1440#1:1566,5\n1448#1:1571,2\n1457#1:1585,2\n1464#1:1587,2\n1478#1:1589,9\n1478#1:1598\n1478#1:1600\n1478#1:1601\n1483#1:1602,9\n1483#1:1611\n1483#1:1613\n1483#1:1614\n1454#1:1573,6\n1455#1:1579,6\n1478#1:1599\n1483#1:1612\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet add;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                add = persistentSet.add((PersistentSet) recomposerInfoImpl);
                if (persistentSet == add) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(persistentSet, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet remove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                remove = persistentSet.remove((PersistentSet) recomposerInfoImpl);
                if (persistentSet == remove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(persistentSet, remove));
        }

        public final void clearErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorState resetErrorState = ((RecomposerInfoImpl) it.next()).resetErrorState();
                if (resetErrorState != null) {
                    arrayList.add(resetErrorState);
                }
            }
        }

        @l
        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInfo currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        @l
        public final t0<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void invalidateGroupsWithKey$runtime_release(int i5) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                boolean z4 = false;
                if (currentError != null && !currentError.getRecoverable()) {
                    z4 = true;
                }
                if (!z4) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(i5);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime_release(@l Object obj) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterator it = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).resetErrorState();
            }
            l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) obj;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((HotReloadable) list.get(i5)).resetContent();
            }
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((HotReloadable) list.get(i6)).recompose();
            }
            Iterator it2 = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it2.hasNext()) {
                ((RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        @l
        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                kotlin.collections.b0.n0(arrayList, ((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime_release(boolean z4) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(z4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR!\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0002\b\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "Lkotlin/r2;", "clearContent", "resetContent", "recompose", "Landroidx/compose/runtime/CompositionImpl;", "composition", "Landroidx/compose/runtime/CompositionImpl;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", ComposeNavigator.NAME, "Lv3/p;", "<init>", "(Landroidx/compose/runtime/CompositionImpl;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class HotReloadable {

        @l
        private v3.p<? super Composer, ? super Integer, r2> composable;

        @l
        private final CompositionImpl composition;

        public HotReloadable(@l CompositionImpl compositionImpl) {
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.isRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m3241getLambda1$runtime_release());
            }
        }

        public final void recompose() {
            if (this.composition.isRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "recoverable", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(ZLjava/lang/Exception;)V", "getCause", "()Ljava/lang/Exception;", "getRecoverable", "()Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class RecomposerErrorState implements RecomposerErrorInfo {

        @l
        private final Exception cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z4, @l Exception exc) {
            this.recoverable = z4;
            this.cause = exc;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        @l
        public Exception getCause() {
            return this.cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.recoverable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/r2;", "invalidateGroupsWithKey", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "saveStateAndDisposeForHotReload", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "resetErrorState", "retryFailedCompositions", "Lkotlinx/coroutines/flow/i;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/i;", "state", "", "getHasPendingWork", "()Z", "hasPendingWork", "", "getChangeCount", "()J", "changeCount", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentError", "()Landroidx/compose/runtime/RecomposerErrorInfo;", "currentError", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1564:1\n82#2:1565\n82#2:1566\n82#2:1585\n211#3,3:1567\n33#3,4:1570\n214#3:1574\n215#3:1576\n38#3:1577\n216#3:1578\n33#3,6:1579\n211#3,3:1586\n33#3,4:1589\n214#3:1593\n215#3:1595\n38#3:1596\n216#3:1597\n82#3,3:1598\n33#3,4:1601\n85#3:1605\n86#3:1607\n38#3:1608\n87#3:1609\n1#4:1575\n1#4:1594\n1#4:1606\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n368#1:1565\n373#1:1566\n381#1:1585\n377#1:1567,3\n377#1:1570,4\n377#1:1574\n377#1:1576\n377#1:1577\n377#1:1578\n378#1:1579,6\n385#1:1586,3\n385#1:1589,4\n385#1:1593\n385#1:1595\n385#1:1596\n385#1:1597\n386#1:1598,3\n386#1:1601,4\n386#1:1605\n386#1:1607\n386#1:1608\n386#1:1609\n377#1:1575\n385#1:1594\n*E\n"})
    /* loaded from: classes.dex */
    public final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        @m
        public final RecomposerErrorInfo getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = recomposer.errorState;
            }
            return recomposerErrorState;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        @l
        public i<State> getState() {
            return Recomposer.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int i5) {
            List knownCompositions;
            CompositionImpl compositionImpl;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i6 = 0; i6 < size; i6++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i6);
                if (controlledComposition instanceof CompositionImpl) {
                    compositionImpl = (CompositionImpl) controlledComposition;
                } else {
                    compositionImpl = null;
                }
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ((CompositionImpl) arrayList.get(i7)).invalidateGroupsWithKey(i5);
            }
        }

        @m
        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }

        @l
        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List knownCompositions;
            CompositionImpl compositionImpl;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i5 = 0; i5 < size; i5++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i5);
                if (controlledComposition instanceof CompositionImpl) {
                    compositionImpl = (CompositionImpl) controlledComposition;
                } else {
                    compositionImpl = null;
                }
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList.get(i6));
                hotReloadable.clearContent();
                arrayList2.add(hotReloadable);
            }
            return arrayList2;
        }
    }

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    public Recomposer(@l g gVar) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1(this));
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new IdentityArraySet<>();
        this.compositionInvalidations = new ArrayList();
        this.compositionsAwaitingApply = new ArrayList();
        this.compositionValuesAwaitingInsert = new ArrayList();
        this.compositionValuesRemoved = new LinkedHashMap();
        this.compositionValueStatesAvailable = new LinkedHashMap();
        this._state = v0.a(State.Inactive);
        b0 a5 = p2.a((l2) gVar.get(l2.U));
        a5.t0(new Recomposer$effectJob$1$1(this));
        this.effectJob = a5;
        this.effectCoroutineContext = gVar.plus(broadcastFrameClock).plus(a5);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final void addKnownCompositionLocked(ControlledComposition controlledComposition) {
        this._knownCompositions.add(controlledComposition);
        this._knownCompositionsCache = null;
    }

    private final void applyAndCheck(MutableSnapshot mutableSnapshot) {
        try {
            if (!(mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure)) {
            } else {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            mutableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(d<? super r2> dVar) {
        d e5;
        q qVar;
        Object l5;
        Object l6;
        if (!getHasSchedulingWork()) {
            e5 = c.e(dVar);
            q qVar2 = new q(e5, 1);
            qVar2.B();
            synchronized (this.stateLock) {
                if (getHasSchedulingWork()) {
                    qVar = qVar2;
                } else {
                    this.workContinuation = qVar2;
                    qVar = null;
                }
            }
            if (qVar != null) {
                d1.a aVar = d1.Companion;
                qVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
            }
            Object E = qVar2.E();
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (E == l5) {
                h.c(dVar);
            }
            l6 = kotlin.coroutines.intrinsics.d.l();
            if (E == l6) {
                return E;
            }
            return r2.f19517a;
        }
        return r2.f19517a;
    }

    private final void clearKnownCompositionsLocked() {
        List<? extends ControlledComposition> E;
        this._knownCompositions.clear();
        E = kotlin.collections.w.E();
        this._knownCompositionsCache = E;
    }

    private final <T> T composing(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet, v3.a<? extends T> aVar) {
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            try {
                return aVar.invoke();
            } finally {
                kotlin.jvm.internal.i0.d(1);
                takeMutableSnapshot.restoreCurrent(makeCurrent);
                kotlin.jvm.internal.i0.c(1);
            }
        } finally {
            kotlin.jvm.internal.i0.d(1);
            applyAndCheck(takeMutableSnapshot);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p<r2> deriveStateLocked() {
        State state;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new IdentityArraySet<>();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            p<? super r2> pVar = this.workContinuation;
            if (pVar != null) {
                p.a.a(pVar, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new IdentityArraySet<>();
            this.compositionInvalidations.clear();
            if (getHasBroadcastFrameClockAwaitersLocked()) {
                state = State.InactivePendingWork;
            } else {
                state = State.Inactive;
            }
        } else if (!(!this.compositionInvalidations.isEmpty()) && !this.snapshotInvalidations.isNotEmpty() && !(!this.compositionsAwaitingApply.isEmpty()) && !(!this.compositionValuesAwaitingInsert.isEmpty()) && this.concurrentCompositionsOutstanding <= 0 && !getHasBroadcastFrameClockAwaitersLocked()) {
            state = State.Idle;
        } else {
            state = State.PendingWork;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        p pVar2 = this.workContinuation;
        this.workContinuation = null;
        return pVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedValues() {
        int i5;
        List E;
        List a02;
        synchronized (this.stateLock) {
            if (!this.compositionValuesRemoved.isEmpty()) {
                a02 = x.a0(this.compositionValuesRemoved.values());
                this.compositionValuesRemoved.clear();
                E = new ArrayList(a02.size());
                int size = a02.size();
                for (int i6 = 0; i6 < size; i6++) {
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) a02.get(i6);
                    E.add(q1.a(movableContentStateReference, this.compositionValueStatesAvailable.get(movableContentStateReference)));
                }
                this.compositionValueStatesAvailable.clear();
            } else {
                E = kotlin.collections.w.E();
            }
        }
        int size2 = E.size();
        for (i5 = 0; i5 < size2; i5++) {
            u0 u0Var = (u0) E.get(i5);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) u0Var.component1();
            MovableContentState movableContentState = (MovableContentState) u0Var.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition$runtime_release().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        return (this.compositionsAwaitingApply.isEmpty() ^ true) || getHasBroadcastFrameClockAwaitersLocked();
    }

    private final boolean getHasFrameWorkLocked() {
        return (this.compositionInvalidations.isEmpty() ^ true) || getHasBroadcastFrameClockAwaitersLocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z4;
        synchronized (this.stateLock) {
            z4 = true;
            if (!this.snapshotInvalidations.isNotEmpty() && !(!this.compositionInvalidations.isEmpty())) {
                if (!getHasBroadcastFrameClockAwaitersLocked()) {
                    z4 = false;
                }
            }
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<ControlledComposition> getKnownCompositions() {
        List arrayList;
        List E;
        List list = this._knownCompositionsCache;
        List list2 = list;
        if (list == null) {
            List<ControlledComposition> list3 = this._knownCompositions;
            if (list3.isEmpty()) {
                E = kotlin.collections.w.E();
                arrayList = E;
            } else {
                arrayList = new ArrayList(list3);
            }
            this._knownCompositionsCache = arrayList;
            list2 = arrayList;
        }
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z4;
        boolean z5;
        synchronized (this.stateLock) {
            z4 = !this.isClosed;
        }
        if (z4) {
            return true;
        }
        Iterator<l2> it = this.effectJob.o().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().isActive()) {
                    z5 = true;
                    break;
                }
            } else {
                z5 = false;
                break;
            }
        }
        if (z5) {
            return true;
        }
        return false;
    }

    @k(message = "Replaced by currentState as a StateFlow", replaceWith = @b1(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    private final void performInitialMovableContentInserts(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            boolean z4 = false;
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                if (l0.g(list.get(i5).getComposition$runtime_release(), controlledComposition)) {
                    z4 = true;
                    break;
                }
                i5++;
            }
            if (!z4) {
                return;
            }
            r2 r2Var = r2.f19517a;
            ArrayList arrayList = new ArrayList();
            performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
            while (!arrayList.isEmpty()) {
                performInsertValues(arrayList, null);
                performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            Iterator<MovableContentStateReference> it = recomposer.compositionValuesAwaitingInsert.iterator();
            while (it.hasNext()) {
                MovableContentStateReference next = it.next();
                if (l0.g(next.getComposition$runtime_release(), controlledComposition)) {
                    list.add(next);
                    it.remove();
                }
            }
            r2 r2Var = r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> performInsertValues(List<MovableContentStateReference> list, IdentityArraySet<Object> identityArraySet) {
        List<ControlledComposition> S5;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            MovableContentStateReference movableContentStateReference = list.get(i5);
            ControlledComposition composition$runtime_release = movableContentStateReference.getComposition$runtime_release();
            Object obj = hashMap.get(composition$runtime_release);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(composition$runtime_release, obj);
            }
            ((ArrayList) obj).add(movableContentStateReference);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.runtimeCheck(!controlledComposition.isComposing());
            MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
            try {
                Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                try {
                    synchronized (this.stateLock) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) list2.get(i6);
                            arrayList.add(q1.a(movableContentStateReference2, RecomposerKt.removeLastMultiValue(this.compositionValuesRemoved, movableContentStateReference2.getContent$runtime_release())));
                        }
                    }
                    controlledComposition.insertMovableContent(arrayList);
                    r2 r2Var = r2.f19517a;
                } finally {
                }
            } finally {
                applyAndCheck(takeMutableSnapshot);
            }
        }
        S5 = kotlin.collections.e0.S5(hashMap.keySet());
        return S5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:32:0x0033, B:17:0x003f, B:18:0x0047), top: B:31:0x0033, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.ControlledComposition performRecompose(androidx.compose.runtime.ControlledComposition r7, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r7.isComposing()
            r1 = 0
            if (r0 != 0) goto L5f
            boolean r0 = r7.isDisposed()
            if (r0 != 0) goto L5f
            java.util.Set<androidx.compose.runtime.ControlledComposition> r0 = r6.compositionsRemoved
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1b
            boolean r0 = r0.contains(r7)
            if (r0 != r2) goto L1b
            r0 = r2
            goto L1c
        L1b:
            r0 = r3
        L1c:
            if (r0 == 0) goto L1f
            goto L5f
        L1f:
            androidx.compose.runtime.snapshots.Snapshot$Companion r0 = androidx.compose.runtime.snapshots.Snapshot.Companion
            v3.l r4 = r6.readObserverOf(r7)
            v3.l r5 = r6.writeObserverOf(r7, r8)
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r0.takeMutableSnapshot(r4, r5)
            androidx.compose.runtime.snapshots.Snapshot r4 = r0.makeCurrent()     // Catch: java.lang.Throwable -> L5a
            if (r8 == 0) goto L3c
            boolean r5 = r8.isNotEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r5 != r2) goto L3c
            goto L3d
        L3a:
            r7 = move-exception
            goto L56
        L3c:
            r2 = r3
        L3d:
            if (r2 == 0) goto L47
            androidx.compose.runtime.Recomposer$performRecompose$1$1 r2 = new androidx.compose.runtime.Recomposer$performRecompose$1$1     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r8, r7)     // Catch: java.lang.Throwable -> L3a
            r7.prepareCompose(r2)     // Catch: java.lang.Throwable -> L3a
        L47:
            boolean r8 = r7.recompose()     // Catch: java.lang.Throwable -> L3a
            r0.restoreCurrent(r4)     // Catch: java.lang.Throwable -> L5a
            r6.applyAndCheck(r0)
            if (r8 == 0) goto L54
            goto L55
        L54:
            r7 = r1
        L55:
            return r7
        L56:
            r0.restoreCurrent(r4)     // Catch: java.lang.Throwable -> L5a
            throw r7     // Catch: java.lang.Throwable -> L5a
        L5a:
            r7 = move-exception
            r6.applyAndCheck(r0)
            throw r7
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.performRecompose(androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.collection.IdentityArraySet):androidx.compose.runtime.ControlledComposition");
    }

    private final void processCompositionError(Exception exc, ControlledComposition controlledComposition, boolean z4) {
        if (_hotReloadEnabled.get().booleanValue() && !(exc instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                ActualAndroid_androidKt.logError("Error was captured in composition while live edit was enabled.", exc);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new IdentityArraySet<>();
                this.compositionValuesAwaitingInsert.clear();
                this.compositionValuesRemoved.clear();
                this.compositionValueStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(z4, exc);
                if (controlledComposition != null) {
                    List list = this.failedCompositions;
                    if (list == null) {
                        list = new ArrayList();
                        this.failedCompositions = list;
                    }
                    if (!list.contains(controlledComposition)) {
                        list.add(controlledComposition);
                    }
                    removeKnownCompositionLocked(controlledComposition);
                }
                deriveStateLocked();
            }
            return;
        }
        synchronized (this.stateLock) {
            RecomposerErrorState recomposerErrorState = this.errorState;
            if (recomposerErrorState == null) {
                this.errorState = new RecomposerErrorState(false, exc);
                r2 r2Var = r2.f19517a;
            } else {
                throw recomposerErrorState.getCause();
            }
        }
        throw exc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Exception exc, ControlledComposition controlledComposition, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            controlledComposition = null;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        recomposer.processCompositionError(exc, controlledComposition, z4);
    }

    private final v3.l<Object, r2> readObserverOf(ControlledComposition controlledComposition) {
        return new Recomposer$readObserverOf$1(controlledComposition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(v3.q<? super s0, ? super MonotonicFrameClock, ? super d<? super r2>, ? extends Object> qVar, d<? super r2> dVar) {
        Object l5;
        Object h5 = kotlinx.coroutines.i.h(this.broadcastFrameClock, new Recomposer$recompositionRunner$2(this, qVar, MonotonicFrameClockKt.getMonotonicFrameClock(dVar.getContext()), null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (h5 == l5) {
            return h5;
        }
        return r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        List<ControlledComposition> knownCompositions;
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            IdentityArraySet<Object> identityArraySet = this.snapshotInvalidations;
            this.snapshotInvalidations = new IdentityArraySet<>();
            synchronized (this.stateLock) {
                knownCompositions = getKnownCompositions();
            }
            try {
                int size = knownCompositions.size();
                for (int i5 = 0; i5 < size; i5++) {
                    knownCompositions.get(i5).recordModificationsOf(identityArraySet);
                    if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.snapshotInvalidations = new IdentityArraySet<>();
                synchronized (this.stateLock) {
                    if (deriveStateLocked() == null) {
                        hasFrameWorkLocked = getHasFrameWorkLocked();
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll((Collection<? extends Object>) identityArraySet);
                    r2 r2Var = r2.f19517a;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(l2 l2Var) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th == null) {
                if (this._state.getValue().compareTo(State.ShuttingDown) > 0) {
                    if (this.runnerJob == null) {
                        this.runnerJob = l2Var;
                        deriveStateLocked();
                    } else {
                        throw new IllegalStateException("Recomposer already running".toString());
                    }
                } else {
                    throw new IllegalStateException("Recomposer shut down".toString());
                }
            } else {
                throw th;
            }
        }
    }

    private final void removeKnownCompositionLocked(ControlledComposition controlledComposition) {
        this._knownCompositions.remove(controlledComposition);
        this._knownCompositionsCache = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecomposerErrorState resetErrorState() {
        RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        List<ControlledComposition> list;
        Object L0;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (!list.isEmpty()) {
            try {
                L0 = kotlin.collections.b0.L0(list);
                ControlledComposition controlledComposition = (ControlledComposition) L0;
                if (controlledComposition instanceof CompositionImpl) {
                    controlledComposition.invalidateAll();
                    controlledComposition.setContent(((CompositionImpl) controlledComposition).getComposable());
                    if (this.errorState != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        List<ControlledComposition> list2 = this.failedCompositions;
                        if (list2 != null) {
                            list2.addAll(list);
                            list = list2;
                        }
                        this.failedCompositions = list;
                        r2 r2Var = r2.f19517a;
                    }
                }
                throw th;
            }
        }
        if (!list.isEmpty()) {
            synchronized (this.stateLock) {
                List<ControlledComposition> list3 = this.failedCompositions;
                if (list3 != null) {
                    list3.addAll(list);
                    list = list3;
                }
                this.failedCompositions = list;
                r2 r2Var2 = r2.f19517a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a2 -> B:11:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runFrameLoop(androidx.compose.runtime.MonotonicFrameClock r8, androidx.compose.runtime.ProduceFrameSignal r9, kotlin.coroutines.d<? super kotlin.r2> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer$runFrameLoop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer$runFrameLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L65
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.e1.n(r10)
        L3f:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L73
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.e1.n(r10)
            goto L8d
        L65:
            kotlin.e1.n(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L73:
            java.lang.Object r6 = r5.stateLock
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.L$4 = r2
            r0.label = r4
            java.lang.Object r6 = r9.awaitFrameRequest(r6, r0)
            if (r6 != r1) goto L88
            return r1
        L88:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L8d:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r10 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r10.<init>(r6, r9, r8, r2)
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r9
            r0.L$4 = r8
            r0.label = r3
            java.lang.Object r10 = r5.withFrameNanos(r10, r0)
            if (r10 != r1) goto L3f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.runFrameLoop(androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, kotlin.coroutines.d):java.lang.Object");
    }

    private final v3.l<Object, r2> writeObserverOf(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet) {
        return new Recomposer$writeObserverOf$1(controlledComposition, identityArraySet);
    }

    @l
    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    @m
    public final Object awaitIdle(@l d<? super r2> dVar) {
        Object l5;
        Object x4 = kotlinx.coroutines.flow.k.x(kotlinx.coroutines.flow.k.V1(getCurrentState(), new Recomposer$awaitIdle$2(null)), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return x4 == l5 ? x4 : r2.f19517a;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (this._state.getValue().compareTo(State.Idle) >= 0) {
                this._state.setValue(State.ShuttingDown);
            }
            r2 r2Var = r2.f19517a;
        }
        l2.a.b(this.effectJob, null, 1, null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                r2 r2Var = r2.f19517a;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void composeInitial$runtime_release(@l ControlledComposition controlledComposition, @l v3.p<? super Composer, ? super Integer, r2> pVar) {
        boolean isComposing = controlledComposition.isComposing();
        try {
            Snapshot.Companion companion = Snapshot.Companion;
            MutableSnapshot takeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, null));
            try {
                Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                try {
                    controlledComposition.composeContent(pVar);
                    r2 r2Var = r2.f19517a;
                    if (!isComposing) {
                        companion.notifyObjectsInitialized();
                    }
                    synchronized (this.stateLock) {
                        if (this._state.getValue().compareTo(State.ShuttingDown) > 0 && !getKnownCompositions().contains(controlledComposition)) {
                            addKnownCompositionLocked(controlledComposition);
                        }
                    }
                    try {
                        performInitialMovableContentInserts(controlledComposition);
                        try {
                            controlledComposition.applyChanges();
                            controlledComposition.applyLateChanges();
                            if (!isComposing) {
                                companion.notifyObjectsInitialized();
                            }
                        } catch (Exception e5) {
                            processCompositionError$default(this, e5, null, false, 6, null);
                        }
                    } catch (Exception e6) {
                        processCompositionError(e6, controlledComposition, true);
                    }
                } finally {
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
                applyAndCheck(takeMutableSnapshot);
            }
        } catch (Exception e7) {
            processCompositionError(e7, controlledComposition, true);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(@l MovableContentStateReference movableContentStateReference) {
        synchronized (this.stateLock) {
            RecomposerKt.addMultiValue(this.compositionValuesRemoved, movableContentStateReference.getContent$runtime_release(), movableContentStateReference);
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @l
    public final t0<State> getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @l
    public g getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    public final boolean getHasPendingWork() {
        boolean z4;
        synchronized (this.stateLock) {
            z4 = true;
            if (!this.snapshotInvalidations.isNotEmpty() && !(!this.compositionInvalidations.isEmpty()) && this.concurrentCompositionsOutstanding <= 0 && !(!this.compositionsAwaitingApply.isEmpty())) {
                if (!getHasBroadcastFrameClockAwaitersLocked()) {
                    z4 = false;
                }
            }
        }
        return z4;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @l
    public g getRecomposeCoroutineContext$runtime_release() {
        return kotlin.coroutines.i.INSTANCE;
    }

    @l
    public final i<State> getState() {
        return getCurrentState();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(@l MovableContentStateReference movableContentStateReference) {
        p<r2> deriveStateLocked;
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(movableContentStateReference);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            d1.a aVar = d1.Companion;
            deriveStateLocked.resumeWith(d1.m6444constructorimpl(r2.f19517a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(@l ControlledComposition controlledComposition) {
        p<r2> pVar;
        synchronized (this.stateLock) {
            if (!this.compositionInvalidations.contains(controlledComposition)) {
                this.compositionInvalidations.add(controlledComposition);
                pVar = deriveStateLocked();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            d1.a aVar = d1.Companion;
            pVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(@l RecomposeScopeImpl recomposeScopeImpl) {
        p<r2> deriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(recomposeScopeImpl);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            d1.a aVar = d1.Companion;
            deriveStateLocked.resumeWith(d1.m6444constructorimpl(r2.f19517a));
        }
    }

    @m
    public final Object join(@l d<? super r2> dVar) {
        Object l5;
        Object v02 = kotlinx.coroutines.flow.k.v0(getCurrentState(), new Recomposer$join$2(null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return v02 == l5 ? v02 : r2.f19517a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(@l MovableContentStateReference movableContentStateReference, @l MovableContentState movableContentState) {
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(movableContentStateReference, movableContentState);
            r2 r2Var = r2.f19517a;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @m
    public MovableContentState movableContentStateResolve$runtime_release(@l MovableContentStateReference movableContentStateReference) {
        MovableContentState remove;
        synchronized (this.stateLock) {
            remove = this.compositionValueStatesAvailable.remove(movableContentStateReference);
        }
        return remove;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            r2 r2Var = r2.f19517a;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(@l Set<CompositionData> set) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(@l ControlledComposition controlledComposition) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(@l ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            Set set = this.compositionsRemoved;
            if (set == null) {
                set = new LinkedHashSet();
                this.compositionsRemoved = set;
            }
            set.add(controlledComposition);
        }
    }

    public final void resumeCompositionFrameClock() {
        p<r2> pVar;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                pVar = deriveStateLocked();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            d1.a aVar = d1.Companion;
            pVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
        }
    }

    @m
    public final Object runRecomposeAndApplyChanges(@l d<? super r2> dVar) {
        Object l5;
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeAndApplyChanges$2(this, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return recompositionRunner == l5 ? recompositionRunner : r2.f19517a;
    }

    @ExperimentalComposeApi
    @m
    public final Object runRecomposeConcurrentlyAndApplyChanges(@l g gVar, @l d<? super r2> dVar) {
        Object l5;
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(gVar, this, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return recompositionRunner == l5 ? recompositionRunner : r2.f19517a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(@l ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(controlledComposition);
            this.compositionInvalidations.remove(controlledComposition);
            this.compositionsAwaitingApply.remove(controlledComposition);
            r2 r2Var = r2.f19517a;
        }
    }

    private final void recordComposerModifications(v3.l<? super ControlledComposition, r2> lVar) {
        IdentityArraySet identityArraySet = this.snapshotInvalidations;
        if (identityArraySet.isNotEmpty()) {
            List knownCompositions = getKnownCompositions();
            int size = knownCompositions.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((ControlledComposition) knownCompositions.get(i5)).recordModificationsOf(identityArraySet);
            }
            this.snapshotInvalidations = new IdentityArraySet();
        }
        List list = this.compositionInvalidations;
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            lVar.invoke(list.get(i6));
        }
        this.compositionInvalidations.clear();
        if (deriveStateLocked() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
        }
    }
}
