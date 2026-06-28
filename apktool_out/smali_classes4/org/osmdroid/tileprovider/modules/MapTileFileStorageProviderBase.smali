.class public abstract Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase;
.super Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase$MyBroadcastReceiver;
    }
.end annotation


# instance fields
.field private mBroadcastReceiver:Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase$MyBroadcastReceiver;

.field private final mRegisterReceiver:Lorg/osmdroid/tileprovider/IRegisterReceiver;


# direct methods
.method public constructor <init>(Lorg/osmdroid/tileprovider/IRegisterReceiver;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;-><init>(II)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase;->mRegisterReceiver:Lorg/osmdroid/tileprovider/IRegisterReceiver;

    .line 5
    .line 6
    new-instance p2, Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase$MyBroadcastReceiver;

    .line 7
    .line 8
    const/4 p3, 0x0

    .line 9
    invoke-direct {p2, p0, p3}, Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase$MyBroadcastReceiver;-><init>(Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase;Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase$1;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase;->mBroadcastReceiver:Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase$MyBroadcastReceiver;

    .line 13
    .line 14
    new-instance p2, Landroid/content/IntentFilter;

    .line 15
    .line 16
    invoke-direct {p2}, Landroid/content/IntentFilter;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string p3, "android.intent.action.MEDIA_MOUNTED"

    .line 20
    .line 21
    invoke-virtual {p2, p3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string p3, "android.intent.action.MEDIA_UNMOUNTED"

    .line 25
    .line 26
    invoke-virtual {p2, p3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string p3, "file"

    .line 30
    .line 31
    invoke-virtual {p2, p3}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object p3, p0, Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase;->mBroadcastReceiver:Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase$MyBroadcastReceiver;

    .line 35
    .line 36
    invoke-interface {p1, p3, p2}, Lorg/osmdroid/tileprovider/IRegisterReceiver;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    return-void
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
.end method


# virtual methods
.method public detach()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase;->mBroadcastReceiver:Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase$MyBroadcastReceiver;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase;->mRegisterReceiver:Lorg/osmdroid/tileprovider/IRegisterReceiver;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Lorg/osmdroid/tileprovider/IRegisterReceiver;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase;->mBroadcastReceiver:Lorg/osmdroid/tileprovider/modules/MapTileFileStorageProviderBase$MyBroadcastReceiver;

    .line 12
    .line 13
    :cond_0
    invoke-super {p0}, Lorg/osmdroid/tileprovider/modules/MapTileModuleProviderBase;->detach()V

    .line 14
    .line 15
    .line 16
    return-void
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
.end method

.method protected onMediaMounted()V
    .locals 0

    return-void
.end method

.method protected onMediaUnmounted()V
    .locals 0

    return-void
.end method
