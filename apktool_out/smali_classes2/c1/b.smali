.class public Lc1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ly0/a;Landroid/content/Context;)Landroid/net/NetworkInfo;
    .locals 12

    .line 1
    invoke-static {p1}, Lc1/a;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 6
    .line 7
    new-instance v4, Lc1/b$c;

    .line 8
    .line 9
    invoke-direct {v4}, Lc1/b$c;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v5, Lc1/b$d;

    .line 13
    .line 14
    invoke-direct {v5, p1}, Lc1/b$d;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const-wide/16 v1, 0xa

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const-wide/16 v7, 0xa

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    move-object v3, v9

    .line 25
    move-object v10, p0

    .line 26
    invoke-static/range {v0 .. v11}, Lc1/a;->c(IJLjava/util/concurrent/TimeUnit;Lc1/a$a;Ljava/util/concurrent/Callable;ZJLjava/util/concurrent/TimeUnit;Ly0/a;Z)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Landroid/net/NetworkInfo;

    .line 31
    .line 32
    return-object p0
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

.method public static b(Ly0/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-static {p1}, Lc1/a;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 6
    .line 7
    new-instance v4, Lc1/b$g;

    .line 8
    .line 9
    invoke-direct {v4}, Lc1/b$g;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v5, Lc1/b$h;

    .line 13
    .line 14
    invoke-direct {v5, p2, p3, p1, p0}, Lc1/b$h;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ly0/a;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    const-wide/16 v1, 0xa

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    const-wide/16 v7, 0x3

    .line 22
    .line 23
    const/4 v11, 0x1

    .line 24
    move-object v3, v9

    .line 25
    move-object v10, p0

    .line 26
    invoke-static/range {v0 .. v11}, Lc1/a;->c(IJLjava/util/concurrent/TimeUnit;Lc1/a$a;Ljava/util/concurrent/Callable;ZJLjava/util/concurrent/TimeUnit;Ly0/a;Z)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/lang/String;

    .line 31
    .line 32
    return-object p0
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

.method public static c(Ly0/a;Landroid/content/Context;)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-static {}, Lm0/a;->J()Lm0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lm0/a;->E()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string p0, ""

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {p1}, Lc1/a;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v3, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    new-instance v4, Lc1/b$a;

    .line 21
    .line 22
    invoke-direct {v4}, Lc1/b$a;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v5, Lc1/b$b;

    .line 26
    .line 27
    invoke-direct {v5, p1}, Lc1/b$b;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    const-wide/16 v1, 0x1

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    const-wide/16 v7, 0xc8

    .line 37
    .line 38
    const/4 v11, 0x1

    .line 39
    move-object v10, p0

    .line 40
    invoke-static/range {v0 .. v11}, Lc1/a;->c(IJLjava/util/concurrent/TimeUnit;Lc1/a$a;Ljava/util/concurrent/Callable;ZJLjava/util/concurrent/TimeUnit;Ly0/a;Z)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ljava/lang/String;

    .line 45
    .line 46
    return-object p0
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static d(Ly0/a;Landroid/content/Context;)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-static {p1}, Lc1/a;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v3, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 6
    .line 7
    new-instance v4, Lc1/b$e;

    .line 8
    .line 9
    invoke-direct {v4}, Lc1/b$e;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v5, Lc1/b$f;

    .line 13
    .line 14
    invoke-direct {v5, p1, p0}, Lc1/b$f;-><init>(Landroid/content/Context;Ly0/a;)V

    .line 15
    .line 16
    .line 17
    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    const-wide/16 v1, 0x1

    .line 21
    .line 22
    const/4 v6, 0x1

    .line 23
    const-wide/16 v7, 0x3

    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    move-object v10, p0

    .line 27
    invoke-static/range {v0 .. v11}, Lc1/a;->c(IJLjava/util/concurrent/TimeUnit;Lc1/a$a;Ljava/util/concurrent/Callable;ZJLjava/util/concurrent/TimeUnit;Ly0/a;Z)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ljava/lang/String;

    .line 32
    .line 33
    return-object p0
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
