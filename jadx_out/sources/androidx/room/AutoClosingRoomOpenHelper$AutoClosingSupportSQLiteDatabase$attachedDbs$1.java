package androidx.room;

import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Landroid/util/Pair;", "", "obj", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1 extends n0 implements v3.l<SupportSQLiteDatabase, List<? extends Pair<String, String>>> {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1();

    AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1() {
        super(1);
    }

    @Override // v3.l
    @p4.m
    public final List<Pair<String, String>> invoke(@p4.l SupportSQLiteDatabase obj) {
        l0.p(obj, "obj");
        return obj.getAttachedDbs();
    }
}
