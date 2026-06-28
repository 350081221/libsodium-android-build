.class final Lcom/airbnb/lottie/k$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/airbnb/lottie/z0;
.implements Lcom/airbnb/lottie/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/k$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/airbnb/lottie/z0<",
        "Lcom/airbnb/lottie/k;",
        ">;",
        "Lcom/airbnb/lottie/b;"
    }
.end annotation


# instance fields
.field private final a:Lcom/airbnb/lottie/h1;

.field private b:Z


# direct methods
.method private constructor <init>(Lcom/airbnb/lottie/h1;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/airbnb/lottie/k$b$a;->b:Z

    .line 4
    iput-object p1, p0, Lcom/airbnb/lottie/k$b$a;->a:Lcom/airbnb/lottie/h1;

    return-void
.end method

.method synthetic constructor <init>(Lcom/airbnb/lottie/h1;Lcom/airbnb/lottie/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/airbnb/lottie/k$b$a;-><init>(Lcom/airbnb/lottie/h1;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/airbnb/lottie/k;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/airbnb/lottie/k$b$a;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/airbnb/lottie/k$b$a;->a:Lcom/airbnb/lottie/h1;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/airbnb/lottie/h1;->a(Lcom/airbnb/lottie/k;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
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
    .line 24
.end method

.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/airbnb/lottie/k$b$a;->b:Z

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/airbnb/lottie/k;

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/k$b$a;->a(Lcom/airbnb/lottie/k;)V

    return-void
.end method
