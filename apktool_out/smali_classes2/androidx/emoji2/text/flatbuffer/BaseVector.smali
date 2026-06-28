.class public Landroidx/emoji2/text/flatbuffer/BaseVector;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected bb:Ljava/nio/ByteBuffer;

.field private element_size:I

.field private length:I

.field private vector:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected __element(I)I
    .locals 2

    iget v0, p0, Landroidx/emoji2/text/flatbuffer/BaseVector;->vector:I

    iget v1, p0, Landroidx/emoji2/text/flatbuffer/BaseVector;->element_size:I

    mul-int/2addr p1, v1

    add-int/2addr v0, p1

    return v0
.end method

.method protected __reset(IILjava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    iput-object p3, p0, Landroidx/emoji2/text/flatbuffer/BaseVector;->bb:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iput p1, p0, Landroidx/emoji2/text/flatbuffer/BaseVector;->vector:I

    .line 6
    .line 7
    add-int/lit8 p1, p1, -0x4

    .line 8
    .line 9
    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iput p1, p0, Landroidx/emoji2/text/flatbuffer/BaseVector;->length:I

    .line 14
    .line 15
    iput p2, p0, Landroidx/emoji2/text/flatbuffer/BaseVector;->element_size:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    iput p1, p0, Landroidx/emoji2/text/flatbuffer/BaseVector;->vector:I

    .line 20
    .line 21
    iput p1, p0, Landroidx/emoji2/text/flatbuffer/BaseVector;->length:I

    .line 22
    .line 23
    iput p1, p0, Landroidx/emoji2/text/flatbuffer/BaseVector;->element_size:I

    .line 24
    .line 25
    :goto_0
    return-void
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
    .line 112
    .line 113
    .line 114
.end method

.method protected __vector()I
    .locals 1

    iget v0, p0, Landroidx/emoji2/text/flatbuffer/BaseVector;->vector:I

    return v0
.end method

.method public length()I
    .locals 1

    iget v0, p0, Landroidx/emoji2/text/flatbuffer/BaseVector;->length:I

    return v0
.end method

.method public reset()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v0, v1}, Landroidx/emoji2/text/flatbuffer/BaseVector;->__reset(IILjava/nio/ByteBuffer;)V

    return-void
.end method
