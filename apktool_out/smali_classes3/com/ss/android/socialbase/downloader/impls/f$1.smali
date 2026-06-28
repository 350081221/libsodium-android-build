.class Lcom/ss/android/socialbase/downloader/impls/f$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/downloader/network/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/impls/f;->a(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lokhttp3/Response;

.field final synthetic b:Lokhttp3/Call;

.field final synthetic c:Lcom/ss/android/socialbase/downloader/impls/f;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/impls/f;Lokhttp3/Response;Lokhttp3/Call;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/f$1;->c:Lcom/ss/android/socialbase/downloader/impls/f;

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/impls/f$1;->a:Lokhttp3/Response;

    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/impls/f$1;->b:Lokhttp3/Call;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/f$1;->a:Lokhttp3/Response;

    invoke-virtual {v0, p1}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/f$1;->a:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->code()I

    move-result v0

    return v0
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/f$1;->b:Lokhttp3/Call;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lokhttp3/Call;->isCanceled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/f$1;->b:Lokhttp3/Call;

    .line 12
    .line 13
    invoke-interface {v0}, Lokhttp3/Call;->cancel()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
