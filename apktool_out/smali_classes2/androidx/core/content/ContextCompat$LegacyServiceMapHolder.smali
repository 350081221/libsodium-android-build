.class final Landroidx/core/content/ContextCompat$LegacyServiceMapHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/content/ContextCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "LegacyServiceMapHolder"
.end annotation


# static fields
.field static final SERVICES:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/core/content/ContextCompat$LegacyServiceMapHolder;->SERVICES:Ljava/util/HashMap;

    .line 7
    .line 8
    const-class v1, Landroid/telephony/SubscriptionManager;

    .line 9
    .line 10
    const-string v2, "telephony_subscription_service"

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const-class v1, Landroid/app/usage/UsageStatsManager;

    .line 16
    .line 17
    const-string/jumbo v2, "usagestats"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    const-class v1, Landroid/appwidget/AppWidgetManager;

    .line 24
    .line 25
    const-string v2, "appwidget"

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const-class v1, Landroid/os/BatteryManager;

    .line 31
    .line 32
    const-string v2, "batterymanager"

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    const-class v1, Landroid/hardware/camera2/CameraManager;

    .line 38
    .line 39
    const-string v2, "camera"

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    const-class v1, Landroid/app/job/JobScheduler;

    .line 45
    .line 46
    const-string v2, "jobscheduler"

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    const-class v1, Landroid/content/pm/LauncherApps;

    .line 52
    .line 53
    const-string v2, "launcherapps"

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    const-class v1, Landroid/media/projection/MediaProjectionManager;

    .line 59
    .line 60
    const-string v2, "media_projection"

    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    const-class v1, Landroid/media/session/MediaSessionManager;

    .line 66
    .line 67
    const-string v2, "media_session"

    .line 68
    .line 69
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    const-class v1, Landroid/content/RestrictionsManager;

    .line 73
    .line 74
    const-string v2, "restrictions"

    .line 75
    .line 76
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    const-class v1, Landroid/telecom/TelecomManager;

    .line 80
    .line 81
    const-string v2, "telecom"

    .line 82
    .line 83
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    const-class v1, Landroid/media/tv/TvInputManager;

    .line 87
    .line 88
    const-string/jumbo v2, "tv_input"

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    const-class v1, Landroid/app/AppOpsManager;

    .line 95
    .line 96
    const-string v2, "appops"

    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    const-class v1, Landroid/view/accessibility/CaptioningManager;

    .line 102
    .line 103
    const-string v2, "captioning"

    .line 104
    .line 105
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    const-class v1, Landroid/hardware/ConsumerIrManager;

    .line 109
    .line 110
    const-string v2, "consumer_ir"

    .line 111
    .line 112
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    const-class v1, Landroid/print/PrintManager;

    .line 116
    .line 117
    const-string v2, "print"

    .line 118
    .line 119
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    const-class v1, Landroid/bluetooth/BluetoothManager;

    .line 123
    .line 124
    const-string v2, "bluetooth"

    .line 125
    .line 126
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    const-class v1, Landroid/hardware/display/DisplayManager;

    .line 130
    .line 131
    const-string v2, "display"

    .line 132
    .line 133
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    const-class v1, Landroid/os/UserManager;

    .line 137
    .line 138
    const-string/jumbo v2, "user"

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    const-class v1, Landroid/hardware/input/InputManager;

    .line 145
    .line 146
    const-string v2, "input"

    .line 147
    .line 148
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    const-class v1, Landroid/media/MediaRouter;

    .line 152
    .line 153
    const-string v2, "media_router"

    .line 154
    .line 155
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    const-class v1, Landroid/net/nsd/NsdManager;

    .line 159
    .line 160
    const-string v2, "servicediscovery"

    .line 161
    .line 162
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    const-class v1, Landroid/view/accessibility/AccessibilityManager;

    .line 166
    .line 167
    const-string v2, "accessibility"

    .line 168
    .line 169
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    const-class v1, Landroid/accounts/AccountManager;

    .line 173
    .line 174
    const-string v2, "account"

    .line 175
    .line 176
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    const-class v1, Landroid/app/ActivityManager;

    .line 180
    .line 181
    const-string v2, "activity"

    .line 182
    .line 183
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    const-class v1, Landroid/app/AlarmManager;

    .line 187
    .line 188
    const-string v2, "alarm"

    .line 189
    .line 190
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    const-class v1, Landroid/media/AudioManager;

    .line 194
    .line 195
    const-string v2, "audio"

    .line 196
    .line 197
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    const-class v1, Landroid/content/ClipboardManager;

    .line 201
    .line 202
    const-string v2, "clipboard"

    .line 203
    .line 204
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    const-class v1, Landroid/net/ConnectivityManager;

    .line 208
    .line 209
    const-string v2, "connectivity"

    .line 210
    .line 211
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    const-class v1, Landroid/app/admin/DevicePolicyManager;

    .line 215
    .line 216
    const-string v2, "device_policy"

    .line 217
    .line 218
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    const-class v1, Landroid/app/DownloadManager;

    .line 222
    .line 223
    const-string v2, "download"

    .line 224
    .line 225
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    const-class v1, Landroid/os/DropBoxManager;

    .line 229
    .line 230
    const-string v2, "dropbox"

    .line 231
    .line 232
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    const-class v1, Landroid/view/inputmethod/InputMethodManager;

    .line 236
    .line 237
    const-string v2, "input_method"

    .line 238
    .line 239
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    const-class v1, Landroid/app/KeyguardManager;

    .line 243
    .line 244
    const-string v2, "keyguard"

    .line 245
    .line 246
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    const-class v1, Landroid/view/LayoutInflater;

    .line 250
    .line 251
    const-string v2, "layout_inflater"

    .line 252
    .line 253
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    const-class v1, Landroid/location/LocationManager;

    .line 257
    .line 258
    const-string v2, "location"

    .line 259
    .line 260
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    const-class v1, Landroid/nfc/NfcManager;

    .line 264
    .line 265
    const-string v2, "nfc"

    .line 266
    .line 267
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    const-class v1, Landroid/app/NotificationManager;

    .line 271
    .line 272
    const-string v2, "notification"

    .line 273
    .line 274
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    const-class v1, Landroid/os/PowerManager;

    .line 278
    .line 279
    const-string v2, "power"

    .line 280
    .line 281
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    const-class v1, Landroid/app/SearchManager;

    .line 285
    .line 286
    const-string v2, "search"

    .line 287
    .line 288
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    const-class v1, Landroid/hardware/SensorManager;

    .line 292
    .line 293
    const-string v2, "sensor"

    .line 294
    .line 295
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    const-class v1, Landroid/os/storage/StorageManager;

    .line 299
    .line 300
    const-string v2, "storage"

    .line 301
    .line 302
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    const-class v1, Landroid/telephony/TelephonyManager;

    .line 306
    .line 307
    const-string v2, "phone"

    .line 308
    .line 309
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    const-class v1, Landroid/view/textservice/TextServicesManager;

    .line 313
    .line 314
    const-string/jumbo v2, "textservices"

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    const-class v1, Landroid/app/UiModeManager;

    .line 321
    .line 322
    const-string/jumbo v2, "uimode"

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    const-class v1, Landroid/hardware/usb/UsbManager;

    .line 329
    .line 330
    const-string/jumbo v2, "usb"

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    const-class v1, Landroid/os/Vibrator;

    .line 337
    .line 338
    const-string/jumbo v2, "vibrator"

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    const-class v1, Landroid/app/WallpaperManager;

    .line 345
    .line 346
    const-string/jumbo v2, "wallpaper"

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    const-class v1, Landroid/net/wifi/p2p/WifiP2pManager;

    .line 353
    .line 354
    const-string/jumbo v2, "wifip2p"

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    const-class v1, Landroid/net/wifi/WifiManager;

    .line 361
    .line 362
    const-string/jumbo v2, "wifi"

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    const-class v1, Landroid/view/WindowManager;

    .line 369
    .line 370
    const-string/jumbo v2, "window"

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    return-void
    .line 377
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
