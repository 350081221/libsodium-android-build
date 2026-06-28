package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.SupportSQLiteProgram;
import com.bytedance.android.live.base.api.push.ILivePush;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "", "index", "Lkotlin/r2;", "bindNull", "", t0.b.f22420d, "bindLong", "", "bindDouble", "", "bindString", "", "bindBlob", "clearBindings", ILivePush.ClickType.CLOSE, "Landroid/database/sqlite/SQLiteProgram;", "delegate", "Landroid/database/sqlite/SQLiteProgram;", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class FrameworkSQLiteProgram implements SupportSQLiteProgram {

    @l
    private final SQLiteProgram delegate;

    public FrameworkSQLiteProgram(@l SQLiteProgram delegate) {
        l0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i5, @l byte[] value) {
        l0.p(value, "value");
        this.delegate.bindBlob(i5, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i5, double d5) {
        this.delegate.bindDouble(i5, d5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i5, long j5) {
        this.delegate.bindLong(i5, j5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i5) {
        this.delegate.bindNull(i5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i5, @l String value) {
        l0.p(value, "value");
        this.delegate.bindString(i5, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }
}
