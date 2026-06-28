.class public final Lorg/burnoutcrew/reorderable/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u001e\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0019\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J,\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\r\u001a\u00020\u000cH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R \u0010\u0008\u001a\u00020\u00028\u0006\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0004R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0007\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0019"
    }
    d2 = {
        "Lorg/burnoutcrew/reorderable/n;",
        "",
        "Landroidx/compose/ui/input/pointer/PointerId;",
        "a",
        "()J",
        "Landroidx/compose/ui/geometry/Offset;",
        "b",
        "()Landroidx/compose/ui/geometry/Offset;",
        "id",
        "offset",
        "c",
        "(JLandroidx/compose/ui/geometry/Offset;)Lorg/burnoutcrew/reorderable/n;",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "J",
        "e",
        "Landroidx/compose/ui/geometry/Offset;",
        "f",
        "<init>",
        "(JLandroidx/compose/ui/geometry/Offset;Lkotlin/jvm/internal/w;)V",
        "reorderable"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:Landroidx/compose/ui/geometry/Offset;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method private constructor <init>(JLandroidx/compose/ui/geometry/Offset;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lorg/burnoutcrew/reorderable/n;->a:J

    iput-object p3, p0, Lorg/burnoutcrew/reorderable/n;->b:Landroidx/compose/ui/geometry/Offset;

    return-void
.end method

.method public synthetic constructor <init>(JLandroidx/compose/ui/geometry/Offset;ILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    const/4 p5, 0x0

    if-eqz p4, :cond_0

    move-object p3, p5

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3, p5}, Lorg/burnoutcrew/reorderable/n;-><init>(JLandroidx/compose/ui/geometry/Offset;Lkotlin/jvm/internal/w;)V

    return-void
.end method

.method public synthetic constructor <init>(JLandroidx/compose/ui/geometry/Offset;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lorg/burnoutcrew/reorderable/n;-><init>(JLandroidx/compose/ui/geometry/Offset;)V

    return-void
.end method

.method public static synthetic d(Lorg/burnoutcrew/reorderable/n;JLandroidx/compose/ui/geometry/Offset;ILjava/lang/Object;)Lorg/burnoutcrew/reorderable/n;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-wide p1, p0, Lorg/burnoutcrew/reorderable/n;->a:J

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-object p3, p0, Lorg/burnoutcrew/reorderable/n;->b:Landroidx/compose/ui/geometry/Offset;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/burnoutcrew/reorderable/n;->c(JLandroidx/compose/ui/geometry/Offset;)Lorg/burnoutcrew/reorderable/n;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lorg/burnoutcrew/reorderable/n;->a:J

    return-wide v0
.end method

.method public final b()Landroidx/compose/ui/geometry/Offset;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lorg/burnoutcrew/reorderable/n;->b:Landroidx/compose/ui/geometry/Offset;

    return-object v0
.end method

.method public final c(JLandroidx/compose/ui/geometry/Offset;)Lorg/burnoutcrew/reorderable/n;
    .locals 2
    .param p3    # Landroidx/compose/ui/geometry/Offset;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lorg/burnoutcrew/reorderable/n;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lorg/burnoutcrew/reorderable/n;-><init>(JLandroidx/compose/ui/geometry/Offset;Lkotlin/jvm/internal/w;)V

    return-object v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lorg/burnoutcrew/reorderable/n;->a:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/burnoutcrew/reorderable/n;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/burnoutcrew/reorderable/n;

    iget-wide v3, p0, Lorg/burnoutcrew/reorderable/n;->a:J

    iget-wide v5, p1, Lorg/burnoutcrew/reorderable/n;->a:J

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/burnoutcrew/reorderable/n;->b:Landroidx/compose/ui/geometry/Offset;

    iget-object p1, p1, Lorg/burnoutcrew/reorderable/n;->b:Landroidx/compose/ui/geometry/Offset;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final f()Landroidx/compose/ui/geometry/Offset;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lorg/burnoutcrew/reorderable/n;->b:Landroidx/compose/ui/geometry/Offset;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lorg/burnoutcrew/reorderable/n;->a:J

    invoke-static {v0, v1}, Landroidx/compose/ui/input/pointer/PointerId;->hashCode-impl(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/burnoutcrew/reorderable/n;->b:Landroidx/compose/ui/geometry/Offset;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->hashCode-impl(J)I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StartDrag(id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lorg/burnoutcrew/reorderable/n;->a:J

    invoke-static {v1, v2}, Landroidx/compose/ui/input/pointer/PointerId;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/burnoutcrew/reorderable/n;->b:Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
