package com.yuanqi.master.database;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.yuanqi.master.database.dao.e;
import com.yuanqi.master.tools.c;
import kotlin.i0;
import p4.l;
import v2.b;

@StabilityInferred(parameters = 0)
@TypeConverters({c.class})
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/database/AppDataBase;", "Landroidx/room/RoomDatabase;", "()V", "adModelDao", "Lcom/yuanqi/master/database/dao/AdModelDao;", "appNoteDao", "Lcom/yuanqi/master/database/dao/AppNoteDao;", "historyModelDao", "Lcom/yuanqi/master/database/dao/HistoryDao;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Database(entities = {b.class, v2.a.class, v2.c.class}, exportSchema = true, version = 3)
/* loaded from: classes3.dex */
public abstract class AppDataBase extends RoomDatabase {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14567a = 0;

    @l
    public abstract com.yuanqi.master.database.dao.a a();

    @l
    public abstract com.yuanqi.master.database.dao.c b();

    @l
    public abstract e c();
}
