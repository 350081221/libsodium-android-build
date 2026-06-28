.class public Ld3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[Ljava/lang/String;

.field private static final b:[Ljava/lang/String;

.field private static final c:[Ljava/lang/String;

.field private static final d:[Ljava/lang/String;

.field private static final e:I = 0x1384


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "i"

    .line 4
    .line 5
    const-string v2, "ii"

    .line 6
    .line 7
    const-string v3, "iii"

    .line 8
    .line 9
    const-string v4, "iv"

    .line 10
    .line 11
    const-string v5, "v"

    .line 12
    .line 13
    const-string v6, "vi"

    .line 14
    .line 15
    const-string v7, "vii"

    .line 16
    .line 17
    const-string v8, "viii"

    .line 18
    .line 19
    const-string v9, "ix"

    .line 20
    .line 21
    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Ld3/b;->a:[Ljava/lang/String;

    .line 26
    .line 27
    const-string v1, ""

    .line 28
    .line 29
    const-string v2, "x"

    .line 30
    .line 31
    const-string v3, "xx"

    .line 32
    .line 33
    const-string v4, "xxx"

    .line 34
    .line 35
    const-string v5, "xl"

    .line 36
    .line 37
    const-string v6, "l"

    .line 38
    .line 39
    const-string v7, "lx"

    .line 40
    .line 41
    const-string v8, "lxx"

    .line 42
    .line 43
    const-string v9, "lxxx"

    .line 44
    .line 45
    const-string v10, "xc"

    .line 46
    .line 47
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Ld3/b;->b:[Ljava/lang/String;

    .line 52
    .line 53
    const-string v1, ""

    .line 54
    .line 55
    const-string v2, "c"

    .line 56
    .line 57
    const-string v3, "cc"

    .line 58
    .line 59
    const-string v4, "ccc"

    .line 60
    .line 61
    const-string v5, "cd"

    .line 62
    .line 63
    const-string v6, "d"

    .line 64
    .line 65
    const-string v7, "dc"

    .line 66
    .line 67
    const-string v8, "dcc"

    .line 68
    .line 69
    const-string v9, "dccc"

    .line 70
    .line 71
    const-string v10, "cm"

    .line 72
    .line 73
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sput-object v0, Ld3/b;->c:[Ljava/lang/String;

    .line 78
    .line 79
    const-string v0, "mm"

    .line 80
    .line 81
    const-string v1, "mmm"

    .line 82
    .line 83
    const-string v2, ""

    .line 84
    .line 85
    const-string v3, "m"

    .line 86
    .line 87
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sput-object v0, Ld3/b;->d:[Ljava/lang/String;

    .line 92
    .line 93
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 3

    .line 1
    div-int/lit8 v0, p0, 0x1a

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    rem-int/2addr p0, v1

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    invoke-static {v0}, Ld3/b;->a(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    add-int/lit8 p0, p0, 0x61

    .line 23
    .line 24
    int-to-char p0, p0

    .line 25
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-nez v0, :cond_1

    .line 30
    .line 31
    add-int/lit8 p0, p0, 0x61

    .line 32
    .line 33
    int-to-char p0, p0

    .line 34
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    add-int/lit8 v0, v0, 0x61

    .line 39
    .line 40
    int-to-char v0, v0

    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    add-int/lit8 p0, p0, 0x61

    .line 45
    .line 46
    int-to-char p0, p0

    .line 47
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
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
.end method

.method public static b(I)Ljava/lang/String;
    .locals 5

    .line 1
    :goto_0
    const/16 v0, 0x1384    # 7.001E-42f

    .line 2
    .line 3
    if-le p0, v0, :cond_0

    .line 4
    .line 5
    add-int/lit16 p0, p0, -0x1384

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Ld3/b;->d:[Ljava/lang/String;

    .line 9
    .line 10
    div-int/lit16 v1, p0, 0x3e8

    .line 11
    .line 12
    aget-object v0, v0, v1

    .line 13
    .line 14
    rem-int/lit16 p0, p0, 0x3e8

    .line 15
    .line 16
    sget-object v1, Ld3/b;->c:[Ljava/lang/String;

    .line 17
    .line 18
    div-int/lit8 v2, p0, 0x64

    .line 19
    .line 20
    aget-object v1, v1, v2

    .line 21
    .line 22
    rem-int/lit8 p0, p0, 0x64

    .line 23
    .line 24
    sget-object v2, Ld3/b;->b:[Ljava/lang/String;

    .line 25
    .line 26
    div-int/lit8 v3, p0, 0xa

    .line 27
    .line 28
    aget-object v2, v2, v3

    .line 29
    .line 30
    rem-int/lit8 p0, p0, 0xa

    .line 31
    .line 32
    sget-object v3, Ld3/b;->a:[Ljava/lang/String;

    .line 33
    .line 34
    aget-object p0, v3, p0

    .line 35
    .line 36
    const/4 v3, 0x4

    .line 37
    new-array v3, v3, [Ljava/lang/Object;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    aput-object v0, v3, v4

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    aput-object v1, v3, v0

    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    aput-object v2, v3, v0

    .line 47
    .line 48
    const/4 v0, 0x3

    .line 49
    aput-object p0, v3, v0

    .line 50
    .line 51
    const-string p0, "%s%s%s%s"

    .line 52
    .line 53
    invoke-static {p0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
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
.end method
