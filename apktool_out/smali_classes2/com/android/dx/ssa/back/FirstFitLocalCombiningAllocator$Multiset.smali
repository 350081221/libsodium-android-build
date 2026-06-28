.class Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Multiset"
.end annotation


# instance fields
.field private final count:[I

.field private final reg:[I

.field private size:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-array v0, p1, [I

    .line 5
    .line 6
    iput-object v0, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->reg:[I

    .line 7
    .line 8
    new-array p1, p1, [I

    .line 9
    .line 10
    iput-object p1, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    .line 14
    .line 15
    return-void
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


# virtual methods
.method public add(I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->reg:[I

    .line 8
    .line 9
    aget v1, v1, v0

    .line 10
    .line 11
    if-ne v1, p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    .line 14
    .line 15
    aget v1, p1, v0

    .line 16
    .line 17
    add-int/2addr v1, v2

    .line 18
    aput v1, p1, v0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->reg:[I

    .line 25
    .line 26
    aput p1, v0, v1

    .line 27
    .line 28
    iget-object p1, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    .line 29
    .line 30
    aput v2, p1, v1

    .line 31
    .line 32
    add-int/2addr v1, v2

    .line 33
    iput v1, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    .line 34
    .line 35
    return-void
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

.method public getAndRemoveHighestCount()I
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v0

    .line 4
    move v3, v1

    .line 5
    move v4, v3

    .line 6
    :goto_0
    iget v5, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    .line 7
    .line 8
    if-ge v3, v5, :cond_1

    .line 9
    .line 10
    iget-object v5, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    .line 11
    .line 12
    aget v5, v5, v3

    .line 13
    .line 14
    if-ge v4, v5, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->reg:[I

    .line 17
    .line 18
    aget v0, v0, v3

    .line 19
    .line 20
    move v2, v0

    .line 21
    move v0, v3

    .line 22
    move v4, v5

    .line 23
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object v3, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    .line 27
    .line 28
    aput v1, v3, v0

    .line 29
    .line 30
    return v2
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
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lcom/android/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    return v0
.end method
