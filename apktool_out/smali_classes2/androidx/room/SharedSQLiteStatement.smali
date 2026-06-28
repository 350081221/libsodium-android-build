.class public abstract Landroidx/room/SharedSQLiteStatement;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP_PREFIX:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0008\u0010\u0008\u001a\u00020\u0007H$J\u0008\u0010\n\u001a\u00020\tH\u0014J\u0008\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u00028BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0006\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/room/SharedSQLiteStatement;",
        "",
        "Landroidx/sqlite/db/SupportSQLiteStatement;",
        "createNewStatement",
        "",
        "canUseCached",
        "getStmt",
        "",
        "createQuery",
        "Lkotlin/r2;",
        "assertNotMainThread",
        "acquire",
        "statement",
        "release",
        "Landroidx/room/RoomDatabase;",
        "database",
        "Landroidx/room/RoomDatabase;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "lock",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "stmt$delegate",
        "Lkotlin/d0;",
        "()Landroidx/sqlite/db/SupportSQLiteStatement;",
        "stmt",
        "<init>",
        "(Landroidx/room/RoomDatabase;)V",
        "room-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final database:Landroidx/room/RoomDatabase;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final lock:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final stmt$delegate:Lkotlin/d0;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1
    .param p1    # Landroidx/room/RoomDatabase;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "database"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/room/SharedSQLiteStatement;->database:Landroidx/room/RoomDatabase;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Landroidx/room/SharedSQLiteStatement;->lock:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    new-instance p1, Landroidx/room/SharedSQLiteStatement$stmt$2;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Landroidx/room/SharedSQLiteStatement$stmt$2;-><init>(Landroidx/room/SharedSQLiteStatement;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/e0;->c(Lv3/a;)Lkotlin/d0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Landroidx/room/SharedSQLiteStatement;->stmt$delegate:Lkotlin/d0;

    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
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
.end method

.method public static final synthetic access$createNewStatement(Landroidx/room/SharedSQLiteStatement;)Landroidx/sqlite/db/SupportSQLiteStatement;
    .locals 0

    invoke-direct {p0}, Landroidx/room/SharedSQLiteStatement;->createNewStatement()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object p0

    return-object p0
.end method

.method private final createNewStatement()Landroidx/sqlite/db/SupportSQLiteStatement;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/room/SharedSQLiteStatement;->createQuery()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/room/SharedSQLiteStatement;->database:Landroidx/room/RoomDatabase;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroidx/room/RoomDatabase;->compileStatement(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private final getStmt()Landroidx/sqlite/db/SupportSQLiteStatement;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/SharedSQLiteStatement;->stmt$delegate:Lkotlin/d0;

    invoke-interface {v0}, Lkotlin/d0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/sqlite/db/SupportSQLiteStatement;

    return-object v0
.end method

.method private final getStmt(Z)Landroidx/sqlite/db/SupportSQLiteStatement;
    .locals 0

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0}, Landroidx/room/SharedSQLiteStatement;->getStmt()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0}, Landroidx/room/SharedSQLiteStatement;->createNewStatement()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public acquire()Landroidx/sqlite/db/SupportSQLiteStatement;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/room/SharedSQLiteStatement;->assertNotMainThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/room/SharedSQLiteStatement;->lock:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-direct {p0, v0}, Landroidx/room/SharedSQLiteStatement;->getStmt(Z)Landroidx/sqlite/db/SupportSQLiteStatement;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected assertNotMainThread()V
    .locals 1

    iget-object v0, p0, Landroidx/room/SharedSQLiteStatement;->database:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotMainThread()V

    return-void
.end method

.method protected abstract createQuery()Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public release(Landroidx/sqlite/db/SupportSQLiteStatement;)V
    .locals 1
    .param p1    # Landroidx/sqlite/db/SupportSQLiteStatement;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "statement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/room/SharedSQLiteStatement;->getStmt()Landroidx/sqlite/db/SupportSQLiteStatement;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/room/SharedSQLiteStatement;->lock:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
