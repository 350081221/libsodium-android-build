package kotlinx.coroutines;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.g;
import kotlin.jvm.internal.k1;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.l2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@kotlin.i0(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\t^¸\u0001¹\u0001\u0093\u0001º\u0001B\u0012\u0012\u0007\u0010µ\u0001\u001a\u00020\u0016¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001f\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0082\bJ\u001c\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002J \u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J\u0016\u0010\u001e\u001a\u00020\u0006*\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0002J'\u0010!\u001a\u00020\u0006\"\n\b\u0000\u0010 \u0018\u0001*\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0082\bJ\u0012\u0010#\u001a\u00020\"2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0002J9\u0010)\u001a\u00020\u001f2'\u0010'\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`&2\u0006\u0010(\u001a\u00020\u0016H\u0002J \u0010,\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u001fH\u0002J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020-H\u0002J\u0010\u0010/\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u001fH\u0002J\b\u00100\u001a\u00020\u0016H\u0002J\u0013\u00101\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001e\u00106\u001a\u00020\u00062\n\u00104\u001a\u0006\u0012\u0002\b\u0003032\b\u00105\u001a\u0004\u0018\u00010\u0005H\u0002J\u0014\u00107\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u00108\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0002J\u0014\u00109\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010:\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\u0014H\u0002J\u0018\u0010;\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u001e\u0010<\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002J\u001c\u0010=\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010\u000b\u001a\u00020\u0014H\u0002J#\u0010A\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010@\u001a\u00020>2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0082\u0010J\"\u0010C\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010B\u001a\u00020>2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010E\u001a\u0004\u0018\u00010>*\u00020DH\u0002J\u0012\u0010G\u001a\u00020F2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0002J\u0015\u0010H\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\bH\u00102J\u001e\u0010I\u001a\u00020\u00062\n\u00104\u001a\u0006\u0012\u0002\b\u0003032\b\u00105\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010K\u001a\u0004\u0018\u00010\u00052\b\u00105\u001a\u0004\u0018\u00010\u00052\b\u0010J\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010M\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u0004J\u0006\u0010N\u001a\u00020\u0016J\b\u0010O\u001a\u00020\u0006H\u0014J\n\u0010R\u001a\u00060Pj\u0002`QJ\u001c\u0010T\u001a\u00060Pj\u0002`Q*\u00020\u000f2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010FH\u0004J/\u0010V\u001a\u00020U2'\u0010'\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`&J?\u0010X\u001a\u00020U2\u0006\u0010(\u001a\u00020\u00162\u0006\u0010W\u001a\u00020\u00162'\u0010'\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`&J\u0013\u0010Y\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\bY\u00102J\u0017\u0010Z\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001fH\u0000¢\u0006\u0004\bZ\u0010[J\u0018\u0010\\\u001a\u00020\u00062\u000e\u0010\u001b\u001a\n\u0018\u00010Pj\u0004\u0018\u0001`QH\u0016J\b\u0010]\u001a\u00020FH\u0014J\u0012\u0010^\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0017J\u0010\u0010_\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u000e\u0010a\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u0003J\u0010\u0010b\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u0010\u0010c\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fJ\u0019\u0010d\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bd\u0010eJ(\u0010g\u001a\u00020f2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010F2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0080\b¢\u0006\u0004\bg\u0010hJ\f\u0010i\u001a\u00060Pj\u0002`QH\u0016J\u0019\u0010j\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bj\u0010eJ\u001b\u0010k\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bk\u0010lJ\u000e\u0010n\u001a\u00020m2\u0006\u0010@\u001a\u00020\u0002J\u0017\u0010p\u001a\u00020\u00062\u0006\u0010o\u001a\u00020\u000fH\u0010¢\u0006\u0004\bp\u0010qJ\u0012\u0010r\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010s\u001a\u00020\u00162\u0006\u0010o\u001a\u00020\u000fH\u0014J\u0012\u0010t\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014J\u0012\u0010u\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010v\u001a\u00020FH\u0016J\b\u0010w\u001a\u00020FH\u0007J\u000f\u0010x\u001a\u00020FH\u0010¢\u0006\u0004\bx\u0010yJ\b\u0010z\u001a\u0004\u0018\u00010\u000fJ\u0011\u0010{\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b{\u0010|J\u0015\u0010}\u001a\u0004\u0018\u00010\u0005H\u0084@ø\u0001\u0000¢\u0006\u0004\b}\u00102R\u001d\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u001b\u0010\u0083\u0001\u001a\u00020\u0016*\u00020\u00148BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0087\u0001\u001a\u0007\u0012\u0002\b\u00030\u0084\u00018F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R.\u0010\u008d\u0001\u001a\u0004\u0018\u00010m2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010m8@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010L\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00058@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010|R\u0017\u0010\u0091\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0014\u0010\u0094\u0001\u001a\u00020\u00168F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0092\u0001R\u0014\u0010\u0095\u0001\u001a\u00020\u00168F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0092\u0001R\u0019\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000f8DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0017\u0010\u009a\u0001\u001a\u00020\u00168DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u0092\u0001R\u001d\u0010 \u0001\u001a\u00030\u009b\u00018F¢\u0006\u0010\u0012\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010¢\u0001\u001a\u00020\u00168PX\u0090\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u0092\u0001R\u001b\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010£\u00018F¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010¨\u0001\u001a\u00020\u00168TX\u0094\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010\u0092\u0001R\u0017\u0010ª\u0001\u001a\u00020\u00168PX\u0090\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010\u0092\u0001R\u0014\u0010¬\u0001\u001a\u00020\u00168F¢\u0006\b\u001a\u0006\b«\u0001\u0010\u0092\u0001R$\u0010±\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00018DX\u0084\u0004¢\u0006\u0010\u0012\u0006\b°\u0001\u0010\u009f\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R\u0015\u0010³\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010m0²\u00018\u0002X\u0082\u0004R\u0015\u0010´\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050²\u00018\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006»\u0001"}, d2 = {"Lkotlinx/coroutines/t2;", "Lkotlinx/coroutines/l2;", "Lkotlinx/coroutines/x;", "Lkotlinx/coroutines/d3;", "Lkotlin/Function1;", "", "Lkotlin/r2;", "block", "", "O0", "Lkotlinx/coroutines/t2$c;", "state", "proposedUpdate", "n0", "", "", "exceptions", "v0", "rootCause", "V", "Lkotlinx/coroutines/e2;", "update", "", "n1", "i0", "Lkotlinx/coroutines/y2;", "list", "cause", "V0", "f0", "W0", "Lkotlinx/coroutines/s2;", "T", "X0", "", "i1", "Lkotlin/v0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "S0", "expect", "node", "U", "Lkotlinx/coroutines/q1;", "d1", "e1", "L0", "M0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/m;", "select", "ignoredParam", "f1", "e0", "k0", "P0", "C0", "o1", "p1", "q1", "Lkotlinx/coroutines/w;", "o0", "child", "r1", "lastChild", "j0", "Lkotlinx/coroutines/internal/z;", "U0", "", "j1", "Y", "Z0", "result", "Y0", "parent", "H0", "start", "c1", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "y", CrashHianalyticsData.MESSAGE, "k1", "Lkotlinx/coroutines/n1;", "t0", "invokeImmediately", bi.aJ, "b0", "g1", "(Lkotlinx/coroutines/s2;)V", "cancel", "g0", bi.ay, "d0", "parentJob", "A", "h0", "Z", "c0", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/m2;", "l0", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/m2;", "P", "Q0", "R0", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/v;", "A0", "exception", "G0", "(Ljava/lang/Throwable;)V", "a1", "F0", "b1", "W", "toString", "m1", "T0", "()Ljava/lang/String;", "q", "p0", "()Ljava/lang/Object;", "X", "u0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "exceptionOrNull", "I0", "(Lkotlinx/coroutines/e2;)Z", "isCancelling", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", DatabaseFileArchive.COLUMN_KEY, t0.b.f22420d, "D0", "()Lkotlinx/coroutines/v;", "h1", "(Lkotlinx/coroutines/v;)V", "parentHandle", "getParent", "()Lkotlinx/coroutines/l2;", "E0", "isActive", "()Z", "d", "isCompleted", "isCancelled", "q0", "()Ljava/lang/Throwable;", "completionCause", "s0", "completionCauseHandled", "Lkotlinx/coroutines/selects/e;", "r0", "()Lkotlinx/coroutines/selects/e;", "getOnJoin$annotations", "()V", "onJoin", "z0", "onCancelComplete", "Lkotlin/sequences/m;", "o", "()Lkotlin/sequences/m;", "children", "K0", "isScopedCoroutine", "w0", "handlesException", "J0", "isCompletedExceptionally", "Lkotlinx/coroutines/selects/g;", "x0", "()Lkotlinx/coroutines/selects/g;", "getOnAwaitInternal$annotations", "onAwaitInternal", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "active", "<init>", "(Z)V", "b", "c", "e", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.k(level = kotlin.m.ERROR, message = "This is internal API and may be removed in the future releases")
@kotlin.jvm.internal.r1({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 9 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 10 CompletionHandler.common.kt\nkotlinx/coroutines/CompletionHandler_commonKt\n+ 11 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 12 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 13 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1451:1\n705#1,2:1458\n366#1,2:1468\n368#1,4:1473\n372#1,4:1479\n376#1,2:1486\n366#1,2:1488\n368#1,4:1493\n372#1,4:1499\n376#1,2:1506\n177#1,2:1515\n706#1:1517\n177#1,2:1518\n177#1,2:1537\n177#1,2:1552\n705#1,2:1554\n705#1,2:1556\n177#1,2:1558\n705#1,2:1560\n177#1,2:1562\n177#1,2:1569\n177#1,2:1571\n1#2:1452\n1#2:1477\n1#2:1497\n28#3,4:1453\n28#3,4:1520\n28#3,4:1564\n28#3,4:1573\n20#4:1457\n20#4:1524\n20#4:1568\n20#4:1577\n288#5,2:1460\n288#5,2:1462\n19#6:1464\n162#7:1465\n162#7:1466\n153#7,4:1580\n75#8:1467\n75#8:1478\n75#8:1498\n75#8:1511\n341#9,3:1470\n344#9,3:1483\n341#9,3:1490\n344#9,3:1503\n341#9,3:1508\n344#9,3:1512\n47#10:1525\n22#11:1526\n22#11:1527\n13#11:1548\n13#11:1551\n13#11:1578\n13#11:1579\n13#11:1584\n13#11:1585\n134#12:1528\n73#12,3:1529\n135#12,5:1532\n314#13,9:1539\n323#13,2:1549\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n249#1:1458,2\n331#1:1468,2\n331#1:1473,4\n331#1:1479,4\n331#1:1486,2\n363#1:1488,2\n363#1:1493,4\n363#1:1499,4\n363#1:1506,2\n380#1:1515,2\n425#1:1517\n460#1:1518,2\n552#1:1537,2\n593#1:1552,2\n620#1:1554,2\n629#1:1556,2\n693#1:1558,2\n722#1:1560,2\n735#1:1562,2\n808#1:1569,2\n830#1:1571,2\n331#1:1477\n363#1:1497\n212#1:1453,4\n477#1:1520,4\n738#1:1564,4\n883#1:1573,4\n212#1:1457\n477#1:1524\n738#1:1568\n883#1:1577\n260#1:1460,2\n264#1:1462,2\n272#1:1464\n278#1:1465\n280#1:1466\n1217#1:1580,4\n283#1:1467\n331#1:1478\n363#1:1498\n371#1:1511\n331#1:1470,3\n331#1:1483,3\n363#1:1490,3\n363#1:1503,3\n367#1:1508,3\n367#1:1512,3\n482#1:1525\n494#1:1526\n504#1:1527\n560#1:1548\n576#1:1551\n923#1:1578\n973#1:1579\n1236#1:1584\n1258#1:1585\n525#1:1528\n525#1:1529,3\n525#1:1532,5\n558#1:1539,9\n558#1:1549,2\n*E\n"})
/* loaded from: classes4.dex */
public class t2 implements l2, x, d3 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20632a = AtomicReferenceFieldUpdater.newUpdater(t2.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20633b = AtomicReferenceFieldUpdater.newUpdater(t2.class, Object.class, "_parentHandle");

    @u3.w
    @p4.m
    private volatile Object _parentHandle;

    @u3.w
    @p4.m
    private volatile Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/t2$a;", "T", "Lkotlinx/coroutines/q;", "Lkotlinx/coroutines/l2;", "parent", "", "A", "", "P", "Lkotlinx/coroutines/t2;", "i", "Lkotlinx/coroutines/t2;", ServiceManagerNative.JOB, "Lkotlin/coroutines/d;", "delegate", "<init>", "(Lkotlin/coroutines/d;Lkotlinx/coroutines/t2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1451:1\n1#2:1452\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<T> extends q<T> {

        /* renamed from: i, reason: collision with root package name */
        @p4.l
        private final t2 f20634i;

        public a(@p4.l kotlin.coroutines.d<? super T> dVar, @p4.l t2 t2Var) {
            super(dVar, 1);
            this.f20634i = t2Var;
        }

        @Override // kotlinx.coroutines.q
        @p4.l
        public Throwable A(@p4.l l2 l2Var) {
            Throwable e5;
            Object E0 = this.f20634i.E0();
            if ((E0 instanceof c) && (e5 = ((c) E0).e()) != null) {
                return e5;
            }
            if (E0 instanceof d0) {
                return ((d0) E0).f19951a;
            }
            return l2Var.y();
        }

        @Override // kotlinx.coroutines.q
        @p4.l
        protected String P() {
            return "AwaitContinuation";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/t2$b;", "Lkotlinx/coroutines/s2;", "", "cause", "Lkotlin/r2;", "x", "Lkotlinx/coroutines/t2;", "e", "Lkotlinx/coroutines/t2;", "parent", "Lkotlinx/coroutines/t2$c;", "f", "Lkotlinx/coroutines/t2$c;", "state", "Lkotlinx/coroutines/w;", socket.g.f22386a, "Lkotlinx/coroutines/w;", "child", "", bi.aJ, "Ljava/lang/Object;", "proposedUpdate", "<init>", "(Lkotlinx/coroutines/t2;Lkotlinx/coroutines/t2$c;Lkotlinx/coroutines/w;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b extends s2 {

        /* renamed from: e, reason: collision with root package name */
        @p4.l
        private final t2 f20635e;

        /* renamed from: f, reason: collision with root package name */
        @p4.l
        private final c f20636f;

        /* renamed from: g, reason: collision with root package name */
        @p4.l
        private final w f20637g;

        /* renamed from: h, reason: collision with root package name */
        @p4.m
        private final Object f20638h;

        public b(@p4.l t2 t2Var, @p4.l c cVar, @p4.l w wVar, @p4.m Object obj) {
            this.f20635e = t2Var;
            this.f20636f = cVar;
            this.f20637g = wVar;
            this.f20638h = obj;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
            x(th);
            return kotlin.r2.f19517a;
        }

        @Override // kotlinx.coroutines.f0
        public void x(@p4.m Throwable th) {
            this.f20635e.j0(this.f20636f, this.f20637g, this.f20638h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b0\u00101J\u0018\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R(\u0010\u001a\u001a\u0004\u0018\u00010\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010%\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR\u0011\u0010)\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u0014\u0010*\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001dR\u0013\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010+8\u0002X\u0082\u0004R\u000b\u0010.\u001a\u00020-8\u0002X\u0082\u0004R\u0013\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050+8\u0002X\u0082\u0004¨\u00062"}, d2 = {"Lkotlinx/coroutines/t2$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/e2;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "c", "proposedException", "", "i", "exception", "Lkotlin/r2;", "b", "", "toString", "Lkotlinx/coroutines/y2;", bi.ay, "Lkotlinx/coroutines/y2;", "()Lkotlinx/coroutines/y2;", "list", t0.b.f22420d, "d", "()Ljava/lang/Object;", "k", "(Ljava/lang/Object;)V", "exceptionsHolder", "", socket.g.f22386a, "()Z", "j", "(Z)V", "isCompleting", "e", "()Ljava/lang/Throwable;", "l", "(Ljava/lang/Throwable;)V", "rootCause", bi.aJ, "isSealed", "f", "isCancelling", "isActive", "Lkotlinx/atomicfu/AtomicRef;", "_exceptionsHolder", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleting", "_rootCause", "<init>", "(Lkotlinx/coroutines/y2;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1451:1\n1#2:1452\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class c implements e2 {

        /* renamed from: b, reason: collision with root package name */
        @p4.l
        private static final AtomicIntegerFieldUpdater f20639b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: c, reason: collision with root package name */
        @p4.l
        private static final AtomicReferenceFieldUpdater f20640c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: d, reason: collision with root package name */
        @p4.l
        private static final AtomicReferenceFieldUpdater f20641d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");

        @u3.w
        @p4.m
        private volatile Object _exceptionsHolder;

        @u3.w
        private volatile int _isCompleting;

        @u3.w
        @p4.m
        private volatile Object _rootCause;

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final y2 f20642a;

        public c(@p4.l y2 y2Var, boolean z4, @p4.m Throwable th) {
            this.f20642a = y2Var;
            this._isCompleting = z4 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return f20641d.get(this);
        }

        private final void k(Object obj) {
            f20641d.set(this, obj);
        }

        @Override // kotlinx.coroutines.e2
        @p4.l
        public y2 a() {
            return this.f20642a;
        }

        public final void b(@p4.l Throwable th) {
            Throwable e5 = e();
            if (e5 == null) {
                l(th);
                return;
            }
            if (th == e5) {
                return;
            }
            Object d5 = d();
            if (d5 == null) {
                k(th);
                return;
            }
            if (d5 instanceof Throwable) {
                if (th == d5) {
                    return;
                }
                ArrayList<Throwable> c5 = c();
                c5.add(d5);
                c5.add(th);
                k(c5);
                return;
            }
            if (d5 instanceof ArrayList) {
                ((ArrayList) d5).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + d5).toString());
        }

        @p4.m
        public final Throwable e() {
            return (Throwable) f20640c.get(this);
        }

        public final boolean f() {
            return e() != null;
        }

        public final boolean g() {
            if (f20639b.get(this) != 0) {
                return true;
            }
            return false;
        }

        public final boolean h() {
            kotlinx.coroutines.internal.t0 t0Var;
            Object d5 = d();
            t0Var = u2.f20658h;
            return d5 == t0Var;
        }

        @p4.l
        public final List<Throwable> i(@p4.m Throwable th) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.t0 t0Var;
            Object d5 = d();
            if (d5 == null) {
                arrayList = c();
            } else if (d5 instanceof Throwable) {
                ArrayList<Throwable> c5 = c();
                c5.add(d5);
                arrayList = c5;
            } else if (d5 instanceof ArrayList) {
                arrayList = (ArrayList) d5;
            } else {
                throw new IllegalStateException(("State is " + d5).toString());
            }
            Throwable e5 = e();
            if (e5 != null) {
                arrayList.add(0, e5);
            }
            if (th != null && !kotlin.jvm.internal.l0.g(th, e5)) {
                arrayList.add(th);
            }
            t0Var = u2.f20658h;
            k(t0Var);
            return arrayList;
        }

        @Override // kotlinx.coroutines.e2
        public boolean isActive() {
            return e() == null;
        }

        public final void j(boolean z4) {
            f20639b.set(this, z4 ? 1 : 0);
        }

        public final void l(@p4.m Throwable th) {
            f20640c.set(this, th);
        }

        @p4.l
        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + a() + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/t2$d;", "Lkotlinx/coroutines/s2;", "", "cause", "Lkotlin/r2;", "x", "Lkotlinx/coroutines/selects/m;", "e", "Lkotlinx/coroutines/selects/m;", "select", "<init>", "(Lkotlinx/coroutines/t2;Lkotlinx/coroutines/selects/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class d extends s2 {

        /* renamed from: e, reason: collision with root package name */
        @p4.l
        private final kotlinx.coroutines.selects.m<?> f20643e;

        public d(@p4.l kotlinx.coroutines.selects.m<?> mVar) {
            this.f20643e = mVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
            x(th);
            return kotlin.r2.f19517a;
        }

        @Override // kotlinx.coroutines.f0
        public void x(@p4.m Throwable th) {
            Object E0 = t2.this.E0();
            if (!(E0 instanceof d0)) {
                E0 = u2.h(E0);
            }
            this.f20643e.i(t2.this, E0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/t2$e;", "Lkotlinx/coroutines/s2;", "", "cause", "Lkotlin/r2;", "x", "Lkotlinx/coroutines/selects/m;", "e", "Lkotlinx/coroutines/selects/m;", "select", "<init>", "(Lkotlinx/coroutines/t2;Lkotlinx/coroutines/selects/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class e extends s2 {

        /* renamed from: e, reason: collision with root package name */
        @p4.l
        private final kotlinx.coroutines.selects.m<?> f20645e;

        public e(@p4.l kotlinx.coroutines.selects.m<?> mVar) {
            this.f20645e = mVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
            x(th);
            return kotlin.r2.f19517a;
        }

        @Override // kotlinx.coroutines.f0
        public void x(@p4.m Throwable th) {
            this.f20645e.i(t2.this, kotlin.r2.f19517a);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/z$b", "Lkotlinx/coroutines/internal/z$a;", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "affected", "", socket.g.f22386a, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,367:1\n525#2:368\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class f extends z.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ t2 f20647d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f20648e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlinx.coroutines.internal.z zVar, t2 t2Var, Object obj) {
            super(zVar);
            this.f20647d = t2Var;
            this.f20648e = obj;
        }

        @Override // kotlinx.coroutines.internal.b
        @p4.m
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object e(@p4.l kotlinx.coroutines.internal.z zVar) {
            boolean z4;
            if (this.f20647d.E0() == this.f20648e) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return null;
            }
            return kotlinx.coroutines.internal.y.a();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {955, 957}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/o;", "Lkotlinx/coroutines/l2;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1451:1\n341#2,6:1452\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n957#1:1452,6\n*E\n"})
    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.k implements v3.p<kotlin.sequences.o<? super l2>, kotlin.coroutines.d<? super kotlin.r2>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<kotlin.r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            g gVar = new g(dVar);
            gVar.L$0 = obj;
            return gVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlin.sequences.o<? super l2> oVar, @p4.m kotlin.coroutines.d<? super kotlin.r2> dVar) {
            return ((g) create(oVar, dVar)).invokeSuspend(kotlin.r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006d -> B:6:0x0083). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0080 -> B:6:0x0083). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.L$2
                kotlinx.coroutines.internal.z r1 = (kotlinx.coroutines.internal.z) r1
                java.lang.Object r3 = r7.L$1
                kotlinx.coroutines.internal.x r3 = (kotlinx.coroutines.internal.x) r3
                java.lang.Object r4 = r7.L$0
                kotlin.sequences.o r4 = (kotlin.sequences.o) r4
                kotlin.e1.n(r8)
                r8 = r7
                goto L83
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                kotlin.e1.n(r8)
                goto L88
            L2b:
                kotlin.e1.n(r8)
                java.lang.Object r8 = r7.L$0
                kotlin.sequences.o r8 = (kotlin.sequences.o) r8
                kotlinx.coroutines.t2 r1 = kotlinx.coroutines.t2.this
                java.lang.Object r1 = r1.E0()
                boolean r4 = r1 instanceof kotlinx.coroutines.w
                if (r4 == 0) goto L49
                kotlinx.coroutines.w r1 = (kotlinx.coroutines.w) r1
                kotlinx.coroutines.x r1 = r1.f20671e
                r7.label = r3
                java.lang.Object r8 = r8.b(r1, r7)
                if (r8 != r0) goto L88
                return r0
            L49:
                boolean r3 = r1 instanceof kotlinx.coroutines.e2
                if (r3 == 0) goto L88
                kotlinx.coroutines.e2 r1 = (kotlinx.coroutines.e2) r1
                kotlinx.coroutines.y2 r1 = r1.a()
                if (r1 == 0) goto L88
                java.lang.Object r3 = r1.l()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.l0.n(r3, r4)
                kotlinx.coroutines.internal.z r3 = (kotlinx.coroutines.internal.z) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L65:
                boolean r5 = kotlin.jvm.internal.l0.g(r1, r3)
                if (r5 != 0) goto L88
                boolean r5 = r1 instanceof kotlinx.coroutines.w
                if (r5 == 0) goto L83
                r5 = r1
                kotlinx.coroutines.w r5 = (kotlinx.coroutines.w) r5
                kotlinx.coroutines.x r5 = r5.f20671e
                r8.L$0 = r4
                r8.L$1 = r3
                r8.L$2 = r1
                r8.label = r2
                java.lang.Object r5 = r4.b(r5, r8)
                if (r5 != r0) goto L83
                return r0
            L83:
                kotlinx.coroutines.internal.z r1 = r1.m()
                goto L65
            L88:
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.t2.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class h extends kotlin.jvm.internal.h0 implements v3.q<t2, kotlinx.coroutines.selects.m<?>, Object, kotlin.r2> {
        public static final h INSTANCE = new h();

        h() {
            super(3, t2.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ kotlin.r2 invoke(t2 t2Var, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            invoke2(t2Var, mVar, obj);
            return kotlin.r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l t2 t2Var, @p4.l kotlinx.coroutines.selects.m<?> mVar, @p4.m Object obj) {
            t2Var.Z0(mVar, obj);
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class i extends kotlin.jvm.internal.h0 implements v3.q<t2, Object, Object, Object> {
        public static final i INSTANCE = new i();

        i() {
            super(3, t2.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l t2 t2Var, @p4.m Object obj, @p4.m Object obj2) {
            return t2Var.Y0(obj, obj2);
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class j extends kotlin.jvm.internal.h0 implements v3.q<t2, kotlinx.coroutines.selects.m<?>, Object, kotlin.r2> {
        public static final j INSTANCE = new j();

        j() {
            super(3, t2.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ kotlin.r2 invoke(t2 t2Var, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            invoke2(t2Var, mVar, obj);
            return kotlin.r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l t2 t2Var, @p4.l kotlinx.coroutines.selects.m<?> mVar, @p4.m Object obj) {
            t2Var.f1(mVar, obj);
        }
    }

    public t2(boolean z4) {
        q1 q1Var;
        if (z4) {
            q1Var = u2.f20660j;
        } else {
            q1Var = u2.f20659i;
        }
        this._state = q1Var;
    }

    public static /* synthetic */ void B0() {
    }

    private final y2 C0(e2 e2Var) {
        y2 a5 = e2Var.a();
        if (a5 == null) {
            if (e2Var instanceof q1) {
                return new y2();
            }
            if (e2Var instanceof s2) {
                e1((s2) e2Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + e2Var).toString());
        }
        return a5;
    }

    private final boolean I0(e2 e2Var) {
        return (e2Var instanceof c) && ((c) e2Var).f();
    }

    private final boolean L0() {
        Object E0;
        do {
            E0 = E0();
            if (!(E0 instanceof e2)) {
                return false;
            }
        } while (i1(E0) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M0(kotlin.coroutines.d<? super kotlin.r2> dVar) {
        q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.B();
        s.a(qVar, t0(new f3(qVar)));
        Object E = qVar.E();
        if (E == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (E == kotlin.coroutines.intrinsics.b.l()) {
            return E;
        }
        return kotlin.r2.f19517a;
    }

    private final void N0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, kotlin.r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final Void O0(v3.l<Object, kotlin.r2> lVar) {
        while (true) {
            lVar.invoke(E0());
        }
    }

    private final Object P0(Object obj) {
        kotlinx.coroutines.internal.t0 t0Var;
        kotlinx.coroutines.internal.t0 t0Var2;
        kotlinx.coroutines.internal.t0 t0Var3;
        kotlinx.coroutines.internal.t0 t0Var4;
        kotlinx.coroutines.internal.t0 t0Var5;
        kotlinx.coroutines.internal.t0 t0Var6;
        Throwable th = null;
        Throwable th2 = null;
        while (true) {
            Object E0 = E0();
            if (E0 instanceof c) {
                synchronized (E0) {
                    if (((c) E0).h()) {
                        t0Var2 = u2.f20654d;
                        return t0Var2;
                    }
                    boolean f5 = ((c) E0).f();
                    if (obj != null || !f5) {
                        if (th2 == null) {
                            th2 = k0(obj);
                        }
                        ((c) E0).b(th2);
                    }
                    Throwable e5 = ((c) E0).e();
                    if (!f5) {
                        th = e5;
                    }
                    if (th != null) {
                        V0(((c) E0).a(), th);
                    }
                    t0Var = u2.f20651a;
                    return t0Var;
                }
            }
            if (E0 instanceof e2) {
                if (th2 == null) {
                    th2 = k0(obj);
                }
                e2 e2Var = (e2) E0;
                if (e2Var.isActive()) {
                    if (o1(e2Var, th2)) {
                        t0Var4 = u2.f20651a;
                        return t0Var4;
                    }
                } else {
                    Object p12 = p1(E0, new d0(th2, false, 2, null));
                    t0Var5 = u2.f20651a;
                    if (p12 != t0Var5) {
                        t0Var6 = u2.f20653c;
                        if (p12 != t0Var6) {
                            return p12;
                        }
                    } else {
                        throw new IllegalStateException(("Cannot happen in " + E0).toString());
                    }
                }
            } else {
                t0Var3 = u2.f20654d;
                return t0Var3;
            }
        }
    }

    private final s2 S0(v3.l<? super Throwable, kotlin.r2> lVar, boolean z4) {
        s2 s2Var = null;
        if (z4) {
            if (lVar instanceof n2) {
                s2Var = (n2) lVar;
            }
            if (s2Var == null) {
                s2Var = new j2(lVar);
            }
        } else {
            if (lVar instanceof s2) {
                s2Var = (s2) lVar;
            }
            if (s2Var == null) {
                s2Var = new k2(lVar);
            }
        }
        s2Var.z(this);
        return s2Var;
    }

    private final boolean U(Object obj, y2 y2Var, s2 s2Var) {
        int v4;
        f fVar = new f(s2Var, this, obj);
        do {
            v4 = y2Var.n().v(s2Var, y2Var, fVar);
            if (v4 == 1) {
                return true;
            }
        } while (v4 != 2);
        return false;
    }

    private final w U0(kotlinx.coroutines.internal.z zVar) {
        while (zVar.o()) {
            zVar = zVar.n();
        }
        while (true) {
            zVar = zVar.m();
            if (!zVar.o()) {
                if (zVar instanceof w) {
                    return (w) zVar;
                }
                if (zVar instanceof y2) {
                    return null;
                }
            }
        }
    }

    private final void V(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                kotlin.p.a(th, th2);
            }
        }
    }

    private final void V0(y2 y2Var, Throwable th) {
        a1(th);
        Object l5 = y2Var.l();
        kotlin.jvm.internal.l0.n(l5, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        g0 g0Var = null;
        for (kotlinx.coroutines.internal.z zVar = (kotlinx.coroutines.internal.z) l5; !kotlin.jvm.internal.l0.g(zVar, y2Var); zVar = zVar.m()) {
            if (zVar instanceof n2) {
                s2 s2Var = (s2) zVar;
                try {
                    s2Var.x(th);
                } catch (Throwable th2) {
                    if (g0Var != null) {
                        kotlin.p.a(g0Var, th2);
                    } else {
                        g0Var = new g0("Exception in completion handler " + s2Var + " for " + this, th2);
                        kotlin.r2 r2Var = kotlin.r2.f19517a;
                    }
                }
            }
        }
        if (g0Var != null) {
            G0(g0Var);
        }
        f0(th);
    }

    private final void W0(y2 y2Var, Throwable th) {
        Object l5 = y2Var.l();
        kotlin.jvm.internal.l0.n(l5, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        g0 g0Var = null;
        for (kotlinx.coroutines.internal.z zVar = (kotlinx.coroutines.internal.z) l5; !kotlin.jvm.internal.l0.g(zVar, y2Var); zVar = zVar.m()) {
            if (zVar instanceof s2) {
                s2 s2Var = (s2) zVar;
                try {
                    s2Var.x(th);
                } catch (Throwable th2) {
                    if (g0Var != null) {
                        kotlin.p.a(g0Var, th2);
                    } else {
                        g0Var = new g0("Exception in completion handler " + s2Var + " for " + this, th2);
                        kotlin.r2 r2Var = kotlin.r2.f19517a;
                    }
                }
            }
        }
        if (g0Var != null) {
            G0(g0Var);
        }
    }

    private final /* synthetic */ <T extends s2> void X0(y2 y2Var, Throwable th) {
        Object l5 = y2Var.l();
        kotlin.jvm.internal.l0.n(l5, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        g0 g0Var = null;
        for (kotlinx.coroutines.internal.z zVar = (kotlinx.coroutines.internal.z) l5; !kotlin.jvm.internal.l0.g(zVar, y2Var); zVar = zVar.m()) {
            kotlin.jvm.internal.l0.y(3, "T");
            if (zVar instanceof kotlinx.coroutines.internal.z) {
                s2 s2Var = (s2) zVar;
                try {
                    s2Var.x(th);
                } catch (Throwable th2) {
                    if (g0Var != null) {
                        kotlin.p.a(g0Var, th2);
                    } else {
                        g0Var = new g0("Exception in completion handler " + s2Var + " for " + this, th2);
                        kotlin.r2 r2Var = kotlin.r2.f19517a;
                    }
                }
            }
        }
        if (g0Var != null) {
            G0(g0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y(kotlin.coroutines.d<Object> dVar) {
        a aVar = new a(kotlin.coroutines.intrinsics.b.e(dVar), this);
        aVar.B();
        s.a(aVar, t0(new e3(aVar)));
        Object E = aVar.E();
        if (E == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y0(Object obj, Object obj2) {
        if (obj2 instanceof d0) {
            throw ((d0) obj2).f19951a;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z0(kotlinx.coroutines.selects.m<?> mVar, Object obj) {
        Object E0;
        do {
            E0 = E0();
            if (!(E0 instanceof e2)) {
                if (!(E0 instanceof d0)) {
                    E0 = u2.h(E0);
                }
                mVar.e(E0);
                return;
            }
        } while (i1(E0) < 0);
        mVar.f(t0(new d(mVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.d2] */
    private final void d1(q1 q1Var) {
        y2 y2Var = new y2();
        if (!q1Var.isActive()) {
            y2Var = new d2(y2Var);
        }
        androidx.concurrent.futures.a.a(f20632a, this, q1Var, y2Var);
    }

    private final Object e0(Object obj) {
        kotlinx.coroutines.internal.t0 t0Var;
        Object p12;
        kotlinx.coroutines.internal.t0 t0Var2;
        do {
            Object E0 = E0();
            if ((E0 instanceof e2) && (!(E0 instanceof c) || !((c) E0).g())) {
                p12 = p1(E0, new d0(k0(obj), false, 2, null));
                t0Var2 = u2.f20653c;
            } else {
                t0Var = u2.f20651a;
                return t0Var;
            }
        } while (p12 == t0Var2);
        return p12;
    }

    private final void e1(s2 s2Var) {
        s2Var.h(new y2());
        androidx.concurrent.futures.a.a(f20632a, this, s2Var, s2Var.m());
    }

    private final boolean f0(Throwable th) {
        if (K0()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        v D0 = D0();
        if (D0 != null && D0 != a3.f19846a) {
            if (D0.e(th) || z4) {
                return true;
            }
            return false;
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f1(kotlinx.coroutines.selects.m<?> mVar, Object obj) {
        if (!L0()) {
            mVar.e(kotlin.r2.f19517a);
        } else {
            mVar.f(t0(new e(mVar)));
        }
    }

    private final void i0(e2 e2Var, Object obj) {
        d0 d0Var;
        v D0 = D0();
        if (D0 != null) {
            D0.dispose();
            h1(a3.f19846a);
        }
        Throwable th = null;
        if (obj instanceof d0) {
            d0Var = (d0) obj;
        } else {
            d0Var = null;
        }
        if (d0Var != null) {
            th = d0Var.f19951a;
        }
        if (e2Var instanceof s2) {
            try {
                ((s2) e2Var).x(th);
                return;
            } catch (Throwable th2) {
                G0(new g0("Exception in completion handler " + e2Var + " for " + this, th2));
                return;
            }
        }
        y2 a5 = e2Var.a();
        if (a5 != null) {
            W0(a5, th);
        }
    }

    private final int i1(Object obj) {
        q1 q1Var;
        if (obj instanceof q1) {
            if (((q1) obj).isActive()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20632a;
            q1Var = u2.f20660j;
            if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, q1Var)) {
                return -1;
            }
            c1();
            return 1;
        }
        if (!(obj instanceof d2)) {
            return 0;
        }
        if (!androidx.concurrent.futures.a.a(f20632a, this, obj, ((d2) obj).a())) {
            return -1;
        }
        c1();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(c cVar, w wVar, Object obj) {
        w U0 = U0(wVar);
        if (U0 != null && r1(cVar, U0, obj)) {
            return;
        }
        W(n0(cVar, obj));
    }

    private final String j1(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f()) {
                return "Cancelling";
            }
            if (!cVar.g()) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof e2) {
            if (((e2) obj).isActive()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof d0) {
            return "Cancelled";
        }
        return "Completed";
    }

    private final Throwable k0(Object obj) {
        boolean z4;
        if (obj == null) {
            z4 = true;
        } else {
            z4 = obj instanceof Throwable;
        }
        if (z4) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new m2(g0(), null, this);
            }
            return th;
        }
        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((d3) obj).P();
    }

    public static /* synthetic */ CancellationException l1(t2 t2Var, Throwable th, String str, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i5 & 1) != 0) {
            str = null;
        }
        return t2Var.k1(th, str);
    }

    public static /* synthetic */ m2 m0(t2 t2Var, String str, Throwable th, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                str = null;
            }
            if ((i5 & 2) != 0) {
                th = null;
            }
            if (str == null) {
                str = t2Var.g0();
            }
            return new m2(str, th, t2Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    private final Object n0(c cVar, Object obj) {
        d0 d0Var;
        Throwable th;
        boolean f5;
        Throwable v02;
        if (obj instanceof d0) {
            d0Var = (d0) obj;
        } else {
            d0Var = null;
        }
        if (d0Var != null) {
            th = d0Var.f19951a;
        } else {
            th = null;
        }
        synchronized (cVar) {
            f5 = cVar.f();
            List<Throwable> i5 = cVar.i(th);
            v02 = v0(cVar, i5);
            if (v02 != null) {
                V(v02, i5);
            }
        }
        boolean z4 = false;
        if (v02 != null && v02 != th) {
            obj = new d0(v02, false, 2, null);
        }
        if (v02 != null) {
            if (f0(v02) || F0(v02)) {
                z4 = true;
            }
            if (z4) {
                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((d0) obj).b();
            }
        }
        if (!f5) {
            a1(v02);
        }
        b1(obj);
        androidx.concurrent.futures.a.a(f20632a, this, cVar, u2.g(obj));
        i0(cVar, obj);
        return obj;
    }

    private final boolean n1(e2 e2Var, Object obj) {
        if (!androidx.concurrent.futures.a.a(f20632a, this, e2Var, u2.g(obj))) {
            return false;
        }
        a1(null);
        b1(obj);
        i0(e2Var, obj);
        return true;
    }

    private final w o0(e2 e2Var) {
        w wVar = e2Var instanceof w ? (w) e2Var : null;
        if (wVar != null) {
            return wVar;
        }
        y2 a5 = e2Var.a();
        if (a5 != null) {
            return U0(a5);
        }
        return null;
    }

    private final boolean o1(e2 e2Var, Throwable th) {
        y2 C0 = C0(e2Var);
        if (C0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.a.a(f20632a, this, e2Var, new c(C0, false, th))) {
            return false;
        }
        V0(C0, th);
        return true;
    }

    private final Object p1(Object obj, Object obj2) {
        kotlinx.coroutines.internal.t0 t0Var;
        kotlinx.coroutines.internal.t0 t0Var2;
        if (!(obj instanceof e2)) {
            t0Var2 = u2.f20651a;
            return t0Var2;
        }
        if (((obj instanceof q1) || (obj instanceof s2)) && !(obj instanceof w) && !(obj2 instanceof d0)) {
            if (n1((e2) obj, obj2)) {
                return obj2;
            }
            t0Var = u2.f20653c;
            return t0Var;
        }
        return q1((e2) obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object q1(e2 e2Var, Object obj) {
        c cVar;
        d0 d0Var;
        kotlinx.coroutines.internal.t0 t0Var;
        kotlinx.coroutines.internal.t0 t0Var2;
        kotlinx.coroutines.internal.t0 t0Var3;
        y2 C0 = C0(e2Var);
        if (C0 == null) {
            t0Var3 = u2.f20653c;
            return t0Var3;
        }
        ?? r22 = 0;
        if (e2Var instanceof c) {
            cVar = (c) e2Var;
        } else {
            cVar = null;
        }
        boolean z4 = false;
        if (cVar == null) {
            cVar = new c(C0, false, null);
        }
        k1.h hVar = new k1.h();
        synchronized (cVar) {
            if (cVar.g()) {
                t0Var2 = u2.f20651a;
                return t0Var2;
            }
            cVar.j(true);
            if (cVar != e2Var && !androidx.concurrent.futures.a.a(f20632a, this, e2Var, cVar)) {
                t0Var = u2.f20653c;
                return t0Var;
            }
            boolean f5 = cVar.f();
            if (obj instanceof d0) {
                d0Var = (d0) obj;
            } else {
                d0Var = null;
            }
            if (d0Var != null) {
                cVar.b(d0Var.f19951a);
            }
            Throwable e5 = cVar.e();
            if (!f5) {
                z4 = true;
            }
            if (Boolean.valueOf(z4).booleanValue()) {
                r22 = e5;
            }
            hVar.element = r22;
            kotlin.r2 r2Var = kotlin.r2.f19517a;
            if (r22 != 0) {
                V0(C0, r22);
            }
            w o02 = o0(e2Var);
            if (o02 != null && r1(cVar, o02, obj)) {
                return u2.f20652b;
            }
            return n0(cVar, obj);
        }
    }

    private final boolean r1(c cVar, w wVar, Object obj) {
        while (l2.a.g(wVar.f20671e, false, false, new b(this, cVar, wVar, obj), 1, null) == a3.f19846a) {
            wVar = U0(wVar);
            if (wVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable u0(Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var != null) {
            return d0Var.f19951a;
        }
        return null;
    }

    private final Throwable v0(c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z4;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (!cVar.f()) {
                return null;
            }
            return new m2(g0(), null, this);
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof t3) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof t3)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    protected static /* synthetic */ void y0() {
    }

    @Override // kotlinx.coroutines.x
    public final void A(@p4.l d3 d3Var) {
        c0(d3Var);
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    public final v A0(@p4.l x xVar) {
        n1 g5 = l2.a.g(this, true, false, new w(xVar), 2, null);
        kotlin.jvm.internal.l0.n(g5, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (v) g5;
    }

    @p4.m
    public final v D0() {
        return (v) f20633b.get(this);
    }

    @p4.m
    public final Object E0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20632a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof kotlinx.coroutines.internal.l0)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.l0) obj).b(this);
        }
    }

    protected boolean F0(@p4.l Throwable th) {
        return false;
    }

    public void G0(@p4.l Throwable th) {
        throw th;
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public l2 H(@p4.l l2 l2Var) {
        return l2.a.j(this, l2Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H0(@p4.m l2 l2Var) {
        if (l2Var == null) {
            h1(a3.f19846a);
            return;
        }
        l2Var.start();
        v A0 = l2Var.A0(this);
        h1(A0);
        if (d()) {
            A0.dispose();
            h1(a3.f19846a);
        }
    }

    public final boolean J0() {
        return E0() instanceof d0;
    }

    protected boolean K0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.d3
    @p4.l
    public CancellationException P() {
        CancellationException cancellationException;
        Object E0 = E0();
        CancellationException cancellationException2 = null;
        if (E0 instanceof c) {
            cancellationException = ((c) E0).e();
        } else if (E0 instanceof d0) {
            cancellationException = ((d0) E0).f19951a;
        } else if (!(E0 instanceof e2)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + E0).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new m2("Parent job is " + j1(E0), cancellationException, this);
        }
        return cancellationException2;
    }

    public final boolean Q0(@p4.m Object obj) {
        Object p12;
        kotlinx.coroutines.internal.t0 t0Var;
        kotlinx.coroutines.internal.t0 t0Var2;
        do {
            p12 = p1(E0(), obj);
            t0Var = u2.f20651a;
            if (p12 == t0Var) {
                return false;
            }
            if (p12 == u2.f20652b) {
                return true;
            }
            t0Var2 = u2.f20653c;
        } while (p12 == t0Var2);
        W(p12);
        return true;
    }

    @p4.m
    public final Object R0(@p4.m Object obj) {
        Object p12;
        kotlinx.coroutines.internal.t0 t0Var;
        kotlinx.coroutines.internal.t0 t0Var2;
        do {
            p12 = p1(E0(), obj);
            t0Var = u2.f20651a;
            if (p12 != t0Var) {
                t0Var2 = u2.f20653c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, u0(obj));
            }
        } while (p12 == t0Var2);
        return p12;
    }

    @p4.l
    public String T0() {
        return x0.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W(@p4.m Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.m
    public final Object X(@p4.l kotlin.coroutines.d<Object> dVar) {
        Object E0;
        do {
            E0 = E0();
            if (!(E0 instanceof e2)) {
                if (!(E0 instanceof d0)) {
                    return u2.h(E0);
                }
                throw ((d0) E0).f19951a;
            }
        } while (i1(E0) < 0);
        return Y(dVar);
    }

    public final boolean Z(@p4.m Throwable th) {
        return c0(th);
    }

    @Override // kotlinx.coroutines.l2, kotlinx.coroutines.channels.d
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(Throwable th) {
        Throwable m2Var;
        if (th == null || (m2Var = l1(this, th, null, 1, null)) == null) {
            m2Var = new m2(g0(), null, this);
        }
        d0(m2Var);
        return true;
    }

    protected void a1(@p4.m Throwable th) {
    }

    @Override // kotlinx.coroutines.l2
    @p4.m
    public final Object b0(@p4.l kotlin.coroutines.d<? super kotlin.r2> dVar) {
        if (!L0()) {
            p2.z(dVar.getContext());
            return kotlin.r2.f19517a;
        }
        Object M0 = M0(dVar);
        if (M0 == kotlin.coroutines.intrinsics.b.l()) {
            return M0;
        }
        return kotlin.r2.f19517a;
    }

    protected void b1(@p4.m Object obj) {
    }

    public final boolean c0(@p4.m Object obj) {
        Object obj2;
        kotlinx.coroutines.internal.t0 t0Var;
        kotlinx.coroutines.internal.t0 t0Var2;
        kotlinx.coroutines.internal.t0 t0Var3;
        obj2 = u2.f20651a;
        if (z0() && (obj2 = e0(obj)) == u2.f20652b) {
            return true;
        }
        t0Var = u2.f20651a;
        if (obj2 == t0Var) {
            obj2 = P0(obj);
        }
        t0Var2 = u2.f20651a;
        if (obj2 == t0Var2 || obj2 == u2.f20652b) {
            return true;
        }
        t0Var3 = u2.f20654d;
        if (obj2 == t0Var3) {
            return false;
        }
        W(obj2);
        return true;
    }

    protected void c1() {
    }

    @Override // kotlinx.coroutines.l2, kotlinx.coroutines.channels.g0
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        l2.a.a(this);
    }

    @Override // kotlinx.coroutines.l2
    public final boolean d() {
        return !(E0() instanceof e2);
    }

    public void d0(@p4.l Throwable th) {
        c0(th);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R fold(R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) l2.a.d(this, r5, pVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.l
    public String g0() {
        return "Job was cancelled";
    }

    public final void g1(@p4.l s2 s2Var) {
        Object E0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        q1 q1Var;
        do {
            E0 = E0();
            if (E0 instanceof s2) {
                if (E0 != s2Var) {
                    return;
                }
                atomicReferenceFieldUpdater = f20632a;
                q1Var = u2.f20660j;
            } else {
                if ((E0 instanceof e2) && ((e2) E0).a() != null) {
                    s2Var.s();
                    return;
                }
                return;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, E0, q1Var));
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.m
    public <E extends g.b> E get(@p4.l g.c<E> cVar) {
        return (E) l2.a.e(this, cVar);
    }

    @Override // kotlin.coroutines.g.b
    @p4.l
    public final g.c<?> getKey() {
        return l2.U;
    }

    @Override // kotlinx.coroutines.l2
    @p4.m
    public l2 getParent() {
        v D0 = D0();
        if (D0 != null) {
            return D0.getParent();
        }
        return null;
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    public final n1 h(boolean z4, boolean z5, @p4.l v3.l<? super Throwable, kotlin.r2> lVar) {
        d0 d0Var;
        s2 S0 = S0(lVar, z4);
        while (true) {
            Object E0 = E0();
            if (E0 instanceof q1) {
                q1 q1Var = (q1) E0;
                if (q1Var.isActive()) {
                    if (androidx.concurrent.futures.a.a(f20632a, this, E0, S0)) {
                        return S0;
                    }
                } else {
                    d1(q1Var);
                }
            } else {
                Throwable th = null;
                if (E0 instanceof e2) {
                    y2 a5 = ((e2) E0).a();
                    if (a5 == null) {
                        kotlin.jvm.internal.l0.n(E0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        e1((s2) E0);
                    } else {
                        n1 n1Var = a3.f19846a;
                        if (z4 && (E0 instanceof c)) {
                            synchronized (E0) {
                                th = ((c) E0).e();
                                if (th == null || ((lVar instanceof w) && !((c) E0).g())) {
                                    if (U(E0, a5, S0)) {
                                        if (th == null) {
                                            return S0;
                                        }
                                        n1Var = S0;
                                    }
                                }
                                kotlin.r2 r2Var = kotlin.r2.f19517a;
                            }
                        }
                        if (th != null) {
                            if (z5) {
                                lVar.invoke(th);
                            }
                            return n1Var;
                        }
                        if (U(E0, a5, S0)) {
                            return S0;
                        }
                    }
                } else {
                    if (z5) {
                        if (E0 instanceof d0) {
                            d0Var = (d0) E0;
                        } else {
                            d0Var = null;
                        }
                        if (d0Var != null) {
                            th = d0Var.f19951a;
                        }
                        lVar.invoke(th);
                    }
                    return a3.f19846a;
                }
            }
        }
    }

    public boolean h0(@p4.l Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (c0(th) && w0()) {
            return true;
        }
        return false;
    }

    public final void h1(@p4.m v vVar) {
        f20633b.set(this, vVar);
    }

    @Override // kotlinx.coroutines.l2
    public boolean isActive() {
        Object E0 = E0();
        if ((E0 instanceof e2) && ((e2) E0).isActive()) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.l2
    public final boolean isCancelled() {
        Object E0 = E0();
        if (!(E0 instanceof d0) && (!(E0 instanceof c) || !((c) E0).f())) {
            return false;
        }
        return true;
    }

    @p4.l
    protected final CancellationException k1(@p4.l Throwable th, @p4.m String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = g0();
            }
            cancellationException = new m2(str, th, this);
        }
        return cancellationException;
    }

    @p4.l
    public final m2 l0(@p4.m String str, @p4.m Throwable th) {
        if (str == null) {
            str = g0();
        }
        return new m2(str, th, this);
    }

    @p4.l
    @g2
    public final String m1() {
        return T0() + '{' + j1(E0()) + '}';
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g minusKey(@p4.l g.c<?> cVar) {
        return l2.a.h(this, cVar);
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    public final kotlin.sequences.m<l2> o() {
        kotlin.sequences.m<l2> b5;
        b5 = kotlin.sequences.q.b(new g(null));
        return b5;
    }

    @p4.m
    public final Object p0() {
        Object E0 = E0();
        if (!(E0 instanceof e2)) {
            if (!(E0 instanceof d0)) {
                return u2.h(E0);
            }
            throw ((d0) E0).f19951a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g plus(@p4.l kotlin.coroutines.g gVar) {
        return l2.a.i(this, gVar);
    }

    @p4.m
    public final Throwable q() {
        Object E0 = E0();
        if (!(E0 instanceof e2)) {
            return u0(E0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @p4.m
    protected final Throwable q0() {
        Object E0 = E0();
        if (E0 instanceof c) {
            Throwable e5 = ((c) E0).e();
            if (e5 == null) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            return e5;
        }
        if (!(E0 instanceof e2)) {
            if (E0 instanceof d0) {
                return ((d0) E0).f19951a;
            }
            return null;
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    public final kotlinx.coroutines.selects.e r0() {
        j jVar = j.INSTANCE;
        kotlin.jvm.internal.l0.n(jVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new kotlinx.coroutines.selects.f(this, (v3.q) kotlin.jvm.internal.u1.q(jVar, 3), null, 4, null);
    }

    protected final boolean s0() {
        Object E0 = E0();
        return (E0 instanceof d0) && ((d0) E0).a();
    }

    @Override // kotlinx.coroutines.l2
    public final boolean start() {
        int i12;
        do {
            i12 = i1(E0());
            if (i12 == 0) {
                return false;
            }
        } while (i12 != 1);
        return true;
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    public final n1 t0(@p4.l v3.l<? super Throwable, kotlin.r2> lVar) {
        return h(false, true, lVar);
    }

    @p4.l
    public String toString() {
        return m1() + '@' + x0.b(this);
    }

    public boolean w0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.l
    public final kotlinx.coroutines.selects.g<?> x0() {
        h hVar = h.INSTANCE;
        kotlin.jvm.internal.l0.n(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        v3.q qVar = (v3.q) kotlin.jvm.internal.u1.q(hVar, 3);
        i iVar = i.INSTANCE;
        kotlin.jvm.internal.l0.n(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.h(this, qVar, (v3.q) kotlin.jvm.internal.u1.q(iVar, 3), null, 8, null);
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    public final CancellationException y() {
        Object E0 = E0();
        if (E0 instanceof c) {
            Throwable e5 = ((c) E0).e();
            if (e5 != null) {
                CancellationException k12 = k1(e5, x0.a(this) + " is cancelling");
                if (k12 != null) {
                    return k12;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(E0 instanceof e2)) {
            if (E0 instanceof d0) {
                return l1(this, ((d0) E0).f19951a, null, 1, null);
            }
            return new m2(x0.a(this) + " has completed normally", null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public boolean z0() {
        return false;
    }

    @Override // kotlinx.coroutines.l2, kotlinx.coroutines.channels.d
    public void cancel(@p4.m CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new m2(g0(), null, this);
        }
        d0(cancellationException);
    }
}
