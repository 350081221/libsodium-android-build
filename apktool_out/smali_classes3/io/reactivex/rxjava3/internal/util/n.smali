.class public Lio/reactivex/rxjava3/internal/util/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:I

.field b:[Ljava/lang/Object;

.field c:[Ljava/lang/Object;

.field volatile d:I

.field e:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/reactivex/rxjava3/internal/util/n;->a:I

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
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lio/reactivex/rxjava3/internal/util/n;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lio/reactivex/rxjava3/internal/util/n;->a:I

    .line 8
    .line 9
    add-int/2addr v0, v2

    .line 10
    new-array v0, v0, [Ljava/lang/Object;

    .line 11
    .line 12
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/util/n;->b:[Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/util/n;->c:[Ljava/lang/Object;

    .line 15
    .line 16
    aput-object p1, v0, v1

    .line 17
    .line 18
    iput v2, p0, Lio/reactivex/rxjava3/internal/util/n;->e:I

    .line 19
    .line 20
    iput v2, p0, Lio/reactivex/rxjava3/internal/util/n;->d:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget v0, p0, Lio/reactivex/rxjava3/internal/util/n;->e:I

    .line 24
    .line 25
    iget v3, p0, Lio/reactivex/rxjava3/internal/util/n;->a:I

    .line 26
    .line 27
    if-ne v0, v3, :cond_1

    .line 28
    .line 29
    add-int/lit8 v0, v3, 0x1

    .line 30
    .line 31
    new-array v0, v0, [Ljava/lang/Object;

    .line 32
    .line 33
    aput-object p1, v0, v1

    .line 34
    .line 35
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/util/n;->c:[Ljava/lang/Object;

    .line 36
    .line 37
    aput-object v0, p1, v3

    .line 38
    .line 39
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/util/n;->c:[Ljava/lang/Object;

    .line 40
    .line 41
    iput v2, p0, Lio/reactivex/rxjava3/internal/util/n;->e:I

    .line 42
    .line 43
    iget p1, p0, Lio/reactivex/rxjava3/internal/util/n;->d:I

    .line 44
    .line 45
    add-int/2addr p1, v2

    .line 46
    iput p1, p0, Lio/reactivex/rxjava3/internal/util/n;->d:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/util/n;->c:[Ljava/lang/Object;

    .line 50
    .line 51
    aput-object p1, v1, v0

    .line 52
    .line 53
    add-int/2addr v0, v2

    .line 54
    iput v0, p0, Lio/reactivex/rxjava3/internal/util/n;->e:I

    .line 55
    .line 56
    iget p1, p0, Lio/reactivex/rxjava3/internal/util/n;->d:I

    .line 57
    .line 58
    add-int/2addr p1, v2

    .line 59
    iput p1, p0, Lio/reactivex/rxjava3/internal/util/n;->d:I

    .line 60
    .line 61
    :goto_0
    return-void
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
.end method

.method public b()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/util/n;->b:[Ljava/lang/Object;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lio/reactivex/rxjava3/internal/util/n;->d:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget v0, p0, Lio/reactivex/rxjava3/internal/util/n;->a:I

    .line 2
    .line 3
    iget v1, p0, Lio/reactivex/rxjava3/internal/util/n;->d:I

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    add-int/lit8 v3, v1, 0x1

    .line 8
    .line 9
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/util/n;->b()[Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const/4 v4, 0x0

    .line 17
    move v5, v4

    .line 18
    move v6, v5

    .line 19
    :cond_0
    :goto_0
    if-ge v5, v1, :cond_1

    .line 20
    .line 21
    aget-object v7, v3, v6

    .line 22
    .line 23
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    add-int/lit8 v5, v5, 0x1

    .line 27
    .line 28
    add-int/lit8 v6, v6, 0x1

    .line 29
    .line 30
    if-ne v6, v0, :cond_0

    .line 31
    .line 32
    aget-object v3, v3, v0

    .line 33
    .line 34
    check-cast v3, [Ljava/lang/Object;

    .line 35
    .line 36
    move v6, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
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
