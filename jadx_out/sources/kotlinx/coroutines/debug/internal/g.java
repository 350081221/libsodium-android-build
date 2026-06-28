package kotlinx.coroutines.debug.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.umeng.analytics.pro.bi;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.a0;
import kotlin.collections.z0;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.q1;
import kotlin.r2;
import kotlin.sequences.u;
import kotlin.text.e0;
import kotlin.text.x;
import kotlin.u0;
import kotlinx.coroutines.internal.p0;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.t2;
import org.ccil.cowan.tagsoup.p;
import u3.w;

@i0(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0081\u0001B\n\b\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J4\u0010\u0011\u001a\u00020\u0004*\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\t2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J9\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\b\b\u0000\u0010\u0012*\u00020\u00012\u001e\b\u0004\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u0013H\u0082\bJ\f\u0010\u0019\u001a\u00020\u000f*\u00020\u0001H\u0002J\u0010\u0010\u001a\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u001e\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017H\u0002J.\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00172\u0006\u0010!\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017H\u0002J?\u0010+\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0*2\u0006\u0010'\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0(2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017H\u0002¢\u0006\u0004\b+\u0010,J3\u0010.\u001a\u00020&2\u0006\u0010-\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0(2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017H\u0002¢\u0006\u0004\b.\u0010/J\u001c\u00102\u001a\u00020\u00042\n\u00101\u001a\u0006\u0012\u0002\b\u0003002\u0006\u0010!\u001a\u00020\u000fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u0002032\u0006\u0010!\u001a\u00020\u000fH\u0002J\u000f\u00104\u001a\u0004\u0018\u000103*\u000203H\u0082\u0010J(\u00106\u001a\u00020\u00042\n\u00105\u001a\u0006\u0012\u0002\b\u00030\u00142\n\u00101\u001a\u0006\u0012\u0002\b\u0003002\u0006\u0010!\u001a\u00020\u000fH\u0002J\u0016\u00107\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014*\u0006\u0012\u0002\b\u000300H\u0002J\u0013\u00108\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014*\u000203H\u0082\u0010J\u0012\u0010:\u001a\u000209*\b\u0012\u0004\u0012\u00020\u001e0\u0017H\u0002J,\u0010<\u001a\b\u0012\u0004\u0012\u00028\u000000\"\u0004\b\u0000\u001062\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u0000002\b\u00101\u001a\u0004\u0018\u000109H\u0002J\u0014\u0010=\u001a\u00020\u00042\n\u00105\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0002J'\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017\"\b\b\u0000\u00106*\u00020>2\u0006\u0010?\u001a\u00028\u0000H\u0002¢\u0006\u0004\b@\u0010AJ\u0006\u0010B\u001a\u00020\u0004J\u0006\u0010C\u001a\u00020\u0004J\u000e\u0010E\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\bJ\u0013\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0004\bF\u0010GJ\u000e\u0010J\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020HJ\f\u0010K\u001a\b\u0012\u0004\u0012\u00020H0\u0017J\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u0017J\u000e\u0010N\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bJ\"\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00172\u0006\u0010I\u001a\u00020H2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017J\u001b\u0010P\u001a\u00020\u00042\n\u00101\u001a\u0006\u0012\u0002\b\u000300H\u0000¢\u0006\u0004\bP\u0010QJ\u001b\u0010R\u001a\u00020\u00042\n\u00101\u001a\u0006\u0012\u0002\b\u000300H\u0000¢\u0006\u0004\bR\u0010QJ)\u0010S\u001a\b\u0012\u0004\u0012\u00028\u000000\"\u0004\b\u0000\u001062\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0000¢\u0006\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\\R$\u0010`\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\u0004\u0012\u00020\u00030^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010_R\"\u0010f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010i\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010a\u001a\u0004\bg\u0010c\"\u0004\bh\u0010eR\"\u0010k\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010jR \u0010l\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\n0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010_R\u001e\u0010p\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001e\u0010u\u001a\u00020\u000f*\u00020\b8BX\u0082\u0004¢\u0006\f\u0012\u0004\bs\u0010t\u001a\u0004\bq\u0010rR\u0018\u0010x\u001a\u00020\u0003*\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010z\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\by\u0010cR\u000b\u0010|\u001a\u00020{8\u0002X\u0082\u0004R\u000b\u0010~\u001a\u00020}8\u0002X\u0082\u0004¨\u0006\u0082\u0001"}, d2 = {"Lkotlinx/coroutines/debug/internal/g;", "", "Lkotlin/Function1;", "", "Lkotlin/r2;", bi.aL, "M", "N", "Lkotlinx/coroutines/l2;", "", "Lkotlinx/coroutines/debug/internal/e;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", p.f21289y, "d", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/g$a;", "Lkotlin/coroutines/g;", "create", "", "i", "P", "y", "Ljava/io/PrintStream;", "out", "j", "Ljava/lang/StackTraceElement;", "frames", "D", "state", "Ljava/lang/Thread;", "thread", "coroutineTrace", "n", "", "indexOfResumeWith", "", "actualTrace", "Lkotlin/u0;", "o", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/u0;", "frameIndex", bi.aA, "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/coroutines/d;", TypedValues.AttributesType.S_FRAME, "S", "Lkotlin/coroutines/jvm/internal/e;", "I", "owner", "T", "B", "C", "Lkotlinx/coroutines/debug/internal/m;", "O", "completion", "e", "E", "", "throwable", "J", "(Ljava/lang/Throwable;)Ljava/util/List;", "x", "Q", ServiceManagerNative.JOB, "w", bi.aJ, "()[Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/d;", "info", "m", socket.g.f22386a, "Lkotlinx/coroutines/debug/internal/j;", "k", "f", "l", "G", "(Lkotlin/coroutines/d;)V", "H", "F", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "b", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "Ljava/text/SimpleDateFormat;", "c", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/lang/Thread;", "weakRefCleanerThread", "Lkotlinx/coroutines/debug/internal/b;", "Lkotlinx/coroutines/debug/internal/b;", "capturedCoroutinesMap", "Z", "v", "()Z", "L", "(Z)V", "sanitizeStackTraces", bi.aK, "K", "enableCreationStackTraces", "Lv3/l;", "dynamicAttach", "callerInfoCache", "", "q", "()Ljava/util/Set;", "capturedCoroutines", "r", "(Lkotlinx/coroutines/l2;)Ljava/lang/String;", "getDebugString$annotations", "(Lkotlinx/coroutines/l2;)V", "debugString", "A", "(Ljava/lang/StackTraceElement;)Z", "isInternalMethod", bi.aG, "isInstalled", "Lkotlinx/atomicfu/AtomicInt;", "installations", "Lkotlinx/atomicfu/AtomicLong;", "sequenceNumber", "<init>", "()V", bi.ay, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,609:1\n144#1:627\n145#1,4:629\n150#1,5:634\n144#1:639\n145#1,4:641\n150#1,5:646\n1#2:610\n1#2:628\n1#2:640\n766#3:611\n857#3,2:612\n1208#3,2:614\n1238#3,4:616\n1855#3,2:654\n350#3,7:662\n1819#3,8:669\n603#4:620\n603#4:633\n603#4:645\n603#4:651\n1295#4,2:652\n37#5,2:621\n37#5,2:623\n37#5,2:625\n1627#6,6:656\n1735#6,6:677\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n238#1:627\n238#1:629,4\n238#1:634,5\n245#1:639\n245#1:641,4\n245#1:646,5\n238#1:628\n245#1:640\n104#1:611\n104#1:612,2\n105#1:614,2\n105#1:616,4\n299#1:654,2\n408#1:662,7\n496#1:669,8\n148#1:620\n238#1:633\n245#1:645\n279#1:651\n280#1:652,2\n204#1:621,2\n205#1:623,2\n206#1:625,2\n347#1:656,6\n547#1:677,6\n*E\n"})
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final g f19994a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final StackTraceElement f19995b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final SimpleDateFormat f19996c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private static Thread f19997d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private static final kotlinx.coroutines.debug.internal.b<a<?>, Boolean> f19998e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f19999f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f20000g;

    /* renamed from: h, reason: collision with root package name */
    @p4.m
    private static final v3.l<Boolean, r2> f20001h;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private static final kotlinx.coroutines.debug.internal.b<kotlin.coroutines.jvm.internal.e, kotlinx.coroutines.debug.internal.e> f20002i;

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private static final b f20003j;

    /* renamed from: k, reason: collision with root package name */
    @p4.l
    private static final c f20004k;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/debug/internal/g$a;", "T", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/e;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/d1;", "result", "Lkotlin/r2;", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", bi.ay, "Lkotlin/coroutines/d;", "delegate", "Lkotlinx/coroutines/debug/internal/e;", "b", "Lkotlinx/coroutines/debug/internal/e;", "info", "Lkotlinx/coroutines/debug/internal/m;", "()Lkotlinx/coroutines/debug/internal/m;", TypedValues.AttributesType.S_FRAME, "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "<init>", "(Lkotlin/coroutines/d;Lkotlinx/coroutines/debug/internal/e;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a<T> implements kotlin.coroutines.d<T>, kotlin.coroutines.jvm.internal.e {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        @u3.e
        public final kotlin.coroutines.d<T> f20005a;

        /* renamed from: b, reason: collision with root package name */
        @p4.l
        @u3.e
        public final kotlinx.coroutines.debug.internal.e f20006b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@p4.l kotlin.coroutines.d<? super T> dVar, @p4.l kotlinx.coroutines.debug.internal.e eVar) {
            this.f20005a = dVar;
            this.f20006b = eVar;
        }

        private final m b() {
            return this.f20006b.d();
        }

        @Override // kotlin.coroutines.jvm.internal.e
        @p4.m
        public kotlin.coroutines.jvm.internal.e getCallerFrame() {
            m b5 = b();
            if (b5 != null) {
                return b5.getCallerFrame();
            }
            return null;
        }

        @Override // kotlin.coroutines.d
        @p4.l
        public kotlin.coroutines.g getContext() {
            return this.f20005a.getContext();
        }

        @Override // kotlin.coroutines.jvm.internal.e
        @p4.m
        public StackTraceElement getStackTraceElement() {
            m b5 = b();
            if (b5 != null) {
                return b5.getStackTraceElement();
            }
            return null;
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(@p4.l Object obj) {
            g.f19994a.E(this);
            this.f20005a.resumeWith(obj);
        }

        @p4.l
        public String toString() {
            return this.f20005a.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private static final AtomicIntegerFieldUpdater f20007a = AtomicIntegerFieldUpdater.newUpdater(b.class, "installations");

        @w
        private volatile int installations;

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private static final AtomicLongFieldUpdater f20008a = AtomicLongFieldUpdater.newUpdater(c.class, "sequenceNumber");

        @w
        private volatile long sequenceNumber;

        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/g$a;", "owner", "invoke", "(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/g$f", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,609:1\n1#2:610\n238#3:611\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class d extends n0 implements v3.l<a<?>, kotlinx.coroutines.debug.internal.d> {
        public d() {
            super(1);
        }

        @Override // v3.l
        @p4.m
        public final kotlinx.coroutines.debug.internal.d invoke(@p4.l a<?> aVar) {
            kotlin.coroutines.g c5;
            if (g.f19994a.y(aVar) || (c5 = aVar.f20006b.c()) == null) {
                return null;
            }
            return new kotlinx.coroutines.debug.internal.d(aVar.f20006b, c5);
        }
    }

    @i0(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", bi.ay, "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,328:1\n148#2:329\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int l5;
            l5 = kotlin.comparisons.g.l(Long.valueOf(((a) t5).f20006b.f19988b), Long.valueOf(((a) t6).f20006b.f19988b));
            return l5;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/g$a;", "owner", "invoke", "(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,609:1\n1#2:610\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class f<R> extends n0 implements v3.l<a<?>, R> {
        final /* synthetic */ v3.p<a<?>, kotlin.coroutines.g, R> $create;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(v3.p<? super a<?>, ? super kotlin.coroutines.g, ? extends R> pVar) {
            super(1);
            this.$create = pVar;
        }

        @Override // v3.l
        @p4.m
        public final R invoke(@p4.l a<?> aVar) {
            kotlin.coroutines.g c5;
            if (g.f19994a.y(aVar) || (c5 = aVar.f20006b.c()) == null) {
                return null;
            }
            return this.$create.invoke(aVar, c5);
        }
    }

    @i0(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", bi.ay, "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,328:1\n279#2:329\n*E\n"})
    /* renamed from: kotlinx.coroutines.debug.internal.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0574g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int l5;
            l5 = kotlin.comparisons.g.l(Long.valueOf(((a) t5).f20006b.f19988b), Long.valueOf(((a) t6).f20006b.f19988b));
            return l5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/debug/internal/g$a;", "it", "", "invoke", "(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class h extends n0 implements v3.l<a<?>, Boolean> {
        public static final h INSTANCE = new h();

        h() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final Boolean invoke(@p4.l a<?> aVar) {
            return Boolean.valueOf(!g.f19994a.y(aVar));
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/g$a;", "owner", "invoke", "(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/g$f", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,609:1\n1#2:610\n245#3:611\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class i extends n0 implements v3.l<a<?>, kotlinx.coroutines.debug.internal.j> {
        public i() {
            super(1);
        }

        @Override // v3.l
        @p4.m
        public final kotlinx.coroutines.debug.internal.j invoke(@p4.l a<?> aVar) {
            kotlin.coroutines.g c5;
            if (g.f19994a.y(aVar) || (c5 = aVar.f20006b.c()) == null) {
                return null;
            }
            return new kotlinx.coroutines.debug.internal.j(aVar.f20006b, c5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class j extends n0 implements v3.a<r2> {
        public static final j INSTANCE = new j();

        j() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            g.f20002i.i();
        }
    }

    static {
        g gVar = new g();
        f19994a = gVar;
        f19995b = new _COROUTINE.a().b();
        f19996c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        kotlin.jvm.internal.w wVar = null;
        f19998e = new kotlinx.coroutines.debug.internal.b<>(false, 1, null);
        f19999f = true;
        f20000g = true;
        f20001h = gVar.t();
        f20002i = new kotlinx.coroutines.debug.internal.b<>(true);
        f20003j = new b(wVar);
        f20004k = new c(wVar);
    }

    private g() {
    }

    private final boolean A(StackTraceElement stackTraceElement) {
        boolean s22;
        s22 = e0.s2(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
        return s22;
    }

    private final a<?> B(kotlin.coroutines.d<?> dVar) {
        kotlin.coroutines.jvm.internal.e eVar = dVar instanceof kotlin.coroutines.jvm.internal.e ? (kotlin.coroutines.jvm.internal.e) dVar : null;
        if (eVar != null) {
            return C(eVar);
        }
        return null;
    }

    private final a<?> C(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof a)) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return null;
            }
        }
        return (a) eVar;
    }

    private final void D(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(a<?> aVar) {
        kotlin.coroutines.jvm.internal.e I;
        f19998e.remove(aVar);
        kotlin.coroutines.jvm.internal.e f5 = aVar.f20006b.f();
        if (f5 != null && (I = I(f5)) != null) {
            f20002i.remove(I);
        }
    }

    private final kotlin.coroutines.jvm.internal.e I(kotlin.coroutines.jvm.internal.e eVar) {
        do {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return null;
            }
        } while (eVar.getStackTraceElement() == null);
        return eVar;
    }

    private final <T extends Throwable> List<StackTraceElement> J(T t5) {
        StackTraceElement[] stackTrace = t5.getStackTrace();
        int length = stackTrace.length;
        int i5 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i6 = length2 - 1;
                if (l0.g(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i5 = length2;
                    break;
                }
                if (i6 < 0) {
                    break;
                }
                length2 = i6;
            }
        }
        int i7 = i5 + 1;
        if (!f19999f) {
            int i8 = length - i7;
            ArrayList arrayList = new ArrayList(i8);
            for (int i9 = 0; i9 < i8; i9++) {
                arrayList.add(stackTrace[i9 + i7]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i7) + 1);
        while (i7 < length) {
            if (A(stackTrace[i7])) {
                arrayList2.add(stackTrace[i7]);
                int i10 = i7 + 1;
                while (i10 < length && A(stackTrace[i10])) {
                    i10++;
                }
                int i11 = i10 - 1;
                int i12 = i11;
                while (i12 > i7 && stackTrace[i12].getFileName() == null) {
                    i12--;
                }
                if (i12 > i7 && i12 < i11) {
                    arrayList2.add(stackTrace[i12]);
                }
                arrayList2.add(stackTrace[i11]);
                i7 = i10;
            } else {
                arrayList2.add(stackTrace[i7]);
                i7++;
            }
        }
        return arrayList2;
    }

    private final void M() {
        f19997d = kotlin.concurrent.b.c(false, true, null, "Coroutines Debugger Cleaner", 0, j.INSTANCE, 21, null);
    }

    private final void N() {
        Thread thread = f19997d;
        if (thread == null) {
            return;
        }
        f19997d = null;
        thread.interrupt();
        thread.join();
    }

    private final m O(List<StackTraceElement> list) {
        m mVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                mVar = new m(mVar, listIterator.previous());
            }
        }
        return new m(mVar, f19995b);
    }

    private final String P(Object obj) {
        String b5;
        b5 = kotlinx.coroutines.debug.internal.h.b(obj.toString());
        return b5;
    }

    private final void R(kotlin.coroutines.jvm.internal.e eVar, String str) {
        kotlin.coroutines.jvm.internal.e eVar2;
        boolean z4;
        if (!z()) {
            return;
        }
        kotlinx.coroutines.debug.internal.b<kotlin.coroutines.jvm.internal.e, kotlinx.coroutines.debug.internal.e> bVar = f20002i;
        kotlinx.coroutines.debug.internal.e remove = bVar.remove(eVar);
        if (remove != null) {
            z4 = false;
        } else {
            a<?> C = C(eVar);
            if (C != null && (remove = C.f20006b) != null) {
                kotlin.coroutines.jvm.internal.e f5 = remove.f();
                if (f5 != null) {
                    eVar2 = I(f5);
                } else {
                    eVar2 = null;
                }
                if (eVar2 != null) {
                    bVar.remove(eVar2);
                }
                z4 = true;
            } else {
                return;
            }
        }
        l0.n(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
        remove.j(str, (kotlin.coroutines.d) eVar, z4);
        kotlin.coroutines.jvm.internal.e I = I(eVar);
        if (I == null) {
            return;
        }
        bVar.put(I, remove);
    }

    private final void S(kotlin.coroutines.d<?> dVar, String str) {
        kotlin.coroutines.jvm.internal.e eVar;
        if (!z()) {
            return;
        }
        if (l0.g(str, kotlinx.coroutines.debug.internal.f.f19992b) && a0.f19080g.j(1, 3, 30)) {
            if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
                eVar = (kotlin.coroutines.jvm.internal.e) dVar;
            } else {
                eVar = null;
            }
            if (eVar == null) {
                return;
            }
            R(eVar, str);
            return;
        }
        a<?> B = B(dVar);
        if (B == null) {
            return;
        }
        T(B, dVar, str);
    }

    private final void T(a<?> aVar, kotlin.coroutines.d<?> dVar, String str) {
        if (!z()) {
            return;
        }
        aVar.f20006b.j(str, dVar, true);
    }

    private final void d(l2 l2Var, Map<l2, kotlinx.coroutines.debug.internal.e> map, StringBuilder sb, String str) {
        Object D2;
        kotlinx.coroutines.debug.internal.e eVar = map.get(l2Var);
        if (eVar == null) {
            if (!(l2Var instanceof p0)) {
                sb.append(str + r(l2Var) + '\n');
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('\t');
                str = sb2.toString();
            }
        } else {
            D2 = kotlin.collections.e0.D2(eVar.h());
            sb.append(str + r(l2Var) + ", continuation is " + eVar.g() + " at line " + ((StackTraceElement) D2) + '\n');
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append('\t');
            str = sb3.toString();
        }
        Iterator<l2> it = l2Var.o().iterator();
        while (it.hasNext()) {
            d(it.next(), map, sb, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> kotlin.coroutines.d<T> e(kotlin.coroutines.d<? super T> dVar, m mVar) {
        if (!z()) {
            return dVar;
        }
        a<?> aVar = new a<>(dVar, new kotlinx.coroutines.debug.internal.e(dVar.getContext(), mVar, c.f20008a.incrementAndGet(f20004k)));
        kotlinx.coroutines.debug.internal.b<a<?>, Boolean> bVar = f19998e;
        bVar.put(aVar, Boolean.TRUE);
        if (!z()) {
            bVar.clear();
        }
        return aVar;
    }

    private final <R> List<R> i(v3.p<? super a<?>, ? super kotlin.coroutines.g, ? extends R> pVar) {
        kotlin.sequences.m x12;
        kotlin.sequences.m K2;
        kotlin.sequences.m p12;
        List<R> c32;
        if (z()) {
            x12 = kotlin.collections.e0.x1(q());
            K2 = u.K2(x12, new e());
            p12 = u.p1(K2, new f(pVar));
            c32 = u.c3(p12);
            return c32;
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    private final void j(PrintStream printStream) {
        kotlin.sequences.m x12;
        kotlin.sequences.m p02;
        kotlin.sequences.m<a> K2;
        String g5;
        if (z()) {
            printStream.print("Coroutines dump " + f19996c.format(Long.valueOf(System.currentTimeMillis())));
            x12 = kotlin.collections.e0.x1(q());
            p02 = u.p0(x12, h.INSTANCE);
            K2 = u.K2(p02, new C0574g());
            for (a aVar : K2) {
                kotlinx.coroutines.debug.internal.e eVar = aVar.f20006b;
                List<StackTraceElement> h5 = eVar.h();
                g gVar = f19994a;
                List<StackTraceElement> n5 = gVar.n(eVar.g(), eVar.lastObservedThread, h5);
                if (l0.g(eVar.g(), kotlinx.coroutines.debug.internal.f.f19992b) && n5 == h5) {
                    g5 = eVar.g() + " (Last suspension stacktrace, not an actual stacktrace)";
                } else {
                    g5 = eVar.g();
                }
                printStream.print("\n\nCoroutine " + aVar.f20005a + ", state: " + g5);
                if (h5.isEmpty()) {
                    printStream.print("\n\tat " + f19995b);
                    gVar.D(printStream, eVar.e());
                } else {
                    gVar.D(printStream, n5);
                }
            }
            return;
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    private final List<StackTraceElement> n(String str, Thread thread, List<StackTraceElement> list) {
        Object m6444constructorimpl;
        boolean z4;
        if (l0.g(str, kotlinx.coroutines.debug.internal.f.f19992b) && thread != null) {
            try {
                d1.a aVar = d1.Companion;
                m6444constructorimpl = d1.m6444constructorimpl(thread.getStackTrace());
            } catch (Throwable th) {
                d1.a aVar2 = d1.Companion;
                m6444constructorimpl = d1.m6444constructorimpl(e1.a(th));
            }
            if (d1.m6450isFailureimpl(m6444constructorimpl)) {
                m6444constructorimpl = null;
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) m6444constructorimpl;
            if (stackTraceElementArr == null) {
                return list;
            }
            int length = stackTraceElementArr.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i5];
                    if (l0.g(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && l0.g(stackTraceElement.getMethodName(), "resumeWith") && l0.g(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        break;
                    }
                    i5++;
                } else {
                    i5 = -1;
                    break;
                }
            }
            u0<Integer, Integer> o5 = o(i5, stackTraceElementArr, list);
            int intValue = o5.component1().intValue();
            int intValue2 = o5.component2().intValue();
            if (intValue == -1) {
                return list;
            }
            ArrayList arrayList = new ArrayList((((list.size() + i5) - intValue) - 1) - intValue2);
            int i6 = i5 - intValue2;
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList.add(stackTraceElementArr[i7]);
            }
            int size = list.size();
            for (int i8 = intValue + 1; i8 < size; i8++) {
                arrayList.add(list.get(i8));
            }
            return arrayList;
        }
        return list;
    }

    private final u0<Integer, Integer> o(int i5, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i6 = 0; i6 < 3; i6++) {
            int p5 = f19994a.p((i5 - 1) - i6, stackTraceElementArr, list);
            if (p5 != -1) {
                return q1.a(Integer.valueOf(p5), Integer.valueOf(i6));
            }
        }
        return q1.a(-1, 0);
    }

    private final int p(int i5, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        Object Pe;
        boolean z4;
        Pe = kotlin.collections.p.Pe(stackTraceElementArr, i5);
        StackTraceElement stackTraceElement = (StackTraceElement) Pe;
        if (stackTraceElement == null) {
            return -1;
        }
        int i6 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (l0.g(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && l0.g(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && l0.g(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    private final Set<a<?>> q() {
        return f19998e.keySet();
    }

    private final String r(l2 l2Var) {
        return l2Var instanceof t2 ? ((t2) l2Var).m1() : l2Var.toString();
    }

    private static /* synthetic */ void s(l2 l2Var) {
    }

    private final v3.l<Boolean, r2> t() {
        Object m6444constructorimpl;
        try {
            d1.a aVar = d1.Companion;
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            l0.n(newInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            m6444constructorimpl = d1.m6444constructorimpl((v3.l) u1.q(newInstance, 1));
        } catch (Throwable th) {
            d1.a aVar2 = d1.Companion;
            m6444constructorimpl = d1.m6444constructorimpl(e1.a(th));
        }
        if (d1.m6450isFailureimpl(m6444constructorimpl)) {
            m6444constructorimpl = null;
        }
        return (v3.l) m6444constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y(a<?> aVar) {
        l2 l2Var;
        kotlin.coroutines.g c5 = aVar.f20006b.c();
        if (c5 == null || (l2Var = (l2) c5.get(l2.U)) == null || !l2Var.d()) {
            return false;
        }
        f19998e.remove(aVar);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public final <T> kotlin.coroutines.d<T> F(@p4.l kotlin.coroutines.d<? super T> dVar) {
        m mVar;
        if (!z()) {
            return dVar;
        }
        if (B(dVar) != null) {
            return dVar;
        }
        if (f20000g) {
            mVar = O(J(new Exception()));
        } else {
            mVar = null;
        }
        return e(dVar, mVar);
    }

    public final void G(@p4.l kotlin.coroutines.d<?> dVar) {
        S(dVar, kotlinx.coroutines.debug.internal.f.f19992b);
    }

    public final void H(@p4.l kotlin.coroutines.d<?> dVar) {
        S(dVar, kotlinx.coroutines.debug.internal.f.f19993c);
    }

    public final void K(boolean z4) {
        f20000g = z4;
    }

    public final void L(boolean z4) {
        f19999f = z4;
    }

    public final void Q() {
        v3.l<Boolean, r2> lVar;
        if (z()) {
            if (b.f20007a.decrementAndGet(f20003j) != 0) {
                return;
            }
            N();
            f19998e.clear();
            f20002i.clear();
            if (!kotlinx.coroutines.debug.internal.a.f19953a.a() && (lVar = f20001h) != null) {
                lVar.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        throw new IllegalStateException("Agent was not installed".toString());
    }

    public final void f(@p4.l PrintStream printStream) {
        synchronized (printStream) {
            f19994a.j(printStream);
            r2 r2Var = r2.f19517a;
        }
    }

    @p4.l
    public final List<kotlinx.coroutines.debug.internal.d> g() {
        kotlin.sequences.m x12;
        kotlin.sequences.m K2;
        kotlin.sequences.m p12;
        List<kotlinx.coroutines.debug.internal.d> c32;
        if (z()) {
            x12 = kotlin.collections.e0.x1(q());
            K2 = u.K2(x12, new e());
            p12 = u.p1(K2, new d());
            c32 = u.c3(p12);
            return c32;
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    @p4.l
    public final Object[] h() {
        String j32;
        String str;
        String str2;
        String p5;
        String F0;
        List<kotlinx.coroutines.debug.internal.d> g5 = g();
        int size = g5.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (kotlinx.coroutines.debug.internal.d dVar : g5) {
            kotlin.coroutines.g a5 = dVar.a();
            r0 r0Var = (r0) a5.get(r0.f20457b);
            Long l5 = null;
            if (r0Var != null && (F0 = r0Var.F0()) != null) {
                str = P(F0);
            } else {
                str = null;
            }
            kotlinx.coroutines.n0 n0Var = (kotlinx.coroutines.n0) a5.get(kotlinx.coroutines.n0.Key);
            if (n0Var != null) {
                str2 = P(n0Var);
            } else {
                str2 = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append(str);
            sb.append(",\n                    \"id\": ");
            q0 q0Var = (q0) a5.get(q0.f20444b);
            if (q0Var != null) {
                l5 = Long.valueOf(q0Var.F0());
            }
            sb.append(l5);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append(str2);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(dVar.f());
            sb.append(",\n                    \"state\": \"");
            sb.append(dVar.g());
            sb.append("\"\n                } \n                ");
            p5 = x.p(sb.toString());
            arrayList3.add(p5);
            arrayList2.add(dVar.d());
            arrayList.add(dVar.e());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        j32 = kotlin.collections.e0.j3(arrayList3, null, null, null, 0, null, null, 63, null);
        sb2.append(j32);
        sb2.append(']');
        return new Object[]{sb2.toString(), arrayList.toArray(new Thread[0]), arrayList2.toArray(new kotlin.coroutines.jvm.internal.e[0]), g5.toArray(new kotlinx.coroutines.debug.internal.d[0])};
    }

    @p4.l
    public final List<kotlinx.coroutines.debug.internal.j> k() {
        kotlin.sequences.m x12;
        kotlin.sequences.m K2;
        kotlin.sequences.m p12;
        List<kotlinx.coroutines.debug.internal.j> c32;
        if (z()) {
            x12 = kotlin.collections.e0.x1(q());
            K2 = u.K2(x12, new e());
            p12 = u.p1(K2, new i());
            c32 = u.c3(p12);
            return c32;
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    @p4.l
    public final List<StackTraceElement> l(@p4.l kotlinx.coroutines.debug.internal.d dVar, @p4.l List<StackTraceElement> list) {
        return n(dVar.g(), dVar.e(), list);
    }

    @p4.l
    public final String m(@p4.l kotlinx.coroutines.debug.internal.d dVar) {
        String j32;
        String str;
        String p5;
        List<StackTraceElement> l5 = l(dVar, dVar.h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : l5) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"declaringClass\": \"");
            sb.append(stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            if (fileName != null) {
                str = P(fileName);
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            p5 = x.p(sb.toString());
            arrayList.add(p5);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        j32 = kotlin.collections.e0.j3(arrayList, null, null, null, 0, null, null, 63, null);
        sb2.append(j32);
        sb2.append(']');
        return sb2.toString();
    }

    public final boolean u() {
        return f20000g;
    }

    public final boolean v() {
        return f19999f;
    }

    @p4.l
    public final String w(@p4.l l2 l2Var) {
        int Y;
        int j5;
        int u4;
        boolean z4;
        if (z()) {
            Set<a<?>> q5 = q();
            ArrayList<a> arrayList = new ArrayList();
            for (Object obj : q5) {
                if (((a) obj).f20005a.getContext().get(l2.U) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    arrayList.add(obj);
                }
            }
            Y = kotlin.collections.x.Y(arrayList, 10);
            j5 = z0.j(Y);
            u4 = kotlin.ranges.u.u(j5, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(u4);
            for (a aVar : arrayList) {
                linkedHashMap.put(p2.B(aVar.f20005a.getContext()), aVar.f20006b);
            }
            StringBuilder sb = new StringBuilder();
            f19994a.d(l2Var, linkedHashMap, sb, "");
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    public final void x() {
        v3.l<Boolean, r2> lVar;
        if (b.f20007a.incrementAndGet(f20003j) > 1) {
            return;
        }
        M();
        if (!kotlinx.coroutines.debug.internal.a.f19953a.a() && (lVar = f20001h) != null) {
            lVar.invoke(Boolean.TRUE);
        }
    }

    public final boolean z() {
        return b.f20007a.get(f20003j) > 0;
    }
}
