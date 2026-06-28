.class Lcom/ss/android/downloadlib/addownload/e$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/e;->g(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/ss/android/downloadlib/addownload/e;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/e;Z)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/e$9;->b:Lcom/ss/android/downloadlib/addownload/e;

    iput-boolean p2, p0, Lcom/ss/android/downloadlib/addownload/e$9;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e$9;->b:Lcom/ss/android/downloadlib/addownload/e;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/e;->f(Lcom/ss/android/downloadlib/addownload/e;)Lcom/ss/android/downloadlib/addownload/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/d;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e$9;->b:Lcom/ss/android/downloadlib/addownload/e;

    .line 15
    .line 16
    iget-boolean v1, p0, Lcom/ss/android/downloadlib/addownload/e$9;->a:Z

    .line 17
    .line 18
    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/addownload/e;->b(Lcom/ss/android/downloadlib/addownload/e;Z)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method
