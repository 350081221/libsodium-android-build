.class public Lcom/huawei/agconnect/apms/x0;
.super Lcom/huawei/agconnect/apms/y0;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/agconnect/apms/x0$cde;,
        Lcom/huawei/agconnect/apms/x0$bcd;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/agconnect/apms/y0;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/h1;->fgh()Lcom/huawei/agconnect/apms/h1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/h1;->abc()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/huawei/agconnect/apms/s1;->efg()Lcom/huawei/agconnect/apms/s1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/s1;->abc()V

    .line 13
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

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    invoke-static {}, Lcom/huawei/agconnect/apms/h1;->fgh()Lcom/huawei/agconnect/apms/h1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/h1;->bcd()V

    return-void
.end method

.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/huawei/agconnect/apms/h1;->fgh()Lcom/huawei/agconnect/apms/h1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1, v0}, Lcom/huawei/agconnect/apms/h1;->abc(Ljava/lang/ref/WeakReference;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/huawei/agconnect/apms/s1;->efg()Lcom/huawei/agconnect/apms/s1;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1, v0}, Lcom/huawei/agconnect/apms/s1;->bcd(Ljava/lang/ref/WeakReference;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/h1;->fgh()Lcom/huawei/agconnect/apms/h1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/h1;->cde()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/huawei/agconnect/apms/s1;->efg()Lcom/huawei/agconnect/apms/s1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/s1;->bcd()V

    .line 13
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

.method public onActivityPreResumed(Landroid/app/Activity;)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    invoke-static {}, Lcom/huawei/agconnect/apms/s1;->efg()Lcom/huawei/agconnect/apms/s1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/s1;->cde()V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/huawei/agconnect/apms/h1;->fgh()Lcom/huawei/agconnect/apms/h1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1, v0}, Lcom/huawei/agconnect/apms/h1;->bcd(Ljava/lang/ref/WeakReference;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/huawei/agconnect/apms/s1;->efg()Lcom/huawei/agconnect/apms/s1;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1, v0}, Lcom/huawei/agconnect/apms/s1;->abc(Ljava/lang/ref/WeakReference;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/huawei/agconnect/apms/s1;->efg()Lcom/huawei/agconnect/apms/s1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v1, p1, Lcom/huawei/agconnect/apms/s1;->abc:Lcom/huawei/agconnect/apms/n1;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    sget-object p1, Lcom/huawei/agconnect/apms/s1;->mno:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 15
    .line 16
    const-string v0, "can not get frame metrics with null frame metrics aggregator."

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Landroid/app/Activity;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lcom/huawei/agconnect/apms/s1;->bcd(Landroid/app/Activity;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    iget-object v1, p1, Lcom/huawei/agconnect/apms/s1;->bcd:Ljava/util/WeakHashMap;

    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    iget-object p1, p1, Lcom/huawei/agconnect/apms/s1;->abc:Lcom/huawei/agconnect/apms/n1;

    .line 62
    .line 63
    iget-object p1, p1, Lcom/huawei/agconnect/apms/n1;->abc:Lcom/huawei/agconnect/apms/p1;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lcom/huawei/agconnect/apms/p1;->abc(Landroid/app/Activity;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/huawei/agconnect/apms/y0;->abc:Ljava/util/concurrent/ScheduledExecutorService;

    .line 69
    .line 70
    new-instance v0, Lcom/huawei/agconnect/apms/x0$bcd;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-direct {v0, v1}, Lcom/huawei/agconnect/apms/x0$bcd;-><init>(Lcom/huawei/agconnect/apms/x0$abc;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 77
    .line 78
    .line 79
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 18

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/huawei/agconnect/apms/s1;->efg()Lcom/huawei/agconnect/apms/s1;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v1, Lcom/huawei/agconnect/apms/s1;->abc:Lcom/huawei/agconnect/apms/n1;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    sget-object v0, Lcom/huawei/agconnect/apms/s1;->mno:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 18
    .line 19
    const-string v1, "can not get frame metrics, because the android support library is not included."

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    :goto_0
    move-object/from16 v0, p0

    .line 25
    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :cond_1
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Landroid/app/Activity;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lcom/huawei/agconnect/apms/s1;->abc(Landroid/app/Activity;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {v1, v0}, Lcom/huawei/agconnect/apms/s1;->bcd(Landroid/app/Activity;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    iget-object v2, v1, Lcom/huawei/agconnect/apms/s1;->bcd:Ljava/util/WeakHashMap;

    .line 52
    .line 53
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    iget-object v2, v1, Lcom/huawei/agconnect/apms/s1;->bcd:Ljava/util/WeakHashMap;

    .line 65
    .line 66
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/lang/Long;

    .line 71
    .line 72
    if-nez v2, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    iget-object v6, v1, Lcom/huawei/agconnect/apms/s1;->bcd:Ljava/util/WeakHashMap;

    .line 76
    .line 77
    invoke-virtual {v6, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    const/4 v6, 0x1

    .line 81
    const/4 v8, 0x0

    .line 82
    :try_start_0
    iget-object v9, v1, Lcom/huawei/agconnect/apms/s1;->abc:Lcom/huawei/agconnect/apms/n1;

    .line 83
    .line 84
    iget-object v9, v9, Lcom/huawei/agconnect/apms/n1;->abc:Lcom/huawei/agconnect/apms/p1;

    .line 85
    .line 86
    invoke-virtual {v9, v0}, Lcom/huawei/agconnect/apms/p1;->bcd(Landroid/app/Activity;)[Landroid/util/SparseIntArray;

    .line 87
    .line 88
    .line 89
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    goto :goto_1

    .line 91
    :catch_0
    sget-object v0, Lcom/huawei/agconnect/apms/s1;->mno:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 92
    .line 93
    sget-object v9, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 94
    .line 95
    new-array v10, v6, [Ljava/lang/Object;

    .line 96
    .line 97
    aput-object v7, v10, v8

    .line 98
    .line 99
    const-string v11, "view not hardware accelerated, can not remove %s from frameMetricsAggregator."

    .line 100
    .line 101
    invoke-static {v9, v11, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    invoke-interface {v0, v9}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    move-object v0, v3

    .line 109
    :goto_1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-eqz v9, :cond_5

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    if-eqz v0, :cond_a

    .line 117
    .line 118
    array-length v9, v0

    .line 119
    if-eqz v9, :cond_a

    .line 120
    .line 121
    aget-object v0, v0, v8

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    move v9, v8

    .line 126
    move v10, v9

    .line 127
    move v11, v10

    .line 128
    move v12, v11

    .line 129
    :goto_2
    invoke-virtual {v0}, Landroid/util/SparseIntArray;->size()I

    .line 130
    .line 131
    .line 132
    move-result v13

    .line 133
    if-ge v9, v13, :cond_9

    .line 134
    .line 135
    invoke-virtual {v0, v9}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    invoke-virtual {v0, v9}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 140
    .line 141
    .line 142
    move-result v14

    .line 143
    add-int/2addr v10, v14

    .line 144
    const/16 v15, 0x2bc

    .line 145
    .line 146
    if-le v13, v15, :cond_6

    .line 147
    .line 148
    add-int/2addr v12, v14

    .line 149
    :cond_6
    const/16 v15, 0x10

    .line 150
    .line 151
    if-le v13, v15, :cond_7

    .line 152
    .line 153
    add-int/2addr v11, v14

    .line 154
    :cond_7
    add-int/lit8 v9, v9, 0x1

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_8
    move v10, v8

    .line 158
    move v11, v10

    .line 159
    move v12, v11

    .line 160
    :cond_9
    iget v0, v1, Lcom/huawei/agconnect/apms/s1;->cde:I

    .line 161
    .line 162
    sub-int v0, v10, v0

    .line 163
    .line 164
    iget v9, v1, Lcom/huawei/agconnect/apms/s1;->def:I

    .line 165
    .line 166
    sub-int v9, v11, v9

    .line 167
    .line 168
    iget v13, v1, Lcom/huawei/agconnect/apms/s1;->efg:I

    .line 169
    .line 170
    sub-int v13, v12, v13

    .line 171
    .line 172
    iput v10, v1, Lcom/huawei/agconnect/apms/s1;->cde:I

    .line 173
    .line 174
    iput v11, v1, Lcom/huawei/agconnect/apms/s1;->def:I

    .line 175
    .line 176
    iput v12, v1, Lcom/huawei/agconnect/apms/s1;->efg:I

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_a
    move v0, v8

    .line 180
    move v9, v0

    .line 181
    move v13, v9

    .line 182
    :goto_3
    if-nez v0, :cond_b

    .line 183
    .line 184
    sget-object v0, Lcom/huawei/agconnect/apms/s1;->mno:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 185
    .line 186
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 187
    .line 188
    new-array v2, v6, [Ljava/lang/Object;

    .line 189
    .line 190
    aput-object v7, v2, v8

    .line 191
    .line 192
    const-string v4, "frame aggregator currentTotalFrames is 0\uff0c %s does not refresh any frames."

    .line 193
    .line 194
    invoke-static {v1, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 204
    .line 205
    .line 206
    move-result-wide v10

    .line 207
    sub-long v10, v4, v10

    .line 208
    .line 209
    new-instance v1, Lcom/huawei/agconnect/apms/collect/model/event/interaction/ActivityRenderEvent;

    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 212
    .line 213
    .line 214
    move-result-wide v5

    .line 215
    int-to-long v14, v9

    .line 216
    int-to-long v12, v13

    .line 217
    int-to-long v8, v0

    .line 218
    move-object v4, v1

    .line 219
    move-wide/from16 v16, v8

    .line 220
    .line 221
    move-wide v8, v10

    .line 222
    move-wide v10, v14

    .line 223
    move-wide/from16 v14, v16

    .line 224
    .line 225
    invoke-direct/range {v4 .. v15}, Lcom/huawei/agconnect/apms/collect/model/event/interaction/ActivityRenderEvent;-><init>(JLjava/lang/String;JJJJ)V

    .line 226
    .line 227
    .line 228
    invoke-static {v1}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :goto_4
    iget-object v1, v0, Lcom/huawei/agconnect/apms/y0;->abc:Ljava/util/concurrent/ScheduledExecutorService;

    .line 234
    .line 235
    new-instance v2, Lcom/huawei/agconnect/apms/x0$cde;

    .line 236
    .line 237
    invoke-direct {v2, v3}, Lcom/huawei/agconnect/apms/x0$cde;-><init>(Lcom/huawei/agconnect/apms/x0$abc;)V

    .line 238
    .line 239
    .line 240
    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 241
    .line 242
    .line 243
    return-void
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public onLowMemory()V
    .locals 0

    return-void
.end method
