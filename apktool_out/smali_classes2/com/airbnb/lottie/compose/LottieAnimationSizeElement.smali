.class public final Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001J\u0008\u0010\r\u001a\u00020\u0002H\u0016J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\u0008\u0010\u0012\u001a\u00020\u0004H\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u000c\u0010\u0018\u001a\u00020\u0016*\u00020\u0019H\u0016R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;",
        "Landroidx/compose/ui/node/ModifierNodeElement;",
        "Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;",
        "width",
        "",
        "height",
        "(II)V",
        "getHeight",
        "()I",
        "getWidth",
        "component1",
        "component2",
        "copy",
        "create",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "update",
        "",
        "node",
        "inspectableProperties",
        "Landroidx/compose/ui/platform/InspectorInfo;",
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


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->b:I

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static synthetic b(Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;IIILjava/lang/Object;)Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->a:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->b:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->a(II)Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(II)Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;

    invoke-direct {v0, p1, p2}, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;-><init>(II)V

    return-object v0
.end method

.method public c()Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;

    iget v1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->a:I

    iget v2, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->b:I

    invoke-direct {v0, v1, v2}, Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;-><init>(II)V

    return-object v0
.end method

.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->a:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->b:I

    return v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    invoke-virtual {p0}, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->c()Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->b:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget v1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->a:I

    .line 12
    .line 13
    check-cast p1, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;

    .line 14
    .line 15
    iget v3, p1, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->b:I

    .line 21
    .line 22
    iget p1, p1, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->b:I

    .line 23
    .line 24
    if-eq v1, p1, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    return v0
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public f(Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;)V
    .locals 1
    .param p1    # Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "node"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->a:I

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;->d(I)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->b:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;->c(I)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->b:I

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 3
    .param p1    # Landroidx/compose/ui/platform/InspectorInfo;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "Lottie Size"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->a:I

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string/jumbo v2, "width"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget v0, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->b:I

    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "height"

    .line 38
    .line 39
    invoke-virtual {p1, v1, v0}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lp4/l;
    .end annotation

    iget v0, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->a:I

    iget v1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->b:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "LottieAnimationSizeElement(width="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    check-cast p1, Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->f(Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;)V

    return-void
.end method
