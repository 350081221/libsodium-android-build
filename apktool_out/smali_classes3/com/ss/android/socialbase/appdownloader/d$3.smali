.class Lcom/ss/android/socialbase/appdownloader/d$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/downloader/impls/r$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/d;->t()V
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

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/d$3;->a:Lcom/ss/android/socialbase/appdownloader/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;JZI)V
    .locals 0

    invoke-static {p1, p2, p3, p4, p5}, Lcom/ss/android/socialbase/appdownloader/RetryJobSchedulerService;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;JZI)V

    return-void
.end method
