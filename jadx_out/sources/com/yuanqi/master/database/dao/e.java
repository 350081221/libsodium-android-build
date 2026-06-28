package com.yuanqi.master.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import p4.l;

@Dao
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\tH'¨\u0006\r"}, d2 = {"Lcom/yuanqi/master/database/dao/HistoryDao;", "", "deleteAll", "Lio/reactivex/rxjava3/core/Completable;", "deleteHistoryByPackageName", TTDownloadField.TT_PACKAGE_NAME, "", "getAll", "", "Lcom/yuanqi/master/database/model/History;", "getHistoryByPackageName", "insert", "history", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface e {
    @l
    @Query("select * from history where package_name=:packageName")
    List<v2.c> a(@l String str);

    @Insert(onConflict = 5)
    @l
    io.reactivex.rxjava3.core.c b(@l v2.c cVar);

    @l
    @Query("DELETE FROM history WHERE package_name = :packageName")
    io.reactivex.rxjava3.core.c c(@l String str);

    @l
    @Query("DELETE FROM history")
    io.reactivex.rxjava3.core.c deleteAll();

    @l
    @Query("select * from history ORDER BY timestamp DESC")
    List<v2.c> getAll();
}
