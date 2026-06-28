.class public Lcom/lody/virtual/server/pm/VPackageManagerService;
.super Lcom/lody/virtual/server/interfaces/IPackageManager$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;,
        Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;
    }
.end annotation


# static fields
.field static final TAG:Ljava/lang/String; = "PackageManager"

.field private static final gService:Lcom/lody/virtual/helper/utils/Singleton;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/lody/virtual/helper/utils/Singleton<",
            "Lcom/lody/virtual/server/pm/VPackageManagerService;",
            ">;"
        }
    .end annotation
.end field

.field private static final sProviderInitOrderSorter:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Landroid/content/pm/ProviderInfo;",
            ">;"
        }
    .end annotation
.end field

.field static final sResolvePrioritySorter:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mActivities:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

.field private final mDangerousPermissions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mPackages:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/lody/virtual/server/pm/parser/VPackage;",
            ">;"
        }
    .end annotation
.end field

.field private final mPermissionGroups:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/lody/virtual/server/pm/parser/VPackage$PermissionGroupComponent;",
            ">;"
        }
    .end annotation
.end field

.field private final mPermissions:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;",
            ">;"
        }
    .end annotation
.end field

.field private final mProviders:Lcom/lody/virtual/server/pm/ProviderIntentResolver;

.field private final mProvidersByAuthority:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;",
            ">;"
        }
    .end annotation
.end field

.field private final mProvidersByComponent:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/content/ComponentName;",
            "Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;",
            ">;"
        }
    .end annotation
.end field

.field private final mReceivers:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

.field private final mServices:Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/lody/virtual/server/pm/VPackageManagerService$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/lody/virtual/server/pm/VPackageManagerService$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/lody/virtual/server/pm/VPackageManagerService;->sResolvePrioritySorter:Ljava/util/Comparator;

    .line 7
    .line 8
    new-instance v0, Lcom/lody/virtual/server/pm/VPackageManagerService$2;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/lody/virtual/server/pm/VPackageManagerService$2;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/lody/virtual/server/pm/VPackageManagerService;->gService:Lcom/lody/virtual/helper/utils/Singleton;

    .line 14
    .line 15
    new-instance v0, Lcom/lody/virtual/server/pm/VPackageManagerService$3;

    .line 16
    .line 17
    invoke-direct {v0}, Lcom/lody/virtual/server/pm/VPackageManagerService$3;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/lody/virtual/server/pm/VPackageManagerService;->sProviderInitOrderSorter:Ljava/util/Comparator;

    .line 21
    .line 22
    return-void
    .line 23
.end method

.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Lcom/lody/virtual/server/interfaces/IPackageManager$Stub;-><init>()V

    .line 3
    new-instance v0, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;-><init>(Lcom/lody/virtual/server/pm/VPackageManagerService$1;)V

    iput-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mActivities:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    .line 4
    new-instance v0, Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;

    invoke-direct {v0, v1}, Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;-><init>(Lcom/lody/virtual/server/pm/VPackageManagerService$1;)V

    iput-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mServices:Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;

    .line 5
    new-instance v0, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    invoke-direct {v0, v1}, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;-><init>(Lcom/lody/virtual/server/pm/VPackageManagerService$1;)V

    iput-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mReceivers:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    .line 6
    new-instance v0, Lcom/lody/virtual/server/pm/ProviderIntentResolver;

    invoke-direct {v0}, Lcom/lody/virtual/server/pm/ProviderIntentResolver;-><init>()V

    iput-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProviders:Lcom/lody/virtual/server/pm/ProviderIntentResolver;

    .line 7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProvidersByComponent:Ljava/util/HashMap;

    .line 8
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPermissions:Ljava/util/HashMap;

    .line 9
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPermissionGroups:Ljava/util/HashMap;

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProvidersByAuthority:Ljava/util/HashMap;

    .line 11
    sget-object v0, Lcom/lody/virtual/server/pm/PackageCacheManager;->PACKAGE_CACHE:Landroid/util/ArrayMap;

    iput-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 12
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mDangerousPermissions:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/server/pm/VPackageManagerService$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VPackageManagerService;-><init>()V

    return-void
.end method

.method private checkUserId(I)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/lody/virtual/server/pm/VUserManagerService;->get()Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/lody/virtual/server/pm/VUserManagerService;->exists(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/SecurityException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "Invalid userId "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
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

.method private chooseBestActivity(Landroid/content/Intent;Ljava/lang/String;ILjava/util/List;)Landroid/content/pm/ResolveInfo;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;)",
            "Landroid/content/pm/ResolveInfo;"
        }
    .end annotation

    .line 1
    if-eqz p4, :cond_4

    .line 2
    .line 3
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/content/pm/ResolveInfo;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    if-le v0, v1, :cond_4

    .line 19
    .line 20
    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 25
    .line 26
    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 31
    .line 32
    iget v8, v0, Landroid/content/pm/ResolveInfo;->priority:I

    .line 33
    .line 34
    iget v3, v1, Landroid/content/pm/ResolveInfo;->priority:I

    .line 35
    .line 36
    if-ne v8, v3, :cond_3

    .line 37
    .line 38
    iget v3, v0, Landroid/content/pm/ResolveInfo;->preferredOrder:I

    .line 39
    .line 40
    iget v4, v1, Landroid/content/pm/ResolveInfo;->preferredOrder:I

    .line 41
    .line 42
    if-ne v3, v4, :cond_3

    .line 43
    .line 44
    iget-boolean v0, v0, Landroid/content/pm/ResolveInfo;->isDefault:Z

    .line 45
    .line 46
    iget-boolean v1, v1, Landroid/content/pm/ResolveInfo;->isDefault:Z

    .line 47
    .line 48
    if-eq v0, v1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v3, p0

    .line 52
    move-object v4, p1

    .line 53
    move-object v5, p2

    .line 54
    move v6, p3

    .line 55
    move-object v7, p4

    .line 56
    invoke-direct/range {v3 .. v8}, Lcom/lody/virtual/server/pm/VPackageManagerService;->findPreferredActivity(Landroid/content/Intent;Ljava/lang/String;ILjava/util/List;I)Landroid/content/pm/ResolveInfo;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_2
    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Landroid/content/pm/ResolveInfo;

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_3
    :goto_0
    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Landroid/content/pm/ResolveInfo;

    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_4
    const/4 p1, 0x0

    .line 78
    return-object p1
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

