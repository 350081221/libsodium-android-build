package v2;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import java.util.Date;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006/"}, d2 = {"Lcom/yuanqi/master/database/model/History;", "", "id", "", TTDownloadField.TT_APP_NAME, "", TTDownloadField.TT_PACKAGE_NAME, "address", "latitude", "", "longitude", "timestamp", "Ljava/util/Date;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/util/Date;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getAppName", "setAppName", "getId", "()I", "setId", "(I)V", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "getPackageName", "setPackageName", "getTimestamp", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Entity(indices = {@Index(unique = true, value = {"id"})}, tableName = "history")
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final int f22591h = 8;

    /* renamed from: a, reason: collision with root package name */
    @PrimaryKey(autoGenerate = true)
    private int f22592a;

    /* renamed from: b, reason: collision with root package name */
    @l
    @ColumnInfo(name = "app_name")
    private String f22593b;

    /* renamed from: c, reason: collision with root package name */
    @l
    @ColumnInfo(name = bi.f12269o)
    private String f22594c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @ColumnInfo(name = "address")
    private String f22595d;

    /* renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "latitude")
    private double f22596e;

    /* renamed from: f, reason: collision with root package name */
    @ColumnInfo(name = "longitude")
    private double f22597f;

    /* renamed from: g, reason: collision with root package name */
    @ColumnInfo(name = "timestamp")
    @m
    private final Date f22598g;

    public c(int i5, @l String appName, @l String packageName, @l String address, double d5, double d6, @m Date date) {
        l0.p(appName, "appName");
        l0.p(packageName, "packageName");
        l0.p(address, "address");
        this.f22592a = i5;
        this.f22593b = appName;
        this.f22594c = packageName;
        this.f22595d = address;
        this.f22596e = d5;
        this.f22597f = d6;
        this.f22598g = date;
    }

    public final int a() {
        return this.f22592a;
    }

    @l
    public final String b() {
        return this.f22593b;
    }

    @l
    public final String c() {
        return this.f22594c;
    }

    @l
    public final String d() {
        return this.f22595d;
    }

    public final double e() {
        return this.f22596e;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f22592a == cVar.f22592a && l0.g(this.f22593b, cVar.f22593b) && l0.g(this.f22594c, cVar.f22594c) && l0.g(this.f22595d, cVar.f22595d) && Double.compare(this.f22596e, cVar.f22596e) == 0 && Double.compare(this.f22597f, cVar.f22597f) == 0 && l0.g(this.f22598g, cVar.f22598g);
    }

    public final double f() {
        return this.f22597f;
    }

    @m
    public final Date g() {
        return this.f22598g;
    }

    @l
    public final c h(int i5, @l String appName, @l String packageName, @l String address, double d5, double d6, @m Date date) {
        l0.p(appName, "appName");
        l0.p(packageName, "packageName");
        l0.p(address, "address");
        return new c(i5, appName, packageName, address, d5, d6, date);
    }

    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.f22592a) * 31) + this.f22593b.hashCode()) * 31) + this.f22594c.hashCode()) * 31) + this.f22595d.hashCode()) * 31) + Double.hashCode(this.f22596e)) * 31) + Double.hashCode(this.f22597f)) * 31;
        Date date = this.f22598g;
        return hashCode + (date == null ? 0 : date.hashCode());
    }

    @l
    public final String j() {
        return this.f22595d;
    }

    @l
    public final String k() {
        return this.f22593b;
    }

    public final int l() {
        return this.f22592a;
    }

    public final double m() {
        return this.f22596e;
    }

    public final double n() {
        return this.f22597f;
    }

    @l
    public final String o() {
        return this.f22594c;
    }

    @m
    public final Date p() {
        return this.f22598g;
    }

    public final void q(@l String str) {
        l0.p(str, "<set-?>");
        this.f22595d = str;
    }

    public final void r(@l String str) {
        l0.p(str, "<set-?>");
        this.f22593b = str;
    }

    public final void s(int i5) {
        this.f22592a = i5;
    }

    public final void t(double d5) {
        this.f22596e = d5;
    }

    @l
    public String toString() {
        return "History(id=" + this.f22592a + ", appName=" + this.f22593b + ", packageName=" + this.f22594c + ", address=" + this.f22595d + ", latitude=" + this.f22596e + ", longitude=" + this.f22597f + ", timestamp=" + this.f22598g + ')';
    }

    public final void u(double d5) {
        this.f22597f = d5;
    }

    public final void v(@l String str) {
        l0.p(str, "<set-?>");
        this.f22594c = str;
    }

    public /* synthetic */ c(int i5, String str, String str2, String str3, double d5, double d6, Date date, int i6, w wVar) {
        this((i6 & 1) != 0 ? 0 : i5, str, str2, str3, d5, d6, (i6 & 64) != 0 ? null : date);
    }
}
