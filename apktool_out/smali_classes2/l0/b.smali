.class public Ll0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll0/b$c;,
        Ll0/b$b;,
        Ll0/b$a;
    }
.end annotation


# static fields
.field public static final synthetic a:Z = true


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([BI)[B
    .locals 2

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, p1}, Ll0/b;->b([BIII)[B

    move-result-object p0

    return-object p0
.end method

.method public static b([BIII)[B
    .locals 2

    .line 1
    new-instance v0, Ll0/b$b;

    .line 2
    .line 3
    mul-int/lit8 v1, p2, 0x3

    .line 4
    .line 5
    div-int/lit8 v1, v1, 0x4

    .line 6
    .line 7
    new-array v1, v1, [B

    .line 8
    .line 9
    invoke-direct {v0, p3, v1}, Ll0/b$b;-><init>(I[B)V

    .line 10
    .line 11
    .line 12
    const/4 p3, 0x1

    .line 13
    invoke-virtual {v0, p0, p1, p2, p3}, Ll0/b$b;->a([BIIZ)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    iget p0, v0, Ll0/b$a;->b:I

    .line 20
    .line 21
    iget-object p1, v0, Ll0/b$a;->a:[B

    .line 22
    .line 23
    array-length p2, p1

    .line 24
    if-ne p0, p2, :cond_0

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    new-array p2, p0, [B

    .line 28
    .line 29
    const/4 p3, 0x0

    .line 30
    invoke-static {p1, p3, p2, p3, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    const-string p1, "bad base-64"

    .line 37
    .line 38
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p0
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public static c([BI)[B
    .locals 2

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, p1}, Ll0/b;->d([BIII)[B

    move-result-object p0

    return-object p0
.end method

.method public static d([BIII)[B
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Assert"
        }
    .end annotation

    .line 1
    new-instance v0, Ll0/b$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p3, v1}, Ll0/b$c;-><init>(I[B)V

    .line 5
    .line 6
    .line 7
    div-int/lit8 p3, p2, 0x3

    .line 8
    .line 9
    mul-int/lit8 p3, p3, 0x4

    .line 10
    .line 11
    iget-boolean v1, v0, Ll0/b$c;->f:Z

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    rem-int/lit8 v1, p2, 0x3

    .line 18
    .line 19
    if-lez v1, :cond_3

    .line 20
    .line 21
    add-int/lit8 p3, p3, 0x4

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    rem-int/lit8 v1, p2, 0x3

    .line 25
    .line 26
    if-eq v1, v3, :cond_2

    .line 27
    .line 28
    if-eq v1, v2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    add-int/lit8 p3, p3, 0x3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    add-int/lit8 p3, p3, 0x2

    .line 35
    .line 36
    :cond_3
    :goto_0
    iget-boolean v1, v0, Ll0/b$c;->g:Z

    .line 37
    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    if-lez p2, :cond_5

    .line 41
    .line 42
    add-int/lit8 v1, p2, -0x1

    .line 43
    .line 44
    div-int/lit8 v1, v1, 0x39

    .line 45
    .line 46
    add-int/2addr v1, v3

    .line 47
    iget-boolean v4, v0, Ll0/b$c;->h:Z

    .line 48
    .line 49
    if-eqz v4, :cond_4

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    move v2, v3

    .line 53
    :goto_1
    mul-int/2addr v1, v2

    .line 54
    add-int/2addr p3, v1

    .line 55
    :cond_5
    new-array v1, p3, [B

    .line 56
    .line 57
    iput-object v1, v0, Ll0/b$a;->a:[B

    .line 58
    .line 59
    invoke-virtual {v0, p0, p1, p2, v3}, Ll0/b$c;->a([BIIZ)Z

    .line 60
    .line 61
    .line 62
    sget-boolean p0, Ll0/b;->a:Z

    .line 63
    .line 64
    if-nez p0, :cond_7

    .line 65
    .line 66
    iget p0, v0, Ll0/b$a;->b:I

    .line 67
    .line 68
    if-ne p0, p3, :cond_6

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_6
    new-instance p0, Ljava/lang/AssertionError;

    .line 72
    .line 73
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 74
    .line 75
    .line 76
    throw p0

    .line 77
    :cond_7
    :goto_2
    iget-object p0, v0, Ll0/b$a;->a:[B

    .line 78
    .line 79
    return-object p0
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method public static e([BI)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0, p1}, Ll0/b;->c([BI)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string p1, "US-ASCII"

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    new-instance p1, Ljava/lang/AssertionError;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    throw p1
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
.end method
