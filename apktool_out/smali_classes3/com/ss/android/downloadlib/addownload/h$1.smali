.class Lcom/ss/android/downloadlib/addownload/h$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/download/api/config/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/h;->a(Lcom/ss/android/download/api/config/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/download/api/config/t;

.field final synthetic b:Lcom/ss/android/downloadlib/addownload/h;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/h;Lcom/ss/android/download/api/config/t;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/h$1;->b:Lcom/ss/android/downloadlib/addownload/h;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/h$1;->a:Lcom/ss/android/download/api/config/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h$1;->a:Lcom/ss/android/download/api/config/t;

    invoke-interface {v0}, Lcom/ss/android/download/api/config/t;->a()V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 7

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->d()Lcom/ss/android/download/api/config/l;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/h$1;->b:Lcom/ss/android/downloadlib/addownload/h;

    iget-object v3, v3, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iget-object v3, v3, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    const-string v4, "\u60a8\u5df2\u7981\u6b62\u4f7f\u7528\u5b58\u50a8\u6743\u9650\uff0c\u8bf7\u6388\u6743\u540e\u518d\u4e0b\u8f7d"

    const/4 v5, 0x0

    const/4 v6, 0x1

    .line 4
    invoke-interface/range {v0 .. v6}, Lcom/ss/android/download/api/config/l;->a(ILandroid/content/Context;Lcom/ss/android/download/api/download/DownloadModel;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/h$1;->b:Lcom/ss/android/downloadlib/addownload/h;

    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/h;->a(Lcom/ss/android/downloadlib/addownload/h;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/d/a;->b(JI)V

    .line 6
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h$1;->a:Lcom/ss/android/download/api/config/t;

    invoke-interface {v0, p1}, Lcom/ss/android/download/api/config/t;->a(Ljava/lang/String;)V

    return-void
.end method
