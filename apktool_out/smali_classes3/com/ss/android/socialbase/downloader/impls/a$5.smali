.class Lcom/ss/android/socialbase/downloader/impls/a$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/impls/a;->c(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Z

.field final synthetic c:Lcom/ss/android/socialbase/downloader/impls/a;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/impls/a;IZ)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/a$5;->c:Lcom/ss/android/socialbase/downloader/impls/a;

    iput p2, p0, Lcom/ss/android/socialbase/downloader/impls/a$5;->a:I

    iput-boolean p3, p0, Lcom/ss/android/socialbase/downloader/impls/a$5;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/a$5;->c:Lcom/ss/android/socialbase/downloader/impls/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/ss/android/socialbase/downloader/impls/a$5;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/impls/a;->c(I)Lcom/ss/android/socialbase/downloader/h/c;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/a$5;->c:Lcom/ss/android/socialbase/downloader/impls/a;

    .line 9
    .line 10
    iget v1, p0, Lcom/ss/android/socialbase/downloader/impls/a$5;->a:I

    .line 11
    .line 12
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/impls/a$5;->b:Z

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/impls/a;->b(Lcom/ss/android/socialbase/downloader/impls/a;IZ)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
