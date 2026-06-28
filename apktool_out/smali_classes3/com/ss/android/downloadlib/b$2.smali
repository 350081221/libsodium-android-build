.class Lcom/ss/android/downloadlib/b$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/download/api/model/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/b;->b(Landroid/content/Context;Ljava/lang/String;ZLcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/download/DownloadStatusChangeListener;IZLcom/ss/android/download/api/config/IDownloadButtonClickListener;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/download/api/download/DownloadModel;

.field final synthetic b:Lcom/ss/android/download/api/download/DownloadEventConfig;

.field final synthetic c:Lcom/ss/android/download/api/download/DownloadController;

.field final synthetic d:Lcom/ss/android/downloadlib/b;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/b;Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/b$2;->d:Lcom/ss/android/downloadlib/b;

    iput-object p2, p0, Lcom/ss/android/downloadlib/b$2;->a:Lcom/ss/android/download/api/download/DownloadModel;

    iput-object p3, p0, Lcom/ss/android/downloadlib/b$2;->b:Lcom/ss/android/download/api/download/DownloadEventConfig;

    iput-object p4, p0, Lcom/ss/android/downloadlib/b$2;->c:Lcom/ss/android/download/api/download/DownloadController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/DialogInterface;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/b$2;->d:Lcom/ss/android/downloadlib/b;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ss/android/downloadlib/b;->a(Lcom/ss/android/downloadlib/b;)Lcom/ss/android/downloadlib/i;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v0, p0, Lcom/ss/android/downloadlib/b$2;->a:Lcom/ss/android/download/api/download/DownloadModel;

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v0, p0, Lcom/ss/android/downloadlib/b$2;->a:Lcom/ss/android/download/api/download/DownloadModel;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    const/4 v5, 0x2

    .line 20
    iget-object v6, p0, Lcom/ss/android/downloadlib/b$2;->b:Lcom/ss/android/download/api/download/DownloadEventConfig;

    .line 21
    .line 22
    iget-object v7, p0, Lcom/ss/android/downloadlib/b$2;->c:Lcom/ss/android/download/api/download/DownloadController;

    .line 23
    .line 24
    invoke-virtual/range {v1 .. v7}, Lcom/ss/android/downloadlib/i;->a(Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lcom/ss/android/downloadlib/b$2;->a:Lcom/ss/android/download/api/download/DownloadModel;

    .line 32
    .line 33
    iget-object v2, p0, Lcom/ss/android/downloadlib/b$2;->b:Lcom/ss/android/download/api/download/DownloadEventConfig;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/ss/android/downloadlib/b$2;->c:Lcom/ss/android/download/api/download/DownloadController;

    .line 36
    .line 37
    const-string v4, "landing_download_dialog_confirm"

    .line 38
    .line 39
    invoke-virtual {v0, v4, v1, v2, v3}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 43
    .line 44
    .line 45
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
.end method

.method public b(Landroid/content/DialogInterface;)V
    .locals 5

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/ss/android/downloadlib/b$2;->a:Lcom/ss/android/download/api/download/DownloadModel;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/ss/android/downloadlib/b$2;->b:Lcom/ss/android/download/api/download/DownloadEventConfig;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/ss/android/downloadlib/b$2;->c:Lcom/ss/android/download/api/download/DownloadController;

    .line 10
    .line 11
    const-string v4, "landing_download_dialog_cancel"

    .line 12
    .line 13
    invoke-virtual {v0, v4, v1, v2, v3}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public c(Landroid/content/DialogInterface;)V
    .locals 4

    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p1

    iget-object v0, p0, Lcom/ss/android/downloadlib/b$2;->a:Lcom/ss/android/download/api/download/DownloadModel;

    iget-object v1, p0, Lcom/ss/android/downloadlib/b$2;->b:Lcom/ss/android/download/api/download/DownloadEventConfig;

    iget-object v2, p0, Lcom/ss/android/downloadlib/b$2;->c:Lcom/ss/android/download/api/download/DownloadController;

    const-string v3, "landing_download_dialog_cancel"

    invoke-virtual {p1, v3, v0, v1, v2}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V

    return-void
.end method
