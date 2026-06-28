.class public final Lcom/airbnb/lottie/compose/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/airbnb/lottie/compose/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/compose/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0088\u0001\u0002\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;",
        "Lcom/airbnb/lottie/compose/LottieCompositionSpec;",
        "uri",
        "Landroid/net/Uri;",
        "constructor-impl",
        "(Landroid/net/Uri;)Landroid/net/Uri;",
        "getUri",
        "()Landroid/net/Uri;",
        "equals",
        "",
        "other",
        "",
        "equals-impl",
        "(Landroid/net/Uri;Ljava/lang/Object;)Z",
        "hashCode",
        "",
        "hashCode-impl",
        "(Landroid/net/Uri;)I",
        "toString",
        "",
        "toString-impl",
        "(Landroid/net/Uri;)Ljava/lang/String;",
        "lottie-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lu3/f;
.end annotation


# instance fields
.field private final a:Landroid/net/Uri;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method private synthetic constructor <init>(Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/airbnb/lottie/compose/i$b;->a:Landroid/net/Uri;

    return-void
.end method

.method public static final synthetic a(Landroid/net/Uri;)Lcom/airbnb/lottie/compose/i$b;
    .locals 1

    new-instance v0, Lcom/airbnb/lottie/compose/i$b;

    invoke-direct {v0, p0}, Lcom/airbnb/lottie/compose/i$b;-><init>(Landroid/net/Uri;)V

    return-object v0
.end method

.method public static b(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 1
    .param p0    # Landroid/net/Uri;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string/jumbo v0, "uri"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static c(Landroid/net/Uri;Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/airbnb/lottie/compose/i$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/airbnb/lottie/compose/i$b;

    invoke-virtual {p1}, Lcom/airbnb/lottie/compose/i$b;->h()Landroid/net/Uri;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final d(Landroid/net/Uri;Landroid/net/Uri;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static f(Landroid/net/Uri;)I
    .locals 0

    invoke-virtual {p0}, Landroid/net/Uri;->hashCode()I

    move-result p0

    return p0
.end method

.method public static g(Landroid/net/Uri;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentProvider(uri="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e()Landroid/net/Uri;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/compose/i$b;->a:Landroid/net/Uri;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/compose/i$b;->a:Landroid/net/Uri;

    invoke-static {v0, p1}, Lcom/airbnb/lottie/compose/i$b;->c(Landroid/net/Uri;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic h()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/compose/i$b;->a:Landroid/net/Uri;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/compose/i$b;->a:Landroid/net/Uri;

    invoke-static {v0}, Lcom/airbnb/lottie/compose/i$b;->f(Landroid/net/Uri;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/compose/i$b;->a:Landroid/net/Uri;

    invoke-static {v0}, Lcom/airbnb/lottie/compose/i$b;->g(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
