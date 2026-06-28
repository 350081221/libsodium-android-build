.class Lcom/ss/android/socialbase/downloader/impls/d$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/impls/d$1;->a(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/downloader/impls/d$1;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/impls/d$1;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/d$1$1;->a:Lcom/ss/android/socialbase/downloader/impls/d$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/d$1$1;->a:Lcom/ss/android/socialbase/downloader/impls/d$1;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/ss/android/socialbase/downloader/impls/d$1;->a:Lcom/ss/android/socialbase/downloader/impls/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/impls/d;->i()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    .line 12
    .line 13
    :goto_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
