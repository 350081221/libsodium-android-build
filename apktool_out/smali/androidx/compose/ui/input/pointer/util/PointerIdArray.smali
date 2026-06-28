.class public final Landroidx/compose/ui/input/pointer/util/PointerIdArray;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0016\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008%\u0010&J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0018\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0004\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000e\u0010\u000c\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\rJ\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0004\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u000bJ\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0086\u0002J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0004H\u0086\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0014J\u0018\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0004\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u000bJ\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rR$\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0012\u0010$\u001a\u00020\u00028\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u001f\u0082\u0002\u000b\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\'"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/util/PointerIdArray;",
        "",
        "",
        "index",
        "Landroidx/compose/ui/input/pointer/PointerId;",
        "get-_I2yYro",
        "(I)J",
        "get",
        "pointerId",
        "",
        "remove-0FcD4WY",
        "(J)Z",
        "remove",
        "",
        "pointerIdValue",
        "removeAt",
        "isEmpty",
        "value",
        "add",
        "add-0FcD4WY",
        "Lkotlin/r2;",
        "set",
        "set-DmW0f2w",
        "(IJ)V",
        "clear",
        "contains-0FcD4WY",
        "contains",
        "<set-?>",
        "size",
        "I",
        "getSize",
        "()I",
        "",
        "internalArray",
        "[J",
        "getLastIndex",
        "lastIndex",
        "<init>",
        "()V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private internalArray:[J
    .annotation build Lp4/l;
    .end annotation
.end field

.field private size:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    new-array v0, v0, [J

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->internalArray:[J

    .line 8
    .line 9
    return-void
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
.end method


# virtual methods
.method public final add(J)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->contains(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->size:I

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1, p2}, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->set(IJ)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
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
.end method

.method public final add-0FcD4WY(J)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->add(J)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->size:I

    return-void
.end method

.method public final contains(J)Z
    .locals 6

    .line 1
    iget v0, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->size:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->internalArray:[J

    .line 8
    .line 9
    aget-wide v4, v3, v2

    .line 10
    .line 11
    cmp-long v3, v4, p1

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    return v1
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
.end method

.method public final contains-0FcD4WY(J)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->contains(J)Z

    move-result p1

    return p1
.end method

.method public final get-_I2yYro(I)J
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->internalArray:[J

    aget-wide v1, v0, p1

    invoke-static {v1, v2}, Landroidx/compose/ui/input/pointer/PointerId;->constructor-impl(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getLastIndex()I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->getSize()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final getSize()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->size:I

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    iget v0, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->size:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove(J)Z
    .locals 5

    .line 1
    iget v0, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->size:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v2}, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->get-_I2yYro(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    cmp-long v3, p1, v3

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->removeAt(I)Z

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return v1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final remove-0FcD4WY(J)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->remove(J)Z

    move-result p1

    return p1
.end method

.method public final removeAt(I)Z
    .locals 6

    .line 1
    iget v0, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->size:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_1

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    :goto_0
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->internalArray:[J

    .line 10
    .line 11
    add-int/lit8 v3, p1, 0x1

    .line 12
    .line 13
    aget-wide v4, v2, v3

    .line 14
    .line 15
    aput-wide v4, v2, p1

    .line 16
    .line 17
    move p1, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget p1, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->size:I

    .line 20
    .line 21
    add-int/lit8 p1, p1, -0x1

    .line 22
    .line 23
    iput p1, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->size:I

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return p1
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final set(IJ)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->internalArray:[J

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-lt p1, v1, :cond_0

    .line 5
    .line 6
    add-int/lit8 v1, p1, 0x1

    .line 7
    .line 8
    array-length v2, v0

    .line 9
    mul-int/lit8 v2, v2, 0x2

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "copyOf(this, newSize)"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->internalArray:[J

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->internalArray:[J

    .line 27
    .line 28
    aput-wide p2, v0, p1

    .line 29
    .line 30
    iget p2, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->size:I

    .line 31
    .line 32
    if-lt p1, p2, :cond_1

    .line 33
    .line 34
    add-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    iput p1, p0, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->size:I

    .line 37
    .line 38
    :cond_1
    return-void
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
.end method

.method public final set-DmW0f2w(IJ)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/ui/input/pointer/util/PointerIdArray;->set(IJ)V

    return-void
.end method
