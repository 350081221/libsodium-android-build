package com.yuanqi.master.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import p4.l;
import p4.m;

@Dao
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH'J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\fH'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0012"}, d2 = {"Lcom/yuanqi/master/database/dao/AppNoteDao;", "", "deleteAppNote", "", "appNote", "Lcom/yuanqi/master/database/model/AppNote;", "deleteAppNoteById", TTDownloadField.TT_PACKAGE_NAME, "", "userId", "", "getAll", "", "getAppNoetByPackageName", "insert", "insertList", "appNotes", "updateAppNote", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {
    @Insert(onConflict = 1)
    void a(@l List<v2.b> list);

    @Query("select * from AppNote where package_name=:packageName and user_id=:userId limit 1")
    @m
    v2.b b(@l String str, int i5);

    @Delete
    void c(@l v2.b bVar);

    @Insert(onConflict = 1)
    void d(@l v2.b bVar);

    @Update
    void e(@l v2.b bVar);

    @Query("DELETE from AppNote where package_name=:packageName and user_id=:userId")
    void f(@l String str, int i5);

    @l
    @Query("select * from AppNote")
    List<v2.b> getAll();
}
