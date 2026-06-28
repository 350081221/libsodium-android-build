.class public Lcom/bytedance/pangle/wrapper/PluginActivityWrapper;
.super Lcom/bytedance/pangle/wrapper/GenerateActivityWrapper;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final OBJECT_TAG:I = 0x7fffffff


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/bytedance/pangle/PluginContext;)V
    .locals 3

    .line 1
    const-string v0, "mBase"

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/bytedance/pangle/wrapper/GenerateActivityWrapper;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/bytedance/pangle/wrapper/GenerateActivityWrapper;->mOriginActivity:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/bytedance/pangle/wrapper/GenerateActivityWrapper;->pluginContext:Lcom/bytedance/pangle/PluginContext;

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v2, 0x1d

    .line 19
    .line 20
    if-lt v1, v2, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, Lcom/bytedance/pangle/wrapper/GenerateActivityWrapper;->mOriginActivity:Landroid/app/Activity;

    .line 23
    .line 24
    new-instance v2, Lcom/bytedance/pangle/wrapper/PluginActivityWrapper$1;

    .line 25
    .line 26
    invoke-direct {v2, p0}, Lcom/bytedance/pangle/wrapper/PluginActivityWrapper$1;-><init>(Lcom/bytedance/pangle/wrapper/PluginActivityWrapper;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Landroidx/lifecycle/i;->a(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/pangle/wrapper/PluginActivityWrapper;->setTag()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catch_0
    invoke-direct {p0}, Lcom/bytedance/pangle/wrapper/PluginActivityWrapper;->registerApplicationLifecycleCallbacks()V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    :try_start_1
    invoke-static {p0, v0, p2}, Lcom/bytedance/pangle/util/FieldUtils;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/bytedance/pangle/util/i;->a()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    const-class v1, Landroid/content/ContextWrapper;

    .line 50
    .line 51
    invoke-static {v1, v0}, Lcom/bytedance/pangle/util/FieldUtils;->getField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0, p0, p2}, Lcom/bytedance/pangle/util/FieldUtils;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 56
    .line 57
    .line 58
    :catch_1
    :cond_2
    :try_start_2
    const-string p2, "mApplication"

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {p0, p2, v0}, Lcom/bytedance/pangle/util/FieldUtils;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    .line 65
    .line 66
    .line 67
    :catch_2
    invoke-static {p0, p1}, Lcom/bytedance/pangle/util/a;->a(Lcom/bytedance/pangle/wrapper/a;Landroid/app/Activity;)V

    .line 68
    .line 69
    .line 70
    return-void
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

.method private registerApplicationLifecycleCallbacks()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->getAppApplication()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v1, Lcom/bytedance/pangle/wrapper/PluginActivityWrapper$2;

    .line 9
    .line 10
    invoke-direct {v1, p0, v0}, Lcom/bytedance/pangle/wrapper/PluginActivityWrapper$2;-><init>(Lcom/bytedance/pangle/wrapper/PluginActivityWrapper;Landroid/app/Application;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private setTag()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/wrapper/GenerateActivityWrapper;->mOriginActivity:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    iget-object v1, p0, Lcom/bytedance/pangle/wrapper/GenerateActivityWrapper;->pluginContext:Lcom/bytedance/pangle/PluginContext;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/bytedance/pangle/PluginContext;->getPluginPackageName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    new-instance v2, Lcom/bytedance/pangle/wrapper/PluginActivityWrapper$3;

    .line 31
    .line 32
    invoke-direct {v2, p0}, Lcom/bytedance/pangle/wrapper/PluginActivityWrapper$3;-><init>(Lcom/bytedance/pangle/wrapper/PluginActivityWrapper;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
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
