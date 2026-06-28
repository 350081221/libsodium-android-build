.class public Lcom/lody/virtual/client/hook/providers/ExternalProviderHook;
.super Lcom/lody/virtual/client/hook/providers/ProviderHook;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/os/IInterface;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/providers/ProviderHook;-><init>(Landroid/os/IInterface;)V

    return-void
.end method


# virtual methods
.method protected varargs processArgs(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    if-eqz p2, :cond_3

    .line 2
    .line 3
    array-length p1, p2

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    aget-object v0, p2, p1

    .line 9
    .line 10
    instance-of v1, v0, Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1, v0}, Lcom/lody/virtual/client/core/VirtualCore;->isAppInstalled(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPkg()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    aput-object v0, p2, p1

    .line 35
    .line 36
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    sget-object p1, Lmirror/android/content/AttributionSource;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-static {p2, p1}, Lcom/lody/virtual/client/hook/utils/MethodParameterUtils;->getIndex([Ljava/lang/Object;Ljava/lang/Class;)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-gez p1, :cond_2

    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    aget-object p1, p2, p1

    .line 52
    .line 53
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2}, Lcom/lody/virtual/client/core/VirtualCore;->myUid()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-static {p1, p2}, Lcom/lody/virtual/client/fixer/ContextFixer;->fixAttributionSource(Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catch_0
    move-exception p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 67
    .line 68
    .line 69
    :cond_3
    :goto_0
    return-void
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
