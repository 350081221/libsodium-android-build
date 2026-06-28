.class Lcom/ss/android/socialbase/downloader/b/f$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/b/f$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/downloader/b/f$2;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/b/f$2;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/b/f$2$1;->a:Lcom/ss/android/socialbase/downloader/b/f$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/b/f;->a(Z)Z

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/b/f$2$1;->a:Lcom/ss/android/socialbase/downloader/b/f$2;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/ss/android/socialbase/downloader/b/f$2;->b:Lcom/ss/android/socialbase/downloader/b/f;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/b/f;->e(Lcom/ss/android/socialbase/downloader/b/f;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/b/f$2$1;->a:Lcom/ss/android/socialbase/downloader/b/f$2;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/ss/android/socialbase/downloader/b/f$2;->b:Lcom/ss/android/socialbase/downloader/b/f;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/b/f;->a(Lcom/ss/android/socialbase/downloader/b/f;)Lcom/ss/android/socialbase/downloader/downloader/c$a$a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/b/f$2$1;->a:Lcom/ss/android/socialbase/downloader/b/f$2;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/ss/android/socialbase/downloader/b/f$2;->b:Lcom/ss/android/socialbase/downloader/b/f;

    .line 28
    .line 29
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/b/f;->g(Lcom/ss/android/socialbase/downloader/b/f;)Landroid/os/Handler;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/b/f$2$1;->a:Lcom/ss/android/socialbase/downloader/b/f$2;

    .line 34
    .line 35
    iget-object v1, v1, Lcom/ss/android/socialbase/downloader/b/f$2;->b:Lcom/ss/android/socialbase/downloader/b/f;

    .line 36
    .line 37
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/b/f;->f(Lcom/ss/android/socialbase/downloader/b/f;)Ljava/lang/Runnable;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-wide/16 v2, 0x7d0

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
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
