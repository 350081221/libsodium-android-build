.class public final Landroidx/room/migration/MigrationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a*\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a8\u0006\t"
    }
    d2 = {
        "",
        "startVersion",
        "endVersion",
        "Lkotlin/Function1;",
        "Landroidx/sqlite/db/SupportSQLiteDatabase;",
        "Lkotlin/r2;",
        "migrate",
        "Landroidx/room/migration/Migration;",
        "Migration",
        "room-ktx_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lu3/h;
    name = "MigrationKt"
.end annotation


# direct methods
.method public static final Migration(IILv3/l;)Landroidx/room/migration/Migration;
    .locals 1
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lv3/l<",
            "-",
            "Landroidx/sqlite/db/SupportSQLiteDatabase;",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/room/migration/Migration;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/room/migration/MigrationImpl;

    invoke-direct {v0, p0, p1, p2}, Landroidx/room/migration/MigrationImpl;-><init>(IILv3/l;)V

    return-object v0
.end method
