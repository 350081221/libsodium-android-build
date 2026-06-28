package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.io.c;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import u3.e;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/room/util/ViewInfo;", "", "name", "", "sql", "(Ljava/lang/String;Ljava/lang/String;)V", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class ViewInfo {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public final String name;

    @m
    @e
    public final String sql;

    @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/room/util/ViewInfo$Companion;", "", "()V", "read", "Landroidx/room/util/ViewInfo;", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "viewName", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nViewInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInfo.kt\nandroidx/room/util/ViewInfo$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,83:1\n145#2,7:84\n*S KotlinDebug\n*F\n+ 1 ViewInfo.kt\nandroidx/room/util/ViewInfo$Companion\n*L\n73#1:84,7\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        @u3.m
        public final ViewInfo read(@l SupportSQLiteDatabase database, @l String viewName) {
            ViewInfo viewInfo;
            l0.p(database, "database");
            l0.p(viewName, "viewName");
            Cursor query = database.query("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + viewName + '\'');
            try {
                Cursor cursor = query;
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    l0.o(string, "cursor.getString(0)");
                    viewInfo = new ViewInfo(string, cursor.getString(1));
                } else {
                    viewInfo = new ViewInfo(viewName, null);
                }
                c.a(query, null);
                return viewInfo;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c.a(query, th);
                    throw th2;
                }
            }
        }
    }

    public ViewInfo(@l String name, @m String str) {
        l0.p(name, "name");
        this.name = name;
        this.sql = str;
    }

    @l
    @u3.m
    public static final ViewInfo read(@l SupportSQLiteDatabase supportSQLiteDatabase, @l String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(@m Object obj) {
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) obj;
        if (l0.g(this.name, viewInfo.name)) {
            String str = this.sql;
            String str2 = viewInfo.sql;
            if (str != null) {
                z4 = l0.g(str, str2);
            } else if (str2 == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i5;
        int hashCode = this.name.hashCode() * 31;
        String str = this.sql;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        return hashCode + i5;
    }

    @l
    public String toString() {
        return "ViewInfo{name='" + this.name + "', sql='" + this.sql + "'}";
    }
}
