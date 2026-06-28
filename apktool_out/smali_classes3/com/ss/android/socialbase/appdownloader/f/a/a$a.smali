.class final Lcom/ss/android/socialbase/appdownloader/f/a/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/socialbase/appdownloader/f/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private a:[I

.field private b:I

.field private c:I


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
    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->a:[I

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
    .line 22
    .line 23
.end method

.method private a(I)V
    .locals 3

    .line 13
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->a:[I

    array-length v1, v0

    iget v2, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->b:I

    sub-int/2addr v1, v2

    if-gt v1, p1, :cond_0

    .line 14
    array-length p1, v0

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x2

    .line 15
    new-array p1, p1, [I

    const/4 v1, 0x0

    .line 16
    invoke-static {v0, v1, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->a:[I

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->b:I

    .line 2
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->c:I

    return-void
.end method

.method public final a(II)V
    .locals 7

    .line 3
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->c:I

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->e()V

    :cond_0
    const/4 v0, 0x2

    .line 5
    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->a(I)V

    .line 6
    iget v1, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->b:I

    add-int/lit8 v2, v1, -0x1

    .line 7
    iget-object v3, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->a:[I

    aget v4, v3, v2

    add-int/lit8 v5, v2, -0x1

    mul-int/lit8 v6, v4, 0x2

    sub-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    .line 8
    aput v4, v3, v5

    .line 9
    aput p1, v3, v2

    add-int/lit8 p1, v2, 0x1

    .line 10
    aput p2, v3, p1

    add-int/2addr v2, v0

    .line 11
    aput v4, v3, v2

    add-int/2addr v1, v0

    .line 12
    iput v1, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->b:I

    return-void
.end method

.method public final b()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->a:[I

    .line 10
    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    return v0
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

.method public final c()Z
    .locals 6

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->b:I

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
    add-int/lit8 v2, v0, -0x1

    .line 8
    .line 9
    iget-object v3, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->a:[I

    .line 10
    .line 11
    aget v4, v3, v2

    .line 12
    .line 13
    if-nez v4, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    add-int/lit8 v4, v4, -0x1

    .line 17
    .line 18
    add-int/lit8 v2, v2, -0x2

    .line 19
    .line 20
    aput v4, v3, v2

    .line 21
    .line 22
    mul-int/lit8 v1, v4, 0x2

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    add-int/2addr v1, v5

    .line 26
    sub-int/2addr v2, v1

    .line 27
    aput v4, v3, v2

    .line 28
    .line 29
    add-int/lit8 v0, v0, -0x2

    .line 30
    .line 31
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->b:I

    .line 32
    .line 33
    return v5
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

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->c:I

    return v0
.end method

.method public final e()V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->a(I)V

    .line 3
    .line 4
    .line 5
    iget v1, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->b:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->a:[I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    aput v3, v2, v1

    .line 11
    .line 12
    add-int/lit8 v4, v1, 0x1

    .line 13
    .line 14
    aput v3, v2, v4

    .line 15
    .line 16
    add-int/2addr v1, v0

    .line 17
    iput v1, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->b:I

    .line 18
    .line 19
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->c:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->c:I

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

.method public final f()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->b:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    add-int/lit8 v1, v0, -0x1

    .line 6
    .line 7
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->a:[I

    .line 8
    .line 9
    aget v2, v2, v1

    .line 10
    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    mul-int/lit8 v2, v2, 0x2

    .line 14
    .line 15
    sub-int/2addr v1, v2

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x2

    .line 19
    .line 20
    sub-int/2addr v0, v2

    .line 21
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->b:I

    .line 22
    .line 23
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->c:I

    .line 24
    .line 25
    add-int/lit8 v0, v0, -0x1

    .line 26
    .line 27
    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/f/a/a$a;->c:I

    .line 28
    .line 29
    :cond_0
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
