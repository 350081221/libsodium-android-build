.class public final Lcom/bytedance/pangle/res/a/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/bytedance/pangle/res/a/g;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/bytedance/pangle/res/a/g;->b(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x4

    .line 18
    invoke-virtual {p0, v3}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {p0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    mul-int/2addr v1, v3

    .line 30
    invoke-virtual {p0, v1}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 31
    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    mul-int/2addr v2, v3

    .line 36
    invoke-virtual {p0, v2}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 37
    .line 38
    .line 39
    :cond_0
    if-nez v5, :cond_1

    .line 40
    .line 41
    move v1, v0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v1, v5

    .line 44
    :goto_0
    sub-int/2addr v1, v4

    .line 45
    invoke-virtual {p0, v1}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 46
    .line 47
    .line 48
    if-eqz v5, :cond_2

    .line 49
    .line 50
    sub-int/2addr v0, v5

    .line 51
    invoke-virtual {p0, v0}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 52
    .line 53
    .line 54
    rem-int/2addr v0, v3

    .line 55
    if-lez v0, :cond_2

    .line 56
    .line 57
    :goto_1
    add-int/lit8 v1, v0, -0x1

    .line 58
    .line 59
    if-lez v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/bytedance/pangle/res/a/f;->readByte()B

    .line 62
    .line 63
    .line 64
    move v0, v1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    return-void
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
