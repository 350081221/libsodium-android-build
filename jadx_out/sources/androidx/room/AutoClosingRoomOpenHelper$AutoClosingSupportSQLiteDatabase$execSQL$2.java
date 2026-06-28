package androidx.room;

import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

@Instrumented
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$2 extends n0 implements v3.l<SupportSQLiteDatabase, Object> {
    final /* synthetic */ Object[] $bindArgs;
    final /* synthetic */ String $sql;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$2(String str, Object[] objArr) {
        super(1);
        this.$sql = str;
        this.$bindArgs = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.l
    @p4.m
    public final Object invoke(@p4.l SupportSQLiteDatabase db) {
        l0.p(db, "db");
        String str = this.$sql;
        Object[] objArr = this.$bindArgs;
        if (db instanceof SQLiteDatabase) {
            SQLiteInstrumentation.execSQL((SQLiteDatabase) db, str, objArr);
            return null;
        }
        db.execSQL(str, objArr);
        return null;
    }
}
