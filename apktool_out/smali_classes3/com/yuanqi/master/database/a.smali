.class public final Lcom/yuanqi/master/database/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/master/database/a$b;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u000cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/yuanqi/master/database/DataBaseHelper;",
        "",
        "()V",
        "dataBase",
        "Lcom/yuanqi/master/database/AppDataBase;",
        "getDataBase",
        "()Lcom/yuanqi/master/database/AppDataBase;",
        "setDataBase",
        "(Lcom/yuanqi/master/database/AppDataBase;)V",
        "adModelDao",
        "Lcom/yuanqi/master/database/dao/AdModelDao;",
        "context",
        "Landroid/app/Application;",
        "appNoteDao",
        "Lcom/yuanqi/master/database/dao/AppNoteDao;",
        "historyDao",
        "Lcom/yuanqi/master/database/dao/HistoryDao;",
        "initDatabase",
        "",
        "Companion",
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
.field public static final b:Lcom/yuanqi/master/database/a$b;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final c:I

.field private static final d:Lkotlin/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/d0<",
            "Lcom/yuanqi/master/database/a;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private a:Lcom/yuanqi/master/database/AppDataBase;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/yuanqi/master/database/a$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/yuanqi/master/database/a$b;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/yuanqi/master/database/a;->b:Lcom/yuanqi/master/database/a$b;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/yuanqi/master/database/a;->c:I

    .line 12
    .line 13
    sget-object v0, Lkotlin/h0;->SYNCHRONIZED:Lkotlin/h0;

    .line 14
    .line 15
    sget-object v1, Lcom/yuanqi/master/database/a$a;->INSTANCE:Lcom/yuanqi/master/database/a$a;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/e0;->b(Lkotlin/h0;Lv3/a;)Lkotlin/d0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/yuanqi/master/database/a;->d:Lkotlin/d0;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lkotlin/d0;
    .locals 1

    sget-object v0, Lcom/yuanqi/master/database/a;->d:Lkotlin/d0;

    return-object v0
.end method


# virtual methods
.method public final b(Landroid/app/Application;)Lcom/yuanqi/master/database/dao/a;
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/yuanqi/master/database/a;->a:Lcom/yuanqi/master/database/AppDataBase;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/yuanqi/master/database/a;->f(Landroid/app/Application;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/master/database/a;->a:Lcom/yuanqi/master/database/AppDataBase;

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/yuanqi/master/database/AppDataBase;->a()Lcom/yuanqi/master/database/dao/a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final c(Landroid/app/Application;)Lcom/yuanqi/master/database/dao/c;
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/yuanqi/master/database/a;->a:Lcom/yuanqi/master/database/AppDataBase;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/yuanqi/master/database/a;->f(Landroid/app/Application;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/master/database/a;->a:Lcom/yuanqi/master/database/AppDataBase;

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/yuanqi/master/database/AppDataBase;->b()Lcom/yuanqi/master/database/dao/c;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final d()Lcom/yuanqi/master/database/AppDataBase;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/database/a;->a:Lcom/yuanqi/master/database/AppDataBase;

    return-object v0
.end method

.method public final e(Landroid/app/Application;)Lcom/yuanqi/master/database/dao/e;
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/yuanqi/master/database/a;->a:Lcom/yuanqi/master/database/AppDataBase;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/yuanqi/master/database/a;->f(Landroid/app/Application;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/master/database/a;->a:Lcom/yuanqi/master/database/AppDataBase;

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/yuanqi/master/database/AppDataBase;->c()Lcom/yuanqi/master/database/dao/e;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final f(Landroid/app/Application;)V
    .locals 3
    .param p1    # Landroid/app/Application;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Lcom/yuanqi/master/database/AppDataBase;

    .line 7
    .line 8
    const-string v1, "app_db"

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Landroidx/room/Room;->databaseBuilder(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/RoomDatabase$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroidx/room/RoomDatabase$Builder;->allowMainThreadQueries()Landroidx/room/RoomDatabase$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v0, 0x2

    .line 19
    new-array v0, v0, [Landroidx/room/migration/Migration;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {}, Lcom/yuanqi/master/database/DataBaseHelperKt;->a()Lcom/yuanqi/master/database/DataBaseHelperKt$MIGRATION_1_2$1;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    aput-object v2, v0, v1

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {}, Lcom/yuanqi/master/database/DataBaseHelperKt;->b()Landroidx/room/migration/Migration;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    aput-object v2, v0, v1

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroidx/room/RoomDatabase$Builder;->addMigrations([Landroidx/room/migration/Migration;)Landroidx/room/RoomDatabase$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Landroidx/room/RoomDatabase$Builder;->build()Landroidx/room/RoomDatabase;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lcom/yuanqi/master/database/AppDataBase;

    .line 44
    .line 45
    iput-object p1, p0, Lcom/yuanqi/master/database/a;->a:Lcom/yuanqi/master/database/AppDataBase;

    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public final g(Lcom/yuanqi/master/database/AppDataBase;)V
    .locals 0
    .param p1    # Lcom/yuanqi/master/database/AppDataBase;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/yuanqi/master/database/a;->a:Lcom/yuanqi/master/database/AppDataBase;

    return-void
.end method
