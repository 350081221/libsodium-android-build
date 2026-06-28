package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.d0;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H$J\b\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/room/SharedSQLiteStatement;", "", "Landroidx/sqlite/db/SupportSQLiteStatement;", "createNewStatement", "", "canUseCached", "getStmt", "", "createQuery", "Lkotlin/r2;", "assertNotMainThread", "acquire", "statement", "release", "Landroidx/room/RoomDatabase;", "database", "Landroidx/room/RoomDatabase;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stmt$delegate", "Lkotlin/d0;", "()Landroidx/sqlite/db/SupportSQLiteStatement;", "stmt", "<init>", "(Landroidx/room/RoomDatabase;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public abstract class SharedSQLiteStatement {

    @p4.l
    private final RoomDatabase database;

    @p4.l
    private final AtomicBoolean lock;

    @p4.l
    private final d0 stmt$delegate;

    public SharedSQLiteStatement(@p4.l RoomDatabase database) {
        d0 c5;
        l0.p(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        c5 = f0.c(new SharedSQLiteStatement$stmt$2(this));
        this.stmt$delegate = c5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportSQLiteStatement createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final SupportSQLiteStatement getStmt() {
        return (SupportSQLiteStatement) this.stmt$delegate.getValue();
    }

    @p4.l
    public SupportSQLiteStatement acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    @p4.l
    protected abstract String createQuery();

    public void release(@p4.l SupportSQLiteStatement statement) {
        l0.p(statement, "statement");
        if (statement == getStmt()) {
            this.lock.set(false);
        }
    }

    private final SupportSQLiteStatement getStmt(boolean z4) {
        if (z4) {
            return getStmt();
        }
        return createNewStatement();
    }
}
