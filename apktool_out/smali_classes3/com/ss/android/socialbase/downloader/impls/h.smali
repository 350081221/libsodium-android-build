.class public Lcom/ss/android/socialbase/downloader/impls/h;
.super Lcom/ss/android/socialbase/downloader/downloader/a;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String; = "h"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/DownloadService;

    invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public a(Landroid/content/Intent;II)V
    .locals 0

    .line 3
    invoke-static {}, Lcom/ss/android/socialbase/downloader/c/a;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    sget-object p1, Lcom/ss/android/socialbase/downloader/impls/h;->e:Ljava/lang/String;

    const-string p2, "onStartCommand"

    invoke-static {p1, p2}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/high16 p1, 0x40000

    .line 5
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/a;->a(I)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/downloader/a;->b:Z

    .line 7
    :cond_1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/a;->e()V

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    const/high16 v0, 0x40000

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/a;->a(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/a;->b:Z

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/a;->d:Z

    .line 14
    .line 15
    invoke-static {}, Lcom/ss/android/socialbase/downloader/c/a;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    sget-object v0, Lcom/ss/android/socialbase/downloader/impls/h;->e:Ljava/lang/String;

    .line 22
    .line 23
    const-string v1, "onStartCommandOnMainThread"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
    .line 29
    .line 30
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
