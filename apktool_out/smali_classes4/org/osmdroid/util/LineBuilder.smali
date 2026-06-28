.class public abstract Lorg/osmdroid/util/LineBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/util/PointAccepter;


# instance fields
.field private mIndex:I

.field private final mLines:[F


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-array p1, p1, [F

    .line 5
    .line 6
    iput-object p1, p0, Lorg/osmdroid/util/LineBuilder;->mLines:[F

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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method private innerFlush()V
    .locals 1

    .line 1
    iget v0, p0, Lorg/osmdroid/util/LineBuilder;->mIndex:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/osmdroid/util/LineBuilder;->flush()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lorg/osmdroid/util/LineBuilder;->mIndex:I

    .line 10
    .line 11
    return-void
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
.end method


# virtual methods
.method public add(JJ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/util/LineBuilder;->mLines:[F

    .line 2
    .line 3
    iget v1, p0, Lorg/osmdroid/util/LineBuilder;->mIndex:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    long-to-float p1, p1

    .line 8
    aput p1, v0, v1

    .line 9
    .line 10
    add-int/lit8 p1, v2, 0x1

    .line 11
    .line 12
    iput p1, p0, Lorg/osmdroid/util/LineBuilder;->mIndex:I

    .line 13
    .line 14
    long-to-float p2, p3

    .line 15
    aput p2, v0, v2

    .line 16
    .line 17
    array-length p2, v0

    .line 18
    if-lt p1, p2, :cond_0

    .line 19
    .line 20
    invoke-direct {p0}, Lorg/osmdroid/util/LineBuilder;->innerFlush()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
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
.end method

.method public end()V
    .locals 0

    invoke-direct {p0}, Lorg/osmdroid/util/LineBuilder;->innerFlush()V

    return-void
.end method

.method public abstract flush()V
.end method

.method public getLines()[F
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/util/LineBuilder;->mLines:[F

    return-object v0
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/util/LineBuilder;->mIndex:I

    return v0
.end method

.method public init()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lorg/osmdroid/util/LineBuilder;->mIndex:I

    return-void
.end method
