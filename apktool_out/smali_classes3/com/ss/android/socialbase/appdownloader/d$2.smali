.class Lcom/ss/android/socialbase/appdownloader/d$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/d;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/appdownloader/d;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/appdownloader/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/d$2;->a:Lcom/ss/android/socialbase/appdownloader/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "registerDownloadReceiver tryUnRegisterTempAppInstallDownloadReceiver run inner"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d$2;->a:Lcom/ss/android/socialbase/appdownloader/d;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/d;->l()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d$2;->a:Lcom/ss/android/socialbase/appdownloader/d;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/d;->a(Lcom/ss/android/socialbase/appdownloader/d;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method
