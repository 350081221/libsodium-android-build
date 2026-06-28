.class public Lcom/umeng/analytics/pro/bp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[S

.field private b:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/umeng/analytics/pro/bp;->b:I

    .line 6
    .line 7
    new-array p1, p1, [S

    .line 8
    .line 9
    iput-object p1, p0, Lcom/umeng/analytics/pro/bp;->a:[S

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
.end method

.method private d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bp;->a:[S

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    mul-int/lit8 v1, v1, 0x2

    .line 5
    .line 6
    new-array v1, v1, [S

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    array-length v3, v0

    .line 10
    invoke-static {v0, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lcom/umeng/analytics/pro/bp;->a:[S

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
.end method


# virtual methods
.method public a()S
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bp;->a:[S

    iget v1, p0, Lcom/umeng/analytics/pro/bp;->b:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Lcom/umeng/analytics/pro/bp;->b:I

    aget-short v0, v0, v1

    return v0
.end method

.method public a(S)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/umeng/analytics/pro/bp;->a:[S

    array-length v0, v0

    iget v1, p0, Lcom/umeng/analytics/pro/bp;->b:I

    add-int/lit8 v1, v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/umeng/analytics/pro/bp;->d()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/bp;->a:[S

    iget v1, p0, Lcom/umeng/analytics/pro/bp;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/umeng/analytics/pro/bp;->b:I

    aput-short p1, v0, v1

    return-void
.end method

.method public b()S
    .locals 2

    iget-object v0, p0, Lcom/umeng/analytics/pro/bp;->a:[S

    iget v1, p0, Lcom/umeng/analytics/pro/bp;->b:I

    aget-short v0, v0, v1

    return v0
.end method

.method public c()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/umeng/analytics/pro/bp;->b:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "<ShortStack vector:["

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    iget-object v2, p0, Lcom/umeng/analytics/pro/bp;->a:[S

    .line 13
    .line 14
    array-length v2, v2

    .line 15
    if-ge v1, v2, :cond_3

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const-string v2, " "

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    :cond_0
    iget v2, p0, Lcom/umeng/analytics/pro/bp;->b:I

    .line 25
    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    const-string v2, ">>"

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v2, p0, Lcom/umeng/analytics/pro/bp;->a:[S

    .line 34
    .line 35
    aget-short v2, v2, v1

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget v2, p0, Lcom/umeng/analytics/pro/bp;->b:I

    .line 41
    .line 42
    if-ne v1, v2, :cond_2

    .line 43
    .line 44
    const-string v2, "<<"

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const-string v1, "]>"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
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
