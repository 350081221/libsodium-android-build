.class public Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/core/SettingConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FakeWifiStatus"
.end annotation


# static fields
.field public static DEFAULT_BSSID:Ljava/lang/String; = "66:55:44:33:22:11"

.field public static DEFAULT_MAC:Ljava/lang/String; = "11:22:33:44:55:66"

.field public static DEFAULT_SSID:Ljava/lang/String; = "VA_SSID"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBSSID()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;->DEFAULT_BSSID:Ljava/lang/String;

    return-object v0
.end method

.method public getMAC()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;->DEFAULT_MAC:Ljava/lang/String;

    return-object v0
.end method

.method public getSSID()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;->DEFAULT_SSID:Ljava/lang/String;

    return-object v0
.end method
