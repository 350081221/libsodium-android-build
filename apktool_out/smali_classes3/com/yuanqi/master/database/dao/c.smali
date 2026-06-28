.class public interface abstract Lcom/yuanqi/master/database/dao/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0006\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\'J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000cH\'J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u000f\u001a\u00020\u00032\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000cH\'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/yuanqi/master/database/dao/AppNoteDao;",
        "",
        "deleteAppNote",
        "",
        "appNote",
        "Lcom/yuanqi/master/database/model/AppNote;",
        "deleteAppNoteById",
        "packageName",
        "",
        "userId",
        "",
        "getAll",
        "",
        "getAppNoetByPackageName",
        "insert",
        "insertList",
        "appNotes",
        "updateAppNote",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Ljava/util/List;)V
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lv2/b;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;I)Lv2/b;
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "select * from AppNote where package_name=:packageName and user_id=:userId limit 1"
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract c(Lv2/b;)V
    .param p1    # Lv2/b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/room/Delete;
    .end annotation
.end method

.method public abstract d(Lv2/b;)V
    .param p1    # Lv2/b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation
.end method

.method public abstract e(Lv2/b;)V
    .param p1    # Lv2/b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/room/Update;
    .end annotation
.end method

.method public abstract f(Ljava/lang/String;I)V
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "DELETE from AppNote where package_name=:packageName and user_id=:userId"
    .end annotation
.end method

.method public abstract getAll()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "select * from AppNote"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lv2/b;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method
