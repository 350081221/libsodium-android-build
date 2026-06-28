.class final Lcom/ss/android/downloadlib/b/c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/downloader/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/b/c;->a(Lcom/ss/android/downloadad/api/a/b;Lcom/ss/android/downloadlib/guide/install/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/downloadad/api/a/b;

.field final synthetic b:Lcom/ss/android/downloadlib/guide/install/a;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadad/api/a/b;Lcom/ss/android/downloadlib/guide/install/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/b/c$1;->a:Lcom/ss/android/downloadad/api/a/b;

    iput-object p2, p0, Lcom/ss/android/downloadlib/b/c$1;->b:Lcom/ss/android/downloadlib/guide/install/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 1
    const-string v0, "AppInstallOptimiseHelper"

    .line 2
    .line 3
    const-string v1, "AppInstallOptimiseHelper-->onAppForeground"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/ss/android/socialbase/downloader/a/a;->a()Lcom/ss/android/socialbase/downloader/a/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/downloader/a/a;->b(Lcom/ss/android/socialbase/downloader/a/a$a;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/ss/android/downloadlib/b/c$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/ss/android/downloadlib/g/m;->b(Lcom/ss/android/downloadad/api/a/b;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/ss/android/downloadlib/b/c$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->m(Z)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "install_delay_invoke"

    .line 34
    .line 35
    iget-object v2, p0, Lcom/ss/android/downloadlib/b/c$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lcom/ss/android/downloadad/api/a/a;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/ss/android/downloadlib/b/c$1;->b:Lcom/ss/android/downloadlib/guide/install/a;

    .line 41
    .line 42
    invoke-interface {v0}, Lcom/ss/android/downloadlib/guide/install/a;->a()V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
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

.method public c()V
    .locals 0

    return-void
.end method
