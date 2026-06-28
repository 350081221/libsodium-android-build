.class final Lcom/ss/android/downloadlib/b/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/downloadlib/b/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/b/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/json/JSONObject;

.field final synthetic b:Lcom/ss/android/downloadad/api/a/a;


# direct methods
.method constructor <init>(Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/b/a$1;->a:Lorg/json/JSONObject;

    iput-object p2, p0, Lcom/ss/android/downloadlib/b/a$1;->b:Lcom/ss/android/downloadad/api/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 11

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const-string v1, "deeplink_success"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v1, "deeplink_failed"

    .line 11
    .line 12
    :goto_0
    iget-object v2, p0, Lcom/ss/android/downloadlib/b/a$1;->a:Lorg/json/JSONObject;

    .line 13
    .line 14
    iget-object v3, p0, Lcom/ss/android/downloadlib/b/a$1;->b:Lcom/ss/android/downloadad/api/a/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/d/a;->b(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/a/a;)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->v()Lcom/ss/android/download/api/config/s;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    iget-object p1, p0, Lcom/ss/android/downloadlib/b/a$1;->b:Lcom/ss/android/downloadad/api/a/a;

    .line 30
    .line 31
    invoke-interface {p1}, Lcom/ss/android/downloadad/api/a/a;->u()Lcom/ss/android/download/api/download/DownloadModel;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-object p1, p0, Lcom/ss/android/downloadlib/b/a$1;->b:Lcom/ss/android/downloadad/api/a/a;

    .line 36
    .line 37
    invoke-interface {p1}, Lcom/ss/android/downloadad/api/a/a;->w()Lcom/ss/android/download/api/download/DownloadController;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    iget-object p1, p0, Lcom/ss/android/downloadlib/b/a$1;->b:Lcom/ss/android/downloadad/api/a/a;

    .line 42
    .line 43
    invoke-interface {p1}, Lcom/ss/android/downloadad/api/a/a;->v()Lcom/ss/android/download/api/download/DownloadEventConfig;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    iget-object p1, p0, Lcom/ss/android/downloadlib/b/a$1;->b:Lcom/ss/android/downloadad/api/a/a;

    .line 48
    .line 49
    invoke-interface {p1}, Lcom/ss/android/downloadad/api/a/a;->e()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    const/4 v10, 0x0

    .line 54
    invoke-interface/range {v4 .. v10}, Lcom/ss/android/download/api/config/s;->a(Landroid/content/Context;Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/download/DownloadEventConfig;Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    :cond_1
    return-void
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
