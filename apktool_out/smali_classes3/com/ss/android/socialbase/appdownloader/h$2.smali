.class Lcom/ss/android/socialbase/appdownloader/h$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/downloader/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/h;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/appdownloader/h;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/appdownloader/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/h$2;->a:Lcom/ss/android/socialbase/appdownloader/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/h$2;->a:Lcom/ss/android/socialbase/appdownloader/h;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/h;->b(Lcom/ss/android/socialbase/appdownloader/h;)Ljava/util/Queue;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "install_on_resume_install_interval"

    .line 19
    .line 20
    const-wide/32 v2, 0x1d4c0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/h$2;->a:Lcom/ss/android/socialbase/appdownloader/h;

    .line 32
    .line 33
    invoke-static {v4}, Lcom/ss/android/socialbase/appdownloader/h;->c(Lcom/ss/android/socialbase/appdownloader/h;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    sub-long/2addr v2, v4

    .line 38
    cmp-long v4, v2, v0

    .line 39
    .line 40
    if-gez v4, :cond_2

    .line 41
    .line 42
    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/h$2;->a:Lcom/ss/android/socialbase/appdownloader/h;

    .line 43
    .line 44
    invoke-static {v4}, Lcom/ss/android/socialbase/appdownloader/h;->e(Lcom/ss/android/socialbase/appdownloader/h;)Landroid/os/Handler;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    iget-object v5, p0, Lcom/ss/android/socialbase/appdownloader/h$2;->a:Lcom/ss/android/socialbase/appdownloader/h;

    .line 49
    .line 50
    invoke-static {v5}, Lcom/ss/android/socialbase/appdownloader/h;->d(Lcom/ss/android/socialbase/appdownloader/h;)Ljava/lang/Runnable;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {v4, v5}, Landroidx/core/os/c;->a(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_1

    .line 59
    .line 60
    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/h$2;->a:Lcom/ss/android/socialbase/appdownloader/h;

    .line 61
    .line 62
    invoke-static {v4}, Lcom/ss/android/socialbase/appdownloader/h;->e(Lcom/ss/android/socialbase/appdownloader/h;)Landroid/os/Handler;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    iget-object v5, p0, Lcom/ss/android/socialbase/appdownloader/h$2;->a:Lcom/ss/android/socialbase/appdownloader/h;

    .line 67
    .line 68
    invoke-static {v5}, Lcom/ss/android/socialbase/appdownloader/h;->d(Lcom/ss/android/socialbase/appdownloader/h;)Ljava/lang/Runnable;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    sub-long/2addr v0, v2

    .line 73
    invoke-virtual {v4, v5, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 74
    .line 75
    .line 76
    :cond_1
    return-void

    .line 77
    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/h$2;->a:Lcom/ss/android/socialbase/appdownloader/h;

    .line 78
    .line 79
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 80
    .line 81
    .line 82
    move-result-wide v1

    .line 83
    invoke-static {v0, v1, v2}, Lcom/ss/android/socialbase/appdownloader/h;->a(Lcom/ss/android/socialbase/appdownloader/h;J)J

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/h$2;->a:Lcom/ss/android/socialbase/appdownloader/h;

    .line 87
    .line 88
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/h;->a(Lcom/ss/android/socialbase/appdownloader/h;)V

    .line 89
    .line 90
    .line 91
    return-void
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

.method public c()V
    .locals 0

    return-void
.end method
