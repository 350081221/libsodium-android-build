.class final Landroidx/compose/runtime/snapshots/StateListIterator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements Lw3/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/ListIterator<",
        "TT;>;",
        "Lw3/f;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0008\u0010\u0006\u001a\u00020\u0005H\u0016J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016J\u000f\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u000b\u001a\u00020\u0007H\u0016J\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\nJ\u0008\u0010\u0011\u001a\u00020\u0003H\u0016J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u000eR\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/runtime/snapshots/StateListIterator;",
        "T",
        "",
        "Lkotlin/r2;",
        "validateModification",
        "",
        "hasPrevious",
        "",
        "nextIndex",
        "previous",
        "()Ljava/lang/Object;",
        "previousIndex",
        "element",
        "add",
        "(Ljava/lang/Object;)V",
        "hasNext",
        "next",
        "remove",
        "set",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "list",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "getList",
        "()Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "index",
        "I",
        "lastRequested",
        "structure",
        "offset",
        "<init>",
        "(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V",
        "runtime_release"
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
        "SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,484:1\n1#2:485\n*E\n"
    }
.end annotation


# instance fields
.field private index:I

.field private lastRequested:I

.field private final list:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private structure:I


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V
    .locals 0
    .param p1    # Landroidx/compose/runtime/snapshots/SnapshotStateList;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 5
    .line 6
    add-int/lit8 p2, p2, -0x1

    .line 7
    .line 8
    iput p2, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    .line 9
    .line 10
    const/4 p2, -0x1

    .line 11
    iput p2, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->lastRequested:I

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getStructure$runtime_release()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->structure:I

    .line 18
    .line 19
    return-void
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

.method private final validateModification()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getStructure$runtime_release()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->structure:I

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
    .line 18
    .line 19
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/StateListIterator;->validateModification()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 5
    .line 6
    iget v1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    .line 7
    .line 8
    add-int/lit8 v1, v1, 0x1

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, -0x1

    .line 14
    iput p1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->lastRequested:I

    .line 15
    .line 16
    iget p1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x1

    .line 19
    .line 20
    iput p1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    .line 21
    .line 22
    iget-object p1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getStructure$runtime_release()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->structure:I

    .line 29
    .line 30
    return-void
    .line 31
    .line 32
.end method

.method public final getList()Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object v0
.end method

.method public hasNext()Z
    .locals 3

    iget v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public hasPrevious()Z
    .locals 1

    iget v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/StateListIterator;->validateModification()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iput v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->lastRequested:I

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$validateRange(II)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    .line 26
    .line 27
    return-object v1
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

.method public nextIndex()I
    .locals 1

    iget v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/StateListIterator;->validateModification()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$validateRange(II)V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    .line 16
    .line 17
    iput v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->lastRequested:I

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget v1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    .line 26
    .line 27
    add-int/lit8 v1, v1, -0x1

    .line 28
    .line 29
    iput v1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    .line 30
    .line 31
    return-object v0
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

.method public previousIndex()I
    .locals 1

    iget v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    return v0
.end method

.method public remove()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/StateListIterator;->validateModification()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 5
    .line 6
    iget v1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    add-int/2addr v0, v1

    .line 15
    iput v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->index:I

    .line 16
    .line 17
    iput v1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->lastRequested:I

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getStructure$runtime_release()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->structure:I

    .line 26
    .line 27
    return-void
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

.method public set(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/StateListIterator;->validateModification()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->lastRequested:I

    .line 5
    .line 6
    if-ltz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 9
    .line 10
    invoke-virtual {v1, v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->list:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getStructure$runtime_release()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Landroidx/compose/runtime/snapshots/StateListIterator;->structure:I

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$invalidIteratorSet()Ljava/lang/Void;

    .line 23
    .line 24
    .line 25
    new-instance p1, Lkotlin/y;

    .line 26
    .line 27
    invoke-direct {p1}, Lkotlin/y;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p1
    .line 31
    .line 32
.end method
