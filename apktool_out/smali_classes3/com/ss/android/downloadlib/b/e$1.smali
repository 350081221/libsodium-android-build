.class Lcom/ss/android/downloadlib/b/e$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/b/e;->a(Lcom/ss/android/downloadlib/b/d;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/ss/android/downloadlib/b/d;

.field final synthetic c:Lcom/ss/android/downloadlib/b/e;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/b/e;JLcom/ss/android/downloadlib/b/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/b/e$1;->c:Lcom/ss/android/downloadlib/b/e;

    iput-wide p2, p0, Lcom/ss/android/downloadlib/b/e$1;->a:J

    iput-object p4, p0, Lcom/ss/android/downloadlib/b/e$1;->b:Lcom/ss/android/downloadlib/b/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/a/a;->a()Lcom/ss/android/socialbase/downloader/a/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/a/a;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object v2, p0, Lcom/ss/android/downloadlib/b/e$1;->c:Lcom/ss/android/downloadlib/b/e;

    .line 16
    .line 17
    invoke-static {v2}, Lcom/ss/android/downloadlib/b/e;->a(Lcom/ss/android/downloadlib/b/e;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    sub-long/2addr v0, v2

    .line 22
    iget-wide v2, p0, Lcom/ss/android/downloadlib/b/e$1;->a:J

    .line 23
    .line 24
    cmp-long v0, v0, v2

    .line 25
    .line 26
    if-gtz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/b/e$1;->b:Lcom/ss/android/downloadlib/b/d;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/b/d;->a(Z)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/b/e$1;->b:Lcom/ss/android/downloadlib/b/d;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/b/d;->a(Z)V

    .line 40
    .line 41
    .line 42
    :goto_1
    return-void
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
