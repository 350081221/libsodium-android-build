.class Lcom/ss/android/downloadlib/addownload/h$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/downloadlib/g/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/h;->b(Lcom/ss/android/download/api/config/t;)V
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

    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/h$2;->b:Lcom/ss/android/downloadlib/addownload/h;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/h$2;->a:Lcom/ss/android/download/api/config/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h$2;->a:Lcom/ss/android/download/api/config/t;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/config/t;->a()V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/h$2;->a:Lcom/ss/android/download/api/config/t;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/config/t;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
