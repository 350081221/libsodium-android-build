package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 I2\u00020\u0001:\u0001IB\u001f\u0012\u0006\u0010C\u001a\u00020\"\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010F\u001a\u00020%¢\u0006\u0004\bG\u0010HJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J'\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b/\u0010$\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u001bR\u0014\u0010>\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u001bR\u0011\u0010?\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020(8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010,¨\u0006J"}, d2 = {"Landroidx/room/AutoCloser;", "", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "delegateOpenHelper", "Lkotlin/r2;", "init", "V", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "block", "executeRefCountingFunction", "(Lv3/l;)Ljava/lang/Object;", "incrementCountAndEnsureDbIsOpen", "decrementCountAndScheduleClose", "closeDatabaseIfOpen", "Ljava/lang/Runnable;", "onAutoClose", "setAutoCloseCallback", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegateOpenHelper", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "setDelegateOpenHelper", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "onAutoCloseCallback", "Ljava/lang/Runnable;", "getOnAutoCloseCallback$room_runtime_release", "()Ljava/lang/Runnable;", "setOnAutoCloseCallback$room_runtime_release", "(Ljava/lang/Runnable;)V", "lock", "Ljava/lang/Object;", "", "autoCloseTimeoutInMs", "J", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "", "refCount", "I", "getRefCount$room_runtime_release", "()I", "setRefCount$room_runtime_release", "(I)V", "lastDecrementRefCountTimeStamp", "getLastDecrementRefCountTimeStamp$room_runtime_release", "()J", "setLastDecrementRefCountTimeStamp$room_runtime_release", "(J)V", "delegateDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getDelegateDatabase$room_runtime_release", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "setDelegateDatabase$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "", "manuallyClosed", "Z", "executeAutoCloser", "autoCloser", "isActive", "()Z", "getRefCountForTest$room_runtime_release", "refCountForTest", "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAutoCloser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCloser.kt\nandroidx/room/AutoCloser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
/* loaded from: classes2.dex */
public final class AutoCloser {

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    public static final String autoCloseBug = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";
    private long autoCloseTimeoutInMs;

    @p4.l
    private final Runnable autoCloser;

    @GuardedBy("lock")
    @p4.m
    private SupportSQLiteDatabase delegateDatabase;
    public SupportSQLiteOpenHelper delegateOpenHelper;

    @p4.l
    private final Runnable executeAutoCloser;

    @p4.l
    private final Executor executor;

    @p4.l
    private final Handler handler;

    @GuardedBy("lock")
    private long lastDecrementRefCountTimeStamp;

    @p4.l
    private final Object lock;
    private boolean manuallyClosed;

    @p4.m
    private Runnable onAutoCloseCallback;

    @GuardedBy("lock")
    private int refCount;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/room/AutoCloser$Companion;", "", "()V", "autoCloseBug", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    public AutoCloser(long j5, @p4.l TimeUnit autoCloseTimeUnit, @p4.l Executor autoCloseExecutor) {
        l0.p(autoCloseTimeUnit, "autoCloseTimeUnit");
        l0.p(autoCloseExecutor, "autoCloseExecutor");
        this.handler = new Handler(Looper.getMainLooper());
        this.lock = new Object();
        this.autoCloseTimeoutInMs = autoCloseTimeUnit.toMillis(j5);
        this.executor = autoCloseExecutor;
        this.lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
        this.executeAutoCloser = new Runnable() { // from class: androidx.room.a
            @Override // java.lang.Runnable
            public final void run() {
                AutoCloser.executeAutoCloser$lambda$0(AutoCloser.this);
            }
        };
        this.autoCloser = new Runnable() { // from class: androidx.room.b
            @Override // java.lang.Runnable
            public final void run() {
                AutoCloser.autoCloser$lambda$3(AutoCloser.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void autoCloser$lambda$3(AutoCloser this$0) {
        r2 r2Var;
        l0.p(this$0, "this$0");
        synchronized (this$0.lock) {
            if (SystemClock.uptimeMillis() - this$0.lastDecrementRefCountTimeStamp < this$0.autoCloseTimeoutInMs) {
                return;
            }
            if (this$0.refCount != 0) {
                return;
            }
            Runnable runnable = this$0.onAutoCloseCallback;
            if (runnable != null) {
                runnable.run();
                r2Var = r2.f19517a;
            } else {
                r2Var = null;
            }
            if (r2Var != null) {
                SupportSQLiteDatabase supportSQLiteDatabase = this$0.delegateDatabase;
                if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                    supportSQLiteDatabase.close();
                }
                this$0.delegateDatabase = null;
                r2 r2Var2 = r2.f19517a;
                return;
            }
            throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAutoCloser$lambda$0(AutoCloser this$0) {
        l0.p(this$0, "this$0");
        this$0.executor.execute(this$0.autoCloser);
    }

    public final void closeDatabaseIfOpen() throws IOException {
        synchronized (this.lock) {
            this.manuallyClosed = true;
            SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
            if (supportSQLiteDatabase != null) {
                supportSQLiteDatabase.close();
            }
            this.delegateDatabase = null;
            r2 r2Var = r2.f19517a;
        }
    }

    public final void decrementCountAndScheduleClose() {
        boolean z4;
        synchronized (this.lock) {
            int i5 = this.refCount;
            if (i5 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                int i6 = i5 - 1;
                this.refCount = i6;
                if (i6 == 0) {
                    if (this.delegateDatabase == null) {
                        return;
                    } else {
                        this.handler.postDelayed(this.executeAutoCloser, this.autoCloseTimeoutInMs);
                    }
                }
                r2 r2Var = r2.f19517a;
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
        }
    }

    public final <V> V executeRefCountingFunction(@p4.l v3.l<? super SupportSQLiteDatabase, ? extends V> block) {
        l0.p(block, "block");
        try {
            return block.invoke(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    @p4.m
    public final SupportSQLiteDatabase getDelegateDatabase$room_runtime_release() {
        return this.delegateDatabase;
    }

    @p4.l
    public final SupportSQLiteOpenHelper getDelegateOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.delegateOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        l0.S("delegateOpenHelper");
        return null;
    }

    public final long getLastDecrementRefCountTimeStamp$room_runtime_release() {
        return this.lastDecrementRefCountTimeStamp;
    }

    @p4.m
    public final Runnable getOnAutoCloseCallback$room_runtime_release() {
        return this.onAutoCloseCallback;
    }

    public final int getRefCount$room_runtime_release() {
        return this.refCount;
    }

    @VisibleForTesting
    public final int getRefCountForTest$room_runtime_release() {
        int i5;
        synchronized (this.lock) {
            i5 = this.refCount;
        }
        return i5;
    }

    @p4.l
    public final SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
        synchronized (this.lock) {
            this.handler.removeCallbacks(this.executeAutoCloser);
            this.refCount++;
            if (!this.manuallyClosed) {
                SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
                if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                    return supportSQLiteDatabase;
                }
                SupportSQLiteDatabase writableDatabase = getDelegateOpenHelper().getWritableDatabase();
                this.delegateDatabase = writableDatabase;
                return writableDatabase;
            }
            throw new IllegalStateException("Attempting to open already closed database.".toString());
        }
    }

    public final void init(@p4.l SupportSQLiteOpenHelper delegateOpenHelper) {
        l0.p(delegateOpenHelper, "delegateOpenHelper");
        setDelegateOpenHelper(delegateOpenHelper);
    }

    public final boolean isActive() {
        return !this.manuallyClosed;
    }

    public final void setAutoCloseCallback(@p4.l Runnable onAutoClose) {
        l0.p(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    public final void setDelegateDatabase$room_runtime_release(@p4.m SupportSQLiteDatabase supportSQLiteDatabase) {
        this.delegateDatabase = supportSQLiteDatabase;
    }

    public final void setDelegateOpenHelper(@p4.l SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        l0.p(supportSQLiteOpenHelper, "<set-?>");
        this.delegateOpenHelper = supportSQLiteOpenHelper;
    }

    public final void setLastDecrementRefCountTimeStamp$room_runtime_release(long j5) {
        this.lastDecrementRefCountTimeStamp = j5;
    }

    public final void setOnAutoCloseCallback$room_runtime_release(@p4.m Runnable runnable) {
        this.onAutoCloseCallback = runnable;
    }

    public final void setRefCount$room_runtime_release(int i5) {
        this.refCount = i5;
    }
}
