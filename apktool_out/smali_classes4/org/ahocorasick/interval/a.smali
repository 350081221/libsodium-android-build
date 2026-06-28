.class public Lorg/ahocorasick/interval/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/ahocorasick/interval/d;


# instance fields
.field private a:I

.field private b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/ahocorasick/interval/a;->a:I

    .line 5
    .line 6
    iput p2, p0, Lorg/ahocorasick/interval/a;->b:I

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


# virtual methods
.method public c(I)Z
    .locals 1

    iget v0, p0, Lorg/ahocorasick/interval/a;->a:I

    if-gt v0, p1, :cond_0

    iget v0, p0, Lorg/ahocorasick/interval/a;->b:I

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    instance-of v0, p1, Lorg/ahocorasick/interval/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lorg/ahocorasick/interval/d;

    .line 8
    .line 9
    iget v0, p0, Lorg/ahocorasick/interval/a;->a:I

    .line 10
    .line 11
    invoke-interface {p1}, Lorg/ahocorasick/interval/d;->getStart()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sub-int/2addr v0, v1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget v0, p0, Lorg/ahocorasick/interval/a;->b:I

    .line 20
    .line 21
    invoke-interface {p1}, Lorg/ahocorasick/interval/d;->getEnd()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    sub-int/2addr v0, p1

    .line 26
    :goto_0
    return v0
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

.method public e(Lorg/ahocorasick/interval/a;)Z
    .locals 2

    .line 1
    iget v0, p0, Lorg/ahocorasick/interval/a;->a:I

    .line 2
    .line 3
    invoke-virtual {p1}, Lorg/ahocorasick/interval/a;->getEnd()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-gt v0, v1, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lorg/ahocorasick/interval/a;->b:I

    .line 10
    .line 11
    invoke-virtual {p1}, Lorg/ahocorasick/interval/a;->getStart()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-lt v0, p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    return p1
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

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lorg/ahocorasick/interval/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lorg/ahocorasick/interval/d;

    .line 8
    .line 9
    iget v0, p0, Lorg/ahocorasick/interval/a;->a:I

    .line 10
    .line 11
    invoke-interface {p1}, Lorg/ahocorasick/interval/d;->getStart()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    iget v0, p0, Lorg/ahocorasick/interval/a;->b:I

    .line 18
    .line 19
    invoke-interface {p1}, Lorg/ahocorasick/interval/d;->getEnd()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-ne v0, p1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    :cond_1
    return v1
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

.method public getEnd()I
    .locals 1

    iget v0, p0, Lorg/ahocorasick/interval/a;->b:I

    return v0
.end method

.method public getStart()I
    .locals 1

    iget v0, p0, Lorg/ahocorasick/interval/a;->a:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lorg/ahocorasick/interval/a;->a:I

    rem-int/lit8 v0, v0, 0x64

    iget v1, p0, Lorg/ahocorasick/interval/a;->b:I

    rem-int/lit8 v1, v1, 0x64

    add-int/2addr v0, v1

    return v0
.end method

.method public size()I
    .locals 2

    iget v0, p0, Lorg/ahocorasick/interval/a;->b:I

    iget v1, p0, Lorg/ahocorasick/interval/a;->a:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lorg/ahocorasick/interval/a;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/ahocorasick/interval/a;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
