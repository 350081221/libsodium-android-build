.class public Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x19
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$UnWrapperShortcutInfo;,
        Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$WrapperShortcutInfo;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/android/content/pm/IShortcutService$Stub;->TYPE:Ljava/lang/Class;

    const-string v1, "shortcut"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method private static setToString(Ljava/util/Set;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Set<",
            "TT;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v1, 0x1

    .line 15
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const-string v2, ","

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
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
.end method

.method private static toSet(Ljava/lang/String;)Ljava/util/Set;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string v0, ","

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Landroid/util/ArraySet;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/util/ArraySet;-><init>()V

    .line 14
    .line 15
    .line 16
    array-length v1, p0

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_1

    .line 19
    .line 20
    aget-object v3, p0, v2

    .line 21
    .line 22
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-object v0
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
.end method

.method static unWrapper(Landroid/content/Context;Landroid/content/pm/ShortcutInfo;Ljava/lang/String;I)Landroid/content/pm/ShortcutInfo;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/lody/virtual/client/hook/proxies/shortcut/a;->a(Landroid/content/pm/ShortcutInfo;)Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    const-string v2, "_VA_|_pkg_"

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "_VA_|_user_id_"

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-static {v2, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_8

    .line 27
    .line 28
    if-ne v3, p3, :cond_8

    .line 29
    .line 30
    invoke-static {p1}, Landroidx/core/content/pm/x;->a(Landroid/content/pm/ShortcutInfo;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const-string p3, "/"

    .line 35
    .line 36
    invoke-virtual {p2, p3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    add-int/lit8 p3, p3, 0x1

    .line 41
    .line 42
    invoke-virtual {p2, p3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    const-string v2, "mIcon"

    .line 51
    .line 52
    invoke-virtual {p3, v2}, Lcom/lody/virtual/helper/utils/Reflect;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    check-cast p3, Landroid/graphics/drawable/Icon;

    .line 57
    .line 58
    const-string v2, "_VA_|_uri_"

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_1

    .line 69
    .line 70
    invoke-static {v2, v4}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :cond_1
    const-string v2, "_VA_|activity"

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Landroid/content/ComponentName;

    .line 81
    .line 82
    const-string v3, "_VA_|categories"

    .line 83
    .line 84
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v3, Landroid/content/pm/ShortcutInfo$Builder;

    .line 89
    .line 90
    invoke-direct {v3, p0, p2}, Landroid/content/pm/ShortcutInfo$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    if-eqz p3, :cond_2

    .line 94
    .line 95
    invoke-static {v3, p3}, Landroidx/core/content/pm/v;->a(Landroid/content/pm/ShortcutInfo$Builder;Landroid/graphics/drawable/Icon;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 96
    .line 97
    .line 98
    :cond_2
    invoke-static {p1}, Landroidx/core/content/pm/d0;->a(Landroid/content/pm/ShortcutInfo;)Ljava/lang/CharSequence;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-eqz p0, :cond_3

    .line 103
    .line 104
    invoke-static {p1}, Landroidx/core/content/pm/d0;->a(Landroid/content/pm/ShortcutInfo;)Ljava/lang/CharSequence;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {v3, p0}, Landroidx/core/content/pm/w;->a(Landroid/content/pm/ShortcutInfo$Builder;Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 109
    .line 110
    .line 111
    :cond_3
    invoke-static {p1}, Landroidx/core/content/pm/c0;->a(Landroid/content/pm/ShortcutInfo;)Ljava/lang/CharSequence;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-eqz p0, :cond_4

    .line 116
    .line 117
    invoke-static {p1}, Landroidx/core/content/pm/c0;->a(Landroid/content/pm/ShortcutInfo;)Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {v3, p0}, Landroidx/core/content/pm/p;->a(Landroid/content/pm/ShortcutInfo$Builder;Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 122
    .line 123
    .line 124
    :cond_4
    if-eqz v2, :cond_5

    .line 125
    .line 126
    invoke-static {v3, v2}, Landroidx/core/content/pm/k;->a(Landroid/content/pm/ShortcutInfo$Builder;Landroid/content/ComponentName;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 127
    .line 128
    .line 129
    :cond_5
    if-eqz v1, :cond_6

    .line 130
    .line 131
    invoke-static {v3, v1}, Lcom/lody/virtual/client/core/a;->a(Landroid/content/pm/ShortcutInfo$Builder;Landroid/content/Intent;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 132
    .line 133
    .line 134
    :cond_6
    invoke-static {v0}, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub;->toSet(Ljava/lang/String;)Ljava/util/Set;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-eqz p0, :cond_7

    .line 139
    .line 140
    invoke-static {v3, p0}, Landroidx/core/content/pm/l;->a(Landroid/content/pm/ShortcutInfo$Builder;Ljava/util/Set;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 141
    .line 142
    .line 143
    :cond_7
    invoke-static {v3}, Landroidx/core/content/pm/t;->a(Landroid/content/pm/ShortcutInfo$Builder;)Landroid/content/pm/ShortcutInfo;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0

    .line 148
    :cond_8
    return-object v1
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
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method static wrapper(Landroid/content/Context;Landroid/content/pm/ShortcutInfo;Ljava/lang/String;I)Landroid/content/pm/ShortcutInfo;
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "mIcon"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/lody/virtual/helper/utils/Reflect;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/graphics/drawable/Icon;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Icon;->loadDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lcom/lody/virtual/helper/utils/BitmapUtils;->drawableToBitmap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0, v0}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Lcom/lody/virtual/helper/utils/BitmapUtils;->drawableToBitmap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :goto_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {p1}, Lcom/lody/virtual/client/hook/proxies/shortcut/a;->a(Landroid/content/pm/ShortcutInfo;)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-virtual {v0, v1, v2, p2, p3}, Lcom/lody/virtual/client/core/VirtualCore;->wrapperShortcutIntent(Landroid/content/Intent;Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {p1}, Landroidx/core/content/pm/g0;->a(Landroid/content/pm/ShortcutInfo;)Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1}, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub;->setToString(Ljava/util/Set;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v2, "_VA_|categories"

    .line 66
    .line 67
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    const-string v1, "_VA_|activity"

    .line 71
    .line 72
    invoke-static {p1}, Landroidx/core/content/pm/b0;->a(Landroid/content/pm/ShortcutInfo;)Landroid/content/ComponentName;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    new-instance v1, Landroid/content/pm/ShortcutInfo$Builder;

    .line 80
    .line 81
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    new-instance v3, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p2, "@"

    .line 98
    .line 99
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string p2, "/"

    .line 106
    .line 107
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-static {p1}, Landroidx/core/content/pm/x;->a(Landroid/content/pm/ShortcutInfo;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-direct {v1, v2, p2}, Landroid/content/pm/ShortcutInfo$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {p1}, Landroidx/core/content/pm/d0;->a(Landroid/content/pm/ShortcutInfo;)Ljava/lang/CharSequence;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    if-eqz p2, :cond_1

    .line 129
    .line 130
    invoke-static {p1}, Landroidx/core/content/pm/d0;->a(Landroid/content/pm/ShortcutInfo;)Ljava/lang/CharSequence;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-static {v1, p2}, Landroidx/core/content/pm/w;->a(Landroid/content/pm/ShortcutInfo$Builder;Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 135
    .line 136
    .line 137
    :cond_1
    invoke-static {p1}, Landroidx/core/content/pm/c0;->a(Landroid/content/pm/ShortcutInfo;)Ljava/lang/CharSequence;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    if-eqz p2, :cond_2

    .line 142
    .line 143
    invoke-static {p1}, Landroidx/core/content/pm/c0;->a(Landroid/content/pm/ShortcutInfo;)Ljava/lang/CharSequence;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {v1, p1}, Landroidx/core/content/pm/p;->a(Landroid/content/pm/ShortcutInfo$Builder;Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 148
    .line 149
    .line 150
    :cond_2
    invoke-static {p0}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {v1, p0}, Landroidx/core/content/pm/v;->a(Landroid/content/pm/ShortcutInfo$Builder;Landroid/graphics/drawable/Icon;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 155
    .line 156
    .line 157
    invoke-static {v1, v0}, Lcom/lody/virtual/client/core/a;->a(Landroid/content/pm/ShortcutInfo$Builder;Landroid/content/Intent;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 158
    .line 159
    .line 160
    invoke-static {v1}, Landroidx/core/content/pm/t;->a(Landroid/content/pm/ShortcutInfo$Builder;)Landroid/content/pm/ShortcutInfo;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0
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
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method


# virtual methods
.method protected onBindMethods()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 5
    .line 6
    const-string v1, "disableShortcuts"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 15
    .line 16
    const-string v1, "enableShortcuts"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 25
    .line 26
    const-string v1, "getRemainingCallCount"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 35
    .line 36
    const-string v1, "getRateLimitResetTime"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 42
    .line 43
    .line 44
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 45
    .line 46
    const-string v1, "getIconMaxDimensions"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 52
    .line 53
    .line 54
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 55
    .line 56
    const-string v1, "getMaxShortcutCountPerActivity"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 62
    .line 63
    .line 64
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 65
    .line 66
    const-string v1, "reportShortcutUsed"

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 72
    .line 73
    .line 74
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 75
    .line 76
    const-string v1, "onApplicationActive"

    .line 77
    .line 78
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 82
    .line 83
    .line 84
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 85
    .line 86
    const-string v1, "hasShortcutHostPermission"

    .line 87
    .line 88
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 92
    .line 93
    .line 94
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 95
    .line 96
    const-string v1, "removeAllDynamicShortcuts"

    .line 97
    .line 98
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 102
    .line 103
    .line 104
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 105
    .line 106
    const-string v1, "removeDynamicShortcuts"

    .line 107
    .line 108
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 112
    .line 113
    .line 114
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 115
    .line 116
    const-string v1, "getShortcuts"

    .line 117
    .line 118
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 122
    .line 123
    .line 124
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 125
    .line 126
    const-string v1, "removeLongLivedShortcuts"

    .line 127
    .line 128
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 132
    .line 133
    .line 134
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$WrapperShortcutInfo;

    .line 135
    .line 136
    const-string v1, "pushDynamicShortcut"

    .line 137
    .line 138
    const/4 v2, 0x1

    .line 139
    const/4 v3, 0x0

    .line 140
    invoke-direct {v0, v1, v2, v3}, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$WrapperShortcutInfo;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 144
    .line 145
    .line 146
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$WrapperShortcutInfo;

    .line 147
    .line 148
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 149
    .line 150
    const-string v4, "requestPinShortcut"

    .line 151
    .line 152
    invoke-direct {v0, v4, v2, v1}, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$WrapperShortcutInfo;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 156
    .line 157
    .line 158
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$UnWrapperShortcutInfo;

    .line 159
    .line 160
    const-string v4, "getPinnedShortcuts"

    .line 161
    .line 162
    invoke-direct {v0, v4}, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$UnWrapperShortcutInfo;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 166
    .line 167
    .line 168
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$WrapperShortcutInfo;

    .line 169
    .line 170
    const-string v4, "addDynamicShortcuts"

    .line 171
    .line 172
    invoke-direct {v0, v4, v2, v1}, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$WrapperShortcutInfo;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 176
    .line 177
    .line 178
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$WrapperShortcutInfo;

    .line 179
    .line 180
    const-string v4, "setDynamicShortcuts"

    .line 181
    .line 182
    invoke-direct {v0, v4, v2, v1}, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$WrapperShortcutInfo;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 186
    .line 187
    .line 188
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$UnWrapperShortcutInfo;

    .line 189
    .line 190
    const-string v4, "getDynamicShortcuts"

    .line 191
    .line 192
    invoke-direct {v0, v4}, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$UnWrapperShortcutInfo;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 196
    .line 197
    .line 198
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$WrapperShortcutInfo;

    .line 199
    .line 200
    const-string v4, "createShortcutResultIntent"

    .line 201
    .line 202
    invoke-direct {v0, v4, v2, v3}, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$WrapperShortcutInfo;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 206
    .line 207
    .line 208
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$WrapperShortcutInfo;

    .line 209
    .line 210
    const-string v3, "updateShortcuts"

    .line 211
    .line 212
    invoke-direct {v0, v3, v2, v1}, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$WrapperShortcutInfo;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 216
    .line 217
    .line 218
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$1;

    .line 219
    .line 220
    const-string v1, "getManifestShortcuts"

    .line 221
    .line 222
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$1;-><init>(Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 226
    .line 227
    .line 228
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;

    .line 229
    .line 230
    const-string v1, "isRequestPinItemSupported"

    .line 231
    .line 232
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 236
    .line 237
    .line 238
    return-void
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method