.method private findPermission(Ljava/lang/String;)Landroid/content/pm/PermissionInfo;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 25
    .line 26
    iget-object v2, v2, Lcom/lody/virtual/server/pm/parser/VPackage;->permissions:Ljava/util/ArrayList;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;

    .line 45
    .line 46
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;->info:Landroid/content/pm/PermissionInfo;

    .line 47
    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    iget-object v4, v4, Landroid/content/pm/PermissionInfo;->name:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {p1, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    iget-object p1, v3, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;->info:Landroid/content/pm/PermissionInfo;

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-object p1

    .line 62
    :cond_2
    monitor-exit v0

    .line 63
    const/4 p1, 0x0

    .line 64
    return-object p1

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    throw p1
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

.method private findPreferredActivity(Landroid/content/Intent;Ljava/lang/String;ILjava/util/List;I)Landroid/content/pm/ResolveInfo;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;I)",
            "Landroid/content/pm/ResolveInfo;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method private generatePackageInfo(Lcom/lody/virtual/server/pm/parser/VPackage;Lcom/lody/virtual/server/pm/PackageSetting;II)Landroid/content/pm/PackageInfo;
    .locals 10

    .line 1
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    iget-wide v3, p2, Lcom/lody/virtual/server/pm/PackageSetting;->firstInstallTime:J

    .line 6
    .line 7
    iget-wide v5, p2, Lcom/lody/virtual/server/pm/PackageSetting;->lastUpdateTime:J

    .line 8
    .line 9
    invoke-virtual {p2, p4}, Lcom/lody/virtual/server/pm/PackageSetting;->readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    .line 10
    .line 11
    .line 12
    move-result-object v7

    .line 13
    invoke-virtual {p2}, Lcom/lody/virtual/server/pm/PackageSetting;->isRunInExtProcess()Z

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    move-object v0, p1

    .line 18
    move-object v1, p2

    .line 19
    move v8, p4

    .line 20
    invoke-static/range {v0 .. v9}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generatePackageInfo(Lcom/lody/virtual/server/pm/parser/VPackage;Lcom/lody/virtual/server/pm/PackageSetting;IJJLcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/PackageInfo;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
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

.method public static get()Lcom/lody/virtual/server/pm/VPackageManagerService;
    .locals 1

    sget-object v0, Lcom/lody/virtual/server/pm/VPackageManagerService;->gService:Lcom/lody/virtual/helper/utils/Singleton;

    invoke-virtual {v0}, Lcom/lody/virtual/helper/utils/Singleton;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/lody/virtual/server/pm/VPackageManagerService;

    return-object v0
.end method

.method private hasRequestedPermission(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iget-object p2, p2, Lcom/lody/virtual/server/pm/parser/VPackage;->requestedPermissions:Ljava/util/ArrayList;

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p1
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

.method public static systemReady()V
    .locals 5

    new-instance v0, Lcom/lody/virtual/server/pm/VUserManagerService;

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Lcom/lody/virtual/server/pm/VPackageManagerService;->get()Lcom/lody/virtual/server/pm/VPackageManagerService;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [C

    invoke-static {}, Lcom/lody/virtual/server/pm/VPackageManagerService;->get()Lcom/lody/virtual/server/pm/VPackageManagerService;

    move-result-object v4

    iget-object v4, v4, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/lody/virtual/server/pm/VUserManagerService;-><init>(Landroid/content/Context;Lcom/lody/virtual/server/pm/VPackageManagerService;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private updateFlagsNought(I)I
    .locals 2

    const/high16 v0, 0xc0000

    and-int v1, p1, v0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    or-int/2addr p1, v0

    :goto_0
    return p1
.end method


# virtual methods
.method public activitySupportsIntent(Landroid/content/ComponentName;Landroid/content/Intent;Ljava/lang/String;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mActivities:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    .line 5
    .line 6
    invoke-static {v1}, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;->access$300(Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;)Ljava/util/HashMap;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return v1

    .line 21
    :cond_0
    move v2, v1

    .line 22
    :goto_0
    iget-object v3, p1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->intents:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-ge v2, v3, :cond_2

    .line 29
    .line 30
    iget-object v3, p1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->intents:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityIntentInfo;

    .line 37
    .line 38
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$IntentInfo;->filter:Landroid/content/IntentFilter;

    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {p2}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    invoke-virtual {p2}, Landroid/content/Intent;->getCategories()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    const-string v10, "PackageManager"

    .line 57
    .line 58
    move-object v6, p3

    .line 59
    invoke-virtual/range {v4 .. v10}, Landroid/content/IntentFilter;->match(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Set;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-ltz v3, :cond_1

    .line 64
    .line 65
    monitor-exit v0

    .line 66
    const/4 p1, 0x1

    .line 67
    return p1

    .line 68
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    monitor-exit v0

    .line 72
    return v1

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    throw p1
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
.end method

.method analyzePackageLocked(Lcom/lody/virtual/server/pm/parser/VPackage;)V
    .locals 10

    .line 1
    iget-object v0, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->activities:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    iget-object v3, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->activities:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 18
    .line 19
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;->info:Landroid/content/pm/ActivityInfo;

    .line 20
    .line 21
    iget-object v5, v4, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    .line 22
    .line 23
    if-nez v5, :cond_0

    .line 24
    .line 25
    iget-object v5, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 26
    .line 27
    iput-object v5, v4, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    .line 28
    .line 29
    :cond_0
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mActivities:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    .line 30
    .line 31
    const-string v5, "activity"

    .line 32
    .line 33
    invoke-virtual {v4, v3, v5}, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;->addActivity(Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v0, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->services:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    move v2, v1

    .line 46
    :goto_1
    if-ge v2, v0, :cond_3

    .line 47
    .line 48
    iget-object v3, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->services:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;

    .line 55
    .line 56
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;->info:Landroid/content/pm/ServiceInfo;

    .line 57
    .line 58
    iget-object v5, v4, Landroid/content/pm/ServiceInfo;->processName:Ljava/lang/String;

    .line 59
    .line 60
    if-nez v5, :cond_2

    .line 61
    .line 62
    iget-object v5, v4, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 63
    .line 64
    iput-object v5, v4, Landroid/content/pm/ServiceInfo;->processName:Ljava/lang/String;

    .line 65
    .line 66
    :cond_2
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mServices:Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;

    .line 67
    .line 68
    invoke-virtual {v4, v3}, Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;->addService(Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    iget-object v0, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->receivers:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    move v2, v1

    .line 81
    :goto_2
    if-ge v2, v0, :cond_5

    .line 82
    .line 83
    iget-object v3, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->receivers:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 90
    .line 91
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;->info:Landroid/content/pm/ActivityInfo;

    .line 92
    .line 93
    iget-object v5, v4, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    .line 94
    .line 95
    if-nez v5, :cond_4

    .line 96
    .line 97
    iget-object v5, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 98
    .line 99
    iput-object v5, v4, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    .line 100
    .line 101
    :cond_4
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mReceivers:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    .line 102
    .line 103
    const-string v5, "receiver"

    .line 104
    .line 105
    invoke-virtual {v4, v3, v5}, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;->addActivity(Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 v2, v2, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    iget-object v0, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->providers:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    move v2, v1

    .line 118
    :goto_3
    if-ge v2, v0, :cond_9

    .line 119
    .line 120
    iget-object v3, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->providers:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;

    .line 127
    .line 128
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;->info:Landroid/content/pm/ProviderInfo;

    .line 129
    .line 130
    iget-object v5, v4, Landroid/content/pm/ProviderInfo;->processName:Ljava/lang/String;

    .line 131
    .line 132
    if-nez v5, :cond_6

    .line 133
    .line 134
    iget-object v5, v4, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 135
    .line 136
    iput-object v5, v4, Landroid/content/pm/ProviderInfo;->processName:Ljava/lang/String;

    .line 137
    .line 138
    :cond_6
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProviders:Lcom/lody/virtual/server/pm/ProviderIntentResolver;

    .line 139
    .line 140
    invoke-virtual {v4, v3}, Lcom/lody/virtual/server/pm/ProviderIntentResolver;->addProvider(Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;)V

    .line 141
    .line 142
    .line 143
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;->info:Landroid/content/pm/ProviderInfo;

    .line 144
    .line 145
    iget-object v4, v4, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 146
    .line 147
    const-string v5, ";"

    .line 148
    .line 149
    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    iget-object v5, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProvidersByAuthority:Ljava/util/HashMap;

    .line 154
    .line 155
    monitor-enter v5

    .line 156
    :try_start_0
    array-length v6, v4

    .line 157
    move v7, v1

    .line 158
    :goto_4
    if-ge v7, v6, :cond_8

    .line 159
    .line 160
    aget-object v8, v4, v7

    .line 161
    .line 162
    iget-object v9, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProvidersByAuthority:Ljava/util/HashMap;

    .line 163
    .line 164
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-nez v9, :cond_7

    .line 169
    .line 170
    iget-object v9, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProvidersByAuthority:Ljava/util/HashMap;

    .line 171
    .line 172
    invoke-virtual {v9, v8, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_8
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProvidersByComponent:Ljava/util/HashMap;

    .line 180
    .line 181
    invoke-virtual {v3}, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->getComponentName()Landroid/content/ComponentName;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    add-int/lit8 v2, v2, 0x1

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :catchall_0
    move-exception p1

    .line 192
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 193
    throw p1

    .line 194
    :cond_9
    iget-object v0, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->permissions:Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    move v2, v1

    .line 201
    :goto_5
    if-ge v2, v0, :cond_a

    .line 202
    .line 203
    iget-object v3, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->permissions:Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;

    .line 210
    .line 211
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPermissions:Ljava/util/HashMap;

    .line 212
    .line 213
    iget-object v5, v3, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;->info:Landroid/content/pm/PermissionInfo;

    .line 214
    .line 215
    iget-object v5, v5, Landroid/content/pm/PermissionInfo;->name:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    add-int/lit8 v2, v2, 0x1

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_a
    iget-object v0, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->permissionGroups:Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    :goto_6
    if-ge v1, v0, :cond_b

    .line 230
    .line 231
    iget-object v2, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->permissionGroups:Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    check-cast v2, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionGroupComponent;

    .line 238
    .line 239
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPermissionGroups:Ljava/util/HashMap;

    .line 240
    .line 241
    iget-object v4, v2, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->className:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    add-int/lit8 v1, v1, 0x1

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_b
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mDangerousPermissions:Ljava/util/Map;

    .line 250
    .line 251
    monitor-enter v0

    .line 252
    :try_start_2
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mDangerousPermissions:Ljava/util/Map;

    .line 253
    .line 254
    iget-object v2, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 255
    .line 256
    iget-object p1, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->requestedPermissions:Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-static {p1}, Lcom/lody/virtual/helper/compat/PermissionCompat;->findDangerousPermissions(Ljava/util/List;)[Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    monitor-exit v0

    .line 266
    return-void

    .line 267
    :catchall_1
    move-exception p1

    .line 268
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 269
    throw p1
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

.method public checkPermission(ZLjava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 1
    const-string v0, "android.permission.INTERACT_ACROSS_USERS"

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "android.permission.INTERACT_ACROSS_USERS_FULL"

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, p1, p2, p4, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUidPermission(ZLjava/lang/String;ILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_1
    :goto_0
    const/4 p1, -0x1

    .line 24
    return p1
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

.method public checkSignatures(Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    .line 1
    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/16 v0, 0x40

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, v1}, Lcom/lody/virtual/server/pm/VPackageManagerService;->getPackageInfo(Ljava/lang/String;II)Landroid/content/pm/PackageInfo;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0, p2, v0, v1}, Lcom/lody/virtual/server/pm/VPackageManagerService;->getPackageInfo(Ljava/lang/String;II)Landroid/content/pm/PackageInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-wide/16 v3, 0x40

    .line 20
    .line 21
    const/4 v1, -0x4

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPackageManager()Lcom/lody/virtual/client/env/HostPackageManager;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2, p1, v3, v4}, Lcom/lody/virtual/client/env/HostPackageManager;->getPackageInfo(Ljava/lang/String;J)Landroid/content/pm/PackageInfo;

    .line 33
    .line 34
    .line 35
    move-result-object v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    goto :goto_0

    .line 37
    :catch_0
    return v1

    .line 38
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 39
    .line 40
    :try_start_1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPackageManager()Lcom/lody/virtual/client/env/HostPackageManager;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1, p2, v3, v4}, Lcom/lody/virtual/client/env/HostPackageManager;->getPackageInfo(Ljava/lang/String;J)Landroid/content/pm/PackageInfo;

    .line 49
    .line 50
    .line 51
    move-result-object v0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 52
    goto :goto_1

    .line 53
    :catch_1
    return v1

    .line 54
    :cond_2
    :goto_1
    iget-object p1, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 55
    .line 56
    iget-object p2, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 57
    .line 58
    invoke-static {p1, p2}, Lcom/lody/virtual/helper/utils/SignaturesUtils;->compareSignatures([Landroid/content/pm/Signature;[Landroid/content/pm/Signature;)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    return p1
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
.end method

.method public checkUidPermission(ZLjava/lang/String;ILjava/lang/String;)I
    .locals 1

    .line 1
    const/4 p3, 0x0

    .line 2
    invoke-virtual {p0, p2, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->getPermissionInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionInfo;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return p3

    .line 9
    :cond_0
    invoke-static {p4}, Lcom/lody/virtual/GmsSupport;->isGoogleAppOrService(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p4

    .line 13
    if-eqz p4, :cond_1

    .line 14
    .line 15
    sget-object p4, Lcom/lody/virtual/GmsSupport;->PERMISSION_FORCE_GRANT:Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-virtual {p4, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    if-eqz p4, :cond_1

    .line 22
    .line 23
    return p3

    .line 24
    :cond_1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getPM()Landroid/content/pm/PackageManager;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-static {p1}, Lcom/lody/virtual/client/stub/StubManifest;->getStubPackageName(Z)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p3, p2, p1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
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

.method cleanUpUser(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 22
    .line 23
    iget-object v1, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->removeUser(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {p1}, Lcom/lody/virtual/server/pm/ComponentStateManager;->user(I)Lcom/lody/virtual/server/pm/ComponentStateManager$UserComponentState;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lcom/lody/virtual/server/pm/ComponentStateManager$UserComponentState;->clearAll()V

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
    .line 84
    .line 85
.end method

.method createNewUser(ILjava/io/File;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->modifyUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
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

.method deletePackageLocked(Lcom/lody/virtual/server/pm/parser/VPackage;)V
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->activities:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, v0, :cond_1

    .line 13
    .line 14
    iget-object v3, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->activities:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 21
    .line 22
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mActivities:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    .line 23
    .line 24
    const-string v5, "activity"

    .line 25
    .line 26
    invoke-virtual {v4, v3, v5}, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;->removeActivity(Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v0, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->services:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    move v2, v1

    .line 39
    :goto_1
    if-ge v2, v0, :cond_2

    .line 40
    .line 41
    iget-object v3, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->services:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;

    .line 48
    .line 49
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mServices:Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;

    .line 50
    .line 51
    invoke-virtual {v4, v3}, Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;->removeService(Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    iget-object v0, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->receivers:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    move v2, v1

    .line 64
    :goto_2
    if-ge v2, v0, :cond_3

    .line 65
    .line 66
    iget-object v3, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->receivers:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 73
    .line 74
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mReceivers:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    .line 75
    .line 76
    const-string v5, "receiver"

    .line 77
    .line 78
    invoke-virtual {v4, v3, v5}, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;->removeActivity(Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    iget-object v0, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->providers:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    move v2, v1

    .line 91
    :goto_3
    if-ge v2, v0, :cond_5

    .line 92
    .line 93
    iget-object v3, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->providers:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;

    .line 100
    .line 101
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProviders:Lcom/lody/virtual/server/pm/ProviderIntentResolver;

    .line 102
    .line 103
    invoke-virtual {v4, v3}, Lcom/lody/virtual/server/pm/ProviderIntentResolver;->removeProvider(Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;)V

    .line 104
    .line 105
    .line 106
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;->info:Landroid/content/pm/ProviderInfo;

    .line 107
    .line 108
    iget-object v4, v4, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 109
    .line 110
    const-string v5, ";"

    .line 111
    .line 112
    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    iget-object v5, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProvidersByAuthority:Ljava/util/HashMap;

    .line 117
    .line 118
    monitor-enter v5

    .line 119
    :try_start_0
    array-length v6, v4

    .line 120
    move v7, v1

    .line 121
    :goto_4
    if-ge v7, v6, :cond_4

    .line 122
    .line 123
    aget-object v8, v4, v7

    .line 124
    .line 125
    iget-object v9, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProvidersByAuthority:Ljava/util/HashMap;

    .line 126
    .line 127
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    add-int/lit8 v7, v7, 0x1

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_4
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProvidersByComponent:Ljava/util/HashMap;

    .line 135
    .line 136
    invoke-virtual {v3}, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->getComponentName()Landroid/content/ComponentName;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    add-int/lit8 v2, v2, 0x1

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :catchall_0
    move-exception p1

    .line 147
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    throw p1

    .line 149
    :cond_5
    iget-object v0, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->permissions:Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    move v2, v1

    .line 156
    :goto_5
    if-ge v2, v0, :cond_6

    .line 157
    .line 158
    iget-object v3, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->permissions:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;

    .line 165
    .line 166
    iget-object v4, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPermissions:Ljava/util/HashMap;

    .line 167
    .line 168
    iget-object v3, v3, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->className:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    add-int/lit8 v2, v2, 0x1

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_6
    iget-object v0, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->permissionGroups:Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    :goto_6
    if-ge v1, v0, :cond_7

    .line 183
    .line 184
    iget-object v2, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->permissionGroups:Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    check-cast v2, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionGroupComponent;

    .line 191
    .line 192
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPermissionGroups:Ljava/util/HashMap;

    .line 193
    .line 194
    iget-object v2, v2, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->className:Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    add-int/lit8 v1, v1, 0x1

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_7
    return-void
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
    .line 235
    .line 236
    .line 237
    .line 238
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
.end method

.method public getActivityInfo(Landroid/content/ComponentName;II)Landroid/content/pm/ActivityInfo;
    .locals 3

    .line 1
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mActivities:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    .line 30
    .line 31
    invoke-static {v2}, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;->access$300(Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;)Ljava/util/HashMap;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v1, p3}, Lcom/lody/virtual/server/pm/PackageSetting;->readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1}, Lcom/lody/virtual/server/pm/PackageSetting;->isRunInExtProcess()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {p1, p2, v2, p3, v1}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateActivityInfo(Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ActivityInfo;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lcom/lody/virtual/client/fixer/ComponentFixer;->fixComponentInfo(Landroid/content/pm/ComponentInfo;)V

    .line 56
    .line 57
    .line 58
    monitor-exit v0

    .line 59
    return-object p1

    .line 60
    :cond_0
    monitor-exit v0

    .line 61
    const/4 p1, 0x0

    .line 62
    return-object p1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    throw p1
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
.end method

.method public getAllPermissionGroups(I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/content/pm/PermissionGroupInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPermissionGroups:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPermissionGroups:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionGroupComponent;

    .line 36
    .line 37
    new-instance v3, Landroid/content/pm/PermissionGroupInfo;

    .line 38
    .line 39
    iget-object v2, v2, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionGroupComponent;->info:Landroid/content/pm/PermissionGroupInfo;

    .line 40
    .line 41
    invoke-direct {v3, v2}, Landroid/content/pm/PermissionGroupInfo;-><init>(Landroid/content/pm/PermissionGroupInfo;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    monitor-exit p1

    .line 49
    return-object v1

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw v0
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

.method public getApplicationInfo(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;
    .locals 3

    .line 1
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object v1, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 24
    .line 25
    invoke-virtual {v1, p3}, Lcom/lody/virtual/server/pm/PackageSetting;->readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1}, Lcom/lody/virtual/server/pm/PackageSetting;->isRunInExtProcess()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {p1, p2, v2, p3, v1}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateApplicationInfo(Lcom/lody/virtual/server/pm/parser/VPackage;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ApplicationInfo;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    monitor-exit v0

    .line 38
    return-object p1

    .line 39
    :cond_0
    monitor-exit v0

    .line 40
    const/4 p1, 0x0

    .line 41
    return-object p1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p1
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
.end method

.method public getComponentEnabledSetting(Landroid/content/ComponentName;I)I
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    invoke-static {p2}, Lcom/lody/virtual/server/pm/ComponentStateManager;->user(I)Lcom/lody/virtual/server/pm/ComponentStateManager$UserComponentState;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2, p1}, Lcom/lody/virtual/server/pm/ComponentStateManager$UserComponentState;->get(Landroid/content/ComponentName;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    monitor-exit v0

    .line 20
    return p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p1
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

.method public getDangerousPermissions(Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mDangerousPermissions:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mDangerousPermissions:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [Ljava/lang/String;

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1
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

.method public getInstalledApplications(II)Lcom/lody/virtual/remote/VParceledListSlice;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/lody/virtual/remote/VParceledListSlice<",
            "Landroid/content/pm/ApplicationInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 20
    .line 21
    monitor-enter v1

    .line 22
    :try_start_0
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 43
    .line 44
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 47
    .line 48
    invoke-virtual {v4, p2}, Lcom/lody/virtual/server/pm/PackageSetting;->readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v4}, Lcom/lody/virtual/server/pm/PackageSetting;->isRunInExtProcess()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    invoke-static {v3, p1, v5, p2, v4}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateApplicationInfo(Lcom/lody/virtual/server/pm/parser/VPackage;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ApplicationInfo;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    new-instance p1, Lcom/lody/virtual/remote/VParceledListSlice;

    .line 68
    .line 69
    invoke-direct {p1, v0}, Lcom/lody/virtual/remote/VParceledListSlice;-><init>(Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    throw p1
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
.end method

.method public getInstalledPackages(II)Lcom/lody/virtual/remote/VParceledListSlice;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/lody/virtual/remote/VParceledListSlice<",
            "Landroid/content/pm/PackageInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 19
    .line 20
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 39
    .line 40
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 43
    .line 44
    invoke-direct {p0, v3, v4, p1, p2}, Lcom/lody/virtual/server/pm/VPackageManagerService;->generatePackageInfo(Lcom/lody/virtual/server/pm/parser/VPackage;Lcom/lody/virtual/server/pm/PackageSetting;II)Landroid/content/pm/PackageInfo;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    new-instance p1, Lcom/lody/virtual/remote/VParceledListSlice;

    .line 56
    .line 57
    invoke-direct {p1, v0}, Lcom/lody/virtual/remote/VParceledListSlice;-><init>(Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw p1
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
.end method

.method public getNameForUid(I)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/lody/virtual/os/VUserHandle;->getAppId(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 29
    .line 30
    iget-object v2, v2, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 33
    .line 34
    iget v3, v2, Lcom/lody/virtual/server/pm/PackageSetting;->appId:I

    .line 35
    .line 36
    if-ne v3, p1, :cond_0

    .line 37
    .line 38
    iget-object p1, v2, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 39
    .line 40
    monitor-exit v0

    .line 41
    return-object p1

    .line 42
    :cond_1
    monitor-exit v0

    .line 43
    const/4 p1, 0x0

    .line 44
    return-object p1

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw p1
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

.method public getPackageInfo(Ljava/lang/String;II)Landroid/content/pm/PackageInfo;
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object v1, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 20
    .line 21
    invoke-direct {p0, p1, v1, p2, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->generatePackageInfo(Lcom/lody/virtual/server/pm/parser/VPackage;Lcom/lody/virtual/server/pm/PackageSetting;II)Landroid/content/pm/PackageInfo;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    monitor-exit v0

    .line 26
    return-object p1

    .line 27
    :cond_0
    monitor-exit v0

    .line 28
    const/4 p1, 0x0

    .line 29
    return-object p1

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw p1
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
.end method

.method public getPackageInstaller()Landroid/os/IBinder;
    .locals 1

    invoke-static {}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;->get()Lcom/lody/virtual/server/pm/installer/VPackageInstallerService;

    move-result-object v0

    return-object v0
.end method

.method public getPackageUid(Ljava/lang/String;I)I
    .locals 2

    .line 1
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 20
    .line 21
    iget p1, p1, Lcom/lody/virtual/server/pm/PackageSetting;->appId:I

    .line 22
    .line 23
    invoke-static {p2, p1}, Lcom/lody/virtual/os/VUserHandle;->getUid(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    monitor-exit v0

    .line 28
    return p1

    .line 29
    :cond_0
    monitor-exit v0

    .line 30
    const/4 p1, -0x1

    .line 31
    return p1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p1
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

.method public getPackagesForUid(I)[Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {p1}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 6
    .line 7
    .line 8
    monitor-enter p0

    .line 9
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 36
    .line 37
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 40
    .line 41
    iget v4, v4, Lcom/lody/virtual/server/pm/PackageSetting;->appId:I

    .line 42
    .line 43
    invoke-static {v0, v4}, Lcom/lody/virtual/os/VUserHandle;->getUid(II)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eq v4, p1, :cond_1

    .line 48
    .line 49
    sget v4, Lcom/lody/virtual/os/VEnvironment;->UNKNOWN_APP_UID:I

    .line 50
    .line 51
    if-ne p1, v4, :cond_0

    .line 52
    .line 53
    :cond_1
    iget-object v3, v3, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    monitor-exit p0

    .line 66
    const/4 p1, 0x0

    .line 67
    return-object p1

    .line 68
    :cond_3
    const/4 p1, 0x0

    .line 69
    new-array p1, p1, [Ljava/lang/String;

    .line 70
    .line 71
    invoke-interface {v1, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, [Ljava/lang/String;

    .line 76
    .line 77
    monitor-exit p0

    .line 78
    return-object p1

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    throw p1
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public getPermissionGroupInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionGroupInfo;
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter p2

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPermissionGroups:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionGroupComponent;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance v0, Landroid/content/pm/PermissionGroupInfo;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionGroupComponent;->info:Landroid/content/pm/PermissionGroupInfo;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Landroid/content/pm/PermissionGroupInfo;-><init>(Landroid/content/pm/PermissionGroupInfo;)V

    .line 19
    .line 20
    .line 21
    monitor-exit p2

    .line 22
    return-object v0

    .line 23
    :cond_0
    monitor-exit p2

    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p1
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

.method public getPermissionInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionInfo;
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter p2

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPermissions:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance v0, Landroid/content/pm/PermissionInfo;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;->info:Landroid/content/pm/PermissionInfo;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Landroid/content/pm/PermissionInfo;-><init>(Landroid/content/pm/PermissionInfo;)V

    .line 19
    .line 20
    .line 21
    monitor-exit p2

    .line 22
    return-object v0

    .line 23
    :cond_0
    monitor-exit p2

    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p1
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

.method public getProviderInfo(Landroid/content/ComponentName;II)Landroid/content/pm/ProviderInfo;
    .locals 3

    .line 1
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProvidersByComponent:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;

    .line 36
    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    iget-object v2, p1, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;->info:Landroid/content/pm/ProviderInfo;

    .line 40
    .line 41
    invoke-virtual {v1, v2, p2, p3}, Lcom/lody/virtual/server/pm/PackageSetting;->isEnabledAndMatchLPr(Landroid/content/pm/ComponentInfo;II)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1, p3}, Lcom/lody/virtual/server/pm/PackageSetting;->readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v1}, Lcom/lody/virtual/server/pm/PackageSetting;->isRunInExtProcess()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-static {p1, p2, v2, p3, v1}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateProviderInfo(Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ProviderInfo;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Lcom/lody/virtual/client/fixer/ComponentFixer;->fixComponentInfo(Landroid/content/pm/ComponentInfo;)V

    .line 60
    .line 61
    .line 62
    monitor-exit v0

    .line 63
    return-object p1

    .line 64
    :cond_0
    monitor-exit v0

    .line 65
    const/4 p1, 0x0

    .line 66
    return-object p1

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    throw p1
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
.end method

.method public getReceiverInfo(Landroid/content/ComponentName;II)Landroid/content/pm/ActivityInfo;
    .locals 3

    .line 1
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mReceivers:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    .line 30
    .line 31
    invoke-static {v2}, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;->access$300(Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;)Ljava/util/HashMap;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    iget-object v2, p1, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;->info:Landroid/content/pm/ActivityInfo;

    .line 44
    .line 45
    invoke-virtual {v1, v2, p2, p3}, Lcom/lody/virtual/server/pm/PackageSetting;->isEnabledAndMatchLPr(Landroid/content/pm/ComponentInfo;II)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    invoke-virtual {v1, p3}, Lcom/lody/virtual/server/pm/PackageSetting;->readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1}, Lcom/lody/virtual/server/pm/PackageSetting;->isRunInExtProcess()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-static {p1, p2, v2, p3, v1}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateActivityInfo(Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ActivityInfo;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Lcom/lody/virtual/client/fixer/ComponentFixer;->fixComponentInfo(Landroid/content/pm/ComponentInfo;)V

    .line 64
    .line 65
    .line 66
    monitor-exit v0

    .line 67
    return-object p1

    .line 68
    :cond_0
    monitor-exit v0

    .line 69
    const/4 p1, 0x0

    .line 70
    return-object p1

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    throw p1
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
.end method

.method public getReceiverInfos(Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Lcom/lody/virtual/remote/ReceiverInfo;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    monitor-exit v1

    .line 24
    return-object p1

    .line 25
    :cond_0
    iget-object v2, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 28
    .line 29
    iget-object p1, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->receivers:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_4

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 46
    .line 47
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;->info:Landroid/content/pm/ActivityInfo;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-virtual {v2, v4, v5, p3}, Lcom/lody/virtual/server/pm/PackageSetting;->isEnabledAndMatchLPr(Landroid/content/pm/ComponentInfo;II)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;->info:Landroid/content/pm/ActivityInfo;

    .line 58
    .line 59
    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    new-instance v4, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    iget-object v5, v3, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->intents:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_3

    .line 83
    .line 84
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    check-cast v6, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityIntentInfo;

    .line 89
    .line 90
    iget-object v6, v6, Lcom/lody/virtual/server/pm/parser/VPackage$IntentInfo;->filter:Landroid/content/IntentFilter;

    .line 91
    .line 92
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    new-instance v5, Lcom/lody/virtual/remote/ReceiverInfo;

    .line 97
    .line 98
    iget-object v3, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;->info:Landroid/content/pm/ActivityInfo;

    .line 99
    .line 100
    invoke-direct {v5, v3, v4}, Lcom/lody/virtual/remote/ReceiverInfo;-><init>(Landroid/content/pm/ActivityInfo;Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_4
    monitor-exit v1

    .line 108
    return-object v0

    .line 109
    :catchall_0
    move-exception p1

    .line 110
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    throw p1
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
    .line 235
    .line 236
    .line 237
    .line 238
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
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
.end method

.method public getServiceInfo(Landroid/content/ComponentName;II)Landroid/content/pm/ServiceInfo;
    .locals 3

    .line 1
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mServices:Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;

    .line 30
    .line 31
    invoke-static {v2}, Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;->access$400(Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;)Ljava/util/HashMap;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v1, p3}, Lcom/lody/virtual/server/pm/PackageSetting;->readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1}, Lcom/lody/virtual/server/pm/PackageSetting;->isRunInExtProcess()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {p1, p2, v2, p3, v1}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateServiceInfo(Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ServiceInfo;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lcom/lody/virtual/client/fixer/ComponentFixer;->fixComponentInfo(Landroid/content/pm/ComponentInfo;)V

    .line 56
    .line 57
    .line 58
    monitor-exit v0

    .line 59
    return-object p1

    .line 60
    :cond_0
    monitor-exit v0

    .line 61
    const/4 p1, 0x0

    .line 62
    return-object p1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    throw p1
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
.end method

.method public getSharedLibraries(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object p1

    .line 18
    :cond_0
    monitor-exit v0

    .line 19
    const/4 p1, 0x0

    .line 20
    return-object p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p1
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public queryContentProviders(Ljava/lang/String;II)Lcom/lody/virtual/remote/VParceledListSlice;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Lcom/lody/virtual/remote/VParceledListSlice<",
            "Landroid/content/pm/ProviderInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 19
    .line 20
    monitor-enter v2

    .line 21
    :try_start_0
    iget-object v3, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProvidersByAuthority:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;

    .line 42
    .line 43
    iget-object v5, v4, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->owner:Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 44
    .line 45
    iget-object v5, v5, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v5, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 48
    .line 49
    iget-object v6, v4, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;->info:Landroid/content/pm/ProviderInfo;

    .line 50
    .line 51
    invoke-virtual {v5, v6, p3, v0}, Lcom/lody/virtual/server/pm/PackageSetting;->isEnabledAndMatchLPr(Landroid/content/pm/ComponentInfo;II)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    if-eqz p1, :cond_2

    .line 59
    .line 60
    iget v6, v5, Lcom/lody/virtual/server/pm/PackageSetting;->appId:I

    .line 61
    .line 62
    invoke-static {p2}, Lcom/lody/virtual/os/VUserHandle;->getAppId(I)I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-ne v6, v7, :cond_0

    .line 67
    .line 68
    iget-object v6, v4, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;->info:Landroid/content/pm/ProviderInfo;

    .line 69
    .line 70
    iget-object v6, v6, Landroid/content/pm/ProviderInfo;->processName:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_0

    .line 77
    .line 78
    :cond_2
    invoke-virtual {v5, v0}, Lcom/lody/virtual/server/pm/PackageSetting;->readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v5}, Lcom/lody/virtual/server/pm/PackageSetting;->isRunInExtProcess()Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-static {v4, p3, v6, v0, v5}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateProviderInfo(Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ProviderInfo;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_4

    .line 100
    .line 101
    sget-object p1, Lcom/lody/virtual/server/pm/VPackageManagerService;->sProviderInitOrderSorter:Ljava/util/Comparator;

    .line 102
    .line 103
    invoke-static {v1, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    new-instance p1, Lcom/lody/virtual/remote/VParceledListSlice;

    .line 107
    .line 108
    invoke-direct {p1, v1}, Lcom/lody/virtual/remote/VParceledListSlice;-><init>(Ljava/util/List;)V

    .line 109
    .line 110
    .line 111
    return-object p1

    .line 112
    :catchall_0
    move-exception p1

    .line 113
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    throw p1
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
    .line 235
    .line 236
    .line 237
    .line 238
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
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
.end method

.method public queryIntentActivities(Landroid/content/Intent;Ljava/lang/String;II)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "II)",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    if-nez p3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Intent;->getSelector()Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Intent;->getSelector()Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    :cond_0
    move-object v1, p1

    .line 29
    if-eqz p3, :cond_2

    .line 30
    .line 31
    new-instance p1, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p3, v3, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->getActivityInfo(Landroid/content/ComponentName;II)Landroid/content/pm/ActivityInfo;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    new-instance p3, Landroid/content/pm/ResolveInfo;

    .line 44
    .line 45
    invoke-direct {p3}, Landroid/content/pm/ResolveInfo;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p2, p3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 49
    .line 50
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_1
    return-object p1

    .line 54
    :cond_2
    iget-object p1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 55
    .line 56
    monitor-enter p1

    .line 57
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    if-nez p3, :cond_3

    .line 62
    .line 63
    iget-object p3, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mActivities:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    .line 64
    .line 65
    invoke-virtual {p3, v1, p2, v3, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;->queryIntent(Landroid/content/Intent;Ljava/lang/String;II)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    monitor-exit p1

    .line 70
    return-object p2

    .line 71
    :cond_3
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 72
    .line 73
    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    check-cast p3, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 78
    .line 79
    if-eqz p3, :cond_4

    .line 80
    .line 81
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mActivities:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    .line 82
    .line 83
    iget-object v4, p3, Lcom/lody/virtual/server/pm/parser/VPackage;->activities:Ljava/util/ArrayList;

    .line 84
    .line 85
    move-object v2, p2

    .line 86
    move v5, p4

    .line 87
    invoke-virtual/range {v0 .. v5}, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;->queryIntentForPackage(Landroid/content/Intent;Ljava/lang/String;ILjava/util/ArrayList;I)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    monitor-exit p1

    .line 92
    return-object p2

    .line 93
    :cond_4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    monitor-exit p1

    .line 98
    return-object p2

    .line 99
    :catchall_0
    move-exception p2

    .line 100
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    throw p2
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

.method public queryIntentContentProviders(Landroid/content/Intent;Ljava/lang/String;II)Ljava/util/List;
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "II)",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    if-nez p3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Intent;->getSelector()Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Intent;->getSelector()Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    :cond_0
    move-object v1, p1

    .line 29
    if-eqz p3, :cond_2

    .line 30
    .line 31
    new-instance p1, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p3, v3, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->getProviderInfo(Landroid/content/ComponentName;II)Landroid/content/pm/ProviderInfo;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    new-instance p3, Landroid/content/pm/ResolveInfo;

    .line 44
    .line 45
    invoke-direct {p3}, Landroid/content/pm/ResolveInfo;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p2, p3, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    .line 49
    .line 50
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_1
    return-object p1

    .line 54
    :cond_2
    iget-object p1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 55
    .line 56
    monitor-enter p1

    .line 57
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    if-nez p3, :cond_3

    .line 62
    .line 63
    iget-object p3, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProviders:Lcom/lody/virtual/server/pm/ProviderIntentResolver;

    .line 64
    .line 65
    invoke-virtual {p3, v1, p2, v3, p4}, Lcom/lody/virtual/server/pm/ProviderIntentResolver;->queryIntent(Landroid/content/Intent;Ljava/lang/String;II)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    monitor-exit p1

    .line 70
    return-object p2

    .line 71
    :cond_3
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 72
    .line 73
    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    check-cast p3, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 78
    .line 79
    if-eqz p3, :cond_4

    .line 80
    .line 81
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProviders:Lcom/lody/virtual/server/pm/ProviderIntentResolver;

    .line 82
    .line 83
    iget-object v4, p3, Lcom/lody/virtual/server/pm/parser/VPackage;->providers:Ljava/util/ArrayList;

    .line 84
    .line 85
    move-object v2, p2

    .line 86
    move v5, p4

    .line 87
    invoke-virtual/range {v0 .. v5}, Lcom/lody/virtual/server/pm/ProviderIntentResolver;->queryIntentForPackage(Landroid/content/Intent;Ljava/lang/String;ILjava/util/ArrayList;I)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    monitor-exit p1

    .line 92
    return-object p2

    .line 93
    :cond_4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    monitor-exit p1

    .line 98
    return-object p2

    .line 99
    :catchall_0
    move-exception p2

    .line 100
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    throw p2
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

.method public queryIntentReceivers(Landroid/content/Intent;Ljava/lang/String;II)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "II)",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    if-nez p3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Intent;->getSelector()Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Intent;->getSelector()Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    :cond_0
    move-object v1, p1

    .line 29
    if-eqz p3, :cond_2

    .line 30
    .line 31
    new-instance p1, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p3, v3, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->getReceiverInfo(Landroid/content/ComponentName;II)Landroid/content/pm/ActivityInfo;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    new-instance p3, Landroid/content/pm/ResolveInfo;

    .line 44
    .line 45
    invoke-direct {p3}, Landroid/content/pm/ResolveInfo;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p2, p3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 49
    .line 50
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_1
    return-object p1

    .line 54
    :cond_2
    iget-object p1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 55
    .line 56
    monitor-enter p1

    .line 57
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    if-nez p3, :cond_3

    .line 62
    .line 63
    iget-object p3, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mReceivers:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    .line 64
    .line 65
    invoke-virtual {p3, v1, p2, v3, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;->queryIntent(Landroid/content/Intent;Ljava/lang/String;II)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    monitor-exit p1

    .line 70
    return-object p2

    .line 71
    :cond_3
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 72
    .line 73
    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    check-cast p3, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 78
    .line 79
    if-eqz p3, :cond_4

    .line 80
    .line 81
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mReceivers:Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;

    .line 82
    .line 83
    iget-object v4, p3, Lcom/lody/virtual/server/pm/parser/VPackage;->receivers:Ljava/util/ArrayList;

    .line 84
    .line 85
    move-object v2, p2

    .line 86
    move v5, p4

    .line 87
    invoke-virtual/range {v0 .. v5}, Lcom/lody/virtual/server/pm/VPackageManagerService$ActivityIntentResolver;->queryIntentForPackage(Landroid/content/Intent;Ljava/lang/String;ILjava/util/ArrayList;I)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    monitor-exit p1

    .line 92
    return-object p2

    .line 93
    :cond_4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    monitor-exit p1

    .line 98
    return-object p2

    .line 99
    :catchall_0
    move-exception p2

    .line 100
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    throw p2
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

.method public queryIntentServices(Landroid/content/Intent;Ljava/lang/String;II)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "II)",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    if-nez p3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Intent;->getSelector()Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Intent;->getSelector()Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    :cond_0
    move-object v1, p1

    .line 29
    if-eqz p3, :cond_2

    .line 30
    .line 31
    new-instance p1, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p3, v3, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->getServiceInfo(Landroid/content/ComponentName;II)Landroid/content/pm/ServiceInfo;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    new-instance p3, Landroid/content/pm/ResolveInfo;

    .line 44
    .line 45
    invoke-direct {p3}, Landroid/content/pm/ResolveInfo;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p2, p3, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 49
    .line 50
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_1
    return-object p1

    .line 54
    :cond_2
    iget-object p1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 55
    .line 56
    monitor-enter p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    :try_start_1
    invoke-virtual {v1}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    if-nez p3, :cond_3

    .line 62
    .line 63
    iget-object p3, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mServices:Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;

    .line 64
    .line 65
    invoke-virtual {p3, v1, p2, v3, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;->queryIntent(Landroid/content/Intent;Ljava/lang/String;II)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    monitor-exit p1

    .line 70
    return-object p2

    .line 71
    :cond_3
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 72
    .line 73
    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    check-cast p3, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 78
    .line 79
    if-eqz p3, :cond_4

    .line 80
    .line 81
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mServices:Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;

    .line 82
    .line 83
    iget-object v4, p3, Lcom/lody/virtual/server/pm/parser/VPackage;->services:Ljava/util/ArrayList;

    .line 84
    .line 85
    move-object v2, p2

    .line 86
    move v5, p4

    .line 87
    invoke-virtual/range {v0 .. v5}, Lcom/lody/virtual/server/pm/VPackageManagerService$ServiceIntentResolver;->queryIntentForPackage(Landroid/content/Intent;Ljava/lang/String;ILjava/util/ArrayList;I)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    monitor-exit p1

    .line 92
    return-object p2

    .line 93
    :cond_4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    monitor-exit p1

    .line 98
    return-object p2

    .line 99
    :catchall_0
    move-exception p2

    .line 100
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    :try_start_2
    throw p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 102
    :catch_0
    move-exception p1

    .line 103
    const-string p2, "VA"

    .line 104
    .line 105
    invoke-static {p2, p1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    return-object p1
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

.method public queryPermissionsByGroup(Ljava/lang/String;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Landroid/content/pm/PermissionInfo;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPermissions:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;

    .line 32
    .line 33
    iget-object v3, v2, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;->info:Landroid/content/pm/PermissionInfo;

    .line 34
    .line 35
    iget-object v3, v3, Landroid/content/pm/PermissionInfo;->group:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    iget-object v2, v2, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;->info:Landroid/content/pm/PermissionInfo;

    .line 44
    .line 45
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    monitor-exit v0

    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    throw p1

    .line 54
    :cond_2
    :goto_1
    return-object p2
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
.end method

.method public querySharedPackages(Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 11
    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    iget-object v1, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->mSharedUserId:Ljava/lang/String;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 45
    .line 46
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage;->mSharedUserId:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v5, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->mSharedUserId:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v4, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    iget-object v3, v3, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    monitor-exit v0

    .line 63
    return-object v1

    .line 64
    :cond_3
    :goto_1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 65
    .line 66
    monitor-exit v0

    .line 67
    return-object p1

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    throw p1
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

.method public resolveContentProvider(Ljava/lang/String;II)Landroid/content/pm/ProviderInfo;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget-object v1, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProvidersByAuthority:Ljava/util/HashMap;

    .line 10
    .line 11
    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :try_start_1
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mProvidersByAuthority:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;

    .line 19
    .line 20
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    :try_start_2
    iget-object v1, p1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->owner:Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 28
    .line 29
    invoke-virtual {v1, p3}, Lcom/lody/virtual/server/pm/PackageSetting;->readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1}, Lcom/lody/virtual/server/pm/PackageSetting;->isRunInExtProcess()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-static {p1, p2, v2, p3, v3}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateProviderInfo(Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ProviderInfo;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1, p1, p2, p3}, Lcom/lody/virtual/server/pm/PackageSetting;->isEnabledAndMatchLPr(Landroid/content/pm/ComponentInfo;II)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-nez p2, :cond_0

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_0
    invoke-static {p1}, Lcom/lody/virtual/client/fixer/ComponentFixer;->fixComponentInfo(Landroid/content/pm/ComponentInfo;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 56
    :try_start_4
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 57
    :catch_0
    move-exception p1

    .line 58
    const-string p2, "PackageManager"

    .line 59
    .line 60
    invoke-static {p2, p1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-object v0
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
.end method

.method public resolveIntent(Landroid/content/Intent;Ljava/lang/String;II)Landroid/content/pm/ResolveInfo;
    .locals 0

    .line 1
    invoke-direct {p0, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->queryIntentActivities(Landroid/content/Intent;Ljava/lang/String;II)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p4

    .line 12
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->chooseBestActivity(Landroid/content/Intent;Ljava/lang/String;ILjava/util/List;)Landroid/content/pm/ResolveInfo;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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

.method public resolveService(Landroid/content/Intent;Ljava/lang/String;II)Landroid/content/pm/ResolveInfo;
    .locals 0

    .line 1
    invoke-direct {p0, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/pm/VPackageManagerService;->updateFlagsNought(I)I

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->queryIntentServices(Landroid/content/Intent;Ljava/lang/String;II)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const/4 p3, 0x1

    .line 19
    if-lt p2, p3, :cond_0

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroid/content/pm/ResolveInfo;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return-object p1
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

.method public setComponentEnabledSetting(Landroid/content/ComponentName;III)V
    .locals 3

    .line 1
    const-string v0, "PackageManager"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "setComponentEnabledSetting "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, " newState: "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, " flags: "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    invoke-static {v0, p3}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    invoke-direct {p0, p4}, Lcom/lody/virtual/server/pm/VPackageManagerService;->checkUserId(I)V

    .line 43
    .line 44
    .line 45
    iget-object p3, p0, Lcom/lody/virtual/server/pm/VPackageManagerService;->mPackages:Ljava/util/Map;

    .line 46
    .line 47
    monitor-enter p3

    .line 48
    :try_start_0
    invoke-static {p4}, Lcom/lody/virtual/server/pm/ComponentStateManager;->user(I)Lcom/lody/virtual/server/pm/ComponentStateManager$UserComponentState;

    .line 49
    .line 50
    .line 51
    move-result-object p4

    .line 52
    invoke-virtual {p4, p1, p2}, Lcom/lody/virtual/server/pm/ComponentStateManager$UserComponentState;->set(Landroid/content/ComponentName;I)V

    .line 53
    .line 54
    .line 55
    monitor-exit p3

    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p1
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
