.class public Lcom/lody/virtual/helper/InstalledInfoCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/helper/InstalledInfoCache$CacheItem;
    }
.end annotation


# static fields
.field private static diskCache:Lcom/lody/virtual/helper/utils/ACache;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "AppInfoCache"

    invoke-static {v0, v1}, Lcom/lody/virtual/helper/utils/ACache;->get(Landroid/content/Context;Ljava/lang/String;)Lcom/lody/virtual/helper/utils/ACache;

    move-result-object v0

    sput-object v0, Lcom/lody/virtual/helper/InstalledInfoCache;->diskCache:Lcom/lody/virtual/helper/utils/ACache;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Lcom/lody/virtual/helper/utils/ACache;
    .locals 1

    sget-object v0, Lcom/lody/virtual/helper/InstalledInfoCache;->diskCache:Lcom/lody/virtual/helper/utils/ACache;

    return-object v0
.end method

.method public static get(Ljava/lang/String;)Lcom/lody/virtual/helper/InstalledInfoCache$CacheItem;
    .locals 3

    sget-object v0, Lcom/lody/virtual/helper/InstalledInfoCache;->diskCache:Lcom/lody/virtual/helper/utils/ACache;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "va_installed_info_cache@"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/lody/virtual/helper/utils/ACache;->getAsObject(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/lody/virtual/helper/InstalledInfoCache$CacheItem;

    return-object p0
.end method

.method public static save(Lcom/lody/virtual/helper/InstalledInfoCache$CacheItem;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/lody/virtual/helper/InstalledInfoCache;->diskCache:Lcom/lody/virtual/helper/utils/ACache;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "va_installed_info_cache@"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/lody/virtual/helper/InstalledInfoCache$CacheItem;->packageName:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1, p0}, Lcom/lody/virtual/helper/utils/ACache;->put(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/lody/virtual/helper/InstalledInfoCache$CacheItem;->saveIcon()V

    .line 26
    .line 27
    .line 28
    return-void
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
