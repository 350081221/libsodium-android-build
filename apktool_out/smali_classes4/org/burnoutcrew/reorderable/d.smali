.class public final Lorg/burnoutcrew/reorderable/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\n\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "Lorg/burnoutcrew/reorderable/d;",
        "",
        "",
        "a",
        "b",
        "index",
        "key",
        "c",
        "",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "I",
        "e",
        "()I",
        "Ljava/lang/Object;",
        "f",
        "()Ljava/lang/Object;",
        "<init>",
        "(ILjava/lang/Object;)V",
        "reorderable"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final c:I = 0x8


# instance fields
.field private final a:I

.field private final b:Ljava/lang/Object;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/lang/Object;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/burnoutcrew/reorderable/d;->a:I

    iput-object p2, p0, Lorg/burnoutcrew/reorderable/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic d(Lorg/burnoutcrew/reorderable/d;ILjava/lang/Object;ILjava/lang/Object;)Lorg/burnoutcrew/reorderable/d;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lorg/burnoutcrew/reorderable/d;->a:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lorg/burnoutcrew/reorderable/d;->b:Ljava/lang/Object;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/burnoutcrew/reorderable/d;->c(ILjava/lang/Object;)Lorg/burnoutcrew/reorderable/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lorg/burnoutcrew/reorderable/d;->a:I

    return v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lorg/burnoutcrew/reorderable/d;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final c(ILjava/lang/Object;)Lorg/burnoutcrew/reorderable/d;
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lorg/burnoutcrew/reorderable/d;

    invoke-direct {v0, p1, p2}, Lorg/burnoutcrew/reorderable/d;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lorg/burnoutcrew/reorderable/d;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/burnoutcrew/reorderable/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/burnoutcrew/reorderable/d;

    iget v1, p0, Lorg/burnoutcrew/reorderable/d;->a:I

    iget v3, p1, Lorg/burnoutcrew/reorderable/d;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/burnoutcrew/reorderable/d;->b:Ljava/lang/Object;

    iget-object p1, p1, Lorg/burnoutcrew/reorderable/d;->b:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lorg/burnoutcrew/reorderable/d;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lorg/burnoutcrew/reorderable/d;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/burnoutcrew/reorderable/d;->b:Ljava/lang/Object;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ItemPosition(index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/burnoutcrew/reorderable/d;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/burnoutcrew/reorderable/d;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
