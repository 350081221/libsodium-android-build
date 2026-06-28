package androidx.room;

import androidx.annotation.RestrictTo;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/room/RoomMasterTable;", "", "()V", "COLUMN_ID", "", "COLUMN_IDENTITY_HASH", "CREATE_QUERY", "DEFAULT_ID", "NAME", "READ_QUERY", "TABLE_NAME", "createInsertQuery", "hash", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class RoomMasterTable {

    @p4.l
    private static final String COLUMN_ID = "id";

    @p4.l
    private static final String COLUMN_IDENTITY_HASH = "identity_hash";

    @p4.l
    public static final String CREATE_QUERY = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    @p4.l
    public static final String DEFAULT_ID = "42";

    @p4.l
    public static final RoomMasterTable INSTANCE = new RoomMasterTable();

    @p4.l
    public static final String NAME = "room_master_table";

    @p4.l
    public static final String READ_QUERY = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    @p4.l
    public static final String TABLE_NAME = "room_master_table";

    private RoomMasterTable() {
    }

    @p4.l
    @u3.m
    public static final String createInsertQuery(@p4.l String hash) {
        l0.p(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
