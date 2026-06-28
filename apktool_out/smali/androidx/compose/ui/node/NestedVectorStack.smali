.class public final Landroidx/compose/ui/node/NestedVectorStack;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0006\u0010\u0004\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0014\u0010\n\u001a\u00020\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007R\u0016\u0010\u000c\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R$\u0010\u0012\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00070\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroidx/compose/ui/node/NestedVectorStack;",
        "T",
        "",
        "",
        "isNotEmpty",
        "pop",
        "()Ljava/lang/Object;",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "vector",
        "Lkotlin/r2;",
        "push",
        "",
        "size",
        "I",
        "",
        "currentIndexes",
        "[I",
        "",
        "vectors",
        "[Landroidx/compose/runtime/collection/MutableVector;",
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nNestedVectorStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,61:1\n523#2:62\n*S KotlinDebug\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n*L\n44#1:62\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private currentIndexes:[I
    .annotation build Lp4/l;
    .end annotation
.end field

.field private size:I

.field private vectors:[Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x10

    .line 5
    .line 6
    new-array v1, v0, [I

    .line 7
    .line 8
    iput-object v1, p0, Landroidx/compose/ui/node/NestedVectorStack;->currentIndexes:[I

    .line 9
    .line 10
    new-array v0, v0, [Landroidx/compose/runtime/collection/MutableVector;

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/compose/ui/node/NestedVectorStack;->vectors:[Landroidx/compose/runtime/collection/MutableVector;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method


# virtual methods
.method public final isNotEmpty()Z
    .locals 3

    iget v0, p0, Landroidx/compose/ui/node/NestedVectorStack;->size:I

    if-lez v0, :cond_0

    iget-object v1, p0, Landroidx/compose/ui/node/NestedVectorStack;->currentIndexes:[I

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    aget v0, v1, v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public final pop()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget v0, p0, Landroidx/compose/ui/node/NestedVectorStack;->size:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    move v2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-eqz v2, :cond_3

    .line 10
    .line 11
    sub-int/2addr v0, v1

    .line 12
    iget-object v1, p0, Landroidx/compose/ui/node/NestedVectorStack;->currentIndexes:[I

    .line 13
    .line 14
    aget v1, v1, v0

    .line 15
    .line 16
    iget-object v2, p0, Landroidx/compose/ui/node/NestedVectorStack;->vectors:[Landroidx/compose/runtime/collection/MutableVector;

    .line 17
    .line 18
    aget-object v2, v2, v0

    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    if-lez v1, :cond_1

    .line 24
    .line 25
    iget-object v3, p0, Landroidx/compose/ui/node/NestedVectorStack;->currentIndexes:[I

    .line 26
    .line 27
    aget v4, v3, v0

    .line 28
    .line 29
    add-int/lit8 v4, v4, -0x1

    .line 30
    .line 31
    aput v4, v3, v0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    if-nez v1, :cond_2

    .line 35
    .line 36
    iget-object v3, p0, Landroidx/compose/ui/node/NestedVectorStack;->vectors:[Landroidx/compose/runtime/collection/MutableVector;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    aput-object v4, v3, v0

    .line 40
    .line 41
    iget v0, p0, Landroidx/compose/ui/node/NestedVectorStack;->size:I

    .line 42
    .line 43
    add-int/lit8 v0, v0, -0x1

    .line 44
    .line 45
    iput v0, p0, Landroidx/compose/ui/node/NestedVectorStack;->size:I

    .line 46
    .line 47
    :cond_2
    :goto_1
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    aget-object v0, v0, v1

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v1, "Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()"

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final push(Landroidx/compose/runtime/collection/MutableVector;)V
    .locals 4
    .param p1    # Landroidx/compose/runtime/collection/MutableVector;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/MutableVector;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Landroidx/compose/ui/node/NestedVectorStack;->size:I

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/compose/ui/node/NestedVectorStack;->currentIndexes:[I

    .line 11
    .line 12
    array-length v2, v1

    .line 13
    if-lt v0, v2, :cond_1

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    mul-int/lit8 v2, v2, 0x2

    .line 17
    .line 18
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([II)[I

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "copyOf(this, newSize)"

    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Landroidx/compose/ui/node/NestedVectorStack;->currentIndexes:[I

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/compose/ui/node/NestedVectorStack;->vectors:[Landroidx/compose/runtime/collection/MutableVector;

    .line 30
    .line 31
    array-length v3, v1

    .line 32
    mul-int/lit8 v3, v3, 0x2

    .line 33
    .line 34
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    check-cast v1, [Landroidx/compose/runtime/collection/MutableVector;

    .line 42
    .line 43
    iput-object v1, p0, Landroidx/compose/ui/node/NestedVectorStack;->vectors:[Landroidx/compose/runtime/collection/MutableVector;

    .line 44
    .line 45
    :cond_1
    iget-object v1, p0, Landroidx/compose/ui/node/NestedVectorStack;->currentIndexes:[I

    .line 46
    .line 47
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-int/lit8 v2, v2, -0x1

    .line 52
    .line 53
    aput v2, v1, v0

    .line 54
    .line 55
    iget-object v1, p0, Landroidx/compose/ui/node/NestedVectorStack;->vectors:[Landroidx/compose/runtime/collection/MutableVector;

    .line 56
    .line 57
    aput-object p1, v1, v0

    .line 58
    .line 59
    iget p1, p0, Landroidx/compose/ui/node/NestedVectorStack;->size:I

    .line 60
    .line 61
    add-int/lit8 p1, p1, 0x1

    .line 62
    .line 63
    iput p1, p0, Landroidx/compose/ui/node/NestedVectorStack;->size:I

    .line 64
    .line 65
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
