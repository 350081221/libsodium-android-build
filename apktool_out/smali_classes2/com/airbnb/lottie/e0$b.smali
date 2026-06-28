.class public final Lcom/airbnb/lottie/e0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Lcom/airbnb/lottie/network/f;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private b:Lcom/airbnb/lottie/network/e;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Lcom/airbnb/lottie/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/airbnb/lottie/e0$b;->c:Z

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/airbnb/lottie/e0$b;->d:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/airbnb/lottie/e0$b;->e:Z

    .line 11
    .line 12
    sget-object v0, Lcom/airbnb/lottie/a;->AUTOMATIC:Lcom/airbnb/lottie/a;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/airbnb/lottie/e0$b;->f:Lcom/airbnb/lottie/a;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public a()Lcom/airbnb/lottie/e0;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v8, Lcom/airbnb/lottie/e0;

    iget-object v1, p0, Lcom/airbnb/lottie/e0$b;->a:Lcom/airbnb/lottie/network/f;

    iget-object v2, p0, Lcom/airbnb/lottie/e0$b;->b:Lcom/airbnb/lottie/network/e;

    iget-boolean v3, p0, Lcom/airbnb/lottie/e0$b;->c:Z

    iget-boolean v4, p0, Lcom/airbnb/lottie/e0$b;->d:Z

    iget-boolean v5, p0, Lcom/airbnb/lottie/e0$b;->e:Z

    iget-object v6, p0, Lcom/airbnb/lottie/e0$b;->f:Lcom/airbnb/lottie/a;

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/airbnb/lottie/e0;-><init>(Lcom/airbnb/lottie/network/f;Lcom/airbnb/lottie/network/e;ZZZLcom/airbnb/lottie/a;Lcom/airbnb/lottie/e0$a;)V

    return-object v8
.end method

.method public b(Lcom/airbnb/lottie/a;)Lcom/airbnb/lottie/e0$b;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lcom/airbnb/lottie/e0$b;->f:Lcom/airbnb/lottie/a;

    return-object p0
.end method

.method public c(Z)Lcom/airbnb/lottie/e0$b;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-boolean p1, p0, Lcom/airbnb/lottie/e0$b;->e:Z

    return-object p0
.end method

.method public d(Z)Lcom/airbnb/lottie/e0$b;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-boolean p1, p0, Lcom/airbnb/lottie/e0$b;->d:Z

    return-object p0
.end method

.method public e(Z)Lcom/airbnb/lottie/e0$b;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-boolean p1, p0, Lcom/airbnb/lottie/e0$b;->c:Z

    return-object p0
.end method

.method public f(Ljava/io/File;)Lcom/airbnb/lottie/e0$b;
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/e0$b;->b:Lcom/airbnb/lottie/network/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/airbnb/lottie/e0$b$a;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lcom/airbnb/lottie/e0$b$a;-><init>(Lcom/airbnb/lottie/e0$b;Ljava/io/File;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/airbnb/lottie/e0$b;->b:Lcom/airbnb/lottie/network/e;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "There is already a cache provider!"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public g(Lcom/airbnb/lottie/network/e;)Lcom/airbnb/lottie/e0$b;
    .locals 1
    .param p1    # Lcom/airbnb/lottie/network/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/e0$b;->b:Lcom/airbnb/lottie/network/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/airbnb/lottie/e0$b$b;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lcom/airbnb/lottie/e0$b$b;-><init>(Lcom/airbnb/lottie/e0$b;Lcom/airbnb/lottie/network/e;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/airbnb/lottie/e0$b;->b:Lcom/airbnb/lottie/network/e;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "There is already a cache provider!"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public h(Lcom/airbnb/lottie/network/f;)Lcom/airbnb/lottie/e0$b;
    .locals 0
    .param p1    # Lcom/airbnb/lottie/network/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lcom/airbnb/lottie/e0$b;->a:Lcom/airbnb/lottie/network/f;

    return-object p0
.end method
