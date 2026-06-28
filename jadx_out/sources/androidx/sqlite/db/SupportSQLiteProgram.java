package androidx.sqlite.db;

import java.io.Closeable;
import kotlin.i0;
import p4.l;
import t0.b;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH&J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000bH&J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteProgram;", "Ljava/io/Closeable;", "", "index", "Lkotlin/r2;", "bindNull", "", b.f22420d, "bindLong", "", "bindDouble", "", "bindString", "", "bindBlob", "clearBindings", "sqlite_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface SupportSQLiteProgram extends Closeable {
    void bindBlob(int i5, @l byte[] bArr);

    void bindDouble(int i5, double d5);

    void bindLong(int i5, long j5);

    void bindNull(int i5);

    void bindString(int i5, @l String str);

    void clearBindings();
}
