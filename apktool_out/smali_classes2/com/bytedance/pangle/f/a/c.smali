.class final Lcom/bytedance/pangle/f/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:[I

.field b:I

.field c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x20

    .line 5
    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    iput-object v0, p0, Lcom/bytedance/pangle/f/a/c;->a:[I

    .line 9
    .line 10
    return-void
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
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/pangle/f/a/c;->b()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/bytedance/pangle/f/a/c;->b:I

    .line 5
    .line 6
    iget-object v1, p0, Lcom/bytedance/pangle/f/a/c;->a:[I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aput v2, v1, v0

    .line 10
    .line 11
    add-int/lit8 v3, v0, 0x1

    .line 12
    .line 13
    aput v2, v1, v3

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    iput v0, p0, Lcom/bytedance/pangle/f/a/c;->b:I

    .line 18
    .line 19
    iget v0, p0, Lcom/bytedance/pangle/f/a/c;->c:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    iput v0, p0, Lcom/bytedance/pangle/f/a/c;->c:I

    .line 24
    .line 25
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
.end method

.method final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/f/a/c;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    iget v2, p0, Lcom/bytedance/pangle/f/a/c;->b:I

    .line 5
    .line 6
    sub-int/2addr v1, v2

    .line 7
    const/4 v3, 0x2

    .line 8
    if-gt v1, v3, :cond_0

    .line 9
    .line 10
    array-length v4, v0

    .line 11
    add-int/2addr v4, v1

    .line 12
    mul-int/2addr v4, v3

    .line 13
    new-array v1, v4, [I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/bytedance/pangle/f/a/c;->a:[I

    .line 20
    .line 21
    :cond_0
    return-void
.end method
