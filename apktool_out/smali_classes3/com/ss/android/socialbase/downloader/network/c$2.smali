.class Lcom/ss/android/socialbase/downloader/network/c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/network/c;->b(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/c$a;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/downloader/network/c$a;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/ss/android/socialbase/downloader/network/c$b;

.field final synthetic d:Lcom/ss/android/socialbase/downloader/network/c;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/network/c;Lcom/ss/android/socialbase/downloader/network/c$a;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/c$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/network/c$2;->d:Lcom/ss/android/socialbase/downloader/network/c;

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/network/c$2;->a:Lcom/ss/android/socialbase/downloader/network/c$a;

    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/network/c$2;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/ss/android/socialbase/downloader/network/c$2;->c:Lcom/ss/android/socialbase/downloader/network/c$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/c$2;->a:Lcom/ss/android/socialbase/downloader/network/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/network/c$2;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/network/c$2;->c:Lcom/ss/android/socialbase/downloader/network/c$b;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v2, v2, Lcom/ss/android/socialbase/downloader/network/c$b;->a:Ljava/util/List;

    .line 14
    .line 15
    :goto_0
    invoke-interface {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/network/c$a;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
