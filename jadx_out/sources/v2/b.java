package v2;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import java.io.Serializable;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/yuanqi/master/database/model/AppNote;", "Ljava/io/Serializable;", "()V", "appPwd", "", "getAppPwd", "()Ljava/lang/String;", "setAppPwd", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "noteName", "getNoteName", "setNoteName", TTDownloadField.TT_PACKAGE_NAME, "getPackageName", "setPackageName", "userId", "getUserId", "setUserId", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Entity(tableName = "AppNote")
/* loaded from: classes3.dex */
public final class b implements Serializable {
    public static final int $stable = 8;

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "user_id")
    private int userId;

    @l
    @ColumnInfo(name = bi.f12269o)
    private String packageName = "";

    @l
    @ColumnInfo(name = "note_name")
    private String noteName = "";

    @l
    @ColumnInfo(name = "app_pwd")
    private String appPwd = "";

    @l
    public final String getAppPwd() {
        return this.appPwd;
    }

    public final int getId() {
        return this.id;
    }

    @l
    public final String getNoteName() {
        return this.noteName;
    }

    @l
    public final String getPackageName() {
        return this.packageName;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final void setAppPwd(@l String str) {
        l0.p(str, "<set-?>");
        this.appPwd = str;
    }

    public final void setId(int i5) {
        this.id = i5;
    }

    public final void setNoteName(@l String str) {
        l0.p(str, "<set-?>");
        this.noteName = str;
    }

    public final void setPackageName(@l String str) {
        l0.p(str, "<set-?>");
        this.packageName = str;
    }

    public final void setUserId(int i5) {
        this.userId = i5;
    }
}
