.class public final Li0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/a$a$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "RecordPref"

.field public static final b:Ljava/lang/String; = "alipay_cashier_statistic_record"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;)I
    .locals 6

    .line 1
    const-class v0, Li0/a$a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v2, "stat remove "

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "RecordPref"

    .line 22
    .line 23
    invoke-static {v2, v1}, La1/e;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz p0, :cond_5

    .line 28
    .line 29
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    invoke-static {p0}, Li0/a$a;->b(Landroid/content/Context;)Li0/a$a$a;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v3, v2, Li0/a$a$a;->a:Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    monitor-exit v0

    .line 49
    return v1

    .line 50
    :cond_1
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v3, v2, Li0/a$a$a;->a:Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Ljava/util/Map$Entry;

    .line 76
    .line 77
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Ljava/lang/String;

    .line 110
    .line 111
    iget-object v4, v2, Li0/a$a$a;->a:Ljava/util/LinkedHashMap;

    .line 112
    .line 113
    invoke-virtual {v4, v3}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    invoke-static {p0, v2}, Li0/a$a;->d(Landroid/content/Context;Li0/a$a$a;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 121
    .line 122
    .line 123
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    monitor-exit v0

    .line 125
    return p0

    .line 126
    :catchall_0
    move-exception p1

    .line 127
    :try_start_2
    invoke-static {p1}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    iget-object p1, v2, Li0/a$a$a;->a:Ljava/util/LinkedHashMap;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/util/AbstractMap;->size()I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    new-instance v1, Li0/a$a$a;

    .line 137
    .line 138
    invoke-direct {v1}, Li0/a$a$a;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-static {p0, v1}, Li0/a$a;->d(Landroid/content/Context;Li0/a$a$a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 142
    .line 143
    .line 144
    monitor-exit v0

    .line 145
    return p1

    .line 146
    :cond_5
    :goto_2
    monitor-exit v0

    .line 147
    return v1

    .line 148
    :catchall_1
    move-exception p0

    .line 149
    monitor-exit v0

    .line 150
    throw p0
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
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Li0/a$a$a;
    .locals 3

    .line 1
    const-class v0, Li0/a$a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "alipay_cashier_statistic_record"

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v2, p0, v1, v2}, La1/j;->b(Ly0/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance p0, Li0/a$a$a;

    .line 18
    .line 19
    invoke-direct {p0}, Li0/a$a$a;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-object p0

    .line 24
    :cond_0
    :try_start_1
    new-instance v1, Li0/a$a$a;

    .line 25
    .line 26
    invoke-direct {v1, p0}, Li0/a$a$a;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-object v1

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    :try_start_2
    invoke-static {p0}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    new-instance p0, Li0/a$a$a;

    .line 36
    .line 37
    invoke-direct {p0}, Li0/a$a$a;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 38
    .line 39
    .line 40
    monitor-exit v0

    .line 41
    return-object p0

    .line 42
    :catchall_1
    move-exception p0

    .line 43
    monitor-exit v0

    .line 44
    throw p0
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
.end method

.method public static declared-synchronized c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-class v0, Li0/a$a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v2, "stat append "

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, " , "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "RecordPref"

    .line 30
    .line 31
    invoke-static {v2, v1}, La1/e;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    if-eqz p0, :cond_3

    .line 35
    .line 36
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    :cond_1
    invoke-static {p0}, Li0/a$a;->b(Landroid/content/Context;)Li0/a$a$a;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v2, v1, Li0/a$a$a;->a:Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const/16 v3, 0x14

    .line 68
    .line 69
    if-le v2, v3, :cond_2

    .line 70
    .line 71
    iget-object v2, v1, Li0/a$a$a;->a:Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 74
    .line 75
    .line 76
    :cond_2
    iget-object v2, v1, Li0/a$a$a;->a:Ljava/util/LinkedHashMap;

    .line 77
    .line 78
    invoke-virtual {v2, p2, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    invoke-static {p0, v1}, Li0/a$a;->d(Landroid/content/Context;Li0/a$a$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    monitor-exit v0

    .line 85
    return-object p2

    .line 86
    :cond_3
    :goto_0
    monitor-exit v0

    .line 87
    const/4 p0, 0x0

    .line 88
    return-object p0

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    monitor-exit v0

    .line 91
    throw p0
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

.method public static declared-synchronized d(Landroid/content/Context;Li0/a$a$a;)V
    .locals 3

    .line 1
    const-class v0, Li0/a$a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    :try_start_0
    new-instance p1, Li0/a$a$a;

    .line 7
    .line 8
    invoke-direct {p1}, Li0/a$a$a;-><init>()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Li0/a$a$a;->a()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v1, "alipay_cashier_statistic_record"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v2, p0, v1, p1}, La1/j;->e(Ly0/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    :try_start_1
    invoke-static {p0}, La1/e;->d(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24
    .line 25
    .line 26
    :goto_0
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :catchall_1
    move-exception p0

    .line 29
    monitor-exit v0

    .line 30
    throw p0
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

.method public static declared-synchronized e(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    const-class v0, Li0/a$a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "RecordPref"

    .line 5
    .line 6
    const-string v2, "stat peek"

    .line 7
    .line 8
    invoke-static {v1, v2}, La1/e;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-object v1

    .line 16
    :cond_0
    :try_start_1
    invoke-static {p0}, Li0/a$a;->b(Landroid/content/Context;)Li0/a$a$a;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object v2, p0, Li0/a$a$a;->a:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-object v1

    .line 30
    :cond_1
    :try_start_2
    iget-object p0, p0, Li0/a$a$a;->a:Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ljava/util/Map$Entry;

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    .line 52
    monitor-exit v0

    .line 53
    return-object p0

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    :try_start_3
    invoke-static {p0}, La1/e;->d(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 56
    .line 57
    .line 58
    monitor-exit v0

    .line 59
    return-object v1

    .line 60
    :catchall_1
    move-exception p0

    .line 61
    monitor-exit v0

    .line 62
    throw p0
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
.end method
