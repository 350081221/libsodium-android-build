.class public final Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;
.super Lcom/github/promeg/tinypinyin/android/asset/lexicons/a;
.source "SourceFile"


# static fields
.field static volatile c:Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/promeg/tinypinyin/android/asset/lexicons/a;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static f(Landroid/content/Context;)Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;
    .locals 2

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    sget-object v0, Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;->c:Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const-class v0, Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sget-object v1, Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;->c:Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;->c:Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;

    .line 20
    .line 21
    :cond_0
    monitor-exit v0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_0
    sget-object p0, Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;->c:Lcom/github/promeg/tinypinyin/lexicons/android/cncity/b;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    const-string v0, "context == null"

    .line 32
    .line 33
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0
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


# virtual methods
.method protected d()Ljava/lang/String;
    .locals 1

    const-string v0, "cncity.txt"

    return-object v0
.end method
