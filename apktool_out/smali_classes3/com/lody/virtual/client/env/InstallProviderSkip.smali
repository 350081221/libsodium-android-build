.class public Lcom/lody/virtual/client/env/InstallProviderSkip;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static sSkipInstallProviderSet:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/lody/virtual/client/env/InstallProviderSkip;->sSkipInstallProviderSet:Ljava/util/HashSet;

    .line 7
    .line 8
    const-string v1, "com.netease.party"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/lody/virtual/client/env/InstallProviderSkip;->sSkipInstallProviderSet:Ljava/util/HashSet;

    .line 14
    .line 15
    const-string v1, "com.netease.race"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    sget-object v0, Lcom/lody/virtual/client/env/InstallProviderSkip;->sSkipInstallProviderSet:Ljava/util/HashSet;

    .line 21
    .line 22
    const-string v1, "com.netease.tom233"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    sget-object v0, Lcom/lody/virtual/client/env/InstallProviderSkip;->sSkipInstallProviderSet:Ljava/util/HashSet;

    .line 28
    .line 29
    const-string v1, "com.netease.pes"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    sget-object v0, Lcom/lody/virtual/client/env/InstallProviderSkip;->sSkipInstallProviderSet:Ljava/util/HashSet;

    .line 35
    .line 36
    const-string v1, "com.netease.vlfcn.jh"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    sget-object v0, Lcom/lody/virtual/client/env/InstallProviderSkip;->sSkipInstallProviderSet:Ljava/util/HashSet;

    .line 42
    .line 43
    const-string v1, "com.netease.sky"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    sget-object v0, Lcom/lody/virtual/client/env/InstallProviderSkip;->sSkipInstallProviderSet:Ljava/util/HashSet;

    .line 49
    .line 50
    const-string v1, "com.netease.dwrg"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isSkip(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/env/InstallProviderSkip;->sSkipInstallProviderSet:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
