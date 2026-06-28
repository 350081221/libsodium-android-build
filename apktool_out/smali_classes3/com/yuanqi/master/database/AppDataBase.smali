.class public abstract Lcom/yuanqi/master/database/AppDataBase;
.super Landroidx/room/RoomDatabase;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/room/Database;
    entities = {
        Lv2/b;,
        Lv2/a;,
        Lv2/c;
    }
    exportSchema = true
    version = 0x3
.end annotation

.annotation build Landroidx/room/TypeConverters;
    value = {
        Lcom/yuanqi/master/tools/c;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H&J\u0008\u0010\u0005\u001a\u00020\u0006H&J\u0008\u0010\u0007\u001a\u00020\u0008H&\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/yuanqi/master/database/AppDataBase;",
        "Landroidx/room/RoomDatabase;",
        "()V",
        "adModelDao",
        "Lcom/yuanqi/master/database/dao/AdModelDao;",
        "appNoteDao",
        "Lcom/yuanqi/master/database/dao/AppNoteDao;",
        "historyModelDao",
        "Lcom/yuanqi/master/database/dao/HistoryDao;",
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


# static fields
.field public static final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/room/RoomDatabase;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/yuanqi/master/database/dao/a;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract b()Lcom/yuanqi/master/database/dao/c;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract c()Lcom/yuanqi/master/database/dao/e;
    .annotation build Lp4/l;
    .end annotation
.end method
