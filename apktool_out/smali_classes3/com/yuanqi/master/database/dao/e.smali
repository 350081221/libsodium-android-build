.class public interface abstract Lcom/yuanqi/master/database/dao/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008g\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\'J\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\tH\'\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/yuanqi/master/database/dao/HistoryDao;",
        "",
        "deleteAll",
        "Lio/reactivex/rxjava3/core/Completable;",
        "deleteHistoryByPackageName",
        "packageName",
        "",
        "getAll",
        "",
        "Lcom/yuanqi/master/database/model/History;",
        "getHistoryByPackageName",
        "insert",
        "history",
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
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "select * from history where package_name=:packageName"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lv2/c;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract b(Lv2/c;)Lio/reactivex/rxjava3/core/c;
    .param p1    # Lv2/c;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
        onConflict = 0x5
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;)Lio/reactivex/rxjava3/core/c;
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "DELETE FROM history WHERE package_name = :packageName"
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract deleteAll()Lio/reactivex/rxjava3/core/c;
    .annotation build Landroidx/room/Query;
        value = "DELETE FROM history"
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getAll()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "select * from history ORDER BY timestamp DESC"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lv2/c;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method
