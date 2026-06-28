.class public final Lcom/airbnb/lottie/compose/i$e;
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
    name = "e"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0087@\u0018\u00002\u00020\u0001B\u0014\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0088\u0001\u0002\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;",
        "Lcom/airbnb/lottie/compose/LottieCompositionSpec;",
        "resId",
        "",
        "constructor-impl",
        "(I)I",
        "getResId",
        "()I",
        "equals",
        "",
        "other",
        "",
        "equals-impl",
        "(ILjava/lang/Object;)Z",
        "hashCode",
        "hashCode-impl",
        "toString",
        "",
        "toString-impl",
        "(I)Ljava/lang/String;",
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
.field private final a:I


# direct methods
.method private synthetic constructor <init>(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/RawRes;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/airbnb/lottie/compose/i$e;->a:I

    return-void
.end method

.method public static final synthetic a(I)Lcom/airbnb/lottie/compose/i$e;
    .locals 1

    new-instance v0, Lcom/airbnb/lottie/compose/i$e;

    invoke-direct {v0, p0}, Lcom/airbnb/lottie/compose/i$e;-><init>(I)V

    return-object v0
.end method

.method public static b(I)I
    .locals 0
    .param p0    # I
        .annotation build Landroidx/annotation/RawRes;
        .end annotation
    .end param

    return p0
.end method

.method public static c(ILjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/airbnb/lottie/compose/i$e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/airbnb/lottie/compose/i$e;

    invoke-virtual {p1}, Lcom/airbnb/lottie/compose/i$e;->h()I

    move-result p1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final d(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static f(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    return p0
.end method

.method public static g(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RawRes(resId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e()I
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/compose/i$e;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/compose/i$e;->a:I

    invoke-static {v0, p1}, Lcom/airbnb/lottie/compose/i$e;->c(ILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic h()I
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/compose/i$e;->a:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/compose/i$e;->a:I

    invoke-static {v0}, Lcom/airbnb/lottie/compose/i$e;->f(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/compose/i$e;->a:I

    invoke-static {v0}, Lcom/airbnb/lottie/compose/i$e;->g(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
