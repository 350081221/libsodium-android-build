package kotlin.concurrent;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.a1;
import kotlin.i0;
import kotlin.internal.f;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import u3.h;
import v3.l;

@i0(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aM\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001aO\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a\u001a\u0010\u0010\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001aM\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001aO\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a'\u0010\u0011\u001a\u00020\f2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"fixedRateTimer", "Ljava/util/Timer;", "name", "", "daemon", "", "startAt", "Ljava/util/Date;", "period", "", "action", "Lkotlin/Function1;", "Ljava/util/TimerTask;", "", "Lkotlin/ExtensionFunctionType;", "initialDelay", "timer", "timerTask", "schedule", CrashHianalyticsData.TIME, "delay", "scheduleAtFixedRate", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@h(name = "TimersKt")
/* loaded from: classes3.dex */
public final class c {

    @i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 176)
    @r1({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<TimerTask, r2> f19223a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super TimerTask, r2> lVar) {
            this.f19223a = lVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f19223a.invoke(this);
        }
    }

    @f
    private static final Timer a(String str, boolean z4, long j5, long j6, l<? super TimerTask, r2> action) {
        l0.p(action, "action");
        Timer k5 = k(str, z4);
        k5.scheduleAtFixedRate(new a(action), j5, j6);
        return k5;
    }

    @f
    private static final Timer b(String str, boolean z4, Date startAt, long j5, l<? super TimerTask, r2> action) {
        l0.p(startAt, "startAt");
        l0.p(action, "action");
        Timer k5 = k(str, z4);
        k5.scheduleAtFixedRate(new a(action), startAt, j5);
        return k5;
    }

    static /* synthetic */ Timer c(String str, boolean z4, long j5, long j6, l action, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            j5 = 0;
        }
        l0.p(action, "action");
        Timer k5 = k(str, z4);
        k5.scheduleAtFixedRate(new a(action), j5, j6);
        return k5;
    }

    static /* synthetic */ Timer d(String str, boolean z4, Date startAt, long j5, l action, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        l0.p(startAt, "startAt");
        l0.p(action, "action");
        Timer k5 = k(str, z4);
        k5.scheduleAtFixedRate(new a(action), startAt, j5);
        return k5;
    }

    @f
    private static final TimerTask e(Timer timer, long j5, long j6, l<? super TimerTask, r2> action) {
        l0.p(timer, "<this>");
        l0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j5, j6);
        return aVar;
    }

    @f
    private static final TimerTask f(Timer timer, long j5, l<? super TimerTask, r2> action) {
        l0.p(timer, "<this>");
        l0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j5);
        return aVar;
    }

    @f
    private static final TimerTask g(Timer timer, Date time, long j5, l<? super TimerTask, r2> action) {
        l0.p(timer, "<this>");
        l0.p(time, "time");
        l0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time, j5);
        return aVar;
    }

    @f
    private static final TimerTask h(Timer timer, Date time, l<? super TimerTask, r2> action) {
        l0.p(timer, "<this>");
        l0.p(time, "time");
        l0.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time);
        return aVar;
    }

    @f
    private static final TimerTask i(Timer timer, long j5, long j6, l<? super TimerTask, r2> action) {
        l0.p(timer, "<this>");
        l0.p(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, j5, j6);
        return aVar;
    }

    @f
    private static final TimerTask j(Timer timer, Date time, long j5, l<? super TimerTask, r2> action) {
        l0.p(timer, "<this>");
        l0.p(time, "time");
        l0.p(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, time, j5);
        return aVar;
    }

    @p4.l
    @a1
    public static final Timer k(@m String str, boolean z4) {
        return str == null ? new Timer(z4) : new Timer(str, z4);
    }

    @f
    private static final Timer l(String str, boolean z4, long j5, long j6, l<? super TimerTask, r2> action) {
        l0.p(action, "action");
        Timer k5 = k(str, z4);
        k5.schedule(new a(action), j5, j6);
        return k5;
    }

    @f
    private static final Timer m(String str, boolean z4, Date startAt, long j5, l<? super TimerTask, r2> action) {
        l0.p(startAt, "startAt");
        l0.p(action, "action");
        Timer k5 = k(str, z4);
        k5.schedule(new a(action), startAt, j5);
        return k5;
    }

    static /* synthetic */ Timer n(String str, boolean z4, long j5, long j6, l action, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            j5 = 0;
        }
        l0.p(action, "action");
        Timer k5 = k(str, z4);
        k5.schedule(new a(action), j5, j6);
        return k5;
    }

    static /* synthetic */ Timer o(String str, boolean z4, Date startAt, long j5, l action, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        l0.p(startAt, "startAt");
        l0.p(action, "action");
        Timer k5 = k(str, z4);
        k5.schedule(new a(action), startAt, j5);
        return k5;
    }

    @f
    private static final TimerTask p(l<? super TimerTask, r2> action) {
        l0.p(action, "action");
        return new a(action);
    }
}
