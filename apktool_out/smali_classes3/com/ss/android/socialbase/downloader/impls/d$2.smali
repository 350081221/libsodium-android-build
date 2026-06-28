.class Lcom/ss/android/socialbase/downloader/impls/d$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/downloader/downloader/c$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/impls/d;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/downloader/impls/d;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/impls/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/d$2;->a:Lcom/ss/android/socialbase/downloader/impls/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/d$2;->a:Lcom/ss/android/socialbase/downloader/impls/d;

    .line 2
    .line 3
    new-instance v1, Lcom/ss/android/socialbase/downloader/b/e;

    .line 4
    .line 5
    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/b/e;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/impls/d;->a(Lcom/ss/android/socialbase/downloader/impls/d;Lcom/ss/android/socialbase/downloader/downloader/t;)Lcom/ss/android/socialbase/downloader/downloader/t;

    .line 9
    .line 10
    .line 11
    const-string v0, "DefaultDownloadCache"

    .line 12
    .line 13
    const-string v1, "rebind error,use backup sqlDownloadCache"

    .line 14
    .line 15
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
