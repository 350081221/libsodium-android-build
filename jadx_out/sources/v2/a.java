package v2;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yuanqi/master/database/model/AdModel;", "", "()V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Entity(tableName = "AdModel")
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f22588c = 8;

    /* renamed from: a, reason: collision with root package name */
    @PrimaryKey(autoGenerate = true)
    private int f22589a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private String f22590b = "";

    @l
    public final String a() {
        return this.f22590b;
    }

    public final int b() {
        return this.f22589a;
    }

    public final void c(@l String str) {
        l0.p(str, "<set-?>");
        this.f22590b = str;
    }

    public final void d(int i5) {
        this.f22589a = i5;
    }
}
