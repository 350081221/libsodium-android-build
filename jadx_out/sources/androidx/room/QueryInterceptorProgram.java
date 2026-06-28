package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import com.bytedance.android.live.base.api.push.ILivePush;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016R\"\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/room/QueryInterceptorProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "", "bindIndex", "", t0.b.f22420d, "Lkotlin/r2;", "saveArgsToCache", "index", "bindNull", "", "bindLong", "", "bindDouble", "", "bindString", "", "bindBlob", "clearBindings", ILivePush.ClickType.CLOSE, "", "bindArgsCache", "Ljava/util/List;", "getBindArgsCache$room_runtime_release", "()Ljava/util/List;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class QueryInterceptorProgram implements SupportSQLiteProgram {

    @p4.l
    private final List<Object> bindArgsCache = new ArrayList();

    private final void saveArgsToCache(int i5, Object obj) {
        int size;
        int i6 = i5 - 1;
        if (i6 >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i6) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i6) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.bindArgsCache.set(i6, obj);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i5, @p4.l byte[] value) {
        l0.p(value, "value");
        saveArgsToCache(i5, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i5, double d5) {
        saveArgsToCache(i5, Double.valueOf(d5));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i5, long j5) {
        saveArgsToCache(i5, Long.valueOf(j5));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i5) {
        saveArgsToCache(i5, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i5, @p4.l String value) {
        l0.p(value, "value");
        saveArgsToCache(i5, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @p4.l
    public final List<Object> getBindArgsCache$room_runtime_release() {
        return this.bindArgsCache;
    }
}
