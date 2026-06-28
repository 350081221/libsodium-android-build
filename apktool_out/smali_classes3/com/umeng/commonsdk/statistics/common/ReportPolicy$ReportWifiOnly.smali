.class public Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportWifiOnly;
.super Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportStrategy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/statistics/common/ReportPolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReportWifiOnly"
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportStrategy;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportWifiOnly;->mContext:Landroid/content/Context;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
.end method


# virtual methods
.method public shouldSendMessage(Z)Z
    .locals 0

    iget-object p1, p0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportWifiOnly;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->isWiFiAvailable(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method
