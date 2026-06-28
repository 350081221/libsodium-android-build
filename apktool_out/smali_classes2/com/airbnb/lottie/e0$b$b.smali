.class Lcom/airbnb/lottie/e0$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/airbnb/lottie/network/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/e0$b;->g(Lcom/airbnb/lottie/network/e;)Lcom/airbnb/lottie/e0$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/airbnb/lottie/network/e;

.field final synthetic b:Lcom/airbnb/lottie/e0$b;


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/e0$b;Lcom/airbnb/lottie/network/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/airbnb/lottie/e0$b$b;->b:Lcom/airbnb/lottie/e0$b;

    iput-object p2, p0, Lcom/airbnb/lottie/e0$b$b;->a:Lcom/airbnb/lottie/network/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/io/File;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/e0$b$b;->a:Lcom/airbnb/lottie/network/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/airbnb/lottie/network/e;->a()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v1, "cache file must be a directory"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method
