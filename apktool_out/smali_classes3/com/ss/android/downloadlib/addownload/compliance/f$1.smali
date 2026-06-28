.class Lcom/ss/android/downloadlib/addownload/compliance/f$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/compliance/f;->a(Lcom/ss/android/downloadlib/addownload/b/e;Lcom/ss/android/downloadlib/addownload/compliance/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/downloadlib/addownload/b/e;

.field final synthetic b:Lcom/ss/android/downloadlib/addownload/compliance/h;

.field final synthetic c:Lcom/ss/android/downloadlib/addownload/compliance/f;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/compliance/f;Lcom/ss/android/downloadlib/addownload/b/e;Lcom/ss/android/downloadlib/addownload/compliance/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/f$1;->c:Lcom/ss/android/downloadlib/addownload/compliance/f;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/compliance/f$1;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    iput-object p3, p0, Lcom/ss/android/downloadlib/addownload/compliance/f$1;->b:Lcom/ss/android/downloadlib/addownload/compliance/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/f$1;->c:Lcom/ss/android/downloadlib/addownload/compliance/f;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/compliance/f$1;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a(Lcom/ss/android/downloadlib/addownload/compliance/f;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/compliance/f$1;->c:Lcom/ss/android/downloadlib/addownload/compliance/f;

    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/compliance/f$1;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    const/4 v5, 0x1

    const/4 v6, 0x4

    invoke-static {v3, v4, v5, v6}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a(Lcom/ss/android/downloadlib/addownload/compliance/f;Lcom/ss/android/downloadlib/addownload/b/e;ZI)[B

    move-result-object v3

    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/compliance/f$1;->b:Lcom/ss/android/downloadlib/addownload/compliance/h;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a(Lcom/ss/android/downloadlib/addownload/compliance/f;Lcom/ss/android/downloadlib/addownload/b/e;Ljava/lang/String;[BLcom/ss/android/downloadlib/addownload/compliance/h;)V

    return-void
.end method
