.class Lcom/umeng/analytics/process/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/process/c$a;
    }
.end annotation


# static fields
.field private static a:Lcom/umeng/analytics/process/c;


# instance fields
.field private b:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/umeng/analytics/process/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/umeng/analytics/process/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    return-void
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
    .line 22
    .line 23
.end method

.method static a(Landroid/content/Context;)Lcom/umeng/analytics/process/c;
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/analytics/process/c;->a:Lcom/umeng/analytics/process/c;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/umeng/analytics/process/c;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/umeng/analytics/process/c;->a:Lcom/umeng/analytics/process/c;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/umeng/analytics/process/c;

    invoke-direct {v1}, Lcom/umeng/analytics/process/c;-><init>()V

    sput-object v1, Lcom/umeng/analytics/process/c;->a:Lcom/umeng/analytics/process/c;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/umeng/analytics/process/c;->a:Lcom/umeng/analytics/process/c;

    iput-object p0, v0, Lcom/umeng/analytics/process/c;->c:Landroid/content/Context;

    return-object v0
.end method

.method private c(Ljava/lang/String;)Lcom/umeng/analytics/process/c$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/process/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/umeng/analytics/process/c;->c:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lcom/umeng/analytics/process/c$a;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/umeng/analytics/process/c$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/umeng/analytics/process/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/umeng/analytics/process/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    move-object v0, p1

    .line 28
    check-cast v0, Lcom/umeng/analytics/process/c$a;

    .line 29
    .line 30
    :goto_0
    return-object v0
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method


# virtual methods
.method declared-synchronized a(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 0

    monitor-enter p0

    .line 7
    :try_start_0
    invoke-direct {p0, p1}, Lcom/umeng/analytics/process/c;->c(Ljava/lang/String;)Lcom/umeng/analytics/process/c$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/analytics/process/c$a;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized b(Ljava/lang/String;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0, p1}, Lcom/umeng/analytics/process/c;->c(Ljava/lang/String;)Lcom/umeng/analytics/process/c$a;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/umeng/analytics/process/c$a;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit p0

    .line 13
    throw p1
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
