.class public Lcom/ss/android/socialbase/downloader/impls/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/ss/android/socialbase/downloader/downloader/m;

.field private static volatile b:Lcom/ss/android/socialbase/downloader/downloader/m;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Z)Lcom/ss/android/socialbase/downloader/downloader/m;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->T()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    sget-object p0, Lcom/ss/android/socialbase/downloader/impls/l;->b:Lcom/ss/android/socialbase/downloader/downloader/m;

    .line 10
    .line 11
    if-nez p0, :cond_1

    .line 12
    .line 13
    const-class p0, Lcom/ss/android/socialbase/downloader/impls/l;

    .line 14
    .line 15
    monitor-enter p0

    .line 16
    :try_start_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/impls/l;->b:Lcom/ss/android/socialbase/downloader/downloader/m;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->U()Lcom/ss/android/socialbase/downloader/downloader/c$a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/c$a;->b()Lcom/ss/android/socialbase/downloader/downloader/m;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lcom/ss/android/socialbase/downloader/impls/l;->b:Lcom/ss/android/socialbase/downloader/downloader/m;

    .line 29
    .line 30
    :cond_0
    monitor-exit p0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw v0

    .line 35
    :cond_1
    :goto_0
    sget-object p0, Lcom/ss/android/socialbase/downloader/impls/l;->b:Lcom/ss/android/socialbase/downloader/downloader/m;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    sget-object p0, Lcom/ss/android/socialbase/downloader/impls/l;->a:Lcom/ss/android/socialbase/downloader/downloader/m;

    .line 39
    .line 40
    if-nez p0, :cond_4

    .line 41
    .line 42
    const-class p0, Lcom/ss/android/socialbase/downloader/impls/l;

    .line 43
    .line 44
    monitor-enter p0

    .line 45
    :try_start_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/impls/l;->a:Lcom/ss/android/socialbase/downloader/downloader/m;

    .line 46
    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    new-instance v0, Lcom/ss/android/socialbase/downloader/impls/p;

    .line 50
    .line 51
    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/impls/p;-><init>()V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lcom/ss/android/socialbase/downloader/impls/l;->a:Lcom/ss/android/socialbase/downloader/downloader/m;

    .line 55
    .line 56
    :cond_3
    monitor-exit p0

    .line 57
    goto :goto_1

    .line 58
    :catchall_1
    move-exception v0

    .line 59
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    throw v0

    .line 61
    :cond_4
    :goto_1
    sget-object p0, Lcom/ss/android/socialbase/downloader/impls/l;->a:Lcom/ss/android/socialbase/downloader/downloader/m;

    .line 62
    .line 63
    return-object p0
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
