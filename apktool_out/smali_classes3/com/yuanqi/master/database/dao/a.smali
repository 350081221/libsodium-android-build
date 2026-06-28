.class public interface abstract Lcom/yuanqi/master/database/dao/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\'\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/yuanqi/master/database/dao/AdModelDao;",
        "",
        "getAll",
        "",
        "Lcom/yuanqi/master/database/model/AdModel;",
        "getModel",
        "date",
        "",
        "insert",
        "",
        "adModel",
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
.method public abstract a(Ljava/lang/String;)Lv2/a;
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "select * from AdModel where date=:date"
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract b(Lv2/a;)V
    .param p1    # Lv2/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation
.end method

.method public abstract getAll()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "select * from AdModel"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lv2/a;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method
