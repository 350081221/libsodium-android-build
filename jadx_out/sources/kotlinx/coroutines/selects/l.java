package kotlinx.coroutines.selects;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.a1;
import kotlin.b1;
import kotlin.collections.e0;
import kotlin.collections.v;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.internal.t0;
import kotlinx.coroutines.n1;
import kotlinx.coroutines.selects.c;
import u3.w;

@i0(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001'B\u000f\u0012\u0006\u0010?\u001a\u00020;¢\u0006\u0004\bO\u0010PJ\u0013\u0010\u0005\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0013\u0010\u000b\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002J\u001c\u0010\u0011\u001a\u000e\u0018\u00010\u0010R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0013\u0010\u0012\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0006J/\u0010\u0014\u001a\u00028\u00002\u0010\u0010\u0013\u001a\f0\u0010R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\t2\u0010\u0010\u0016\u001a\f0\u0010R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0013\u0010\u0018\u001a\u00028\u0000H\u0091@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0006J5\u0010\u001d\u001a\u00020\t*\u00020\u00192\u001c\u0010\u001c\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001aH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010\"\u001a\u00020\t\"\u0004\b\u0001\u0010\u001f*\b\u0012\u0004\u0012\u00028\u00010 2\"\u0010\u001c\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00070!H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J[\u0010'\u001a\u00020\t\"\u0004\b\u0001\u0010$\"\u0004\b\u0002\u0010\u001f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020%2\u0006\u0010&\u001a\u00028\u00012\"\u0010\u001c\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00070!H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J \u0010+\u001a\u00020\t*\f0\u0010R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0001J\u0010\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0016J\u001c\u00102\u001a\u00020\t2\n\u00100\u001a\u0006\u0012\u0002\b\u00030/2\u0006\u00101\u001a\u00020\u000eH\u0016J\u0012\u00103\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u00105\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u00107\u001a\u0002062\u0006\u0010\b\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u0007J\u0013\u0010:\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u000108H\u0096\u0002R\u001a\u0010?\u001a\u00020;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010<\u001a\u0004\b=\u0010>R(\u0010B\u001a\u0014\u0012\u000e\u0012\f0\u0010R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010CR\u0016\u0010E\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010CR\u0014\u0010H\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0014\u0010L\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010GR\u0011\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00070M8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lkotlinx/coroutines/selects/l;", "R", "Lkotlinx/coroutines/n;", "Lkotlinx/coroutines/selects/c;", "Lkotlinx/coroutines/selects/n;", "y", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "clauseObject", "Lkotlin/r2;", bi.aL, "L", "H", "internalResult", "", "J", "Lkotlinx/coroutines/selects/l$a;", bi.aG, "v", "clause", "E", "(Lkotlinx/coroutines/selects/l$a;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "selectedClause", bi.aK, "w", "Lkotlinx/coroutines/selects/e;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "d", "(Lkotlinx/coroutines/selects/e;Lv3/l;)V", "Q", "Lkotlinx/coroutines/selects/g;", "Lkotlin/Function2;", "c", "(Lkotlinx/coroutines/selects/g;Lv3/p;)V", "P", "Lkotlinx/coroutines/selects/i;", "param", bi.ay, "(Lkotlinx/coroutines/selects/i;Ljava/lang/Object;Lv3/p;)V", "", "reregister", "F", "Lkotlinx/coroutines/n1;", "disposableHandle", "f", "Lkotlinx/coroutines/internal/q0;", "segment", "index", "b", "e", "result", "i", "Lkotlinx/coroutines/selects/r;", "I", "", "cause", "j", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "Ljava/util/List;", "clauses", "Ljava/lang/Object;", "disposableHandleOrSegment", "indexInSegment", "A", "()Z", "inRegistrationPhase", "C", "isSelected", "B", "isCancelled", "Lkotlinx/atomicfu/AtomicRef;", "state", "<init>", "(Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@a1
@r1({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,873:1\n1#2:874\n2624#3,3:875\n1855#3,2:888\n1855#3,2:896\n1855#3,2:898\n314#4,9:878\n323#4,2:890\n19#5:887\n153#6,4:892\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n505#1:875,3\n569#1:888,2\n726#1:896,2\n751#1:898,2\n545#1:878,9\n545#1:890,2\n561#1:887\n711#1:892,4\n*E\n"})
/* loaded from: classes4.dex */
public class l<R> extends kotlinx.coroutines.n implements kotlinx.coroutines.selects.c<R>, n<R> {

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20575f = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "state");

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final kotlin.coroutines.g f20576a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private List<l<R>.a> f20577b;

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private Object f20578c;

    /* renamed from: d, reason: collision with root package name */
    private int f20579d;

    /* renamed from: e, reason: collision with root package name */
    @p4.m
    private Object f20580e;

    @w
    @p4.m
    private volatile Object state;

    @i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B¸\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012U\u0010\u001a\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0013\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000b0\u0014j\u0002`\u0018\u0012U\u0010\u001d\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014j\u0002`\u001c\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012g\u0010!\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f\u0018\u00010\u0014j\u0004\u0018\u0001`\u001f¢\u0006\u0004\b(\u0010)J\u0014\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u001d\u0010\t\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bJ*\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001R\u0014\u0010\u0013\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012Rc\u0010\u001a\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0013\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000b0\u0014j\u0002`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019Rc\u0010\u001d\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014j\u0002`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012Ru\u0010!\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\r¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f\u0018\u00010\u0014j\u0004\u0018\u0001`\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0018\u0010#\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u0016\u0010'\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lkotlinx/coroutines/selects/l$a;", "", "Lkotlinx/coroutines/selects/l;", "select", "", "e", "result", "d", "argument", "c", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/r2;", "b", "Lkotlinx/coroutines/selects/m;", "internalResult", "Lkotlin/Function1;", "", bi.ay, "Ljava/lang/Object;", "clauseObject", "Lkotlin/Function3;", "Lkotlin/v0;", "name", "param", "Lkotlinx/coroutines/selects/RegistrationFunction;", "Lv3/q;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "block", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "f", "onCancellationConstructor", socket.g.f22386a, "disposableHandleOrSegment", "", bi.aJ, "I", "indexInSegment", "<init>", "(Lkotlinx/coroutines/selects/l;Ljava/lang/Object;Lv3/q;Lv3/q;Ljava/lang/Object;Ljava/lang/Object;Lv3/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,873:1\n1#2:874\n*E\n"})
    /* loaded from: classes4.dex */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        @u3.e
        public final Object f20581a;

        /* renamed from: b, reason: collision with root package name */
        @p4.l
        private final v3.q<Object, m<?>, Object, r2> f20582b;

        /* renamed from: c, reason: collision with root package name */
        @p4.l
        private final v3.q<Object, Object, Object, Object> f20583c;

        /* renamed from: d, reason: collision with root package name */
        @p4.m
        private final Object f20584d;

        /* renamed from: e, reason: collision with root package name */
        @p4.l
        private final Object f20585e;

        /* renamed from: f, reason: collision with root package name */
        @p4.m
        @u3.e
        public final v3.q<m<?>, Object, Object, v3.l<Throwable, r2>> f20586f;

        /* renamed from: g, reason: collision with root package name */
        @p4.m
        @u3.e
        public Object f20587g;

        /* renamed from: h, reason: collision with root package name */
        @u3.e
        public int f20588h = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@p4.l Object obj, @p4.l v3.q<Object, ? super m<?>, Object, r2> qVar, @p4.l v3.q<Object, Object, Object, ? extends Object> qVar2, @p4.m Object obj2, @p4.l Object obj3, @p4.m v3.q<? super m<?>, Object, Object, ? extends v3.l<? super Throwable, r2>> qVar3) {
            this.f20581a = obj;
            this.f20582b = qVar;
            this.f20583c = qVar2;
            this.f20584d = obj2;
            this.f20585e = obj3;
            this.f20586f = qVar3;
        }

        @p4.m
        public final v3.l<Throwable, r2> a(@p4.l m<?> mVar, @p4.m Object obj) {
            v3.q<m<?>, Object, Object, v3.l<Throwable, r2>> qVar = this.f20586f;
            if (qVar != null) {
                return qVar.invoke(mVar, this.f20584d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f20587g;
            l<R> lVar = l.this;
            n1 n1Var = null;
            if (obj instanceof q0) {
                ((q0) obj).q(this.f20588h, null, lVar.getContext());
                return;
            }
            if (obj instanceof n1) {
                n1Var = (n1) obj;
            }
            if (n1Var != null) {
                n1Var.dispose();
            }
        }

        @p4.m
        public final Object c(@p4.m Object obj, @p4.l kotlin.coroutines.d<? super R> dVar) {
            Object obj2 = this.f20585e;
            if (this.f20584d == o.l()) {
                l0.n(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((v3.l) obj2).invoke(dVar);
            }
            l0.n(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((v3.p) obj2).invoke(obj, dVar);
        }

        @p4.m
        public final Object d(@p4.m Object obj) {
            return this.f20583c.invoke(this.f20581a, this.f20584d, obj);
        }

        public final boolean e(@p4.l l<R> lVar) {
            t0 t0Var;
            this.f20582b.invoke(this.f20581a, lVar, this.f20584d);
            Object obj = ((l) lVar).f20580e;
            t0Var = o.f20598i;
            if (obj == t0Var) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {431, 434}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ l<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l<R> lVar, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.this$0 = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.y(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {TypedValues.TransitionType.TYPE_STAGGERED}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ l<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l<R> lVar, kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
            this.this$0 = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.E(null, null, this);
        }
    }

    public l(@p4.l kotlin.coroutines.g gVar) {
        t0 t0Var;
        t0 t0Var2;
        this.f20576a = gVar;
        t0Var = o.f20595f;
        this.state = t0Var;
        this.f20577b = new ArrayList(2);
        this.f20579d = -1;
        t0Var2 = o.f20598i;
        this.f20580e = t0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A() {
        t0 t0Var;
        Object obj = f20575f.get(this);
        t0Var = o.f20595f;
        if (obj != t0Var && !(obj instanceof List)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B() {
        t0 t0Var;
        Object obj = f20575f.get(this);
        t0Var = o.f20597h;
        if (obj == t0Var) {
            return true;
        }
        return false;
    }

    private final boolean C() {
        return f20575f.get(this) instanceof a;
    }

    private final void D(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(kotlinx.coroutines.selects.l<R>.a r5, java.lang.Object r6, kotlin.coroutines.d<? super R> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.selects.l.c
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.selects.l$c r0 = (kotlinx.coroutines.selects.l.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.l$c r0 = new kotlinx.coroutines.selects.l$c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.e1.n(r7)     // Catch: java.lang.Throwable -> L29
            goto L43
        L29:
            r5 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.e1.n(r7)
            java.lang.Object r6 = r5.d(r6)     // Catch: java.lang.Throwable -> L29
            r0.label = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r5.c(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L43
            return r1
        L43:
            return r7
        L44:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.l.E(kotlinx.coroutines.selects.l$a, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ void G(l lVar, a aVar, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        lVar.F(aVar, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Object obj) {
        l<R>.a z4 = z(obj);
        l0.m(z4);
        z4.f20587g = null;
        z4.f20588h = -1;
        F(z4, true);
    }

    private final int J(Object obj, Object obj2) {
        boolean o5;
        t0 t0Var;
        boolean z4;
        t0 t0Var2;
        t0 t0Var3;
        List k5;
        List B4;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20575f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof kotlinx.coroutines.p) {
                l<R>.a z5 = z(obj);
                if (z5 == null) {
                    continue;
                } else {
                    v3.l<Throwable, r2> a5 = z5.a(this, obj2);
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj3, z5)) {
                        this.f20580e = obj2;
                        o5 = o.o((kotlinx.coroutines.p) obj3, a5);
                        if (o5) {
                            return 0;
                        }
                        this.f20580e = null;
                        return 2;
                    }
                }
            } else {
                t0Var = o.f20596g;
                if (l0.g(obj3, t0Var)) {
                    z4 = true;
                } else {
                    z4 = obj3 instanceof a;
                }
                if (z4) {
                    return 3;
                }
                t0Var2 = o.f20597h;
                if (l0.g(obj3, t0Var2)) {
                    return 2;
                }
                t0Var3 = o.f20595f;
                if (l0.g(obj3, t0Var3)) {
                    k5 = v.k(obj);
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj3, k5)) {
                        return 1;
                    }
                } else if (obj3 instanceof List) {
                    B4 = e0.B4((Collection) obj3, obj);
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj3, B4)) {
                        return 1;
                    }
                } else {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
            }
        }
    }

    private final void K(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, ? extends Object> lVar, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        r0 = r0.E();
        r1 = kotlin.coroutines.intrinsics.d.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r0 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        kotlin.coroutines.jvm.internal.h.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        r6 = kotlin.coroutines.intrinsics.d.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r0 != r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        return kotlin.r2.f19517a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(kotlin.coroutines.d<? super kotlin.r2> r6) {
        /*
            r5 = this;
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.d r1 = kotlin.coroutines.intrinsics.b.e(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.B()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o()
        L11:
            java.lang.Object r2 = r1.get(r5)
            kotlinx.coroutines.internal.t0 r3 = kotlinx.coroutines.selects.o.j()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = o()
            boolean r2 = androidx.concurrent.futures.a.a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            r0.g(r5)
            goto L65
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = o()
            kotlinx.coroutines.internal.t0 r4 = kotlinx.coroutines.selects.o.j()
            boolean r3 = androidx.concurrent.futures.a.a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L44:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            r(r5, r3)
            goto L44
        L52:
            boolean r1 = r2 instanceof kotlinx.coroutines.selects.l.a
            if (r1 == 0) goto L7c
            kotlin.r2 r1 = kotlin.r2.f19517a
            kotlinx.coroutines.selects.l$a r2 = (kotlinx.coroutines.selects.l.a) r2
            java.lang.Object r3 = n(r5)
            v3.l r2 = r2.a(r5, r3)
            r0.C(r1, r2)
        L65:
            java.lang.Object r0 = r0.E()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            if (r0 != r1) goto L72
            kotlin.coroutines.jvm.internal.h.c(r6)
        L72:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.b.l()
            if (r0 != r6) goto L79
            return r0
        L79:
            kotlin.r2 r6 = kotlin.r2.f19517a
            return r6
        L7c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.l.L(kotlin.coroutines.d):java.lang.Object");
    }

    private final void t(Object obj) {
        boolean z4;
        List<l<R>.a> list = this.f20577b;
        l0.m(list);
        List<l<R>.a> list2 = list;
        boolean z5 = true;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((a) it.next()).f20581a == obj) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    z5 = false;
                    break;
                }
            }
        }
        if (z5) {
            return;
        }
        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
    }

    private final void u(l<R>.a aVar) {
        t0 t0Var;
        t0 t0Var2;
        List<l<R>.a> list = this.f20577b;
        if (list == null) {
            return;
        }
        for (l<R>.a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20575f;
        t0Var = o.f20596g;
        atomicReferenceFieldUpdater.set(this, t0Var);
        t0Var2 = o.f20598i;
        this.f20580e = t0Var2;
        this.f20577b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(kotlin.coroutines.d<? super R> dVar) {
        Object obj = f20575f.get(this);
        l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        l<R>.a aVar = (a) obj;
        Object obj2 = this.f20580e;
        u(aVar);
        return aVar.c(aVar.d(obj2), dVar);
    }

    @a1
    static /* synthetic */ <R> Object x(l<R> lVar, kotlin.coroutines.d<? super R> dVar) {
        if (lVar.C()) {
            return lVar.v(dVar);
        }
        return lVar.y(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0057 A[PHI: r6
      0x0057: PHI (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x0054, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(kotlin.coroutines.d<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.l.b
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.selects.l$b r0 = (kotlinx.coroutines.selects.l.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.l$b r0 = new kotlinx.coroutines.selects.l$b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e1.n(r6)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.selects.l r2 = (kotlinx.coroutines.selects.l) r2
            kotlin.e1.n(r6)
            goto L4b
        L3c:
            kotlin.e1.n(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.L(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.v(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.l.y(kotlin.coroutines.d):java.lang.Object");
    }

    private final l<R>.a z(Object obj) {
        boolean z4;
        List<l<R>.a> list = this.f20577b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f20581a == obj) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                obj2 = next;
                break;
            }
        }
        l<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    @u3.h(name = "register")
    public final void F(@p4.l l<R>.a aVar, boolean z4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20575f;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        if (!z4) {
            t(aVar.f20581a);
        }
        if (aVar.e(this)) {
            if (!z4) {
                List<l<R>.a> list = this.f20577b;
                l0.m(list);
                list.add(aVar);
            }
            aVar.f20587g = this.f20578c;
            aVar.f20588h = this.f20579d;
            this.f20578c = null;
            this.f20579d = -1;
            return;
        }
        atomicReferenceFieldUpdater.set(this, aVar);
    }

    @p4.l
    public final r I(@p4.l Object obj, @p4.m Object obj2) {
        r d5;
        d5 = o.d(J(obj, obj2));
        return d5;
    }

    @Override // kotlinx.coroutines.selects.c
    public <P, Q> void a(@p4.l i<? super P, ? extends Q> iVar, P p5, @p4.l v3.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        G(this, new a(iVar.d(), iVar.a(), iVar.c(), p5, pVar, iVar.b()), false, 1, null);
    }

    @Override // kotlinx.coroutines.z3
    public void b(@p4.l q0<?> q0Var, int i5) {
        this.f20578c = q0Var;
        this.f20579d = i5;
    }

    @Override // kotlinx.coroutines.selects.c
    public <Q> void c(@p4.l g<? extends Q> gVar, @p4.l v3.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        G(this, new a(gVar.d(), gVar.a(), gVar.c(), null, pVar, gVar.b()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.c
    public void d(@p4.l e eVar, @p4.l v3.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar) {
        G(this, new a(eVar.d(), eVar.a(), eVar.c(), o.l(), lVar, eVar.b()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.m
    public void e(@p4.m Object obj) {
        this.f20580e = obj;
    }

    @Override // kotlinx.coroutines.selects.m
    public void f(@p4.l n1 n1Var) {
        this.f20578c = n1Var;
    }

    @Override // kotlinx.coroutines.selects.c
    @kotlin.internal.h
    @kotlin.k(level = kotlin.m.ERROR, message = "Replaced with the same extension function", replaceWith = @b1(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @a2
    public void g(long j5, @p4.l v3.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar) {
        c.a.b(this, j5, lVar);
    }

    @Override // kotlinx.coroutines.selects.m
    @p4.l
    public kotlin.coroutines.g getContext() {
        return this.f20576a;
    }

    @Override // kotlinx.coroutines.selects.c
    public <P, Q> void h(@p4.l i<? super P, ? extends Q> iVar, @p4.l v3.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        c.a.a(this, iVar, pVar);
    }

    @Override // kotlinx.coroutines.selects.m
    public boolean i(@p4.l Object obj, @p4.m Object obj2) {
        return J(obj, obj2) == 0;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
        j(th);
        return r2.f19517a;
    }

    @Override // kotlinx.coroutines.o
    public void j(@p4.m Throwable th) {
        Object obj;
        t0 t0Var;
        t0 t0Var2;
        t0 t0Var3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20575f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            t0Var = o.f20596g;
            if (obj == t0Var) {
                return;
            } else {
                t0Var2 = o.f20597h;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, t0Var2));
        List<l<R>.a> list = this.f20577b;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        t0Var3 = o.f20598i;
        this.f20580e = t0Var3;
        this.f20577b = null;
    }

    @a1
    @p4.m
    public Object w(@p4.l kotlin.coroutines.d<? super R> dVar) {
        return x(this, dVar);
    }
}
