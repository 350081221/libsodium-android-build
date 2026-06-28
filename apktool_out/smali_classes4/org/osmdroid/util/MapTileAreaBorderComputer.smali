.class public Lorg/osmdroid/util/MapTileAreaBorderComputer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/util/MapTileAreaComputer;


# instance fields
.field private final mBorder:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/osmdroid/util/MapTileAreaBorderComputer;->mBorder:I

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


# virtual methods
.method public computeFromSource(Lorg/osmdroid/util/MapTileArea;Lorg/osmdroid/util/MapTileArea;)Lorg/osmdroid/util/MapTileArea;
    .locals 6

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p2, Lorg/osmdroid/util/MapTileArea;

    .line 5
    .line 6
    invoke-direct {p2}, Lorg/osmdroid/util/MapTileArea;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p1}, Lorg/osmdroid/util/MapTileArea;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p2}, Lorg/osmdroid/util/MapTileArea;->reset()Lorg/osmdroid/util/MapTileArea;

    .line 16
    .line 17
    .line 18
    return-object p2

    .line 19
    :cond_1
    invoke-virtual {p1}, Lorg/osmdroid/util/MapTileArea;->getLeft()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v1, p0, Lorg/osmdroid/util/MapTileAreaBorderComputer;->mBorder:I

    .line 24
    .line 25
    sub-int v2, v0, v1

    .line 26
    .line 27
    invoke-virtual {p1}, Lorg/osmdroid/util/MapTileArea;->getTop()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget v1, p0, Lorg/osmdroid/util/MapTileAreaBorderComputer;->mBorder:I

    .line 32
    .line 33
    sub-int v3, v0, v1

    .line 34
    .line 35
    mul-int/lit8 v1, v1, 0x2

    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    invoke-virtual {p1}, Lorg/osmdroid/util/MapTileArea;->getZoom()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {p1}, Lorg/osmdroid/util/MapTileArea;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    add-int/2addr v0, v2

    .line 48
    add-int v5, v0, v1

    .line 49
    .line 50
    invoke-virtual {p1}, Lorg/osmdroid/util/MapTileArea;->getHeight()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    add-int/2addr p1, v3

    .line 55
    add-int/2addr p1, v1

    .line 56
    move-object v0, p2

    .line 57
    move v1, v4

    .line 58
    move v4, v5

    .line 59
    move v5, p1

    .line 60
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/MapTileArea;->set(IIIII)Lorg/osmdroid/util/MapTileArea;

    .line 61
    .line 62
    .line 63
    return-object p2
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

.method public getBorder()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/util/MapTileAreaBorderComputer;->mBorder:I

    return v0
.end method
