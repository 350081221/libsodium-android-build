package com.yuanqi.master.database;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.umeng.analytics.pro.d;
import com.yuanqi.master.database.dao.c;
import com.yuanqi.master.database.dao.e;
import kotlin.d0;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yuanqi/master/database/DataBaseHelper;", "", "()V", "dataBase", "Lcom/yuanqi/master/database/AppDataBase;", "getDataBase", "()Lcom/yuanqi/master/database/AppDataBase;", "setDataBase", "(Lcom/yuanqi/master/database/AppDataBase;)V", "adModelDao", "Lcom/yuanqi/master/database/dao/AdModelDao;", d.X, "Landroid/app/Application;", "appNoteDao", "Lcom/yuanqi/master/database/dao/AppNoteDao;", "historyDao", "Lcom/yuanqi/master/database/dao/HistoryDao;", "initDatabase", "", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public static final b f14574b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f14575c = 8;

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final d0<a> f14576d;

    /* renamed from: a, reason: collision with root package name */
    @m
    private AppDataBase f14577a;

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/yuanqi/master/database/DataBaseHelper;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.database.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0328a extends n0 implements v3.a<a> {
        public static final C0328a INSTANCE = new C0328a();

        C0328a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @l
        public final a invoke() {
            return new a();
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/database/DataBaseHelper$Companion;", "", "()V", "instance", "Lcom/yuanqi/master/database/DataBaseHelper;", "getInstance", "()Lcom/yuanqi/master/database/DataBaseHelper;", "instance$delegate", "Lkotlin/Lazy;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(w wVar) {
            this();
        }

        @l
        public final a a() {
            return (a) a.f14576d.getValue();
        }
    }

    static {
        d0<a> b5;
        b5 = f0.b(h0.SYNCHRONIZED, C0328a.INSTANCE);
        f14576d = b5;
    }

    @l
    public final com.yuanqi.master.database.dao.a b(@l Application context) {
        l0.p(context, "context");
        if (this.f14577a == null) {
            f(context);
        }
        AppDataBase appDataBase = this.f14577a;
        l0.m(appDataBase);
        return appDataBase.a();
    }

    @l
    public final c c(@l Application context) {
        l0.p(context, "context");
        if (this.f14577a == null) {
            f(context);
        }
        AppDataBase appDataBase = this.f14577a;
        l0.m(appDataBase);
        return appDataBase.b();
    }

    @m
    public final AppDataBase d() {
        return this.f14577a;
    }

    @l
    public final e e(@l Application context) {
        l0.p(context, "context");
        if (this.f14577a == null) {
            f(context);
        }
        AppDataBase appDataBase = this.f14577a;
        l0.m(appDataBase);
        return appDataBase.c();
    }

    public final void f(@l Application context) {
        DataBaseHelperKt$MIGRATION_1_2$1 dataBaseHelperKt$MIGRATION_1_2$1;
        l0.p(context, "context");
        RoomDatabase.Builder allowMainThreadQueries = Room.databaseBuilder(context, AppDataBase.class, "app_db").allowMainThreadQueries();
        dataBaseHelperKt$MIGRATION_1_2$1 = DataBaseHelperKt.f14572a;
        this.f14577a = (AppDataBase) allowMainThreadQueries.addMigrations(dataBaseHelperKt$MIGRATION_1_2$1, DataBaseHelperKt.b()).build();
    }

    public final void g(@m AppDataBase appDataBase) {
        this.f14577a = appDataBase;
    }
}
