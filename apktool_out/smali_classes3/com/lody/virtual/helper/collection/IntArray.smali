.class public Lcom/lody/virtual/helper/collection/IntArray;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final EMPTY_ARRAY:[I


# instance fields
.field private mData:[I

.field private mSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lcom/lody/virtual/helper/collection/IntArray;->EMPTY_ARRAY:[I

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    return-void
.end method

.method private ensureCapacity()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-gt v0, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    array-length v0, v1

    .line 10
    :goto_0
    iget v1, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    .line 11
    .line 12
    if-le v1, v0, :cond_1

    .line 13
    .line 14
    mul-int/lit8 v0, v0, 0x3

    .line 15
    .line 16
    div-int/lit8 v0, v0, 0x2

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v1, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    .line 22
    .line 23
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    .line 28
    .line 29
    return-void
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
.end method

.method public static varargs of([I)Lcom/lody/virtual/helper/collection/IntArray;
    .locals 2

    .line 1
    new-instance v0, Lcom/lody/virtual/helper/collection/IntArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/lody/virtual/helper/collection/IntArray;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, v0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    .line 12
    .line 13
    array-length p0, p0

    .line 14
    iput p0, v0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    .line 15
    .line 16
    return-object v0
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
.end method


# virtual methods
.method public add(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/lody/virtual/helper/collection/IntArray;->ensureCapacity()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    .line 11
    .line 12
    iget v1, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    aput p1, v0, v1

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public addAll([I)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    add-int/2addr v1, v0

    .line 5
    iput v1, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/lody/virtual/helper/collection/IntArray;->ensureCapacity()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    .line 11
    .line 12
    array-length v2, p1

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {p1, v3, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 15
    .line 16
    .line 17
    return-void
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
.end method

.method public clear()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    return-void
.end method

.method public contains(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    .line 4
    .line 5
    if-ge v1, v2, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    .line 8
    .line 9
    aget v2, v2, v1

    .line 10
    .line 11
    if-ne v2, p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public get(I)I
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    aget p1, v0, p1

    return p1
.end method

.method public getAll()[I
    .locals 2

    iget v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/lody/virtual/helper/collection/IntArray;->EMPTY_ARRAY:[I

    :goto_0
    return-object v0
.end method

.method public getRange(II)[I
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    invoke-static {v0, p1, p2}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object p1

    return-object p1
.end method

.method public optimize()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-le v0, v2, :cond_0

    .line 7
    .line 8
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    .line 13
    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public remove(I)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/lody/virtual/helper/collection/IntArray;->remove(II)V

    return-void
.end method

.method public remove(II)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    add-int v1, p1, p2

    iget v2, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v0, v1, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3
    iget p1, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    sub-int/2addr p1, p2

    iput p1, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    return-void
.end method

.method public set(II)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mData:[I

    .line 6
    .line 7
    aput p2, v0, p1

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v1, "Index "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, " is greater than the list size "

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget p1, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p2
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/lody/virtual/helper/collection/IntArray;->mSize:I

    return v0
.end method
